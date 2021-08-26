package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    26.08.2021
 */
@Record
public class LineCnabRegistroTransacaoRetorno {
    private String tipoRegistro;
    private String codigoInscricao;
    private String numeroInscricao;
    private String agencia;
    private String zeros1;
    private String conta;
    private String dac;
    private String brancos1;
    private String usoEmpresa;
    private String nossoNumero1;
    private String agenciaContaCheque;
    private String carteira1;
    private String nossoNumero2;
    private String dacNossoNumero;
    private String brancos2;
    private String carteira2;
    private String codOcorrencia;
    private String dataOcorrencia;
    private String numDocumento;
    private String nossoNumero3;
    private String brancos3;
    private String zeros2;
    private String valorTitulo;
    private String codigoBanco;
    private String agenciaCobradora;
    private String dacAgCobradora;
    private String brancos4;
    private String zeros3;
    private String valorCheque;
    private String zeros4;
    private String brancos5;
    private String zeros5;
    private String bandaMagnetica;
    private String brancos6;
    private String motivo;
    private String brancos7;
    private String numeroSequencial;

    
    @Field(offset = 1, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2, length = 2)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    @Field(offset = 4, length = 14)
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Field(offset = 18, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 22, length = 2)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

    @Field(offset = 24, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Field(offset = 29, length = 1)
    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    @Field(offset = 30, length = 8)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 38, length = 25)
    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }

    @Field(offset = 63, length = 8)
    public String getNossoNumero1() {
        return nossoNumero1;
    }

    public void setNossoNumero1(String nossoNumero1) {
        this.nossoNumero1 = nossoNumero1;
    }

    @Field(offset = 71, length = 12)
    public String getAgenciaContaCheque() {
        return agenciaContaCheque;
    }

    public void setAgenciaContaCheque(String agenciaContaCheque) {
        this.agenciaContaCheque = agenciaContaCheque;
    }

    @Field(offset = 83, length = 3)
    public String getCarteira1() {
        return carteira1;
    }

    public void setCarteira1(String carteira1) {
        this.carteira1 = carteira1;
    }
    
    @Field(offset = 86, length = 8)
    public String getNossoNumero2() {
        return nossoNumero2;
    }

    public void setNossoNumero2(String nossoNumero2) {
        this.nossoNumero2 = nossoNumero2;
    }

    @Field(offset = 94, length = 1)
    public String getDacNossoNumero() {
        return dacNossoNumero;
    }

    public void setDacNossoNumero(String dacNossoNumero) {
        this.dacNossoNumero = dacNossoNumero;
    }

    @Field(offset = 95, length = 13)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 108, length = 1)
    public String getCarteira2() {
        return carteira2;
    }

    public void setCarteira2(String carteira2) {
        this.carteira2 = carteira2;
    }

    @Field(offset = 109, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    @Field(offset = 111, length = 6)
    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    @Field(offset = 117, length = 10)
    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    @Field(offset = 127, length = 8)
    public String getNossoNumero3() {
        return nossoNumero3;
    }

    public void setNossoNumero3(String nossoNumero3) {
        this.nossoNumero3 = nossoNumero3;
    }

    @Field(offset = 135, length = 12)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Field(offset = 147, length = 6)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

    @Field(offset = 153, length = 13)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    @Field(offset = 166, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 169, length = 4)
    public String getAgenciaCobradora() {
        return agenciaCobradora;
    }

    public void setAgenciaCobradora(String agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
    }

    @Field(offset = 173, length = 1)
    public String getDacAgCobradora() {
        return dacAgCobradora;
    }

    public void setDacAgCobradora(String dacAgCobradora) {
        this.dacAgCobradora = dacAgCobradora;
    }

    @Field(offset = 174, length = 2)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Field(offset = 176, length = 78)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

    @Field(offset = 254, length = 13)
    public String getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(String valorCheque) {
        this.valorCheque = valorCheque;
    }

    @Field(offset = 267, length = 26)
    public String getZeros4() {
        return zeros4;
    }

    public void setZeros4(String zeros4) {
        this.zeros4 = zeros4;
    }

    @Field(offset = 293, length = 9)
    public String getBrancos5() {
        return brancos5;
    }

    public void setBrancos5(String brancos5) {
        this.brancos5 = brancos5;
    }

    @Field(offset = 302, length = 23)
    public String getZeros5() {
        return zeros5;
    }

    public void setZeros5(String zeros5) {
        this.zeros5 = zeros5;
    }

    @Field(offset = 325, length = 30)
    public String getBandaMagnetica() {
        return bandaMagnetica;
    }

    public void setBandaMagnetica(String bandaMagnetica) {
        this.bandaMagnetica = bandaMagnetica;
    }

    @Field(offset = 355, length = 23)
    public String getBrancos6() {
        return brancos6;
    }

    public void setBrancos6(String brancos6) {
        this.brancos6 = brancos6;
    }

    @Field(offset = 378, length = 2)
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Field(offset = 380, length = 15)
    public String getBrancos7() {
        return brancos7;
    }

    public void setBrancos7(String brancos7) {
        this.brancos7 = brancos7;
    }

    @Field(offset = 395, length = 6)
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(String numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTransacaoRetorno{" + "tipoRegistro=" + tipoRegistro + ", codigoInscricao=" + codigoInscricao + ", numeroInscricao=" + numeroInscricao + ", agencia=" + agencia + ", zeros1=" + zeros1 + ", conta=" + conta + ", dac=" + dac + ", brancos1=" + brancos1 + ", usoEmpresa=" + usoEmpresa + ", nossoNumero1=" + nossoNumero1 + ", agenciaContaCheque=" + agenciaContaCheque + ", carteira1=" + carteira1 + ", nossoNumero2=" + nossoNumero2 + ", dacNossoNumero=" + dacNossoNumero + ", brancos2=" + brancos2 + ", carteira2=" + carteira2 + ", codOcorrencia=" + codOcorrencia + ", dataOcorrencia=" + dataOcorrencia + ", numDocumento=" + numDocumento + ", nossoNumero3=" + nossoNumero3 + ", brancos3=" + brancos3 + ", zeros2=" + zeros2 + ", valorTitulo=" + valorTitulo + ", codigoBanco=" + codigoBanco + ", agenciaCobradora=" + agenciaCobradora + ", dacAgCobradora=" + dacAgCobradora + ", brancos4=" + brancos4 + ", zeros3=" + zeros3 + ", valorCheque=" + valorCheque + ", zeros4=" + zeros4 + ", brancos5=" + brancos5 + ", zeros5=" + zeros5 + ", bandaMagnetica=" + bandaMagnetica + ", brancos6=" + brancos6 + ", motivo=" + motivo + ", brancos7=" + brancos7 + ", numeroSequencial=" + numeroSequencial + '}';
    }
}
