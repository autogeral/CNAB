package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteTributosPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   11.08.2022
 */
public class LineCnabRegistroHeaderLoteTributosPagamentoTest {
    @Test
    public void gerarHeaderLoteTributosPagamento() throws ParseException { 
        LineCnabRegistroHeaderLoteTributosPagamento record = new LineCnabRegistroHeaderLoteTributosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("1");
        record.setTipoOperacao("C");
        record.setTipoPagamento("");
        record.setFormaPagamento("1");
        record.setLayoutLote("030");
        record.setBrancos1("");
        record.setEmpresaInscricao("2");
        record.setInscricaoNumero("05437537000137");
        record.setBrancos2("");
        record.setAgencia("");
        record.setBrancos3("");
        record.setConta("");
        record.setBrancos4("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERA AUTOPECAS LTDA");
        record.setFinalidadeLote("");
        record.setHistoricoContaCorrente("0000000000");
        record.setEnderecoEmpresa("AV DR OCTAVIANO PEREIRA MENDES");
        record.setNumero("1333");
        record.setComplemento("LOJA");
        record.setCidade("ITU");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setBrancos5("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100011C  1 030 205437537000137                                        AUTO GERA AUTOPECAS LTDA                                    0000000000AV DR OCTAVIANO PEREIRA MENDES1333 LOJA           ITU                 13301909SP                  ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
