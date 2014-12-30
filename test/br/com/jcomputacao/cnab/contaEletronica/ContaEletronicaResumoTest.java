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
public class ContaEletronicaResumoTest {

    @Test
    public void testSomeMethod() {
        System.setProperty("fileGenerator.debug", "true");

        LineArchetype la = new ContaEletronicaResumo();
        LineModel line = la.createModel();
        String input = "10000000000026201586                  2015010520141210001805204266360               Itu                      1177178203  SME SERVICO MOVEL ESPECIALIZADO        Rádio Controle                            2014120520141209     0000001+0000000000000+0000000000336  +0000000000000+0000000000000137949      +0000000002497                                    ";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            line.setRepresentation(input);

            System.out.println(ContaEletronicaResumo.NUMERO_NOTA_FISCAL + "\t" + line.getFieldValueString(ContaEletronicaResumo.NUMERO_NOTA_FISCAL));
            System.out.println(ContaEletronicaResumo.EMISSAO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaResumo.EMISSAO)));
            System.out.println(ContaEletronicaResumo.VENCIMENTO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaResumo.VENCIMENTO)));
            System.out.println(ContaEletronicaResumo.TELEFONE_NUMERO + "\t" + line.getFieldValueString(ContaEletronicaResumo.DDD) + line.getFieldValueString(ContaEletronicaResumo.TELEFONE_NUMERO));
            System.out.println(ContaEletronicaResumo.ASSINATURA_SINAL + "\t" + line.getFieldValueString(ContaEletronicaResumo.ASSINATURA_SINAL) + line.getFieldValueNumber(ContaEletronicaResumo.ASSINATURA_VALOR));
            System.out.println(ContaEletronicaResumo.CONSUMO_VALOR + "\t" + line.getFieldValueString(ContaEletronicaResumo.CONSUMO_SINAL) + line.getFieldValueNumber(ContaEletronicaResumo.CONSUMO_VALOR));

            Assert.assertEquals(input, line.getRepresentation().toString());
        } catch (ParseException ex) {
            Logger.getLogger(ContaEletronicaResumoTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
