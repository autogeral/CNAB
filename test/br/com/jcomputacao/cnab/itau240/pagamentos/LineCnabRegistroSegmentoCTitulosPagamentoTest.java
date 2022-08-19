package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoCTitulosPagamento;
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
public class LineCnabRegistroSegmentoCTitulosPagamentoTest {
    @Test
    public void gerarSegmentoCTitulosPagamento() throws ParseException {
        LineCnabRegistroSegmentoCTitulosPagamento record = new LineCnabRegistroSegmentoCTitulosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("C");
        record.setValorContribuicao("000000000000000");
        record.setBrancos1("");
        record.setVencimento("15082022");
        record.setValorDoc("000000000000500");
        record.setValorPIS("000000000000000");
        record.setValorIR("000000000000000");
        record.setValorISS("000000000000000");
        record.setValorContribuicaoFinalidadeSocial("000000000000000"); //Valor Cofins
        record.setDesconto("000000000000000");
        record.setAbatimento("000000000000000");
        record.setOutrasDeducoes("000000000000000");
        record.setMora("000000000000000");
        record.setMulta("000000000000000");
        record.setOutrasAcrescimos("000000000000000");
        record.setFaturaDocumento("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001C000000000000000        15082022000000000000500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                              ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
    
}
