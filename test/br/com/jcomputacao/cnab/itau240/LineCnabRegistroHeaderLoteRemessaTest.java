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
 *      27.08.2021
 */

public class LineCnabRegistroHeaderLoteRemessaTest {
    @Test
    public void gerarLote() throws ParseException {
        LineCnabRegistroHeaderLoteRemessa record = new LineCnabRegistroHeaderLoteRemessa();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("1");
        record.setOperacao("R");
        record.setCodigoServico("01");
        record.setZeros1("");
        record.setLayoutLote("030");
        record.setBrancos1("");
        record.setCodigoInscricao("2");
        record.setInscricaoNumero("");
        record.setBrancos2("");
        record.setZeros2("0");
        record.setAgencia("");
        record.setBrancos3("");
        record.setZeros3("0000000");
        record.setConta("");
        record.setBrancos4("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setBrancos5("BRANCOS");
        record.setNumSeqArquivoRet("");
        record.setDataGravacao("27082021");
        record.setDataCredito("");
        record.setBrancos6("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "341    1R01  030 2                                   0     0000000       AUTO GERAL AUTOPECAS LTDA     BRANCOS                                                                                 27082021                                         ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));   
    }
}
