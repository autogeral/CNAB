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
 *    30.07.21
 */

public class LineCnabRegistroHeaderRetornoTest {
    
  @Test
  public void gerarHeaderRetorno() throws ParseException {
      
    LineCnabRegistroHeaderRetorno record = new LineCnabRegistroHeaderRetorno();
    record.setCodigoRegistroHeaderRetorno("0");
    record.setCodigoRetorno("2");
    record.setLiteralRetorno("RETORNO");
    record.setCodigoServicoRetorno("01");
    record.setLiteralServicoRetorno("COBRANCA");
    record.setBranco1Retorno("");
    record.setNomeEmpresaRetorno("AUTO GERAL AUTOPECAS LTDA.");
    record.setCodigoBancoRetorno("077");
    record.setNomeBancoRetorno("INTER");
    record.setDataGravacaoRetorno(300721);
    record.setBranco2Retorno("");
    record.setSequencialRegistroRetorno("000001");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "02RETORNO01COBRANCA                           AUTO GERAL AUTOPECAS LTDA.    077INTER          300721                                                                                                                                                                                                                                                                                                      000001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getCodigoRegistroHeaderRetorno());
    System.out.println("Código de Retorno: " + record.getCodigoRetorno());
    System.out.println("Literal Retorno: " + record.getLiteralRetorno());
    System.out.println("Código Serviço: " + record.getCodigoServicoRetorno());
    System.out.println("Literal Serviço: " + record.getLiteralServicoRetorno());
    System.out.println("Campo em branco: " + record.getBranco1Retorno());
    System.out.println("Nome da Empresa: " + record.getNomeEmpresaRetorno());
    System.out.println("Código do Banco: " + record.getCodigoBancoRetorno());
    System.out.println("Nome do Banco: " + record.getNomeBancoRetorno());
    System.out.println("Data da Gravação: " + record.getDataGravacaoRetorno());
    System.out.println("Campo em branco: " + record.getBranco2Retorno());   
    System.out.println("Sequencial Registro: " + record.getSequencialRegistroRetorno());
    System.out.println("Resultado: " + manager.export(record));  
  }
}

