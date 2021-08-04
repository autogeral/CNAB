/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;

import br.com.jcomputacao.cnab.inter400.LineCnabRegistroHeaderRetorno;
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
    record.setCodigoRegistro("0");
    record.setStringcodigoRetorno("2");
    record.setStringliteralRetorno("RETORNO");
    record.setStringCodigoServico("01");
    record.setStringLiteralServico("COBRANCA");
    record.setBranco1("");
    record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA.");
    record.setCodigoBanco("077");
    record.setNomeBanco("INTER");
    record.setDataGravacao(300721);
    record.setBranco2("");
    record.setSequencialRegistro("000001");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "02RETORNO01COBRANCA                           AUTO GERAL AUTOPECAS LTDA.    077INTER          300721                                                                                                                                                                                                                                                                                                      000001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getCodigoRegistro());
    System.out.println("Código de Retorno: " + record.getIntegercodigoRetorno());
    System.out.println("Literal Retorno: " + record.getStringliteralRetorno());
    System.out.println("Código Serviço: " + record.getStringCodigoServico());
    System.out.println("Literal Serviço: " + record.getStringLiteralServico());
    System.out.println("Campo em branco: " + record.getBranco1());
    System.out.println("Nome da Empresa: " + record.getNomeEmpresa());
    System.out.println("Código do Banco: " + record.getCodigoBanco());
    System.out.println("Nome do Banco: " + record.getNomeBanco());
    System.out.println("Data da Gravação: " + record.getDataGravacao());
    System.out.println("Campo em branco: " + record.getBranco2());   
    System.out.println("Sequencial Registro: " + record.getSequencialRegistro());
    System.out.println("Resultado: " + manager.export(record));  
  }
}

