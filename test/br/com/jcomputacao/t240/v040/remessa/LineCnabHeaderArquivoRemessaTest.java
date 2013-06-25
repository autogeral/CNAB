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
public class LineCnabHeaderArquivoRemessaTest {

    public LineCnabHeaderArquivoRemessaTest() {
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
    public void LineCnabHeaderArquivoRemessaTest() throws ParseException {
        LineArchetype la = new LineCnab240v040HeaderArquivo();
        LineModel lm = la.createModel();
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf2.parse("26062013");

        //01
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_BANCO, "033");
        //02
        lm.setFieldValue(LineCnab240v040HeaderArquivo.LOTE_SERVICO, "0000");
        //03
        lm.setFieldValue(LineCnab240v040HeaderArquivo.TIPO_REGISTRO, "0");
        //04
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO, "        ");
        //05
        lm.setFieldValue(LineCnab240v040HeaderArquivo.TIPO_INSCRICAO, 2);
        //06
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NUMERO_INSCRICAO, 10276553000125L);
        //07
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_TRASMISSAO, 6500005534372L);
        //08
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO2, "                         ");
        //09
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NOME_EMPRESA, "CONVIVERE EMPREENDIMENTOS IMOBILIARIOS LTDA");
        //10
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NOME_BANCO, "Banco Santander");
        //11
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO3, "          ");
        //12
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_REM_RET, 1);
        //13
        lm.setFieldValue(LineCnab240v040HeaderArquivo.DATA_GERACAO_ARQUIVO, data);
        //14
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO4, "      ");
        //15
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NUM_SEQUENCIAL_ARQUIVO, 1);
        //16
        lm.setFieldValue(LineCnab240v040HeaderArquivo.VERSAO_LAYOUT, "040");
        //17
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO5, "                                                                          ");

        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

	String expected = "03300000        2010276553000125006500005534372                         CONVIVERE EMPREENDIMENTOS IMOBBanco Santander                         126062013      000001040                                                                          ";
        System.out.println(expected);
	assertEquals (expected, sb.toString());
    }
}
