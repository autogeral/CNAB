package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    27.08.2021
 */

@Record
public class LineCnabRegistroHeaderLoteRemessa extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String operacao;
    private String codigoServico;
    private String zeros1;
    private String layoutLote;
    private String brancos1;
    private String codigoInscricao;
    private String inscricaoNumero;
    private String brancos2;
    private String zeros2;
    private String agencia;
    private String brancos3;
    private String zeros3;
    private String conta;
    private String brancos4;
    private String dac;
    private String nomeEmpresa;
    private String brancos5;
    private String numSeqArquivoRet;
    private String dataGravacao;
    private String dataCredito;
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

   @Field(offset = 9, length = 1)
    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Field(offset = 10, length = 2)
    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    @Field(offset = 12, length = 2)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

    @Field(offset = 14, length = 3)
    public String getLayoutLote() {
        return layoutLote;
    }

    public void setLayoutLote(String layoutLote) {
        this.layoutLote = layoutLote;
    }

    @Field(offset = 17, length = 1)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

     @Field(offset = 18, length = 1)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

   @Field(offset = 19, length = 15)
    public String getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(String inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

    @Field(offset = 34, length = 20)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 54, length = 1)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

    @Field(offset = 55, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 59, length = 1)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

   @Field(offset = 60, length = 7)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

    @Field(offset = 67, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

   @Field(offset = 72, length = 1)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

   @Field(offset = 73, length = 1)
    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    @Field(offset = 74, length = 30)
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Field(offset = 104, length = 80)
    public String getBrancos5() {
        return brancos5;
    }

    public void setBrancos5(String brancos5) {
        this.brancos5 = brancos5;
    }

     @Field(offset = 184, length = 8)
    public String getNumSeqArquivoRet() {
        return numSeqArquivoRet;
    }

    public void setNumSeqArquivoRet(String numSeqArquivoRet) {
        this.numSeqArquivoRet = numSeqArquivoRet;
    }

    @Field(offset = 192, length = 8)
    public String getDataGravacao() {
        return dataGravacao;
    }

    public void setDataGravacao(String dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    @Field(offset = 200, length = 8)
    public String getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(String dataCredito) {
        this.dataCredito = dataCredito;
    }

    @Field(offset = 208, length = 33)
    public String getBrancos6() {
        return brancos6;
    }

    public void setBrancos6(String brancos6) {
        this.brancos6 = brancos6;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroHeaderLoteRemessa{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", operacao=" + operacao + ", codigoServico=" + codigoServico + ", zeros1=" + zeros1 + ", layoutLote=" + layoutLote + ", brancos1=" + brancos1 + ", codigoInscricao=" + codigoInscricao + ", inscricaoNumero=" + inscricaoNumero + ", brancos2=" + brancos2 + ", zeros2=" + zeros2 + ", agencia=" + agencia + ", brancos3=" + brancos3 + ", zeros3=" + zeros3 + ", conta=" + conta + ", brancos4=" + brancos4 + ", dac=" + dac + ", nomeEmpresa=" + nomeEmpresa + ", brancos5=" + brancos5 + ", numSeqArquivoRet=" + numSeqArquivoRet + ", dataGeracao=" + dataGravacao + ", dataCredito=" + dataCredito + ", brancos6=" + brancos6 + '}';
    }
}
