package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05TrailerArquivoExtrato;
import java.text.ParseException;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabTrailerArquivoExtratoTest {
    //Método construtor

    public LineCnabTrailerArquivoExtratoTest() {
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
    public void LineCnabTrailerArquivoExtratoTest() throws ParseException {
        LineArchetype la = new LineCnab240v05TrailerArquivoExtrato();
        LineModel line = la.createModel();
        /**
         * Esta linha é de um arquivo real proveniente do banco.
         */
        line.setRepresentation("34199999         000001000005000001                                                                                                                                                                                                             ");

        //01
        String codigoBanco = line.getFieldValueString(LineCnab240v05TrailerArquivoExtrato.CODIGO_BANCO_COMPENSACAO);
        //02
        String codigoLote = line.getFieldValueString(LineCnab240v05TrailerArquivoExtrato.LOTE_TIPO_REGISTRO).substring(0, 4);
        //03
        String tipoRegistro = line.getFieldValueString(LineCnab240v05TrailerArquivoExtrato.LOTE_TIPO_REGISTRO).substring(3, 4);
        //04
        String reservadoUsoBanco = line.getFieldValueString(LineCnab240v05TrailerArquivoExtrato.EXCLUSIVO_FEBRABAN);
        //05
        int quantidadeLotesArquivo = line.getFieldValueNumber(LineCnab240v05TrailerArquivoExtrato.QTDE_LOTES_ARQUIVO).intValue();
        //06
        int quantidadeRegistrosArquivo = line.getFieldValueNumber(LineCnab240v05TrailerArquivoExtrato.QTDE_REGISTROS_ARQUIVO).intValue();
        //07
        int quantidadeContasConcil = line.getFieldValueNumber(LineCnab240v05TrailerArquivoExtrato.QTDE_CONTAS_CONCIL).intValue();
        //08
        String reservadoUsoBanco2 = line.getFieldValueString(LineCnab240v05TrailerArquivoExtrato.EXCLUSIVO_FEBRABAN_2);

        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + codigoLote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Brancos: " + reservadoUsoBanco);
        System.out.println("05. Quantidade total de lotes: " + quantidadeLotesArquivo);
        System.out.println("06. Quantidade total de registros: " + quantidadeRegistrosArquivo);
        System.out.println("07. Quantidade de contas conciliação: " + quantidadeContasConcil);
        System.out.println("08. Brancos: " + reservadoUsoBanco2);
    }
}
