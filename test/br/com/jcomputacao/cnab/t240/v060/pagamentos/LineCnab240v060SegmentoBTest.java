package br.com.jcomputacao.cnab.t240.v060.pagamentos;

import br.com.jcomputacao.aristoteles.line.LineModel;
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
public class LineCnab240v060SegmentoBTest {

    public LineCnab240v060SegmentoBTest() {
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
    public void hello() {
        LineCnab240v060SegmentoB lc = new LineCnab240v060SegmentoB();
        LineModel lm = lc.createModel();
        
        lm.setFieldValue(LineCnab240v060SegmentoB.CODIGO_BANCO_COMPENSACAO, "033");
        lm.setFieldValue(LineCnab240v060SegmentoB.CODIGO_DO_LOTE, 4L);
        lm.setFieldValue(LineCnab240v060SegmentoB.SEQUENCIAL_REGISTRO, 5L);
        lm.setFieldValue(LineCnab240v060SegmentoB.TIPO_INSCRICAO, 1L);
        lm.setFieldValue(LineCnab240v060SegmentoB.NUMERO_INSCRICAO, 05437537000137L);
        lm.setFieldValue(LineCnab240v060SegmentoB.LOGRADOURO, "Logradouro");
        lm.setFieldValue(LineCnab240v060SegmentoB.NUMERO, 1333L);
        lm.setFieldValue(LineCnab240v060SegmentoB.BAIRRO, "Liberdade");
        lm.setFieldValue(LineCnab240v060SegmentoB.CIDADE, "Itu");
        lm.setFieldValue(LineCnab240v060SegmentoB.CEP, 13301L);
        lm.setFieldValue(LineCnab240v060SegmentoB.SUFIXO_CEP, 909L);
        lm.setFieldValue(LineCnab240v060SegmentoB.ESTADO, "SP");
        lm.setFieldValue(LineCnab240v060SegmentoB.DATA_VENCIMENTO, new java.util.Date());
        lm.setFieldValue(LineCnab240v060SegmentoB.VALOR_DOCUMENTO, 0.01d);
        lm.setFieldValue(LineCnab240v060SegmentoB.VALOR_ABATIMENTO, 0.01d);
        lm.setFieldValue(LineCnab240v060SegmentoB.VALOR_DESCONTO, 0.01d);
        lm.setFieldValue(LineCnab240v060SegmentoB.VALOR_MORA, 0.01d);
        lm.setFieldValue(LineCnab240v060SegmentoB.VALOR_MULTA, 0.01d);
        lm.setFieldValue(LineCnab240v060SegmentoB.CODIGO_HISTORICO, PagamentoCodigoHistorico.PAGAMENTO_A_FORNECEDORES.getCodigo());
        
        String line = lm.getRepresentation().toString();
        System.out.println("Line Model : " + line);
        if(line.length()!=240) {
            fail("Comprimento da linah difernete de 240");
        }
    }
}
