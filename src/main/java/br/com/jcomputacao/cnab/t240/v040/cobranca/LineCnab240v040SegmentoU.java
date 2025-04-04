package br.com.jcomputacao.cnab.t240.v040.cobranca;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2012 09:49:05
 * @author Murilo
 */
public class LineCnab240v040SegmentoU extends LineArchetype {
    /**
     * VERSÃO 040
     */
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
     * CONTEUDO 'U'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 015 015
     * CONTEUDO ' '
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * CODIGO DE MOVIMENTO DE RETORNO
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
    /**
     * JUROS MULTA ENCARGOS
     * 13 ESPACOS
     * POSICAO 018 032
     */
    public static final String ACRESCIMOS = "ACRESCIMOS";
    /**
     * VALOR DESCONTOS CONCEDIDO
     * POSICAO 033 047
     * PICTURE 9(01)
     */
    public static final String VALOR_DESCONTO = "VALOR_DESCONTO";
    /**
     * VALOR DO ABATIMENTO CONCEDIDO
     * POSICAO 048 062
     */
    public static final String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";
    /**
     * VALOR DO IOF RECOLHIDO
     * POSICAO 063 077
     */
    public static final String VALOR_IOF = "VALOR_IOF";
    /**
     * VALOR PAGO PELO SACADO
     * POSICAO 078 092
     */
    public static final String VALOR_PAGO = "VALOR_PAGO";
    /**
     * VALOR LIQUIDO A SER CREDITADO
     * POSICAO 093 107
     */
    public static final String VALOR_LIQUIDO = "VALOR_LIQUIDO";
    /**
     * VALOR DE OUTRAS DESPESAS
     * POSICAO 108 122
     */
    public static final String VALOR_OUTRAS_DESPESAS = "VALOR_OUTRAS_DESPESAS";
    /**
     * VALOR DOS OUTROS CREDITOS
     * POSICAO 123 137
     */
    public static final String VALOR_OUTROS_CREDITOS = "VALOR_OUTROS_REDITOS";
    /**
     * DATA OCORRENCIA
     * POSICAO 138 145
     */
    public static final String DATA_OCORRENCIA = "DATA_OCORRENCIA";
    /**
     * DATA EFETIVACAO DO CREDITO
     * POSICAO 146 153
     */
    public static final String DATA_CREDITO = "DATA_CREDITO";
    /**
     * CODIGO DA OCORRENCIA
     * POSICAO 154 157
     */
    public static final String CODIGO_OCORRENCIA_SACADO = "CODIGO_OCORRENCIA_SACADO";
    /**
     * DATA OCORRENCIA 2
     * POSICAO 158 165
     */
    public static final String DATA_OCORRENCIA_SACADO = "DATA_OCORRENCIA_SACADO";
    /**
     * VALOR DA OCORRENCIA
     * POSICAO 166 180
     */
    public static final String VALOR_OCORRENCIA_SACADO = "VALOR_OCORRENCIA_SACADO";
    /**
     * COMPLEMENTO DA OCORRENCIA
     * POSICAO 181 210
     */
    public static final String COMPLEMENTO_OCORRENCIA_SACADO = "COMPLEMENTO_OCORRENCIA_SACADO";
    /**
     * CODIGO BANCO CORRESPONDENTE COMPENSACAO
     * POSICAO 211 213
     */
    public static final String CODIGO_BANCO_CORRESP = "CODIGO_BANCO_CORRESP";
    /**
     * RESERVADO
     * POSICAO 233 240
     * PICTURE X(33)
     * CONTEUDO BRANCOS
     */
    public static final String RESERVADO = "RESERVADO";

    public LineCnab240v040SegmentoU() {

//*****************************Registro Header de Lote****************************************
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("U"));
        //06
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(1, ' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(ACRESCIMOS, new FieldDecimalFixedLengthArchetype(15, 2));
        //09
        addFieldArchetype(VALOR_DESCONTO, new FieldDecimalFixedLengthArchetype(15, 2));
        //10
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(15, 2));
        //11
        addFieldArchetype(VALOR_IOF, new FieldDecimalFixedLengthArchetype(15, 2));
        //12
        addFieldArchetype(VALOR_PAGO, new FieldDecimalFixedLengthArchetype(15, 2));
        //13
        addFieldArchetype(VALOR_LIQUIDO, new FieldDecimalFixedLengthArchetype(15, 2));
        //14
        addFieldArchetype(VALOR_OUTRAS_DESPESAS, new FieldDecimalFixedLengthArchetype(15, 2));
        //15
        addFieldArchetype(VALOR_OUTROS_CREDITOS, new FieldDecimalFixedLengthArchetype(15, 2));
        //16
        addFieldArchetype(DATA_OCORRENCIA, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //17
        addFieldArchetype(DATA_CREDITO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //18
        addFieldArchetype(CODIGO_OCORRENCIA_SACADO, new FieldStringFixedLengthArchetype(4));
        //19
        addFieldArchetype(DATA_OCORRENCIA_SACADO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //20
        addFieldArchetype(VALOR_OCORRENCIA_SACADO, new FieldDecimalFixedLengthArchetype(15, 2));
        //21
        addFieldArchetype(COMPLEMENTO_OCORRENCIA_SACADO, new FieldStringFixedLengthArchetype(30));
        //22
        addFieldArchetype(CODIGO_BANCO_CORRESP, new FieldIntegerFixedLengthArchetype(3));
        //23
        addFieldArchetype(RESERVADO, new FieldFillerArchetype(27, ' '));
    }
}
