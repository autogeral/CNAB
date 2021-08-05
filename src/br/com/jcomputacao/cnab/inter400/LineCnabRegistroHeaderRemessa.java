package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 * @author larissa.camargo
 *    28.07.2021
 */

@Record
public class LineCnabRegistroHeaderRemessa {

    private String codigoRegistro;
    private String codigoRemessa;
    private String literalRemessa;
    private String codigoServico;
    private String literalServico;
    private String codigoEmpresa;
    private String nomeEmpresa;
    private String codigoBanco;
    private String nomeBanco;
    private Integer dataGravacao;
    private String branco;
    private String sequencialRemessa;
    private String brancos;
    private String sequencialRegistro;

    @Field(offset = 1, length = 1)
    public String getCodigoRegistro() {
        return codigoRegistro;
    }
    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    @Field(offset = 2, length = 1)
    public String getCodigoRemessa() {
        return codigoRemessa;
    }
    public void setCodigoRemessa(String codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
    }

    @Field(offset = 3, length = 7)
    public String getLiteralRemessa() {
        return literalRemessa;
    }
    public void setLiteralRemessa(String literalRemessa) {
        this.literalRemessa = literalRemessa;
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
    
    @Field(offset = 27, length = 20)
    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }
    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
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
    public Integer getDataGravacao() {
        return dataGravacao;
    }
    public void setDataGravacao(Integer dataGravacao) {
        this.dataGravacao = dataGravacao;
    }
    
  
    @Field(offset = 101, length = 10)
    public String getBranco() {
        return branco;
    }
    public void setBranco(String branco) {
        this.branco = branco;
    }
    
    @Field(offset = 111, length = 7)
    public String getSequencialRemessa() {
        return sequencialRemessa;
    }
    public void setSequencialRemessa(String sequencialRemessa) {
        this.sequencialRemessa = sequencialRemessa;
    }
    
    @Field(offset = 118, length = 277)
    public String getBrancos() {
        return brancos;
    }
    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }
    
    @Field(offset =395 , length = 6)
    public String getSequencialRegistro() {
        return sequencialRegistro;
    }
    public void setSequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", codigoRemessa=" + codigoRemessa + ", literalRemessa=" + literalRemessa + ", codigoServico=" + codigoServico + ", literalServico=" + literalServico + ", codigoEmpresa=" + codigoEmpresa + ", nomeEmpresa=" + nomeEmpresa + ", codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", dataGravacao=" + dataGravacao + ", branco=" + branco + ", sequencialRemessa=" + sequencialRemessa + ",brancos=" + brancos + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}
