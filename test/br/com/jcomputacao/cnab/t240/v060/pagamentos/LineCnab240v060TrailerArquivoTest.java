package br.com.jcomputacao.cnab.t240.v060.pagamentos;

import br.com.jcomputacao.cnab.t240.v060.LineCnab240v060TrailerArquivo;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Murilo
 */
public class LineCnab240v060TrailerArquivoTest {

    public LineCnab240v060TrailerArquivoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() throws ParseException {
        String conteudo = "03399999         000001000019                                                                                                                                                                                                                   ";
        LineCnab240v060TrailerArquivo archetype = new LineCnab240v060TrailerArquivo();
        LineModel model = archetype.createModel();
        model.setRepresentation(conteudo);
        System.out.println("CODIGO_BANCO_COMPENSACAO : " + model.getFieldValue(LineCnab240v060TrailerArquivo.CODIGO_BANCO_COMPENSACAO));
        System.out.println("LOTE_TIPO_REGISTRO       : " + model.getFieldValue(LineCnab240v060TrailerArquivo.LOTE_TIPO_REGISTRO));
        System.out.println("QTDE_CONTAS_CONCIL       : " + model.getFieldValue(LineCnab240v060TrailerArquivo.QTDE_CONTAS_CONCIL));
        System.out.println("QTDE_LOTES_ARQUIVO       : " + model.getFieldValue(LineCnab240v060TrailerArquivo.QTDE_LOTES_ARQUIVO));
        System.out.println("QTDE_REGISTROS_ARQUIVO   : " + model.getFieldValue(LineCnab240v060TrailerArquivo.QTDE_REGISTROS_ARQUIVO));
//        fail("The test case is a prototype.");
    }
}
