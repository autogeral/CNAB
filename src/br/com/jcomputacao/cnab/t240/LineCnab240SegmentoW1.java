package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * 10/11/2012 10:51:03
 * @author Murilo
 */
public class LineCnab240SegmentoW1 extends LineCnab240SegmentoN {

    
    public LineCnab240SegmentoW1() {
        setName("CNAB 240v084 - Segmento W1");
        addFieldArchetype(IDENTIFICACAO_TRIBUTO, new FieldStringFixedLengthArchetype(2));
    }

}
