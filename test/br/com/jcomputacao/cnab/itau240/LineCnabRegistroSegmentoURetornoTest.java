
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
 *    27.08.2021
 */

public class LineCnabRegistroSegmentoURetornoTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroSegmentoURetorno record = new LineCnabRegistroSegmentoURetorno();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("U");
        record.setBrancos1("");
        record.setCodOcorrencia("");
        record.setJurosMulta("");
        record.setValorDesconto("");
        record.setValorAbatimento("");
        record.setValorIof("");
        record.setValorCreditado1("");
        record.setValorCreditado2("");
        record.setZeros1("");
        record.setDataOcorrencia1("");
        record.setDataCredito("");
        record.setOcorrenciaPagador("");
        record.setDataOcorrencia2("");
        record.setValorOcorrencia("");
        record.setBrancos2("");
        record.setZeros2("");
        record.setBrancos3("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "341    3     U                                                                                                                                                                                                                                  ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
        
    }
}
