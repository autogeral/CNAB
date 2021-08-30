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
        record.setBrancos1("");
        record.setCodigoInscricao("2");
        record.setInscricaoNumero("");
        record.setBrancos2("");
        record.setZeros2("0");
        record.setAgencia("");
        record.setBrancos3("");
        record.setZeros2("0000000");
        record.setConta("");
        record.setBrancos4("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setNomeBanco("BANCO ITAU SA");
        record.setBrancos5("");
        record.setCodigoArquivo("1");
        record.setDataGeracao("30082021");
        record.setHoraGeracao("123115");
        record.setNumSeqArquivoRetorno("");
        record.setLayoutArquivo("040");
        record.setZeros3("");
        record.setBranco6("");
        record.setZeros4("");
        record.setBrancos7("");
        
         FixedFormatManager manager = new FixedFormatManagerImpl();
         String expected = "34100000         2                                        0000000       AUTO GERAL AUTOPECAS LTDA     BANCO ITAU SA                           130082021123115      040                                                                          ";
         System.out.println(expected);
         String result = manager.export(record);
         System.out.println(result);
         assertEquals(expected, result);
         assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
         
    } 
}
