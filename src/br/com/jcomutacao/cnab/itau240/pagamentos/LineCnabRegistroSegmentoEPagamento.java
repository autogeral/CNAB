package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   05.08.2022
 */
@Record
public class LineCnabRegistroSegmentoEPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String codigoSegmento;
    private String brancos1;
    private String tipoMovimento;
    private String infoComplementares;
    private String brancos2;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO - E (OPCIONAL)
    P/PAGAMENTOS DE SALÁRIOS ATRAVÉS DE CRÉDITO EM CONTA CORRENTE(HOLERITE)
    
    Este segmento só é obrigatório quando for contratado junto ao Banco o serviço “Holerite - Demonstrativo de
    Pagamento de Salários / Informe de Rendimentos”.
    Um pagamento de salários informado através do segmento “A” poderá conter quantos registros “E” forem
    necessários, até que a soma dos valores informados (créditos e débitos) totalizem o “valor do pagamento”
    informado para pagamento em “A”.
    O arquivo de “Informe de Rendimentos” poderá conter mais de um registro “E”, para cada beneficiário
    Informado nos segmentos “A” e “B” (vide limitação no Anexo D).
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
    
    @Field(offset = 15, length = 3)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos1){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 18, length = 1)
    public String getTipoMovimento(){
        return tipoMovimento;
    }
    
    public void setTipoMovimento(String tipoMovimento){
        this.tipoMovimento = tipoMovimento;
    }
    
    @Field(offset = 19, length = 200)
    public String getInfoComplementares(){
        return infoComplementares;
    }
    
    public void setInfoComplementares(String infoComplementares){
        this.infoComplementares = infoComplementares;
    }
    
    @Field(offset = 219, length = 12)
    public String getBrancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2 = brancos2;
    }
    
    @Field(offset = 231, length = 10)
    public String getOcorrencias(){
        return ocorrencias;
    }
    
    public void setOcorrencias(String ocorrencias){
        this.ocorrencias  = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoEPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", codigoSegmento=" + codigoSegmento + ", brancos1=" + brancos1 + ", tipoMovimento=" + tipoMovimento + ", infoComplementares=" + infoComplementares + ", brancos2=" + brancos2 + ", ocorrencias=" + ocorrencias + '}';
    }
}
