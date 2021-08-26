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
 *   26.08.2021
 * -> Layout referente ao arquivo remessa
 */

public class LineCnabRegistroDetalheRateioTest {
    @Test
    public void gerarRegistroDetalhe() throws ParseException {
        LineCnabRegistroDetalheRateio record = new LineCnabRegistroDetalheRateio();
        record.setTipoRegistro("4");
        record.setCodigoInscricao("");
        record.setNumeroInscricao("");
        record.setAgencia("");
        record.setZeros("00");
        record.setConta("");
        record.setDac("");
        record.setNumCarteira("109");
        record.setNossoNumero("");
        record.setDacNossoNumero("");
        record.setSequencia("");
        record.setAgencia1("");
        record.setConta1("");
        record.setDac1("");
        record.setValor1("");
        record.setAgencia2("");
        record.setConta2("");
        record.setDac2("");
        record.setValor2("");
        record.setAgencia3("");
        record.setConta3("");
        record.setDac3("");
        record.setValor3("");
        record.setAgencia4("");
        record.setConta4("");
        record.setDac4("");
        record.setValor4("");
        record.setAgencia5("");
        record.setConta5("");
        record.setDac5("");
        record.setValor5("");
        record.setAgencia6("");
        record.setConta6("");
        record.setDac6("");
        record.setValor6("");
        record.setAgencia7("");
        record.setConta7("");
        record.setDac7("");
        record.setValor7("");
        record.setAgencia8("");
        record.setConta8("");
        record.setDac8("");
        record.setValor8("");
        record.setAgencia9("");
        record.setConta9("");
        record.setDac9("");
        record.setValor9("");
        record.setAgencia10("");
        record.setConta10("");
        record.setDac10("");
        record.setValor10("");
        record.setAgencia11("");
        record.setConta11("");
        record.setDac11("");
        record.setValor11("");
        record.setAgencia12("");
        record.setConta12("");
        record.setDac12("");
        record.setValor12("");
        record.setAgencia13("");
        record.setConta13("");
        record.setDac13("");
        record.setValor13("");
        record.setAgencia14("");
        record.setConta14("");
        record.setDac14("");
        record.setValor14("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected= "4                    00      109                                                                                                                                                                                                                                                                                                                                                                                ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("Resultado: " + manager.export(record));
    }
}
