package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * DARF Simples
 * 10/11/2012 10:49:08
 * @author Murilo
 */
public class LineCnab240SegmentoN3 extends LineCnab240SegmentoN {

    public static final String PERIODO = "PERIODO";
    public static final String RECEITA_BRUTA = "RECEITA_BRUTA";
    public static final String PERCENTUAL = "PERCENTUAL";
    public static final String VALOR_PRINCIPAL = "VALOR_PRINCIPAL";
    public static final String VALOR_MULTA = "VALOR_MULTA";
    public static final String JUROS_ENCARGOS = "JUROS_ENCARGOS";
    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String CNAB = "CNAB";

    public LineCnab240SegmentoN3() {
        setName("CNAB 240v084 - Segmento N3 DARF Simples");
        addFieldArchetype(PERIODO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(RECEITA_BRUTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(PERCENTUAL, new FieldDecimalFixedLengthArchetype(7, 2));
        addFieldArchetype(VALOR_PRINCIPAL, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_MULTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(JUROS_ENCARGOS, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CNAB, new FieldFillerArchetype(21, ' '));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }
}
