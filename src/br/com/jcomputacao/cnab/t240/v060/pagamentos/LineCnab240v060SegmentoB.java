package br.com.jcomputacao.cnab.t240.v060.pagamentos;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240SegmentoB;

/**
 * Nov 8, 2012 2:03:57 PM
 * @author Murilo
 */
public class LineCnab240v060SegmentoB extends LineCnab240SegmentoB {

    public static final String HORARIO_ENVIO = "HORARIO_ENVIO";
    public static final String CODIGO_HISTORICO = "CODIGO_HISTORICO";
    public static final String EXCLUSIVO_FEBRABAN_3 = "EXCLUSIVO_FEBRABAN_3";
    
    public LineCnab240v060SegmentoB() {
        setName("CNAB 240v060 - Segmento B");
        removeFieldArchetype(CODIGO_DOCUMENTO_PAGADOR_FAVORECIDO);
        removeFieldArchetype(AVISO);
        removeFieldArchetype(USO_SIAPE);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);
        
        FieldIntegerFixedLengthArchetype fa = new FieldIntegerFixedLengthArchetype(6);
        fa.setNullableRepresentation("    ");
        addFieldArchetype(HORARIO_ENVIO, fa);
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(11, ' '));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_3, new FieldFillerArchetype(1, ' '));
    }

}
