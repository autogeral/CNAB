package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteConcessionariasPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 */
public class LineCnabRegistroHeaderLoteConcessionariasPagamentoTest {
    @Test
    public void gerarHeaderLoteConcecionariasPagamento() throws ParseException {
        LineCnabRegistroHeaderLoteConcessionariasPagamento record = new LineCnabRegistroHeaderLoteConcessionariasPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("1");
        record.setTipoOperacao("C");
        record.setTipoPagamento("20");
        record.setFormaPagamento("6");
        record.setLayoutLote("030");
        record.setBrancos1("");
        record.setEmpresaInscricao("2");
        record.setInscricaoNumero("");
        record.setBrancos2("");
        record.setAgencia("");
        record.setBrancos3("");
        record.setConta("");
        record.setBrancos4("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setFinalidadeLote("1");
        record.setHistoricoContaCorrente("");
        record.setEnderecoEmpresa("AV DR OCTAVIANO PEREIRA MENDES");
        record.setNumero("1333");
        record.setComplemento("LOJA");
        record.setCidade("ITU");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setBrancos5("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100011C206 030 2                                                      AUTO GERAL AUTOPECAS LTDA     1                                       AV DR OCTAVIANO PEREIRA MENDES1333 LOJA           ITU                 13301909SP                  ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
        
    }
}