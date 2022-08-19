package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 * 04.08.2022
 */
@Record
public class LineCnabRegistroHeaderLotePagamento extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String tipoOperacao;
    private String tipoPagamento;
    private String formaPagamento;
    private String layoutLote;
    private String brancos1;
    private String empresaInscricao;
    private String inscricaoNumero;
    private String identificacaoLancamento;
    private String brancos2;
    private String agencia;
    private String brancos3;
    private String conta;
    private String brancos4;
    private String dac;
    private String nomeEmpresa;
    private String finalidadeLote;
    private String historicoContaCorrente;
    private String enderecoEmpresa;
    private String numeroLocal;
    private String complemento;
    private String cidade;
    private String cep;
    private String estado;
    private String brancos5;
    private String ocorrencias;
    
    
    @Field(offset = 1, length = 3)
    public String getCodigoBanco(){
        return codigoBanco;
    }
    
    public void setCodigoBanco(String codigoBanco){
        this.codigoBanco = codigoBanco;
    }
    
    @Field(offset = 4, length = 4)
    public String getCodigoLote(){
        return codigoLote;
    }
    
    public void setCodigoLote(String codigoLote){
        this.codigoLote = codigoLote;
    }
    
    @Field(offset = 8, length = 1)
    public String getTipoRegistro(){
       return tipoRegistro;
    }
   
    public void setTipoRegistro(String tipoRegistro){
        this.tipoRegistro = tipoRegistro;
    }
    
    @Field(offset = 9, length = 1)
    public String getTipoOperacao(){
        return tipoOperacao;
    }
    
    public void setTipoOperacao(String tipoOperacao){
        this.tipoOperacao = tipoOperacao;
    }
   
    @Field(offset = 10, length = 2)
    public String getTipoPagamento(){
        return tipoPagamento;
    }
    
    public void setTipoPagamento(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }
    
    @Field(offset = 12, length = 2)
    public String getFormaPagamento(){
        return formaPagamento;
    }
    
    public void setFormaPagamento(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    
    @Field(offset = 14, length = 3)
    public String getLayoutLote(){
        return layoutLote;
    }
    
    public void setLayoutLote(String layoutLote){
        this.layoutLote = layoutLote;
    }
    
    @Field(offset = 17, length = 1)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos1){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 18, length = 1)
    public String getEmpresaInscricao(){
        return empresaInscricao;
    }
    
    public void setEmpresaInscricao(String empresaInscricao){
        this.empresaInscricao = empresaInscricao;
    }
    
    @Field(offset = 19, length = 14)
    public String getInscricaoNumero(){
        return inscricaoNumero;
    }
    
    public void setInscricaoNumero(String inscricaoNumero){
        this.inscricaoNumero = inscricaoNumero;
    }
    
    @Field(offset = 33, length = 4)
    public String getIdentificacaoLancamento(){
        return identificacaoLancamento;
    }
    
    public void setIdentificacaoLancamento(String identificacaoLancamento){
        this.identificacaoLancamento = identificacaoLancamento;
    }
    
    @Field(offset = 37, length = 16)
    public String getBrancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2 = brancos2;
    }
    
    @Field(offset = 53, length = 5)
    public String getAgencia(){
        return agencia;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    @Field(offset = 58, length = 1)
    public String getBrancos3(){
        return brancos3;
    }
    
    public void setBrancos3(String brancos3){
        this.brancos3 = brancos3;
    }
    
    @Field(offset = 59, length = 12)
    public String getConta(){
        return conta;
    }
    
    public void setConta(String conta){
        this.conta = conta;
    }
    
    @Field(offset = 71, length = 1)
    public String getBrancos4(){
        return brancos4;
    }
    
    public void setBrancos4(String brancos4){
        this.brancos4 = brancos4;
    }
    
    @Field(offset = 72, length = 1)
    public String getDac(){
        return dac;
    }
    
    public void setDac(String dac){
        this.dac = dac;
    }
    
    @Field(offset = 73, length = 30)
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Field(offset = 103, length = 30)
    public String getFinalidadeLote(){
        return finalidadeLote;
    }
    
    public void setFinalidadeLote(String finalidadeLote){
        this.finalidadeLote = finalidadeLote;
    }
    
    @Field(offset = 133, length = 10)
    public String getHistoricoContaCorrente(){
        return historicoContaCorrente;
    }
    
    public void setHistoricoContaCorrente(String historicoContaCorrente){
        this.historicoContaCorrente = historicoContaCorrente;
    }
    
    @Field(offset = 143, length = 30)
    public String getEnderecoEmpresa(){
        return enderecoEmpresa;
    }
    
    public void setEnderecoEmpresa(String enderecoEmpresa){
        this.enderecoEmpresa = enderecoEmpresa;
    }
    
    @Field(offset = 173, length = 5)
    public String getNumeroLocal(){
        return numeroLocal;
    }
    
    public void setNumeroLocal(String numeroLocal){
        this.numeroLocal = numeroLocal;
    }
    
    @Field(offset = 178, length = 15)
    public String getComplemento(){
        return complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    @Field(offset = 193, length = 20)
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    @Field(offset = 213, length = 8)
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    @Field(offset = 221, length = 2)
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Field(offset = 223, length = 8)
    public String getBrancos5(){
        return brancos5;
    }
    
    public void setBrancos5(String brancos5){
        this.brancos5 = brancos5;   
    }
    
    @Field(offset = 231, length = 10)
    public String getOcorrencias(){
        return ocorrencias;
    }
    
    public void setOcorrencias(String ocorrencias){
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroHeaderLotePagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", tipoOperacao=" + tipoOperacao + ", tipoPagamento=" + tipoPagamento + ", formaPagamento=" + formaPagamento + ", layoutLote=" + layoutLote + ", brancos1=" + brancos1 + ", empresaInscricao=" + empresaInscricao + ", inscricaoNumero=" + inscricaoNumero + ", identificacaoLancamento=" + identificacaoLancamento + ", brancos2=" + brancos2 + ", agencia=" + agencia + ", brancos3=" + brancos3 + ", conta=" + conta + ", brancos4=" + brancos4 + ", dac=" + dac + ", nomeEmpresa=" + nomeEmpresa + ", finalidadeLote=" + finalidadeLote + ", historicoContaCorrente=" + historicoContaCorrente + ", enderecoEmpresa=" + enderecoEmpresa + ", numeroLocal=" + numeroLocal + ", complemento=" + complemento + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", brancos5=" + brancos5 + ", ocorrencias=" + ocorrencias + '}';
    }
}

