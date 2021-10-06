package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

/**
 *
 * @author larissa.camargo
 */
public class LineModel {

    public <T extends Object> String getRepresentation(T t) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        return manager.export(t);
    }
}
