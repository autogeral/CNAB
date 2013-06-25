package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabTrailerLoteRemessaTest {
    public LineCnabTrailerLoteRemessaTest (){
    
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
    public void LineCnabTrailerLoteRemessaTest (){
        LineArchetype la = new LineCnab240v040TrailerLote();
        LineModel lm = la.createModel();
        
        //01
        lm.setFieldValue(LineCnab240v040TrailerLote.CODIGO_BANCO, "033");
        //02
        lm.setFieldValue(LineCnab240v040TrailerLote.LOTE_SERVICO, 1);
        //03
        lm.setFieldValue(LineCnab240v040TrailerLote.TIPO_REGISTRO, "5");
        //04
        lm.setFieldValue(LineCnab240v040TrailerLote.EXCLUSIVO_FEBRABAN, "         ");
        //05
        lm.setFieldValue(LineCnab240v040TrailerLote.QTDE_REGISTROS_LOTE, 5);
        //06
        lm.setFieldValue(LineCnab240v040TrailerLote.RESERVADO_USO_BANCO, null);
        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

        String expected = "03300015         000005                                                                                                                                                                                                                         ";
        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
