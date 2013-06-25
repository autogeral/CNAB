package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.cnab.t240.LineCnab240SegmentoS;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040SegmentoSRemessa extends LineCnab240SegmentoS {

    public LineCnab240v040SegmentoSRemessa() {
        setName("CNAB - Segmento S");
        removeFieldArchetype(NUMERO_LINHA);
        removeFieldArchetype(MENSAGEM);
        removeFieldArchetype(TIPO_FONTE);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);
        
        //Verificar o tipo de impressao que sera utilizada!
    }
}
