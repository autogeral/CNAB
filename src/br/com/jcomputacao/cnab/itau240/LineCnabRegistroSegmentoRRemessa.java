package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    27.08.2021
 */
@Record
public class LineCnabRegistroSegmentoRRemessa {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String segmento;
    private String brancos1;
    private String codOcorrencia;
    private String zeros1;
    private String data2Desconto;
    private String valor2Desconto;
    private String zeros2;
    private String data3Desconto;
    private String valor3Desconto;
    private String codMulta;
    private String dataMulta;
    private String multa;
    private String brancos2;
    private String infoPagador;
    private String brancos3;
    private String codOcPagador;
    private String zeros3;
    private String brancos4;
    private String zeros4;
    private String branco5;
    private String zeros5;
    private String brancos6;

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

     @Field(offset = 9, length = 5)
    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

     @Field(offset = 14, length = 1)
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

     @Field(offset = 15, length = 1)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

     @Field(offset = 16, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

     @Field(offset = 18, length = 1)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

     @Field(offset = 19, length = 8)
    public String getData2Desconto() {
        return data2Desconto;
    }

    public void setData2Desconto(String data2Desconto) {
        this.data2Desconto = data2Desconto;
    }

     @Field(offset = 27, length = 15)
    public String getValor2Desconto() {
        return valor2Desconto;
    }

    public void setValor2Desconto(String valor2Desconto) {
        this.valor2Desconto = valor2Desconto;
    }

    @Field(offset = 42, length = 1)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

     @Field(offset = 43, length = 8)
    public String getData3Desconto() {
        return data3Desconto;
    }

    public void setData3Desconto(String data3Desconto) {
        this.data3Desconto = data3Desconto;
    }

    @Field(offset = 51, length = 15)
    public String getValor3Desconto() {
        return valor3Desconto;
    }

    public void setValor3Desconto(String valor3Desconto) {
        this.valor3Desconto = valor3Desconto;
    }
   @Field(offset = 66, length = 1)
    public String getCodMulta() {
        return codMulta;
    }

    public void setCodMulta(String codMulta) {
        this.codMulta = codMulta;
    }

     @Field(offset = 67, length = 8)
    public String getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
    }

     @Field(offset = 75, length = 13)
    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

     @Field(offset = 90, length = 10)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

     @Field(offset = 100, length = 40)
    public String getInfoPagador() {
        return infoPagador;
    }

    public void setInfoPagador(String infoPagador) {
        this.infoPagador = infoPagador;
    }

     @Field(offset = 140, length = 60)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

     @Field(offset = 200, length = 8)
    public String getCodOcPagador() {
        return codOcPagador;
    }

    public void setCodOcPagador(String codOcPagador) {
        this.codOcPagador = codOcPagador;
    }

     @Field(offset = 208, length = 8)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

    @Field(offset = 216, length = 1)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Field(offset = 217, length = 12)
    public String getZeros4() {
        return zeros4;
    }
    
    public void setZeros4(String zeros4) {
        this.zeros4 = zeros4;
    }
    
   @Field(offset = 231, length = 1)
    public String getBranco5() {
        return branco5;
    }
    
    public void setBranco5(String branco5) {
        this.branco5 = branco5;
    }

    @Field(offset = 231, length = 1)
    public String getZeros5() {
        return zeros5;
    }

    public void setZeros5(String zeros5) {
        this.zeros5 = zeros5;
    }

    @Field(offset = 232, length = 9)
    public String getBrancos6() {
        return brancos6;
    }

    public void setBrancos6(String brancos6) {
        this.brancos6 = brancos6;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoRRemessa{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", brancos1=" + brancos1 + ", codOcorrencia=" + codOcorrencia + ", zeros1=" + zeros1 + ", data2Desconto=" + data2Desconto + ", valor2Desconto=" + valor2Desconto + ", zeros2=" + zeros2 + ", data3Desconto=" + data3Desconto + ", valor3Desconto=" + valor3Desconto + ", codMulta=" + codMulta + ", dataMulta=" + dataMulta + ", multa=" + multa + ", brancos2=" + brancos2 + ", infoPagador=" + infoPagador + ", brancos3=" + brancos3 + ", codOcPagador=" + codOcPagador + ", zeros3=" + zeros3 + ", brancos4=" + brancos4 + ", zeros4=" + zeros4 + ", branco5=" + branco5 + ", zeros5=" + zeros5 + ", brancos6=" + brancos6 + '}';
    }
}
