package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderRemessaPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoCTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoJ52Pagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoJTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerArquivoPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteTitulosPagamento;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   11.08.2022
 */
public class GerarRemessaTitulosTest {
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
        headerArquivo.setAgencia("00278");
        headerArquivo.setBrancos3("");
        headerArquivo.setContaC("000000092471");
        headerArquivo.setBrancos4("");
        headerArquivo.setDac("7");
        headerArquivo.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerArquivo.setNomeBanco("BANCO ITAU SA");
        headerArquivo.setBrancos5("");
        headerArquivo.setArquivoCodigo("1");
        headerArquivo.setDataGeracao("16082022");
        headerArquivo.setHoraGeracao("121150");
        headerArquivo.setZeros("000000000");
        headerArquivo.setUnidadeDensidade("00000");
        headerArquivo.setBrancos6("");
        
        LineCnabRegistroHeaderLoteTitulosPagamento headerLote = new LineCnabRegistroHeaderLoteTitulosPagamento();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001");
        headerLote.setTipoRegistro("1");
        headerLote.setTipoOperacao("1");
        headerLote.setTipoPagamento("C");
        headerLote.setFormaPagamento("1");
        headerLote.setLayoutLote("030");
        headerLote.setBrancos1("");
        headerLote.setEmpresaInscricao("2");
        headerLote.setInscricaoNumero("05437537000137");
        headerLote.setBrancos2("");
        headerLote.setAgencia("00278");
        headerLote.setBrancos3("");
        headerLote.setConta("000000092471");
        headerLote.setBrancos4("");
        headerLote.setDac("7"); 
        headerLote.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLote.setFinalidadeLote("01");
        headerLote.setHistoricoContaCorrente("0000000000");
        headerLote.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLote.setNumero("1333");
        headerLote.setComplemento("LOJA MATRIZ");
        headerLote.setCidade("ITU");
        headerLote.setCep("13303909");
        headerLote.setEstado("SP");
        headerLote.setBrancos5("");
        headerLote.setOcorrencias("");
        
        LineCnabRegistroSegmentoJTitulosPagamento segmentoJ = new LineCnabRegistroSegmentoJTitulosPagamento();
        segmentoJ.setCodigoBanco("341");
        segmentoJ.setCodigoLote("0001");
        segmentoJ.setTipoRegistro("3");
        segmentoJ.setNumeroRegistro("00001");
        segmentoJ.setCodigoSegmento("J");
        segmentoJ.setTipoMovimento("000");
        segmentoJ.setBancoFavorecido("341");
        segmentoJ.setCodigoMoeda("9");
        segmentoJ.setDigitoVerificador("6");
        segmentoJ.setVencimento("1667");
        segmentoJ.setValor("0000000500");
        segmentoJ.setCampoLivre("");
        segmentoJ.setNomeFavorecido("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ.setDataVencimento("30082022");
        segmentoJ.setValorTitulo("000000000000500");
        segmentoJ.setDescontos("000000000000000");
        segmentoJ.setAcrescimos("000000000000000");
        segmentoJ.setDataPgto("15082022");
        segmentoJ.setValorPgto("000000000000500");
        segmentoJ.setZeros("000000000000000");
        segmentoJ.setSeuNumero("00000000000000000001");
        segmentoJ.setBrancos("");
        segmentoJ.setNossoNumero("");
        segmentoJ.setOcorrencias("");

        LineCnabRegistroSegmentoJ52Pagamento segmentoJ52 = new LineCnabRegistroSegmentoJ52Pagamento();
        segmentoJ52.setCodigoBanco("341");
        segmentoJ52.setCodigoLote("0001");
        segmentoJ52.setTipoRegistro("3");
        segmentoJ52.setNumeroRegistro("00001");
        segmentoJ52.setCodigoSegmento("J");
        segmentoJ52.setTipoMovimento("000");
        segmentoJ52.setCodigoRegistro("52");
        segmentoJ52.setTipoInscricaoPagador("2");
        segmentoJ52.setNumeroInscricaoPagador("05437537000137");
        segmentoJ52.setNomePagador("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ52.setTipoInscricaoBeneficiario("2");
        segmentoJ52.setNumeroInscricaoBeneficiario("05437537000137");
        segmentoJ52.setNomeBeneficiario("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ52.setTipoInscricaoSacador("2");
        segmentoJ52.setNumeroInscricaoSacador("05437537000137");
        segmentoJ52.setNomeSacador("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ52.setBrancos("");
        
        LineCnabRegistroSegmentoBTitulosPagamento segmentoB = new LineCnabRegistroSegmentoBTitulosPagamento();
        segmentoB.setCodigoBanco("341");
        segmentoB.setCodigoLote("0001");
        segmentoB.setTipoRegistro("3");
        segmentoB.setNumeroRegistro("00001");
        segmentoB.setCodigoSegmento("B");
        segmentoB.setBrancos2("");
        segmentoB.setEmpresaInscricao("2");
        segmentoB.setNumeroInscricao("05437537000137");
        segmentoB.setEndereco("AV DR OTAVIANO PEREIRA MENDES");
        segmentoB.setNumero("1333");
        segmentoB.setComplemento("LOJA MATRIZ");
        segmentoB.setBairro("CENTRO");
        segmentoB.setCidade("ITU");
        segmentoB.setCep("13301909");
        segmentoB.setEstado("SP");
        segmentoB.setEmail("LARISSA.CAMARGO@AUTOGERAL.COM.BR");
        segmentoB.setBrancos2("");
        segmentoB.setOcorrencias("");
        
        LineCnabRegistroSegmentoCTitulosPagamento segmentoC = new LineCnabRegistroSegmentoCTitulosPagamento();
        segmentoC.setCodigoBanco("341");
        segmentoC.setCodigoLote("0001");
        segmentoC.setTipoRegistro("3");
        segmentoC.setNumeroRegistro("00001");
        segmentoC.setCodigoSegmento("C");
        segmentoC.setValorContribuicao("000000000000000");
        segmentoC.setBrancos1("");
        segmentoC.setVencimento("30082022");
        segmentoC.setValorDoc("000000000000500");
        segmentoC.setValorPIS("000000000000000");
        segmentoC.setValorIR("000000000000000");
        segmentoC.setValorISS("000000000000000");
        segmentoC.setValorContribuicaoFinalidadeSocial("000000000000000"); // Valor Cofins
        segmentoC.setDesconto("00000000000000");
        segmentoC.setAbatimento("000000000000000");
        segmentoC.setOutrasDeducoes("000000000000000");
        segmentoC.setMora("000000000000000");
        segmentoC.setMulta("000000000000000");
        segmentoC.setOutrasAcrescimos("000000000000000");
        segmentoC.setFaturaDocumento("");
        segmentoC.setOcorrencias("");
        
        LineCnabRegistroSegmentoZTitulosPagamento segmentoZ = new LineCnabRegistroSegmentoZTitulosPagamento();
        segmentoZ.setCodigoBanco("341");
        segmentoZ.setCodigoLote("0001");
        segmentoZ.setTipoRegistro("3");
        segmentoZ.setNumeroRegistro("00001");
        segmentoZ.setCodigoSegmento("Z");
        segmentoZ.setAutenticacaoEletronica("");
        segmentoZ.setSeuNumero("00000000000000000001");
        segmentoZ.setBrancos1("");
        segmentoZ.setNossoNumero("");
        segmentoZ.setBrancos2("");
        
        
        LineCnabRegistroTrailerLoteTitulosPagamento trailerLote = new LineCnabRegistroTrailerLoteTitulosPagamento();
        trailerLote.setCodigoBanco("341");
        trailerLote.setCodigoLote("0001");
        trailerLote.setTipoRegistro("5");
        trailerLote.setBrancos1("");
        trailerLote.setTotalQtdRegistros("000007");
        trailerLote.setTotalValorPgtos("000000000000000001");
        trailerLote.setZeros("000000000000000000");
        trailerLote.setBrancos2("");
        trailerLote.setOcorrencias("");
        
        
        LineCnabRegistroTrailerArquivoPagamento trailerArquivo = new LineCnabRegistroTrailerArquivoPagamento();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");
        trailerArquivo.setTipoRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalQtdLotes("000001"); // Soma de registro tipo 1
        trailerArquivo.setTotalQtdRegistros("000009");
        trailerArquivo.setBrancos2("");
        
        String resultHeader = headerArquivo.getRepresentation(headerArquivo);
        System.out.println(resultHeader);
        
        String resultHeaderLote = headerLote.getRepresentation(headerLote);
        System.out.println(resultHeaderLote);
        
        String resultJ = segmentoJ.getRepresentation(segmentoJ);
        System.out.println(resultJ);
        
        String resultJ52 = segmentoJ52.getRepresentation(segmentoJ52);
        System.out.println(resultJ52);
        
        String resultB = segmentoB.getRepresentation(segmentoB);
        System.out.println(resultB);
        
        String resultC = segmentoC.getRepresentation(segmentoC);
        System.out.println(resultC);
        
        String resultZ = segmentoZ.getRepresentation(segmentoZ);
        System.out.println(resultZ);
        
        String resultTrailerLote = trailerLote.getRepresentation(trailerLote);
        System.out.println(resultTrailerLote);
        
        String resultTrailerArquivo = trailerArquivo.getRepresentation(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\ITAU-01-12082022.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(headerArquivo.getRepresentation(headerArquivo));
        gravar.println(headerLote.getRepresentation(headerLote));
        gravar.println(segmentoJ.getRepresentation(segmentoJ));
        gravar.println(segmentoJ52.getRepresentation(segmentoJ52));
        gravar.println(segmentoB.getRepresentation(segmentoB));
        gravar.println(segmentoC.getRepresentation(segmentoC));
        gravar.println(segmentoZ.getRepresentation(segmentoZ));
        gravar.println(trailerLote.getRepresentation(trailerLote));
        gravar.println(trailerArquivo.getRepresentation(trailerArquivo));
        
        gravar.close();  
    }
}
