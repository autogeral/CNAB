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
 */
public class LineCnabRetornoRegistroTrailerTest {
  @Test
  public void gerarHeaderRetorno() throws ParseException {
      
    LineCnabRetornoRegistroTrailer record = new LineCnabRetornoRegistroTrailer();
    record.setCodigoRegistroTrailer("9");
    record.setCodigoRetornoTrailer("2");
    record.setTipoRegistroTrailer("01");
    record.setCodigoBancoTrailer("077");
    record.setBrancoTrailer("");
    record.setQtdRegistros1Trailer("");
    record.setBrancoTrailer2("");
    record.setQtdRegistros2Trailer("");
    record.setValorRegistros1Trailer("");
    record.setBrancoTrailer3("");
    record.setQtdRegistros3Trailer("");
    record.setBrancoTrailer4("");
    record.setQtdRegistros4Trailer(""); 
    record.setValorRegistros2Trailer(""); 
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
    System.out.println("Identificação tipo registro: " + record.getTipoRegistroTrailer());
    System.out.println("Código do banco: " + record.getCodigoBancoTrailer());
    System.out.println("Campo em branco: " + record.getBrancoTrailer());
    System.out.println("Quantidade de registros no arquivo: " + record.getQtdRegistros1Trailer());
    System.out.println("Campo em branco: " + record.getBrancoTrailer2());
    System.out.println("Quantidade de registros: " + record.getQtdRegistros2Trailer());
    System.out.println("Valor dos registros: " + record.getValorRegistros1Trailer());
    System.out.println("Campo em branco: " + record.getBrancoTrailer3());
    System.out.println("Quantidade dos registros: " + record.getQtdRegistros3Trailer());   
    System.out.println("Campo em branco: " + record.getBrancoTrailer4());
    System.out.println("Quantidade dos registros: " + record.getQtdRegistros4Trailer());
    System.out.println("Valor dos registros: " + record.getValorRegistros2Trailer());
    System.out.println("Campo em branco: " + record.getBrancoTrailer5());
    System.out.println("Nºsequencial do registro: " + record.getSequencialRegistroTrailer());
   
    System.out.println("\nResultado: " + manager.export(record));  
  }
}
