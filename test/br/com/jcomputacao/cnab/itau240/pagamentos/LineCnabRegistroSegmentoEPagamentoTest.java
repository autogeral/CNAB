package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoEPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   10.08.2022
 */
public class LineCnabRegistroSegmentoEPagamentoTest {
    @Test
    public void gerarSegmentoEPagamento() throws ParseException {
        LineCnabRegistroSegmentoEPagamento record = new LineCnabRegistroSegmentoEPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumRegistro("00001");
        record.setCodigoSegmento("E");
        record.setBrancos1("");
        record.setTipoMovimento("1");
        record.setInfoComplementares("");
        record.setBrancos2("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001E   1                                                                                                                                                                                                                              ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
