package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    26.08.2021
 * 
 */

public class LineCnabRegistroHeaderRetornoTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroHeaderRetorno record = new LineCnabRegistroHeaderRetorno();
        record.setTipoRegistro("0");
        record.setCodigoRetorno("2");
        record.setLiteralRetorno("RETORNO");
        record.setCodigoServico("01");
        record.setLiteralServico("COBRANCA");
        record.setAgencia("");
        record.setZeros("00");
        record.setConta("");
        record.setDac("");
        record.setBrancos("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setCodigoBanco("341");
        record.setNomeBanco("BANCO ITAU SA");
        record.setDataGeracao("260821");
        record.setDensidade("");
        record.setUnidadeDensid("BPI");
        record.setSequenciaRetorno("");
        record.setDataCredito("");
        record.setBrancos1("");
        record.setNumeroSequencial("000001");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "02RETORNO01COBRANCA           00              AUTO GERAL AUTOPECAS LTDA     341BANCO ITAU SA  260821     BPI                                                                                                                                                                                                                                                                                              000001";
        System.out.println(expected);
        String result= manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
     }
    
}
