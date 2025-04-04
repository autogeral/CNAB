package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.LineCnab240ArquivoHeader;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05HeaderLoteExtratoLayout033;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05TrailerArquivoExtrato;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnab240v05TrailerLoteExtratoLayout033;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnabv05SegmentoEExtratoSantander;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
/**
 * CLASSE DE TESTES QUE EFETUA A LEITURA DE UM ARQUIVO PROVENIENTE DO BANCO
 * SANTANDER HÁ DIFERENÇAS ESTRUTURAIS NO LAYOUT DO ARQUIVO DESTE BANCO, SENDO
 * ASSIM HOUVE A NECESSIDADE DE IMPLEMENTAR TESTES SEPARADAMENTE.
 */
public class TestFileSantander {

    public TestFileSantander() {
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
    public void TestFileSantander() throws ParseException, IOException {
        File dir = new File("C:/Users/Cesário/Desktop/testesConcilSantander");
        File[] fs = dir.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return (name.toLowerCase().endsWith(".ret") || name.toLowerCase().startsWith("BL"));
            }
        });
        for (File f : fs) {
            if (f.exists()) {
                parseFile(f);
            } else {
                System.err.println("Arquivo " + f.getAbsolutePath() + " nao encontrado");
            }
        }
    }

    private void parseFile(File f) throws IOException, ParseException {
        System.out.println("Parsing file: " + f.getAbsolutePath());
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String l;
        while ((l = br.readLine()) != null) {
            trataLinha(l);
        }

        br.close();
        fr.close();
    }

    private void trataLinha(String linha) throws ParseException {
        String tipoRegistroStr = linha.substring(7, 8);
        int tipoRegistro = Integer.parseInt(tipoRegistroStr);

        LineModel line;
        LineArchetype la;
        switch (tipoRegistro) {
            //Header do arquivo
            case 0:
                la = new LineCnab240ArquivoHeader();
                line = la.createModel();
                line.setRepresentation(linha);
                trataHeaderArquivo(line);
                break;
            //Header do lote
            case 1:
                la = new LineCnab240v05HeaderLoteExtratoLayout033();
                line = la.createModel();
                line.setRepresentation(linha);
                trataHeaderLote(line);
                break;
            //Registro de detalhe - SEGMENTO E
            case 3:
                la = new LineCnabv05SegmentoEExtratoSantander();
                line = la.createModel();
                line.setRepresentation(linha);
                trataSegmentoE(line);
                break;
            //Trailer do lote
            case 5:
                la = new LineCnab240v05TrailerLoteExtratoLayout033();
                line = la.createModel();
                line.setRepresentation(linha);
                trataTrailerLote(line);
                break;
            //Trailer do arquivo
            case 9:
                la = new LineCnab240v05TrailerArquivoExtrato();
                line = la.createModel();
                line.setRepresentation(linha);
                trataTrailerArquivo(line);
                break;
        }
    }

    private void trataHeaderArquivo(LineModel line) {
        //01
        String codigoBanco = line.getFieldValue(LineCnab240ArquivoHeader.CODIGO_BANCO).toString();
        //02
        String lote = line.getFieldValue(LineCnab240ArquivoHeader.LOTE_TIPO_REGISTRO).toString().substring(0, 1);
        //03
        String tipoRegistro = line.getFieldValue(LineCnab240ArquivoHeader.LOTE_TIPO_REGISTRO).toString().substring(1, 5);
        //04
        String usoExclusivoFebraban = line.getFieldValueString(LineCnab240ArquivoHeader.EXCLUSIVO_FEBRABAN);
        //05
        int tipoIncricaoEmpresa = line.getFieldValueNumber(LineCnab240ArquivoHeader.TIPO_INSCRICAO).intValue();
        //06
        long numeroInscricaoEmpresa = line.getFieldValueNumber(LineCnab240ArquivoHeader.NUMERO_INSCRICAO).longValue();
        //07
        String convenio = line.getFieldValueString(LineCnab240ArquivoHeader.CODIGO_CONVENIO);
        //08
        int agenciaMantenedora = line.getFieldValueNumber(LineCnab240ArquivoHeader.AGENCIA_MANTENEDORA).intValue();
        //09
        String digitoVerificadorAgencia = line.getFieldValueString(LineCnab240ArquivoHeader.DIGITO_VER_AGENCIA);
        //10
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240ArquivoHeader.NUMERO_CONTA_COR).intValue();
        //11
        String digitoVerificadorConta = null;
        String teste = line.getFieldValueString(LineCnab240ArquivoHeader.DIGITO_VER_CONTA);
        if (teste != null) {
            digitoVerificadorConta = line.getFieldValueString(LineCnab240ArquivoHeader.DIGITO_VER_CONTA);
        }
        //12
        String digitoVerificadorAgenciaConta = line.getFieldValueString(LineCnab240ArquivoHeader.DIGITO_VER_AG_CONTA);
        //13
        String nomeEmpresa = line.getFieldValueString(LineCnab240ArquivoHeader.NOME_EMPRESA);
        //14
        String nomeBanco = line.getFieldValueString(LineCnab240ArquivoHeader.NOME_BANCO);
        //15
        String usoExclusivoFebraban2 = line.getFieldValueString(LineCnab240ArquivoHeader.EXCLUSIVO_FEBRABAN_2);
        //16
        int codigoRemessaRetorno = line.getFieldValueNumber(LineCnab240ArquivoHeader.CODIGO_REM_RET).intValue();
        //17
        Date dataGeracaoArquivo = line.getFieldValueDate(LineCnab240ArquivoHeader.DATA_GERACAO_ARQUIVO);
        //18
        Date horaGeracaoArquivo = line.getFieldValueDate(LineCnab240ArquivoHeader.HORA_GERACAO_ARQUIVO);
        //19
        int numSequencialArquivo = line.getFieldValueNumber(LineCnab240ArquivoHeader.NUM_SEQUENCIAL_ARQUIVO).intValue();
        //20
        String numeroVersaoLayout = line.getFieldValueString(LineCnab240ArquivoHeader.VERSAO_LAYOUT);
        //21
        String desnsidadeGravacao = line.getFieldValueString(LineCnab240ArquivoHeader.DENSIDADE_GRAVACAO);
        //22
        String reservadoBanco = line.getFieldValueString(LineCnab240ArquivoHeader.RESERVADO_BANCO);
        //23
        String reservadoUsoEmpresa = line.getFieldValueString(LineCnab240ArquivoHeader.RESERVADO_EMPRESA);
        //24
        String usoExclusivoFebraban3 = line.getFieldValueString(LineCnab240ArquivoHeader.EXCLUSIVO_FEBRABAN_3);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:MM:SS");

        System.out.println("\nHeader do arquivo");
        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + lote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Exclusivo Febraban: " + usoExclusivoFebraban);
        System.out.println("05. Tipo de inscrição: " + tipoIncricaoEmpresa);
        System.out.println("06. Número de inscrição: " + numeroInscricaoEmpresa);
        System.out.println("07. Convênio: " + convenio);
        System.out.println("08. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("09. Dígito verificador da agência: " + digitoVerificadorAgencia);
        System.out.println("10 e 11. Conta corrente - dígito: " + numeroContaCorrente + " - " + digitoVerificadorConta);
        System.out.println("12. Dígito ver. ag./cta.: " + digitoVerificadorAgenciaConta);
        System.out.println("13. Nome da empresa: " + nomeEmpresa);
        System.out.println("14. Nome do Banco: " + nomeBanco);
        System.out.println("15. Uso exclusivo febraban 2: " + usoExclusivoFebraban2);
        System.out.println("16. Código remessa retorno: " + codigoRemessaRetorno);
        System.out.println("17 e 18. Geração do arquivo: " + sdf.format(dataGeracaoArquivo) + " às " + sdf2.format(horaGeracaoArquivo));
        System.out.println("19. Número sequencial arquivo: " + numSequencialArquivo);
        System.out.println("21. Versão do layout: " + numeroVersaoLayout);
        System.out.println("20. Densidade de gravação do arquivo: " + desnsidadeGravacao);
        System.out.println("22. Reservado uso banco: " + reservadoBanco);
        System.out.println("23. Reservado uso banco: " + reservadoUsoEmpresa);
        System.out.println("24. Exclusivo Febraban: " + usoExclusivoFebraban3);
    }

    private void trataHeaderLote(LineModel line) {
        //01
        String codigoBanco = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.CODIGO_BANCO);
        //02
        int loteServico = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.LOTE_SERVICO).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.TIPO_REGISTRO);
        //04
        String tipoOperacao = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.TIPO_OPERACAO);
        //05
        int tipoServico = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.TIPO_SERVICO).intValue();
        //06
        int formaLancamento = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.FORMA_LANCAMENTO).intValue();
        //07
        String numeroVersaoLayout = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.LAYOUT);
        //08
        String brancos = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.BRANCOS);
        //09
        int tipoInscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.TIPO_INSCRICAO_EMPRESA).intValue();
        //10
        long inscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.NUM_INSCRICAO_EMPRESA).longValue();
        //11
//        String tipoConta = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.TIPO_CONTA);
        //12
//        String brancos2 = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.BRANCOS2);
        //13
        String convenio = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.CONVENIO);
        //14
//        String zeros = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.ZEROS);
        //15
        int agenciaCedente = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.AGENCIA_MANTENEDORA).intValue();
        //16
        String digitoAgenciaCedente = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.DIGITO_VER_AGENCIA);
        //17
//        String zeros2 = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.ZEROS2);
        //18
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.NUMERO_CONTA_COR).intValue();
        //19
        String brancos3 = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.BRANCOS3);
        //20
        int digitoVerificadorAgConta = 0;
        String teste = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.DIGITO_VER_AG_CONTA);
        if (teste != null) {
            digitoVerificadorAgConta = Integer.parseInt(teste);
        }
        //21
        String nomeEmpresa = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.NOME_EMPRESA);
        //22
        String brancos4 = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.BRANCOS4);
        //23
        Date dataInicial = line.getFieldValueDate(LineCnab240v05HeaderLoteExtratoLayout033.DATA_SALDO_INICIAL);
        //24
        double valorSaldoInicial = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.VALOR_SALDO_INICIAL).doubleValue();
        //25
        String situacaoInicial = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.SITUACAO_INICIAL);
        //26
        String statusInicial = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.STATUS_INICIAL);
        //27
        String tipoMoeda = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.TIPO_MOEDA);
        //28
        int sequenciaExtrato = line.getFieldValueNumber(LineCnab240v05HeaderLoteExtratoLayout033.SEQUENCIA_EXTRATO).intValue();
        //29
        String brancos5 = line.getFieldValueString(LineCnab240v05HeaderLoteExtratoLayout033.BRANCOS5);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:MM:SS");

        System.out.println("\nHeader do lote");
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
//        System.out.println("11. Tipo de conta: " + tipoConta);
//        System.out.println("12. Brancos2: " + brancos2);
        System.out.println("13. Convênio: " + convenio);
//        System.out.println("14. Zeros: " + zeros);
        System.out.println("15. Agência mantenedora: " + agenciaCedente);
        System.out.println("16. Dígito verificador da agência: " + digitoAgenciaCedente);
//        System.out.println("17. Zeros2: " + zeros2);
        System.out.println("18. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("19. Brancos3: " + brancos3);
        System.out.println("20. Dígito vertificador da agência/conta:" + digitoVerificadorAgConta);
        System.out.println("21. Nome da empresa: " + nomeEmpresa);
        System.out.println("22. Brancos4: " + brancos4);
        System.out.println("23. Data saldo inicial: " + sdf.format(dataInicial));
        System.out.println("24. Valor saldo inicial: " + valorSaldoInicial);
        System.out.println("25. Situação inicial: " + situacaoInicial);
        System.out.println("26. Status inicial: " + statusInicial);
        System.out.println("27. Tipo de moeda: " + tipoMoeda);
        System.out.println("28. Sequencia extrato: " + sequenciaExtrato);
        System.out.println("29. Brancos5: " + brancos5);
    }

    private void trataSegmentoE(LineModel line) {
        //01
        int codigoBanco = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.CODIGO_BANCO).intValue();
        //02
        int codigoLote = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.CODIGO_LOTE).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.TIPO_REGISTRO);
        //04
        int numeroRegistro = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.NUMERO_REGISTRO).intValue();
        //05
        String codigoSegmento = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.CODIGO_SEGMENTO);
        //06
        String usoExclusivoFebraban = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.IDENTIFICACAO_TIPO_LANCAMENTO);
        //07
//        String brancos = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.BRANCOS);
        //08
        String tipoInscricaoCliente = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.TIPO_INSCRICAO);
        //09
        long numeroInscricao = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.NUMERO_INSCRICAO).longValue();
        //10
//        String brancos2 = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.BRANCOS2);
        //11
        String convenio = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.CONVENIO);
        //12
//        int zeros = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.ZEROS).intValue();
        //13
        int agenciaMantenedora = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AGENCIA_MANTENEDORA).intValue();
        //14
        String digitoVerificadorAgencia = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.DIGITO_VER_AGENCIA);
        //15
//        int zeros2 = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.ZEROS2).intValue();
        //16
        int numeroContaCorrente = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.NUMERO_CONTA_CORRENTE).intValue();
        //17
        String digitoVerificadorConta = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.BRANCOS3);
        //18
        String digitoVerificadosAgConta = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.DIGITO_VER_AG_CONTA);
        //19
        String nomeEmpresa = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.NOME_EMPRESA);
        //20
        String reservadoUsoBranco = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.RESERVADO_USO_BANCO);
        //21
        String naturezaLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.NATUREZA_LANCAMENTO);
        //22
        int tipoComplementoLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.TIPO_COMPLEMENTO) != null) {
            tipoComplementoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.TIPO_COMPLEMENTO).intValue();
        }

        //23
        String complementoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.BANCO_ORIGEM_LANCAMENTO);
        //24
//        int agenciaOrigemLancamento = 0;
//        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AGENCIA_ORIGEM_LANCAMENTO) != null) {
//            agenciaOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AGENCIA_ORIGEM_LANCAMENTO).intValue();
//        }
        //25
//        long agenciaContaOrigemLancamento = 0;
//        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AG_CONTA_ORIGEM_LANCAMENTO) != null) {
//            agenciaContaOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AG_CONTA_ORIGEM_LANCAMENTO).longValue();
//        }
        //26
        String idenfiticacaoIsencaoCpmf = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.IDENTIFICACAO_INSENCAO_CPMF);
        //27
        Date dataContabil = line.getFieldValueDate(LineCnabv05SegmentoEExtratoSantander.DATA_CONTABIL);
        //28
        Date dataLancamento = line.getFieldValueDate(LineCnabv05SegmentoEExtratoSantander.DATA_LANCAMENTO);
        //29
        double valorLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.VALOR_LANCAMENTO).doubleValue();
        //30
        String tipoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.TIPO_LANCAMENTO);
        //31
        int categoriaLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.CATEGORIA_LANCAMENTO).intValue();
        //32
        String codigoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.CODIGO_LANCAMENTO);
        //33
        String historico = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.HISTORICO_LANCAMENTO);
        //34
//        int agenciaDeOrigemLancamento = 0;
//        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AG_ORIGEM_LANCAMENTO) != null) {
//            agenciaDeOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.AG_ORIGEM_LANCAMENTO).intValue();
//        }
        //35
//        int complemento = 0;
//        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.COMPLEMENTO_REGISTRO) != null) {
//            complemento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.COMPLEMENTO_REGISTRO).intValue();
//        }
        //36
//        int contaDeOrigemLancamento = 0;
//        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.CONTA_ORIGEM_LANCAMENTO) != null) {
//            contaDeOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.CONTA_ORIGEM_LANCAMENTO).intValue();
//        }
        //37
//        int dacAgContaOrigem = 0;
//        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.DAC_AG_CONTA_ORIGEM) != null) {
//            dacAgContaOrigem = line.getFieldValueNumber(LineCnabv05SegmentoEExtratoSantander.DAC_AG_CONTA_ORIGEM).intValue();
//        }
        //38
//        String tipoInscricaoEmitente = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.TIPO_INSCRICAO_EMITENTE);
        //39
//        String numeroInscricaoEmitente = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.NUMERO_INSCRICAO_EMITENTE);
        //40
//        String brancos4 = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.BRANCOS4);
        //41
        String numeroDocumento = line.getFieldValueString(LineCnabv05SegmentoEExtratoSantander.NUMERO_DOCUMENTO);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\nSegmento 'E'");
        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + codigoLote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Número sequencial do registro: " + numeroRegistro);
        System.out.println("05. Segmento: " + codigoSegmento);
        System.out.println("06. Uso exclusivo Febraban: " + usoExclusivoFebraban);
//        System.out.println("07. Brancos1: " + brancos);
        System.out.println("07. Tipo de inscrição do cliente: " + tipoInscricaoCliente);
        System.out.println("08. Número de inscrição do cliente: " + numeroInscricao);
//        System.out.println("10. Brancos2: " + brancos2);
        System.out.println("09. Convênio: " + convenio);
        //       System.out.println("12. Zeros1: " + zeros);
        System.out.println("10. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("11. Dígito verificador da agência: " + digitoVerificadorAgencia);
//        System.out.println("15. Zeros2: " + zeros2);
        System.out.println("12. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("13. Dígito verificador da conta: " + digitoVerificadorConta);
        System.out.println("14. Dígito verificador da agência/conta: " + digitoVerificadosAgConta);
        System.out.println("15. Nome da empresa: " + nomeEmpresa);
        System.out.println("16. Reservado uso banco: " + reservadoUsoBranco);
        System.out.println("17. Natureza do lançamento: " + naturezaLancamento);
        System.out.println("18. Tipo do complemento: " + tipoComplementoLancamento);
        System.out.println("19. Complemento do lançamento: " + complementoLancamento);
//        System.out.println("24. Agência origem do lançamento: " + agenciaOrigemLancamento);
//        System.out.println("25. Ag./Conta origem do lançamento: " + agenciaContaOrigemLancamento);
        System.out.println("20. Identificação de isenção de CPMF: " + idenfiticacaoIsencaoCpmf);
        if (dataContabil != null) {
            System.out.println("21. Data contábil: " + sdf.format(dataContabil));
        } else {
            System.out.println("21. Data contábil: " + dataContabil);
        }
        System.out.println("22. Data lançamento: " + sdf.format(dataLancamento));
        System.out.println("23. Valor do lançamento: " + valorLancamento);
        System.out.println("24. Tipo do lançamento: " + tipoLancamento);
        System.out.println("25. Categoria do lançamento: " + categoriaLancamento);
        System.out.println("26. Código histórico no lançamento " + codigoLancamento);
        System.out.println("27. Histórico: " + historico);
//        System.out.println("34. Agência de origem do lançamento: " + agenciaDeOrigemLancamento);
//        System.out.println("35. Complemento de registro: " + complemento);
//        System.out.println("36. Conta de origem do laçamento: " + contaDeOrigemLancamento);
//        System.out.println("37. DAC: " + dacAgContaOrigem);
//        System.out.println("38. Tipo de inscrição do emitente: " + tipoInscricaoEmitente);
//        System.out.println("39. Número de inscrição do emitente: " + numeroInscricaoEmitente);
//        System.out.println("40. Brancos4: " + brancos4);
        System.out.println("28. Número do documento: " + numeroDocumento);
    }

    private void trataTrailerLote(LineModel line) {
        //01
        String codigoBanco = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.CODIGO_BANCO);
        //02
        int codigoLote = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.LOTE_SERVICO).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.TIPO_REGISTRO);
        //04
        String brancos = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.BRANCOS);
        //05
        int tipoInscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.TIPO_INSCRICAO).intValue();
        //06
        long inscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.NUM_INSCRICAO_EMPRESA).longValue();
        //07
//        String brancos2 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.BRANCOS2);
        //08
        String convenio = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.CONVENIO);
        //09
//        String zeros = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.ZEROS);
        //10
        int agenciaMantenedora = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.AGENCIA_MANTENEDORA).intValue();
        //11
        String digitoAgenciaCedente = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.DIGITO_VER_AGENCIA);
        //12
//        String zeros2 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.ZEROS2);
        //13
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.NUMERO_CONTA_COR).intValue();
        //14
        String digitoVerificadorConta = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.BRANCOS3);
        //15
        String teste = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.DIGITO_VER_AG_CONTA);
        int digitoVerificadorAgenciaConta = 0;
        if (teste != null) {
            digitoVerificadorAgenciaConta = Integer.parseInt(teste);
        }
        //16
        String brancos4 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.BRANCOS4);
        //17
        double saldoBloqueadoAcima24 = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.SALDO_BLOQUEADO_ACIMA_24).doubleValue();
        //18
        double limiteConta = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.LIMITE_CONTA).doubleValue();
        //19
        double saldoBloqueadoAte24 = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.SALDO_BLOQUEADO_ATE_24).doubleValue();
        //20
        Date dataFinal = line.getFieldValueDate(LineCnab240v05TrailerLoteExtratoLayout033.DATA_FINAL);
        //21
        double saldoFinal = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.SALDO_FINAL).doubleValue();
        //22
        String situacaoSaldoFinal = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.SITUACAO_SALDO_FINAL);
        //23
        String statusSaldoFinal = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.STATUS_SALDO_FINAL);
        //24
        int quantidadeRegistrosLote = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.QTDE_REGISTROS_LOTE).intValue();
        //25
        double totalValorDebito = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.TOTAL_VALOR_DEBITO).doubleValue();
        //26
        double totalValorCredito = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.TOTAL_VALOR_CREDITO).doubleValue();
        //27
//        double totalValoresNaoContabeis = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtratoLayout033.TOTAL_VALORES_NAO_CONTABEIS).doubleValue();
        //28
        String brancos5 = line.getFieldValueString(LineCnab240v05TrailerLoteExtratoLayout033.BRANCOS5);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\nTrailer do lote");
        System.out.println("01. Código do banco: " + codigoBanco);
        System.out.println("02. Código do lote: " + codigoLote);
        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Brancos: " + brancos);
        System.out.println("05. Tipo de inscrição da empresa: " + tipoInscricaoEmpresa);
        System.out.println("06. Número de inscrição da empresa: " + inscricaoEmpresa);
//        System.out.println("07. Brancos2: " + brancos2);
        System.out.println("07. Convênio: " + convenio);
//        System.out.println("09. Zeros: " + zeros);
        System.out.println("08. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("09. Dígito Ag.: " + digitoAgenciaCedente);
//        System.out.println("12. Zeros2: " + zeros2);
        System.out.println("10. Número da conta corrente: " + numeroContaCorrente);
        System.out.println("11. Digito verificador Conta: " + digitoVerificadorConta);
        System.out.println("12. Dígito verificador Ag./Cta.: " + digitoVerificadorAgenciaConta);
        System.out.println("13. Exclusivo Febraban: " + brancos4);
        System.out.println("14. Saldo bloqueado acima de 24h: " + saldoBloqueadoAcima24);
        System.out.println("15. Limite da conta: " + limiteConta);
        System.out.println("16. Saldo bloqueado até 24h: " + saldoBloqueadoAte24);
        System.out.println("17. Data final: " + sdf.format(dataFinal));
        System.out.println("18. Saldo final: " + saldoFinal);
        System.out.println("19. Situação do saldo final: " + situacaoSaldoFinal);
        System.out.println("20. Status do saldo final: " + statusSaldoFinal);
        System.out.println("21. Quantidade de registros do lote: " + quantidadeRegistrosLote);
        System.out.println("22. Valor total débito: " + totalValorDebito);
        System.out.println("23. Valor total crédito: " + totalValorCredito);
//        System.out.println("27. Total de valores não contábeis: " + totalValoresNaoContabeis);
        System.out.println("24. Brancos5: " + brancos5);
    }

    private void trataTrailerArquivo(LineModel line) {
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
        System.out.println("\nTrailer do arquivo");
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
