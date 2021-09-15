package br.com.jcomputacao.cnab.itau240;

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
        if (linha.startsWith("0")) {
            trataHeaderRetorno(linha, loteRetorno);
        }
        if (linha.startsWith("1")){
            trataRegistro(linha, loteRetorno);
        }
        if (linha.startsWith("9")){
            trataRegistroTrailer(linha, loteRetorno);            
        }     
    }
    
    private void trataHeaderRetorno(String linha, Cnab240ItauLoteRetorno loteRetorno) {
         
    }
    
    private void trataRegistro(String linha, Cnab240ItauLoteRetorno loteRetorno) {
        
    }
    
    private void trataRegistroTrailer(String linha, Cnab240ItauLoteRetorno loteRetorno) {
         
    }
}
