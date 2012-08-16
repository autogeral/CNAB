package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 20/07/2012 18:26:44
 *
 * @author Murilo
 */
public class LineCnab240SegmentoC extends LineArchetype {

    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    public static final String VALOR_IR = "VALOR_IR";
    public static final String VALOR_ISS = "VALOR_ISS";
    public static final String VALOR_IOF = "VALOR_IOF";
    public static final String VALOR_OUTRAS_DEDUCOES = "VALOR_OUTRAS_DEDUCOES";
    public static final String VALOR_OUTROS_ACRESCIMOS = "VALOR_OUTROS_ACRESCIMOS";
    public static final String AGENCIA_PAGADOR_FAVORECIDO = "AGENCIA_PAGADOR_FAVORECIDO";
    public static final String AGENCIA_DIGITO = "AGENCIA_DIGITO";
    public static final String CONTA_NUMERO = "CONTA_NUMERO";
    public static final String CONTA_DIGITO = "CONTA_DIGITO";
    public static final String DIGITO_VER_AGENCIA_CONTA = "DIGITO_VER_AGENCIA_CONTA";
    public static final String VALOR_INSS = "VALOR_INSS";
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";
    

    public LineCnab240SegmentoC() {
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("C"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(3, ' '));
        
        addFieldArchetype(VALOR_IR, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_ISS, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_IOF, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_OUTRAS_DEDUCOES, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_OUTROS_ACRESCIMOS, new FieldDecimalFixedLengthArchetype(15, 2));

        addFieldArchetype(AGENCIA_PAGADOR_FAVORECIDO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(AGENCIA_DIGITO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CONTA_NUMERO, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(CONTA_DIGITO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DIGITO_VER_AGENCIA_CONTA, new FieldStringFixedLengthArchetype(1));

        addFieldArchetype(VALOR_INSS, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(113, ' '));
    }
}
