package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    08.08.2022
 */
@Record
public class LineCnabRegistroSegmentoZTitulosPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String autenticacaoEletronica;
    private String seuNumero;
    private String brancos1;
    private String nossoNumero;
    private String brancos2;
    
    /*
        REGISTRO DETALHE SEGMENTO Z - (OPCIONAL)
    P/LIQUIDAÇÃO DE TÍTULOS (BLOQUETOS) EM COBRANÇA NO ITAÚ E EM OUTROS BANCOS
    
    Registro opcional de complemento que apresenta a Autenticação Eletrônica do Pagamento;
    Este segmento somente constará do arquivo retorno quando contratado junto ao Banco e é exclusivo para
    pagamentos com a ocorrência “00” – Pagamento Efetuado.
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

    @Field(offset = 15, length = 64)
    public String getAutenticacaoEletronica() {
        return autenticacaoEletronica;
    }

    public void setAutenticacaoEletronica(String autenticacaoEletronica) {
        this.autenticacaoEletronica = autenticacaoEletronica;
    }

    @Field(offset = 79, length = 20)
    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    @Field(offset = 99, length = 5)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 104, length = 15)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Field(offset = 119, length = 122)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoZBloquetosPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", autenticacaoEletronica=" + autenticacaoEletronica + ", seuNumero=" + seuNumero + ", brancos1=" + brancos1 + ", nossoNumero=" + nossoNumero + ", brancos2=" + brancos2 + '}';
    }
}
