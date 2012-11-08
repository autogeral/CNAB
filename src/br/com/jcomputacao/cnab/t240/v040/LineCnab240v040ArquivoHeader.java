package br.com.jcomputacao.cnab.t240.v040;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240ArquivoHeader;

/**
 * 08/11/2012 01:15:58
 * @author Murilo
 */
public class LineCnab240v040ArquivoHeader extends LineCnab240ArquivoHeader {

    public LineCnab240v040ArquivoHeader() {
        setName("CNAB 240v040 - Arquivo Header");
        addFieldArchetype(VERSAO_LAYOUT, new FieldDefaultArchetype("040"));
    }

}
