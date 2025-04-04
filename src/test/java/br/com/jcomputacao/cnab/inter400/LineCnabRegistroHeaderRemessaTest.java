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
 * 28.07.2021
 */

 public class LineCnabRegistroHeaderRemessaTest{
     
  @Test
  public void gerarHeaderRemessa() throws ParseException {
      
    LineCnabRegistroHeaderRemessa record = new LineCnabRegistroHeaderRemessa();
    record.setCodigoRegistro("0");
    record.setCodigoRemessa("1");
    record.setLiteralRemessa("REMESS");
    record.setCodigoServico("01");
    record.setLiteralServico("COBRANCA");
    record.setCodigoEmpresa("");
    record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
    record.setCodigoBanco("077");
    record.setNomeBanco("BANCO INTER");
    record.setDataGravacao(280721);
    record.setBranco("");
    record.setSequencialRemessa("000002");
    record.setBrancos("");
    record.setSequencialRegistro("000001");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "01REMESS 01COBRANCA                           AUTO GERAL AUTOPECAS LTDA     077BANCO INTER    280721          000002                                                                                                                                                                                                                                                                                      000001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getCodigoRegistro());
    System.out.println("Código de Remessa: " + record.getCodigoRemessa());
    System.out.println("Literal Remessa: " + record.getLiteralRemessa());
    System.out.println("Código Serviço: " + record.getCodigoServico());
    System.out.println("Literal Serviço: " + record.getLiteralServico());
    System.out.println("Código da Empresa: " + record.getCodigoEmpresa());
    System.out.println("Nome da Empresa: " + record.getNomeEmpresa());
    System.out.println("Código do Banco: " + record.getCodigoBanco());
    System.out.println("Nome do Banco: " + record.getNomeBanco());
    System.out.println("Data da Gravação: " + record.getDataGravacao());
    System.out.println("Branco: " + record.getBranco());   
    System.out.println("Sequencial Remessa: " + record.getSequencialRemessa());
    System.out.println("Brancos: " + record.getBrancos());
    System.out.println("Sequencial Registro: " + record.getSequencialRegistro());
    record.setDataGravacao(280721);
    System.out.println("Resultado: " + manager.export(record));  
  }
}

