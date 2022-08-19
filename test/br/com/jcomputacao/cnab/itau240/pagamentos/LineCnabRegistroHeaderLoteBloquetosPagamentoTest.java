package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteTitulosPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *  10.08.2022
 */
public class LineCnabRegistroHeaderLoteBloquetosPagamentoTest {
    @Test
    public void gerarTrailerLotePagamento() throws ParseException {
        LineCnabRegistroHeaderLoteTitulosPagamento record = new LineCnabRegistroHeaderLoteTitulosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("1");
        record.setTipoOperacao("C");
        record.setTipoPagamento("30");
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
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setFinalidadeLote("01");
        record.setHistoricoContaCorrente("0000000000");
        record.setEnderecoEmpresa("Av. Dr. Otaviano Pereira Mendes");
        record.setNumero("1333");
        record.setComplemento("Loja");
        record.setCidade("ITU");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setBrancos5("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100011C301 030 205437537000137                                        AUTO GERAL AUTOPECAS LTDA     01                            0000000000Av. Dr. Otaviano Pereira Mende1333 Loja           ITU                 13301909SP                  ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
    
}
