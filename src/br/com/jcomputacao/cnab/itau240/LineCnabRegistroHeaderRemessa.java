package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *     27.08.2021
 */
@Record
public class LineCnabRegistroHeaderRemessa extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String brancos1;
    private String codigoInscricao;
    private String inscricaoNumero;
    private String brancos2;
    private String zeros1;
    private String agencia;
    private String brancos3;
    private String zeros2;
    private String conta;
    private String brancos4;
    private String dac;
    private String nomeEmpresa;
    private String nomeBanco;
    private String brancos5;
    private String codigoArquivo;
    private String dataGeracao;
    private String horaGeracao;
    private String numSeqArquivoRetorno;
    private String layoutArquivo;
    private String zeros3;
    private String branco6;
    private String zeros4;
    private String brancos7;

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
    
    @Field(offset = 18, length = 1)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }
    
     @Field(offset = 19, length = 14)
    public String getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(String inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

     @Field(offset = 33, length = 20)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

     @Field(offset = 53, length = 1)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

     @Field(offset = 54, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 58, length = 1)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Field(offset = 59, length = 7)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

    @Field(offset = 66, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Field(offset = 71, length = 1)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Field(offset = 72, length = 1)
    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    @Field(offset = 73, length = 30)
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Field(offset = 103, length = 30)
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    @Field(offset = 133, length = 10)
    public String getBrancos5() {
        return brancos5;
    }

    public void setBrancos5(String brancos5) {
        this.brancos5 = brancos5;
    }

    @Field(offset = 143, length = 1)
    public String getCodigoArquivo() {
        return codigoArquivo;
    }

    public void setCodigoArquivo(String codigoArquivo) {
        this.codigoArquivo = codigoArquivo;
    }

    @Field(offset = 144, length = 8)
    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    @Field(offset = 152, length = 6)
    public String getHoraGeracao() {
        return horaGeracao;
    }

    public void setHoraGeracao(String horaGeracao) {
        this.horaGeracao = horaGeracao;
    }

    @Field(offset = 158, length = 6)
    public String getNumSeqArquivoRetorno() {
        return numSeqArquivoRetorno;
    }

    public void setNumSeqArquivoRetorno(String numSeqArquivoRetorno) {
        this.numSeqArquivoRetorno = numSeqArquivoRetorno;
    }

    @Field(offset = 164, length = 3)
    public String getLayoutArquivo() {
        return layoutArquivo;
    }

    public void setLayoutArquivo(String layoutArquivo) {
        this.layoutArquivo = layoutArquivo;
    }

    @Field(offset = 167, length = 5)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

    @Field(offset = 172, length = 54)
    public String getBranco6() {
        return branco6;
    }

    public void setBranco6(String branco6) {
        this.branco6 = branco6;
    }

    @Field(offset = 226, length = 3)
    public String getZeros4() {
        return zeros4;
    }

    public void setZeros4(String zeros4) {
        this.zeros4 = zeros4;
    }

    @Field(offset = 229, length = 12)
    public String getBrancos7() {
        return brancos7;
    }

    public void setBrancos7(String brancos7) {
        this.brancos7 = brancos7;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroHeaderRemessa{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancos1=" + brancos1 + ", codigoInscricao=" + codigoInscricao + ", inscricaoNumero=" + inscricaoNumero + ", brancos2=" + brancos2 + ", zeros1=" + zeros1 + ", agencia=" + agencia + ", brancos3=" + brancos3 + ", zeros2=" + zeros2 + ", conta=" + conta + ", brancos4=" + brancos4 + ", dac=" + dac + ", nomeEmpresa=" + nomeEmpresa + ", nomeBanco=" + nomeBanco + ", brancos5=" + brancos5 + ", codigoArquivo=" + codigoArquivo + ", dataGeracao=" + dataGeracao + ", horaGeracao=" + horaGeracao + ", numSeqArquivoRetorno=" + numSeqArquivoRetorno + ", layoutArquivo=" + layoutArquivo + ", zeros3=" + zeros3 + ", branco6=" + branco6 + ", zeros4=" + zeros4 + ", brancos7=" + brancos7 + '}';
    }  
    
    
}
