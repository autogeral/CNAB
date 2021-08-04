/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 */
@Record
public class LineCnabRegistroHeaderRetorno {
    private String codigoRegistro;
    private String codigoRetorno;
    private String literalRetorno;
    private String codigoServico;
    private String literalServico;
    private String branco1;
    private String nomeEmpresa;
    private String codigoBanco;
    private String nomeBanco;
    private Integer dataGravacao;
    private String branco2;
    private String sequencialRegistro;

    @Field(offset = 1, length = 1)
    public String getCodigoRegistro() {
        return codigoRegistro;
    }
    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    @Field(offset = 2, length = 1)
    public String getIntegercodigoRetorno() {
        return codigoRetorno;
    }
    public void setStringcodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    @Field(offset = 3, length = 7)
    public String getStringliteralRetorno() {
        return literalRetorno;
    }
    public void setStringliteralRetorno(String literalRetorno) {
        this.literalRetorno = literalRetorno;
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
    public String getBranco1() {
        return branco1;
    }
    public void setBranco1(String branco1) {
        this.branco1 = branco1;
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

    @Field(offset = 101, length = 294)
    public String getBranco2() {
        return branco2;
    }
    public void setBranco2(String branco2) {
        this.branco2 = branco2;
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
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", codigoRetorno=" + codigoRetorno + ", literalRetorno=" + literalRetorno + ", codigoServico=" + codigoServico + ", literalServico=" + literalServico + ", branco1=" + branco1 + ", nomeEmpresa=" + nomeEmpresa + ", codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", dataGravacao=" + dataGravacao + ", branco2=" + branco2 + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}