package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    25.08.2021
 */

public class LineCnabRegistroHeaderRemessaTest {
    
    @Test
    public void gerarHeaderRemessa() throws ParseException {
        LineCnabRegistroHeaderRemessa record = new LineCnabRegistroHeaderRemessa();
        record.setTipoRegistro("0");
        record.setCodigoOperacao("1");
        record.setLiteralRemessa("REMESSA");
        record.setCodigoServico("01");
        record.setLiteralServico("COBRANCA");
        record.setAgencia("");
        record.setZeros("00");
        record.setDac("");
        record.setBrancos1("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setCodigoBanco("341");
        record.setNomeBanco("BANCO ITAU SA");
        record.setDataGeracao("250821");
        record.setBrancos2("");
        record.setNumeroSequencial("000001");
    
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "01REMESSA01COBRANCA           00              AUTO GERAL AUTOPECAS LTDA     341BANCO ITAU SA  250821                                                                                                                                                                                                                                                                                                      000001";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nTipo de Registro: " + record.getTipoRegistro());
        System.out.println("Operacao:" + record.getCodigoOperacao());
        System.out.println("Literal Remessa: " + record.getLiteralRemessa());
        System.out.println("Código do Serviço: " + record.getCodigoServico());
        System.out.println("Literal de Serviço: " + record.getLiteralServico());
        System.out.println("Agência : " + record.getAgencia());
        System.out.println("Zeros: " + record.getConta());
        System.out.println("DAC: " + record.getDac());
        System.out.println("Brancos: " + record.getBrancos1());
        System.out.println("Nome da Empresa: " + record.getNomeEmpresa());
        System.out.println("Código do Banco: " + record.getCodigoBanco());
        System.out.println("Nome do Banco: " + record.getNomeBanco());
        System.out.println("Data de Geração : " + record.getDataGeracao());
        System.out.println("Brancos: " + record.getBrancos2());
        System.out.println("Número Sequencial: " + record.getNumeroSequencial());
        
        System.out.println("\nResultado: " + manager.export(record));
        
        
    }
}
