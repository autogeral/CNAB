package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040SegmentoRRemessaImpressao1 extends LineCnab240v040SegmentoSRemessa {

    public LineCnab240v040SegmentoRRemessaImpressao1() {
        setName("CNAB - Segmento S - Tipo 1 de impressão");
        //01
        addFieldArchetype(NUMERO_LINHA_IMPRESSA, new FieldIntegerFixedLengthArchetype(2));
        //02
        addFieldArchetype(MENSAGEM_PARA_RECIBO_SACADO, new FieldIntegerFixedLengthArchetype(1));
        //03
        addFieldArchetype(MENSAGEM_IMPRESSA, new FieldStringFixedLengthArchetype(100));
        //04
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(119, ' '));   
    }
}
