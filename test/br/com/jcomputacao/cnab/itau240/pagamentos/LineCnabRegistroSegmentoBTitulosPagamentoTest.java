package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBTitulosPagamento;
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
public class LineCnabRegistroSegmentoBTitulosPagamentoTest {
    @Test
    public void gerarSegmentoBTitulosPagamento() throws ParseException {
        LineCnabRegistroSegmentoBTitulosPagamento record = new LineCnabRegistroSegmentoBTitulosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("B");
        record.setBrancos1("");
        record.setEmpresaInscricao("2");
        record.setNumeroInscricao("05437537000137");
        record.setEndereco("AV DR OCTAVIANO MENDES");
        record.setNumero("1333");
        record.setComplemento("LOJA");
        record.setBairro("CENTRO");
        record.setCidade("ITU");
        record.setCep("13301909");
        record.setEstado("SP");
        record.setEmail("LARISSA@AUTOGERAL.COM.BR");
        record.setBrancos2("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001B   205437537000137AV DR OCTAVIANO MENDES        1333 LOJA           CENTRO         ITU                 13301909SPLARISSA@AUTOGERAL.COM.BR                                                                                         ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
