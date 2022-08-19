package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoDPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    10082022
 */
public class LineCnabRegistroSegmentoDPagamentoTest {
   @Test
    public void gerarSegmentoDPagamento() throws ParseException {
       LineCnabRegistroSegmentoDPagamento record = new LineCnabRegistroSegmentoDPagamento();
       record.setCodigoBanco("341");
       record.setCodigoLote("0001");
       record.setTipoRegistro("3");
       record.setNumRegistro("00001");
       record.setCodigoSegmento("D");
       record.setBrancos1("");
       record.setPeriodoCompetencia("062022");
       record.setCentroCusto("");
       record.setCodigoFuncionario("");
       record.setCargo("Desenvolvedor Trainee");
       record.setPeriodoFeriasDe("");
       record.setPeriodoFeriaAte("");
       record.setDependenteIR("");
       record.setDependentesSF("2");
       record.setHorasSemanais("09");
       record.setSalarioContribuicao("");
       record.setFgts("000000000000000");
       record.setValorCreditos("000000000000000");
       record.setValorDebito("000000000000000");
       record.setValorLiquido("000000000000000");
       record.setValorFixoBase("000000000000000");
       record.setBaseCalculoIRRF("000000000000000");
       record.setBaseCalculoFGTS("000000000000000");
       record.setDisponibilizacaoHolerite("00");
       record.setBrancos2("");
       record.setOcorrencias("");
       
       
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001D   062022                              Desenvolvedor Trainee                           2 09               00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000             ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
}
