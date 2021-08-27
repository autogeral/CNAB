package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    27.08.2021
 */
@Record
public class LineCnabRegistroSegmentoQRemessa {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String segmento;
    private String brancos1;
    private String codOcorrencia;
    private String codigoInscricao1;
    private String inscricaoNumero1;
    private String nome;
    private String brancos2;
    private String logradouro;
    private String bairro;
    private String cep;
    private String sufixoCep;
    private String cidade;
    private String uf;
    private String codigoInscricao2;
    private String inscricaoNumero2;
    private String sacadorAvalista;
    private String brancos3;
    private String zeros;
    private String brancos4;
    
    
   @Field(offset = 1,  length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

   @Field(offset = 4,  length = 4)
    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

     @Field(offset = 8,  length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

     @Field(offset = 9,  length = 5)
    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

     @Field(offset = 14,  length = 1)
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

     @Field(offset = 15,  length = 1)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

     @Field(offset = 16,  length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

     @Field(offset = 18,  length = 1)
    public String getCodigoInscricao1() {
        return codigoInscricao1;
    }

    public void setCodigoInscricao1(String codigoInscricao1) {
        this.codigoInscricao1 = codigoInscricao1;
    }

     @Field(offset = 19,  length = 15)
    public String getInscricaoNumero1() {
        return inscricaoNumero1;
    }

    public void setInscricaoNumero1(String inscricaoNumero1) {
        this.inscricaoNumero1 = inscricaoNumero1;
    }

     @Field(offset = 34,  length = 30)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     @Field(offset = 64,  length = 10)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

     @Field(offset = 74,  length = 40)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

     @Field(offset = 114,  length = 15)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

     @Field(offset = 129,  length = 5)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

     @Field(offset = 134,  length = 3)
    public String getSufixoCep() {
        return sufixoCep;
    }

    public void setSufixoCep(String sufixoCep) {
        this.sufixoCep = sufixoCep;
    }

     @Field(offset = 137,  length = 15)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

     @Field(offset = 152,  length = 2)
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

     @Field(offset = 154,  length = 1)
    public String getCodigoInscricao2() {
        return codigoInscricao2;
    }

    public void setCodigoInscricao2(String codigoInscricao2) {
        this.codigoInscricao2 = codigoInscricao2;
    }

    @Field(offset = 155,  length = 15)
    public String getInscricaoNumero2() {
        return inscricaoNumero2;
    }

    public void setInscricaoNumero2(String inscricaoNumero2) {
        this.inscricaoNumero2 = inscricaoNumero2;
    }

    @Field(offset = 170,  length = 30)
    public String getSacadorAvalista() {
        return sacadorAvalista;
    }

    public void setSacadorAvalista(String sacadorAvalista) {
        this.sacadorAvalista = sacadorAvalista;
    }

     @Field(offset = 200,  length = 10)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

     @Field(offset = 210,  length = 3)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

    @Field(offset = 213,  length = 28)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoQRemessa{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", brancos1=" + brancos1 + ", codOcorrencia=" + codOcorrencia + ", codigoInscricao1=" + codigoInscricao1 + ", inscricaoNumero1=" + inscricaoNumero1 + ", nome=" + nome + ", brancos2=" + brancos2 + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cep=" + cep + ", sufixoCep=" + sufixoCep + ", cidade=" + cidade + ", uf=" + uf + ", codigoInscricao2=" + codigoInscricao2 + ", inscricaoNumero2=" + inscricaoNumero2 + ", sacadorAvalista=" + sacadorAvalista + ", brancos3=" + brancos3 + ", zeros=" + zeros + ", brancos4=" + brancos4 + '}';
    }  
}
