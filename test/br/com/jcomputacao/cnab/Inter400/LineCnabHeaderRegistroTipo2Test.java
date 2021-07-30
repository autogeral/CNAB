/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.Inter400;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 * 30.07.21
 */

public class LineCnabHeaderRegistroTipo2Test {
    
 @Test
  public void gerarHeader() throws ParseException {
      
    LineCnabHeaderRegistroTipo2 record = new LineCnabHeaderRegistroTipo2();
    record.setStringtipoRegistro("2");
    record.setStringmenssagem2(" Menssagem livre(Opcional)");
    record.setStringmenssagem3(" Menssagem livre(Opcional)");
    record.setStringmenssagem4(" Menssagem livre(Opcional)");
    record.setStringmenssagem5(" Menssagem livre(Opcional)");
    record.setStringdataLimiteConcessaoDesconto2("300721");
    record.setStringvalorDesconto2("");
    record.setStringpercentualDesconto2("");
    record.setStringbranco1("");
    record.setSStringdataLimiteConcessaoDesconto3("010821");
    record.setStringvalorDesconto("");
    record.setStringpercentualDesconto("");
    record.setStringBranco2("");
    record.setStringnossoNumero("00000000000");
    record.setStringBranco3("");
    record.setStrinsequencialRegistro("000003");
 
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "2 Menssagem livre(Opcional)                                                     Menssagem livre(Opcional)                                                     Menssagem livre(Opcional)                                                     Menssagem livre(Opcional)                                                    300721                           010821                           00000000000    000003";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nTipo de Registro: " + record.getStringtipoRegistro());
    System.out.println("Menssagem 2: " + record.getStringmenssagem2());
    System.out.println("Menssagem 3: " + record.getStringmenssagem3());
    System.out.println("Menssagem 4: " + record.getStringmenssagem4());
    System.out.println("Menssagem 5: " + record.getStringmenssagem5());
    System.out.println("Data limite para concessão desconto 2: " + record.getStringdataLimiteConcessaoDesconto2());
    System.out.println("Valor do desconto 2: " + record.getStringvalorDesconto2());
    System.out.println("Percentual do desconto 2: " + record.getStringpercentualDesconto2());
    System.out.println("Campo em branco: " + record.getStringbranco1());
    System.out.println("Data limite para concessão desconto 3: " + record.getStringdataLimiteConcessaoDesconto3());
    System.out.println("Valor de desconto 3: " + record.getStringvalorDesconto());
    System.out.println("Percentual de desconto 3: " + record.getStringpercentualDesconto());
    System.out.println("Campo em branco: " + record.getStringbranco2());
    System.out.println("Nosso número: " + record.getStringnossoNumero());
    System.out.println("Campo em branco: " + record.getStringbranco3());
    System.out.println("Nº sequencia de registro: " + record.getStrinsequencialRegistro());
    System.out.println("\nResultado: " + manager.export(record));  
  }
}

