package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *      27.08.2021
 * 
 */
@Record
public class LineCnabRegistroSegmentoURetorno extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String registro;
    private String numRegistro;
    private String segmento;
    private String brancos1;
    private String codOcorrencia;
    private String jurosMulta;
    private String valorDesconto;
    private String valorAbatimento;
    private String valorIof;
    private String valorCreditado1;
    private String valorCreditado2;
    private String zeros1;
    private String dataOcorrencia1;
    private String dataCredito;
    private String ocorrenciaPagador;
    private String dataOcorrencia2;
    private String valorOcorrencia;
    private String brancos2;
    private String zeros2;
    private String brancos3;

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
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
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

     @Field(offset = 18, length = 15)
    public String getJurosMulta() {
        return jurosMulta;
    }

    public void setJurosMulta(String jurosMulta) {
        this.jurosMulta = jurosMulta;
    }

     @Field(offset = 33, length = 15)
    public String getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

     @Field(offset = 48, length = 15)
    public String getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(String valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

     @Field(offset = 63, length = 15)
    public String getValorIof() {
        return valorIof;
    }

    public void setValorIof(String valorIof) {
        this.valorIof = valorIof;
    }

     @Field(offset = 78, length = 15)
    public String getValorCreditado1() {
        return valorCreditado1;
    }

    public void setValorCreditado1(String valorCreditado1) {
        this.valorCreditado1 = valorCreditado1;
    }

    @Field(offset = 93, length = 15)
    public String getValorCreditado2() {
        return valorCreditado2;
    }

    public void setValorCreditado2(String valorCreditado2) {
        this.valorCreditado2 = valorCreditado2;
    }

     @Field(offset = 108, length = 30)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

     @Field(offset = 138, length = 8)
    public String getDataOcorrencia1() {
        return dataOcorrencia1;
    }

    public void setDataOcorrencia1(String dataOcorrencia1) {
        this.dataOcorrencia1 = dataOcorrencia1;
    }

     @Field(offset = 146, length = 8)
    public String getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(String dataCredito) {
        this.dataCredito = dataCredito;
    }

     @Field(offset = 154, length = 4)
    public String getOcorrenciaPagador() {
        return ocorrenciaPagador;
    }

    public void setOcorrenciaPagador(String ocorrenciaPagador) {
        this.ocorrenciaPagador = ocorrenciaPagador;
    }

     @Field(offset = 158, length = 8)
    public String getDataOcorrencia2() {
        return dataOcorrencia2;
    }

    public void setDataOcorrencia2(String dataOcorrencia2) {
        this.dataOcorrencia2 = dataOcorrencia2;
    }

     @Field(offset = 166, length = 15)
    public String getValorOcorrencia() {
        return valorOcorrencia;
    }

    public void setValorOcorrencia(String valorOcorrencia) {
        this.valorOcorrencia = valorOcorrencia;
    }

     @Field(offset = 181, length = 30)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

     @Field(offset = 211, length = 23)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

     @Field(offset = 234, length = 7)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoURetorno{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", registro=" + registro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", brancos1=" + brancos1 + ", codOcorrrencia=" + codOcorrencia + ", jurosMulta=" + jurosMulta + ", valorDesconto=" + valorDesconto + ", valorAbatimento=" + valorAbatimento + ", valorIof=" + valorIof + ", valorCreditado1=" + valorCreditado1 + ", valorCreditado2=" + valorCreditado2 + ", zeros1=" + zeros1 + ", dataOcorrencia1=" + dataOcorrencia1 + ", dataCredito=" + dataCredito + ", ocorrenciaPagador=" + ocorrenciaPagador + ", dataOcorrencia2=" + dataOcorrencia2 + ", valorOcorrencia=" + valorOcorrencia + ", brancos2=" + brancos2 + ", zeros2=" + zeros2 + ", brancos3=" + brancos3 + '}';
    }
}
