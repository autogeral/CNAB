package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLotePagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderRemessaPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoANotaFiscalPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoAPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoBTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoCPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoCTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoDPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoEPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoFPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoJ52Pagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoJTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoNTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoOConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoWTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZTributosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerArquivoPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLotePagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteTitulosPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteTributosPagamento;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   15.08.2022
 */
public class GerarRemessa {
     @Test
    public void gerarRemessa() throws ParseException, IOException {
        
        /*
            Classe de teste para gerar uma remessa com todos os tipos de pagamentos do Banco Itaú.
        TIPOS DE PAGAMENTOS:
            1-Pagamentos por Transferencias
            2-Titulos
            3-Concessionárias
            4-Tributos
        */
                
        LineCnabRegistroHeaderRemessaPagamento headerArquivo = new LineCnabRegistroHeaderRemessaPagamento();
        headerArquivo.setCodigoBanco("341");
        headerArquivo.setCodigoLote("0000");//sempre vai ser esse código
        headerArquivo.setTipoRegistro("0"); // sempre vai ser tipo registro = 0 
        headerArquivo.setBrancos1("");
        headerArquivo.setLayoutArquivo("081");
        headerArquivo.setEmpresaInscricao("2");
        headerArquivo.setInscricaoNumero("05437537000137");
        headerArquivo.setBrancos2("");
        headerArquivo.setAgencia("00278"); // Identificar a empresa MÃE do grupo ou matriz.
        headerArquivo.setBrancos3("");
        headerArquivo.setContaC("000000092471");
        headerArquivo.setBrancos4("");
        headerArquivo.setDac("7");
        headerArquivo.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerArquivo.setNomeBanco("BANCO ITAU SA");
        headerArquivo.setBrancos5("");
        headerArquivo.setArquivoCodigo("1");
        headerArquivo.setDataGeracao("19082022");
        headerArquivo.setHoraGeracao("121150");
        headerArquivo.setZeros("000000000");
        headerArquivo.setUnidadeDensidade("00000");
        headerArquivo.setBrancos6("");
        
        LineCnabRegistroHeaderLotePagamento headerLote =  new LineCnabRegistroHeaderLotePagamento();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001");
        headerLote.setTipoRegistro("1");
        headerLote.setTipoOperacao("C");
        /* Tipos Pagamentos: 
            10-Dividendos, 15-Debentures, 20-Fornecedores, 22-Tributos,
            30-Salários, 40-Fundos de Investimentos, 50-Sinistros de Seguros, 
            60-Desp Viajante em Transito, 80-Representantes Autorizados, 90-Beneficios e 98-Diversos
        */
        headerLote.setTipoPagamento("30"); 
        headerLote.setFormaPagamento("6");
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
        segmentoA.setDataPgto("");
        segmentoA.setTipoMoeda("REA");
        segmentoA.setCodigoIspb("00000000");
        segmentoA.setZeros1("0000000");
        segmentoA.setValorPgto("");
        segmentoA.setNossoNumero("");
        segmentoA.setBrancos1("");
        segmentoA.setDataEfetivaPgto("");
        segmentoA.setValorEfetivoPgto("");
        segmentoA.setFinalidadeDetalhe("01");
        segmentoA.setBrancos2("");
        segmentoA.setNumeroDoc("");
        segmentoA.setNumeroInscricao("05437537000137");
        segmentoA.setFinalidadeDocStatus("21");
        segmentoA.setFinalidadeTed("00004");
        segmentoA.setBrancos3("");
        segmentoA.setAvisoFavorecido("0");
        segmentoA.setOcorrencias("");
        
        LineCnabRegistroSegmentoANotaFiscalPagamento segmentoANotaFiscal = new LineCnabRegistroSegmentoANotaFiscalPagamento();
        segmentoANotaFiscal.setCodigoBanco("341");
        segmentoANotaFiscal.setCodigoLote("0001");
        segmentoANotaFiscal.setTipoRegistro("3");
        segmentoANotaFiscal.setNumRegistro("00001");
        segmentoANotaFiscal.setCodigoSegmento("A");
        segmentoANotaFiscal.setTipoMovimento("000");
        segmentoANotaFiscal.setZeros1("000");
        segmentoANotaFiscal.setBancoFavorecido("341");
        segmentoANotaFiscal.setAgenciaFavorecido("00278 000000092471 7");
        segmentoANotaFiscal.setNomeFavorecido("AUTO GERAL AUTOPECAS LTDA");
        segmentoANotaFiscal.setSeuNumero("00000000000000000002");
        segmentoANotaFiscal.setDataPgto("30082022");
        segmentoANotaFiscal.setTipoMoeda("REA");
        segmentoANotaFiscal.setZeros2("000000000000000");
        segmentoANotaFiscal.setValorPgto("000000000000500");
        segmentoANotaFiscal.setNossoNumero("");
        segmentoANotaFiscal.setBrancos1("");
        segmentoANotaFiscal.setDataEfetivaPgto("");
        segmentoANotaFiscal.setValorEfetivoPgto("");
        segmentoANotaFiscal.setNumeroNotaFiscal("");
        segmentoANotaFiscal.setBrancos2("");
        segmentoANotaFiscal.setNumDoc("000001");
        segmentoANotaFiscal.setNumInscricao("05437537000137");
        segmentoANotaFiscal.setTipoIdentificacao("1");
        segmentoANotaFiscal.setBrancos3("");
        segmentoANotaFiscal.setAvisoFavorecido("0");
        segmentoANotaFiscal.setOcorrencias("");

//        LineCnabRegistroSegmentoBPagamento segmentoB = new LineCnabRegistroSegmentoBPagamento();
//        segmentoB.setCodigoBanco("341");
//        segmentoB.setCodigoLote("0001");
//        segmentoB.setTipoRegistro("3");
//        segmentoB.setNumRegistro("00001");
//        segmentoB.setCodigoSegmento("B");
//        segmentoB.setBrancos1("");
//        segmentoB.setEmpresaInscricao("2");
//        segmentoB.setNumInscricao("05437537000137");
//        segmentoB.setEndereco("AV DR OTAVIANO PEREIRA MENDES");
//        segmentoB.setNumeroLocal("1333");
//        segmentoB.setComplemento("LOJA MATRIZ");
//        segmentoB.setBairro("CENTRO");
//        segmentoB.setCidade("ITU");
//        segmentoB.setCep("13301909");
//        segmentoB.setEstado("SP");
//        segmentoB.setEmail("LARISSA.CAMARGO@AUTOGERAL.COM.BR");
//        segmentoB.setBrancos2("");
//        segmentoB.setOcorrencias("");
        
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
        
//        LineCnabRegistroSegmentoDPagamento segmentoD = new LineCnabRegistroSegmentoDPagamento();
//        segmentoD.setCodigoBanco("341");
//        segmentoD.setCodigoLote("0001");
//        segmentoD.setTipoRegistro("3");
//        segmentoD.setNumRegistro("00001");
//        segmentoD.setCodigoSegmento("D");
//        segmentoD.setBrancos1("");
//        segmentoD.setPeriodoCompetencia("082022");
//        segmentoD.setCentroCusto("");
//        segmentoD.setCodigoFuncionario("000000000000000");
//        segmentoD.setCargo("DESENVOLVEDOR TRAINEE");
//        segmentoD.setPeriodoFeriasDe("00000000");
//        segmentoD.setPeriodoFeriaAte("00000000");
//        segmentoD.setDependenteIR("00");
//        segmentoD.setDependentesSF("00");
//        segmentoD.setHorasSemanais("08");
//        segmentoD.setSalarioContribuicao("000000000170000");
//        segmentoD.setFgts("000000000008500");
//        segmentoD.setValorCreditos("000000000000000");
//        segmentoD.setValorDebito("000000000000000");
//        segmentoD.setValorLiquido("000000000000000");
//        segmentoD.setValorFixoBase("000000000000000");
//        segmentoD.setBaseCalculoIRRF("000000000000000");
//        segmentoD.setBaseCalculoFGTS("000000000000000");
//        segmentoD.setDisponibilizacaoHolerite("00");
//        segmentoD.setBrancos2("");
//        segmentoD.setOcorrencias("");
        
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
        trailerLote.setTotalQtdRegistros("000008"); // Soma do total de registros do tipo 1,3 e 5.
        trailerLote.setTotalValorPgto("000000000000000500"); // Soma do valor total de pagamentos 
        trailerLote.setZeros("000000000000000000");
        trailerLote.setBrancos2("");
        trailerLote.setOcorrencias("");
        
        LineCnabRegistroHeaderLoteTitulosPagamento headerLoteTitulos = new LineCnabRegistroHeaderLoteTitulosPagamento();
        headerLoteTitulos.setCodigoBanco("341");
        headerLoteTitulos.setCodigoLote("0002");
        headerLoteTitulos.setTipoRegistro("1");
        headerLoteTitulos.setTipoOperacao("");
        headerLoteTitulos.setTipoPagamento("98");
        headerLoteTitulos.setFormaPagamento("30");
        headerLoteTitulos.setLayoutLote("030");
        headerLoteTitulos.setBrancos1("");
        headerLoteTitulos.setEmpresaInscricao("2");
        headerLoteTitulos.setInscricaoNumero("05437537000137");
        headerLoteTitulos.setBrancos2("");
        headerLoteTitulos.setAgencia("00278");
        headerLoteTitulos.setBrancos3("");
        headerLoteTitulos.setConta("000000092471");
        headerLoteTitulos.setBrancos4("");
        headerLoteTitulos.setDac("7"); 
        headerLoteTitulos.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLoteTitulos.setFinalidadeLote("");
        headerLoteTitulos.setHistoricoContaCorrente("0000000000");
        headerLoteTitulos.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLoteTitulos.setNumero("1333");
        headerLoteTitulos.setComplemento("LOJA MATRIZ");
        headerLoteTitulos.setCidade("ITU");
        headerLoteTitulos.setCep("13301909");
        headerLoteTitulos.setEstado("SP");
        headerLoteTitulos.setBrancos5("");
        headerLoteTitulos.setOcorrencias("");
        
        LineCnabRegistroSegmentoJTitulosPagamento segmentoJ = new LineCnabRegistroSegmentoJTitulosPagamento();
        segmentoJ.setCodigoBanco("341");
        segmentoJ.setCodigoLote("0002");
        segmentoJ.setTipoRegistro("3");
        segmentoJ.setNumeroRegistro("00002");
        segmentoJ.setCodigoSegmento("J");
        segmentoJ.setTipoMovimento("000");
        segmentoJ.setBancoFavorecido("341");
        segmentoJ.setCodigoMoeda("9");
        segmentoJ.setDigitoVerificador("6");
        segmentoJ.setVencimento("1667");
        segmentoJ.setValor("0000012345");
        segmentoJ.setCampoLivre("1101234567880057123457000");
        segmentoJ.setNomeFavorecido("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ.setDataVencimento("30082022");
        segmentoJ.setValorTitulo("000000000000500");
        segmentoJ.setDescontos("000000000000000");
        segmentoJ.setAcrescimos("000000000000000");
        segmentoJ.setDataPgto("30082022");
        segmentoJ.setValorPgto("000000000000500");
        segmentoJ.setZeros("000000000000000");
        segmentoJ.setSeuNumero("00000000000000000000");
        segmentoJ.setBrancos("");
        segmentoJ.setNossoNumero("");
        segmentoJ.setOcorrencias("");

        LineCnabRegistroSegmentoJ52Pagamento segmentoJ52 = new LineCnabRegistroSegmentoJ52Pagamento();
        segmentoJ52.setCodigoBanco("341");
        segmentoJ52.setCodigoLote("0002");
        segmentoJ52.setTipoRegistro("3");
        segmentoJ52.setNumeroRegistro("00002");
        segmentoJ52.setCodigoSegmento("J");
        segmentoJ52.setTipoMovimento("000");
        segmentoJ52.setCodigoRegistro("52");
        segmentoJ52.setTipoInscricaoPagador("2");
        segmentoJ52.setNumeroInscricaoPagador("05437537000137");
        segmentoJ52.setNomePagador("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ52.setTipoInscricaoBeneficiario("2");
        segmentoJ52.setNumeroInscricaoBeneficiario("05437537000137");
        segmentoJ52.setNomeBeneficiario("AUTO GERAL AUTOPECAS LTDA");
        segmentoJ52.setTipoInscricaoSacador("");
        segmentoJ52.setNumeroInscricaoSacador("");
        segmentoJ52.setNomeSacador("");
        segmentoJ52.setBrancos("");
        
        LineCnabRegistroSegmentoBTitulosPagamento segmentoBTitulos = new LineCnabRegistroSegmentoBTitulosPagamento();
        segmentoBTitulos.setCodigoBanco("341");
        segmentoBTitulos.setCodigoLote("0002");
        segmentoBTitulos.setTipoRegistro("3");
        segmentoBTitulos.setNumeroRegistro("00002");
        segmentoBTitulos.setCodigoSegmento("B");
        segmentoBTitulos.setEmpresaInscricao("2");
        segmentoBTitulos.setNumeroInscricao("05437537000137");
        segmentoBTitulos.setEndereco("AV DR OTAVIANO PEREIRA MENDES");
        segmentoBTitulos.setNumero("1333");
        segmentoBTitulos.setComplemento("LOJA MATRIZ");
        segmentoBTitulos.setBairro("CENTRO");
        segmentoBTitulos.setCidade("ITU");
        segmentoBTitulos.setCep("13301909");
        segmentoBTitulos.setEstado("SP");
        segmentoBTitulos.setEmail("LARISSA.CAMARGO@AUTOGERAL.COM.BR");
        segmentoBTitulos.setBrancos2("");
        segmentoBTitulos.setOcorrencias("");
        
        LineCnabRegistroSegmentoCTitulosPagamento segmentoCTitulos = new LineCnabRegistroSegmentoCTitulosPagamento();
        segmentoCTitulos.setCodigoBanco("341");
        segmentoCTitulos.setCodigoLote("0002");
        segmentoCTitulos.setTipoRegistro("3");
        segmentoCTitulos.setNumeroRegistro("00002");
        segmentoCTitulos.setCodigoSegmento("C");
        segmentoCTitulos.setValorContribuicao("000000000000000");
        segmentoCTitulos.setBrancos1("");
        segmentoCTitulos.setVencimento("30082022");
        segmentoCTitulos.setValorDoc("000000000000500");
        segmentoCTitulos.setValorPIS("000000000000000");
        segmentoCTitulos.setValorIR("000000000000000");
        segmentoCTitulos.setValorISS("000000000000000");
        segmentoCTitulos.setValorContribuicaoFinalidadeSocial("000000000000000"); // Cofins
        segmentoCTitulos.setDesconto("00000000000000");
        segmentoCTitulos.setAbatimento("000000000000000");
        segmentoCTitulos.setOutrasDeducoes("000000000000000");
        segmentoCTitulos.setMora("000000000000000");
        segmentoCTitulos.setMulta("000000000000000");
        segmentoCTitulos.setOutrasAcrescimos("000000000000000");
        segmentoCTitulos.setFaturaDocumento("");
        segmentoCTitulos.setOcorrencias("");
        
        LineCnabRegistroSegmentoZTitulosPagamento segmentoZTitulos = new LineCnabRegistroSegmentoZTitulosPagamento();
        segmentoZTitulos.setCodigoBanco("341");
        segmentoZTitulos.setCodigoLote("0002");
        segmentoZTitulos.setTipoRegistro("3");
        segmentoZTitulos.setNumeroRegistro("00002");
        segmentoZTitulos.setCodigoSegmento("Z");
        segmentoZTitulos.setAutenticacaoEletronica("");
        segmentoZTitulos.setSeuNumero("00000000000000000002");
        segmentoZTitulos.setBrancos1("");
        segmentoZTitulos.setNossoNumero("");
        segmentoZTitulos.setBrancos2("");
        
        
        LineCnabRegistroTrailerLoteTitulosPagamento trailerLoteTitulos = new LineCnabRegistroTrailerLoteTitulosPagamento();
        trailerLoteTitulos.setCodigoBanco("341");
        trailerLoteTitulos.setCodigoLote("0002");
        trailerLoteTitulos.setTipoRegistro("5");
        trailerLoteTitulos.setBrancos1("");
        trailerLoteTitulos.setTotalQtdRegistros("000007"); // Soma total dos registros do tipo 1, 3 e 5 
        trailerLoteTitulos.setTotalValorPgtos("000000000000000500"); // Soma total dos valores do doc
        trailerLoteTitulos.setZeros("000000000000000000");
        trailerLoteTitulos.setBrancos2("");
        trailerLoteTitulos.setOcorrencias("");
        
        LineCnabRegistroHeaderLoteConcessionariasPagamento headerLoteConcessionarias = new LineCnabRegistroHeaderLoteConcessionariasPagamento();
        headerLoteConcessionarias.setCodigoBanco("341");
        headerLoteConcessionarias.setCodigoLote("0003");
        headerLoteConcessionarias.setTipoRegistro("1");
        headerLoteConcessionarias.setTipoOperacao("C");
        headerLoteConcessionarias.setTipoPagamento("30");
        headerLoteConcessionarias.setFormaPagamento("98");
        headerLoteConcessionarias.setLayoutLote("030");
        headerLoteConcessionarias.setBrancos1("");
        headerLoteConcessionarias.setEmpresaInscricao("2");
        headerLoteConcessionarias.setInscricaoNumero("05437537000137");
        headerLoteConcessionarias.setBrancos2("");
        headerLoteConcessionarias.setAgencia("00278");
        headerLoteConcessionarias.setBrancos3("");
        headerLoteConcessionarias.setConta("000000092471");
        headerLoteConcessionarias.setBrancos4("");
        headerLoteConcessionarias.setDac("7");
        headerLoteConcessionarias.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLoteConcessionarias.setFinalidadeLote("");
        headerLoteConcessionarias.setHistoricoContaCorrente("");
        headerLoteConcessionarias.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLoteConcessionarias.setNumero("1333");
        headerLoteConcessionarias.setComplemento("LOJA MATRIZ");
        headerLoteConcessionarias.setCidade("ITU");
        headerLoteConcessionarias.setCep("13301909");
        headerLoteConcessionarias.setEstado("SP");
        headerLoteConcessionarias.setBrancos5("");
        headerLoteConcessionarias.setOcorrencias("");
        
        
        LineCnabRegistroSegmentoOConcessionariasPagamento segmentoO = new LineCnabRegistroSegmentoOConcessionariasPagamento();
        segmentoO.setCodigoBanco("341");
        segmentoO.setCodigoLote("0003");
        segmentoO.setTipoRegistro("3");
        segmentoO.setNumeroRegistro("00003");
        segmentoO.setCodigoSegmento("O");
        segmentoO.setTipoMovimento("000");
        segmentoO.setCodigoBarras("");
        segmentoO.setNomeConcessionaria("CPFL-COMPANHIA PIRATININGA");
        segmentoO.setDataVencimento("30092022");
        segmentoO.setTipoMoeda("REA");
        segmentoO.setQtdMoeda("");
        segmentoO.setValorPagar("");
        segmentoO.setDataPgto("15082022");
        segmentoO.setValorPago("");
        segmentoO.setBrancos1("");
        segmentoO.setNotaFiscal("");
        segmentoO.setBrancos2("");
        segmentoO.setSeuNumero("");
        segmentoO.setBrancos3("");
        segmentoO.setNossoNumero("");
        segmentoO.setOcorrencias("");
        
        LineCnabRegistroSegmentoZConcessionariasPagamento segmentoZConcessionarias = new LineCnabRegistroSegmentoZConcessionariasPagamento();
        segmentoZConcessionarias.setCodigoBanco("341");
        segmentoZConcessionarias.setCodigoLote("0003");
        segmentoZConcessionarias.setTipoRegistro("3");
        segmentoZConcessionarias.setNumeroRegistro("00003");
        segmentoZConcessionarias.setCodigoSegmento("Z");
        segmentoZConcessionarias.setAutenticacaoEletronica("");
        segmentoZConcessionarias.setSeuNumero("");
        segmentoZConcessionarias.setBrancos1("");
        segmentoZConcessionarias.setNossoNumero("");
        segmentoZConcessionarias.setBrancos2("");
        
        LineCnabRegistroTrailerLoteConcessionariasPagamento trailerLoteConcessionarias = new LineCnabRegistroTrailerLoteConcessionariasPagamento();
        trailerLoteConcessionarias.setCodigoBanco("341");
        trailerLoteConcessionarias.setCodigoLote("0003");
        trailerLoteConcessionarias.setTipoRegistro("5");
        trailerLoteConcessionarias.setBrancos1("");
        trailerLoteConcessionarias.setTotalQtdRegistros("000004");// Soma qtd de registros do tipo 1, 3 e 5.
        trailerLoteConcessionarias.setTotalValorPgto("000000000000000500");
        trailerLoteConcessionarias.setTotalQtdeMoeda("000000000000000000");
        trailerLoteConcessionarias.setBrancos2("");
        trailerLoteConcessionarias.setOcorrencias("");
                
        LineCnabRegistroHeaderLoteTributosPagamento headerLoteTributos = new LineCnabRegistroHeaderLoteTributosPagamento();
        headerLoteTributos.setCodigoBanco("341");
        headerLoteTributos.setCodigoLote("0004");
        headerLoteTributos.setTipoRegistro("1");
        headerLoteTributos.setTipoOperacao("");
        headerLoteTributos.setTipoPagamento("22");
        headerLoteTributos.setFormaPagamento("91");
        headerLoteTributos.setLayoutLote("030");
        headerLoteTributos.setBrancos1("");
        headerLoteTributos.setEmpresaInscricao("2");
        headerLoteTributos.setInscricaoNumero("05437537000137");
        headerLoteTributos.setBrancos2("");
        headerLoteTributos.setAgencia("00278");
        headerLoteTributos.setBrancos3("");
        headerLoteTributos.setConta("000000092471");
        headerLoteTributos.setBrancos4("");
        headerLoteTributos.setDac("7");
        headerLoteTributos.setEnderecoEmpresa("AUTO GERAL AUTOPECAS LTDA");
        headerLoteTributos.setFinalidadeLote("");
        headerLoteTributos.setHistoricoContaCorrente("");
        headerLoteTributos.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLoteTributos.setNumero("1333");
        headerLoteTributos.setComplemento("LOJA MATRIZ");
        headerLoteTributos.setCidade("ITU");
        headerLoteTributos.setCep("13301909");
        headerLoteTributos.setEstado("SP");
        headerLoteTributos.setBrancos5("");
        headerLoteTributos.setOcorrencias("");
        
        LineCnabRegistroSegmentoNTributosPagamento segmentoN = new LineCnabRegistroSegmentoNTributosPagamento();
        segmentoN.setCodigoBanco("341");
        segmentoN.setCodigoLote("0004");
        segmentoN.setTipoRegistro("3");
        segmentoN.setNumeroRegistro("00004");
        segmentoN.setCodigoSegmento("N");
        segmentoN.setTipoMovimento("000");
        segmentoN.setDadosTributo("");
        segmentoN.setSeuNumero("");
        segmentoN.setNossoNumero("");
        segmentoN.setOcorrencias("");
        
        LineCnabRegistroSegmentoBTributosPagamento segmentoBTributos = new LineCnabRegistroSegmentoBTributosPagamento();
        segmentoBTributos.setCodigoBanco("341");
        segmentoBTributos.setCodigoLote("0004");
        segmentoBTributos.setTipoRegistro("3");
        segmentoBTributos.setNumeroRegistro("00004");
        segmentoBTributos.setCodigoSegmento("B");
        segmentoBTributos.setBrancos1("");
        segmentoBTributos.setEndereco("AV DR OTAVIANO PEREIRA MENDES");
        segmentoBTributos.setNumero("1333");
        segmentoBTributos.setComplemento("LOJA MATRIZ");
        segmentoBTributos.setBairro("CENTRO");
        segmentoBTributos.setCidade("ITU");
        segmentoBTributos.setCep("13301909");
        segmentoBTributos.setEstado("SP");
        segmentoBTributos.setTelefone("");
        segmentoBTributos.setValorAcrescimos("");
        segmentoBTributos.setValorHonorario("");
        segmentoBTributos.setBrancos2("");
        
        LineCnabRegistroSegmentoWTributosPagamento segmentoW = new LineCnabRegistroSegmentoWTributosPagamento();
        segmentoW.setCodigoBanco("341");
        segmentoW.setCodigoLote("0004");
        segmentoW.setTipoRegistro("3");
        segmentoW.setNumeroRegistro("00004");
        segmentoW.setCodigoSegmento("W");
        segmentoW.setBrancos1("");
        segmentoW.setInformacao1("");
        segmentoW.setInformacao2("");
        segmentoW.setInformacao3("");
        segmentoW.setInformacao4("");
        segmentoW.setBrancos2("");
        
        LineCnabRegistroSegmentoZTributosPagamento segmentoZTributos = new LineCnabRegistroSegmentoZTributosPagamento();
        segmentoZTributos.setCodigoBanco("341");
        segmentoZTributos.setCodigoLote("0004");
        segmentoZTributos.setTipoRegistro("3");
        segmentoZTributos.setNumeroRegistro("00004");
        segmentoZTributos.setCodigoSegmento("Z");
        segmentoZTributos.setAutenticacaoEletronica("");
        segmentoZTributos.setSeuNumero("00000000000000000000");
        segmentoZTributos.setBrancos1("");
        segmentoZTributos.setNossoNumero("");
        segmentoZTributos.setBrancos2("");
        
        LineCnabRegistroTrailerLoteTributosPagamento trailerLoteTributos = new LineCnabRegistroTrailerLoteTributosPagamento();
        trailerLoteTributos.setCodigoBanco("341");
        trailerLoteTributos.setCodigoLote("0004");
        trailerLoteTributos.setTipoRegistro("5");
        trailerLoteTributos.setBrancos1("");
        trailerLoteTributos.setTotalQtdRegistros("000006"); // Soma dos registros do tipo 1,3, 5 
        trailerLoteTributos.setTotalValorPrincipal("00000000000500");
        trailerLoteTributos.setTotalOutrasEntidades("00000000000000");
        trailerLoteTributos.setTotalValorAcrescimos("00000000000000");
        trailerLoteTributos.setTotalValorArrecad("00000000000500");
        trailerLoteTributos.setBrancos2("");
        trailerLoteTributos.setOcorrencias("");
        
        LineCnabRegistroTrailerArquivoPagamento trailerArquivo = new LineCnabRegistroTrailerArquivoPagamento();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");
        trailerArquivo.setTipoRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalQtdLotes("000004");
        trailerArquivo.setTotalQtdRegistros("000027");
        trailerArquivo.setBrancos2("");
       
        String resultHeader = headerArquivo.getRepresentation(headerArquivo);
        System.out.println(resultHeader);
        String resultHeaderLote = headerLote.getRepresentation(headerLote);
        System.out.println(resultHeaderLote);
        String resultA = segmentoA.getRepresentation(segmentoA);
        System.out.println(resultA);
        String resultANotaFiscal = segmentoANotaFiscal.getRepresentation(segmentoANotaFiscal);
        System.out.println(resultANotaFiscal);       
//        String resultB = segmentoB.getRepresentation(segmentoB);
//        System.out.println(resultB);
        String resultC = segmentoC.getRepresentation(segmentoC);
        System.out.println(resultC);
//        String resultD = segmentoD.getRepresentation(segmentoD);
//        System.out.println(resultD);
        String resultE = segmentoE.getRepresentation(segmentoE);
        System.out.println(resultE);        
        String resultF = segmentoF.getRepresentation(segmentoF);
        System.out.println(resultF);
        String resultZ = segmentoZ.getRepresentation(segmentoZ);
        System.out.println(resultZ);
        String resultTrailerLote = trailerLote.getRepresentation(trailerLote);
        System.out.println(resultTrailerLote);
                
        String resultHeaderLoteTitulos = headerLoteTitulos.getRepresentation(headerLoteTitulos);
        System.out.println(resultHeaderLoteTitulos);
        String resultJ = segmentoJ.getRepresentation(segmentoJ);
        System.out.println(resultJ);
        String resultJ52 = segmentoJ52.getRepresentation(segmentoJ52);
        System.out.println(resultJ52);
        String resultBTitulos = segmentoBTitulos.getRepresentation(segmentoBTitulos);
        System.out.println(resultBTitulos);
        String resultCTitulos = segmentoCTitulos.getRepresentation(segmentoCTitulos);
        System.out.println(resultCTitulos);
        String resultZTitulos = segmentoZTitulos.getRepresentation(segmentoZTitulos);
        System.out.println(resultZTitulos);
        String resultTrailerLoteTitulos = trailerLoteTitulos.getRepresentation(trailerLoteTitulos);
        System.out.println(resultTrailerLoteTitulos);
        
        String resultHeaderLoteConcessionarias = headerLoteConcessionarias.getRepresentation(headerLoteConcessionarias);
        System.out.println(resultHeaderLoteConcessionarias);
        String resultO = segmentoO.getRepresentation(segmentoO);
        System.out.println(resultO);
        String resultZConcessionarias = segmentoZConcessionarias.getRepresentation(segmentoZConcessionarias);
        System.out.println(resultZConcessionarias);
        String resultTrailerLoteConcessionarias = trailerLoteConcessionarias.getRepresentation(trailerLoteConcessionarias);
        System.out.println(resultTrailerLoteConcessionarias);

        String resultHeaderLoteTributos = headerLoteTributos.getRepresentation(headerLoteTributos);
        System.out.println(resultHeaderLoteTributos);
        String resultN = segmentoN.getRepresentation(segmentoN);
        System.out.println(resultN);
        String resultBTributos = segmentoBTributos.getRepresentation(segmentoBTributos);
        System.out.println(resultBTributos);
        String resultW = segmentoW.getRepresentation(segmentoW);
        System.out.println(resultW);
        String resultZTributos = segmentoZTributos.getRepresentation(segmentoZTributos);
        System.out.println(resultZTributos);
        String resulTtrailerLoteTributos = trailerLoteTributos.getRepresentation(trailerLoteTributos);
        System.out.println(resulTtrailerLoteTributos);
        
        String resultTrailerArquivo = trailerArquivo.getRepresentation(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\ITAU1908.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        
        // Para gravar os registro do tipo de pagamentos de contas
        gravar.println(headerArquivo.getRepresentation(headerArquivo));
        gravar.println(headerLote.getRepresentation(headerLote));
        gravar.println(segmentoA.getRepresentation(segmentoA));
        gravar.println(segmentoANotaFiscal.getRepresentation(segmentoANotaFiscal));
//        gravar.println(segmentoB.getRepresentation(segmentoB));
        gravar.println(segmentoC.getRepresentation(segmentoC));
//        gravar.println(segmentoD.getRepresentation(segmentoD));
        gravar.println(segmentoE.getRepresentation(segmentoE));
        gravar.println(segmentoF.getRepresentation(segmentoF));
        gravar.println(segmentoZ.getRepresentation(segmentoZ));
        gravar.println(trailerLote.getRepresentation(trailerLote));
        
        // Para gravar os registros do tipo de pagamento de titulos
        gravar.println(headerLoteTitulos.getRepresentation(headerLoteTitulos));
        gravar.println(segmentoJ.getRepresentation(segmentoJ));
        gravar.println(segmentoJ52.getRepresentation(segmentoJ52));
        gravar.println(segmentoBTitulos.getRepresentation(segmentoBTitulos));
        gravar.println(segmentoCTitulos.getRepresentation(segmentoCTitulos));
        gravar.println(segmentoZTitulos.getRepresentation(segmentoZTitulos));
        gravar.println(trailerLoteTitulos.getRepresentation(trailerLoteTitulos));
        
        //Para gravar os registros do tipo de pagamento de concessionarias
        gravar.println(headerLoteConcessionarias.getRepresentation(headerLoteConcessionarias));
        gravar.println(segmentoO.getRepresentation(segmentoO));
        gravar.println(segmentoZConcessionarias.getRepresentation(segmentoZConcessionarias));
        gravar.println(trailerLoteConcessionarias.getRepresentation(trailerLoteConcessionarias));
        
        //Para gravar os registros do tipo de pagamento de tributos
        gravar.println(headerLoteTributos.getRepresentation(headerLoteTributos));
        gravar.println(segmentoN.getRepresentation(segmentoN));
        gravar.println(segmentoBTributos.getRepresentation(segmentoBTributos));
        gravar.println(segmentoW.getRepresentation(segmentoW));
        gravar.println(segmentoZTributos.getRepresentation(segmentoZTributos));
        gravar.println(trailerLoteTributos.getRepresentation(trailerLoteTributos));
        
        gravar.println(trailerArquivo.getRepresentation(trailerArquivo));
        gravar.close(); 
    }
}
