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
public class LineCnabRegistroSegmentoOContasPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String tipoMovimento;
    private String codigoBarras;
    private String nomeConcessionaria;
    private String dataVencimento;
    private String tipoMoeda;
    private String qtdMoeda;
    private String valorPagar;
    private String dataPgto;
    private String valorPago;
    private String brancos1;
    private String notaFiscal;
    private String brancos2;
    private String seuNumero;
    private String brancos3;
    private String nossoNumero;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO O - (OBRIGATÓRIO)
    P/PAGAMENTOS DE CONTAS DE CONCESSIONARIA E TRIBUTOS COM CÓDDIGO DE BARRAS
    
    Este segmento não se aplica para pagamento do tributo FGTS-GRF/GRRF/GRDE. Não é possível pagar
    FGTS-GRF/GRRF/GRDE sem código de barras através de arquivo. Para pagamento de FGTSGRF/GRRF/GRDE utilizar obrigatoriamente o segmento N de acordo com as especificações apresentadas
    neste manual
    */
    
    @Field(offset = 1 , length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 4 , length = 4)
    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    @Field(offset = 8 , length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 9 , length = 5)
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Field(offset = 14 , length = 1)
    public String getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(String codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    @Field(offset = 15 , length = 3)
    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    @Field(offset = 18 , length = 48)
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Field(offset = 66 , length = 30)
    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public void setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }

    @Field(offset = 96 , length = 8)
    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Field(offset = 104 , length = 3)
    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    @Field(offset = 107 , length = 9)
    public String getQtdMoeda() {
        return qtdMoeda;
    }

    public void setQtdMoeda(String qtdMoeda) {
        this.qtdMoeda = qtdMoeda;
    }

    @Field(offset = 122 , length = 15)
    public String getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(String valorPagar) {
        this.valorPagar = valorPagar;
    }

    @Field(offset = 137 , length = 8)
    public String getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(String dataPgto) {
        this.dataPgto = dataPgto;
    }

    @Field(offset = 145 , length = 15)
    public String getValorPago() {
        return valorPago;
    }

    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }

    @Field(offset = 160 , length = 3)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 163 , length = 9)
    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Field(offset = 172 , length = 3)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 175 , length = 20)
    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    @Field(offset = 195 , length = 21)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Field(offset = 216 , length = 15)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Field(offset = 231 , length = 10)
    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoOContasPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", tipoMovimento=" + tipoMovimento + ", codigoBarras=" + codigoBarras + ", nomeConcessionaria=" + nomeConcessionaria + ", dataVencimento=" + dataVencimento + ", tipoMoeda=" + tipoMoeda + ", qtdMoeda=" + qtdMoeda + ", valorPagar=" + valorPagar + ", dataPgto=" + dataPgto + ", valorPago=" + valorPago + ", brancos1=" + brancos1 + ", notaFiscal=" + notaFiscal + ", brancos2=" + brancos2 + ", seuNumero=" + seuNumero + ", brancos3=" + brancos3 + ", nossoNumero=" + nossoNumero + ", ocorrencias=" + ocorrencias + '}';
    }
}
