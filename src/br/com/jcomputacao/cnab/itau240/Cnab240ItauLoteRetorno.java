package br.com.jcomputacao.cnab.itau240;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author larissa.camargo
 *    15.09.2021
 */
public class Cnab240ItauLoteRetorno {
    private LineCnabRegistroHeaderRemessa headerArquivo;
    private LineCnabRegistroHeaderLoteRemessa headerLote;
    private List<LineCnabRegistroSegmentoTRetorno> segmentoTRetorno = new ArrayList<LineCnabRegistroSegmentoTRetorno>();    
    private List<LineCnabRegistroSegmentoURetorno> segmentoURetorno = new ArrayList<LineCnabRegistroSegmentoURetorno>();
    private LineCnabRegistroTrailerLote trailerLote;
    private LineCnabRegistroTrailerArquivo trailerArquivo;

    public LineCnabRegistroHeaderRemessa getHeaderArquivo() {
        return headerArquivo;
    }

    public void setHeaderArquivo(LineCnabRegistroHeaderRemessa headerArquivo) {
        this.headerArquivo = headerArquivo;
    }

    public LineCnabRegistroHeaderLoteRemessa getHeaderLote() {
        return headerLote;
    }

    public void setHeaderLote(LineCnabRegistroHeaderLoteRemessa headerLote) {
        this.headerLote = headerLote;
    }

    public List<LineCnabRegistroSegmentoTRetorno> getSegmentoTRetorno() {
        return segmentoTRetorno;
    }

    public void setSegmentoTRetorno(List<LineCnabRegistroSegmentoTRetorno> segmentoTRetorno) {
        this.segmentoTRetorno = segmentoTRetorno;
    }

    public List<LineCnabRegistroSegmentoURetorno> getSegmentoURetorno() {
        return segmentoURetorno;
    }

    public void setSegmentoURetorno(List<LineCnabRegistroSegmentoURetorno> segmentoURetorno) {
        this.segmentoURetorno = segmentoURetorno;
    }

    public LineCnabRegistroTrailerLote getTrailerLote() {
        return trailerLote;
    }

    public void setTrailerLote(LineCnabRegistroTrailerLote trailerLote) {
        this.trailerLote = trailerLote;
    }

    public LineCnabRegistroTrailerArquivo getTrailerArquivo() {
        return trailerArquivo;
    }

    public void setTrailerArquivo(LineCnabRegistroTrailerArquivo trailerArquivo) {
        this.trailerArquivo = trailerArquivo;
    }
}
