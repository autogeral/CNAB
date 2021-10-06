package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *      30.07.21
 */

public class LineCnabHeaderRegistroTrailerTest {
  
  @Test
  public void gerarHeader() throws ParseException {
      
    LineCnabHeaderRegistroTrailer record = new LineCnabHeaderRegistroTrailer();
    record.setIdentificacaoRegistroTrailer("9");
    record.setQtdBoletosTrailer("");
    record.setBrancoTrailer("");
    record.setSequencialRegistroTrailer("000005");
 
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "9                                                                                                                                                                                                                                                                                                                                                                                                         000005";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nIdentificação de Registro: " + record.getIdentificacaoRegistroTrailer());
    System.out.println("Quantidade de Boletos: " + record.getQtdBoletosTrailer());
    System.out.println("Campo em Branco: " + record.getBrancoTrailer());
    System.out.println("Nº Sequencial Registto 4: " + record.getSequencialRegistroTrailer());
    System.out.println("\nResultado: " + manager.export(record));  
  } 
}
