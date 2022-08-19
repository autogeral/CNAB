package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLotePagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderRemessaPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoAPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoCPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoDPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoEPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoFPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerArquivoPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLotePagamento;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *  11.08.2022
 */
public class GerarRemessaPagamentosTest {
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
        headerArquivo.setDataGeracao("15082022");
        headerArquivo.setHoraGeracao("121150");
        headerArquivo.setZeros("000000000");
        headerArquivo.setUnidadeDensidade("00000");
        headerArquivo.setBrancos6("");
        
        LineCnabRegistroHeaderLotePagamento headerLote =  new LineCnabRegistroHeaderLotePagamento();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001");
        headerLote.setTipoRegistro("1");
        headerLote.setTipoOperacao("C");
        headerLote.setTipoPagamento("98");
        headerLote.setFormaPagamento("41");
        headerLote.setLayoutLote("040");
        headerLote.setBrancos1("");
        headerLote.setEmpresaInscricao("2");
        headerLote.setInscricaoNumero("05437537000137");
        headerLote.setIdentificacaoLancamento("1707");
        headerLote.setBrancos2("");
        headerLote.setAgencia("00278");
        headerLote.setBrancos3("");
        headerLote.setConta("000000092471");
        headerLote.setBrancos4("");
        headerLote.setDac("7");
        headerLote.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLote.setFinalidadeLote("10");
        headerLote.setHistoricoContaCorrente("");
        headerLote.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLote.setNumeroLocal("1333");
        headerLote.setComplemento("LOJA MATRIZ");
        headerLote.setCidade("ITU");
        headerLote.setCep("13301909");
        headerLote.setEstado("SP");
        headerLote.setBrancos5("");
        headerLote.setOcorrencias("");
        
        LineCnabRegistroSegmentoAPagamento segmentoA = new LineCnabRegistroSegmentoAPagamento();
        segmentoA.setCodigoBanco("341");
        segmentoA.setCodigoLote("0001");
        segmentoA.setTipoRegistro("3");
        segmentoA.setNumeroRegistro("00001");
        segmentoA.setCodigoSegmento("A");
        segmentoA.setTipoMovimento("000");
        segmentoA.setCodigoCamara("000");
        segmentoA.setBancoFavorecido("341");
        segmentoA.setAgenciaFavorecido("00278 000000092471 7");
        segmentoA.setNomeFavorecido("AUTO GERAL AUTOPECAS LTDA");
        segmentoA.setSeuNumero("00000000000000000001");
        segmentoA.setDataPgto("00000000");
        segmentoA.setTipoMoeda("REA");
        segmentoA.setCodigoIspb("00000000");
        segmentoA.setZeros1("0000000");
        segmentoA.setValorPgto("000000000000000");
        segmentoA.setNossoNumero("");
        segmentoA.setBrancos1("");
        segmentoA.setDataEfetivaPgto("");
        segmentoA.setValorEfetivoPgto("");
        segmentoA.setFinalidadeDetalhe("");
        segmentoA.setBrancos2("");
        segmentoA.setNumeroDoc("");
        segmentoA.setNumeroInscricao("");
        segmentoA.setFinalidadeDocStatus("21");
        segmentoA.setFinalidadeTed("00004");
        segmentoA.setBrancos3("");
        segmentoA.setAvisoFavorecido("0");
        segmentoA.setOcorrencias("");
        
        LineCnabRegistroSegmentoBPagamento segmentoB = new LineCnabRegistroSegmentoBPagamento();
        segmentoB.setCodigoBanco("341");
        segmentoB.setCodigoLote("0001");
        segmentoB.setTipoRegistro("3");
        segmentoB.setNumRegistro("00001");
        segmentoB.setCodigoSegmento("B");
        segmentoB.setBrancos1("");
        segmentoB.setEmpresaInscricao("2");
        segmentoB.setNumInscricao("05437537000137");
        segmentoB.setEndereco("AV DR OTAVIANO PEREIRA MENDES");
        segmentoB.setNumeroLocal("1333");
        segmentoB.setComplemento("LOJA MATRIZ");
        segmentoB.setBairro("CENTRO");
        segmentoB.setCidade("ITU");
        segmentoB.setCep("13301909");
        segmentoB.setEstado("SP");
        segmentoB.setEmail("");
        segmentoB.setBrancos2("");
        segmentoB.setOcorrencias("");
        
        LineCnabRegistroSegmentoCPagamento segmentoC = new LineCnabRegistroSegmentoCPagamento();
        segmentoC.setCodigoBanco("341");
        segmentoC.setCodigoLote("0001");
        segmentoC.setTipoRegistro("3");
        segmentoC.setNumRegistro("00001");
        segmentoC.setCodigoSegmento("C");
        segmentoC.setValorContribuicaoLucro("000000000000000");
        segmentoC.setBrancos1("");
        segmentoC.setVencimento("30082022");
        segmentoC.setValorDoc("000000000000500");
        segmentoC.setValorPIS("000000000000000");
        segmentoC.setValorIR("000000000000000");
        segmentoC.setValorISS("000000000000000");
        segmentoC.setValorCofins("000000000000000");
        segmentoC.setValorDesconto("000000000000000");
        segmentoC.setAbatimento("000000000000000");
        segmentoC.setOutrasDeducoes("000000000000000");
        segmentoC.setMora("000000000000000");
        segmentoC.setMulta("000000000000000");
        segmentoC.setOutrosAcrescimos("000000000000000");
        segmentoC.setFaturaDocumento("");
        segmentoC.setBrancos2("");
        
        LineCnabRegistroSegmentoDPagamento segmentoD = new LineCnabRegistroSegmentoDPagamento();
        segmentoD.setCodigoBanco("341");
        segmentoD.setCodigoLote("0001");
        segmentoD.setTipoRegistro("3");
        segmentoD.setNumRegistro("00001");
        segmentoD.setCodigoSegmento("D");
        segmentoD.setBrancos1("");
        segmentoD.setPeriodoCompetencia("082022");
        segmentoD.setCentroCusto("");
        segmentoD.setCodigoFuncionario("000000000000000");
        segmentoD.setCargo("DESENVOLVEDOR JAVA");
        segmentoD.setPeriodoFeriasDe("00000000");
        segmentoD.setPeriodoFeriaAte("00000000");
        segmentoD.setDependenteIR("00");
        segmentoD.setDependentesSF("00");
        segmentoD.setHorasSemanais("08");
        segmentoD.setSalarioContribuicao("000000000170000");
        segmentoD.setFgts("000000000008500");
        segmentoD.setValorCreditos("000000000000000");
        segmentoD.setValorDebito("000000000000000");
        segmentoD.setValorLiquido("000000000000000");
        segmentoD.setValorFixoBase("000000000000000");
        segmentoD.setBaseCalculoIRRF("000000000000000");
        segmentoD.setBaseCalculoFGTS("000000000000000");
        segmentoD.setDisponibilizacaoHolerite("00");
        segmentoD.setBrancos2("");
        segmentoD.setOcorrencias("");
        
        LineCnabRegistroSegmentoEPagamento segmentoE = new LineCnabRegistroSegmentoEPagamento();
        segmentoE.setCodigoBanco("341");
        segmentoE.setCodigoLote("0001");
        segmentoE.setTipoRegistro("3");
        segmentoE.setNumRegistro("00001");
        segmentoE.setCodigoSegmento("E");
        segmentoE.setBrancos1("");
        segmentoE.setTipoMovimento("1");
        segmentoE.setInfoComplementares("");
        segmentoE.setBrancos2("");
        segmentoE.setOcorrencias("");
        
        
        LineCnabRegistroSegmentoFPagamento segmentoF = new LineCnabRegistroSegmentoFPagamento();
        segmentoF.setCodigoBanco("341");
        segmentoF.setCodigoLote("0001");
        segmentoF.setTipoRegistro("3");
        segmentoF.setNumRegistro("00001");
        segmentoF.setCodigoSegmento("F");
        segmentoF.setBrancos1("");
        segmentoF.setMsgInformacoes("");
        segmentoF.setBrancos2("");
        segmentoF.setOcorrencias("");
        
        
        LineCnabRegistroSegmentoZPagamento segmentoZ = new LineCnabRegistroSegmentoZPagamento();
        segmentoZ.setCodigoBanco("341");
        segmentoZ.setCodigoLote("0001");
        segmentoZ.setTipoRegistro("3");
        segmentoZ.setNumRegistro("00001");
        segmentoZ.setCodigoSegmento("Z");
        segmentoZ.setAutenticacaoEletronica("");
        segmentoZ.setSeuNumero("00000000000000000001");
        segmentoZ.setBrancos1("");
        segmentoZ.setNossoNumero("");
        segmentoZ.setBrancos2("");
        
        
        LineCnabRegistroTrailerLotePagamento trailerLote = new LineCnabRegistroTrailerLotePagamento();
        trailerLote.setCodigoBanco("341");
        trailerLote.setCodigoLote("0001");
        trailerLote.setTipoRegistro("5");
        trailerLote.setBrancos1("");
        trailerLote.setTotalQtdRegistros("000003"); // Soma do total de registros do tipo 1,3 e 5.
        trailerLote.setTotalValorPgto("000000000000000001");
        trailerLote.setZeros("000000000000000000");
        trailerLote.setBrancos2("");
        trailerLote.setOcorrencias("");
        
        LineCnabRegistroTrailerArquivoPagamento trailerArquivo = new LineCnabRegistroTrailerArquivoPagamento();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");
        trailerArquivo.setTipoRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalQtdLotes("000001");//Soma do total de lotes de arquivo do tipo 1.
        trailerArquivo.setTotalQtdRegistros("00005");// Soma do total de registros do tipo: 0,1,3,5 e 9.
        trailerArquivo.setBrancos2("");
        
        String resultHeader = headerArquivo.getRepresentation(headerArquivo);
        System.out.println(resultHeader);
        
        String resultHeaderLote = headerLote.getRepresentation(headerLote);
        System.out.println(resultHeaderLote);
        
        String resultA = segmentoA.getRepresentation(segmentoA);
        System.out.println(resultA);
        
        String resultB = segmentoB.getRepresentation(segmentoB);
        System.out.println(resultB);
        
        String resultC = segmentoC.getRepresentation(segmentoC);
        System.out.println(resultC);
        
        String resultD = segmentoD.getRepresentation(segmentoD);
        System.out.println(resultD);
        
        String resultE = segmentoE.getRepresentation(segmentoE);
        System.out.println(resultE);
        
        String resultF = segmentoF.getRepresentation(segmentoF);
        System.out.println(resultF);
 
        String resultZ = segmentoZ.getRepresentation(segmentoZ);
        System.out.println(resultZ);
        
        String resultTrailerLote = trailerLote.getRepresentation(trailerLote);
        System.out.println(resultTrailerLote);
        
        String resultTrailerArquivo = trailerArquivo.getRepresentation(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\ITAU02.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(headerArquivo.getRepresentation(headerArquivo));
        gravar.println(headerLote.getRepresentation(headerLote));
        gravar.println(segmentoA.getRepresentation(segmentoA));
        gravar.println(segmentoB.getRepresentation(segmentoB));
        gravar.println(segmentoC.getRepresentation(segmentoC));
        gravar.println(segmentoD.getRepresentation(segmentoD));
        gravar.println(segmentoE.getRepresentation(segmentoE));
        gravar.println(segmentoF.getRepresentation(segmentoF));
        gravar.println(segmentoZ.getRepresentation(segmentoZ));
        gravar.println(trailerLote.getRepresentation(trailerLote));
        gravar.println(trailerArquivo.getRepresentation(trailerArquivo));
        
        gravar.close();  
    }
}
