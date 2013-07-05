package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05TrailerLoteExtratoLayout031;
import java.text.ParseException;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabTrailerLoteExtratoTest {
    //Método construtor

    public LineCnabTrailerLoteExtratoTest() {
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
    public void LineCnabTrailerLoteExtratoTest() throws ParseException {
        LineArchetype la = new LineCnab240v05TrailerLoteExtratoLayout031();
        LineModel line = la.createModel();
        String aux = "34100015         212924343000121               34201002782000000090749 8                00000000000000000000000000000000000000000000000000000020052013000000000000005601CP0000030000000000000000000000000000000006010000000000000000000000000000";
        int tam = aux.length();
        line.setRepresentation(aux);
        //01
        String codigoBanco = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.CODIGO_BANCO);
        //02
        int codigoLote = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.LOTE_SERVICO).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.TIPO_REGISTRO);
        //04
        String brancos = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.BRANCOS);
        //05
        int tipoInscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.TIPO_INSCRICAO).intValue();
        //06
        long inscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.NUM_INSCRICAO_EMPRESA).longValue();
        //07
        String brancos2 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.BRANCOS2);
        //08
        String convenio = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.CONVENIO);
        //09
        String zeros = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.ZEROS);
        //10
        int agenciaMantenedora = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.AGENCIA_MANTENEDORA).intValue();
        //11
        String digitoAgenciaCedente = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.DIGITO_VER_AGENCIA);
        //12
        String zeros2 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.ZEROS2);
        //13
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.NUMERO_CONTA_COR).intValue();
        //14
        String brancos3 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.BRANCOS3);
        //15
        int digitoVerificadorAgConta = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.DIGITO_VER_AG_CONTA).intValue();
        //16
        String brancos4 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.BRANCOS4);
        //17
        double saldoBloqueadoAcima24 = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.SALDO_BLOQUEADO_ACIMA_24).doubleValue();
        //18
        double limiteConta = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.LIMITE_CONTA).doubleValue();
        //19
        double saldoBloqueadoAte24 = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.SALDO_BLOQUEADO_ATE_24).doubleValue();
        //20
        Date dataFinal = line.getFieldValueDate(LineCnab240v05TrailerLoteExtratoLayout031.DATA_FINAL);
        //21
        double saldoFinal = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.SALDO_FINAL).doubleValue();
        //22
        String situacaoSaldoFinal = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.SITUACAO_SALDO_FINAL);
        //23
        String statusSaldoFinal = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.STATUS_SALDO_FINAL);
        //24
        int quantidadeRegistrosLote = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.QTDE_REGISTROS_LOTE).intValue();
        //25
        double totalValorDebito = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.TOTAL_VALOR_DEBITO).doubleValue();
        //26
        double totalValorCredito = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.TOTAL_VALOR_CREDITO).doubleValue();
        //27
        double totalValoresNaoContabeis = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout031.TOTAL_VALORES_NAO_CONTABEIS).doubleValue();
        //28
        String brancos5 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout031.BRANCOS5);
        
        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + codigoLote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Brancos: " + brancos);
        System.out.println("05. Tipo de inscrição da empresa: " + tipoInscricaoEmpresa);
        System.out.println("06. Número de inscrição da empresa: " + inscricaoEmpresa);
        System.out.println("07. Brancos2: " + brancos2);
        System.out.println("08. Convênio: " + convenio);
        System.out.println("09. Zeros: " + zeros);
        System.out.println("10. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("11. Dígito Ag.: " + digitoAgenciaCedente);
        System.out.println("12. Zeros2: " + zeros2);
        System.out.println("13. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("14. Brancos3: " + brancos3);
        System.out.println("15. Dígito verificador Ag./Cta.: " + digitoVerificadorAgConta);
        System.out.println("16. Brancos4: " + brancos4);
        System.out.println("17. Saldo bloqueado acima de 24h: " + saldoBloqueadoAcima24);
        System.out.println("18. Limite da conta: " + limiteConta);
        System.out.println("19. Saldo bloqueado até 24h: " + saldoBloqueadoAte24);
        System.out.println("20. Data final: " + dataFinal);
        System.out.println("21. Saldo final: " + saldoFinal);
        System.out.println("22. Situação do saldo final: " + situacaoSaldoFinal);
        System.out.println("23. Status do saldo final: " + statusSaldoFinal);
        System.out.println("24. Quantidade de registros do lote: " + quantidadeRegistrosLote);
        System.out.println("25. Valor total débito: " + totalValorDebito);
        System.out.println("26. Valor total crédito: " + totalValorCredito);
        System.out.println("27. Total de valores não contábeis: " + totalValoresNaoContabeis);
        System.out.println("28. Brancos5: " + brancos5);
        
    }
}
