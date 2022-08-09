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
public class LineCnabRegistroSegmentoJBloquetoPagamento  extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String tipoMovimento;
    private String bancoFavorecido;
    private String codigoMoeda;
    private String digitoVerificador;
    private String vencimento;
    private String valor;
    private String campoLivre;
    private String nomeFavorecido;
    private String dataVencimento;
    private String valorTitulo;
    private String descontos;
    private String acrescimos;
    private String dataPgto;
    private String valorPgto;
    private String zeros;
    private String seuNumero;
    private String brancos;
    private String nossoNumero;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO - J (OBRIGATÓRIO)
    P/LIQUIDAÇÃO DE TÍTULOS (BLOQUETOS) EM COBRANÇA NO ITAÚ E EM OUTROS BANCOS
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

    @Field(offset = 18, length = 3)
    public String getBancoFavorecido() {
        return bancoFavorecido;
    }

    public void setBancoFavorecido(String bancoFavorecido) {
        this.bancoFavorecido = bancoFavorecido;
    }

    @Field(offset = 21, length = 1)
    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    @Field(offset = 22, length = 1)
    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    @Field(offset = 23, length = 4)
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    @Field(offset = 27, length = 10)
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Field(offset = 37, length = 25)
    public String getCampoLivre() {
        return campoLivre;
    }

    public void setCampoLivre(String campoLivre) {
        this.campoLivre = campoLivre;
    }

    @Field(offset = 62, length = 30)
    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    @Field(offset = 92, length = 8)
    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Field(offset = 100, length = 15)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    @Field(offset = 115, length = 15)
    public String getDescontos() {
        return descontos;
    }

    public void setDescontos(String descontos) {
        this.descontos = descontos;
    }

    @Field(offset = 130, length = 15)
    public String getAcrescimos() {
        return acrescimos;
    }

    public void setAcrescimos(String acrescimos) {
        this.acrescimos = acrescimos;
    }

    @Field(offset = 145, length = 8)
    public String getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(String dataPgto) {
        this.dataPgto = dataPgto;
    }

    @Field(offset = 153, length = 15)
    public String getValorPgto() {
        return valorPgto;
    }

    public void setValorPgto(String valorPgto) {
        this.valorPgto = valorPgto;
    }

     @Field(offset = 168, length = 15)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

     @Field(offset = 183, length = 20)
    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

     @Field(offset = 203, length = 13)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
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
        return "LineCnabRegistroSegmentoJPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", tipoMovimento=" + tipoMovimento + ", bancoFavorecido=" + bancoFavorecido + ", codigoMoeda=" + codigoMoeda + ", digitoVerificador=" + digitoVerificador + ", vencimento=" + vencimento + ", valor=" + valor + ", campoLivre=" + campoLivre + ", nomeFavorecido=" + nomeFavorecido + ", dataVencimento=" + dataVencimento + ", valorTitulo=" + valorTitulo + ", descontos=" + descontos + ", acrescimos=" + acrescimos + ", dataPgto=" + dataPgto + ", valorPgto=" + valorPgto + ", zeros=" + zeros + ", seuNumero=" + seuNumero + ", brancos=" + brancos + ", nossoNumero=" + nossoNumero + ", ocorrencias=" + ocorrencias + '}';
    }
}
