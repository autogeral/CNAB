package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *     27.08.2021
 */
public class LineCnabRegistroSegmentoTRetornoTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroSegmentoTRetorno record = new LineCnabRegistroSegmentoTRetorno();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("T");
        record.setBoletoDda("");
        record.setCodOcorrencia("");
        record.setZeros1("0");
        record.setAgencia("");
        record.setZeros2("00000000");
        record.setConta("");
        record.setZeros3("");
        record.setDac1("");
        record.setNumCarteira("");
        record.setNossoNumero("");
        record.setDac2("");
        record.setBrancos1("");
        record.setZeros4("");
        record.setSeuNumero("");
        record.setBrancos2("");
        record.setVencimento("01082021");
        record.setValorTitulo("50.00");
        record.setZeros5("");
        record.setAgCobradora("");
        record.setDac3("");
        record.setUsoEmpresa("");
        record.setZeros6("");
        record.setCodigoInscricao("2");
        record.setInscricaoNumero("");
        record.setNome("LARISSA ANTUNES DE CAMARGO");
        record.setBrancos3("");
        record.setZeros7("");
        record.setTarifaCustas("");
        record.setErros("");
        record.setCodLiquidacao("");
        record.setBrancos4("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "341    3     T   0    00000000                                           0108202150.00                                              2               LARISSA ANTUNES DE CAMARGO                                                                  ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
        
        
    } 
}
