package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    27.08.2021
 */
@Record
public class LineCnabRegistroSegmentoPRemessa {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String segmento;
    private String brancos1;
    private String codOcorrencia;
    private String zeros1;
    private String agencia;
    private String brancos2;
    private String zeros2;
    private String conta;
    private String brancos3;
    private String dac1;
    private String numCarteira;
    private String nossoNumero;
    private String dac2;
    private String brancos4;
    private String zeros3;
    private String numDocumento;
    private String brancos5;
    private String vencimento;
    private String valorTitulo;
    private String agCobradora;
    private String dac3;
    private String especieTitulo;
    private String aceite;
    private String dataEmissaoTitulo;
    private String zeros4;
    private String dataJurosMora;
    private String juros1Dia;
    private String zeros5;
    private String data1Desconto;
    private String valor1Desconto;
    private String valorIof;
    private String valorAbatimento;
    private String usoEmpresa;
    private String codigoNegativacaoProtesto;
    private String prazoNegativacaoProtesto;
    private String codBaixa;
    private String prazoBaixa;
    private String zeros;
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

    @Field(offset = 19, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 23, length = 1)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 24, length = 7)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

    @Field(offset = 31, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Field(offset = 36, length = 1)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Field(offset = 37, length = 1)
    public String getDac1() {
        return dac1;
    }

    public void setDac1(String dac1) {
        this.dac1 = dac1;
    }

    @Field(offset = 38, length = 3)
    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

    @Field(offset = 41, length = 8)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Field(offset = 49, length = 1)
    public String getDac2() {
        return dac2;
    }

    public void setDac2(String dac2) {
        this.dac2 = dac2;
    }

    @Field(offset = 50, length = 8)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Field(offset = 58, length = 5)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

    @Field(offset = 63, length = 10)
    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    @Field(offset = 73, length = 5)
    public String getBrancos5() {
        return brancos5;
    }

    public void setBrancos5(String brancos5) {
        this.brancos5 = brancos5;
    }

    @Field(offset = 78, length = 8)
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    @Field(offset = 86, length = 15)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    @Field(offset = 101, length = 5)
    public String getAgCobradora() {
        return agCobradora;
    }

    public void setAgCobradora(String agCobradora) {
        this.agCobradora = agCobradora;
    }

    @Field(offset = 106, length = 1)
    public String getDac3() {
        return dac3;
    }

    public void setDac3(String dac3) {
        this.dac3 = dac3;
    }

    @Field(offset = 107, length = 2)
    public String getEspecieTitulo() {
        return especieTitulo;
    }

    public void setEspecieTitulo(String especieTitulo) {
        this.especieTitulo = especieTitulo;
    }

    @Field(offset = 109, length = 1)
    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    @Field(offset = 110, length = 8)
    public String getDataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }

    public void setDataEmissaoTitulo(String dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }

    @Field(offset = 118, length = 1)
    public String getZeros4() {
        return zeros4;
    }

    public void setZeros4(String zeros4) {
        this.zeros4 = zeros4;
    }

    @Field(offset = 119, length = 8)
    public String getDataJurosMora() {
        return dataJurosMora;
    }

    public void setDataJurosMora(String dataJurosMora) {
        this.dataJurosMora = dataJurosMora;
    }

    @Field(offset = 127, length = 15)
    public String getJuros1Dia() {
        return juros1Dia;
    }

    public void setJuros1Dia(String juros1Dia) {
        this.juros1Dia = juros1Dia;
    }

    @Field(offset = 142, length = 1)
    public String getZeros5() {
        return zeros5;
    }

    public void setZeros5(String zeros5) {
        this.zeros5 = zeros5;
    }

    @Field(offset = 143, length = 8)
    public String getData1Desconto() {
        return data1Desconto;
    }

    public void setData1Desconto(String data1Desconto) {
        this.data1Desconto = data1Desconto;
    }

    @Field(offset = 151, length = 15)
    public String getValor1Desconto() {
        return valor1Desconto;
    }

    public void setValor1Desconto(String valor1Desconto) {
        this.valor1Desconto = valor1Desconto;
    }

    @Field(offset = 166, length = 14)
    public String getValorIof() {
        return valorIof;
    }

    public void setValorIof(String valorIof) {
        this.valorIof = valorIof;
    }

    @Field(offset = 181, length = 15)
    public String getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(String valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    @Field(offset = 196, length = 25)
    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }

    @Field(offset = 221, length = 1)
    public String getCodigoNegativacaoProtesto() {
        return codigoNegativacaoProtesto;
    }

    public void setCodigoNegativacaoProtesto(String codigoNegativacaoProtesto) {
        this.codigoNegativacaoProtesto = codigoNegativacaoProtesto;
    }

    @Field(offset = 222, length = 2)
    public String getPrazoNegativacaoProtesto() {
        return prazoNegativacaoProtesto;
    }

    public void setPrazoNegativacaoProtesto(String prazoNegativacaoProtesto) {
        this.prazoNegativacaoProtesto = prazoNegativacaoProtesto;
    }
 
    @Field(offset = 224, length = 1)
    public String getCodBaixa() {
        return codBaixa;
    }

    public void setCodBaixa(String codBaixa) {
        this.codBaixa = codBaixa;
    }

  @Field(offset = 225, length = 2)
    public String getPrazoBaixa() {
        return prazoBaixa;
    }

    public void setPrazoBaixa(String prazoBaixa) {
        this.prazoBaixa = prazoBaixa;
    }

  @Field(offset = 227, length = 13)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

  @Field(offset = 240, length = 1)
    public String getBrancos6() {
        return brancos6;
    }

    public void setBrancos6(String brancos6) {
        this.brancos6 = brancos6;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoPRemessa{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", brancos1=" + brancos1 + ", codOcorrencia=" + codOcorrencia + ", zeros1=" + zeros1 + ", agencia=" + agencia + ", brancos2=" + brancos2 + ", zeros2=" + zeros2 + ", conta=" + conta + ", brancos3=" + brancos3 + ", dac1=" + dac1 + ", numCarteira=" + numCarteira + ", nossoNumero=" + nossoNumero + ", dac2=" + dac2 + ", brancos4=" + brancos4 + ", zeros3=" + zeros3 + ", numDocumento=" + numDocumento + ", brancos5=" + brancos5 + ", vencimento=" + vencimento + ", valorTitulo=" + valorTitulo + ", agCobradora=" + agCobradora + ", dac3=" + dac3 + ", especieTitulo=" + especieTitulo + ", aceite=" + aceite + ", dataEmissaoTitulo=" + dataEmissaoTitulo + ", zeros4=" + zeros4 + ", dataJurosMora=" + dataJurosMora + ", juros1Dia=" + juros1Dia + ", zeros5=" + zeros5 + ", data1Desconto=" + data1Desconto + ", valor1Desconto=" + valor1Desconto + ", valorIof=" + valorIof + ", valorAbatimento=" + valorAbatimento + ", usoEmpresa=" + usoEmpresa + ", codigoNegativacaoProtesto=" + codigoNegativacaoProtesto + ", prazoNegativacaoProtesto=" + prazoNegativacaoProtesto + ", codBaixa=" + codBaixa + ", prazoBaixa=" + prazoBaixa + ", zeros=" + zeros + ", brancos6=" + brancos6 + '}';
    }

    
}
