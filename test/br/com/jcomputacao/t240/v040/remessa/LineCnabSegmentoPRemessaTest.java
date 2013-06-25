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
public class LineCnabSegmentoPRemessaTest {

    public LineCnabSegmentoPRemessaTest() {
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
    public void LineCnabSegmentoPRemessaTest() throws ParseException {
        LineArchetype la = new LineCnab240v040SegmentoPRemessa();
        LineModel lm = la.createModel();
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf2.parse("26062013");
        //01
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_LOTE, 0001);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TIPO_REGISTRO, 3);
        //04
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.SEQUENCIAL_REGISTRO, 00004);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_SEGMENTO_REGISTRO, "P");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_MOVIMENTO_REMESSA, 10);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.AGENCIA_MANTENEDORA, 1234);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA, "7");
        //10
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.NUMERO_CONTA_COR, 123456789L);
        //11
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_VERIFICADOR_CONTA, "1");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CONTA_COBRANCA, 123456789L);
        //13
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_CONTA_COBRANCA, 3);
        //14
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO, "  ");
        //15
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.NOSSO_NUMERO, "9999999999999");
        //16
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TIPO_DE_COBRANCA, 0);
        //17
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.FORMA_CADASTRO_TITULO_BANCO, 1);
        //18
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TIPO_DOCUMENTO, 3);
        //19
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO2, " ");
        //20
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO3, " ");
        //21
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.NUMERO_DOCUMENTO_COBRANCA, "111111111111111");
        //22
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_VENCIMENTO_TITULO, data);
        //23
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_NOMINAL_TITULO, 123456789123.12);
        //24
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.AGENCIA_COBRADORA, 1234);
        //25
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA_CEDENTE, 5);
        //26
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO2, " ");
        //27
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.ESPECIE_TITULO, 10);
        //28
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TITULO_ACEITO, "N");
        //29
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_EMISSAO_TITULO, data);
        //30
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_JUROS_MORA, 1);
        //31
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_JUROS_MORA, data);
        //32
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.JUROS_MORA_POR_DIA, 1234567891231.12);
        //33
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_DESCONTO_1, 9);
        //34 
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_DESCONTO_1, 23102013);
        //35
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_PERCENTUAL_DESCONTO_1, 2323232323232.12);
        //36
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_IOF, 1212121212121.12);
        //37
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_ABATIMENTO, 4545454545454.12);
        //38
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.IDENTIFICACAO_TITULO_EMPRESA, "12345678911234567891abcde");
        //39
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_PARA_PROTESTO, 2);
        //40
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.PRAZO_PARA_PROTESTO, 10);
        //41
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_PARA_BAIXA_DEVOLUCAO, 1);
        //42
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO3, " ");
        //43
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.PRAZO_PARA_BAIXA_DEVOLUCAO, 11);
        //44
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_MOEDA, 12);
        //45
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO6, "          ");
        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

        String expected = "0330001300004P 101234712345678911234567893  9999999999999013  1111111111111112606201301234567891231212345 10N2606201312606201312345678912311292310201323232323232321212121212121211245454545454541212345678911234567891abcde210101112           ";
        
        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
