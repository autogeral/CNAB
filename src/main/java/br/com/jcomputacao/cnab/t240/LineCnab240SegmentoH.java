package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240SegmentoH extends LineArchetype {

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
    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 015 015
     * CONTEUDO ' '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * CODIGO DE MOVIMENTO DE RETORNO
     * Códigos de movimento de retorno, informados pelo Banco do Brasil:
     * /01/ - Entrada de Titulos
     * /02/ - Pedido de Baixa
     * /04/ - Concessao de Abatimento
     * /05/ - Cancelamento de Abatimento
     * /06/ - Alteracao no Vencimento
     * /07/ - Concessao de Desconto
     * /08/ - Cancelamento de Desconto
     * /09/ - Protestar
     * /10/ - Sustar Protesto e Baixar Titulo
     * /11/ - Sustar Protesto e Manter em Carteira
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
   /**
     * INSCRICAO DO SACADOR
     * 1 - CPF
     * 2 - CNPJ
     * POSICAO 062 062
     */
    public static final String INSCRICAO_SACADOR = "INSCRICAO_SACADOR";
    /**
     * NUMERO DE INSCRICAO DO SACADOR
     * POSICAO 063 077
     */
    public static final String NUMERO_INSCRICAO_SACADOR = "NUMERO_INSCRICAO_SACADOR";
    /**
     * NOME DO SACADOR
     * POSICAO 078 107
     */
    public static final String NOME_SACADOR = "NOME_SACADOR";
    
    /**
     * CODIGO DE DESCONTO 1
     * POSICAO 038 057
     */
    public static final String CODIGO_DESCONTO_1 = "CODIGO_DESCONTO_1";
    /**
     * DATA DO DESCONTO 1
     * POSICAO 058 058
     */
    public static final String DATA_DESCONTO_1 = "DATA_DESCONTO_1";
    /**
     * VALOR/PERCENTUAL DO DESCONTO 1
     * POSICAO 059 073
     */
    public static final String VALOR_PERC_DESCONTO_1 = "VALOR_PERC_DESCONTO_1";
    /**
     * CODIGO DE DESCONTO 2
     * POSICAO 038 057
     */
    public static final String CODIGO_DESCONTO_2 = "CODIGO_DESCONTO_2";
    /**
     * DATA DO DESCONTO 2
     * POSICAO 058 058
     */
    public static final String DATA_DESCONTO_2 = "DATA_DESCONTO_2";
    /**
     * VALOR/PERCENTUAL DO DESCONTO 2
     * POSICAO 059 073
     */
    public static final String VALOR_PERC_DESCONTO_2 = "VALOR_PERC_DESCONTO_2";
    /**
     * CODIGO DA MULTA
     * /1/ - Valor Fixo
     * /2/ - Percentual
     * POSICAO 074 081
     */
    public static final String CODIGO_MULTA = "CODIGO_MULTA";
    /**
     * DATA DA MULTA
     * POSICAO 149 188
     */
    public static final String DATA_MULTA = "DATA_MULTA";
    /**
     * VALOR PERCENTUAL DA MULTA
     * POSICAO 189 198
     */
    public static final String VALOR_PERC_MULTA = "VALOR_PERC_MULTA";
    /**
     * VALOR DE JUROS POR DIA ATRASO
     * POSICAO 189 198
     */
    public static final String VALOR_JUROS_DIAS_ATRASO = "VALOR_JUROS_DIAS_ATRASO";

    /**
     * MENSAGEM 1
     * POSICAO 224 240
     */
    public static final String MENSAGEM_1 = "MENSAGEM_1";
    /**
     * MENSAGEM 2
     * POSICAO 224 240
     */
    public static final String MENSAGEM_2 = "MENSAGEM_2";

    public LineCnab240SegmentoH() {

//*****************************Registro Segmento T****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("H"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(INSCRICAO_SACADOR, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO_SACADOR, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(NOME_SACADOR, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(CODIGO_DESCONTO_1, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DATA_DESCONTO_1, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERC_DESCONTO_1, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(CODIGO_DESCONTO_2, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DATA_DESCONTO_2, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERC_DESCONTO_2, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(CODIGO_MULTA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DATA_MULTA, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERC_MULTA, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(VALOR_JUROS_DIAS_ATRASO, new FieldDecimalFixedLengthArchetype(25));
        addFieldArchetype(MENSAGEM_1, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(MENSAGEM_2, new FieldStringFixedLengthArchetype(40));
    }
}


