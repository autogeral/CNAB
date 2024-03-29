package br.com.jcomputacao.cnab.Cef240;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * 05/09/2014 14:10:44
 *
 * @author Thiago
 */
public class ArquivoRetornoCEFModel {

    LineCnabCaixaEconomicaRemessaRetorno cnab240 = new LineCnabCaixaEconomicaRemessaRetorno();
    LineCnabCaixaEconomicaCnabHeaderTraillerArquivo arquivo240 = new LineCnabCaixaEconomicaCnabHeaderTraillerArquivo();
    LineCnabCaixaEconomicaRetornoTrailerLote trailerLote = new LineCnabCaixaEconomicaRetornoTrailerLote();
    LineCnabCaixaEconomicaRetornoHeaderLote lote240 = new LineCnabCaixaEconomicaRetornoHeaderLote();
    LineCnabCaixaEconomicaRetornoSegmentoP segmentoP = new LineCnabCaixaEconomicaRetornoSegmentoP();
    LineCnabCaixaEconomicaRetornoSegmentoT segmentoT = new LineCnabCaixaEconomicaRetornoSegmentoT();
    LineCnabCaixaEconomicaRetornoSegmentoU segmentoU = new LineCnabCaixaEconomicaRetornoSegmentoU();
    LineCnabCaixaEconomicaRetornoSegmentoUMovimento segmentoUCodigoMovimento = new LineCnabCaixaEconomicaRetornoSegmentoUMovimento();
    List<LineCnabCaixaEconomicaRetornoSegmentoP> listaSegmentoP = new ArrayList<LineCnabCaixaEconomicaRetornoSegmentoP>();
    List<LineCnabCaixaEconomicaRetornoSegmentoT> listaSegmentoT = new ArrayList<LineCnabCaixaEconomicaRetornoSegmentoT>();
    List<LineCnabCaixaEconomicaRetornoSegmentoU> listaSegmentoU = new ArrayList<LineCnabCaixaEconomicaRetornoSegmentoU>();
    List<LineCnabCaixaEconomicaRetornoSegmentoUMovimento> listaSegmentoUMovimento = new ArrayList<LineCnabCaixaEconomicaRetornoSegmentoUMovimento>();
    

    public LineCnabCaixaEconomicaRemessaRetorno getCnab240() {
        return cnab240;
    }

    public void setCnab240(LineCnabCaixaEconomicaRemessaRetorno cnab240) {
        this.cnab240 = cnab240;
    }

    public LineCnabCaixaEconomicaCnabHeaderTraillerArquivo getArquivo240() {
        return arquivo240;
    }

    public void setArquivo240(LineCnabCaixaEconomicaCnabHeaderTraillerArquivo arquivo240) {
        this.arquivo240 = arquivo240;
    }

    public LineCnabCaixaEconomicaRetornoHeaderLote getLote240() {
        return lote240;
    }

    public void setLote240(LineCnabCaixaEconomicaRetornoHeaderLote lote240) {
        this.lote240 = lote240;
    }

    public LineCnabCaixaEconomicaRetornoSegmentoP getSegmentoP() {
        return segmentoP;
    }

    public void setSegmentoP(LineCnabCaixaEconomicaRetornoSegmentoP segmentoP) {
        this.segmentoP = segmentoP;
    }

    public LineCnabCaixaEconomicaRetornoSegmentoT getSegmentoT() {
        return segmentoT;
    }

    public void setSegmentoT(LineCnabCaixaEconomicaRetornoSegmentoT segmentoT) {
        this.segmentoT = segmentoT;
    }

    public LineCnabCaixaEconomicaRetornoSegmentoU getSegmentoU() {
        return segmentoU;
    }

    public void setSegmentoU(LineCnabCaixaEconomicaRetornoSegmentoU segmentoU) {
        this.segmentoU = segmentoU;
    }

    public LineCnabCaixaEconomicaRetornoSegmentoUMovimento getSegmentoUCodigoMovimento() {
        return segmentoUCodigoMovimento;
    }

    public void setSegmentoUCodigoMovimento(LineCnabCaixaEconomicaRetornoSegmentoUMovimento segmentoUCodigoMovimento) {
        this.segmentoUCodigoMovimento = segmentoUCodigoMovimento;
    }

    public List<LineCnabCaixaEconomicaRetornoSegmentoP> getListaSegmentoP() {
        return listaSegmentoP;
    }

    public void setListaSegmentoP(List<LineCnabCaixaEconomicaRetornoSegmentoP> listaSegmentoP) {
        this.listaSegmentoP = listaSegmentoP;
    }

    public List<LineCnabCaixaEconomicaRetornoSegmentoT> getListaSegmentoT() {
        return listaSegmentoT;
    }

    public void setListaSegmentoT(List<LineCnabCaixaEconomicaRetornoSegmentoT> listaSegmentoT) {
        this.listaSegmentoT = listaSegmentoT;
    }

    public List<LineCnabCaixaEconomicaRetornoSegmentoU> getListaSegmentoU() {
        return listaSegmentoU;
    }

    public void setListaSegmentoU(List<LineCnabCaixaEconomicaRetornoSegmentoU> listaSegmentoU) {
        this.listaSegmentoU = listaSegmentoU;
    }

    public List<LineCnabCaixaEconomicaRetornoSegmentoUMovimento> getListaSegmentoUMovimento() {
        return listaSegmentoUMovimento;
    }

    public void setListaSegmentoUMovimento(List<LineCnabCaixaEconomicaRetornoSegmentoUMovimento> listaSegmentoUMovimento) {
        this.listaSegmentoUMovimento = listaSegmentoUMovimento;
    }    

    public boolean read(String filePath) throws IOException, ParseException {

        BufferedReader rd = new BufferedReader(new FileReader(filePath));
        String line = rd.readLine();
        if (line == null) {
            rd.close();
            return false;
        }
        if (line.startsWith("1") && line.length() == 240) {

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
                            listaSegmentoP.add(segmentoP);
                        } else if ("T".equals(tipoSegmento.toUpperCase())) {
                            cnab240.trataRegistroRegistroDetalheSegmentoT(segmentoT, line);
                            listaSegmentoT.add(segmentoT);
                            segmentoT = new LineCnabCaixaEconomicaRetornoSegmentoT();
                        } else if ("U".equals(tipoSegmento.toUpperCase())) {
                            int codigo_Movimento = Integer.parseInt(line.substring(15, 17));
                            if (codigo_Movimento == 35 || codigo_Movimento == 36 || codigo_Movimento == 37) {
                                cnab240.trataRegistroRegistroDetalheSegmentoU35_36_37(segmentoUCodigoMovimento, line);
                                listaSegmentoUMovimento.add(segmentoUCodigoMovimento);
                                segmentoUCodigoMovimento = new LineCnabCaixaEconomicaRetornoSegmentoUMovimento();
                            } else {
                                cnab240.trataRegistroRegistroDetalheSegmentoU(segmentoU, line);
                                listaSegmentoU.add(segmentoU);
                                segmentoU = new LineCnabCaixaEconomicaRetornoSegmentoU();
                            }
                        }
                        break;

                    case 5:
                        cnab240.trataRegistroRegistroDetalheTralerLote(trailerLote, line);
                        break;

                    case 9:
                        cnab240.trataTrailerArquivoRemessa(arquivo240, line);
                        break;
                }
            } while ((line = rd.readLine()) != null);
        }
        return true;
    }
    
}
