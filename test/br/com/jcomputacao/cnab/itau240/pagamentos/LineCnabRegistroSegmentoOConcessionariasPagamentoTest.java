package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoOConcessionariasPagamento;
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
public class LineCnabRegistroSegmentoOConcessionariasPagamentoTest {
    @Test
    public void gerarSegmentoOConcessionariasPagamento() throws ParseException {
        LineCnabRegistroSegmentoOConcessionariasPagamento record = new LineCnabRegistroSegmentoOConcessionariasPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("O");
        record.setTipoMovimento("000");
        record.setCodigoBarras("");
        record.setNomeConcessionaria("");
        record.setDataVencimento("15082022");
        record.setTipoMoeda("REA");
        record.setQtdMoeda("000000000");
        record.setValorPagar("000000000000500");
        record.setDataPgto("15082022");
        record.setValorPago("");
        record.setBrancos1("");
        record.setNotaFiscal("000000000");
        record.setBrancos2("");
        record.setNossoNumero("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001O000                                                                              15082022REA000000000      00000000000050015082022                  000000000                                                                     ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
    
}
