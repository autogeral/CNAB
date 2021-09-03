package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
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
        LineCnabRegistroHeaderRemessa header  = new LineCnabRegistroHeaderRemessa();
        header.setCodigoBanco("341");
        header.setCodigoLote("0000");//sempre vai ser esse número
        header.setTipoRegistro("0");
        header.setBrancos1("");
        header.setCodigoInscricao("2");
        header.setInscricaoNumero("05437537000137");
        header.setBrancos2("");
        header.setZeros1("0");
        header.setAgencia("0278");
        header.setBrancos3("");
        header.setZeros2("0000000");
        header.setConta("92471");
        header.setBrancos4("");
        header.setDac("7");
        header.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        header.setNomeBanco("BANCO ITAU SA");
        header.setBrancos5("");
        header.setCodigoArquivo("1");
        header.setDataGeracao("01092021");
        header.setHoraGeracao("174427");
        header.setNumSeqArquivoRetorno("000001");
        header.setLayoutArquivo("040");
        header.setZeros3("00000");
        header.setBranco6("");
        header.setZeros4("000");
        header.setBrancos7("");
        
        LineCnabRegistroHeaderLoteRemessa headerLote = new LineCnabRegistroHeaderLoteRemessa();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001"); 
        headerLote.setTipoRegistro("1");
        headerLote.setOperacao("R");
        headerLote.setCodigoServico("01");
        headerLote.setZeros1("00");
        headerLote.setLayoutLote("030");
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
        headerLote.setDataGravacao("01092021");
        headerLote.setDataCredito("");
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
        segmentoP.setNumDocumento("0000000001");
        segmentoP.setBrancos5("");
        segmentoP.setVencimento("15092021");
        segmentoP.setValorTitulo("000000000002000");
        segmentoP.setAgCobradora("00000");
        segmentoP.setDac3("0");
        segmentoP.setEspecieTitulo("01");
        segmentoP.setAceite("N");
        segmentoP.setDataEmissaoTitulo("01092021");
        segmentoP.setZeros4("0");
        segmentoP.setDataJurosMora("01102021");
        segmentoP.setJuros1Dia("000000000000034");
        segmentoP.setZeros5("0");
        segmentoP.setData1Desconto("15092021");
        segmentoP.setValor1Desconto("000000000000200");
        segmentoP.setValorIof("000000000000000");
        segmentoP.setValorAbatimento("000000000000000");
        segmentoP.setUsoEmpresa("");
        segmentoP.setCodigoNegativacaoProtesto("0");
        segmentoP.setPrazoNegativacaoProtesto("0");
        segmentoP.setCodBaixa("0");
        segmentoP.setPrazoBaixa("00");
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
        segmentoR.setData2Desconto("");
        segmentoR.setValor2Desconto("");
        segmentoR.setZeros2("0");
        segmentoR.setData3Desconto("");
        segmentoR.setValor3Desconto("");
        segmentoR.setCodMulta("");
        segmentoR.setDataMulta("");
        segmentoR.setMulta("");
        segmentoR.setBrancos2("");
        segmentoR.setInfoPagador("");
        segmentoR.setBrancos3("");
        segmentoR.setCodOcPagador("");
        segmentoR.setZeros3("00000000");
        segmentoR.setBrancos4("");
        segmentoR.setZeros4("000000000000");
        segmentoR.setBranco5("");
        segmentoR.setZeros5("0");
        segmentoR.setBrancos6("");

        
        LineCnabRegistroTrailerLote trailerLote = new LineCnabRegistroTrailerLote();
        trailerLote.setCodigoBanco("341");
        trailerLote.setCodigoLote("0001");// soma do tipo 1
        trailerLote.setTipoRegistro("5");
        trailerLote.setBrancos1("");
        trailerLote.setQtdeRegistros("000004");//soma dos tipos 1,3 e 5
        trailerLote.setQtdeCobrancaSimples("");
        trailerLote.setQtdeCobrancaVinculada("");
        trailerLote.setValorCobrancaVinculada("");
        trailerLote.setZeros("000000000000000000000000000000000000000000000");
        trailerLote.setAvisoBancario("");
        trailerLote.setBrancos2("");
        
        LineCnabRegistroTrailerArquivo trailerArquivo = new LineCnabRegistroTrailerArquivo ();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");//sempre vai ser esse
        trailerArquivo.setRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalLotes("1");// soma do tipo 1
        trailerArquivo.setTotalRegistros("000006");// soma dos tipos 0,1,3,5 e 9
        trailerArquivo.setZeros("000000");
        trailerArquivo.setBrancos2("");          
              
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String resultHeader = manager.export(header);
        System.out.println(resultHeader);
        
        String resultLote = manager.export(headerLote);
        System.out.println(resultLote);
        
        String resultP = manager.export(segmentoP);
        System.out.println(resultP);
        
        String resultQ = manager.export(segmentoQ);
        System.out.println(resultQ);
        
        String resultR = manager.export(segmentoR);
        System.out.println(resultR);
 
        String resultTrailerLote = manager.export(trailerLote);
        System.out.println(resultTrailerLote);
        
        String resultTrailerArquivo = manager.export(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\CI240_R.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(manager.export(header));
        gravar.println(manager.export(headerLote));
        gravar.println(manager.export(segmentoP));
        gravar.println(manager.export(segmentoQ));
        gravar.println(manager.export(segmentoR));
        gravar.println(manager.export(trailerLote));
        gravar.println(manager.export(trailerArquivo));
        
        gravar.close();        
       }
    }