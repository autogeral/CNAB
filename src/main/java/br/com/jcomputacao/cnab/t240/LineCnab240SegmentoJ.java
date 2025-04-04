package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 23/10/2012 00:49:44
 * @author Murilo
 */
public class LineCnab240SegmentoJ extends LineArchetype {
    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCOS_COMPENSACAO";
    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";
    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";
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
     * CONTEUDO 'H'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    
    public static final String TIPO_MOVIMENTO = "TIPO_MOVIMENTO";
    public static final String CODIGO_MOVIMENTO = "CODIGO_MOVIMENTO";
    public static final String CODIGO_BARRAS = "CODIGO_BARRAS";
    public static final String NOME_CEDENTE = "NOME_CEDENTE";
    public static final String DATA_VENCIMENTO = "DATA_VENCIMENTO";
    public static final String VALOR_TITULO = "VALOR_TITULO";
    public static final String DESCONTO = "DESCONTO";
    public static final String ACRESCIMOS = "ACRESCIMOS";
    public static final String DATA_PAGAMENTO = "DATA_PAGAMENTO";
    public static final String VALOR_PAGAMENTO = "VALOR_PAGAMENTO";
    public static final String QUANTIDADE_MOEDA = "QUANTIDADE_MOEDA";
    //Numero atribuido pela empresa
    public static final String REFERENCIA_SACADO = "REFERENCIA_SACADO";
    //Numero de doct atribuido pelo banco
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";
    public static final String CNAB = "CNAB";
    public static final String OCORRENCIAS = "OCORRENCIAS";
    
    public LineCnab240SegmentoJ() {
        setName("CNAB - Segmento J");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("J"));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_BARRAS, new FieldStringFixedLengthArchetype(44));
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(DATA_VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_TITULO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(DESCONTO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(ACRESCIMOS, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(DATA_PAGAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PAGAMENTO, new FieldDecimalFixedLengthArchetype(15,2));
        FieldArchetype fa = new FieldDecimalFixedLengthArchetype(15,5);
        fa.setNullableRepresentation("0");
        addFieldArchetype(QUANTIDADE_MOEDA, fa);
        addFieldArchetype(REFERENCIA_SACADO, new FieldStringFixedLengthArchetype(20));
        fa = new FieldStringFixedLengthArchetype(20);
        fa.setNullableRepresentation("                    ");
        addFieldArchetype(NOSSO_NUMERO, fa);
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CNAB, new FieldFillerArchetype(6, ' '));
        fa = new FieldStringFixedLengthArchetype(10);
        fa.setAcceptNullable(true);
        addFieldArchetype(OCORRENCIAS, fa);
    }

}
