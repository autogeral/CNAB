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
public class LineCnabHeaderLoteRemessaTest {

    public LineCnabHeaderLoteRemessaTest() {
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
    public void LineCnabHeaderHeaderLoteRemessaTest() throws ParseException {
        LineArchetype la = new LineCnab240v040HeaderLote();
        LineModel lm = la.createModel();
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf2.parse("26062013");

        //01
        lm.setFieldValue(LineCnab240v040HeaderLote.CODIGO_BANCO, "033");
        //02
        lm.setFieldValue(LineCnab240v040HeaderLote.NUMERO_LOTE, 1010);
        //03
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_REGISTRO, "1");
        //04
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_OPERACAO, "R");
        //05
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_SERVICO, 1);
        //06
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO, "  ");
        //07
        lm.setFieldValue(LineCnab240v040HeaderLote.VERSAO_LAYOUT, 30);
        //08
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO2, " ");
        //09
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_INSCRICAO, 2);
        //10
        lm.setFieldValue(LineCnab240v040HeaderLote.NUMERO_INSCRICAO, 10276553000125L);
        //11
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO3, "                    ");
        //12
        lm.setFieldValue(LineCnab240v040HeaderLote.CODIGO_TRASMISSAO, 6500005534372L);
        //13
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO4, "     ");
        //14
        lm.setFieldValue(LineCnab240v040HeaderLote.NOME_CEDENTE, "Jennifer Saraiva Santos");
        //15
        lm.setFieldValue(LineCnab240v040HeaderLote.MENSAGEM_1, "Mensagem 1");
        //16
        lm.setFieldValue(LineCnab240v040HeaderLote.MENSAGEM_2, "Mensagem 2");
        //17
        lm.setFieldValue(LineCnab240v040HeaderLote.NUMERO_REMESSA_RETORNO, 1);
        //18
        lm.setFieldValue(LineCnab240v040HeaderLote.DATA_GRAVACAO_REMESSA_RETORNO, data);
        //19
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO5, "                                         ");
        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

        String expected = "03310101R01  030 210276553000125                     006500005534372     Jennifer Saraiva Santos       Mensagem 1                              Mensagem 2                              0000000126062013                                         ";
        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
