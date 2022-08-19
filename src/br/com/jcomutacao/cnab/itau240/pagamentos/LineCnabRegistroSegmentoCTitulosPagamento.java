package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   08.08.2022
 */
@Record
public class LineCnabRegistroSegmentoCTitulosPagamento extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String valorContribuicao;
    private String brancos1;;
    private String vencimento;
    private String valorDoc;
    private String valorPIS;
    private String valorIR;
    private String valorISS;
    private String valorContribuicaoFinalidadeSocial;
    private String desconto;
    private String abatimento;
    private String outrasDeducoes;
    private String mora;
    private String multa;
    private String outrasAcrescimos;
    private String faturaDocumento;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO C -(OPCIONAL)
    P/LIQUIDAÇÃO DE TÍTULOS(BLOQUETOS) EM COBRANÇA NO ITAÚ E EM OUTROS BANCOS
     Este segmento só é obrigatório quando for contratado junto ao Banco o serviço “Demonstrativo de
    Pagamentos” por e -mail / web.
    Um pagamento informado através do segmento “J” poderá conter quantos registros “C” forem necessários,
    até que a soma dos valores informados em “C” totalize o valor informado para pagamento em “J”.
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

    @Field(offset = 15, length = 15)
    public String getValorContribuicao() {
        return valorContribuicao;
    }

    public void setValorContribuicao(String valorContribuicao) {
        this.valorContribuicao = valorContribuicao;
    }

    @Field(offset = 30, length = 8)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 38, length = 8)
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    @Field(offset = 46, length = 15)
    public String getValorDoc() {
        return valorDoc;
    }

    public void setValorDoc(String valorDoc) {
        this.valorDoc = valorDoc;
    }

    @Field(offset = 61, length = 15)
    public String getValorPIS() {
        return valorPIS;
    }

    public void setValorPIS(String valorPIS) {
        this.valorPIS = valorPIS;
    }

    @Field(offset = 76, length = 15)
    public String getValorIR() {
        return valorIR;
    }

    public void setValorIR(String valorIR) {
        this.valorIR = valorIR;
    }

    @Field(offset = 91, length = 15)
    public String getValorISS() {
        return valorISS;
    }

    public void setValorISS(String valorISS) {
        this.valorISS = valorISS;
    }

    @Field(offset = 106, length = 15)
    public String getValorContribuicaoFinalidadeSocial() {
        return valorContribuicaoFinalidadeSocial;
    }

    public void setValorContribuicaoFinalidadeSocial(String valorContribuicaoFinalidadeSocial) {
        this.valorContribuicaoFinalidadeSocial = valorContribuicaoFinalidadeSocial;
    }

    @Field(offset = 121, length = 15)
    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    @Field(offset = 136, length = 15)
    public String getAbatimento() {
        return abatimento;
    }

    public void setAbatimento(String abatimento) {
        this.abatimento = abatimento;
    }

    @Field(offset = 151, length = 15)
    public String getOutrasDeducoes() {
        return outrasDeducoes;
    }

    public void setOutrasDeducoes(String outrasDeducoes) {
        this.outrasDeducoes = outrasDeducoes;
    }

    @Field(offset = 166, length = 15)
    public String getMora() {
        return mora;
    }

    public void setMora(String mora) {
        this.mora = mora;
    }

    @Field(offset = 181, length = 15)
    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    @Field(offset = 196, length = 15)
    public String getOutrasAcrescimos() {
        return outrasAcrescimos;
    }

    public void setOutrasAcrescimos(String outrasAcrescimos) {
        this.outrasAcrescimos = outrasAcrescimos;
    }

    @Field(offset = 211, length = 20)
    public String getFaturaDocumento() {
        return faturaDocumento;
    }

    public void setFaturaDocumento(String faturaDocumento) {
        this.faturaDocumento = faturaDocumento;
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
        return "LineCnabRegistroSegmentoCBloquetosPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", valorContribuicao=" + valorContribuicao + ", brancos1=" + brancos1 + ", vencimento=" + vencimento + ", valorDoc=" + valorDoc + ", valorPIS=" + valorPIS + ", valorIR=" + valorIR + ", valorISS=" + valorISS + ", valorContribuicaoFinalidadeSocial=" + valorContribuicaoFinalidadeSocial + ", desconto=" + desconto + ", abatimento=" + abatimento + ", outrasDeducoes=" + outrasDeducoes + ", mora=" + mora + ", multa=" + multa + ", outrasAcrescimos=" + outrasAcrescimos + ", faturaDocumento=" + faturaDocumento + ", ocorrencias=" + ocorrencias + '}';
    }
}
