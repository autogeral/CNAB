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
public class ContaEletronicaBilhetacaoTest {
    
    @Test
    public void test() {
        System.setProperty("fileGenerator.debug", "true");
        String input = "30000000000952015010520141210000807043264360               1178698485  DRT59 Especial   20141110     Nextel S Paulo             0 0 Nextel Telecomunicao     551177561404  000005DLCDentro Local                                      0933061*Inico                    00+00000000000000002700000                                                             ";
        testInput(input);
        input = "30000000001092015020520150110000821129875360               1177223596  Rádio Internaci  20141212     São Paulo Cel              0 0 Nextel Telecomunicaç    5511989967222  000024DLCDentro Local                                      0819031*Único                    00-00000000000000000000000";
        testInput(input);
    }
    
    private void testInput(String input) {
        LineArchetype la = new ContaEletronicaBilhetacao();
        LineModel line = la.createModel();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdft = new SimpleDateFormat("HH:mm:ss");
            line.setRepresentation(input);
            System.out.println(ContaEletronicaBilhetacao.EMISSAO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaBilhetacao.EMISSAO)));
            System.out.println(ContaEletronicaBilhetacao.CHAMADA_DATA + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaBilhetacao.CHAMADA_DATA)));
            System.out.println(ContaEletronicaBilhetacao.CHAMADA_HORARIO + "\t" + sdft.format(line.getFieldValueDate(ContaEletronicaBilhetacao.CHAMADA_HORARIO)));
            System.out.println(ContaEletronicaBilhetacao.CHAMADA_TELEFONE + "\t" + line.getFieldValueString(ContaEletronicaBilhetacao.CHAMADA_TELEFONE));
            System.out.println(ContaEletronicaBilhetacao.CHAMADA_CLASSE_SERVICO + "\t" + line.getFieldValueNumber(ContaEletronicaBilhetacao.CHAMADA_CLASSE_SERVICO));
            System.out.println(ContaEletronicaBilhetacao.CHAMADA_LOCALIDADE_CNL + "\t" + line.getFieldValueString(ContaEletronicaBilhetacao.CHAMADA_LOCALIDADE_CNL));
            System.out.println(ContaEletronicaBilhetacao.TELEFONE_NUMERO + "\t" + line.getFieldValueString(ContaEletronicaBilhetacao.DDD)+line.getFieldValueString(ContaEletronicaBilhetacao.TELEFONE_NUMERO));
            System.out.println(ContaEletronicaBilhetacao.CHAMADA_DURACAO + "\t" + line.getFieldValueNumber(ContaEletronicaBilhetacao.CHAMADA_DURACAO));
            System.out.println(ContaEletronicaBilhetacao.VALOR_COM_IMPOSTOS + "\t" + line.getFieldValueString(ContaEletronicaBilhetacao.CHAMADA_VALOR_SINAL)+line.getFieldValueNumber(ContaEletronicaBilhetacao.VALOR_COM_IMPOSTOS));

            Assert.assertEquals(input, line.getRepresentation().toString());
        } catch (ParseException ex) {
            Logger.getLogger(ContaEletronicaBilhetacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
