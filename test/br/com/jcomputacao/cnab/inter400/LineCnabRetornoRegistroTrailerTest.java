/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;
import br.com.jcomputacao.cnab.inter400.LineCnabRetornoRegistroTrailer;
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
public class LineCnabRetornoRegistroTrailerTest {
  @Test
  public void gerarHeaderRetorno() throws ParseException {
      
    LineCnabRetornoRegistroTrailer record = new LineCnabRetornoRegistroTrailer();
    record.setStringCodigoRegistro("9");
    record.setStringcodigoRetorno("2");
    record.setStringtipoRegisro("01");
    record.setStringcodigoBanco("077");
    record.setStringbranco1("");
    record.setStringqtdRegistros1("");
    record.setStringbranco2("");
    record.setStringqtdRegistros2("");
    record.setStringvalorRegistros1("");
    record.setStringbranco3("");
    record.setStringqtdRegistros3("");
    record.setStringbranco4("");
    record.setStringqtdRegistros4(""); 
    record.setStringvalorRegistros2(""); 
    record.setStringbranco5("");
    record.setStringsequencialRegistro("000007");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "9201077                                                                                                                                                                                                                                                                                                                                                                                                   000007";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nIdentificação d Registro: " + record.getStringCodigoRegistro());
    System.out.println("Identificação do retorno: " + record.getStringcodigoRetorno());
    System.out.println("Identificação tipo registro: " + record.getStringtipoRegisro());
    System.out.println("Código do banco: " + record.getStringcodigoBanco());
    System.out.println("Campo em branco: " + record.getStringbranco1());
    System.out.println("Quantidade de registros no arquivo: " + record.getStringqtdRegistros1());
    System.out.println("Campo em branco: " + record.getStringbranco2());
    System.out.println("Quantidade de registros: " + record.getStringqtdRegistros2());
    System.out.println("Valor dos registros: " + record.getStringvalorRegistros1());
    System.out.println("Campo em branco: " + record.getStringbranco3());
    System.out.println("Quantidade dos registros: " + record.getStringqtdRegistros3());   
    System.out.println("Campo em branco: " + record.getStringbranco4());
    System.out.println("Quantidade dos registros: " + record.getStringqtdRegistros4());
    System.out.println("Valor dos registros: " + record.getStringvalorRegistros2());
    System.out.println("Campo em branco: " + record.getStringbranco5());
    System.out.println("Nºsequencial do registro: " + record.getStringsequencialRegistro());
   
    System.out.println("Resultado: " + manager.export(record));  
  }
}
