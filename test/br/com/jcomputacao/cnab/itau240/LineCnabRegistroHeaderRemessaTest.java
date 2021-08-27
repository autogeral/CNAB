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
 */
public class LineCnabRegistroHeaderRemessaTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroHeaderRemessa record = new LineCnabRegistroHeaderRemessa();
        record.setCodigoBanco("341");
        record.setCodigoLote("0000");
        record.setTipoRegistro("0");
        record.setBrancos1("BRANCOS");
        record.setCodigoInscricao("1");
        record.setInscricaoNumero("");
        record.setBrancos2("BRANCOS");
        record.setZeros2("0");
        record.setAgencia("");
        record.setBrancos3("");
        record.setZeros2("0000000");
        record.setConta("");
        record.setBrancos4("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setNomeBanco("BANCO ITAU SA");
        record.setBrancos5("BRANCOS");
        record.setCodigoArquivo("1");
        record.setDataGeracao("27082021");
        record.setHoraGeracao("");
        record.setNumSeqArquivoRetorno("");
        record.setLayoutArquivo("040");
        record.setZeros3("");
        record.setBranco6("BRANCOS");
        record.setZeros4("");
        record.setBrancos7("BRANCOS");
        
         FixedFormatManager manager = new FixedFormatManagerImpl();
         String expected = "34100000BRANCOS  1              BRANCOS                   0000000       AUTO GERAL AUTOPECAS LTDA     BANCO ITAU SA                 BRANCOS   127082021            040     BRANCOS                                                  BRANCOS     ";
         System.out.println(expected);
         String result = manager.export(record);
         System.out.println(result);
         assertEquals(expected, result);
         assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
         
    } 
}
