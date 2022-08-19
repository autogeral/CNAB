package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderLoteConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroHeaderRemessaPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoOConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoZConcessionariasPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerArquivoPagamento;
import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroTrailerLoteConcessionariasPagamento;
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
public class GerarRemessaConcessionariasTest {
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
        
        LineCnabRegistroHeaderLoteConcessionariasPagamento headerLote = new LineCnabRegistroHeaderLoteConcessionariasPagamento();
        headerLote.setCodigoBanco("341");
        headerLote.setCodigoLote("0001");
        headerLote.setTipoRegistro("1");
        headerLote.setTipoOperacao("C");
        headerLote.setTipoPagamento("98");
        headerLote.setFormaPagamento("13");
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
        headerLote.setHistoricoContaCorrente("");
        headerLote.setEnderecoEmpresa("AV DR OTAVIANO PEREIRA MENDES");
        headerLote.setNumero("1333");
        headerLote.setComplemento("LOJA MATRIZ");
        headerLote.setCidade("ITU");
        headerLote.setCep("1331909");
        headerLote.setEstado("SP");
        headerLote.setBrancos5("");
        headerLote.setOcorrencias("");
                
        LineCnabRegistroSegmentoOConcessionariasPagamento segmentoO = new LineCnabRegistroSegmentoOConcessionariasPagamento();
        segmentoO.setCodigoBanco("341");
        segmentoO.setCodigoLote("0001");
        segmentoO.setTipoRegistro("3");
        segmentoO.setNumeroRegistro("00001");
        segmentoO.setCodigoSegmento("O");
        segmentoO.setTipoMovimento("000");
        segmentoO.setCodigoBarras("");
        segmentoO.setNomeConcessionaria("CPFL ENERGIA");
        segmentoO.setDataVencimento("30082022");
        segmentoO.setTipoMoeda("REA");
        segmentoO.setQtdMoeda("");
        segmentoO.setValorPagar("000000000000500");
        segmentoO.setDataPgto("30082022");
        segmentoO.setValorPago("");
        segmentoO.setBrancos1("");
        segmentoO.setNotaFiscal("");
        segmentoO.setBrancos2("");
        segmentoO.setSeuNumero("00000000000000000002");
        segmentoO.setBrancos3("");
        segmentoO.setNossoNumero("");
        segmentoO.setOcorrencias("");
        
        LineCnabRegistroSegmentoZConcessionariasPagamento segmentoZ = new LineCnabRegistroSegmentoZConcessionariasPagamento();
        segmentoZ.setCodigoBanco("341");
        segmentoZ.setCodigoLote("0001");
        segmentoZ.setTipoRegistro("3");
        segmentoZ.setNumeroRegistro("00001");
        segmentoZ.setCodigoSegmento("Z");
        segmentoZ.setAutenticacaoEletronica("");
        segmentoZ.setSeuNumero("");
        segmentoZ.setBrancos1("");
        segmentoZ.setNossoNumero("");
        segmentoZ.setBrancos2("");
        
        LineCnabRegistroTrailerLoteConcessionariasPagamento trailerLote = new LineCnabRegistroTrailerLoteConcessionariasPagamento();
        trailerLote.setCodigoBanco("341");
        trailerLote.setCodigoLote("0001");
        trailerLote.setTipoRegistro("5");
        trailerLote.setBrancos1("");
        trailerLote.setTotalQtdRegistros("000004");
        trailerLote.setTotalValorPgto("000000000000000001");
        trailerLote.setTotalQtdeMoeda("000000000000000000");
        trailerLote.setBrancos2("");
        trailerLote.setOcorrencias("");
        
        LineCnabRegistroTrailerArquivoPagamento trailerArquivo = new LineCnabRegistroTrailerArquivoPagamento();
        trailerArquivo.setCodigoBanco("341");
        trailerArquivo.setCodigoLote("9999");
        trailerArquivo.setTipoRegistro("9");
        trailerArquivo.setBrancos1("");
        trailerArquivo.setTotalQtdLotes("000001");
        trailerArquivo.setTotalQtdRegistros("000006");
        trailerArquivo.setBrancos2("");
        
        String resultHeader = headerArquivo.getRepresentation(headerArquivo);
        System.out.println(resultHeader);
        
        String resultHeaderLote = headerLote.getRepresentation(headerLote);
        System.out.println(resultHeaderLote);
        
        String resultO = segmentoO.getRepresentation(segmentoO);
        System.out.println(resultO);
        
        String resultZ = segmentoZ.getRepresentation(segmentoZ);
        System.out.println(resultZ);
        
        String resultTrailerLote = trailerLote.getRepresentation(trailerLote);
        System.out.println(resultTrailerLote);
        
        String resultTrailerArquivo = trailerArquivo.getRepresentation(trailerArquivo);
        System.out.println(resultTrailerArquivo);
        
        FileWriter text = new FileWriter("C:\\Users\\larissa.camargo\\Documents\\IntegracaoBancoItau\\ITAU-03-12082022.txt");
        PrintWriter gravar = new PrintWriter(text);
        
        gravar.println(headerArquivo.getRepresentation(headerArquivo));
        gravar.println(headerLote.getRepresentation(headerLote));
        gravar.println(segmentoO.getRepresentation(segmentoO));
        gravar.println(segmentoZ.getRepresentation(segmentoZ));
        gravar.println(trailerLote.getRepresentation(trailerLote));
        gravar.println(trailerArquivo.getRepresentation(trailerArquivo));
        
        gravar.close();       
    }
}
