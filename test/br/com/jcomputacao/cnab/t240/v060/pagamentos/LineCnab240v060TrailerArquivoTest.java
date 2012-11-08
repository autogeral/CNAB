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
 * @author murilodemoraestuvani
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
        fail("The test case is a prototype.");
    }
}
