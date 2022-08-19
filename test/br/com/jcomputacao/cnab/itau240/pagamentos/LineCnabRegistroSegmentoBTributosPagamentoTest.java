package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBTributosPagamento;
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
public class LineCnabRegistroSegmentoBTributosPagamentoTest {
    @Test
    public void gerarSegmentoBTributosPagamento() throws ParseException { 
        LineCnabRegistroSegmentoBTributosPagamento record = new LineCnabRegistroSegmentoBTributosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("B");
        record.setBrancos1("");
        record.setEndereco("AV DR OCTAVIANO PEREIRA MENDES");
        record.setNumero("1333");
        record.setComplemento("LOJA");
        record.setBairro("CENTRO");
        record.setCidade("ITU");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setTelefone("");
        record.setValorAcrescimos("");
        record.setValorHonorario("");
        record.setBrancos2("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001B                  AV DR OCTAVIANO PEREIRA MENDES1333 LOJA           CENTRO         ITU                 13301909SP                                                                                                                 ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
