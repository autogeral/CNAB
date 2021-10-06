
package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *     26.08.2021
 * -> Layout referente ao arquivo remessa
 */
public class LineCnabRegistroTrailerTest {
    @Test
    public void gerarRegistroDetalhe() throws ParseException {
        LineCnabRegistroTrailer record = new LineCnabRegistroTrailer();
        record.setTipoRegistro("9");
        record.setBrancos("");
        record.setNumeroSequencial("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "9                                                                                                                                                                                                                                                                                                                                                                                                               ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
    }
}
