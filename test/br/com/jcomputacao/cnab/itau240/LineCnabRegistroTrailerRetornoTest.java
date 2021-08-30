package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    30.08.2021
 */

public class LineCnabRegistroTrailerRetornoTest {
    @Test
    public void gerarRegistroTrailer() throws ParseException {
        LineCnabRegistroTrailerRetorno record = new LineCnabRegistroTrailerRetorno();
        record.setCodigoBanco("341");
        record.setCodigoLote("9999");
        record.setRegistro("9");
        record.setBrancos1("");
        record.setTotalLotes("");
        record.setTotalRegistros("");
        record.setZeros("");
        record.setBrancos2("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34199999                                                                                                                                                                                                                                        ";
        System.out.println(expected);
        String result=  manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
         System.out.println("\nResultado : " + manager.export(record)); 
    }
    
}
