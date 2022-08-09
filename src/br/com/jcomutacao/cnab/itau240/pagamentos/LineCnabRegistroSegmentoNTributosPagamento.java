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
public class LineCnabRegistroSegmentoNTributosPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String tipoMovimento;
    private String dadosTributo;
    private String seuNumero;
    private String nossoNumero;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO N - (OBRIGATORIO)]
    Este segmento deve necessariamente ser utilizado para pagamento do tributo FGTS-GRF/GRRF/GRDE.
    Não é possível pagar FGTS-GRF/GRRF/GRDE sem código de barras através de arquivo
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

    @Field(offset = 15, length = 3)
    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    @Field(offset = 18, length = 178)
    public String getDadosTributo() {
        return dadosTributo;
    }

    public void setDadosTributo(String dadosTributo) {
        this.dadosTributo = dadosTributo;
    }

    @Field(offset = 196, length = 20)
    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    @Field(offset = 216, length = 15)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Field(offset = 231, length = 10)
    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoNTributosPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", tipoMovimento=" + tipoMovimento + ", dadosTributo=" + dadosTributo + ", seuNumero=" + seuNumero + ", nossoNumero=" + nossoNumero + ", ocorrencias=" + ocorrencias + '}';
    }
}
