package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * GPS 
 * 10/11/2012 10:48:48
 *@author Murilo
 */
public class LineCnab240SegmentoN1 extends LineCnab240SegmentoN {

    public static final String COMPETENCIA = "COMPETENCIA";
    public static final String VALOR_TRIBUTO = "VALOR_TRIBUTO";
    public static final String VALOR_OUTRAS_ENTIDADES = "VALOR_OUTRAS_ENTIDADES";
    public static final String ATUALIZACAO_MONETARIA = "ATUALIZACAO_MONETARIA";
    public static final String CNAB = "CNAB";

    public LineCnab240SegmentoN1() {
        setName("CNAB 240v084 - Segmento N1 GPS");
        addFieldArchetype(IDENTIFICACAO_TRIBUTO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COMPETENCIA, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_TRIBUTO, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_OUTRAS_ENTIDADES, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(ATUALIZACAO_MONETARIA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(CNAB, new FieldFillerArchetype(3, ' '));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }
}
