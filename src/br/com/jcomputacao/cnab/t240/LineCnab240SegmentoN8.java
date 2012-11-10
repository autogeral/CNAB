package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;

/**
 * DARJ
 * 10/11/2012 10:50:06
 * @author Murilo
 */
public class LineCnab240SegmentoN8 extends LineCnab240SegmentoN {

    public static final String IE_MUNICIPIO_DECLARACAO = "IE_MUNICIPIO_DECLARACAO";
    public static final String ORIGEM = "ORIGEM";
    public static final String VALOR_PRINCIPAL = "VALOR_PRINCIPAL";
    public static final String ATUALIZACAO_MONETARIA = "ATUALIZACAO_MONETARIA";
    public static final String VALOR_MORA = "VALOR_MORA";
    public static final String VALOR_MULTA = "VALOR_MULTA";
    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String PERIODO_PARCELA = "PERIODO_PARCELA";

    public LineCnab240SegmentoN8() {
        setName("CNAB 240v084 - Segmento N8 DARJ");
        addFieldArchetype(IE_MUNICIPIO_DECLARACAO, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(ORIGEM, new FieldIntegerFixedLengthArchetype(16));
        addFieldArchetype(VALOR_PRINCIPAL, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(ATUALIZACAO_MONETARIA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_MORA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_MULTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_MULTA, new FieldIntegerFixedLengthArchetype(6));
    }

}
