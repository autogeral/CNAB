package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    26.08.2021
 */
@Record
public class LineCnabRegistroHeaderRetorno {
    private String tipoRegistro;
    private String codigoRetorno;
    private String literalRetorno;
    private String codigoServico;
    private String literalServico;
    private String agencia;
    private String zeros;
    private String conta;
    private String dac;
    private String brancos;
    private String nomeEmpresa;
    private String codigoBanco;
    private String nomeBanco;
    private String dataGeracao;
    private String densidade;
    private String unidadeDensid;
    private String SequenciaRetorno;
    private String dataCredito;
    private String brancos1;
    private String numeroSequencial;

    @Field(offset = 1, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

   @Field(offset = 2, length = 1)
    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

   @Field(offset = 3, length = 7)
    public String getLiteralRetorno() {
        return literalRetorno;
    }

    public void setLiteralRetorno(String literalRetorno) {
        this.literalRetorno = literalRetorno;
    }

   @Field(offset = 10, length = 2)
    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

   @Field(offset = 12, length = 15)
    public String getLiteralServico() {
        return literalServico;
    }

    public void setLiteralServico(String literalServico) {
        this.literalServico = literalServico;
    }

   @Field(offset = 27, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

   @Field(offset = 31, length = 2)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

   @Field(offset = 33, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

   @Field(offset = 38, length = 1)
    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    @Field(offset = 39, length = 8)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

   @Field(offset = 47, length = 30)
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

   @Field(offset = 77, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 80, length = 15)
    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

   @Field(offset = 95, length = 6)
    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

   @Field(offset = 101, length = 5)
    public String getDensidade() {
        return densidade;
    }

    public void setDensidade(String densidade) {
        this.densidade = densidade;
    }

   @Field(offset = 106, length = 3)
    public String getUnidadeDensid() {
        return unidadeDensid;
    }

    public void setUnidadeDensid(String unidadeDensid) {
        this.unidadeDensid = unidadeDensid;
    }

   @Field(offset = 109, length = 5)
    public String getSequenciaRetorno() {
        return SequenciaRetorno;
    }

    public void setSequenciaRetorno(String SequenciaRetorno) {
        this.SequenciaRetorno = SequenciaRetorno;
    }

    @Field(offset = 114, length = 6)
    public String getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(String dataCredito) {
        this.dataCredito = dataCredito;
    }

   @Field(offset = 120, length = 275)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
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
        return "LineCnabRegistroHeaderRetorno{" + "tipoRegistro=" + tipoRegistro + ", codigoRetorno=" + codigoRetorno + ", literalRetorno=" + literalRetorno + ", codigoServico=" + codigoServico + ", literalServico=" + literalServico + ", agencia=" + agencia + ", zeros=" + zeros + ", conta=" + conta + ", dac=" + dac + ", brancos=" + brancos + ", nomeEmpresa=" + nomeEmpresa + ", codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", dataGeracao=" + dataGeracao + ", densidade=" + densidade + ", unidadeDensid=" + unidadeDensid + ", SequenciaRetorno=" + SequenciaRetorno + ", dataCredito=" + dataCredito + ", brancos1=" + brancos1 + ", numeroSequencial=" + numeroSequencial + '}';
    } 
}
