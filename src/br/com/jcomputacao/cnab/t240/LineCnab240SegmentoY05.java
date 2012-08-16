package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240SegmentoY05 extends LineArchetype{

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
     * CONTEUDO 'Q'
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
     * IDENTIFICACAO DO REGISTRO
     * DEFAULT '04'
     * 1 ESPACO
     * POSICAO 018 019
     */
    public static final String IDENTIFICAO_REGISTRO = "IDENTIFICAO_REGISTRO";
    /**
     * IDENTIFICACAO DO CHEQUE 1
     * 34 ESPACOS
     * POSICAO 020 053
     */
    public static final String IDENTIFICACAO_CHEQUE_1 = "IDENTIFICACAO_CHEQUE_1";
    /**
     * IDENTIFICACAO DO CHEQUE 2
     * 34 ESPACOS
     * POSICAO 054 087
     */
    public static final String IDENTIFICACAO_CHEQUE_2 = "IDENTIFICACAO_CHEQUE_2";
    /**
     * IDENTIFICACAO DO CHEQUE 3
     * 34 ESPACOS
     * POSICAO 088 121
     */
    public static final String IDENTIFICACAO_CHEQUE_3 = "IDENTIFICACAO_CHEQUE_3";
    /**
     * IDENTIFICACAO DO CHEQUE 4
     * 34 ESPACOS
     * POSICAO 122 155
     */
    public static final String IDENTIFICACAO_CHEQUE_4 = "IDENTIFICACAO_CHEQUE_4";
    /**
     * IDENTIFICACAO DO CHEQUE 5
     * 34 ESPACOS
     * POSICAO 156 189
     */
    public static final String IDENTIFICACAO_CHEQUE_5 = "IDENTIFICACAO_CHEQUE_5";
    /**
     * IDENTIFICACAO DO CHEQUE 6
     * 34 ESPACOS
     * POSICAO 190 223
     */
    public static final String IDENTIFICACAO_CHEQUE_6 = "IDENTIFICACAO_CHEQUE_6";
    /**
     * USO EXCLUSIVO DA FEBRABAN / CNAB
     * CAMPO NAO TRATADO PELO BB
     * POSICAO 163 240
     * INFORMAR 78 BRANCOS ' '
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240SegmentoY05() {

//*****************************Segmento S****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("Y"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IDENTIFICAO_REGISTRO, new FieldDefaultArchetype("04"));
        addFieldArchetype(IDENTIFICACAO_CHEQUE_1, new FieldStringFixedLengthArchetype(34));
        addFieldArchetype(IDENTIFICACAO_CHEQUE_2, new FieldStringFixedLengthArchetype(34));
        addFieldArchetype(IDENTIFICACAO_CHEQUE_3, new FieldStringFixedLengthArchetype(34));
        addFieldArchetype(IDENTIFICACAO_CHEQUE_4, new FieldStringFixedLengthArchetype(34));
        addFieldArchetype(IDENTIFICACAO_CHEQUE_5, new FieldStringFixedLengthArchetype(34));
        addFieldArchetype(IDENTIFICACAO_CHEQUE_6, new FieldIntegerFixedLengthArchetype(34));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(17, ' '));

    }
}
