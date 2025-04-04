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
 */
public class LineCnabRegistroTransacaoRetornoTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroTransacaoRetorno record = new LineCnabRegistroTransacaoRetorno();
        record.setTipoRegistro("1");
        record.setCodigoInscricao("01");
        record.setNumeroInscricao("");
        record.setAgencia("");
        record.setZeros1("00");
        record.setConta("");
        record.setDac("");
        record.setBrancos1("");
        record.setUsoEmpresa("");
        record.setNossoNumero1("");
        record.setAgenciaContaCheque("");
        record.setCarteira1("");
        record.setNossoNumero2("");
        record.setDacNossoNumero("");
        record.setBrancos2("");
        record.setCarteira2("");
        record.setCodOcorrencia("");
        record.setNumDocumento("");
        record.setNossoNumero3("");
        record.setBrancos3("");
        record.setZeros2("");
        record.setValorTitulo("50.00");
        record.setCodigoBanco("341");
        record.setAgenciaCobradora("");
        record.setDacAgCobradora("");
        record.setBrancos4("");
        record.setZeros3("");
        record.setValorCheque("");
        record.setZeros4("");
        record.setBrancos5("");
        record.setZeros5("");
        record.setBandaMagnetica("");
        record.setBrancos6("");
        record.setMotivo("");
        record.setBrancos7("");
        record.setNumeroSequencial("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "101                  00                                                                                                                                 50.00        341                                                                                                                                                                                                                                        ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
    }
}
