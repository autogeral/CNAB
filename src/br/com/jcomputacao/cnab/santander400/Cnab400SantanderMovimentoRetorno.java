/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import java.util.Date;

/**
 *
 * @author ADM
 */
public class Cnab400SantanderMovimentoRetorno {

    private Long codigoRegistro;
    private Long tipoInscricaoCedente;
    private Long cgcCpfCedente;
    private Long codigoAgenciaCedente;
    private Long contaMovimentoCedente;
    private Long contaCobrancaCedente;
    //private Long codigoAgenciaCedente;
    private String numeroControleParticipante;
    private Long nossoNumero1;
    private Long codigoCarteira;
    private Long codigoOcorrencia;
    private Date dataOcorrencia;
    private String seuNumero;
    private Long nossoNumero2;
    private Long codigoOriginalRemessa;
    private String codigoErroPrimeiraOcorrencia;
    private String codigoErroSegundaOcorrencia;
    private String codigoErroTerceiraOcorrencia;
    private Date dataVencimentoTitulo;
    private Double valorTitulo;
    private Long numeroBancoCobrador;
    private Long codigoAgenciaRecebedoraTitulo;
    private Long especieDocumento;
    private Double valorTarifaCobrada;
    private Double valorOutrasDespesas;
    private Double valorJurosAtraso;
    private Double valorIofDevido;
    private Double valorAbatimentoConcedido;
    private Double valorDescontoConcedido;
    private Double valorTotalRecebido;
    private Double valorJurosMora;
    private Double valorOutrosCreditos;
    private String codigoAceite;
    private Date dataCredito;
    private String nomeSacado;
    private String identificadorComplemento;
    private Long unidadeValorMoedaCorrente;
    private Double valorTituloOutraUnidadeValor;
    private Double valorIocOutraUnidadeValor;
    private Double valorDebitoCredito;
    private String debitoCredito;
    private Long numeroVersao;
    private Long numeroSequencialRegistroArquivo;

    public Long getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(Long codigoReGistro) {
        this.codigoRegistro = codigoReGistro;
    }

    public Long getCgcCpfCedente() {
        return cgcCpfCedente;
    }

    public void setCgcCpfCedente(Long cgcCpfCedente) {
        this.cgcCpfCedente = cgcCpfCedente;
    }

    public String getCodigoAceite() {
        return codigoAceite;
    }

    public void setCodigoAceite(String codigoAceite) {
        this.codigoAceite = codigoAceite;
    }

    public Long getCodigoAgenciaCedente() {
        return codigoAgenciaCedente;
    }

    public void setCodigoAgenciaCedente(Long codigoAgenciaCedente) {
        this.codigoAgenciaCedente = codigoAgenciaCedente;
    }

    public Long getCodigoAgenciaRecebedoraTitulo() {
        return codigoAgenciaRecebedoraTitulo;
    }

    public void setCodigoAgenciaRecebedoraTitulo(Long codigoAgenciaRecebedoraTitulo) {
        this.codigoAgenciaRecebedoraTitulo = codigoAgenciaRecebedoraTitulo;
    }

    public Long getCodigoCarteira() {
        return codigoCarteira;
    }

    public void setCodigoCarteira(Long codigoCarteira) {
        this.codigoCarteira = codigoCarteira;
    }

    public String getCodigoErroPrimeiraOcorrencia() {
        return codigoErroPrimeiraOcorrencia;
    }

    public void setCodigoErroPrimeiraOcorrencia(String codigoErroPrimeiraOcorrencia) {
        this.codigoErroPrimeiraOcorrencia = codigoErroPrimeiraOcorrencia;
    }

    public String getCodigoErroSegundaOcorrencia() {
        return codigoErroSegundaOcorrencia;
    }

    public void setCodigoErroSegundaOcorrencia(String codigoErroSegundaOcorrencia) {
        this.codigoErroSegundaOcorrencia = codigoErroSegundaOcorrencia;
    }

    public String getCodigoErroTerceiraOcorrencia() {
        return codigoErroTerceiraOcorrencia;
    }

    public void setCodigoErroTerceiraOcorrencia(String codigoErroTerceiraOcorrencia) {
        this.codigoErroTerceiraOcorrencia = codigoErroTerceiraOcorrencia;
    }

    public Long getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(Long codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public Long getCodigoOriginalRemessa() {
        return codigoOriginalRemessa;
    }

    public void setCodigoOriginalRemessa(Long codigoOriginalRemessa) {
        this.codigoOriginalRemessa = codigoOriginalRemessa;
    }

    public Long getContaCobrancaCedente() {
        return contaCobrancaCedente;
    }

    public void setContaCobrancaCedente(Long contaCobrancaCedente) {
        this.contaCobrancaCedente = contaCobrancaCedente;
    }

    public Long getContaMovimentoCedente() {
        return contaMovimentoCedente;
    }

    public void setContaMovimentoCedente(Long contaMovimentoCedente) {
        this.contaMovimentoCedente = contaMovimentoCedente;
    }

    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Date getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }

    public void setDataVencimentoTitulo(Date dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }

    public String getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(String debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public Long getEspecieDocumento() {
        return especieDocumento;
    }

    public void setEspecieDocumento(Long especieDocumento) {
        this.especieDocumento = especieDocumento;
    }

    public String getIdentificadorComplemento() {
        return identificadorComplemento;
    }

    public void setIdentificadorComplemento(String identificadorComplemento) {
        this.identificadorComplemento = identificadorComplemento;
    }

    public String getNomeSacado() {
        return nomeSacado;
    }

    public void setNomeSacado(String nomeSacado) {
        this.nomeSacado = nomeSacado;
    }

    public Long getNossoNumero1() {
        return nossoNumero1;
    }

    public void setNossoNumero1(Long nossoNumero1) {
        this.nossoNumero1 = nossoNumero1;
    }

    public Long getNossoNumero2() {
        return nossoNumero2;
    }

    public void setNossoNumero2(Long nossoNumero2) {
        this.nossoNumero2 = nossoNumero2;
    }

    public Long getNumeroBancoCobrador() {
        return numeroBancoCobrador;
    }

    public void setNumeroBancoCobrador(Long numeroBancoCobrador) {
        this.numeroBancoCobrador = numeroBancoCobrador;
    }

    public String getNumeroControleParticipante() {
        return numeroControleParticipante;
    }

    public void setNumeroControleParticipante(String numeroControleParticipante) {
        this.numeroControleParticipante = numeroControleParticipante;
    }

    public Long getNumeroSequencialRegistroArquivo() {
        return numeroSequencialRegistroArquivo;
    }

    public void setNumeroSequencialRegistroArquivo(Long numeroSequencialRegistroArquivo) {
        this.numeroSequencialRegistroArquivo = numeroSequencialRegistroArquivo;
    }

    public Long getNumeroVersao() {
        return numeroVersao;
    }

    public void setNumeroVersao(Long numeroVersao) {
        this.numeroVersao = numeroVersao;
    }

    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public Long getTipoInscricaoCedente() {
        return tipoInscricaoCedente;
    }

    public void setTipoInscricaoCedente(Long tipoInscricaoCedente) {
        this.tipoInscricaoCedente = tipoInscricaoCedente;
    }

    public Long getUnidadeValorMoedaCorrente() {
        return unidadeValorMoedaCorrente;
    }

    public void setUnidadeValorMoedaCorrente(Long unidadeValorMoedaCorrente) {
        this.unidadeValorMoedaCorrente = unidadeValorMoedaCorrente;
    }

    public Double getValorAbatimentoConcedido() {
        return valorAbatimentoConcedido;
    }

    public void setValorAbatimentoConcedido(Double valorAbatimentoConcedido) {
        this.valorAbatimentoConcedido = valorAbatimentoConcedido;
    }

    public Double getValorDebitoCredito() {
        return valorDebitoCredito;
    }

    public void setValorDebitoCredito(Double valorDebitoCredito) {
        this.valorDebitoCredito = valorDebitoCredito;
    }

    public Double getValorDescontoConcedido() {
        return valorDescontoConcedido;
    }

    public void setValorDescontoConcedido(Double valorDescontoConcedido) {
        this.valorDescontoConcedido = valorDescontoConcedido;
    }

    public Double getValorIocOutraUnidadeValor() {
        return valorIocOutraUnidadeValor;
    }

    public void setValorIocOutraUnidadeValor(Double valorIocOutraUnidadeValor) {
        this.valorIocOutraUnidadeValor = valorIocOutraUnidadeValor;
    }

    public Double getValorIofDevido() {
        return valorIofDevido;
    }

    public void setValorIofDevido(Double valorIofDevido) {
        this.valorIofDevido = valorIofDevido;
    }

    public Double getValorJurosAtraso() {
        return valorJurosAtraso;
    }

    public void setValorJurosAtraso(Double valorJurosAtraso) {
        this.valorJurosAtraso = valorJurosAtraso;
    }

    public Double getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(Double valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }

    public Double getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    public void setValorOutrasDespesas(Double valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    public Double getValorOutrosCreditos() {
        return valorOutrosCreditos;
    }

    public void setValorOutrosCreditos(Double valorOutrosCreditos) {
        this.valorOutrosCreditos = valorOutrosCreditos;
    }

    public Double getValorTarifaCobrada() {
        return valorTarifaCobrada;
    }

    public void setValorTarifaCobrada(Double valorTarifaCobrada) {
        this.valorTarifaCobrada = valorTarifaCobrada;
    }

    public Double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public Double getValorTituloOutraUnidadeValor() {
        return valorTituloOutraUnidadeValor;
    }

    public void setValorTituloOutraUnidadeValor(Double valorTituloOutraUnidadeValor) {
        this.valorTituloOutraUnidadeValor = valorTituloOutraUnidadeValor;
    }

    public Double getValorTotalRecebido() {
        return valorTotalRecebido;
    }

    public void setValorTotalRecebido(Double valorTotalRecebido) {
        this.valorTotalRecebido = valorTotalRecebido;
    }

    @Override
    public String toString() {
        return "Cnab400SantanderMovimentoRetorno{" + "codigoRegistro=" + codigoRegistro + ", tipoInscricaoCedente=" + tipoInscricaoCedente + ", cgcCpfCedente=" + cgcCpfCedente + ", codigoAgenciaCedente=" + codigoAgenciaCedente + ", contaMovimentoCedente=" + contaMovimentoCedente + ", contaCobrancaCedente=" + contaCobrancaCedente + ", numeroControleParticipante=" + numeroControleParticipante + ", nossoNumero1=" + nossoNumero1 + ", codigoCarteira=" + codigoCarteira + ", codigoOcorrencia=" + codigoOcorrencia + ", dataOcorrencia=" + dataOcorrencia + ", seuNumero=" + seuNumero + ", nossoNumero2=" + nossoNumero2 + ", codigoOriginalRemessa=" + codigoOriginalRemessa + ", codigoErroPrimeiraOcorrencia=" + codigoErroPrimeiraOcorrencia + ", codigoErroSegundaOcorrencia=" + codigoErroSegundaOcorrencia + ", codigoErroTerceiraOcorrencia=" + codigoErroTerceiraOcorrencia + ", dataVencimentoTitulo=" + dataVencimentoTitulo + ", valorTitulo=" + valorTitulo + ", numeroBancoCobrador=" + numeroBancoCobrador + ", codigoAgenciaRecebedoraTitulo=" + codigoAgenciaRecebedoraTitulo + ", especieDocumento=" + especieDocumento + ", valorTarifaCobrada=" + valorTarifaCobrada + ", valorOutrasDespesas=" + valorOutrasDespesas + ", valorJurosAtraso=" + valorJurosAtraso + ", valorIofDevido=" + valorIofDevido + ", valorAbatimentoConcedido=" + valorAbatimentoConcedido + ", valorDescontoConcedido=" + valorDescontoConcedido + ", valorTotalRecebido=" + valorTotalRecebido + ", valorJurosMora=" + valorJurosMora + ", valorOutrosCreditos=" + valorOutrosCreditos + ", codigoAceite=" + codigoAceite + ", dataCredito=" + dataCredito + ", nomeSacado=" + nomeSacado + ", identificadorComplemento=" + identificadorComplemento + ", unidadeValorMoedaCorrente=" + unidadeValorMoedaCorrente + ", valorTituloOutraUnidadeValor=" + valorTituloOutraUnidadeValor + ", valorIocOutraUnidadeValor=" + valorIocOutraUnidadeValor + ", valorDebitoCredito=" + valorDebitoCredito + ", debitoCredito=" + debitoCredito + ", numeroVersao=" + numeroVersao + ", numeroSequencialRegistroArquivo=" + numeroSequencialRegistroArquivo + '}';
    }
}
