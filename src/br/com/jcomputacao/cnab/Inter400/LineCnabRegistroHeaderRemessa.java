/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.Inter400;

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
    public String getIntegerCodigoRegistro() {
        return codigoRegistro;
    }
    public void setStringCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    @Field(offset = 2, length = 1)
    public String getIntegerCodigoRemessa() {
        return codigoRemessa;
    }
    public void setStringCodigoRemessa(String codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
    }

    @Field(offset = 3, length = 7)
    public String getStringLiteralRemessa() {
        return literalRemessa;
    }
    public void setStringLiteralRemessa(String literalRemessa) {
        this.literalRemessa = literalRemessa;
    }

    @Field(offset = 10, length = 2)
    public String getStringCodigoServico() {
        return codigoServico;
    }
    public void setStringCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }
    
    @Field(offset = 12, length = 15)
    public String getStringLiteralServico() {
        return literalServico;
    }
    public void setStringLiteralServico(String literalServico) {
        this.literalServico = literalServico;
    }
    
    @Field(offset = 27, length = 20)
    public String getStringCodigoEmpresa() {
        return codigoEmpresa;
    }
    public void setStringCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    
    @Field(offset = 47, length = 30)
    public String getStringNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setStringNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Field(offset = 77, length = 3)
    public String getStringCodigoBanco() {
        return codigoBanco;
    }
    public void setStringCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
    
    @Field(offset = 80, length = 15)
    public String getStringNomeBanco() {
        return nomeBanco;
    }
    public void setStringNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    
    
    @Field(offset = 95, length = 6)
    public Integer getIntegerDataGravacao() {
        return dataGravacao;
    }
    public void setIntegerDataGravacao(Integer dataGravacao) {
        this.dataGravacao = dataGravacao;
    }
    
  
    @Field(offset = 101, length = 10)
    public String getStringBranco() {
        return branco;
    }
    public void setStringBranco(String branco) {
        this.branco = branco;
    }
    
    @Field(offset = 111, length = 7)
    public String getStringSequencialRemessa() {
        return sequencialRemessa;
    }
    public void setSStringSequencialRemessa(String sequencialRemessa) {
        this.sequencialRemessa = sequencialRemessa;
    }
    
    @Field(offset = 118, length = 277)
    public String getStringBrancos() {
        return brancos;
    }
    public void setStringBrancos(String brancos) {
        this.brancos = brancos;
    }
    
    @Field(offset =395 , length = 6)
    public String getStringSequencialRegistro() {
        return sequencialRegistro;
    }
    public void setStringSequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", codigoRemessa=" + codigoRemessa + ", literalRemessa=" + literalRemessa + ", codigoServico=" + codigoServico + ", literalServico=" + literalServico + ", codigoEmpresa=" + codigoEmpresa + ", nomeEmpresa=" + nomeEmpresa + ", codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", dataGravacao=" + dataGravacao + ", branco=" + branco + ", sequencialRemessa=" + sequencialRemessa + ",brancos=" + brancos + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}
