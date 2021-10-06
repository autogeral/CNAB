package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *     26.08.2021
 * 
 */
@Record
public class LineCnabRegistroDetalhe2Retorno {
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
    private String brancos2;
    private String numeroCarteira;
    private String nossoNumero2;
    private String dacNossoNumero;
    private String brancos3;
    private String carteira;
    private String codOcorrencia;
    private String sequencia;
    private String valorTitulo;
    private String agencia1;
    private String conta1;
    private String dac1;
    private String valor1;
    private String valorEncargos1;
    private String agencia2;
    private String conta2;
    private String dac2;
    private String valor2;
    private String valorEncargos2;
    private String agencia3;
    private String conta3;
    private String dac3;
    private String valor3;
    private String valorEncargos3;
    private String agencia4;
    private String conta4;
    private String dac4;
    private String valor4;
    private String valorEncargos4;
    private String agencia5;
    private String conta5;
    private String dac5;
    private String valor5;
    private String valorEncargos5;
    private String agencia6;
    private String conta6;
    private String dac6;
    private String valor6;
    private String valorEncargos6;
    private String agencia7;
    private String conta7;
    private String dac7;
    private String valor7;
    private String valorEncargos7;
    private String brancos4;
    private String tipoValor;
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
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 83, length = 3)
    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
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
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Field(offset = 108, length = 1)
    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    @Field(offset = 109, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    @Field(offset = 111, length = 2)
    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    @Field(offset = 113, length = 13)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    @Field(offset = 126, length = 4)
    public String getAgencia1() {
        return agencia1;
    }

    public void setAgencia1(String agencia1) {
        this.agencia1 = agencia1;
    }

    @Field(offset = 130, length = 7)
    public String getConta1() {
        return conta1;
    }

    public void setConta1(String conta1) {
        this.conta1 = conta1;
    }

    @Field(offset = 137, length = 1)
    public String getDac1() {
        return dac1;
    }

    public void setDac1(String dac1) {
        this.dac1 = dac1;
    }

    @Field(offset = 138, length = 13)
    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    @Field(offset = 151, length = 10)
    public String getValorEncargos1() {
        return valorEncargos1;
    }

    public void setValorEncargos1(String valorEncargos1) {
        this.valorEncargos1 = valorEncargos1;
    }

    @Field(offset = 161, length = 4)
    public String getAgencia2() {
        return agencia2;
    }

    public void setAgencia2(String agencia2) {
        this.agencia2 = agencia2;
    }

    @Field(offset = 165, length = 7)
    public String getConta2() {
        return conta2;
    }

    public void setConta2(String conta2) {
        this.conta2 = conta2;
    }

    @Field(offset = 172, length = 1)
    public String getDac2() {
        return dac2;
    }

    public void setDac2(String dac2) {
        this.dac2 = dac2;
    }

    @Field(offset = 173, length = 13)
    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    @Field(offset = 186, length = 10)
    public String getValorEncargos2() {
        return valorEncargos2;
    }

    public void setValorEncargos2(String valorEncargos2) {
        this.valorEncargos2 = valorEncargos2;
    }

    @Field(offset = 196, length = 4)
    public String getAgencia3() {
        return agencia3;
    }

    public void setAgencia3(String agencia3) {
        this.agencia3 = agencia3;
    }

    @Field(offset = 200, length = 7)
    public String getConta3() {
        return conta3;
    }

    public void setConta3(String conta3) {
        this.conta3 = conta3;
    }

    @Field(offset = 207, length = 1)
    public String getDac3() {
        return dac3;
    }

    public void setDac3(String dac3) {
        this.dac3 = dac3;
    }

    @Field(offset = 208, length = 13)
    public String getValor3() {
        return valor3;
    }

    public void setValor3(String valor3) {
        this.valor3 = valor3;
    }

    @Field(offset = 221, length = 10)
    public String getValorEncargos3() {
        return valorEncargos3;
    }

    public void setValorEncargos3(String valorEncargos3) {
        this.valorEncargos3 = valorEncargos3;
    }

    @Field(offset = 231, length = 4)
    public String getAgencia4() {
        return agencia4;
    }

    public void setAgencia4(String agencia4) {
        this.agencia4 = agencia4;
    }

    @Field(offset = 235, length = 7)
    public String getConta4() {
        return conta4;
    }

    public void setConta4(String conta4) {
        this.conta4 = conta4;
    }

    @Field(offset = 242, length = 1)
    public String getDac4() {
        return dac4;
    }

    public void setDac4(String dac4) {
        this.dac4 = dac4;
    }

    @Field(offset = 243, length = 13)
    public String getValor4() {
        return valor4;
    }

    public void setValor4(String valor4) {
        this.valor4 = valor4;
    }

    @Field(offset = 256, length = 10)
    public String getValorEncargos4() {
        return valorEncargos4;
    }

    public void setValorEncargos4(String valorEncargos4) {
        this.valorEncargos4 = valorEncargos4;
    }

    @Field(offset = 266, length = 4)
    public String getAgencia5() {
        return agencia5;
    }

    public void setAgencia5(String agencia5) {
        this.agencia5 = agencia5;
    }

    @Field(offset = 270, length = 7)
    public String getConta5() {
        return conta5;
    }

    public void setConta5(String conta5) {
        this.conta5 = conta5;
    }

    @Field(offset = 277, length = 1)
    public String getDac5() {
        return dac5;
    }

    public void setDac5(String dac5) {
        this.dac5 = dac5;
    }

    @Field(offset = 278, length = 13)
    public String getValor5() {
        return valor5;
    }

    public void setValor5(String valor5) {
        this.valor5 = valor5;
    }

    @Field(offset = 291, length = 10)
    public String getValorEncargos5() {
        return valorEncargos5;
    }

    public void setValorEncargos5(String valorEncargos5) {
        this.valorEncargos5 = valorEncargos5;
    }

    @Field(offset = 301, length = 4)
    public String getAgencia6() {
        return agencia6;
    }

    public void setAgencia6(String agencia6) {
        this.agencia6 = agencia6;
    }

    @Field(offset = 305, length = 7)
    public String getConta6() {
        return conta6;
    }

    public void setConta6(String conta6) {
        this.conta6 = conta6;
    }

    @Field(offset = 312, length = 1)
    public String getDac6() {
        return dac6;
    }

    public void setDac6(String dac6) {
        this.dac6 = dac6;
    }

    @Field(offset = 313, length = 13)
    public String getValor6() {
        return valor6;
    }

    public void setValor6(String valor6) {
        this.valor6 = valor6;
    }

    @Field(offset = 326, length = 10)
    public String getValorEncargos6() {
        return valorEncargos6;
    }

    public void setValorEncargos6(String valorEncargos6) {
        this.valorEncargos6 = valorEncargos6;
    }

    @Field(offset = 336, length = 4)
    public String getAgencia7() {
        return agencia7;
    }

    public void setAgencia7(String agencia7) {
        this.agencia7 = agencia7;
    }

    @Field(offset = 340, length = 7)
    public String getConta7() {
        return conta7;
    }

    public void setConta7(String conta7) {
        this.conta7 = conta7;
    }

    @Field(offset = 347, length = 1)
    public String getDac7() {
        return dac7;
    }

    public void setDac7(String dac7) {
        this.dac7 = dac7;
    }

    @Field(offset = 348, length = 13)
    public String getValor7() {
        return valor7;
    }

    public void setValor7(String valor7) {
        this.valor7 = valor7;
    }

    @Field(offset = 361, length = 10)
    public String getValorEncargos7() {
        return valorEncargos7;
    }

    public void setValorEncargos7(String valorEncargos7) {
        this.valorEncargos7 = valorEncargos7;
    }

    @Field(offset = 371, length = 23)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Field(offset = 394, length = 1)
    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
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
        return "LineCnabRegistroDetalhe2Retorno{" + "tipoRegistro=" + tipoRegistro + ", codigoInscricao=" + codigoInscricao + ", numeroInscricao=" + numeroInscricao + ", agencia=" + agencia + ", zeros1=" + zeros1 + ", conta=" + conta + ", dac=" + dac + ", brancos1=" + brancos1 + ", usoEmpresa=" + usoEmpresa + ", nossoNumero1=" + nossoNumero1 + ", brancos2=" + brancos2 + ", numeroCarteira=" + numeroCarteira + ", nossoNumero2=" + nossoNumero2 + ", dacNossoNumero=" + dacNossoNumero + ", brancos3=" + brancos3 + ", carteira=" + carteira + ", codOcorrencia=" + codOcorrencia + ", sequencia=" + sequencia + ", valorTitulo=" + valorTitulo + ", agencia1=" + agencia1 + ", conta1=" + conta1 + ", dac1=" + dac1 + ", valor1=" + valor1 + ", valorEncargos1=" + valorEncargos1 + ", agencia2=" + agencia2 + ", conta2=" + conta2 + ", dac2=" + dac2 + ", valor2=" + valor2 + ", valorEncargos2=" + valorEncargos2 + ", agencia3=" + agencia3 + ", conta3=" + conta3 + ", dac3=" + dac3 + ", valor3=" + valor3 + ", valorEncargos3=" + valorEncargos3 + ", agencia4=" + agencia4 + ", conta4=" + conta4 + ", dac4=" + dac4 + ", valor4=" + valor4 + ", valorEncargos4=" + valorEncargos4 + ", agencia5=" + agencia5 + ", conta5=" + conta5 + ", dac5=" + dac5 + ", valor5=" + valor5 + ", valorEncargos5=" + valorEncargos5 + ", agencia6=" + agencia6 + ", conta6=" + conta6 + ", dac6=" + dac6 + ", valor6=" + valor6 + ", valorEncargos6=" + valorEncargos6 + ", agencia7=" + agencia7 + ", conta7=" + conta7 + ", dac7=" + dac7 + ", valor7=" + valor7 + ", valorEncargos7=" + valorEncargos7 + ", brancos4=" + brancos4 + ", tipoValor=" + tipoValor + ", numeroSequencial=" + numeroSequencial + '}';
    }
}
