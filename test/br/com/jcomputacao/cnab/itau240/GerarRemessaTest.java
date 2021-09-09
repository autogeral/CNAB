package br.com.jcomputacao.cnab.itau240;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    01.09.2021
 */

public class GerarRemessaTest {
    @Test
    public void gerarRemessa() throws ParseException, IOException {
        LineCnabRegistroHeaderRemessa headerArquivo  = new LineCnabRegistroHeaderRemessa();
        headerArquivo.setCodigoBanco("341");
        headerArquivo.setCodigoLote("0000");//SEMPRE VAI SER ESSE CÓDIGO
        headerArquivo.setTipoRegistro("0");
        headerArquivo.setBrancos1("");
        headerArquivo.setCodigoInscricao("2");
        headerArquivo.setInscricaoNumero("05437537000137");
        headerArquivo.setBrancos2("");
        headerArquivo.setZeros1("0");
        headerArquivo.setAgencia("0278");
        headerArquivo.setBrancos3("");
        headerArquivo.setZeros2("0000000");
        headerArquivo.setConta("92471");
        headerArquivo.setBrancos4("");
        headerArquivo.setDac("7");
        headerArquivo.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerArquivo.setNomeBanco("BANCO ITAU SA");
        headerArquivo.setBrancos5("");
        headerArquivo.setCodigoArquivo("1");
        headerArquivo.setDataGeracao("09092021");
        headerArquivo.setHoraGeracao("145936");
        headerArquivo.setNumSeqArquivoRetorno("000001");
        headerArquivo.setLayoutArquivo("040");
        headerArquivo.setZeros3("00000");
        headerArquivo.setBranco6("");
        headerArquivo.setZeros4("000");
        headerArquivo.setBrancos7("");
        
        
        LineCnabRegistroHeaderLoteRemessa headerLote = new LineCnabRegistroHeaderLoteRemessa();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001"); 
        headerLote.setTipoRegistro("1");
        headerLote.setOperacao("R");
        headerLote.setCodigoServico("01");
        headerLote.setZeros1("00");
        headerLote.setLayoutLote("030"); // CONTEÚDO FIXO
        headerLote.setBrancos1("");
        headerLote.setCodigoInscricao("2");
        headerLote.setInscricaoNumero("05437537000137");
        headerLote.setBrancos2("");
        headerLote.setZeros2("0");
        headerLote.setAgencia("0278");
        headerLote.setBrancos3("");
        headerLote.setZeros3("0000000");
        headerLote.setConta("92471");
        headerLote.setBrancos4("");
        headerLote.setDac("7"); 
        headerLote.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLote.setBrancos5("");
        headerLote.setNumSeqArquivoRet("00000001");
        headerLote.setDataGravacao("09092021");
        headerLote.setDataCredito("09092021");
        headerLote.setBrancos6("");
        
        
        LineCnabRegistroSegmentoPRemessa segmentoP = new LineCnabRegistroSegmentoPRemessa();
        segmentoP.setCodigoBanco("341");
        segmentoP.setCodigoLote("0001");
        segmentoP.setTipoRegistro("3");
        segmentoP.setNumRegistro("00001");
        segmentoP.setSegmento("P");
        segmentoP.setBrancos1("");
        segmentoP.setCodOcorrencia("01");
        segmentoP.setZeros1("0");
        segmentoP.setAgencia("0278");
        segmentoP.setBrancos2("");
        segmentoP.setZeros2("0000000");
        segmentoP.setConta("92471");
        segmentoP.setBrancos3("");
        segmentoP.setDac1("7");
        segmentoP.setNumCarteira("109");
        segmentoP.setNossoNumero("00000001");
        segmentoP.setDac2("6");
        segmentoP.setBrancos4("");
        segmentoP.setZeros3("00000");
        segmentoP.setNumDocumento("0000000001"); // NÚMERO DO DOCUMENTO (SEU NÚMERO)
        segmentoP.setBrancos5("");
        segmentoP.setVencimento("30092021");
        segmentoP.setValorTitulo("000000000002000");
        segmentoP.setAgCobradora("00000");
        segmentoP.setDac3("0");
        segmentoP.setEspecieTitulo("01");
        segmentoP.setAceite("N");
        segmentoP.setDataEmissaoTitulo("01092021");
        segmentoP.setZeros4("0");
        segmentoP.setDataJurosMora("30092021"); // O JUROS SERÁ COBRADO A PARTIR DO VENCIMENTO DO DDA 
        segmentoP.setJuros1Dia("000000000000004"); // JUROS POR DIA
        segmentoP.setZeros5("0");
        segmentoP.setData1Desconto("00000000");
        segmentoP.setValor1Desconto("000000000000000");
        segmentoP.setValorIof("000000000000000");
        segmentoP.setValorAbatimento("000000000000000");
        segmentoP.setUsoEmpresa("");
        segmentoP.setCodigoNegativacaoProtesto("0"); //0 - SEM INTRUÇÕES0, 1 - PROTESTAR (Dias corridos), 2 - PROTESTAR (Dias Úteis), 7 - NEGATIVAR (Dias Corridos), 8 - NÃO NEGATIVAR, 3 - NÃO PROTESTAR
        segmentoP.setPrazoNegativacaoProtesto("0"); // A PARTIR DO VENCIMENTO
        segmentoP.setCodBaixa("0"); // 0 - SEM INSTRUÇÃO, 1 - BAIXAR EM (A partir do vencimento), 2 - BAIXAR APÓS 365 DIAS DO VENCIMENTO  
        segmentoP.setPrazoBaixa("00"); // A PARTIR DO VENCIMENTO
        segmentoP.setZeros6("0000000000000");
        segmentoP.setBrancos6("");
        
        
        LineCnabRegistroSegmentoQRemessa segmentoQ = new LineCnabRegistroSegmentoQRemessa();
        segmentoQ.setCodigoBanco("341");
        segmentoQ.setCodigoLote("0001");
        segmentoQ.setTipoRegistro("3");
        segmentoQ.setNumRegistro("00002");
        segmentoQ.setSegmento("Q");
        segmentoQ.setBrancos1("");
        segmentoQ.setCodOcorrencia("01");
        segmentoQ.setCodigoInscricao1("2");
        segmentoQ.setInscricaoNumero1("05437537000218");
        segmentoQ.setNome("AUTO GERAL AUTOPECAS LTDA");
        segmentoQ.setBrancos2("");
        segmentoQ.setLogradouro("AV. Dom Pedro II,1090");
        segmentoQ.setBairro("Centro");
        segmentoQ.setCep("13320");
        segmentoQ.setSufixoCep("903");
        segmentoQ.setCidade("SALTO");
        segmentoQ.setUf("SP");
        segmentoQ.setCodigoInscricao2("2");
        segmentoQ.setInscricaoNumero2("05437537000137");
        segmentoQ.setSacadorAvalista("AUTO GERAL AUTOPECAS LTDA");
        segmentoQ.setBrancos3("");
        segmentoQ.setZeros("000");
        segmentoQ.setBrancos4("");
        
        
        LineCnabRegistroSegmentoRRemessa segmentoR = new LineCnabRegistroSegmentoRRemessa();
        segmentoR.setCodigoBanco("341");
        segmentoR.setCodigoLote("0001");
        segmentoR.setTipoRegistro("3");
        segmentoR.setNumRegistro("00003");
        segmentoR.setSegmento("R");
        segmentoR.setBrancos1("");
        segmentoR.setCodOcorrencia("01");
        segmentoR.setZeros1("0");
        segmentoR.setData2Desconto("01102021");
        segmentoR.setValor2Desconto("000000000000000");
        segmentoR.setZeros2("0");
        segmentoR.setData3Desconto("00000000");
        segmentoR.setValor3Desconto("000000000000000");
        segmentoR.setCodMulta("1");//0 - NÃO REGISTRAR A MULTA, 1 - VALOR EM REAIS (FIXO), 2 - VALOR EM PERCENTUAL COM DUA CASAS DECIMAIS CONFORME ESTRUTURA DO CAMPO
        segmentoR.setDataMulta("30092021");// A PARTIR DO VENCIMENTO
        segmentoR.setMulta("00000000000004");
        segmentoR.setBrancos2("");
        segmentoR.setInfoPagador("");
        segmentoR.setBrancos3("");
        segmentoR.setCodOcPagador("00000000");
        segmentoR.setZeros3("00000000");
        segmentoR.setBrancos4("");
        segmentoR.setZeros4("000000000000");
        segmentoR.setBranco5("");
        segmentoR.setZeros5("0");
        segmentoR.setBrancos6("");

        
        LineCnabRegistroTrailerLote trailerLote = new LineCnabRegistroTrailerLote();
        trailerLote.setCodigoBanco("341");
        trailerLote.setCodigoLote("0001");// SOMA DO REGISTRO TIPO 1
        trailerLote.setTipoRegistro("5");
        trailerLote.setBrancos1("");
        trailerLote.setQtdeRegistros("000005");//SOMA DOS TIPOS 1,3 e 5
        trailerLote.setQtdeCobrancaSimples("000000");
        trailerLote.setValorCobrancaSimples("00000000000000000");
        trailerLote.setQtdeCobrancaVinculada("000000");
        trailerLote.setValorCobrancaVinculada("00000000000000000");
        trailerLote.setZeros("000000000000000000000000000000000000000000000");
        trailerLote.setAvisoBancario("");
        trailerLote.setBrancos2("");
        
        
        LineCnabRegistroTrailerArquivo trailerArquivo = new LineCnabRegistroTrailerArquivo ();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");//SEMPRE VAI SER ESSE CÓDIGO
        trailerArquivo.setRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalLotes("000001");// SOMA DO REGISTRO TIPO 1
        trailerArquivo.setTotalRegistros("000007");// SOMA DOS TIPOS 0,1,3,5 e 9
        trailerArquivo.setZeros("000000");
        trailerArquivo.setBrancos2("");          
              
        String resultHeader = headerArquivo.getRepresentation(headerArquivo);
        System.out.println(resultHeader);
        
        String resultHeaderLote = headerLote.getRepresentation(headerLote);
        System.out.println(resultHeaderLote);
        
        String resultP = segmentoP.getRepresentation(segmentoP);
        System.out.println(resultP);
        
        String resultQ = segmentoQ.getRepresentation(segmentoQ);
        System.out.println(resultQ);
        
        String resultR = segmentoR.getRepresentation(segmentoR);
        System.out.println(resultR);
 
        String resultTrailerLote = trailerLote.getRepresentation(trailerLote);
        System.out.println(resultTrailerLote);
        
        String resultTrailerArquivo = trailerArquivo.getRepresentation(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\CI240_R.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(headerArquivo.getRepresentation(headerArquivo));
        gravar.println(headerLote.getRepresentation(headerLote));
        gravar.println(segmentoP.getRepresentation(segmentoP));
        gravar.println(segmentoQ.getRepresentation(segmentoQ));
        gravar.println(segmentoR.getRepresentation(segmentoR));
        gravar.println(trailerLote.getRepresentation(trailerLote));
        gravar.println(trailerArquivo.getRepresentation(trailerArquivo));
        
        gravar.close();        
       }
    }