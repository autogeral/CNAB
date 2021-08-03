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
        while ((linha= br.readLine()) != null) {
             System.out.println(linha);
       }
   }
}
