package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoJ52Pagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   10.08.2022
 */
public class LineCnabRegistroSegmentoJ52PagamentoTest {
    @Test
    public void gerarSegmentoJ52Pagamento() throws ParseException {
        LineCnabRegistroSegmentoJ52Pagamento record = new LineCnabRegistroSegmentoJ52Pagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("J");
        record.setTipoMovimento("");
        record.setCodigoRegistro("52");
        record.setTipoInscricaoPagador("2");
        record.setNumeroInscricaoPagador("");
        record.setNomePagador("");
        record.setTipoInscricaoBeneficiario("");
        record.setNumeroInscricaoBeneficiario("");
        record.setNomeBeneficiario("");
        record.setTipoInscricaoSacador("");
        record.setNumeroInscricaoSacador("");
        record.setNomeSacador("");
        record.setBrancos("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001J   522                                                                                                                                                                                                                            ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
    }
}
