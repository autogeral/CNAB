/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;
import br.com.jcomputacao.cnab.inter400.LineCnabRetornoRegistroTipo1;
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
    record.setCodigoRegistroTipo("1");
    record.setTiipoInscricao("02");
    record.setNumeroInscricao("");
    record.setZeros1("000");
    record.setIdentificacaoEmpresa("1120001126152233");
    record.setControleParticipante("");
    record.setZeros2("0000000");
    record.setNossoNumero1("");
    record.setBrancoTipo1("");
    record.setCarteira("112");
    record.setIdentificacaoOcorrencia("");
    record.setDataOcorrencia("020821");
    record.setSeuNumero(""); 
    record.setNossoNumero2(""); 
    record.setDataVencimentoTitulo("150821");
    record.setValorTitulo(" 150,00");
    record.setBancoCobrador("077");
    record.setAgenciaCobradora("0001");
    record.setEspecieTitulo("99");
    record.setBrancoTipo2("");
    record.setValorPago("");
    record.setDataCredito("");
    record.setBranco3("");
    record.setNomePagador("Auto Geral AutoPecas LTDA.");
    record.setBranco4("");
    record.setInscricaoPagador("");
    record.setMotivoOcorrencia("");
    record.setBranco5("");
    record.setSequencialRegistroTipo("000006");
    
    
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "102              0001120001126152233                          0000000                 112  020821                     150821 150,00      077000199                                   Auto Geral AutoPecas LTDA.                                                                                                                                                                                           000006";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getCodigoRegistroTipo());
    System.out.println("Tipo de inscrição da empresa: " + record.getTipoInscricao());
    System.out.println("Nº Inscrição da empresa: " + record.getNumeroInscricao());
    System.out.println("Zeros: " + record.getZeros1());
    System.out.println("Identificação da empresa: " + record.getIdentificacaoEmpresa());
    System.out.println("NºControle participante: " + record.getControleParticipante());
    System.out.println("Zeros: " + record.getZeros2());
    System.out.println("Identificação do título no banco: " + record.getNossoNumero1());
    System.out.println("Campo em branco: " + record.getBrancoTipo1());
    System.out.println("Carteira: " + record.getCarteira());
    System.out.println("Identificação de ocorrência: " + record.getIdentificacaoOcorrencia());   
    System.out.println("Data de ocorrência: " + record.getDataOcorrencia());
    System.out.println("Nº documento: " + record.getSeuNumero());
    System.out.println("Identificação do título no inter: " + record.getNossoNumero2());
    System.out.println("Data vencimento do título: " + record.getDataVencimentoTitulo());
    System.out.println("Valor do título: " + record.getValorTitulo());
    System.out.println("Banco cobrador: " + record.getBancoCobrador());
    System.out.println("Agência cobradora Registro: " + record.getAgenciaCobradora());
    System.out.println("Espécie do título: " + record.getEspecieTitulo());
    System.out.println("Campo em branco: " + record.getBrancoTipo2());
    System.out.println("Valor pago: " + record.getValorPago());
    System.out.println("Data do crédito: " + record.getDataCredito());
    System.out.println("Campo em branco: " + record.getBranco3());
    System.out.println("Nome do pagador: " + record.getNomePagador());
    System.out.println("Campo em branco: " + record.getBranco4());
    System.out.println("Nº inscrição´pagador: " + record.getInscricaoPagador());
    System.out.println("Motivos de rejeições: " + record.getMotivoOcorrencia());
    System.out.println("Campo em branco: " + record.getBranco5());
    System.out.println("Sequencial Registro: " + record.getSequencialRegistroTipo());
   
    System.out.println("Resultado: " + manager.export(record));  
  }
}
