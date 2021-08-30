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

public class LineCnabRegistroTrailerLoteRetornoTest {
    @Test
    public void gerarRegistroTrailerLote() throws ParseException {
        LineCnabRegistroTrailerLoteRetorno record = new LineCnabRegistroTrailerLoteRetorno();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("5");
        record.setBrancos1("");
        record.setQtdeRegistros("");
        record.setQtdeCobrancaSimples("");
        record.setValorCobrancaSimples("");
        record.setQtdeCobrancaVinculada("");
        record.setValorCobrancaVinculada("");
        record.setZeros("");
        record.setAvisoBancario("");
        record.setBrancos2("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100015                                                                                                                                                                                                                                        ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado : " + manager.export(record)); 
    }  
}
