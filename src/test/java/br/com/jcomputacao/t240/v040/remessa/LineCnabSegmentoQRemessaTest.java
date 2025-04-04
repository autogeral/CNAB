package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabSegmentoQRemessaTest {

    public LineCnabSegmentoQRemessaTest() {
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
    public void LineCnabSegmentoQRemessaTest() {
        LineArchetype la = new LineCnab240v040SegmentoQRemessa();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_LOTE, 4444);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.TIPO_REGISTRO, "3");
        //04
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.SEQUENCIAL_REGISTRO, 55555);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_SEGMENTO, "Q");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_MOVIMENTO_REMESSA, 33);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.TIPO_INSCRICAO, 2);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_INSCRICAO, 12345678912345L);
        //10
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NOME, "AUTO GERAL DE ITU LTDA");
        //11
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.ENDERECO, "RUA DR. OCTAVIANO PEREIRA MENDES");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.BAIRRO, "CENTRO");
        //13
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CEP, 13340);
        //14
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.SUFIXO_CEP, 000);
        //15
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CIDADE, "ITU");
        //16
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.UF, "SP");
        //17
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.TIPO_INSCRICAO_SACADOR, 0);
        //18
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_INSCRICAO_SACADOR, 12345678912345L);
        //19
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NOME_SACADOR, null);
        //20
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.IDENTIFICADOR_CARNE, 1);
        //21
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_SEQUENCIA_PARCELA, 2);
        //22
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.QUANTIDADE_TOTAL_PARCELAS, 18);
        //23
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_PLANO, 3);
        //24
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.RESERVADO_USO_BANCO, null);

        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

        String expected = "0334444355555Q 332012345678912345AUTO GERAL DE ITU LTDA                  RUA DR. OCTAVIANO PEREIRA MENDES        CENTRO         13340000ITU            SP0000000000000000                                        001002018003                   ";

        System.out.println(expected);
        assertEquals(expected, sb.toString());
    }
}
