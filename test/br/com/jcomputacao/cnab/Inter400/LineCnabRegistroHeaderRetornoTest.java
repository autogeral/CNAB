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
 *    30.07.21
 */

public class LineCnabRegistroHeaderRetornoTest {
    
  @Test
  public void gerarHeaderRetorno() throws ParseException {
      
    LineCnabRegistroHeaderRetorno record = new LineCnabRegistroHeaderRetorno();
    record.setStringCodigoRegistro("0");
    record.setStringcodigoRetorno("2");
    record.setStringliteralRetorno("RETORNO");
    record.setStringCodigoServico("01");
    record.setStringLiteralServico("COBRANCA");
    record.setStringbranco1("");
    record.setStringNomeEmpresa("AUTO GERAL AUTOPECAS LTDA.");
    record.setStringCodigoBanco("077");
    record.setStringNomeBanco("INTER");
    record.setIntegerDataGravacao(300721);
    record.setStringBranco2("");
    record.setStringSequencialRegistro("000001");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "02RETORNO01COBRANCA                           AUTO GERAL AUTOPECAS LTDA.    077INTER          300721                                                                                                                                                                                                                                                                                                      000001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getIntegerCodigoRegistro());
    System.out.println("Código de Retorno: " + record.getIntegercodigoRetorno());
    System.out.println("Literal Retorno: " + record.getStringliteralRetorno());
    System.out.println("Código Serviço: " + record.getStringCodigoServico());
    System.out.println("Literal Serviço: " + record.getStringLiteralServico());
    System.out.println("Campo em branco: " + record.getStringbranco1());
    System.out.println("Nome da Empresa: " + record.getStringNomeEmpresa());
    System.out.println("Código do Banco: " + record.getStringCodigoBanco());
    System.out.println("Nome do Banco: " + record.getStringNomeBanco());
    System.out.println("Data da Gravação: " + record.getIntegerDataGravacao());
    System.out.println("Campo em branco: " + record.getStringBranco2());   
    System.out.println("Sequencial Registro: " + record.getStringSequencialRegistro());
    System.out.println("Resultado: " + manager.export(record));  
  }
}

