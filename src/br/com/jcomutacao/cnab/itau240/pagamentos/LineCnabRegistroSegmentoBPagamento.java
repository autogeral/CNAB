package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *  05.08.2022
 */
@Record
public class LineCnabRegistroSegmentoBPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String codigoSegmento;
    private String brancos1;
    private String empresaInscricao;
    private String numInscricao;
    private String endereco;
    private String numeroLocal;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String email;
    private String brancos2;
    private String ocorrencias;
    
    
    /*
            REGISTRO DETALHE SEGMENTO - B(OPCIONAL)
        P/PAGAMENTOS ATRAVÉS DE CHEQUE, OP, DOC, TED E CRÉDITO EM CONTA CORRENTE 
    Este segmento só é obrigatório quando:
    o Houver a necessidade de emissão de aviso ao favorecido, conforme definido no Segmento
    A (posição 230 igual a 3 ou 5 - ver nota 16); ou
    o For contratado junto ao Banco o serviço de envio de “Demonstrativo de Pagamentos” via
    web / e-mail e de “Informe de Rendimentos”. 
    Este segmento constará do arquivo retorno sempre que for enviado algum registro “C”.
    Quando contratado o serviço de “Demonstrativo de Pagamentos” via web / e -mail e de
    “Informe de Rendimentos”, a informação do CPF/CNPJ do favorecido deve obrigatoriamente
    ser indicada neste segmento
    */
    
    @Field(offset = 1 , length = 3)
    public String getCodigoBanco(){
        return codigoBanco;
    }
    
    public void setCodigoBanco(String codigoBanco){
        this.codigoBanco = codigoBanco;
    }
    
    @Field(offset = 4 , length = 4)
    public String getCodigoLote(){
        return codigoLote;
    }
    
    public void setCodigoLote(String codigoLote){
        this.codigoLote = codigoLote;
    }
    
    @Field(offset = 8 , length = 1)
    public String getTipoRegistro(){
        return tipoRegistro;
    }
    
    public void setTipoRegistro(String tipoRegistro){
        this.tipoRegistro = tipoRegistro;
    }
    
    @Field(offset = 9 , length = 5)
    public String getNumRegistro(){
        return numRegistro;
    }
    
    public void setNumRegistro(String numRegistro){
        this.numRegistro = numRegistro;
    }
    
    @Field(offset = 14 , length = 1)
    public String getCodigoSegmento(){
        return codigoSegmento;
    }
    
    public void setCodigoSegmento(String codigoSegmento){
        this.codigoSegmento = codigoSegmento;
    }
    
    @Field(offset = 15 , length = 3)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 18 , length = 1)
    public String getEmpresaInscricao(){
        return empresaInscricao;
    }
    
    public void setEmpresaInscricao(String empresaInscricao){
        this.empresaInscricao = empresaInscricao;
    }
    
    @Field(offset = 19 , length = 14)
    public String getNumInscricao(){
        return numInscricao;
    }
    
    public void setNumInscricao(String numInscricao){
        this.numInscricao = numInscricao;
    }
    
    @Field(offset = 33 , length = 30)
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    @Field(offset = 63 , length = 5)
    public String getNumeroLocal(){
        return numeroLocal;
    }
    
    public void setNumeroLocal(String numeroLocal){
        this.numeroLocal = numeroLocal;
    }
    
    @Field(offset = 68 , length = 15)
    public String getComplemento(){
        return complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    @Field(offset = 83 , length = 15)
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    @Field(offset = 98 , length = 20)
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    @Field(offset = 118 , length = 8)
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    @Field(offset = 126 , length = 2)
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Field(offset = 128 , length = 100)
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Field(offset = 228 , length = 3)
    public String getBrancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2 = brancos2;
    }

    @Field(offset = 231 , length = 10)
    public String getOcorrencias(){
        return ocorrencias;
    }
    
    public void setOcorrencias(String ocorrencias){
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoBPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", codigoSegmento=" + codigoSegmento + ", brancos1=" + brancos1 + ", empresaInscricao=" + empresaInscricao + ", numInscricao=" + numInscricao + ", endereco=" + endereco + ", numeroLocal=" + numeroLocal + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", email=" + email + ", brancos2=" + brancos2 + ", ocorrencias=" + ocorrencias + '}';
    }  
}
