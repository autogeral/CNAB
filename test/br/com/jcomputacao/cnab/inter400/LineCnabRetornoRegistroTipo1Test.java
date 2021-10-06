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
 *    02.08.21
 */

public class LineCnabRetornoRegistroTipo1Test {
  @Test
  public void gerarHeaderRetorno() throws ParseException {
      
    LineCnabRetornoRegistroTipo1 record = new LineCnabRetornoRegistroTipo1();
    record.setCodigoRegistroTipo("1");
    record.setTipoInscricao("02");
    record.setNumeroInscricaoTipo("");
    record.setZeros1Tipo("000");
    record.setIdentificacaoEmpresaTipo("1120001126152233");
    record.setControleParticipanteTipo("");
    record.setZeros2Tipo("0000000");
    record.setNossoNumero1Tipo("");
    record.setBrancoTipo1("");
    record.setCarteiraTipo("112");
    record.setIdentificacaoOcorrenciaTipo("");
    record.setDataOcorrenciaTipo("020821");
    record.setSeuNumeroTipo(""); 
    record.setNossoNumero2Tipo(""); 
    record.setDataVencimentoTituloTipo("150821");
    record.setValorTituloTipo(" 150,00");
    record.setBancoCobradorTipo("077");
    record.setAgenciaCobradoraTipo("0001");
    record.setEspecieTituloTipo("99");
    record.setBrancoTipo2("");
    record.setValorPagoTipo("");
    record.setDataCreditoTipo("");
    record.setBranco3Tipo("");
    record.setNomePagadorTipo("Auto Geral AutoPecas LTDA.");
    record.setBranco4Tipo("");
    record.setInscricaoPagadorTipo("");
    record.setMotivoOcorrenciaTipo("");
    record.setBranco5Tipo("");
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
    System.out.println("Nº Inscrição da empresa: " + record.getNumeroInscricaoTipo());
    System.out.println("Zeros: " + record.getZeros1Tipo());
    System.out.println("Identificação da empresa: " + record.getIdentificacaoEmpresaTipo());
    System.out.println("NºControle participante: " + record.getControleParticipanteTipo());
    System.out.println("Zeros: " + record.getZeros2Tipo());
    System.out.println("Identificação do título no banco: " + record.getNossoNumero1Tipo());
    System.out.println("Campo em branco: " + record.getBrancoTipo1());
    System.out.println("Carteira: " + record.getCarteiraTipo());
    System.out.println("Identificação de ocorrência: " + record.getIdentificacaoOcorrenciaTipo());   
    System.out.println("Data de ocorrência: " + record.getDataOcorrenciaTipo());
    System.out.println("Nº documento: " + record.getSeuNumeroTipo());
    System.out.println("Identificação do título no inter: " + record.getNossoNumero2Tipo());
    System.out.println("Data vencimento do título: " + record.getDataVencimentoTituloTipo());
    System.out.println("Valor do título: " + record.getValorTituloTipo());
    System.out.println("Banco cobrador: " + record.getBancoCobradorTipo());
    System.out.println("Agência cobradora Registro: " + record.getAgenciaCobradoraTipo());
    System.out.println("Espécie do título: " + record.getEspecieTituloTipo());
    System.out.println("Campo em branco: " + record.getBrancoTipo2());
    System.out.println("Valor pago: " + record.getValorPagoTipo());
    System.out.println("Data do crédito: " + record.getDataCreditoTipo());
    System.out.println("Campo em branco: " + record.getBranco3Tipo());
    System.out.println("Nome do pagador: " + record.getNomePagadorTipo());
    System.out.println("Campo em branco: " + record.getBranco4Tipo());
    System.out.println("Nº inscrição´pagador: " + record.getInscricaoPagadorTipo());
    System.out.println("Motivos de rejeições: " + record.getMotivoOcorrenciaTipo());
    System.out.println("Campo em branco: " + record.getBranco5Tipo());
    System.out.println("Sequencial Registro: " + record.getSequencialRegistroTipo());
   
    System.out.println("Resultado: " + manager.export(record));  
  }
}
