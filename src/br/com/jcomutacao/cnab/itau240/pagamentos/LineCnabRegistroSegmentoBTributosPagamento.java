package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   08.08.2022
 */
@Record
public class LineCnabRegistroSegmentoBTributosPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String brancos1;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String telefone;
    private String valorAcrescimos;
    private String valorHonorario;
    private String brancos2;
    
    /*
       REGISTRO DETALHE SEGMENTO B - (OPCIONAL)
    Este segmento deve ser utilizado quando houver a necessidade de indicação destas informações na guia
    do DARJ, GPS, e GARE – SP ICMS.
    Quando o Tributo for “GPS”, para que o conteúdo deste segmento seja impresso no comprovante de
    pagamento da Guia, o campo “USO DA EMPRESA”, posição 116 a 165 do segmento “N” deve ser
    informado com brancos.
    */
    
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
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Field(offset = 14, length = 1)
    public String getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(String codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    @Field(offset = 15, length = 18)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 33, length = 30)
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Field(offset = 63, length = 5)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Field(offset = 68, length = 15)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Field(offset = 83, length = 15)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Field(offset = 98, length = 20)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Field(offset = 118, length = 8)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Field(offset = 126, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Field(offset = 128, length = 11)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Field(offset = 139, length = 14)
    public String getValorAcrescimos() {
        return valorAcrescimos;
    }

    public void setValorAcrescimos(String valorAcrescimos) {
        this.valorAcrescimos = valorAcrescimos;
    }

    @Field(offset = 153, length = 14)
    public String getValorHonorario() {
        return valorHonorario;
    }

    public void setValorHonorario(String valorHonorario) {
        this.valorHonorario = valorHonorario;
    }

    @Field(offset = 167, length = 74)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoBTributosPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", brancos1=" + brancos1 + ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", telefone=" + telefone + ", valorAcrescimos=" + valorAcrescimos + ", valorHonorario=" + valorHonorario + ", brancos2=" + brancos2 + '}';
    }
}
