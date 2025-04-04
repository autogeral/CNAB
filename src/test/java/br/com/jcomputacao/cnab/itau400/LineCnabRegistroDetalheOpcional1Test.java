package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo 26.08.2021 -> Layout referente ao arquivo remessa
 */
public class LineCnabRegistroDetalheOpcional1Test {

    @Test
    public void gerarRegistroDetalhe() throws ParseException {
        LineCnabRegistroDetalheOpcional1 record = new LineCnabRegistroDetalheOpcional1();
        record.setTipoRegistro("2");
        record.setCodMulta("");
        record.setDataMulta("");
        record.setMulta("");
        record.setNumeroSequencial("");

        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "2                                                                                                                                                                                                                                                                                                                                                                                                               ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue(result.contains(""));

        System.out.println("\nResultado: " + manager.export(record));
    }

}
