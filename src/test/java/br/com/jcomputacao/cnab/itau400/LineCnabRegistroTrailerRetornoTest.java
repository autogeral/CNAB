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
 *    27.08.2021
 */
public class LineCnabRegistroTrailerRetornoTest {
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroTrailerRetorno record = new LineCnabRegistroTrailerRetorno();
        record.setTipoRegistro("9");
        record.setCodigoRetorno("2");
        record.setCodigoServico("01");
        record.setCodigoBanco("341");
        record.setBrancos1("");
        record.setQtdTitulos1("");
        record.setValorTotal1("");
        record.setAvisoBancario1("");
        record.setBrancos2("");
        record.setQtdTitulos2("");
        record.setValorTotal2("");
        record.setAvisoBancario2("");
        record.setBrancos3("");
        record.setValorTotal3("");
        record.setValorTotal3("");
        record.setAvisoBancario3("");
        record.setControleArquivo("");
        record.setQtdDetalhes("");
        record.setValorTotalInformado("");
        record.setBrancos4("");
        record.setNumeroSequencial("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "9201341                                                                                                                                                                                                                                                                                                                                                                                                         ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
          
    }
    
}
