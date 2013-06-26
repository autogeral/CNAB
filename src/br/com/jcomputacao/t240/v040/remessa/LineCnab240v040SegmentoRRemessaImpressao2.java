package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040SegmentoRRemessaImpressao2 extends LineCnab240v040SegmentoSRemessa {

    public LineCnab240v040SegmentoRRemessaImpressao2() {
        setName("CNAB - Segmento S - Tipo 2 de impressão");

        //01
        addFieldArchetype(MENSAGEM_5, new FieldStringFixedLengthArchetype(40));
        //02
        addFieldArchetype(MENSAGEM_6, new FieldStringFixedLengthArchetype(40));
        //03
        addFieldArchetype(MENSAGEM_7, new FieldStringFixedLengthArchetype(40));
        //04
        addFieldArchetype(MENSAGEM_8, new FieldFillerArchetype(40, ' '));
        //05
        addFieldArchetype(MENSAGEM_9, new FieldFillerArchetype(40, ' '));
        //06
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(22, ' '));
    }
}
