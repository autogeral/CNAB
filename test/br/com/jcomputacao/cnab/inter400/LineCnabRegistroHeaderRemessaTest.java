/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;

import br.com.jcomputacao.cnab.inter400.LineCnabRegistroHeaderRemessa;
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
    record.setStringCodigoRegistro("0");
    record.setStringCodigoRemessa("1");
    record.setStringLiteralRemessa("REMESS");
    record.setStringCodigoServico("01");
    record.setStringLiteralServico("COBRANCA");
    record.setStringCodigoEmpresa("");
    record.setStringNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
    record.setStringCodigoBanco("077");
    record.setStringNomeBanco("BANCO INTER");
    record.setIntegerDataGravacao(280721);
    record.setStringBranco("");
    record.setSStringSequencialRemessa("000002");
    record.setStringBrancos("");
    record.setStringSequencialRegistro("000001");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "01REMESS 01COBRANCA                           AUTO GERAL AUTOPECAS LTDA     077BANCO INTER    280721          000002                                                                                                                                                                                                                                                                                      000001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getIntegerCodigoRegistro());
    System.out.println("Código de Remessa: " + record.getIntegerCodigoRemessa());
    System.out.println("Literal Remessa: " + record.getStringLiteralRemessa());
    System.out.println("Código Serviço: " + record.getStringCodigoServico());
    System.out.println("Literal Serviço: " + record.getStringLiteralServico());
    System.out.println("Código da Empresa: " + record.getStringCodigoEmpresa());
    System.out.println("Nome da Empresa: " + record.getStringNomeEmpresa());
    System.out.println("Código do Banco: " + record.getStringCodigoBanco());
    System.out.println("Nome do Banco: " + record.getStringNomeBanco());
    System.out.println("Data da Gravação: " + record.getIntegerDataGravacao());
    System.out.println("Branco: " + record.getStringBranco());   
    System.out.println("Sequencial Remessa: " + record.getStringSequencialRemessa());
    System.out.println("Brancos: " + record.getStringBrancos());
    System.out.println("Sequencial Registro: " + record.getStringSequencialRegistro());
    record.setIntegerDataGravacao(280721);
    System.out.println("Resultado: " + manager.export(record));  
  }
}

