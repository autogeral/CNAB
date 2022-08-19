package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoNTributosPagamento;
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
public class LineCnabRegistroSegmentoNTributosPagamentoTest {
    @Test
    public void gerarSegmentoNTributosPagamento() throws ParseException { 
        LineCnabRegistroSegmentoNTributosPagamento record = new LineCnabRegistroSegmentoNTributosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("N");
        record.setTipoMovimento("");
        record.setDadosTributo("");
        record.setSeuNumero("");
        record.setNossoNumero("");
        record.setOcorrencias("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001N                                                                                                                                                                                                                                  ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
    
}
