package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoWTributosPagamento;
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
public class LineCnabRegistroSegmentoWTributosPagamentoTest {
    @Test
    public void gerarSegmentoWTributosPagamento() throws ParseException { 
        LineCnabRegistroSegmentoWTributosPagamento record = new LineCnabRegistroSegmentoWTributosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("W");
        record.setBrancos1("");
        record.setInformacao1("TESTE 01");
        record.setInformacao2("TESTE 02");
        record.setInformacao3("TESTE 03");
        record.setInformacao4("TESTE 04");
        record.setBrancos2("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001W  TESTE 01                                TESTE 02                                TESTE 03                                TESTE 04                                                                                                ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
    
}
