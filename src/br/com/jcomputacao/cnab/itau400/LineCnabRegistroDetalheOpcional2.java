package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *     26.08.2021
 * -> Layout referente ao arquivo remessa
 */

@Record
public class LineCnabRegistroDetalheOpcional2 {
    private String tipoRegistro;
    private String enderecoEmail;
    private String codigoInscricao;
    private String numeroInscricao;
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String brancos;
    private String numeroSequencial;

    
    @Field(offset = 1 , length= 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2 , length= 120)
    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    @Field(offset = 122 , length= 2)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    @Field(offset = 124 , length= 14)
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Field(offset = 138 , length= 40)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Field(offset = 178 , length= 12)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Field(offset = 190 , length= 8)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Field(offset = 198 , length= 15)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Field(offset = 213 , length= 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Field(offset = 215, length= 180)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

    @Field(offset = 395 , length= 6)
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(String numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroDetalheOpcional2{" + "tipoRegistro=" + tipoRegistro + ", enderecoEmail=" + enderecoEmail + ", codigoInscricao=" + codigoInscricao + ", numeroInscricao=" + numeroInscricao + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", brancos=" + brancos + ", numeroSequencial=" + numeroSequencial + '}';
    } 
}
