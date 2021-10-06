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
 * 30.07.21
 */

public class LineCnabHeaderRegistroTipo2Test {
    
 @Test
  public void gerarHeader() throws ParseException {
      
    LineCnabHeaderRegistroTipo2 record = new LineCnabHeaderRegistroTipo2();
    record.seTipoRegistro("2");
    record.setMenssagem2(" Menssagem livre(Opcional)");
    record.setMenssagem3(" Menssagem livre(Opcional)");
    record.setMenssagem4(" Menssagem livre(Opcional)");
    record.setMenssagem5(" Menssagem livre(Opcional)");
    record.setDataLimiteConcessaoDesconto2("300721");
    record.setValorDesconto2("");
    record.setPercentualDesconto2("");
    record.setBranco1("");
    record.setDataLimiteConcessaoDesconto3("010821");
    record.setValorDesconto("");
    record.setPercentualDesconto("");
    record.setBranco2("");
    record.setNossoNumero("00000000000");
    record.setBranco3("");
    record.setSequencialRegistro("000003");
 
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "2 Menssagem livre(Opcional)                                                     Menssagem livre(Opcional)                                                     Menssagem livre(Opcional)                                                     Menssagem livre(Opcional)                                                    300721                           010821                           00000000000    000003";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nTipo de Registro: " + record.getTipoRegistro());
    System.out.println("Menssagem 2: " + record.getMenssagem2());
    System.out.println("Menssagem 3: " + record.getMenssagem3());
    System.out.println("Menssagem 4: " + record.getMenssagem4());
    System.out.println("Menssagem 5: " + record.getMenssagem5());
    System.out.println("Data limite para concessão desconto 2: " + record.getDataLimiteConcessaoDesconto2());
    System.out.println("Valor do desconto 2: " + record.getValorDesconto2());
    System.out.println("Percentual do desconto 2: " + record.getPercentualDesconto2());
    System.out.println("Campo em branco: " + record.getBranco1());
    System.out.println("Data limite para concessão desconto 3: " + record.getDataLimiteConcessaoDesconto3());
    System.out.println("Valor de desconto 3: " + record.getValorDesconto());
    System.out.println("Percentual de desconto 3: " + record.getPercentualDesconto());
    System.out.println("Campo em branco: " + record.getBranco2());
    System.out.println("Nosso número: " + record.getNossoNumero());
    System.out.println("Campo em branco: " + record.getBranco3());
    System.out.println("Nº sequencia de registro: " + record.getSequencialRegistro());
    System.out.println("\nResultado: " + manager.export(record));  
  }
}

