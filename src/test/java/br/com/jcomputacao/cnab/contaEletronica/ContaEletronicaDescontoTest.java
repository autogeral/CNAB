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
public class ContaEletronicaDescontoTest {
    
    @Test
    public void test() {
        System.setProperty("fileGenerator.debug", "true");
        String input = "50000000085762015020520150110                         6201586                  00000            CRDServiços mensais - Cobrança Indevida/Incorreta                                  -0000000000000000000000000096900201412100000002015010900000000000                                                                                                          ";
        testInput(input);
    }
    
    private void testInput(String input) {
        LineArchetype la = new ContaEletronicaDesconto();
        LineModel line = la.createModel();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
            line.setRepresentation(input);
            System.out.println(ContaEletronicaDesconto.EMISSAO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaDesconto.EMISSAO)));
            System.out.println(ContaEletronicaDesconto.ACERTO_INICIO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaDesconto.ACERTO_INICIO)));
            System.out.println(ContaEletronicaDesconto.ACERTO_FIM + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaDesconto.ACERTO_FIM)));
            System.out.println(ContaEletronicaDesconto.IDENTIFICADOR_UNICO_RECURSO + "\t" + line.getFieldValueString(ContaEletronicaDesconto.IDENTIFICADOR_UNICO_RECURSO));
            System.out.println(ContaEletronicaDesconto.TELEFONE_NUMERO + "\t" + line.getFieldValueString(ContaEletronicaDesconto.DDD)+line.getFieldValueString(ContaEletronicaDesconto.TELEFONE_NUMERO));
            System.out.println(ContaEletronicaDesconto.VALOR_SINAL + "\t" + line.getFieldValueString(ContaEletronicaDesconto.VALOR_SINAL));
            System.out.println(ContaEletronicaDesconto.VALOR_BASE  + "\t" + line.getFieldValueNumber(ContaEletronicaDesconto.VALOR_BASE));
            System.out.println(ContaEletronicaDesconto.VALOR_LIQUIDO  + "\t" + line.getFieldValueNumber(ContaEletronicaDesconto.VALOR_LIQUIDO));

            Assert.assertEquals(input, line.getRepresentation().toString());
        } catch (ParseException ex) {
            Logger.getLogger(ContaEletronicaDescontoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
