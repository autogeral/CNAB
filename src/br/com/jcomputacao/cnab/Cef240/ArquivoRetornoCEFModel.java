package br.com.jcomputacao.cnab.Cef240;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

/**
 * 05/09/2014 14:10:44
 *
 * @author Thiago
 */
public class ArquivoRetornoCEFModel {

    LineCnabCaixaEconomicaRemessaRetorno cnab240 = new LineCnabCaixaEconomicaRemessaRetorno();
    LineCnabCaixaEconomicaCnabHeaderTraillerArquivo arquivo240 = new LineCnabCaixaEconomicaCnabHeaderTraillerArquivo();
    LineCnabCaixaEconomicaRetornoHeaderLote lote240 = new LineCnabCaixaEconomicaRetornoHeaderLote();
    LineCnabCaixaEconomicaRetornoSegmentoP segmentoP = new LineCnabCaixaEconomicaRetornoSegmentoP();
    LineCnabCaixaEconomicaRetornoSegmentoT segmentoT = new LineCnabCaixaEconomicaRetornoSegmentoT();
    LineCnabCaixaEconomicaRetornoSegmentoU segmentoU = new LineCnabCaixaEconomicaRetornoSegmentoU();
    LineCnabCaixaEconomicaRetornoSegmentoUMovimento segmentoUCodigoMovimento = new LineCnabCaixaEconomicaRetornoSegmentoUMovimento();

    public ArquivoRetornoCEFModel() {

    }

    public boolean read(String filePath) throws IOException, ParseException {

        BufferedReader rd = new BufferedReader(new FileReader(filePath));
        String line = rd.readLine();
        if (line == null) {
            rd.close();
            return false;
        }
        if (line.startsWith("1") && line.length() == 240) {

            if (line.startsWith("0") && line.length() == 240) {

                do {

                    int tipoRegistro = Integer.parseInt(line.substring(7, 8));
                    switch (tipoRegistro) {
                        case 0:
                            cnab240.trataHeaderArquivoRemessa(arquivo240, line);
                            break;

                        case 1:
                            cnab240.trataRegistroHeaderLote(lote240, line);
                            break;

                        case 3:
                            String tipoSegmento = line.substring(13, 14);

                            if ("P".equals(tipoSegmento.toUpperCase())) {
                                cnab240.trataRegistroRegistroDetalheSegmentoP(segmentoP, line);
                            } else if ("T".equals(tipoSegmento.toUpperCase())) {
                                cnab240.trataRegistroRegistroDetalheSegmentoT(segmentoT, line);
                            } else if ("U".equals(tipoSegmento.toUpperCase())) {
                                int codigo_Movimento = Integer.parseInt(line.substring(15, 17));

                                if (codigo_Movimento == 35 || codigo_Movimento == 36 || codigo_Movimento == 37) {
                                    cnab240.trataRegistroRegistroDetalheSegmentoU35_36_37(segmentoUCodigoMovimento, line);
                                } else {
                                    cnab240.trataRegistroRegistroDetalheSegmentoU(segmentoU, line);
                                }

                            }
                            break;

                        case 5:
                            cnab240.trataTrailerArquivoRemessa(arquivo240, line);
                            break;

                        case 9:
                            cnab240.trataTrailerArquivoRemessa(arquivo240, line);
                            break;
                    }
                } while ((line = rd.readLine()) != null);
            }
        }
        return true;
    }

}
