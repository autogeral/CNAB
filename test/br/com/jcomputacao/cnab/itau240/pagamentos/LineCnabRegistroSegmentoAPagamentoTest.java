package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoAPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   10.08.2022
 */
public class LineCnabRegistroSegmentoAPagamentoTest {
    @Test
    public void gerarSegmentoAPagamento() throws ParseException {
        LineCnabRegistroSegmentoAPagamento record = new LineCnabRegistroSegmentoAPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("A");
        record.setTipoMovimento("000");
        record.setCodigoCamara("000");
        record.setBancoFavorecido("");
        record.setAgenciaFavorecido("");
        record.setNomeFavorecido("");
        record.setSeuNumero("");
        record.setDataPgto("10082022");
        record.setTipoMoeda("REA");
        record.setCodigoIspb("00000000");
        record.setZeros1("0000000");
        record.setValorPgto("000000000000000");
        record.setNossoNumero("");
        record.setBrancos1("");
        record.setDataEfetivaPgto("10082022");
        record.setValorEfetivoPgto("000000000000500");
        record.setFinalidadeDetalhe("30");
        record.setBrancos2("");
        record.setNumeroDoc("");
        record.setNumeroInscricao("");
        record.setFinalidadeDocStatus("");
        record.setFinalidadeTed("");
        record.setBrancos3("");
        record.setAvisoFavorecido("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001A000000                                                                         10082022REA000000000000000000000000000000                    1008202200000000000050030                                                             ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
    
}
