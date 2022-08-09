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
public class LineCnabRegistroSegmentoJ52Pagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numeroRegistro;
    private String codigoSegmento;
    private String tipoMovimento;
    private String codigoRegistro;
    private String tipoInscricaoPagador;
    private String numeroInscricaoPagador;
    private String nomePagador;
    private String tipoInscricaoBeneficiario;
    private String numeroInscricaoBeneficiario;
    private String nomeBeneficiario;
    private String tipoInscricaoSacador;
    private String numeroInscricaoSacador;
    private String nomeSacador;
    private String brancos;
    
    /*
        REGISTRO DETALHE SEGMENTO - J-52(OBRIGATORIO)
    P/LIQUIDAÇÃO DE TÍTULOS - BOLETOS ITAÚ E OUTROS BANCOS
    
    Com a Nova Plataforma de Cobrança (conforme as Circulares n°s 3.461/09,
    3.598/12 e 3.656/13 do Banco Central), o preenchimento do campo “NUMERO INSCRIÇÃO 
    BENEFICIÁRIO” com o CPF/CPNJ do beneficiário no segmento J-52 passou a ser obrigatório para 
    pagamentos de boletos emitidos pelo Itaú e por outros bancos (formas “30 – boletos Itaú” e “31 –
    boletos outros bancos”).
    Se as informações no segmento J-52 não forem preenchidas corretamente, o pagamento será rejeitado 
    e o motivo no arquivo retorno será “BI”: CNPJ/CPF do beneficiário inválido no segmento J-52 ou B 
    inválido”.
    O registro deve vir sempre após o respectivo segmento J. Caso utilize o segmento B e C obedecer à 
    ordem dos registros (J, J-52, B, C).
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

    @Field(offset = 18, length = 2)
    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    @Field(offset = 20, length = 1)
    public String getTipoInscricaoPagador() {
        return tipoInscricaoPagador;
    }

    public void setTipoInscricaoPagador(String tipoInscricaoPagador) {
        this.tipoInscricaoPagador = tipoInscricaoPagador;
    }

    @Field(offset = 21, length = 15)
    public String getNumeroInscricaoPagador() {
        return numeroInscricaoPagador;
    }

    public void setNumeroInscricaoPagador(String numeroInscricaoPagador) {
        this.numeroInscricaoPagador = numeroInscricaoPagador;
    }

    @Field(offset = 36, length = 40)
    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    @Field(offset = 76, length = 1)
    public String getTipoInscricaoBeneficiario() {
        return tipoInscricaoBeneficiario;
    }

    public void setTipoInscricaoBeneficiario(String tipoInscricaoBeneficiario) {
        this.tipoInscricaoBeneficiario = tipoInscricaoBeneficiario;
    }

    @Field(offset = 77, length = 15)
    public String getNumeroInscricaoBeneficiario() {
        return numeroInscricaoBeneficiario;
    }

    public void setNumeroInscricaoBeneficiario(String numeroInscricaoBeneficiario) {
        this.numeroInscricaoBeneficiario = numeroInscricaoBeneficiario;
    }

    @Field(offset = 92, length = 40)
    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    @Field(offset = 132, length = 1)
    public String getTipoInscricaoSacador() {
        return tipoInscricaoSacador;
    }

    public void setTipoInscricaoSacador(String tipoInscricaoSacador) {
        this.tipoInscricaoSacador = tipoInscricaoSacador;
    }

    @Field(offset = 133, length = 15)
    public String getNumeroInscricaoSacador() {
        return numeroInscricaoSacador;
    }

    public void setNumeroInscricaoSacador(String numeroInscricaoSacador) {
        this.numeroInscricaoSacador = numeroInscricaoSacador;
    }

    @Field(offset = 148, length = 40)
    public String getNomeSacador() {
        return nomeSacador;
    }

    public void setNomeSacador(String nomeSacador) {
        this.nomeSacador = nomeSacador;
    }

    @Field(offset = 188, length = 53)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoJ52Pagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numeroRegistro=" + numeroRegistro + ", codigoSegmento=" + codigoSegmento + ", tipoMovimento=" + tipoMovimento + ", codigoRegistro=" + codigoRegistro + ", tipoInscricaoPagador=" + tipoInscricaoPagador + ", numeroInscricaoPagador=" + numeroInscricaoPagador + ", nomePagador=" + nomePagador + ", tipoInscricaoBeneficiario=" + tipoInscricaoBeneficiario + ", numeroInscricaoBeneficiario=" + numeroInscricaoBeneficiario + ", nomeBeneficiario=" + nomeBeneficiario + ", tipoInscricaoSacador=" + tipoInscricaoSacador + ", numeroInscricaoSacador=" + numeroInscricaoSacador + ", nomeSacador=" + nomeSacador + ", brancos=" + brancos + '}';
    }
}
