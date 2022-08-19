package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderRemessaPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoNTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoWTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerArquivoPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteTributosPagamento;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    13.08.2022
 */
public class GerarRemessaTributos {
    @Test
    public void gerarRemessa() throws ParseException, IOException {
        LineCnabRegistroHeaderRemessaPagamento headerArquivo = new LineCnabRegistroHeaderRemessaPagamento();
        headerArquivo.setCodigoBanco("341");
        headerArquivo.setCodigoLote("0000");//sempre vai ser esse código
        headerArquivo.setTipoRegistro("0");
        headerArquivo.setBrancos1("");
        headerArquivo.setLayoutArquivo("081");
        headerArquivo.setEmpresaInscricao("2");
        headerArquivo.setInscricaoNumero("05437537000137");
        headerArquivo.setBrancos2("");
        headerArquivo.setAgencia("0278");
        headerArquivo.setBrancos3("");
        headerArquivo.setContaC("92471");
        headerArquivo.setBrancos4("");
        headerArquivo.setDac("7");
        headerArquivo.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerArquivo.setNomeBanco("BANCO ITAU SA");
        headerArquivo.setBrancos5("");
        headerArquivo.setArquivoCodigo("1");
        headerArquivo.setDataGeracao("11082022");
        headerArquivo.setHoraGeracao("121150");
        headerArquivo.setZeros("000000000");
        headerArquivo.setUnidadeDensidade("00000");
        headerArquivo.setBrancos6("");
        
        LineCnabRegistroHeaderLoteTributosPagamento headerLote = new LineCnabRegistroHeaderLoteTributosPagamento();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001");
        headerLote.setTipoRegistro("1");
        headerLote.setTipoOperacao("C");
        headerLote.setTipoPagamento("22");
        headerLote.setFormaPagamento("91");
        headerLote.setLayoutLote("030");
        headerLote.setBrancos1("");
        headerLote.setEmpresaInscricao("2");
        headerLote.setInscricaoNumero("05437537000137");
        headerLote.setBrancos2("");
        headerLote.setAgencia("0278");
        headerLote.setBrancos3("");
        headerLote.setConta("92471");
        headerLote.setBrancos4("");
        headerLote.setDac("7");
        headerLote.setEnderecoEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLote.setFinalidadeLote("01");
        headerLote.setHistoricoContaCorrente("");
        headerLote.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLote.setNumero("1333");
        headerLote.setComplemento("LOJA MATRIZ");
        headerLote.setCidade("ITU");
        headerLote.setCep("13301909");
        headerLote.setEstado("SP");
        headerLote.setBrancos5("");
        headerLote.setOcorrencias("");
        
        LineCnabRegistroSegmentoNTributosPagamento segmentoN = new LineCnabRegistroSegmentoNTributosPagamento();
        segmentoN.setCodigoBanco("341");
        segmentoN.setCodigoLote("0001");
        segmentoN.setTipoRegistro("3");
        segmentoN.setNumeroRegistro("00001");
        segmentoN.setCodigoSegmento("N");
        segmentoN.setTipoMovimento("000");
        segmentoN.setDadosTributo("");
        segmentoN.setSeuNumero("");
        segmentoN.setNossoNumero("");
        segmentoN.setOcorrencias("");
        
        LineCnabRegistroSegmentoBTributosPagamento segmentoB = new LineCnabRegistroSegmentoBTributosPagamento();
        segmentoB.setCodigoBanco("341");
        segmentoB.setCodigoLote("0001");
        segmentoB.setTipoRegistro("3");
        segmentoB.setNumeroRegistro("00001");
        segmentoB.setCodigoSegmento("B");
        segmentoB.setBrancos1("");
        segmentoB.setEndereco("AV DR OTAVIANO PEREIRA MENDES");
        segmentoB.setNumero("1333");
        segmentoB.setComplemento("LOJA MATRIZ");
        segmentoB.setBairro("CENTRO");
        segmentoB.setCidade("ITU");
        segmentoB.setCep("13301909");
        segmentoB.setEstado("SP");
        segmentoB.setTelefone("");
        segmentoB.setValorAcrescimos("");
        segmentoB.setValorHonorario("");
        segmentoB.setBrancos2("");
        
        LineCnabRegistroSegmentoWTributosPagamento segmentoW = new LineCnabRegistroSegmentoWTributosPagamento();
        segmentoW.setCodigoBanco("341");
        segmentoW.setCodigoLote("0001");
        segmentoW.setTipoRegistro("3");
        segmentoW.setNumeroRegistro("00001");
        segmentoW.setCodigoSegmento("W");
        segmentoW.setBrancos1("");
        segmentoW.setInformacao1("");
        segmentoW.setInformacao2("");
        segmentoW.setInformacao3("");
        segmentoW.setInformacao4("");
        segmentoW.setBrancos2("");
        
        LineCnabRegistroSegmentoZTributosPagamento segmentoZ = new LineCnabRegistroSegmentoZTributosPagamento();
        segmentoZ.setCodigoBanco("341");
        segmentoZ.setCodigoLote("0001");
        segmentoZ.setTipoRegistro("3");
        segmentoZ.setNumeroRegistro("00001");
        segmentoZ.setCodigoSegmento("Z");
        segmentoZ.setAutenticacaoEletronica("");
        segmentoZ.setSeuNumero("00000000000000000003");
        segmentoZ.setBrancos1("");
        segmentoZ.setNossoNumero("");
        segmentoZ.setBrancos2("");
        
        LineCnabRegistroTrailerLoteTributosPagamento trailerLote = new LineCnabRegistroTrailerLoteTributosPagamento();
        trailerLote.setCodigoBanco("341");
        trailerLote.setCodigoLote("0001");
        trailerLote.setTipoRegistro("5");
        trailerLote.setBrancos1("");
        trailerLote.setTotalQtdRegistros("000006"); // Soma dos registros do tipo 1,3, 5 
        trailerLote.setTotalValorPrincipal("");
        trailerLote.setTotalOutrasEntidades("");
        trailerLote.setTotalValorAcrescimos("");
        trailerLote.setTotalValorArrecad("");
        trailerLote.setBrancos2("");
        trailerLote.setOcorrencias("");
        
        LineCnabRegistroTrailerArquivoPagamento trailerArquivo = new LineCnabRegistroTrailerArquivoPagamento();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");
        trailerArquivo.setTipoRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalQtdLotes("000001");
        trailerArquivo.setTotalQtdRegistros("000008");
        trailerArquivo.setBrancos2("");
        
        String resultHeader = headerArquivo.getRepresentation(headerArquivo);
        System.out.println(resultHeader);
        
        String resultHeaderLote = headerLote.getRepresentation(headerLote);
        System.out.println(resultHeaderLote);
        
        String resultN = segmentoN.getRepresentation(segmentoN);
        System.out.println(resultN);
        
        String resultB = segmentoB.getRepresentation(segmentoB);
        System.out.println(resultB);
        
        String resultW = segmentoW.getRepresentation(segmentoW);
        System.out.println(resultW);
        
        String resultZ = segmentoZ.getRepresentation(segmentoZ);
        System.out.println(resultZ);
        
        String resultTrailerLote = trailerLote.getRepresentation(trailerLote);
        System.out.println(resultTrailerLote);
        
        String resultTrailerArquivo = trailerArquivo.getRepresentation(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\ITAU04.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(headerArquivo.getRepresentation(headerArquivo));
        gravar.println(headerLote.getRepresentation(headerLote));
        gravar.println(segmentoN.getRepresentation(segmentoN));
        gravar.println(segmentoB.getRepresentation(segmentoB));
        gravar.println(segmentoW.getRepresentation(segmentoW));
        gravar.println(segmentoZ.getRepresentation(segmentoZ));
        gravar.println(trailerLote.getRepresentation(trailerLote));
        gravar.println(trailerArquivo.getRepresentation(trailerArquivo));
        
        gravar.close();  
    }
}
