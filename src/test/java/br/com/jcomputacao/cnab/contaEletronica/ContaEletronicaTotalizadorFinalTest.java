package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author murilo
 */
public class ContaEletronicaTotalizadorFinalTest {
    
    @Test
    public void test() {
        LineArchetype la = new ContaEletronicaTotalizadorFinal();
        LineModel line = la.createModel();
        String input = "900000000382105437537000137 6201586                  2015010520141210000000003821000000000115+0000000326312                                                                                                                                                                                                                                                   ";
        try {
            line.setRepresentation(input);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(ContaEletronicaTotalizadorFinal.SEQUENCIAL + "\t" + line.getFieldValueNumber(ContaEletronicaTotalizadorFinal.SEQUENCIAL));
            System.out.println(ContaEletronicaTotalizadorFinal.QUANTIDADE_REGISTROS + "\t" + line.getFieldValueNumber(ContaEletronicaTotalizadorFinal.QUANTIDADE_REGISTROS));
            System.out.println(ContaEletronicaTotalizadorFinal.QUANTIDADE_LINHAS + "\t" + line.getFieldValueNumber(ContaEletronicaTotalizadorFinal.QUANTIDADE_LINHAS));
            System.out.println(ContaEletronicaTotalizadorFinal.EMISSAO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaTotalizadorFinal.EMISSAO)));
            System.out.println(ContaEletronicaTotalizadorFinal.VENCIMENTO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaTotalizadorFinal.VENCIMENTO)));
            System.out.println(ContaEletronicaTotalizadorFinal.CONTA_SINAL + "\t" + line.getFieldValueString(ContaEletronicaTotalizadorFinal.CONTA_SINAL));
            System.out.println(ContaEletronicaTotalizadorFinal.CONTA_VALOR  + "\t" + line.getFieldValueNumber(ContaEletronicaTotalizadorFinal.CONTA_VALOR));
            Assert.assertEquals(input, line.getRepresentation().toString());
        } catch (ParseException ex) {
            Logger.getLogger(ContaEletronicaTotalizadorFinalTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("The test case is a prototype.");
        }
    }
}
