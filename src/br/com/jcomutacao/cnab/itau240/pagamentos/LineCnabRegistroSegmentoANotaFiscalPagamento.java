package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import static java.time.Clock.offset;

/**
 *
 * @author larissa.camargo
 *   05.08.2022
 */
@Record
public class LineCnabRegistroSegmentoANotaFiscalPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String codigoSegmento;
    private String tipoMovimento;
    private String zeros1;
    private String bancoFavorecido;
    private String agenciaFavorecido;
    private String nomeFavorecido;
    private String seuNumero;
    private String dataPgto;
    private String tipoMoeda;
    private String zeros2;
    private String valorPgto;
    private String nossoNumero;
    private String brancos1;
    private String dataEfetivaPgto;
    private String valorEfetivoPgto;
    private String numeroNotaFiscal;
    private String brancos2;
    private String numDoc;
    private String numInscricao;
    private String tipoIdentificacao;
    private String brancos3;
    private String avisoFavorecido;
    private String ocorrencias;
    
    /*
          REGISTRO DETALHE SEGMENTO A - OBRIGATORIO
        P/PAGAMENTOS ATRAVÉS DE NOTA FISCAL - LIQUIDAÇÃO ELETRÔNICA 
    */
    
    @Field(offset = 1, length = 3)
    public String getCodigoBanco(){
        return codigoBanco;
    }
    
    public void setCodigoBanco(String codigoBanco){
        this.codigoBanco= codigoBanco;
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
    
    @Field(offset = 9, length = 5)
    public String getNumRegistro(){
        return numRegistro;
    }
    
    public void setNumRegistro(String numRegistro){
        this.numRegistro = numRegistro;
    }
    
    @Field(offset = 14, length = 1)
    public String getCodigoSegmento(){
        return codigoSegmento;
    }    
    
    public void setCodigoSegmento(String codigoSegmento){
        this.codigoSegmento = codigoSegmento;
    }
    
    @Field(offset = 15, length = 3)
    public String getTipoMovimento(){
        return tipoMovimento;
    }
    
    public void setTipoMovimento(String tipoMovimento){
        this.tipoMovimento = tipoMovimento;
    }
    
    @Field(offset = 18, length = 3)
    public String getZeros1(){
        return zeros1;
    }    
    
    public void setZeros1(String zeros1){
        this.zeros1 = zeros1;
    }
    
    @Field(offset = 21, length = 3)
    public String getBancoFavorecido(){
        return bancoFavorecido;
    }
    
    public void setBancoFavorecido(String bancoFavorecido){
        this.bancoFavorecido = bancoFavorecido;
    }
    
    @Field(offset = 24, length = 20)
    public String getAgenciaFavorecido(){
        return agenciaFavorecido;
    }    
    
    public void setAgenciaFavorecido(String agenciaFavorecido){
        this.agenciaFavorecido = agenciaFavorecido;
    }
    
    @Field(offset = 44, length = 30)
    public String getNomefavorecido(){
        return nomeFavorecido;
    }
    
    public void setNomeFavorecido(String nomeFavorecido){
        this.nomeFavorecido = nomeFavorecido;
    }
    
    @Field(offset = 74, length = 20)
    public String getSeuNumero(){
        return seuNumero;
    }
    
    public void setSeuNumero(String seuNumero){
        this.seuNumero = seuNumero;
    }
    
    @Field(offset = 94, length = 8)
    public String getDataPgto(){
        return dataPgto;
    }
    
    public void setDataPgto(String dataPgto){
        this.dataPgto = dataPgto;
    }
    
    @Field(offset = 102, length = 3)
    public String getTipoMoeda(){
        return tipoMoeda;
    }
    
    public void setTipoMoeda(String tipoMoeda){
        this.tipoMoeda = tipoMoeda;
    }
    
    @Field(offset = 105, length = 15)
    public String getZeros2(){
        return zeros2;
    }
    
    public void setZeros2(String zeros2){
        this.zeros2 = zeros2;
    }
    
    @Field(offset = 120, length = 15)
    public String getValorPgto(){
        return valorPgto;
    }
    
    public void setValorPgto(String valorPgto){
        this.valorPgto = valorPgto;
    }
    
    @Field(offset = 135, length = 15)
    public String getNossoNumero(){
        return nossoNumero;
    }
    
    public void setNossoNumero(String nossoNumero){
        this.nossoNumero = nossoNumero;
    }
    
    @Field(offset = 150, length = 5)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos1){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 155, length = 5)
    public String getDataEfetivaPgto(){
        return dataEfetivaPgto;
    }
    
    public void setDataEfetivaPgto(String dataEfetivaPgto){
        this.dataEfetivaPgto = dataEfetivaPgto;
    }
    
    @Field(offset = 163, length = 15)
    public String getValorEfetivoPgto(){
        return valorEfetivoPgto;
    }
    
    public void setValorEfetivoPgto(String valorEfetivoPgto){
        this.valorEfetivoPgto = valorEfetivoPgto;
    }
    
    @Field(offset = 178, length = 14)
    public String getNumeroNotaFiscal(){
        return numeroNotaFiscal;
    }
    
    public void setNumeroNotaFiscal(String numeroNotaFiscal){
        this.numeroNotaFiscal = numeroNotaFiscal;
    }
    
    @Field(offset = 192, length = 6)
    public String getBrancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2 = brancos2;
    }
    
    @Field(offset = 198, length = 6)
    public String getNumDoc(){
        return numDoc;
    }
    
    public void setNumDoc(String numDoc){
        this.numDoc = numDoc;
    }
    
    @Field(offset = 204, length = 14)
    public String getNumInscricao(){
        return numInscricao;
    }
    
    public void setNumInscricao(String numInscricao){
        this.numInscricao = numInscricao;
    }
    
    @Field(offset = 218, length = 1)
    public String getTipoIdentificacao(){
        return tipoIdentificacao;
    }
    
    public void setTipoIdentificacao(String tipoIndentificacao){
        this.tipoIdentificacao = tipoIndentificacao;
    }
    
    @Field(offset = 219, length = 11)
    public String getBrancos3(){
        return brancos3;
    }
    
    public void setBrancos3(String brancos3){
        this.brancos3 = brancos3;
    }
    
    @Field(offset = 230, length = 1)
    public String getAvisoFavorecido(){
        return avisoFavorecido;
    }
    
    public void setAvisoFavorecido(String avisoFavorecido){
        this.avisoFavorecido = avisoFavorecido;
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
        return "LineCnabRegistroSegmentoAPagamentoNotaFiscal{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", codigoSegmento=" + codigoSegmento + ", tipoMovimento=" + tipoMovimento + ", zeros1=" + zeros1 + ", bancoFavorecido=" + bancoFavorecido + ", agenciaFavorecido=" + agenciaFavorecido + ", nomeFavorecido=" + nomeFavorecido + ", seuNumero=" + seuNumero + ", dataPgto=" + dataPgto + ", tipoMoeda=" + tipoMoeda + ", zeros2=" + zeros2 + ", valorPgto=" + valorPgto + ", nossoNumero=" + nossoNumero + ", brancos1=" + brancos1 + ", dataEfetivaPgto=" + dataEfetivaPgto + ", valorEfetivoPgto=" + valorEfetivoPgto + ", numeroNotaFiscal=" + numeroNotaFiscal + ", brancos2=" + brancos2 + ", numDoc=" + numDoc + ", numInscricao=" + numInscricao + ", tipoIdentificacao=" + tipoIdentificacao + ", brancos3=" + brancos3 + ", avisoFavorecido=" + avisoFavorecido + ", ocorrencias=" + ocorrencias + '}';
    }
}