package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *  08.08.2022
 */
@Record
public class LineCnabRegistroSegmentoWTributosPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String brancos1;
    private String informacao1;
    private String informacao2;
    private String informacao3;
    private String informacao4;
    private String brancos2;
    
    
    /*
        REGISTRO DETALHE SEGMENTO W- (OPCIONAL)
    P/PAGAMENTOS DE TRIBUTOS SEM CÓDIGO DE BARRAS E FGTS - GRF/GRRF/GRDE COM CÓDIGO DE BARRAS - INFORMAÇÕES COMPLEMENTARES
    Este segmento deve ser utilizado quando houver a necessidade de impressão de informações
    complementares na GARE – SP ICMS (Guia/comprovante de pagamento) e não consta no arquivo retorno.
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

    @Field(offset = 15, length = 2)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 17, length = 40)
    public String getInformacao1() {
        return informacao1;
    }

    public void setInformacao1(String informacao1) {
        this.informacao1 = informacao1;
    }

    @Field(offset = 57, length = 40)
    public String getInformacao2() {
        return informacao2;
    }

    public void setInformacao2(String informacao2) {
        this.informacao2 = informacao2;
    }

    @Field(offset = 97, length = 40)
    public String getInformacao3() {
        return informacao3;
    }

    public void setInformacao3(String informacao3) {
        this.informacao3 = informacao3;
    }

    @Field(offset = 137, length = 40)
    public String getInformacao4() {
        return informacao4;
    }

    public void setInformacao4(String informacao4) {
        this.informacao4 = informacao4;
    }

    @Field(offset = 177, length = 64)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoWTributosPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", brancos1=" + brancos1 + ", informacao1=" + informacao1 + ", informacao2=" + informacao2 + ", informacao3=" + informacao3 + ", informacao4=" + informacao4 + ", brancos2=" + brancos2 + '}';
    }
}
