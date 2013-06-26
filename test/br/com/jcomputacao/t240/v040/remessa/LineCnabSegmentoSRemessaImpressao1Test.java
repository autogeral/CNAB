package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabSegmentoSRemessaImpressao1Test {

    public LineCnabSegmentoSRemessaImpressao1Test() {
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
    public void LineCnabSegmentoSRemessaImpressao1() {
        LineArchetype la = new LineCnab240v040SegmentoRRemessaImpressao1();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_LOTE, 4444);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.TIPO_REGISTRO, 3);
        //04
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.SEQUENCIAL_REGISTRO, 5);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_SEGMENTO, "S");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_MOVIMENTO_REMESSA, 66);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.TIPO_IMPRESSAO, 1);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.NUMERO_LINHA_IMPRESSA, 22);
        //10
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.MENSAGEM_PARA_RECIBO_SACADO, 4);
        //11
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.MENSAGEM_IMPRESSA, "Jennifer Santos");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.RESERVADO_USO_BANCO, null);
        
        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);
        
        String expected = "0334444300005S 661224Jennifer Santos                                                                                                                                                                                                            ";
        
        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
