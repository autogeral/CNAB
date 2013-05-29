package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05HeaderArquivoExtrato;
import java.text.ParseException;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennnifer
 */
public class LineCnabHeaderArquivoExtratoTest {
    //Método construtor
    public LineCnabHeaderArquivoExtratoTest() {
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
    public void LineCnabHeaderArquivoExtratoTest() throws ParseException {
        LineArchetype la = new LineCnab240v05HeaderArquivoExtrato();
        LineModel line = la.createModel();
        line.setRepresentation("34100000         212924343000121               34201002782000000090749 8WALZLAGER FABRIK DO BR LTDA   BANCO ITAU S/A                          22105201305361800000105000000");

        //01
        //--3
        String codigoBanco = line.getFieldValue(LineCnab240v05HeaderArquivoExtrato.CODIGO_BANCO).toString();
        //02
        //--4
        String lote = line.getFieldValue(LineCnab240v05HeaderArquivoExtrato.CODIGO_LOTE).toString();
        //03
        //--1
        String tipoRegistro  = line.getFieldValue(LineCnab240v05HeaderArquivoExtrato.TIPO_REGISTRO).toString();
        //04
        //--9
        String brancos = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.BRANCOS);
        //05
        //--1
        int tipoIncricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.TIPO_INSCRICAO).intValue();
        //06
        //--14
        long numeroInscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.NUMERO_INSCRICAO).longValue();
        //07
        //--15
        String brancos2 = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.BRANCOS);
        //08
        //--5
        String convenio = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.CONVENIO);
        //09
        //--1
        String zeros = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.ZEROS);
        //10
        //--4
        int agenciaMantenedora = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.AGENCIA_MANTENEDORA).intValue();
        //11
        //--1
        String digitoVerificadorConta = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.DIGITO_VER_AGENCIA);
        //12
        //--7
        String zeros2 = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.ZEROS2);
        //13
        //--5
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.NUMERO_CONTA_COR).intValue();
        //14
        //--1
        String brancos3 = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.BRANCOS2);
        //15
        //--1
        int digitoVerificadorAgenciaConta = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.DIGITO_VER_AG_CONTA).intValue();
        //16
        //--30
        String nomeEmpresa = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.NOME_EMPRESA);
        //17
        //--30
        String nomeBanco = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.NOME_BANCO);
        //18
        //--10
        String brancos4 = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.BRANCOS3);
        //19
        //--1
        int codigoRemessaRetorno = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.CODIGO_RETORNO).intValue();
        //20
        //--8
        Date dataGeracaoArquivo = line.getFieldValueDate(LineCnab240v05HeaderArquivoExtrato.DATA_GERACAO_ARQUIVO);
        //21
        //--6
        Date horaGeracaoArquivo = line.getFieldValueDate(LineCnab240v05HeaderArquivoExtrato.HORA_GERACAO_ARQUIVO);
        //22   
        //--6
        int numSequencialArquivo = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.NUM_SEQUENCIAL_ARQUIVO).intValue();
        //23
        //--3
        String numeroVersaoLayout = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.VERSAO_LAYOUT);
        //24
        //--5
        String zeros3 = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.ZEROS1);
        //25
        //--20
        String reservadoBanco = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.RESERVADO_BANCO);
        //26
        //--20
        String brancos5 = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.BRANCOS4);

        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + lote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Brancos: " + brancos);
        System.out.println("05. Tipo de inscrição: " + tipoIncricaoEmpresa);
        System.out.println("06. Número de inscrição: " + numeroInscricaoEmpresa);
        System.out.println("07. Brancos2: " + brancos2);
        System.out.println("08. Convênio: " + convenio);
        System.out.println("09. Zeros: " + zeros);
        System.out.println("10. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("11. Dígito verificador da conta: " + digitoVerificadorConta);
        System.out.println("12. Zeros2: " + zeros2);
        System.out.println("13. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("14. Brancos3: " + brancos3);
        System.out.println("15. Dígito ver. ag./cta.: " + digitoVerificadorAgenciaConta);
        System.out.println("16. Nome da empresa: " + nomeEmpresa);
        System.out.println("17. Nome do Banco: " + nomeBanco);
        System.out.println("18. Brancos4: " + brancos4);
        System.out.println("19. Código remessa retorno: " + codigoRemessaRetorno);
        System.out.println("20. Data geração do arquivo: " + dataGeracaoArquivo);
        System.out.println("21. Hora geração do arquivo: " + horaGeracaoArquivo);
        System.out.println("22. Número sequencial arquivo: " + numSequencialArquivo);
        System.out.println("23. Versão do layout: " + numeroVersaoLayout);
        System.out.println("24. Zeros: " + zeros3);
        System.out.println("25. Reservado uso banco: " + reservadoBanco);
        System.out.println("26. brancos3: " + brancos5);
    }
}
