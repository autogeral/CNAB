package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *     27.08.2021
 */

@Record
public class LineCnabRegistroSegmentoYRemessa {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String segmento;
    private String brancos1;
    private String codOcorrencia;
    private String codRegOpcional;
    private String codigoInscricao;
    private String inscricaoNumero;
    private String nomeSacadorAvalista;
    private String enderecoSacador;
    private String bairroSacador;
    private String cepSacador;
    private String cidadeSacador;
    private String ufSacador;
    private String brancos2;

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

    @Field(offset = 9, length = 5)
    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    @Field(offset = 14, length = 1)
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Field(offset = 15, length = 1)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 16, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    @Field(offset = 18, length = 2)
    public String getCodRegOpcional() {
        return codRegOpcional;
    }

    public void setCodRegOpcional(String codRegOpcional) {
        this.codRegOpcional = codRegOpcional;
    }

    @Field(offset = 20, length = 1)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    @Field(offset = 21, length = 15)
    public String getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(String inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

    @Field(offset = 36, length = 40)
    public String getNomeSacadorAvalista() {
        return nomeSacadorAvalista;
    }

    public void setNomeSacadorAvalista(String nomeSacadorAvalista) {
        this.nomeSacadorAvalista = nomeSacadorAvalista;
    }

    @Field(offset = 76, length = 40)
    public String getEnderecoSacador() {
        return enderecoSacador;
    }

    public void setEnderecoSacador(String enderecoSacador) {
        this.enderecoSacador = enderecoSacador;
    }

    @Field(offset = 116, length = 15)
    public String getBairroSacador() {
        return bairroSacador;
    }

    public void setBairroSacador(String bairroSacador) {
        this.bairroSacador = bairroSacador;
    }

    @Field(offset = 131, length = 8)
    public String getCepSacador() {
        return cepSacador;
    }

    public void setCepSacador(String cepSacador) {
        this.cepSacador = cepSacador;
    }

    @Field(offset = 139, length = 15)
    public String getCidadeSacador() {
        return cidadeSacador;
    }

    public void setCidadeSacador(String cidadeSacador) {
        this.cidadeSacador = cidadeSacador;
    }

    @Field(offset = 154, length = 2)
    public String getUfSacador() {
        return ufSacador;
    }

    public void setUfSacador(String ufSacador) {
        this.ufSacador = ufSacador;
    }

    @Field(offset = 156, length = 85)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCbabRegistroSegmentoYRemessa{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", brancos1=" + brancos1 + ", codOcorrencia=" + codOcorrencia + ", codRegOpcional=" + codRegOpcional + ", codigoInscricao=" + codigoInscricao + ", inscricaoNumero=" + inscricaoNumero + ", nomeSacadorAvalista=" + nomeSacadorAvalista + ", enderecoSacador=" + enderecoSacador + ", bairroSacador=" + bairroSacador + ", cepSacador=" + cepSacador + ", cidadeSacador=" + cidadeSacador + ", ufSacador=" + ufSacador + ", brancos2=" + brancos2 + '}';
    }
}
