package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnabv05SegmentoEExtratoItau;
import java.text.ParseException;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabSegmentoEExtratoTest {
    //Método construtor

    public LineCnabSegmentoEExtratoTest() {
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
    public void LineCnabSegmentoEExtratoTest() throws ParseException {
        LineArchetype la = new LineCnabv05SegmentoEExtratoItau();
        LineModel line = la.createModel();
        line.setRepresentation("3410001300001E1  212924343000121000000         34201002782000000090749 8WALZLAGER FABRIK DO BR LTDA         DPV                      S        20052013000000000000000601C2050000DESBLOQUEIO JUDICIAL                                      000000");

        //01
        int codigoBanco = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.CODIGO_BANCO).intValue();
        //02
        int codigoLote = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.CODIGO_LOTE).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.TIPO_REGISTRO);
        //04
        int numeroRegistro = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.NUMERO_REGISTRO).intValue();
        //05
        String codigoSegmento = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.CODIGO_SEGMENTO);
        //06
        int identificacaoTipoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.IDENTIFICACAO_TIPO_LANCAMENTO).intValue();
        //07
        String brancos = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.BRANCOS);
        //08
        String tipoInscricaoCliente = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.TIPO_INSCRICAO);
        //09
        long numeroInscricao = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.NUMERO_INSCRICAO).longValue();
        //10
        String brancos2 = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.BRANCOS2);
        //11
        String convenio = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.CONVENIO);
        //12
        int zeros = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.ZEROS).intValue();
        //13
        int agenciaMantenedora = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AGENCIA_MANTENEDORA).intValue();
        //14
        String digitoVerificadorAgencia = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.DIGITO_VER_AGENCIA);
        //15
        int zeros2 = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.ZEROS2).intValue();
        //16
        int numeroContaCorrente = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.NUMERO_CONTA_CORRENTE).intValue();
        //17
        String brancos3 = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.BRANCOS3);
        //18
        String digitoVerificadosAgConta = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.DIGITO_VER_AG_CONTA);
        //19
        String nomeEmpresa = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.NOME_EMPRESA);
        //20
        String reservadoUsoBranco = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.RESERVADO_USO_BANCO);
        //21
        String naturezaLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.NATUREZA_LANCAMENTO);
        //22
        int tipoComplementoLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.TIPO_COMPLEMENTO) != null) {
            tipoComplementoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.TIPO_COMPLEMENTO).intValue();
        }
        //23
        int bancoOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.BANCO_ORIGEM_LANCAMENTO) != null) {
            bancoOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.BANCO_ORIGEM_LANCAMENTO).intValue();
        }
        //24
        int agenciaOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AGENCIA_ORIGEM_LANCAMENTO) != null) {
            agenciaOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AGENCIA_ORIGEM_LANCAMENTO).intValue();
        }
        //25
        long agenciaContaOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AG_CONTA_ORIGEM_LANCAMENTO) != null) {
            agenciaContaOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AG_CONTA_ORIGEM_LANCAMENTO).longValue();
        }
        //26
        String idenfiticacaoIsencaoCpmf = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.IDENTIFICACAO_INSENCAO_CPMF);
        //27
        Date dataContabil = line.getFieldValueDate(LineCnabv05SegmentoEExtratoItau.DATA_CONTABIL);
        //28
        Date dataLancamento = line.getFieldValueDate(LineCnabv05SegmentoEExtratoItau.DATA_LANCAMENTO);
        //29
        double valorLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.VALOR_LANCAMENTO).doubleValue();
        //30
        String tipoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.TIPO_LANCAMENTO);
        //31
        int categoriaLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.CATEGORIA_LANCAMENTO).intValue();
        //32
        String codigoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.CODIGO_LANCAMENTO);
        //33
        String historico = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.HISTORICO_LANCAMENTO);
        //34
        int agenciaDeOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AG_ORIGEM_LANCAMENTO) != null) {
            agenciaDeOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.AG_ORIGEM_LANCAMENTO).intValue();
        }
        //35
        int complemento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.COMPLEMENTO_REGISTRO) != null) {
            complemento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.COMPLEMENTO_REGISTRO).intValue();
        }
        //36
        int contaDeOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.CONTA_ORIGEM_LANCAMENTO) != null) {
            contaDeOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.CONTA_ORIGEM_LANCAMENTO).intValue();
        }
        //37
        int dacAgContaOrigem = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.DAC_AG_CONTA_ORIGEM) != null){
            dacAgContaOrigem = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoItau.DAC_AG_CONTA_ORIGEM).intValue();
        }
        //38
        String tipoInscricaoEmitente = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.TIPO_INSCRICAO_EMITENTE);
        //39
        String numeroInscricaoEmitente = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.NUMERO_INSCRICAO_EMITENTE);   
        //40
        String brancos4 = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.BRANCOS4);
        //41
        String numeroDocumento = line.getFieldValueString(LineCnabv05SegmentoEExtratoItau.NUMERO_DOCUMENTO);
        
        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + codigoLote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Número do registro: " + numeroRegistro);
        System.out.println("05. Segmento: " + codigoSegmento);
        System.out.println("06. Lançamento: " + identificacaoTipoLancamento);
        System.out.println("07. Brancos1: " + brancos);
        System.out.println("08. Tipo de inscrição do cliente: " + tipoInscricaoCliente);
        System.out.println("09. Número de inscrição do cliente: " + numeroInscricao);
        System.out.println("10. Brancos2: " + brancos2);
        System.out.println("11. Convênio: " + convenio);
        System.out.println("12. Zeros1: " + zeros);
        System.out.println("13. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("14. Dígito verificados da agência: " + digitoVerificadorAgencia);
        System.out.println("15. Zeros2: " + zeros2);
        System.out.println("16. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("17. Brancos3: " + brancos3);
        System.out.println("18. Dígito verificados da agência/conta: " + digitoVerificadosAgConta);
        System.out.println("19. Nome da empresa: " + nomeEmpresa);
        System.out.println("20. Reservado uso banco: " + reservadoUsoBranco);
        System.out.println("21. Natureza do lançamento: " + naturezaLancamento);
        System.out.println("22. Tipo do complemento: " + tipoComplementoLancamento);
        System.out.println("23. Banco origem do lançamento: " + bancoOrigemLancamento);
        System.out.println("24. Agência origem do lançamento: " + agenciaOrigemLancamento);
        System.out.println("25. Ag./Conta origem do lançamento: " + agenciaContaOrigemLancamento);
        System.out.println("26. Identificaçãoi de isenção de CPMF: " + idenfiticacaoIsencaoCpmf);
        System.out.println("27. Data contábil: " + dataContabil);
        System.out.println("28. Data lançamento: " + dataLancamento);
        System.out.println("29. Valor do lançamento: " + valorLancamento);
        System.out.println("30. Tipo do lançamento: " + tipoLancamento);
        System.out.println("31. Categoria do lançamento: " + categoriaLancamento);
        System.out.println("32. Código do lançamento: " + codigoLancamento);
        System.out.println("33. Histórico: " + historico);
        System.out.println("34. Agência de origem do lançamento: " + agenciaDeOrigemLancamento);
        System.out.println("35. Complemento de registro: " + complemento);
        System.out.println("36. Conta de origem do laçamento: " + contaDeOrigemLancamento);
        System.out.println("37. DAC: " + dacAgContaOrigem);
        System.out.println("38. Tipo de inscrição do emitente: " + tipoInscricaoEmitente);
        System.out.println("39. Número de inscrição do emitente: " + numeroInscricaoEmitente);
        System.out.println("40. Brancos4: " + brancos4);
        System.out.println("41. Número do documento: " + numeroDocumento);
    }
}
