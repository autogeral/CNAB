package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.util.List;

/**
 *
 * @author larissa.camargo
 *   04.08.21 
 */

public class Cnab400InterArquivoRetorno {
        
    public void tratarLinha(Cnab400InterLoteRetorno loteRetorno, String linha) {
        if (linha == null) {
            return;
        }
        if (linha.startsWith("0")) {
            trataHeaderRetorno(linha, loteRetorno);
        }
        if (linha.startsWith("1")){
            trataRegistroTipo1Retorno(linha, loteRetorno);
        }
        if (linha.startsWith("9")){
            trataRegistroTrailer(linha, loteRetorno);            
        }     
    }
    
    private void trataHeaderRetorno(String linha, Cnab400InterLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroHeaderRetorno lr = new LineCnabRegistroHeaderRetorno();
        lr = manager.load(LineCnabRegistroHeaderRetorno.class, linha);
        
        loteRetorno.setCodigoRegistroHeaderRetorno(lr.getCodigoRegistroHeaderRetorno()); 
        loteRetorno.setCodigoRetorno(lr.getCodigoRetorno());
        loteRetorno.setLiteralRetorno(lr.getLiteralRetorno());
        loteRetorno.setCodigoServicoRetorno(lr.getCodigoServicoRetorno());
        loteRetorno.setLiteralServicoRetorno(lr.getLiteralServicoRetorno());
        loteRetorno.setBranco1Retorno(lr.getBranco1Retorno());
        loteRetorno.setNomeEmpresaRetorno(lr.getNomeEmpresaRetorno());
        loteRetorno.setCodigoBancoRetorno(lr.getCodigoBancoRetorno());
        loteRetorno.setNomeBancoRetorno(lr.getNomeBancoRetorno());
        loteRetorno.setDataGravacaoRetorno(lr.getDataGravacaoRetorno());
        loteRetorno.setBranco2Retorno(lr.getBranco2Retorno());
        loteRetorno.setSequencialRegistroRetorno(lr.getSequencialRegistroRetorno());
    }

    
    private void trataRegistroTipo1Retorno(String linha, Cnab400InterLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRetornoRegistroTipo1 lr = new LineCnabRetornoRegistroTipo1();
        lr = manager.load(LineCnabRetornoRegistroTipo1.class, linha);
        
        List<Cnab400InterTipo1Retorno> tipo1Lista = loteRetorno.getTipo1Retorno();
        Cnab400InterTipo1Retorno ctr = new Cnab400InterTipo1Retorno();
        ctr.setCodigoRegistroTipo(lr.getCodigoRegistroTipo()); 
        ctr.setTipoInscricao(lr.getTipoInscricao());
        ctr.setNumeroInscricao(lr.getNumeroInscricaoTipo());
        ctr.setZeros1(lr.getZeros1Tipo());
        ctr.setIdentificacaoEmpresa(lr.getIdentificacaoEmpresaTipo());
        ctr.setControleParticipante(lr.getControleParticipanteTipo());
        ctr.setZeros2(lr.getZeros2Tipo());
        ctr.setNossoNumero1(lr.getNossoNumero1Tipo());
        ctr.setBrancoTipo1(lr.getBrancoTipo1());
        ctr.setCarteira(lr.getCarteiraTipo());
        ctr.setIdentificacaoOcorrencia(lr.getIdentificacaoOcorrenciaTipo());
        ctr.setDataOcorrencia(lr.getDataOcorrenciaTipo());
        ctr.setSeuNumero(lr.getSeuNumeroTipo());
        ctr.setNossoNumero2(lr.getNossoNumero2Tipo());
        ctr.setDataVencimentoTitulo(lr.getDataVencimentoTituloTipo());
        ctr.setValorTitulo(lr.getValorTituloTipo());
        ctr.setBancoCobrador(lr.getBancoCobradorTipo());
        ctr.setAgenciaCobradora(lr.getAgenciaCobradoraTipo());
        ctr.setEspecieTitulo(lr.getEspecieTituloTipo());
        ctr.setBrancoTipo2(lr.getBrancoTipo2());
        ctr.setValorPago(lr.getValorPagoTipo());
        ctr.setDataCredito(lr.getDataCreditoTipo());
        ctr.setBranco3(lr.getBranco3Tipo());
        ctr.setNomePagador(lr.getNomePagadorTipo());
        ctr.setBranco4(lr.getBranco4Tipo());
        ctr.setInscricaoPagador(lr.getInscricaoPagadorTipo());
        ctr.setMotivoOcorrencia(lr.getMotivoOcorrenciaTipo());
        ctr.setBranco5(lr.getBranco5Tipo());
        ctr.setSequencialRegistroTipo(lr.getSequencialRegistroTipo());  
        
        tipo1Lista.add(ctr);
    }

    private void trataRegistroTrailer(String linha, Cnab400InterLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRetornoRegistroTrailer lr = new LineCnabRetornoRegistroTrailer();
        lr = manager.load(LineCnabRetornoRegistroTrailer.class, linha);
        
        loteRetorno.setCodigoRegistroTrailer(lr.getCodigoRegistroTrailer());
        loteRetorno.setCodigoRetornoTrailer(lr.getCodigoRetornoTrailer());
        loteRetorno.setTipoRegistroTrailer(lr.getTipoRegistroTrailer());
        loteRetorno.setCodigoBancoTrailer(lr.getCodigoBancoTrailer());
        loteRetorno.setBrancoTrailer(lr.getCodigoBancoTrailer());
        loteRetorno.setQtdRegistros1Trailer(lr.getQtdRegistros1Trailer());
        loteRetorno.setBrancoTrailer2(lr.getBrancoTrailer2());
        loteRetorno.setQtdRegistros2Trailer(lr.getQtdRegistros2Trailer());
        loteRetorno.setValorRegistros1Trailer(lr.getValorRegistros1Trailer());
        loteRetorno.setBrancoTrailer3(lr.getBrancoTrailer3());
        loteRetorno.setQtdRegistros3Trailer(lr.getQtdRegistros3Trailer());
        loteRetorno.setBrancoTrailer4(lr.getBrancoTrailer4());
        loteRetorno.setQtdRegistros4Trailer(lr.getQtdRegistros4Trailer());
        loteRetorno.setValorRegistros2Trailer(lr.getValorRegistros2Trailer());
        loteRetorno.setBrancoTrailer5(lr.getBrancoTrailer5());
        loteRetorno.setSequencialRegistroTrailer(lr.getSequencialRegistroTrailer());        
    }
}
