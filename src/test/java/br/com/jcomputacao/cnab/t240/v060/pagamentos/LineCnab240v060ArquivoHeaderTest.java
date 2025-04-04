package br.com.jcomputacao.cnab.t240.v060.pagamentos;

import br.com.jcomputacao.cnab.t240.v060.LineCnab240v060ArquivoHeader;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Murilo
 */
public class LineCnab240v060ArquivoHeaderTest {

    @Test
    public void testSomeMethod() throws ParseException {
        String content = "03300000         2054375370001370033006500490028050300065 0000480000414 AUTO GERAL DE ITU LTDA        BANCO SANTANDER                         12210201216523900001206000000                                        G4016PF00528               G4";
        LineCnab240v060ArquivoHeader archetype = new LineCnab240v060ArquivoHeader();
        LineModel model = archetype.createModel();
        model.setRepresentation(content);
        Date dthrGeracao = model.getFieldValueDate(LineCnab240v060ArquivoHeader.DATA_GERACAO_ARQUIVO);

        System.out.println("Data/Hora arquivo : " + DateFormat.getDateTimeInstance().format(dthrGeracao));
        assertEquals(content, model.getRepresentation().toString());
        if (!content.equals(model.getRepresentation().toString())) {
            fail("Resultado diferente do experado");
        }
    }
}
