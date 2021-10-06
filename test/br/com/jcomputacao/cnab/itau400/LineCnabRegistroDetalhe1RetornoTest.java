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
 *     26.08.2021
 */
public class LineCnabRegistroDetalhe1RetornoTest {
     @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroDetalhe1Retorno record = new LineCnabRegistroDetalhe1Retorno();
        record.setTipoRegistro("1");
        record.setCodigoInscricao("01");
        record.setNumeroinscricao("");
        record.setAgencia("");
        record.setZeros("00");
        record.setConta("");
        record.setDac("");
        record.setBrancos1("");
        record.setUsoEmpresa("");
        record.setNossoNumero1("");
        record.setBrancos2("");
        record.setCarteira1("109");
        record.setNossoNumero2("");
        record.setDacNossoNumero("");
        record.setBrancos3("");
        record.setCarteira2("");
        record.setCodOcorrencia("");
        record.setDataOcorrencia("260821");
        record.setNumDocumento("");
        record.setNossoNumero3("");
        record.setBrancos4("");
        record.setVencimento("310821");
        record.setValorTitulo("150.50");
        record.setCodigoBanco("341");
        record.setAgenciaCobradora("");
        record.setDacAgCobradora("");
        record.setEspecie("");
        record.setTarifaCobranca("");
        record.setBrancos5("");
        record.setValorIof("");
        record.setValorAbatimento("");
        record.setDescontos("");
        record.setValorPrincipal("");
        record.setJurosMoraMulta("");
        record.setOutrosCreditos("");
        record.setBoletoDda("");
        record.setBrancos5("");
        record.setDataCredito("");
        record.setInstrCancelada("");
        record.setBrancos6("");
        record.setZeros1("");
        record.setNomePagador("LARISSA ANTUNES");
        record.setBrancos7("");
        record.setErrosMenssagem("");
        record.setBrancos8("");
        record.setCodLiquidacao("");
        record.setNumeroSequencial("");
        
         FixedFormatManager manager = new FixedFormatManagerImpl();
         String expected = "101                  00                                                           109                         260821                              310821150.50       341                                                                                                                                                            LARISSA ANTUNES                                                             ";
         System.out.println(expected);
         String result = manager.export(record);
         System.out.println(result);
         assertEquals(expected, result);
         assertTrue (result.contains(""));
         
         System.out.println("\nResultado: " + manager.export(record));
        
        
    }
}
