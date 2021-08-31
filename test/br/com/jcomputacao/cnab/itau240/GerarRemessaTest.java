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
 */
public class GerarRemessaTest {
    @Test
    public void gerarRemessa() throws ParseException, IOException {
        LineCnabRegistroHeaderRemessa header  = new LineCnabRegistroHeaderRemessa();
        header.setCodigoBanco("341");
        header.setCodigoLote("0000");
        header.setTipoRegistro("0");
        header.setBrancos1("");
        header.setCodigoInscricao("2");
        header.setInscricaoNumero("05437537000137");
        header.setBrancos2("");
        header.setZeros2("0");
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
        header.setDataGeracao("31082021");
        header.setHoraGeracao("152252");
        header.setNumSeqArquivoRetorno("");
        header.setLayoutArquivo("040");
        header.setZeros3("");
        header.setBranco6("");
        header.setZeros4("");
        header.setBrancos7("");
        
        LineCnabRegistroHeaderLoteRemessa lote = new LineCnabRegistroHeaderLoteRemessa();
        lote.setCodigoBanco("341");
        lote.setCodigoLote("0001");
        lote.setTipoRegistro("1");
        lote.setOperacao("R");
        lote.setCodigoServico("01");
        lote.setZeros1("00");
        lote.setLayoutLote("030");
        lote.setBrancos1("");
        lote.setCodigoInscricao("2");
        lote.setInscricaoNumero("05437537000137");
        lote.setBrancos2("");
        lote.setZeros2("0");
        lote.setAgencia("0278");
        lote.setBrancos3("");
        lote.setZeros3("0000000");
        lote.setConta("92471");
        lote.setBrancos4("");
        lote.setDac("7");
        lote.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        lote.setBrancos5("BRANCOS");
        lote.setNumSeqArquivoRet("");
        lote.setDataGravacao("31082021");
        lote.setDataCredito("");
        lote.setBrancos6("");
        
        LineCnabRegistroSegmentoPRemessa segmentoP = new LineCnabRegistroSegmentoPRemessa();
        segmentoP.setCodigoBanco("341");
        segmentoP.setCodigoLote("0002");
        segmentoP.setTipoRegistro("3");
        segmentoP.setNumRegistro("00001");
        segmentoP.setSegmento("P");
        segmentoP.setBrancos1("");
        segmentoP.setCodOcorrencia("01");
        segmentoP.setZeros("0");
        segmentoP.setAgencia("0278");
        segmentoP.setBrancos2("");
        segmentoP.setZeros1("0000000");
        segmentoP.setConta("92471");
        segmentoP.setBrancos3("");
        segmentoP.setDac1("7");
        segmentoP.setNumCarteira("109");
        segmentoP.setNossoNumero("92471");
        segmentoP.setDac2("7");
        segmentoP.setBrancos4("");
        segmentoP.setZeros2("");
        segmentoP.setNumDocumento("1");
        segmentoP.setBrancos5("");
        segmentoP.setVencimento("15092021");
        segmentoP.setValorTitulo("R$20,00");
        segmentoP.setAgCobradora("00000");
        segmentoP.setDac3("0");
        segmentoP.setEspecieTitulo("01");
        segmentoP.setAceite("N");
        segmentoP.setDataEmissaoTitulo("31082021");
        segmentoP.setZeros3("");
        segmentoP.setDataJurosMora("");
        segmentoP.setJuros1Dia("");
        segmentoP.setZeros4("");
        segmentoP.setData1Desconto("");
        segmentoP.setValor1Desconto("");
        segmentoP.setValorIof("");
        segmentoP.setValorAbatimento("");
        segmentoP.setUsoEmpresa("");
        segmentoP.setCodigoNegativacaoProtesto("");
        segmentoP.setPrazoNegativacaoProtesto("");
        segmentoP.setCodBaixa("");
        segmentoP.setPrazoBaixa("");
        segmentoP.setZeros5("");
        segmentoP.setBrancos6("");
        
        LineCnabRegistroSegmentoQRemessa segmentoQ = new LineCnabRegistroSegmentoQRemessa();
        segmentoQ.setCodigoBanco("341");
        segmentoQ.setCodigoLote("0003");
        segmentoQ.setTipoRegistro("3");
        segmentoQ.setNumRegistro("00002");
        segmentoQ.setSegmento("Q");
        segmentoQ.setBrancos1("");
        segmentoQ.setCodOcorrencia("01");
        segmentoQ.setCodigoInscricao1("1");
        segmentoQ.setInscricaoNumero1("50036869864");
        segmentoQ.setNome("LARISSA ANTUNES DE CAMARGO");
        segmentoQ.setBrancos2("");
        segmentoQ.setLogradouro("RUA SAN MARINO,310,CASA");
        segmentoQ.setBairro("JD SALTENSE");
        segmentoQ.setCep("13327");
        segmentoQ.setSufixoCep("271");
        segmentoQ.setCidade("SALTO");
        segmentoQ.setUf("SP");
        segmentoQ.setCodigoInscricao2("2");
        segmentoQ.setInscricaoNumero2("05437537000137");
        segmentoQ.setSacadorAvalista("AUTO GERAL AUTOPECAS LTDA");
        segmentoQ.setBrancos3("");
        segmentoQ.setZeros("");
        segmentoQ.setBrancos4("");
              
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String resultHeader = manager.export(header);
        System.out.println(resultHeader);
        
        String resultLote = manager.export(lote);
        System.out.println(resultLote);
        
        String resultP = manager.export(segmentoP);
        System.out.println(resultP);
        
        String resultQ = manager.export(segmentoQ);
        System.out.println(resultQ);
        
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\CI240_31082021_0001_REM.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(manager.export(header));
        gravar.println(manager.export(lote));
        gravar.println(manager.export(segmentoP));
        gravar.print(manager.export(segmentoQ));
        
        gravar.close();        
       }
    }

