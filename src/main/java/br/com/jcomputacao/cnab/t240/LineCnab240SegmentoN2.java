package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * DARF 
 * 10/11/2012 10:48:54
 * @author Murilo
 */
public class LineCnab240SegmentoN2 extends LineCnab240SegmentoN {

    public static final String PERIODO = "PERIODO";
    public static final String REFERENCIA = "REFERENCIA";
    public static final String VALOR_PRINCIPAL = "VALOR_PRINCIPAL";
    public static final String VALOR_MULTA = "VALOR_MULTA";
    public static final String JUROS_ENCARGOS = "JUROS_ENCARGOS";
    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String CNAB = "CNAB";

    public LineCnab240SegmentoN2() {
        setName("CNAB 240v084 - Segmento N2 DARF");
        addFieldArchetype(PERIODO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(REFERENCIA, new FieldIntegerFixedLengthArchetype(17));
        addFieldArchetype(VALOR_PRINCIPAL, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_MULTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(JUROS_ENCARGOS, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CNAB, new FieldFillerArchetype(18, ' '));
        FieldArchetype fa = new FieldStringFixedLengthArchetype(10);
        fa.setNullableRepresentation("");
        addFieldArchetype(OCORRENCIAS, fa);
    }
}
