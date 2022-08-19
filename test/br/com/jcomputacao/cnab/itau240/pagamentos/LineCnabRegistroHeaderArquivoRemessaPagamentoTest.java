package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderRemessaPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    09.08.2022
 */
public class LineCnabRegistroHeaderArquivoRemessaPagamentoTest {
  
    @Test
    public void gerarHeaderRemessaPagamento() throws ParseException {
        LineCnabRegistroHeaderRemessaPagamento record = new LineCnabRegistroHeaderRemessaPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0000");
        record.setTipoRegistro("0");
        record.setBrancos1("");
        record.setLayoutArquivo("081");
        record.setEmpresaInscricao("2");
        record.setInscricaoNumero("05437537000137");
        record.setBrancos2("");
        record.setAgencia("");
        record.setBrancos3("");
        record.setContaC("");
        record.setBrancos4("");
        record.setDac("");
        record.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        record.setNomeBanco("BANCO ITAU SA");
        record.setBrancos5("");
        record.setArquivoCodigo("1");
        record.setDataGeracao("09082022");
        record.setHoraGeracao("163820");
        record.setZeros("000000000");
        record.setUnidadeDensidade("00000");
        record.setBrancos6("");
          
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100000      081205437537000137                                        AUTO GERAL AUTOPECAS LTDA     BANCO ITAU SA                           10908202216382000000000000000                                                                     ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
      }
}
