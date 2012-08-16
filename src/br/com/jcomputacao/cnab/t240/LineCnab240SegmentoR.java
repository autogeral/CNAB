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
public class LineCnab240SegmentoR extends LineArchetype{


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
    public static final String CODIGO_LOTE = "CODIGO_DO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_DE_REGISTRO";

    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE
     * TIPO DE OPERACAO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";

    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE
     * IDENTIFICACAO DO TIPO DE SERVICO
     * Repetir código informado no segmento P.
     * POSICAO 014 014
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SERVICO";

    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO ' '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * CODIGO DE MOVIMENTO DE REMESSA
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";


    /**
     * CODIGO DA MULTA
     * POSICAO 066 066
     * PICTURE 9(01)
     * '1' = Valor Fixo Até a Data Informada
     * '2' = Percentual Até a Data Informada
     * '3' = Valor por Antecipação Dia Corrido
     */
    public static final String CODIGO_DESCONTO_2 = "CODIGO_DESCONTO_2";

    /**
     * DATA DA MULTA
     * POSICAO 067 074
     */
    public static final String DATA_DESCONTO_2 = "DATA_DESCONTO_2";

    /**
     * VALOR PERCENTUAL DA MULTA
     * POSICAO 075 089
     */
    public static final String VALOR_PERCENTUAL_DESCONTO_2 = "VALOR_PERCENTUAL_DESCONTO_2";

    /**
     * CODIGO DA MULTA
     * POSICAO 066 066
     * PICTURE 9(01)
     * '1' = Valor Fixo Até a Data Informada
     * '2' = Percentual Até a Data Informada
     * '3' = Valor por Antecipação Dia Corrido
     */
    public static final String CODIGO_DESCONTO_3 = "CODIGO_DESCONTO_3";

    /**
     * DATA DA MULTA
     * POSICAO 067 074
     */
    public static final String DATA_DESCONTO_3 = "DATA_DESCONTO_3";

    /**
     * VALOR PERCENTUAL DA MULTA
     * POSICAO 075 089
     */
    public static final String VALOR_PERCENTUAL_DESCONTO_3 = "VALOR_PERCENTUAL_DESCONTO_3";
    /**
     * CODIGO DA MULTA
     * POSICAO 066 066
     * PICTURE 9(01)
     * '1' = Valor Fixo Até a Data Informada
     * '2' = Percentual Até a Data Informada
     * '3' = Valor por Antecipação Dia Corrido
     */
    public static final String CODIGO_MULTA = "CODIGO_MULTA";

    /**
     * DATA DA MULTA
     * POSICAO 067 074
     */
    public static final String DATA_MULTA = "DATA_MULTA";

    /**
     * VALOR PERCENTUAL DA MULTA
     * POSICAO 075 089
     */
    public static final String VALOR_PERCENTUAL_MULTA = "VALOR_PERCENTUAL_MULTA";

    /**
     * INFORMACOES DO SACADO
     * CAMPO NAO TRATADO PELO BB
     * POSICAO 090 099
     */
    public static final String INFORMACAO_AO_SACADO = "INFORMACAO_AO_SACADO";

    /**
     * MENSAGEM 3
     * No caso em que a impressão do bloqueto é feita pelo banco,\n
     * essa mensagem sobrescreve a mensagem 1 do header de\n
     * lote e o campo Sacador/Avalista, ou seja, se o cliente utilizar\n
     * os campos Mensagem 1, Mensagem 3 e Sacador/Avalista,\n
     * somente a Mensagem 3 será impressa no boleto. A\n
     * mensagem 3 é impressa no campo instruções somente da 1ª\n
     * via.
     * POSICAO 100 139
     */
    public static final String INFORMACAO_3 = "INFORMACAO_3";

    /**
     * MENSAGEM 4
     * CAMPO NAO TRATADO PELO BB
     * PREENCHIDO COM BRANCOS
     * POSICAO 140 179
     */
    public static final String INFORMACAO_4 = "INFORMACAO_4";

    /**
     * USO EXCLUSIVO FEBRABAN/CNAB
     * PREENCHIDO COM BRANCOS
     * POSICAO 180 199
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    /**
     * CAMPOS NAO TRATADOS PELO BANCO DO BRASIL
     * PREENCHER COM ZEROS
     * 32 ZEROS
     * POSICAO 200 231
     */
    public static final String ZEROS = "ZEROS";

    /* BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSICAO 232 240
     * PICTURE X(33)
     * CONTEUDO BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_3 = "EXCLUSIVO_FEBRABAN_3";

        public LineCnab240SegmentoR() {
        setName("CNAB BB - Segmento R");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("R"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_DESCONTO_2, new FieldDefaultArchetype("1"));
        addFieldArchetype(DATA_DESCONTO_2, new FieldFillerArchetype(8, '0'));
        addFieldArchetype(VALOR_PERCENTUAL_DESCONTO_2, new FieldFillerArchetype(15, '0'));
        addFieldArchetype(CODIGO_DESCONTO_3, new FieldDefaultArchetype("1"));
        addFieldArchetype(DATA_DESCONTO_3, new FieldFillerArchetype(8, '0'));
        addFieldArchetype(VALOR_PERCENTUAL_DESCONTO_3, new FieldFillerArchetype(15, '0'));
        addFieldArchetype(CODIGO_MULTA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DATA_MULTA, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERCENTUAL_MULTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(INFORMACAO_AO_SACADO, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(INFORMACAO_3, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(INFORMACAO_4, new FieldFillerArchetype(40, ' '));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(20, ' '));
        addFieldArchetype(ZEROS, new FieldFillerArchetype(32, '0')); //CAMPOS NAO TRATADOS PELO BANCO DO BRASIL
        addFieldArchetype(EXCLUSIVO_FEBRABAN_3, new FieldFillerArchetype(9, ' '));

    }
}

