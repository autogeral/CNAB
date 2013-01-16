package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2012 10:48:16
 * @author Murilo
 */
public class LineCnab240SegmentoO extends LineArchetype {
    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";

    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";

    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE
     * TIPO DE OPERACAO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";

    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO 'O'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";

    /**
     * 0 = Indica INCLUSAO
     * 3 = Indica ESTORNO (somente para retorno) 
     * 5 = Indica ALTERACAO
     * 8 = Indica INCLUSAO COMPROR
     * 9 = Indica EXCLUSAO
     * POSICAO 15
     */
    public static final String TIPO_MOVIMENTO = "TIPO_MOVIMENTO";
    
    /**
     * 00 = Inclusao de Registro Detalhe Liberado
     * 09 = Inclusao do Registro Detalhe Bloqueado
     * 10 = Alteracao do Pagamento Liberado para Bloqueado (Bloqueio)
     * 11 = Alteracao do Pagamento Bloqueado para Liberado (Desbloqueio)
     * 14 = Autorizacao do Pagamento33 = Estorno por Devolucao da Camara Centralizadora (somente Tipo de Movimento = 3)
     * POSICAO 16 - 17
     */
    public static final String CODIGO_INSTRUCAO = "CODIGO_INSTRUCAO";
    
    /**
     * POSICAO 18 - 61
     */
    public static final String CODIGO_BARRAS = "CODIGO_BARRAS";
    
    /**
     * POSICAO 62 - 91
     */
    public static final String NOME_CONCESSIONA_ORGAO_PUBLICO = "NOME_CONCESSIONA_ORGAO_PUBLICO";
    
    /**
     * POSICAO 92 - 99
     */
    public static final String DATA_VENCIMENTO = "DATA_VENCIMENTO";
    
    /**
     * POSICAO 100 - 107
     */
    public static final String DATA_PAGAMENTO = "DATA_PAGAMENTO";
    
    /**
     * POSICAO 108 - 122
     */
    public static final String VALOR_PAGAMENTO = "VALOR_PAGAMENTO";
    
    /**
     * POSICAO 123 - 142
     */
    public static final String NUMERO_DOCUMENTO_CLINETE = "NUMERO_DOCUMENTO_CLINETE";
    
    /**
     * POSICAO 143 - 162
     */
    public static final String NUMERO_DOCUMENTO_BANCO = "NUMERO_DOCUMENTO_BANCO";
    
    /**
     * POSICAO 163 - 230 
     */
    public static final String FILLER = "FILLER";
    
    /**
     * POSICAO 231 - 240
     */
    public static final String OCORRENCIAS_RETORNO = "OCORRENCIAS_RETORNO";
    
    public LineCnab240SegmentoO() {
        setName("CNAB 240v084 - Segmento O");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("O"));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_INSTRUCAO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_BARRAS, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(NOME_CONCESSIONA_ORGAO_PUBLICO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(DATA_VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DATA_PAGAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PAGAMENTO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(NUMERO_DOCUMENTO_CLINETE, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUMERO_DOCUMENTO_BANCO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(FILLER, new FieldFillerArchetype(1, ' '));
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(10);
        fa.setNullableRepresentation("");
        addFieldArchetype(OCORRENCIAS_RETORNO, fa);
        
    }

}
