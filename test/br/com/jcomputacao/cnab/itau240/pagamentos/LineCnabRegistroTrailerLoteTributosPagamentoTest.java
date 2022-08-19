package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteTributosPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   11.08.2022
 */
public class LineCnabRegistroTrailerLoteTributosPagamentoTest {
    @Test
    public void gerarTrailerLoteTributosPagamento() throws ParseException { 
        LineCnabRegistroTrailerLoteTributosPagamento record = new LineCnabRegistroTrailerLoteTributosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("5");
        record.setBrancos1("");
        record.setTotalQtdRegistros("000000");
        record.setTotalValorPrincipal("00000000000000");
        record.setTotalOutrasEntidades("00000000000000");
        record.setTotalValorAcrescimos("00000000000000");
        record.setTotalValorArrecad("00000000000000");
        record.setBrancos2("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100015         00000000000000000000000000000000000000000000000000000000000000                                                                                                                                                                 ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
