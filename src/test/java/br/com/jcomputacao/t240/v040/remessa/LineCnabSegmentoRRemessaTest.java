package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabSegmentoRRemessaTest {

    public LineCnabSegmentoRRemessaTest() {
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
    public void LineCnabSegmentoRRemessaTest() throws ParseException {
        LineArchetype la = new LineCnab240v040SegmentoRRemessa();
        LineModel lm = la.createModel();
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf2.parse("26062013");

        //01
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.CODIGO_LOTE, 0001);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.SEQUENCIAL_REGISTRO, 000002);
        //04
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.CODIGO_SEGMENTO, null);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.RESERVADO_USO_BANCO, null);
        //06
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.CODIGO_MOVIMENTO_REMESSA, 10);
        //07
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.CODIGO_DESCONTO_2, 1);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.DATA_DESCONTO_2, data);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.VALOR_PERCENTUAL_CONCEDIDO, 10.12);
        //10
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.RESERVADO_USO_BANCO2, null);
        //11
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.CODIGO_MULTA, 9);
        //12
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.DATA_MULTA, data);
        //13
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.VALOR_PERCENTUAL_MULTA, 12.12);
        //14
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.MENSAGEM_3, "                                        ");
        //15
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.MENSAGEM_4, "                                        ");
        //16
        lm.setFieldValue(LineCnab240v040SegmentoRRemessa.RESERVADO, null);
        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

        String expected = "0330001300002R 10126062013010120000000000                        926062013000000000001212                                                                                                                                                       ";

        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
