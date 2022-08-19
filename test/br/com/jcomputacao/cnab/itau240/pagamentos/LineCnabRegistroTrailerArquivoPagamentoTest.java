package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerArquivoPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    11.08.2022
 */
public class LineCnabRegistroTrailerArquivoPagamentoTest {
    @Test
    public void gerarRegistroTrailerArquivoPagamento() throws ParseException { 
        LineCnabRegistroTrailerArquivoPagamento record = new LineCnabRegistroTrailerArquivoPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("9999");
        record.setTipoRegistro("9");
        record.setBrancos1("");
        record.setTotalQtdLotes("000000");
        record.setTotalQtdRegistros("000000");
        record.setBrancos2("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34199999         000000000000                                                                                                                                                                                                                   ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
}
