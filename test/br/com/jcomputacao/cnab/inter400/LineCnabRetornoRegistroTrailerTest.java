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
    record.setCodigoRegistroTrailer("9");
    record.setCodigoRetornoTrailer("2");
    record.setStringtipoRegisro("01");
    record.setCodigoBancoTrailer("077");
    record.setBrancoTrailer("");
    record.setStringqtdRegistros1("");
    record.setBrancoTrailer2("");
    record.setStringqtdRegistros2("");
    record.setStringvalorRegistros1("");
    record.setBrancoTrailer3("");
    record.setStringqtdRegistros3("");
    record.setBrancoTrailer4("");
    record.setStringqtdRegistros4(""); 
    record.setStringvalorRegistros2(""); 
    record.setBrancoTrailer5("");
    record.setSequencialRegistroTrailer("000007");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "9201077                                                                                                                                                                                                                                                                                                                                                                                                   000007";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nIdentificação d Registro: " + record.getCodigoRegistroTrailer());
    System.out.println("Identificação do retorno: " + record.getCodigoRetornoTrailer());
    System.out.println("Identificação tipo registro: " + record.getStringtipoRegisro());
    System.out.println("Código do banco: " + record.getCodigoBancoTrailer());
    System.out.println("Campo em branco: " + record.getBrancoTrailer());
    System.out.println("Quantidade de registros no arquivo: " + record.getStringqtdRegistros1());
    System.out.println("Campo em branco: " + record.getBrancoTrailer2());
    System.out.println("Quantidade de registros: " + record.getStringqtdRegistros2());
    System.out.println("Valor dos registros: " + record.getStringvalorRegistros1());
    System.out.println("Campo em branco: " + record.getBrancoTrailer3());
    System.out.println("Quantidade dos registros: " + record.getStringqtdRegistros3());   
    System.out.println("Campo em branco: " + record.getBrancoTrailer4());
    System.out.println("Quantidade dos registros: " + record.getStringqtdRegistros4());
    System.out.println("Valor dos registros: " + record.getStringvalorRegistros2());
    System.out.println("Campo em branco: " + record.getBrancoTrailer5());
    System.out.println("Nºsequencial do registro: " + record.getSequencialRegistroTrailer());
   
    System.out.println("Resultado: " + manager.export(record));  
  }
}
