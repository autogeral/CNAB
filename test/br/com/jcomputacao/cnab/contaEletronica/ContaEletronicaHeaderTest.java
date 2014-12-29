package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author murilo
 */
public class ContaEletronicaHeaderTest {

    @Test
    public void test() {
        LineArchetype la = new ContaEletronicaHeader();
        LineModel line = la.createModel();
        String input = "000000000000120141219NEXTEL         SP05437537000137 AUTO GERAL DE ITU LTDA                  05437537000137 6201586                  2015010520141210                                                                                                                                                                                                         ";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            line.setRepresentation(input);
            System.out.println(ContaEletronicaHeader.DATA_GERACAO_ARQUIVO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaHeader.DATA_GERACAO_ARQUIVO)));
            System.out.println(ContaEletronicaHeader.CLIENTE_NOME + "\t" + line.getFieldValueString(ContaEletronicaHeader.CLIENTE_NOME));
            System.out.println(ContaEletronicaHeader.OPERADORA_IDENTIFICACAO + "\t" + line.getFieldValueString(ContaEletronicaHeader.OPERADORA_IDENTIFICACAO));
            Assert.assertEquals(input, line.getRepresentation().toString());
        } catch (ParseException ex) {
            Logger.getLogger(ContaEletronicaHeaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
