package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLotePagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *  09.08.2022
 */
public class LineCnabRegistroHeaderLotePagamentoTest {
    @Test
    public void gerarHeaderLotePagamento() throws ParseException {
        LineCnabRegistroHeaderLotePagamento record = new LineCnabRegistroHeaderLotePagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("1");
        record.setTipoOperacao("C");
        record.setTipoPagamento("30");
        record.setFormaPagamento("1");
        record.setLayoutLote("040");
        record.setBrancos1("");
        record.setEmpresaInscricao("1");
        record.setInscricaoNumero("05437537000137");
        record.setIdentificacaoLancamento("1707");
        record.setBrancos2("");
        record.setConta("");
        record.setBrancos3("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setFinalidadeLote("01");
        record.setHistoricoContaCorrente("");
        record.setEnderecoEmpresa("Av Dr Otaviano Pereira Mendes");
        record.setNumeroLocal("1333");
        record.setComplemento("Loja");
        record.setCidade("Itu");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setBrancos5("");
        record.setOcorrencias("");
      
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100011C301 040 1054375370001371707                                    AUTO GERAL AUTOPECAS LTDA     01                                      Av Dr Otaviano Pereira Mendes 1333 Loja           Itu                 13301909SP                  ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        System.out.println("\nResultado: " + manager.export(record));
    }
}
