package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author murilo
 */
public class ContaEletronicaServicoTest {
    
    @BeforeClass
    public static void setUp() {
        System.setProperty("fileGenerator.debug", "true");
    }
    
    @Test
    public void test() {
        LineArchetype la = new ContaEletronicaServico();
        LineModel line = la.createModel();
        String input = "4000000003805201501052014121089553900030006430789          11947252866 _ QChat Direct         00000                                                                      000000      MENRádio Nextel                                                             -000000000000000000                                                                          ";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            line.setRepresentation(input);
            System.out.println(ContaEletronicaServico.EMISSAO + "\t" + sdf.format(line.getFieldValueDate(ContaEletronicaServico.EMISSAO)));
            System.out.println(ContaEletronicaServico.RECURSO_CARACTERISTICA + "\t" + line.getFieldValueString(ContaEletronicaServico.RECURSO_CARACTERISTICA));
            System.out.println(ContaEletronicaServico.SERVICO_CATEGORIA_GRUPO + "\t" + line.getFieldValueString(ContaEletronicaServico.SERVICO_CATEGORIA_GRUPO));
            System.out.println(ContaEletronicaServico.SERVICO_CATEGORIA_GRUPO_DESCRICAO + "\t" + line.getFieldValueString(ContaEletronicaServico.SERVICO_CATEGORIA_GRUPO_DESCRICAO));
            System.out.println(ContaEletronicaServico.SERVICO_CATEGORIA + "\t" + line.getFieldValueString(ContaEletronicaServico.SERVICO_CATEGORIA));
            System.out.println(ContaEletronicaServico.SERVICO_CATEGORIA_DESCRICAO + "\t" + line.getFieldValueString(ContaEletronicaServico.SERVICO_CATEGORIA_DESCRICAO));
            System.out.println(ContaEletronicaServico.TELEFONE_NUMERO + "\t" + line.getFieldValueString(ContaEletronicaServico.DDD)+line.getFieldValueString(ContaEletronicaServico.TELEFONE_NUMERO));
            System.out.println(ContaEletronicaServico.SERVICO_VALOR_SINAL + "\t" + line.getFieldValueString(ContaEletronicaServico.SERVICO_VALOR_SINAL));
            System.out.println(ContaEletronicaServico.VALOR_COM_IMPOSTOS  + "\t" + line.getFieldValueNumber(ContaEletronicaServico.VALOR_COM_IMPOSTOS));
            Assert.assertEquals(input, line.getRepresentation().toString());
        } catch (ParseException ex) {
            Logger.getLogger(ContaEletronicaServicoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
