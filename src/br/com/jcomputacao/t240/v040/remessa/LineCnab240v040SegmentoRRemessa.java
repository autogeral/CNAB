package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.cnab.t240.LineCnab240SegmentoR;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040SegmentoRRemessa extends LineCnab240SegmentoR {

    public static final String VALOR_PERCENTUAL_CONCEDIDO = "VALOR_PERCENTUAL_CONCEDIDO";
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    public static final String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";
    public static final String MENSAGEM_3 = "MENSAGEM_3";
    public static final String MENSAGEM_4 = "MENSAGEM_4";
    public static final String RESERVADO = "RESERVADO";

    public LineCnab240v040SegmentoRRemessa() {
        setName("CNAB - Segmento R");

        removeFieldArchetype(VALOR_PERCENTUAL_DESCONTO_2);
        removeFieldArchetype(CODIGO_DESCONTO_3);
        removeFieldArchetype(DATA_DESCONTO_3);
        removeFieldArchetype(VALOR_PERCENTUAL_DESCONTO_3);
        removeFieldArchetype(CODIGO_MULTA);
        removeFieldArchetype(DATA_MULTA);
        removeFieldArchetype(VALOR_PERCENTUAL_MULTA);
        removeFieldArchetype(INFORMACAO_AO_SACADO);
        removeFieldArchetype(INFORMACAO_3);
        removeFieldArchetype(INFORMACAO_4);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);
        removeFieldArchetype(ZEROS);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_3);

        addFieldArchetype(DATA_DESCONTO_2, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERCENTUAL_CONCEDIDO, new FieldDecimalFixedLengthArchetype(15, 12));
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(24, ' '));
        addFieldArchetype(CODIGO_MULTA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DATA_MULTA, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERCENTUAL_MULTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(RESERVADO_USO_BANCO2, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(MENSAGEM_3, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(MENSAGEM_4, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(RESERVADO, new FieldFillerArchetype(61, ' '));
    }
}
