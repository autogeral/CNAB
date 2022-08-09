package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   08.08.2022
 */
@Record
public class LineCnabRegistroTrailerLoteTributosPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String brancos1;
    private String totalQtdRegistros;
    private String totalValorPrincipal;
    private String totalOutrasEntidades;
    private String totalValorAcrescimos;
    private String totalValorArrecad;
    private String brancos2;
    private String ocorrencias;
    
    /*
        REGISTRO TRAILER DE LOTE 
    P/PAGAMENTOS DE TRIBUTOS SEM CÓDIGO DE BARRAS E FGTS-GRF/GRRF/GRDE COM CÓDIGO DE BARRAS
    Este campo deve ser utilizado para informar o somatório dos pagamentos do tributo GPS – Guia da
    Previdência Social, e o somatório do campo “DESCONTO” quando se tratar de pagamentos de
    IPVA.
    */
    
    @Field(offset = 1, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 4, length = 4)
    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    @Field(offset = 8, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 9, length = 9)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 18, length = 6)
    public String getTotalQtdRegistros() {
        return totalQtdRegistros;
    }

    public void setTotalQtdRegistros(String totalQtdRegistros) {
        this.totalQtdRegistros = totalQtdRegistros;
    }

    @Field(offset = 24, length = 14)
    public String getTotalValorPrincipal() {
        return totalValorPrincipal;
    }

    public void setTotalValorPrincipal(String totalValorPrincipal) {
        this.totalValorPrincipal = totalValorPrincipal;
    }

    @Field(offset = 38, length = 14)
    public String getTotalOutrasEntidades() {
        return totalOutrasEntidades;
    }

    public void setTotalOutrasEntidades(String totalOutrasEntidades) {
        this.totalOutrasEntidades = totalOutrasEntidades;
    }

    @Field(offset = 52, length = 14)
    public String getTotalValorAcrescimos() {
        return totalValorAcrescimos;
    }

    public void setTotalValorAcrescimos(String totalValorAcrescimos) {
        this.totalValorAcrescimos = totalValorAcrescimos;
    }

    @Field(offset = 66, length = 14)
    public String getTotalValorArrecad() {
        return totalValorArrecad;
    }

    public void setTotalValorArrecad(String totalValorArrecad) {
        this.totalValorArrecad = totalValorArrecad;
    }

    @Field(offset = 80, length = 151)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 231, length = 10)
    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTrailerLoteTributosPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancos1=" + brancos1 + ", totalQtdRegistros=" + totalQtdRegistros + ", totalValorPrincipal=" + totalValorPrincipal + ", totalOutrasEntidades=" + totalOutrasEntidades + ", totalValorAcrescimos=" + totalValorAcrescimos + ", totalValorArrecad=" + totalValorArrecad + ", brancos2=" + brancos2 + ", ocorrencias=" + ocorrencias + '}';
    }
}
