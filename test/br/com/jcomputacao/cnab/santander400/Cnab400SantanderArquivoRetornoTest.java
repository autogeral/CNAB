/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.LineCnabRegistroHeaderRetorno;
import br.com.jcomputacao.cnab.LineCnabRegistroMovimentoRetorno;
import br.com.jcomputacao.cnab.LineCnabRegistroTraillerRetorno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Nieri
 */
public class Cnab400SantanderArquivoRetornoTest {

    public Cnab400SantanderArquivoRetornoTest() {
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
    public void testConsulta() throws ParseException {
        System.out.println("consulta");
        Cnab400SantanderLoteRetorno retorno = new Cnab400SantanderLoteRetorno();


        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
        //LineCnabRegistroHeaderRetorno
        //Long codigoRegistro;
        Long codigoRemessa = 2L;
        String literalTransmissao = "RETORNO";
        Long codigoServico = 1L;
        String literalServico = "COBRANCA";
        Long codigoAgenciaCedente = 65L;
        Long contaMovimentoCedente = 48000041L;
        Long contaCobrancaCedente = 1900127L;
        String nomeCedente = "AUTO GERAL DE ITU LTDA";
        Long codigoBanco = 33L;
        String nomeBanco = "SANTANDER";
        Date dataMovimento = sdf.parse("160609");
        String codigoCedente = "1";
        Long numeroVersao = 555L;
        Long numeroSequencialRegistroArquivo = 1L;

        Long tipoInscricaoCedente = 2L;
        Long cgcCpfCedente = 5437537000137L;
        String numeroControleParticipante = "00063030";
        Long nossoNumero1 = 40616060L;
        Long codigoCarteira = 9L;
        Long codigoOcorrencia = 1L;
        Date dataOcorrencia = sdf.parse("160609");
        String seuNumero = "28";
        Long nossoNumero2 = 16703301L;
        Long codigoOriginalRemessa = 68L;
        String codigoErroPrimeiraOcorrencia = "601";
        String codigoErroSegundaOcorrencia = "";
        String codigoErroTerceiraOcorrencia = "";
        Date dataVencimentoTitulo = sdf.parse("190609");
        Double valorTitulo = 947d;
        Long numeroBancoCobrador = 33L;
        Long codigoAgenciaRecebedoraTitulo = 65L;
        Long especieDocumento = 1L;
        Double valorTarifaCobrada = 0d;
        Double valorOutrasDespesas = 0d;
        Double valorJurosAtraso = 0d;
        Double valorIofDevido = 0d;
        Double valorAbatimentoConcedido = 0d;
        Double valorDescontoConcedido = 0d;
        Double valorTotalRecebido = 0d;
        Double valorJurosMora = 0d;
        Double valorOutrosCreditos = 0d;
        String codigoAceite = "N";
        Date dataCredito = sdf.parse("160609");
        String nomeSacado = "MURILO NIERI";
        String identificadorComplemento = " ";
        Long unidadeValorMoedaCorrente = 0L;
        Double valorTituloOutraUnidadeValor = 0d;
        Double valorIocOutraUnidadeValor = 0d;
        Double valorDebitoCredito = 0d;
        String debitoCredito = "C";

        Long quantidadeRegistrosCobrancasSimplesReferenteCedente = 0L;
        Double valorTitulosCobrancaSimplesReferenteCedente = 0d;
        Long numeroAvisoCobrancaSimples = 0L;
        Long quantidadeRegistrosCobrancasCaucionadaReferenteCedente = 0L;
        Double valorTitulosCobrancaCaucionadaReferenteCedente = 0d;
        Long numeroAvisoCobrancaCaucionada = 0L;
        Long quantidadeRegistrosCobrancasDescontadaReferenteCedente = 0L;
        Double valorTitulosCobrancaDescontadaReferenteCedente = 0d;
        Long numeroAvisoCobrancaDescontada = 0L;


        retorno.setCodigoRemessa(codigoRemessa);
        retorno.setLiteralTransmissao(literalTransmissao);
        retorno.setCodigoServico(codigoServico);
        retorno.setLiteralServico(literalServico);
        retorno.setCodigoAgenciaCedente(codigoAgenciaCedente);
        retorno.setContaMovimentoCedente(contaMovimentoCedente);
        retorno.setContaCobrancaCedente(contaCobrancaCedente);
        retorno.setNomeCedente(nomeCedente);
        retorno.setCodigoBanco(codigoBanco);
        retorno.setNomeBanco(nomeBanco);
        retorno.setDataMovimento(dataMovimento);
        retorno.setCodigoCedente(codigoCedente);
        retorno.setNumeroVersao(numeroVersao);
        retorno.setNumeroSequencialRegistroArquivo(numeroSequencialRegistroArquivo);

//        retorno.setTipoInscricaoCedente(tipoInscricaoCedente);
//        retorno.setCgcCpfCedente(cgcCpfCedente);
//        retorno.setNumeroControleParticipante(numeroControleParticipante);
//        retorno.setNossoNumero1(nossoNumero1);
//        retorno.setCodigoCarteira(codigoCarteira);
//        retorno.setCodigoOcorrencia(codigoOcorrencia);
//        retorno.setDataOcorrencia(dataOcorrencia);
//        retorno.setSeuNumero(seuNumero);
//        retorno.setNossoNumero2(nossoNumero2);
//        retorno.setCodigoOriginalRemessa(codigoOriginalRemessa);
//        retorno.setCodigoErroPrimeiraOcorrencia(codigoErroPrimeiraOcorrencia);
//        retorno.setCodigoErroSegundaOcorrencia(codigoErroSegundaOcorrencia);
//        retorno.setCodigoErroTerceiraOcorrencia(codigoErroTerceiraOcorrencia);
//        retorno.setDataVencimentoTitulo(dataVencimentoTitulo);
//        retorno.setValorTitulo(valorTitulo);
//        retorno.setNumeroBancoCobrador(numeroBancoCobrador);
//        retorno.setCodigoAgenciaRecebedoraTitulo(codigoAgenciaRecebedoraTitulo);
//        retorno.setEspecieDocumento(especieDocumento);
//        retorno.setValorTarifaCobrada(valorTarifaCobrada);
//        retorno.setValorOutrasDespesas(valorOutrasDespesas);
//        retorno.setValorJurosAtraso(valorJurosAtraso);
//        retorno.setValorIofDevido(valorIofDevido);
//        retorno.setValorAbatimentoConcedido(valorAbatimentoConcedido);
//        retorno.setValorDescontoConcedido(valorDescontoConcedido);
//        retorno.setValorTotalRecebido(valorTotalRecebido);
//        retorno.setValorJurosMora(valorJurosMora);
//        retorno.setValorOutrosCreditos(valorOutrosCreditos);
//        retorno.setCodigoAceite(codigoAceite);
//        retorno.setNomeSacado(nomeSacado);
//        retorno.setIdentificadorComplemento(identificadorComplemento);
//        retorno.setUnidadeValorMoedaCorrente(unidadeValorMoedaCorrente);
//        retorno.setValorTituloOutraUnidadeValor(valorTituloOutraUnidadeValor);
//        retorno.setValorIocOutraUnidadeValor(valorIocOutraUnidadeValor);
//        retorno.setValorDebitoCredito(valorDebitoCredito);
//        retorno.setDebitoCredito(debitoCredito);


        retorno.setQuantidadeRegistrosCobrancasSimplesReferenteCedente(quantidadeRegistrosCobrancasSimplesReferenteCedente);
        retorno.setValorTitulosCobrancaSimplesReferenteCedente(valorTitulosCobrancaSimplesReferenteCedente);
        retorno.setNumeroAvisoCobrancaSimples(numeroAvisoCobrancaSimples);
        retorno.setQuantidadeRegistrosCobrancasCaucionadaReferenteCedente(quantidadeRegistrosCobrancasCaucionadaReferenteCedente);
        retorno.setValorTitulosCobrancaCaucionadaReferenteCedente(valorTitulosCobrancaCaucionadaReferenteCedente);
        retorno.setNumeroAvisoCobrancaCaucionada(numeroAvisoCobrancaCaucionada);
        retorno.setQuantidadeRegistrosCobrancasDescontadaReferenteCedente(quantidadeRegistrosCobrancasDescontadaReferenteCedente);
        retorno.setValorTitulosCobrancaDescontadaReferenteCedente(valorTitulosCobrancaDescontadaReferenteCedente);
        retorno.setNumeroAvisoCobrancaDescontada(numeroAvisoCobrancaDescontada);



        LineArchetype lar = new LineCnabRegistroHeaderRetorno();
        LineModel line = lar.createModel();
        //line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_REGISTRO, codigoRegistro);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_REMESSA, codigoRemessa);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.LITERAL_TRANSMISSAO, literalTransmissao);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_SERVICO, codigoServico);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.LITERAL_SERVICO, literalServico);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_AGENCIA_CEDENTE, codigoAgenciaCedente);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CONTA_MOVIMENTO_CEDENTE, contaMovimentoCedente);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CONTA_COBRANCA_CEDENTE, contaCobrancaCedente);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NOME_CEDENTE, nomeCedente);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_BANCO, codigoBanco);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.DATA_MOVIMENTO, dataMovimento);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_CEDENTE, codigoCedente);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NUMERO_VERSAO, numeroVersao);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, numeroSequencialRegistroArquivo);

        LineArchetype la = new LineCnabRegistroMovimentoRetorno();
        line = la.createModel();

        //line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_REGISTRO, numeroChequeFinal);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.TIPO_INSCRICAO_CEDENTE, tipoInscricaoCedente);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CGC_CPF_CEDENTE, cgcCpfCedente);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_AGENCIA_CEDENTE, codigoAgenciaCedente);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CONTA_MOVIMENTO_CEDENTE, contaMovimentoCedente);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CONTA_COBRANCA_CEDENTE, contaCobrancaCedente);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_CONTROLE_PARTICIPANTE, numeroControleParticipante);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NOSSO_NUMERO_1, nossoNumero1);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_CARTEIRA, codigoCarteira);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DATA_OCORRENCIA, dataOcorrencia);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.SEU_NUMERO, seuNumero);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NOSO_NUMERO_2, nossoNumero2);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ORIGINAL_REMESSA, codigoOriginalRemessa);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_PRIMEIRA_OCORRENCIA, codigoErroPrimeiraOcorrencia);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_SEGUNDA_OCORRENCIA, codigoErroSegundaOcorrencia);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_TERCEIRA_OCORRENCIA, codigoErroTerceiraOcorrencia);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DATA_VENCIMENTO_TITULO, dataVencimentoTitulo);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TITULO, valorTitulo);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_BANCO_COBRADOR, numeroBancoCobrador);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_AGENCIA_RECEBEDORA_TITULO, codigoAgenciaRecebedoraTitulo);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.ESPECIE_DOCUMENTO, especieDocumento);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TARIFA_COBRADA, valorTarifaCobrada);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_OUTRAS_DESPESAS, valorOutrasDespesas);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_JUROS_ATRASO, valorJurosAtraso);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_IOF_DEVIDO, valorIofDevido);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_ABATIMENTO_CONCEDIDO, valorAbatimentoConcedido);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_DESCONTO_CONCEDIDO, valorDescontoConcedido);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TOTAL_RECEBIDO, valorTotalRecebido);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_JUROS_MORA, valorJurosMora);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_OUTROS_CREDITOS, valorOutrosCreditos);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ACEITE, codigoAceite);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DATA_CREDITO, dataCredito);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NOME_SACADO, nomeSacado);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.IDENTIFICADOR_COMPLEMENTO, identificadorComplemento);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.UNIDADE_VALOR_MOEDA_CORRENTE, unidadeValorMoedaCorrente);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TITULO_OUTRA_UNIDADE_VALOR, valorTituloOutraUnidadeValor);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_IOC_OUTRA_UNIDADE_VALOR, valorIocOutraUnidadeValor);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_DEBITO_CREDITO, valorDebitoCredito);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DEBITO_CREDITO, debitoCredito);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_VERSAO, numeroVersao);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, numeroSequencialRegistroArquivo);


        LineArchetype lac = new LineCnabRegistroTraillerRetorno();
        line = lac.createModel();

        //line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_REGISTRO, codigoRegistro);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_REMESSA, codigoRemessa);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_SERVICO, codigoServico);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_BANCO, codigoBanco);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE, quantidadeRegistrosCobrancasSimplesReferenteCedente);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE, valorTitulosCobrancaSimplesReferenteCedente);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_SIMPLES, numeroAvisoCobrancaSimples);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_CAUCIONADA_REFERENTE_CEDENTE, quantidadeRegistrosCobrancasCaucionadaReferenteCedente);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_CAUCIONADA_REFERENTE_CEDENTE, valorTitulosCobrancaCaucionadaReferenteCedente);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_CAUCIONADA, numeroAvisoCobrancaCaucionada);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_DESCONTADA_REFERENTE_CEDENTE, quantidadeRegistrosCobrancasDescontadaReferenteCedente);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_DESCONTADA_REFERENTE_CEDENTE, valorTitulosCobrancaDescontadaReferenteCedente);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_DESCONTADA, numeroAvisoCobrancaDescontada);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_VERSAO, numeroVersao);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, numeroSequencialRegistroArquivo);
    }
}
//    /**
//     * Test of getIStream method, of class Cnab400SantanderArquivoRetorno.
//     */
//    @Test
//    public void testGetIStream() {
//        System.out.println("getIStream");
//        Cnab400SantanderArquivoRetorno instance = new Cnab400SantanderArquivoRetorno();
//        InputStream expResult = null;
//        InputStream result = instance.getIStream();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIStream method, of class Cnab400SantanderArquivoRetorno.
//     */
//    @Test
//    public void testSetIStream() {
//        System.out.println("setIStream");
//        InputStream iStream = null;
//        Cnab400SantanderArquivoRetorno instance = new Cnab400SantanderArquivoRetorno();
//        instance.setIStream(iStream);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOStream method, of class Cnab400SantanderArquivoRetorno.
//     */
//    @Test
//    public void testGetOStream() {
//        System.out.println("getOStream");
//        Cnab400SantanderArquivoRetorno instance = new Cnab400SantanderArquivoRetorno();
//        OutputStream expResult = null;
//        OutputStream result = instance.getOStream();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOStream method, of class Cnab400SantanderArquivoRetorno.
//     */
//    @Test
//    public void testSetOStream() {
//        System.out.println("setOStream");
//        OutputStream oStream = null;
//        Cnab400SantanderArquivoRetorno instance = new Cnab400SantanderArquivoRetorno();
//        instance.setOStream(oStream);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consulta method, of class Cnab400SantanderArquivoRetorno.
//     */
//    @Test
//    public void testConsulta() {
//        System.out.println("consulta");
//        Cnab400SantanderLoteRetorno lote = null;
//        Cnab400SantanderArquivoRetorno instance = new Cnab400SantanderArquivoRetorno();
//        Cnab400SantanderLoteRetorno expResult = null;
//        Cnab400SantanderLoteRetorno result = instance.consulta(lote);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStringBuffer method, of class Cnab400SantanderArquivoRetorno.
//     */
//    @Test
//    public void testGetStringBuffer() {
//        System.out.println("getStringBuffer");
//        Cnab400SantanderArquivoRetorno instance = new Cnab400SantanderArquivoRetorno();
//        StringBuffer expResult = null;
//        StringBuffer result = instance.getStringBuffer();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//}