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

public class LineCnabRegistroDetalhe2RetornoTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroDetalhe2Retorno record = new LineCnabRegistroDetalhe2Retorno();
        record.setTipoRegistro("4");
        record.setCodigoInscricao("");
        record.setNumeroInscricao("");
        record.setAgencia("");
        record.setZeros1("");
        record.setConta("");
        record.setDac("");
        record.setBrancos1("");
        record.setUsoEmpresa("");
        record.setNossoNumero1("");
        record.setBrancos2("");
        record.setNumeroCarteira("");
        record.setNossoNumero2("");
        record.setDacNossoNumero("");
        record.setBrancos3("");
        record.setCarteira("");
        record.setCodOcorrencia("");
        record.setSequencia("");
        record.setValorTitulo("25.00");
        record.setAgencia1("");
        record.setConta1("");
        record.setDac1("");
        record.setValor1("");
        record.setValorEncargos1("");
        record.setAgencia2("");
        record.setConta2("");
        record.setDac2("");
        record.setValor2("");
        record.setValorEncargos2("");
        record.setAgencia3("");
        record.setConta3("");
        record.setDac3("");
        record.setValor3("");
        record.setValorEncargos3("");
        record.setAgencia4("");
        record.setConta4("");
        record.setDac4("");
        record.setValor4("");
        record.setValorEncargos4("");
        record.setAgencia5("");
        record.setConta5("");
        record.setDac5("");
        record.setValor5("");
        record.setValorEncargos5("");
        record.setAgencia6("");
        record.setConta6("");
        record.setDac6("");
        record.setValor6("");
        record.setValorEncargos6("");
        record.setAgencia7("");
        record.setConta7("");
        record.setDac7("");
        record.setValor7("");
        record.setValorEncargos7("");
        record.setBrancos4("");
        record.setTipoValor("");
        record.setNumeroSequencial("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "4                                                                                                               25.00                                                                                                                                                                                                                                                                                           ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result); 
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));       
    }  
}
