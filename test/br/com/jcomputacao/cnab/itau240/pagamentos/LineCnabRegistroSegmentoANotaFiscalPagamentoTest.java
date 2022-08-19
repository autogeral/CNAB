package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoANotaFiscalPagamento;
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
public class LineCnabRegistroSegmentoANotaFiscalPagamentoTest {
    @Test
    public void gerarSegmentoANotaFiscalPagamento() throws ParseException {
        // Para pagamentos através de Nota Fiscal - Liquidação Eletrônica
        
        LineCnabRegistroSegmentoANotaFiscalPagamento record = new LineCnabRegistroSegmentoANotaFiscalPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumRegistro("00001");
        record.setCodigoSegmento("A");
        record.setTipoMovimento("000");
        record.setZeros1("000");
        record.setBancoFavorecido("");
        record.setAgenciaFavorecido("");
        record.setNomeFavorecido("AUTO GERAL AUTOPECAS LTDA");
        record.setSeuNumero("");
        record.setDataPgto("10082022");
        record.setTipoMoeda("REA");
        record.setZeros2("000000000000000");
        record.setValorPgto("000000000000500");
        record.setNossoNumero("");
        record.setBrancos1("");
        record.setDataEfetivaPgto("");
        record.setValorEfetivoPgto("");
        record.setNumeroNotaFiscal("");
        record.setBrancos2("");
        record.setNumDoc("");
        record.setNumInscricao("");
        record.setTipoIdentificacao("1");
        record.setBrancos3("");
        record.setAvisoFavorecido("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "341    300001A000000                       AUTO GERAL AUTOPECAS LTDA                         10082022REA000000000000000000000000000500                                                                                   1                      ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
        
    }
    
}
