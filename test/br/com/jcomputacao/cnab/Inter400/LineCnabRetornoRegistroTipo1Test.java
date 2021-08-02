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
 *    02.08.21
 */

public class LineCnabRetornoRegistroTipo1Test {
  @Test
  public void gerarHeaderRetorno() throws ParseException {
      
    LineCnabRetornoRegistroTipo1 record = new LineCnabRetornoRegistroTipo1();
    record.setStringCodigoRegistro("1");
    record.setStringtipoInscricao("02");
    record.setStringnumeroInscricao("");
    record.setStringzeros1("000");
    record.setStringidentificacaoEmpresa("1120001126152233");
    record.setStringcontroleParticipante("");
    record.setStringzeros2("0000000");
    record.setStringnossoNumero1("");
    record.setStringbranco1("");
    record.setStringcarteira("112");
    record.setStringidentificacaoOcorrencia("");
    record.setStringdataOcorrencia("020821");
    record.setStringseuNumero(""); 
    record.setStringnossoNumero2(""); 
    record.setStringdataVencimentoTitulo("150821");
    record.setStringvalorTitulo(" 150,00");
    record.setStringbancoCobrador("077");
    record.setStringagenciaCobradora("0001");
    record.setStringespecieTitulo("99");
    record.setStringbranco2("");
    record.setStringvalorPago("");
    record.setStringdataCredito("");
    record.setStringbranco3("");
    record.setStringnomePagador("Auto Geral AutoPecas LTDA.");
    record.setStringbranco4("");
    record.setStringinscricaoPagador("");
    record.setStringmotivoOcorrencia("");
    record.setStringbranco5("");
    record.setStringsequencialRegistro("000006");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "102              0001120001126152233                          0000000                 112  020821                     150821 150,00      077000199                                   Auto Geral AutoPecas LTDA.                                                                                                                                                                                           000006";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getStringCodigoRegistro());
    System.out.println("Tipo de inscrição da empresa: " + record.getStringtipoInscricao());
    System.out.println("Nº Inscrição da empresa: " + record.getStringnumeroInscricao());
    System.out.println("Zeros: " + record.getStringzeros1());
    System.out.println("Identificação da empresa: " + record.getStringidentificacaoEmpresa());
    System.out.println("NºControle participante: " + record.getStringcontroleParticipante());
    System.out.println("Zeros: " + record.getStringzeros2());
    System.out.println("Identificação do título no banco: " + record.getStringnossoNumero1());
    System.out.println("Campo em branco: " + record.getStringbranco1());
    System.out.println("Carteira: " + record.getStringcarteira());
    System.out.println("Identificação de ocorrência: " + record.getStringidentificacaoOcorrencia());   
    System.out.println("Data de ocorrência: " + record.getStringdataOcorrencia());
    System.out.println("Nº documento: " + record.getStringseuNumero());
    System.out.println("Identificação do título no inter: " + record.getStringnossoNumero2());
    System.out.println("Data vencimento do título: " + record.getStringdataVencimentoTitulo());
    System.out.println("Valor do título: " + record.getStringvalorTitulo());
    System.out.println("Banco cobrador: " + record.getStringbancoCobrador());
    System.out.println("Agência cobradora Registro: " + record.getStringagenciaCobradora());
    System.out.println("Espécie do título: " + record.getStringespecieTitulo());
    System.out.println("Campo em branco: " + record.getStringbranco2());
    System.out.println("Valor pago: " + record.getStringvalorPago());
    System.out.println("Data do crédito: " + record.getStringdataCredito());
    System.out.println("Campo em branco: " + record.getStringbranco3());
    System.out.println("Nome do pagador: " + record.getStringnomePagador());
    System.out.println("Campo em branco: " + record.getStringbranco4());
    System.out.println("Nº inscrição´pagador: " + record.getStringinscricaoPagador());
    System.out.println("Motivos de rejeições: " + record.getStringmotivoOcorrencia());
    System.out.println("Campo em branco: " + record.getStringbranco5());
    System.out.println("Sequencial Registro: " + record.getStringsequencialRegistro());
   
    System.out.println("Resultado: " + manager.export(record));  
  }
}
