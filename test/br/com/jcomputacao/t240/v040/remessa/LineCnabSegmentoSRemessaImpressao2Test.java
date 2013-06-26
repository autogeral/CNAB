package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabSegmentoSRemessaImpressao2Test {
    public LineCnabSegmentoSRemessaImpressao2Test() {
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
    public void LineCnabSegmentoSRemessaImpressao2Test() {
        LineArchetype la = new LineCnab240v040SegmentoRRemessaImpressao2();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.CODIGO_LOTE, 4444);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.TIPO_REGISTRO, 3);
        //04
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.SEQUENCIAL_REGISTRO, 5);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.CODIGO_SEGMENTO, "S");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.CODIGO_MOVIMENTO_REMESSA, 66);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.TIPO_IMPRESSAO, 2);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.MENSAGEM_5, "MENSAGEM_5                    MENSAGEM_5");
        //10
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.MENSAGEM_6, "MENSAGEM_6                    MENSAGEM_6");
        //11
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.MENSAGEM_7, "MENSAGEM_7                    MENSAGEM_7");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.MENSAGEM_8, null);
        //13
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.MENSAGEM_9, null);
        //14
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao2.RESERVADO_USO_BANCO, null);
        
        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);
        
        String expected = "0334444300005S 662MENSAGEM_5                    MENSAGEM_5MENSAGEM_6                    MENSAGEM_6MENSAGEM_7                    MENSAGEM_7                                                                                                      ";
        
        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
