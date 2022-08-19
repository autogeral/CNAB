package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZConcessionariasPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *  11.08.2022
 */
public class LineCnabRegistroSegmentoZConcessionariasPagamentoTest {
     @Test
    public void gerarSegmentoZConcessionariasPagamento() throws ParseException { 
        LineCnabRegistroSegmentoZConcessionariasPagamento record = new LineCnabRegistroSegmentoZConcessionariasPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("Z");
        record.setAutenticacaoEletronica("0000000000000000000000000000000000000000000000000000000000000000");
        record.setSeuNumero("");
        record.setBrancos1("");
        record.setNossoNumero("");
        record.setBrancos2("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001Z0000000000000000000000000000000000000000000000000000000000000000                                                                                                                                                                  ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
