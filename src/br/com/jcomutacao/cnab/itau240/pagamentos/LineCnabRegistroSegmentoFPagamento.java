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
public class LineCnabRegistroSegmentoFPagamento extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String codigoSegmento;
    private String brancos1;
    private String msgInformacoes;
    private String brancos2;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO - F (OPCIONAL)
    P/PAGAMENTOS DE SALÁRIOS ATRAVÉS DE CRÉDITO EM CONTA CORRENTE(HOLERITE)
    Este segmento é opcional e só se aplica aos clientes que possuem contratado o serviço de “Holerite -
    Demonstrativo de Pagamentos / Informe de Rendimentos” junto ao Banco Itaú SA.
    Poderá ser enviado no máximo um (01) registro “F”, para cada “Holerite - Demonstrativo de Pagamentos” e
    até trinta (30) registros “F”, para compor as Informações Complementares do “Informe de Rendimentos”
    (consulte Nota 25).
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
    
    @Field(offset = 18, length = 144)
    public String getMsgInformacoes(){
        return msgInformacoes;
    }
    
    public void setMsgInformacoes(String msgInformacoes){
        this.msgInformacoes =  msgInformacoes;
    }
    
    @Field(offset = 162, length = 69)
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
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoFPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", codigoSegmento=" + codigoSegmento + ", brancos1=" + brancos1 + ", msgInformacoes=" + msgInformacoes + ", brancos2=" + brancos2 + ", ocorrencias=" + ocorrencias + '}';
    }
}
