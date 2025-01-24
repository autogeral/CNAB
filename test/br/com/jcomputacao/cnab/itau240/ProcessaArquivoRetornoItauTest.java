package br.com.jcomputacao.cnab.itau240;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author larissa.camargo 15.09.2021
 */
public class ProcessaArquivoRetornoItauTest {

    @Test
    public void processaRetorno() throws IOException {
        String onedrive = "C:\\Users\\MurilodeMoraesTuvani\\OneDrive\\autogeral\\conciliacao\\Boletos\\";
        String nomeArquivo = onedrive + "B420084A.RET";
        File file = new File(nomeArquivo);
        if (file.exists()) {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            Cnab240ItauLoteRetorno loteRetorno = new Cnab240ItauLoteRetorno();
            Cnab240ItauArquivoRetorno retorno = new Cnab240ItauArquivoRetorno();
            while ((linha = br.readLine()) != null) {
                retorno.tratarLinha(loteRetorno, linha);
            }
            mostraLoteRetorno(loteRetorno);
        } else {
            System.out.println("Arquivo nao encontrado : " + file.getAbsolutePath());
        }
    }

    private void mostraLoteRetorno(Cnab240ItauLoteRetorno loteRetorno) {
        System.out.println("Header do arquivo");
        LineCnabRegistroHeaderRemessa headerArquivo = loteRetorno.getHeaderArquivo();
        System.out.println(headerArquivo.getAgencia());
        System.out.println("Header do Lote");
        LineCnabRegistroHeaderLoteRemessa headerLote = loteRetorno.getHeaderLote();
        System.out.println(headerLote.getCodigoLote());

        if (loteRetorno.getSegmentoTRetorno() != null
                && !loteRetorno.getSegmentoTRetorno().isEmpty()) {
            for (LineCnabRegistroSegmentoTRetorno c : loteRetorno.getSegmentoTRetorno()) {
                System.out.println("Segmento T");
                System.out.println(c.getCodigoBanco());
                System.out.println(c.getValorTitulo());
                System.out.println(c.getNossoNumero());
                System.out.println(c.getVencimento());
            }
            for (LineCnabRegistroSegmentoURetorno c : loteRetorno.getSegmentoURetorno()) {
                System.out.println("Segmento U");
                System.out.println(c.getCodigoLote());
            }

            System.out.println("Trailer do Lote");
            LineCnabRegistroTrailerLote trailerLote = loteRetorno.getTrailerLote();
            System.out.println(trailerLote.getCodigoLote());

            System.out.println("Trailer do Arquivo");
            LineCnabRegistroTrailerArquivo trailerArquivo = loteRetorno.getTrailerArquivo();
            System.out.println(trailerArquivo.getTotalLotes());
        }
    }
}
