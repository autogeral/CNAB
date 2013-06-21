package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class TestFile {
    //Método construtor

    public TestFile() {
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
    public void TestFile() throws ParseException, IOException {
        File dir = new File("C:/Users/Cesário/Documents/NetBeansProjects/CNAB/doc/exemplos/Itau/Conciliacao");
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
            //Header do arquivof
            case 0:
                la = new LineCnab240v05HeaderArquivoExtrato();
                line = la.createModel();
                line.setRepresentation(linha);
                trataHeaderArquivo(line);
                break;
            //Header do lote
            case 1:
                la = new LineCnab240v05HeaderLoteExtrato();
                line = la.createModel();
                line.setRepresentation(linha);
                trataHeaderLote(line);
                break;
            //Registro de detalhe - SEGMENTO E
            case 3:
                la = new LineCnabv05SegmentoEExtrato();
                line = la.createModel();
                line.setRepresentation(linha);
                trataSegmentoE(line);
                break;
            //Trailer do lote
            case 5:
                la = new LineCnab240v05TrailerLoteExtrato();
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
        //--3
        String codigoBanco = line.getFieldValue(LineCnab240v05HeaderArquivoExtrato.CODIGO_BANCO).toString();
        //02
        //--4
        String lote = line.getFieldValue(LineCnab240v05HeaderArquivoExtrato.CODIGO_LOTE).toString();
        //03
        //--1
        String tipoRegistro = line.getFieldValue(LineCnab240v05HeaderArquivoExtrato.TIPO_REGISTRO).toString();
        //04
        //--9
        String brancos = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.BRANCOS);
        //05
        //--1
        int tipoIncricaoEmpresa = line.getFieldValueNumber(LineCnab240v05HeaderArquivoExtrato.TIPO_INSCRICAO).intValue();
        //06
        //--14
        String numeroInscricaoEmpresa = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.NUMERO_INSCRICAO);
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
        String numeroContaCorrente = line.getFieldValueString(LineCnab240v05HeaderArquivoExtrato.NUMERO_CONTA_COR);
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:MM:SS");

        System.out.println("\nHeader do arquivo");
        System.out.println("01. Código do banco: " + codigoBanco);
//        System.out.println("02. Código do lote: " + lote);
//        System.out.println("03. Tipo de registro: " + tipoRegistro);
//        System.out.println("04. Brancos: " + brancos);
        System.out.println("05. Tipo de inscrição: " + tipoIncricaoEmpresa);
        System.out.println("06. Número de inscrição: " + numeroInscricaoEmpresa);
//        System.out.println("07. Brancos2: " + brancos2);
        System.out.println("08. Convênio: " + convenio);
//        System.out.println("09. Zeros: " + zeros);
        System.out.println("10. Agência mantenedora: " + agenciaMantenedora);
        System.out.println("11. Dígito verificador da conta: " + digitoVerificadorConta);
//        System.out.println("12. Zeros2: " + zeros2);
        System.out.println("13. Conta corrente: " + numeroContaCorrente + " - " + digitoVerificadorAgenciaConta);
//        System.out.println("14. Brancos3: " + brancos3);
//        System.out.println("15. Dígito ver. ag./cta.: " + digitoVerificadorAgenciaConta);
        System.out.println("16. Nome da empresa: " + nomeEmpresa);
        System.out.println("17. Nome do Banco: " + nomeBanco);
//        System.out.println("18. Brancos4: " + brancos4);
//        System.out.println("19. Código remessa retorno: " + codigoRemessaRetorno);
        System.out.println("20. Geração do arquivo: " + sdf.format(dataGeracaoArquivo) + " às " + sdf2.format(horaGeracaoArquivo));
//        System.out.println("21. Hora geração do arquivo: " + sdf2.format(horaGeracaoArquivo));
        System.out.println("22. Número sequencial arquivo: " + numSequencialArquivo);
        System.out.println("23. Versão do layout: " + numeroVersaoLayout);
//        System.out.println("24. Zeros: " + zeros3);
//        System.out.println("25. Reservado uso banco: " + reservadoBanco);
//        System.out.println("26. brancos3: " + brancos5);
    }

    private void trataHeaderLote(LineModel line) {
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:MM:SS");

        System.out.println("\nHeader do lote");
//        System.out.println("01. Código banco: " + codigoBanco);
//        System.out.println("02. Lote: " + loteServico);
//        System.out.println("03. Tipo registro: " + tipoRegistro);
//        System.out.println("04. Tipo de operação: " + tipoOperacao);
//        System.out.println("05. Tipo de serviço: " + tipoServico);
//        System.out.println("06. Forma de lançamento: " + formaLancamento);
//        System.out.println("07. Layout: " + numeroVersaoLayout);
//        System.out.println("08. Brancos: " + brancos);
//        System.out.println("09. Tipo de inscrição da empresa: " + tipoInscricaoEmpresa);
//        System.out.println("10. Número de inscrição da empresa: " + inscricaoEmpresa);
//        System.out.println("11. Tipo de conta: " + tipoConta);
//        System.out.println("12. Brancos2: " + brancos2);
//        System.out.println("13. Convênio: " + convenio);
//        System.out.println("14. Zeros: " + zeros);
//        System.out.println("15. Agência mantenedora: " + agenciaCedente);
//        System.out.println("16. Dígito verificador da agência: " + digitoAgenciaCedente);
//        System.out.println("17. Zeros2: " + zeros2);
//        System.out.println("18. Número da conta corrente: " + numeroContaCorrente);
//        System.out.println("19. Brancos3: " + brancos3);
//        System.out.println("20. Dígito vertificador da agência/conta:" + digitoVerificadorAgConta);
//        System.out.println("21. Nome da empresa: " + nomeEmpresa);
//        System.out.println("22. Brancos4: " + brancos4);
        System.out.println("23. Data saldo inicial: " + sdf.format(dataInicial));
        System.out.println("24. Valor saldo inicial: " + valorSaldoInicial);
        System.out.println("25. Situação inicial: " + situacaoInicial);
        System.out.println("26. Status inicial: " + statusInicial);
//        System.out.println("27. Tipo de moeda: " + tipoMoeda);
//        System.out.println("28. Sequencia extrato: " + sequenciaExtrato);
//        System.out.println("29. Brancos5: " + brancos5);
    }

    private void trataSegmentoE(LineModel line) {
        //01
        int codigoBanco = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CODIGO_BANCO).intValue();
        //02
        int codigoLote = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CODIGO_LOTE).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnabv05SegmentoEExtrato.TIPO_REGISTRO);
        //04
        int numeroRegistro = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.NUMERO_REGISTRO).intValue();
        //05
        String codigoSegmento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.CODIGO_SEGMENTO);
        //06
        int identificacaoTipoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.IDENTIFICACAO_TIPO_LANCAMENTO).intValue();
        //07
        String brancos = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS);
        //08
        String tipoInscricaoCliente = line.getFieldValueString(LineCnabv05SegmentoEExtrato.TIPO_INSCRICAO);
        //09
        long numeroInscricao = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.NUMERO_INSCRICAO).longValue();
        //10
        String brancos2 = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS2);
        //11
        String convenio = line.getFieldValueString(LineCnabv05SegmentoEExtrato.CONVENIO);
        //12
        int zeros = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.ZEROS).intValue();
        //13
        int agenciaMantenedora = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AGENCIA_MANTENEDORA).intValue();
        //14
        String digitoVerificadorAgencia = line.getFieldValueString(LineCnabv05SegmentoEExtrato.DIGITO_VER_AGENCIA);
        //15
        int zeros2 = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.ZEROS2).intValue();
        //16
        int numeroContaCorrente = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.NUMERO_CONTA_CORRENTE).intValue();
        //17
        String brancos3 = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS3);
        //18
        String digitoVerificadosAgConta = line.getFieldValueString(LineCnabv05SegmentoEExtrato.DIGITO_VER_AG_CONTA);
        //19
        String nomeEmpresa = line.getFieldValueString(LineCnabv05SegmentoEExtrato.NOME_EMPRESA);
        //20
        String reservadoUsoBranco = line.getFieldValueString(LineCnabv05SegmentoEExtrato.RESERVADO_USO_BANCO);
        //21
        String naturezaLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.NATUREZA_LANCAMENTO);
        //22
        int tipoComplementoLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.TIPO_COMPLEMENTO) != null) {
            tipoComplementoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.TIPO_COMPLEMENTO).intValue();
        }
        //23
        int bancoOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.BANCO_ORIGEM_LANCAMENTO) != null) {
            bancoOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.BANCO_ORIGEM_LANCAMENTO).intValue();
        }
        //24
        int agenciaOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AGENCIA_ORIGEM_LANCAMENTO) != null) {
            agenciaOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AGENCIA_ORIGEM_LANCAMENTO).intValue();
        }
        //25
        long agenciaContaOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AG_CONTA_ORIGEM_LANCAMENTO) != null) {
            agenciaContaOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AG_CONTA_ORIGEM_LANCAMENTO).longValue();
        }
        //26
        String idenfiticacaoIsencaoCpmf = line.getFieldValueString(LineCnabv05SegmentoEExtrato.IDENTIFICACAO_INSENCAO_CPMF);
        //27
        Date dataContabil = line.getFieldValueDate(LineCnabv05SegmentoEExtrato.DATA_CONTABIL);
        //28
        Date dataLancamento = line.getFieldValueDate(LineCnabv05SegmentoEExtrato.DATA_LANCAMENTO);
        //29
        double valorLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.VALOR_LANCAMENTO).doubleValue();
        //30
        String tipoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.TIPO_LANCAMENTO);
        //31
        int categoriaLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CATEGORIA_LANCAMENTO).intValue();
        //32
        String codigoLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.CODIGO_LANCAMENTO);
        //33
        String historico = line.getFieldValueString(LineCnabv05SegmentoEExtrato.HISTORICO_LANCAMENTO);
        //34
        int agenciaDeOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AG_ORIGEM_LANCAMENTO) != null) {
            agenciaDeOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AG_ORIGEM_LANCAMENTO).intValue();
        }
        //35
        int complemento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.COMPLEMENTO_REGISTRO) != null) {
            complemento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.COMPLEMENTO_REGISTRO).intValue();
        }
        //36
        int contaDeOrigemLancamento = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CONTA_ORIGEM_LANCAMENTO) != null) {
            contaDeOrigemLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CONTA_ORIGEM_LANCAMENTO).intValue();
        }
        //37
        int dacAgContaOrigem = 0;
        if (line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.DAC_AG_CONTA_ORIGEM) != null) {
            dacAgContaOrigem = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.DAC_AG_CONTA_ORIGEM).intValue();
        }
        //38
        String tipoInscricaoEmitente = line.getFieldValueString(LineCnabv05SegmentoEExtrato.TIPO_INSCRICAO_EMITENTE);
        //39
        String numeroInscricaoEmitente = line.getFieldValueString(LineCnabv05SegmentoEExtrato.NUMERO_INSCRICAO_EMITENTE);
        //40
        String brancos4 = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS4);
        //41
        String numeroDocumento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.NUMERO_DOCUMENTO);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:MM:SS");

        System.out.println("\nSegmento 'E'");
//        System.out.println("01. Código do banco: " + codigoBanco);
//        System.out.println("02. Código do lote: " + codigoLote);
//        System.out.println("03. Tipo de registro: " + tipoRegistro);
        System.out.println("04. Número do registro: " + numeroRegistro);
//        System.out.println("05. Segmento: " + codigoSegmento);
        System.out.println("06. Lançamento: " + identificacaoTipoLancamento);
//        System.out.println("07. Brancos1: " + brancos);
//        System.out.println("08. Tipo de inscrição do cliente: " + tipoInscricaoCliente);
//        System.out.println("09. Número de inscrição do cliente: " + numeroInscricao);
//        System.out.println("10. Brancos2: " + brancos2);
//        System.out.println("11. Convênio: " + convenio);
//        System.out.println("12. Zeros1: " + zeros);
//        System.out.println("13. Agência mantenedora: " + agenciaMantenedora);
//        System.out.println("14. Dígito verificados da agência: " + digitoVerificadorAgencia);
//        System.out.println("15. Zeros2: " + zeros2);
//        System.out.println("16. Número da conta corrente: " + numeroContaCorrente);
//        System.out.println("17. Brancos3: " + brancos3);
//        System.out.println("18. Dígito verificados da agência/conta: " + digitoVerificadosAgConta);
//        System.out.println("19. Nome da empresa: " + nomeEmpresa);
//        System.out.println("20. Reservado uso banco: " + reservadoUsoBranco);
        System.out.println("21. Natureza do lançamento: " + naturezaLancamento);
        System.out.println("22. Tipo do complemento: " + tipoComplementoLancamento);
        System.out.println("23. Banco origem do lançamento: " + bancoOrigemLancamento);
        System.out.println("24. Agência origem do lançamento: " + agenciaOrigemLancamento);
        System.out.println("25. Ag./Conta origem do lançamento: " + agenciaContaOrigemLancamento);
        System.out.println("26. Identificação de isenção de CPMF: " + idenfiticacaoIsencaoCpmf);
        if (dataContabil != null) {
            System.out.println("27. Data contábil: " + sdf.format(dataContabil));
        } else {
            System.out.println("27. Data contábil: " + dataContabil);
        }
        System.out.println("28. Data lançamento: " + sdf.format(dataLancamento));
        System.out.println("29. Valor do lançamento: " + valorLancamento);
        System.out.println("30. Tipo do lançamento: " + tipoLancamento);
        System.out.println("31. Categoria do lançamento: " + categoriaLancamento);
        System.out.println("32. Código do lançamento: " + codigoLancamento);
        System.out.println("33. Histórico: " + historico);
//        System.out.println("34. Agência de origem do lançamento: " + agenciaDeOrigemLancamento);
//        System.out.println("35. Complemento de registro: " + complemento);
//        System.out.println("36. Conta de origem do laçamento: " + contaDeOrigemLancamento);
//        System.out.println("37. DAC: " + dacAgContaOrigem);
//        System.out.println("38. Tipo de inscrição do emitente: " + tipoInscricaoEmitente);
//        System.out.println("39. Número de inscrição do emitente: " + numeroInscricaoEmitente);
//        System.out.println("40. Brancos4: " + brancos4);
//        System.out.println("41. Número do documento: " + numeroDocumento);
    }

    private void trataTrailerLote(LineModel line) {
        //01
        String codigoBanco = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.CODIGO_BANCO);
        //02
        int codigoLote = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.LOTE_SERVICO).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.TIPO_REGISTRO);
        //04
        String brancos = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.BRANCOS);
        //05
        int tipoInscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.TIPO_INSCRICAO).intValue();
        //06
        long inscricaoEmpresa = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.NUM_INSCRICAO_EMPRESA).longValue();
        //07
        String brancos2 = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.BRANCOS2);
        //08
        String convenio = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.CONVENIO);
        //09
        String zeros = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.ZEROS);
        //10
        int agenciaMantenedora = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.AGENCIA_MANTENEDORA).intValue();
        //11
        String digitoAgenciaCedente = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.DIGITO_VER_AGENCIA);
        //12
        String zeros2 = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.ZEROS2);
        //13
        int numeroContaCorrente = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.NUMERO_CONTA_COR).intValue();
        //14
        String brancos3 = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.BRANCOS3);
        //15
        int digitoVerificadorAgConta = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.DIGITO_VER_AG_CONTA).intValue();
        //16
        String brancos4 = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.BRANCOS4);
        //17
        double saldoBloqueadoAcima24 = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.SALDO_BLOQUEADO_ACIMA_24).doubleValue();
        //18
        double limiteConta = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.LIMITE_CONTA).doubleValue();
        //19
        double saldoBloqueadoAte24 = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.SALDO_BLOQUEADO_ATE_24).doubleValue();
        //20
        Date dataFinal = line.getFieldValueDate(LineCnab240v05TrailerLoteExtrato.DATA_FINAL);
        //21
        double saldoFinal = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.SALDO_FINAL).doubleValue();
        //22
        String situacaoSaldoFinal = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.SITUACAO_SALDO_FINAL);
        //23
        String statusSaldoFinal = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.STATUS_SALDO_FINAL);
        //24
        int quantidadeRegistrosLote = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.QTDE_REGISTROS_LOTE).intValue();
        //25
        double totalValorDebito = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.TOTAL_VALOR_DEBITO).doubleValue();
        //26
        double totalValorCredito = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.TOTAL_VALOR_CREDITO).doubleValue();
        //27
        double totalValoresNaoContabeis = line.getFieldValueNumber(LineCnab240v05TrailerLoteExtrato.TOTAL_VALORES_NAO_CONTABEIS).doubleValue();
        //28
        String brancos5 = line.getFieldValueString(LineCnab240v05TrailerLoteExtrato.BRANCOS5);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:MM:SS");

        System.out.println("\nTrailer do lote");
//        System.out.println("01. Código do banco: " + codigoBanco);
//        System.out.println("02. Código do lote: " + codigoLote);
//        System.out.println("03. Tipo de registro: " + tipoRegistro);
//        System.out.println("04. Brancos: " + brancos);
//        System.out.println("05. Tipo de inscrição da empresa: " + tipoInscricaoEmpresa);
//        System.out.println("06. Número de inscrição da empresa: " + inscricaoEmpresa);
//        System.out.println("07. Brancos2: " + brancos2);
//        System.out.println("08. Convênio: " + convenio);
//        System.out.println("09. Zeros: " + zeros);
//        System.out.println("10. Agência mantenedora: " + agenciaMantenedora);
//        System.out.println("11. Dígito Ag.: " + digitoAgenciaCedente);
//        System.out.println("12. Zeros2: " + zeros2);
//        System.out.println("13. Número da conta corrente: " + numeroContaCorrente);
//        System.out.println("14. Brancos3: " + brancos3);
//        System.out.println("15. Dígito verificador Ag./Cta.: " + digitoVerificadorAgConta);
//        System.out.println("16. Brancos4: " + brancos4);
        System.out.println("17. Saldo bloqueado acima de 24h: " + saldoBloqueadoAcima24);
        System.out.println("18. Limite da conta: " + limiteConta);
        System.out.println("19. Saldo bloqueado até 24h: " + saldoBloqueadoAte24);
        System.out.println("20. Data final: " + sdf.format(dataFinal));
        System.out.println("21. Saldo final: " + saldoFinal);
        System.out.println("22. Situação do saldo final: " + situacaoSaldoFinal);
        System.out.println("23. Status do saldo final: " + statusSaldoFinal);
//        System.out.println("24. Quantidade de registros do lote: " + quantidadeRegistrosLote);
        System.out.println("25. Valor total débito: " + totalValorDebito);
        System.out.println("26. Valor total crédito: " + totalValorCredito);
        System.out.println("27. Total de valores não contábeis: " + totalValoresNaoContabeis);
//        System.out.println("28. Brancos5: " + brancos5);
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
//        System.out.println("01. Código do banco: " + codigoBanco);
//        System.out.println("02. Código do lote: " + codigoLote);
//        System.out.println("03. Tipo de registro: " + tipoRegistro);
//        System.out.println("04. Brancos: " + reservadoUsoBanco);
        System.out.println("05. Quantidade total de lotes: " + quantidadeLotesArquivo);
        System.out.println("06. Quantidade total de registros: " + quantidadeRegistrosArquivo);
        System.out.println("07. Quantidade de contas conciliação: " + quantidadeContasConcil);
//        System.out.println("08. Brancos: " + reservadoUsoBanco2);
    }
}
