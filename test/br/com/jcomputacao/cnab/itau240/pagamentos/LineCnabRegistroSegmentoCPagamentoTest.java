package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoCPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 */
public class LineCnabRegistroSegmentoCPagamentoTest {
    @Test
    public void gerarSegmentoCPagamento() throws ParseException {
        LineCnabRegistroSegmentoCPagamento record = new LineCnabRegistroSegmentoCPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumRegistro("00001");
        record.setCodigoSegmento("C");
        record.setValorContribuicaoLucro("");
        record.setBrancos1("");
        record.setVencimento("15082022");
        record.setValorDoc("000000000000500");
        record.setValorPIS("");
        record.setValorIR("");
        record.setValorISS("");
        record.setValorCofins("");
        record.setValorDesconto("");
        record.setAbatimento("");
        record.setOutrasDeducoes("");
        record.setMora("");
        record.setMulta("");
        record.setOutrosAcrescimos("");
        record.setFaturaDocumento("");
        record.setBrancos2("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001C                       15082022000000000000500                                                                                                                                                                                    ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
}
