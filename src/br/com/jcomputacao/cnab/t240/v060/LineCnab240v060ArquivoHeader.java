package br.com.jcomputacao.cnab.t240.v060;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240ArquivoHeader;

/**
 * 08/11/2012 00:18:02
 * @author Murilo
 */
public class LineCnab240v060ArquivoHeader extends LineCnab240ArquivoHeader {

    public LineCnab240v060ArquivoHeader() {
        setName("CNAB 240v060 - Arquivo Header");
        addFieldArchetype(VERSAO_LAYOUT, new FieldDefaultArchetype("060"));
    }
}
