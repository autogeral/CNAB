package br.com.jcomputacao.cnab.inter400;

import br.com.jcomputacao.cnab.inter400.LineCnabHeaderRegistroTipo1;
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
    record.setCodigoRegistro("1");
    record.setBranco1("");
    record.setCarteira("1120001");
    record.setControleParticipante("");
    record.setBranco2("");
    record.setMulta("");
    record.setValorMulta("");
    record.setPercentualMulta("");
    record.setDataMulta("");
    record.setNossoNumero("0000000000");
    record.setBranco3("");
    record.setIdentificacaoOcorrencia("RE");
    record.setNumeroDocumento("");
    record.setDataVencimentoTitulo("010821");
    record.setValorTitulo("150");
    record.setDataLimitePagamento("30");
    record.setBranco4("");
    record.setEspecieTitulo("99");
    record.setCodigoIdentificacao("N");
    record.setDataEmissaoTitulo("290721");
    record.setBranco5("");
    record.setJurosMora("");
    record.setValorAtraso("");
    record.setPercentualAtraso("");
    record.setDataMora("");
    record.setDescontos("");
    record.setValorDescontos1("");
    record.setPercentualDesconto1("");
    record.setDataLimiteConcessao("");
    record.setValorAbatimentoConcessao("");
    record.setTipoPagador("02");
    record.setInscricaoPagador("");
    record.setNomePagador("Auto Geral AutoPecas LTDA");
    record.setEnderecoPagador("Av Dr Otaviano Mendes 1333 Centro Itu");
    record.setCepPagador("13310");
    record.setSufixoCep("160");
    record.setMenssagem1("");
    record.setSequencialRegistro(" 00001");
 
    FixedFormatManager manager = new FixedFormatManagerImpl();
    String expected = "1                   1120001                                                              0000000000         RE          010821150          30      99N290721                                                                02              Auto Geral AutoPecas LTDA               Av Dr Otaviano Mendes 1333 Centro Itu   13310160                                                                       00001";
    System.out.println(expected);
    String result = manager.export(record);
    System.out.println(result);
    assertEquals(expected, result);
    assertTrue (result.contains(""));
    
    System.out.println("\nCódigo de Registro: " + record.getCodigoRegistro());
    System.out.println("Campo em branco: " + record.getBranco1());
    System.out.println("Carteira: " + record.getCarteira());
    System.out.println("Uso livre da empresa: " + record.getControleParticipante());
    System.out.println("Campo Branco: " + record.getBranco2());
    System.out.println("Campo de Multa: " + record.getMulta());
    System.out.println("Valor da Multa: " + record.getValorMulta());
    System.out.println("Percentual da Multa: " + record.getPercentualMulta());
    System.out.println("Data da Multa: " + record.getDataMulta());
    System.out.println("Nosso número: " + record.getNossoNumero());
    System.out.println("Campo em Branco: " + record.getBranco3());
    System.out.println("Identificação de ocorrência: " + record.getIdentificacaoOcorrencia());
    System.out.println("Seu número: " + record.getNumeroDocumento());
    System.out.println("Data vencimento do Titulo: " + record.getDataVencimentoTitulo());
    System.out.println("Valor do Titulo: " + record.getValorTitulo());
    System.out.println("Data limite de Pagamento: " + record.getDataLimitePagamento());
    System.out.println("Campo em branco: " + record.getBranco4());
    System.out.println("Especie do Titulo: " + record.getEspecieTitulo());
    System.out.println("Identificação: " + record.getCodigoIdentificacao());
    System.out.println("Data emissão do Titulo: " + record.getDataEmissaoTitulo());
    System.out.println("Campo em branco: " + record.getBranco5());
    System.out.println("Campo de juros/mora: " + record.getJurosMora());
    System.out.println("Valor cobrado por atraso: " + record.getValorAtraso());
    System.out.println("Percentual cobrado por atraso: " + record.getPercentualAtraso());
    System.out.println("Data da Mora: " + record.getDataMora());
    System.out.println("Campo de Descontos: " + record.getDescontos());
    System.out.println("Valor de Desconto 1: " + record.getValorDescontos1());
    System.out.println("Percentual de Desconto 1: " + record.getPercentualDesconto1());
    System.out.println("Data limite para concessão desconto 1: " + record.getDataLimiteConcessao());
    System.out.println("Valor do abatimento: " + record.getValorAbatimentoConcessao());
    System.out.println("Tipo de Pagador: " + record.getTipoPagador());
    System.out.println("Inscrição do Pagador: " + record.getInscricaoPagador());
    System.out.println("Nome do Pagador: " + record.getNomePagador());
    System.out.println("Endereço do Pagador: " + record.getEnderecoPagador());
    System.out.println("CEP do Pagador: " + record.getCepPagador());
    System.out.println("Sufixo do CEP: " + record.getSufixoCep());
    System.out.println("Menssagem 1: " + record.getMenssagem1());
    System.out.println("N° sequencial de registro: " + record.getSequencialRegistro());
    System.out.println("\nResultado: " + manager.export(record));  
  }
}
