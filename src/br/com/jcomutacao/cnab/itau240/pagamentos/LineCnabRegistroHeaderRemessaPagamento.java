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
public class LineCnabRegistroHeaderRemessaPagamento  extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String brancos1;
    private String layoutArquivo;
    private String empresaInscricao;
    private String inscricaoNumero;
    private String brancos2;
    private String agencia;
    private String brancos3;
    private String contaC;
    private String brancos4;
    private String dac;
    private String nomeEmpresa;
    private String nomeBanco;
    private String brancos5;
    private String arquivoCodigo;
    private String dataGeracao;
    private String horaGeracao;
    private String zeros;
    private String unidadeDensidade;
    private String brancos6;
    
    @Field(offset = 1, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
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
    
    @Field(offset = 9, length = 6)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos1){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 15, length = 3)
    public String getLayoutArquivo(){
        return layoutArquivo;
    }
    
    public void setLayoutArquivo(String layoutArquivo){
        this.layoutArquivo = layoutArquivo;
    }
    
    @Field(offset = 18, length = 1)
    public String getEmpresaIncricao(){
        return empresaInscricao;
    }
    
    public void setEmpresaInscricao(String empresaInscricao){
        this.empresaInscricao = empresaInscricao;
    }
    
    @Field(offset = 19, length = 14)
    public String getInscricaoNumero(){
        return inscricaoNumero;
    }
    
    public void setInscricaoNumero(){
        this.inscricaoNumero = inscricaoNumero;
    }
    
    @Field(offset = 33, length = 20)
    public String brancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2= brancos2;
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
    public String getContaC(){
        return contaC;
    }
    
    public void setContaC(String contaC){
        this.contaC = contaC;
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
    public String getNomeBanco(){
        return nomeBanco;
    }
    
    public void setNomeBanco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }
    
    @Field(offset = 133, length = 10)
    public String getBrancos5(){
        return brancos5;
    }
    
    public void setBrancos5(String brancos5){
        this.brancos5 = brancos5;
    }
    
    @Field(offset = 143, length = 1)
    public String getArquivoCodigo(){
        return arquivoCodigo;
    }
    
    public void setArquivoCodigo(String arquivoCodigo){
        this.arquivoCodigo = arquivoCodigo;
    }
    
    @Field(offset = 144, length = 8)
    public String getDataGeracao(){
        return dataGeracao;
    }
    
    public void setDataGeracao(String dataGeracao){
        this.dataGeracao = dataGeracao;
    }
    
    @Field(offset = 152, length = 6)
    public String getHoraGeracao(){
        return horaGeracao;
    }
    
    public void setHoraGeracao(String horaGeracao){
        this.horaGeracao = horaGeracao;
    }
    
    @Field(offset = 158, length = 9)
    public String getZeros(){
        return zeros;
    }
    
    public void setZeros(String zeros){
        this.zeros = zeros;
    }
    
    @Field(offset = 167, length = 5)
    public String getUnidadeDensidade(){
        return unidadeDensidade;
    }
    
    public void setUnidadeDensidade(String unidadeDensidade){
        this.unidadeDensidade = unidadeDensidade;
    }
    
    @Field(offset = 172, length = 69)
    public String getBrancos6(){
        return brancos6;
    }
    
    public void setBrancos6(String brancos6){
        this.brancos6 = this.brancos6;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroHeaderRemessaPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancos1=" + brancos1 + ", layoutArquivo=" + layoutArquivo + ", empresaInscricao=" + empresaInscricao + ", inscricaoNumero=" + inscricaoNumero + ", brancos2=" + brancos2 + ", agencia=" + agencia + ", brancos3=" + brancos3 + ", agencia=" + agencia + ", contaC=" + contaC + ", brancos4=" + brancos4 + ", dac=" + dac + ", nomeEmpresa=" + nomeEmpresa + ", nomeBanco=" + nomeBanco + ", brancos5=" + brancos5 + ", arquivoCodigo=" + arquivoCodigo + ", dataGeracao=" + dataGeracao + ", horaGeracao=" + horaGeracao + ", zeros=" + zeros + ", unidadeDensidade=" + unidadeDensidade + ", brancos6=" + brancos6 + '}';
    }
}
