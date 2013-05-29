package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05HeaderLoteExtrato;
import java.text.ParseException;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabHeaderLoteExtratoTest {
    //Método construtor

    public LineCnabHeaderLoteExtratoTest() {
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
    public void LineCnabHeaderLoteExtratoTest() throws ParseException {

        LineArchetype la = new LineCnab240v05HeaderLoteExtrato();
        LineModel line = la.createModel();
        line.setRepresentation("34100011E0440031 212924343000121               34201002782000000090749 8WALZLAGER FABRIK DO BR LTDA                                           16052013000000000000005000CPBRL00001                                                              ");

        //01
        String codigoBanco = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.CODIGO_BANCO);
        //02
        int loteServico = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.LOTE_SERVICO).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.TIPO_REGISTRO);
        //04
        String tipoOperacao = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.TIPO_OPERACAO);
        //05
        int tipoServico = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.TIPO_SERVICO).intValue();
        //06
        int formaLancamento = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.FORMA_LANCAMENTO).intValue();
        //07
        String numeroVersaoLayout = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.LAYOUT);
        //08
        String brancos = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.BRANCOS);
        //09
        int tipoInscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.TIPO_INSCRICAO_EMPRESA).intValue();
        //10
        long inscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.NUM_INSCRICAO_EMPRESA).longValue();
        //11
        String tipoConta = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.TIPO_CONTA);
        //12
        String brancos2 = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.BRANCOS2);
        //13
        String convenio = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.CONVENIO);
        //14
        String zeros = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.ZEROS);
        //15
        int agenciaCedente = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.AGENCIA_MANTENEDORA).intValue();
        //16
        String digitoAgenciaCedente = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.DIGITO_VER_AGENCIA);
        //17
        String zeros2 = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.ZEROS2);
        //18
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.NUMERO_CONTA_COR).intValue();
        //19
        String brancos3 = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.BRANCOS3);
        //20
        int digitoVerificadorAgConta = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.DIGITO_VER_AG_CONTA).intValue();
        //21
        String nomeEmpresa = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.NOME_EMPRESA);
        //22
        String brancos4 = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.BRANCOS4);
        //23
        Date dataInicial = line.getFieldValueDate(LineCnab240v05HeaderLoteExtrato.DATA_SALDO_INICIAL);
        //24
        double valorSaldoInicial = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.VALOR_SALDO_INICIAL).doubleValue();
        //25
        String situacaoInicial = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.SITUACAO_INICIAL);
        //26
        String statusInicial = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.STATUS_INICIAL);
        //27
        String tipoMoeda = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.TIPO_MOEDA);
        //28
        int sequenciaExtrato = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtrato.SEQUENCIA_EXTRATO).intValue();
        //29
        String brancos5 = line.getFieldValueString(LineCnab240v05HeaderLoteExtrato.BRANCOS5);
        
        System.out.println("01. Código banco: " + codigoBanco);
        System.out.println("02. Lote: " + loteServico);
        System.out.println("03. Tipo registro: " + tipoRegistro);
        System.out.println("04. Tipo de operação: " + tipoOperacao);
        System.out.println("05. Tipo de serviço: " + tipoServico);
        System.out.println("06. Forma de lançamento: " + formaLancamento);
        System.out.println("07. Layout: " + numeroVersaoLayout);
        System.out.println("08. Brancos: " + brancos);
        System.out.println("09. Tipo de inscrição da empresa: " + tipoInscricaoEmpresa);
        System.out.println("10. Número de inscrição da empresa: " + inscricaoEmpresa);
        System.out.println("11. Tipo de conta: " + tipoConta);
        System.out.println("12. Brancos2: " + brancos2);
        System.out.println("13. Convênio: " + convenio);
        System.out.println("14. Zeros: " + zeros);
        System.out.println("15. Agência mantenedora: " + agenciaCedente);
        System.out.println("16. Dígito verificador da agência: " + digitoAgenciaCedente);
        System.out.println("17. Zeros2: " + zeros2);
        System.out.println("18. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("19. Brancos3: " + brancos3);
        System.out.println("20. Dígito vertificador da agência/conta:" + digitoVerificadorAgConta);
        System.out.println("21. Nome da empresa: " + nomeEmpresa);
        System.out.println("22. Brancos4: " + brancos4);
        System.out.println("23. Data saldo inicial: " + dataInicial);
        System.out.println("24. Valor saldo inicial: " + valorSaldoInicial);
        System.out.println("25. Situação inicial: " + situacaoInicial);
        System.out.println("26. Status inicial: " + statusInicial);
        System.out.println("27. Tipo de moeda: " + tipoMoeda);
        System.out.println("28. Sequencia extrato: " + sequenciaExtrato);
        System.out.println("29. Brancos5: " + brancos5);        
    }
}
