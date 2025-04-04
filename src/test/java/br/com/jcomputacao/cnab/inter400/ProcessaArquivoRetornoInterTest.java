package br.com.jcomputacao.cnab.inter400;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *    03.08.21
 */

public class ProcessaArquivoRetornoInterTest { 
    
   @Test
   public void processaRetorno() throws IOException {
        FileReader fr = new FileReader("C:/Users/larissa.camargo/Documents/IntegracaoBancoInter/CI400_260721143346669_001.ret");
        BufferedReader br = new BufferedReader(fr);
        String linha;
        Cnab400InterLoteRetorno loteRetorno = new Cnab400InterLoteRetorno();
        Cnab400InterArquivoRetorno retorno = new Cnab400InterArquivoRetorno();
        while ((linha= br.readLine()) != null) {             
             retorno.tratarLinha(loteRetorno, linha);
       }
       mostraLoteRetorno(loteRetorno);
   }

    private void mostraLoteRetorno(Cnab400InterLoteRetorno loteRetorno) {
        System.out.println("Header do arquivo");
        System.out.println(loteRetorno.getLiteralRetorno());
        if(loteRetorno.getTipo1Retorno() != null 
                && !loteRetorno.getTipo1Retorno().isEmpty()) {
            for(Cnab400InterTipo1Retorno c : loteRetorno.getTipo1Retorno()){
                System.out.println("Registro Tipo1");
                System.out.println(c.getNomePagador());
                System.out.println(c.getValorPago());
            }
        }
        System.out.println("Trailler do arquivo");
        System.out.println(loteRetorno.getCodigoBancoTrailer());
    }
}

