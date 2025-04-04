package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.util.List;

/**
 *
 * @author larissa.camargo
 *   15.09.2021
 */
public class Cnab240ItauArquivoRetorno {
    
    public void tratarLinha(Cnab240ItauLoteRetorno loteRetorno, String linha) {
        if (linha == null) {
            return;
        }
        String tipoRegistro = linha.substring(7, 8);
        if (tipoRegistro.startsWith("0")) {
            trataHeaderRemessa(linha, loteRetorno);
        }
        if(tipoRegistro.startsWith("1")){
            trataHeaderLote(linha, loteRetorno);
        }
        if (tipoRegistro.startsWith("3")){
            trataSegmento(linha, loteRetorno);
        }
        if (tipoRegistro.startsWith("5")){
            trataTrailerLote(linha, loteRetorno);
        }
        if (tipoRegistro.startsWith("9")){
            trataTrailerArquivo(linha, loteRetorno);
        }
        
        String tipoOperacao = linha.substring(9, 9);
        if (tipoOperacao.startsWith("T")) {
            trataHeaderLote(linha, loteRetorno);
        }
        
        String tipoSegmento = linha.substring(14, 15);
        if (tipoSegmento.startsWith("T")) {
            trataSegmentoT(linha, loteRetorno);
        }
        if (tipoSegmento.startsWith("U")){
            trataSegmentoU(linha, loteRetorno);
        }
    }
    private void trataHeaderRemessa(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroHeaderRemessa lr = manager.load(LineCnabRegistroHeaderRemessa.class, linha);        
        loteRetorno.setHeaderArquivo(lr);
    }
     private void trataHeaderLote(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroHeaderLoteRemessa lr = manager.load(LineCnabRegistroHeaderLoteRemessa.class, linha);        
        loteRetorno.setHeaderLote(lr);  
     }
    private void trataSegmento(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        String segmento = linha.substring(13, 14);
        if("T".equals(segmento)) {
            trataSegmentoT(linha, loteRetorno);
        } else if("U".equals(segmento)) {
            trataSegmentoU(linha, loteRetorno);
        }
        
    }
    private void trataSegmentoT(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroSegmentoTRetorno lr = manager.load(LineCnabRegistroSegmentoTRetorno.class, linha);
        List<LineCnabRegistroSegmentoTRetorno> tipo1Lista = loteRetorno.getSegmentoTRetorno();     
        tipo1Lista.add(lr);        
    }
    private void trataSegmentoU(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroSegmentoURetorno lr = manager.load(LineCnabRegistroSegmentoURetorno.class, linha);        
        loteRetorno.getSegmentoURetorno().add(lr);
    }
    private void trataTrailerLote(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroTrailerLote lr = manager.load(LineCnabRegistroTrailerLote.class, linha);      
        loteRetorno.setTrailerLote(lr); 
    }
    private void trataTrailerArquivo(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroTrailerArquivo lr = manager.load(LineCnabRegistroTrailerArquivo.class, linha); 
        loteRetorno.setTrailerArquivo(lr);
    }
}
