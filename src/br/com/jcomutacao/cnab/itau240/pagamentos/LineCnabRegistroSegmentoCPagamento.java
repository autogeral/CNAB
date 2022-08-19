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
public class LineCnabRegistroSegmentoCPagamento extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String codigoSegmento;
    private String valorContribuicaoLucro;
    private String brancos1;
    private String vencimento;
    private String valorDoc;
    private String valorPIS;
    private String valorIR;
    private String valorISS;
    private String valorCofins;
    private String valorDesconto;
    private String abatimento;
    private String outrasDeducoes;
    private String mora;
    private String multa;
    private String outrosAcrescimos;
    private String faturaDocumento;
    private String brancos2;
    
    /*
          REGISTRO DETALHE SEGMENTO - C (OPCIONAL)
    P/PAGAMENTOS ATRAVÉS DE CHEQUE, OP, DOC, TED E CRÉDITO EM CONTA CORRENTE.
    Este segmento só é obrigatório quando for contratado junto ao Banco o serviço “Demonstrativo de
    Pagamentos” por e -mail / web. 
    Um pagamento informado através do segmento “A” poderá conter quantos registros “C” forem necessários,
    até que a soma dos valores informados em “C” totalize o valor informado para pagamento em “A”.
    */
    
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
    
    @Field(offset = 15, length = 15)
    public String getValorContribuicaoLucro(){
        return valorContribuicaoLucro;
    }
    
    public void setValorContribuicaoLucro(String valorContribuicaoLucro){
        this.valorContribuicaoLucro = valorContribuicaoLucro;
    }
    
    @Field(offset = 30, length = 8)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos1){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 38, length = 8)
    public String getVencimento(){
        return vencimento;
    }
    
    public void setVencimento(String vencimento){
        this.vencimento = vencimento;
    }
    
    @Field(offset = 46, length = 15)
    public String getValorDoc(){
        return valorDoc;
    }
    
    public void setValorDoc(String valorDoc){
        this.valorDoc = valorDoc;
    }
    
    @Field(offset = 61, length = 15)
    public String getValorPIS(){
        return valorPIS;
    }
    
    public void setValorPIS(String valorPIS){
        this.valorPIS = valorPIS;
    }
    
    @Field(offset = 76, length = 15)
    public String getValorIR(){
        return valorIR;
    }    
    
    public void setValorIR(String valorIR){
        this.valorIR = valorIR;
    }
    
    @Field(offset = 91, length = 15)
    public String getValorISS(){
        return valorISS;
    }
    
    public void setValorISS(String valorISS){
        this.valorISS = valorISS;
    }
    
    @Field(offset = 106, length = 15)
    public String getValorCofins(){
        return valorCofins;
    }
    
    public void setValorCofins(String valorCofins){
        this.valorCofins = valorCofins;
    }
    
    @Field(offset = 121, length = 15)
    public String getValorDesconto(){
        return valorDesconto;
    }
    
    public void setValorDesconto(String valorDesconto){
        this.valorDesconto = valorDesconto;
    }
    
    @Field(offset = 136, length = 15)
    public String getAbatimento(){
        return abatimento;
    }
    
    public void setAbatimento(String abatimento){
        this.abatimento = abatimento;
    }
    
    @Field(offset = 151, length = 15)
    public String getOutrasDeducoes(){
        return outrasDeducoes;
    }
    
    public void setOutrasDeducoes(String outrasDeducoes){
        this.outrasDeducoes = outrasDeducoes;
    }
    
    @Field(offset = 166, length = 15)
    public String getMora(){
        return mora;
    }
    
    public void setMora(String mora){
        this.mora = mora;
    }
    
    @Field(offset = 181, length = 15)
    public String getMulta(){
        return multa;
    }
    
    public void setMulta(String multa){
        this.multa = multa;
    }
    
    @Field(offset = 196, length = 15)
    public String getOutrosAcrescimos(){
        return outrosAcrescimos;
    }
    
    public void setOutrosAcrescimos(String outrosAcrescimos){
        this.outrosAcrescimos = outrosAcrescimos;
    }
    
    @Field(offset = 211, length = 20)
    public String getFaturaDocumento(){
        return faturaDocumento;
    }
    
    public void setFaturaDocumento(String faturaDocumento){
        this.faturaDocumento = faturaDocumento;
    }
    
    @Field(offset = 231, length = 10)
    public String getBrancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoCPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", codigoSegmento=" + codigoSegmento + ", valorContribuicaoLucro=" + valorContribuicaoLucro + ", brancos1=" + brancos1 + ", vencimento=" + vencimento + ", valorDoc=" + valorDoc + ", valorPIS=" + valorPIS + ", valorIR=" + valorIR + ", valorISS=" + valorISS + ", valorCofins=" + valorCofins + ", valorDesconto=" + valorDesconto + ", abatimento=" + abatimento + ", outrasDeducoes=" + outrasDeducoes + ", mora=" + mora + ", multa=" + multa + ", outrosAcrescimos=" + outrosAcrescimos + ", faturaDocumento=" + faturaDocumento + ", brancos2=" + brancos2 + '}';
    }
}
