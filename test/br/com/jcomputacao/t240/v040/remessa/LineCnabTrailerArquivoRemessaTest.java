package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabTrailerArquivoRemessaTest {

    public LineCnabTrailerArquivoRemessaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void LineCnabTrailerArquivoRemessaTest() {
        LineArchetype la = new LineCnab240v040TrailerArquivo();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040TrailerArquivo.CODIGO_BANCO_COMPENSACAO, "033");
        //02 e 03
        lm.setFieldValue(LineCnab240v040TrailerArquivo.LOTE_TIPO_REGISTRO, "00019");
        //04
        lm.setFieldValue(LineCnab240v040TrailerArquivo.EXCLUSIVO_FEBRABAN, "         ");
        //05
        lm.setFieldValue(LineCnab240v040TrailerArquivo.QTDE_LOTES_ARQUIVO, 10);
        //06
        lm.setFieldValue(LineCnab240v040TrailerArquivo.QTDE_REGISTROS_ARQUIVO, 20);
        //07
        lm.setFieldValue(LineCnab240v040TrailerArquivo.RESERVADO_USO_BANCO, null);

        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

        String expected = "03300019         000010000020                                                                                                                                                                                                                   ";
        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
