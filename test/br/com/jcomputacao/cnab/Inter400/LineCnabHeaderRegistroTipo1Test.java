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
 * 29.07.21
 */
public class LineCnabHeaderRegistroTipo1Test {
    
  @Test
  public void gerarHeader() throws ParseException {
      
    LineCnabHeaderRegistroTipo1 record = new LineCnabHeaderRegistroTipo1();
    record.setStringCodigoRegistro("1");
    record.setStringbranco1("");
    record.setStringcarteira("1120001");
    record.setStringcontroleParticipante("");
    record.setStringbranco2("");
    record.setStringmulta("");
    record.setStringvalorMulta("");
    record.setStringpercentualMulta("");
    record.setStringdataMulta("");
    record.setStringnossoNumero("0000000000");
    record.setStringBranco3("");
    record.setSStringidentificacaoOcorrencia("RE");
    record.setStringnumeroDocumento("");
    record.setStringdataVencimentoTitulo("010821");
    record.setStringvalorTitulo("150");
    record.setStringdataLimitePagamento("30");
    record.setStringbranco4("");
    record.setStringespecieTitulo("99");
    record.setStringcodigoIdentificacao("N");
    record.setStringdataEmissaoTitulo("290721");
    record.setStringbranco5("");
    record.setStringjurosMora("");
    record.setStringvalorAtraso("");
    record.setStringpercentualAtraso("");
    record.setStringdataMora("");
    record.setStringdescontos("");
    record.setStringvalorDescontos1("");
    record.setStringpercentualDesconto1("");
    record.setStringdataLimiteConcessao("");
    record.setStringvalorAbtimentoConcessao("");
    record.setStringtipoPagador("02");
    record.setStringinscricaoPagador("");
    record.setStringnomePagador("Auto Geral AutoPecas LTDA");
    record.setStringenderecoPagador("Av Dr Otaviano Mendes 1333 Centro Itu");
    record.setStringcepPagador("13310");
    record.setStringsufixoCep("160");
    record.setStringmenssagem1("");
    record.setStrinsequencialRegistro(" 00001");
 
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "1                   1120001                                                              0000000000         RE          010821150          30      99N290721                                                                02              Auto Geral AutoPecas LTDA               Av Dr Otaviano Mendes 1333 Centro Itu   13310160                                                                       00001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getStringCodigoRegistro());
    System.out.println("Campo em branco: " + record.getStringbranco1());
    System.out.println("Carteira: " + record.getStringcarteira());
    System.out.println("Uso livre da empresa: " + record.getStringcontroleParticipante());
    System.out.println("Campo Branco: " + record.getStringbranco2());
    System.out.println("Campo de Multa: " + record.getStringmulta());
    System.out.println("Valor da Multa: " + record.getStringvalorMulta());
    System.out.println("Percentual da Multa: " + record.getStringpercentualMulta());
    System.out.println("Data da Multa: " + record.getStringdataMulta());
    System.out.println("Nosso número: " + record.getStringnossoNumero());
    System.out.println("Campo em Branco: " + record.getStringbranco3());
    System.out.println("Identificação de ocorrência: " + record.getStringidentificacaoOcorrencia());
    System.out.println("Seu número: " + record.getStringnumeroDocumento());
    System.out.println("Data vencimento do Titulo: " + record.getStringdataVencimentoTitulo());
    System.out.println("Valor do Titulo: " + record.getStringvalorTitulo());
    System.out.println("Data limite de Pagamento: " + record.getStringdataLimitePagamento());
    System.out.println("Campo em branco: " + record.getStringbranco4());
    System.out.println("Especie do Titulo: " + record.getStringespecieTitulo());
    System.out.println("Identificação: " + record.getStringcodigoIdentificacao());
    System.out.println("Data emissão do Titulo: " + record.getStringdataEmissaoTitulo());
    System.out.println("Campo em branco: " + record.getStringbranco5());
    System.out.println("Campo de juros/mora: " + record.getStringjurosMora());
    System.out.println("Valor cobrado por atraso: " + record.getStringvalorAtraso());
    System.out.println("Percentual cobrado por atraso: " + record.getStringpercentualAtraso());
    System.out.println("Data da Mora: " + record.getStringdataMora());
    System.out.println("Campo de Descontos: " + record.getStringdescontos());
    System.out.println("Valor de Desconto 1: " + record.getStringvalorDescontos1());
    System.out.println("Percentual de Desconto 1: " + record.getStringpercentualDesconto1());
    System.out.println("Data limite para concessão desconto 1: " + record.getStringdataLimiteConcessao());
    System.out.println("Valor do abatimento: " + record.getStringvalorAbtimentoConcessao());
    System.out.println("Tipo de Pagador: " + record.getStringtipoPagador());
    System.out.println("Inscrição do Pagador: " + record.getStringinscricaoPagador());
    System.out.println("Nome do Pagador: " + record.getStringnomePagador());
    System.out.println("Endereço do Pagador: " + record.getStringenderecoPagador());
    System.out.println("CEP do Pagador: " + record.getStringcepPagador());
    System.out.println("Sufixo do CEP: " + record.getStringsufixoCep());
    System.out.println("Menssagem 1: " + record.getStringmenssagem1());
    System.out.println("N° sequencial de registro: " + record.getStrinsequencialRegistro());
    System.out.println("\nResultado: " + manager.export(record));  
  }
}
