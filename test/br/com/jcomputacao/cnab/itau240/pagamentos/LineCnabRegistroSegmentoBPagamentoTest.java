package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 * 10.08.2022
 */
public class LineCnabRegistroSegmentoBPagamentoTest {
     @Test
    public void gerarSegmentoBPagamento() throws ParseException {
        //Para Pagamentos através de cheque, OP, DOC, TED e crédito em conta corrente
        LineCnabRegistroSegmentoBPagamento record = new LineCnabRegistroSegmentoBPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setCodigoSegmento("B");
        record.setBrancos1("");
        record.setEmpresaInscricao("2");
        record.setNumInscricao("05437537000137");
        record.setEndereco("Av. Dr. Otaviano Pereira Mendes");
        record.setNumeroLocal("1333");
        record.setComplemento("Loja");
        record.setBairro("Centro");
        record.setCidade("Itu");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setEmail("larissa.antunes@autogeral.com.br");
        record.setBrancos2("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "34100013     B   205437537000137Av. Dr. Otaviano Pereira Mende1333 Loja           Centro         Itu                 13301909SPlarissa.antunes@autogeral.com.br                                                                                 ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
    }
}
