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
 *     27.08.2021
 */
public class LineCnabRegistroSegmentoRRemessaTest {
    @Test
    public void gerarSegmentoR() throws ParseException {
        LineCnabRegistroSegmentoRRemessa record = new LineCnabRegistroSegmentoRRemessa();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("R");
        record.setBrancos1("");
        record.setCodOcorrencia("");
        record.setZeros1("");
        record.setData2Desconto("");
        record.setValor2Desconto("");
        record.setZeros2("");
        record.setData3Desconto("");
        record.setValor3Desconto("");
        record.setCodMulta("");
        record.setDataMulta("");
        record.setMulta("");
        record.setBrancos2("");
        record.setInfoPagador("");
        record.setBrancos3("");
        record.setCodOcPagador("");
        record.setZeros3("");
        record.setBrancos4("");
        record.setZeros4("");
        record.setBranco5("");
        record.setZeros5("");
        record.setBrancos6("");
        
        
       FixedFormatManager manager = new FixedFormatManagerImpl();
       String expected = "341    3     R                                                                                                                                                                                                                                  ";
       System.out.println(expected);
       String result = manager.export(record);
       System.out.println(result);
       assertEquals(expected, result);
       assertTrue (result.contains(""));
       
        System.out.println("\nResultado: " + manager.export(record)); 
    }
}
