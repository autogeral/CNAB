package br.com.jcomputacao.cnab.t240.v05.extrato;

import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v05HeaderLoteExtratoLayout033 extends LineCnab240v05HeaderLoteExtratoLayout031 {
    public LineCnab240v05HeaderLoteExtratoLayout033 (){
        setName("CNAB 240 v5.0 - Header do lote - layout 033");
        //11
        removeFieldArchetype(TIPO_CONTA);
        //12
        removeFieldArchetype(BRANCOS2);
        //13
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(20));
        //14
        removeFieldArchetype(ZEROS);
        //15
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        //16
        addFieldArchetype(DIGITO_VER_AGENCIA,  new FieldStringFixedLengthArchetype(1));
        //17
        removeFieldArchetype(ZEROS2);
        //18
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));
        //19
        /*
         * Dígito da conta
         */
        addFieldArchetype(BRANCOS3, new FieldStringFixedLengthArchetype(1));        
    }
}
