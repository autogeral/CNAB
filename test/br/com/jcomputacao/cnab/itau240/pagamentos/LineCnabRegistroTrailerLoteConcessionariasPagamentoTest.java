package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteConcessionariasPagamento;
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
public class LineCnabRegistroTrailerLoteConcessionariasPagamentoTest {
    @Test
    public void gerarTrailerLoteConcessionariasPagamento() throws ParseException { 
        LineCnabRegistroTrailerLoteConcessionariasPagamento record = new LineCnabRegistroTrailerLoteConcessionariasPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("5");
        record.setBrancos1("");
        record.setTotalQtdRegistros("000000");
        record.setTotalValorPgto("000000000000000000");
        record.setTotalQtdeMoeda("000000000");
        record.setBrancos2("");
        record.setOcorrencias("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100015         000000000000000000000000000000000                                                                                                                                                                                              ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
    
}
