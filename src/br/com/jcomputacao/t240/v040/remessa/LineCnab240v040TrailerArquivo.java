package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240TrailerArquivo;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040TrailerArquivo extends LineCnab240TrailerArquivo {

    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";

    public LineCnab240v040TrailerArquivo() {
        setName("CNAB - Trailer Arquivo - v040 - Remessa");
        
        removeFieldArchetype(QTDE_CONTAS_CONCIL);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(211, ' '));
    }
}
