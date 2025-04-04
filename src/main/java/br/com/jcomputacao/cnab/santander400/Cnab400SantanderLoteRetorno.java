/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nieri
 */
public class Cnab400SantanderLoteRetorno {

    //LineCnabRegistroHeaderRetorno
    private Long codigoRegistro;
    private Long codigoRemessa;
    private String literalTransmissao;
    private Long codigoServico;
    private String literalServico;
    private Long codigoAgenciaCedente;
    private Long contaMovimentoCedente;
    private Long contaCobrancaCedente;
    private String nomeCedente;
    private Long codigoBanco;
    private String nomeBanco;
    private Date dataMovimento;
    private String codigoCedente;
    private Long numeroVersao;
    private Long numeroSequencialRegistroArquivo;
    //LineCnabRegistroMovimentoRetorno
    private List<Cnab400SantanderMovimentoRetorno> movimentoRetorno = new ArrayList<Cnab400SantanderMovimentoRetorno>();
    //LineCnabRegistroTraillerRetorno
    private Long quantidadeRegistrosCobrancasSimplesReferenteCedente;
    private Double valorTitulosCobrancaSimplesReferenteCedente;
    private Long numeroAvisoCobrancaSimples;
    private Long quantidadeRegistrosCobrancasCaucionadaReferenteCedente;
    private Double valorTitulosCobrancaCaucionadaReferenteCedente;
    private Long numeroAvisoCobrancaCaucionada;
    private Long quantidadeRegistrosCobrancasDescontadaReferenteCedente;
    private Double valorTitulosCobrancaDescontadaReferenteCedente;
    private Long numeroAvisoCobrancaDescontada;

    public List<Cnab400SantanderMovimentoRetorno> getMovimentoRetorno() {
        return movimentoRetorno;
    }

    public void setMovimentoRetorno(List<Cnab400SantanderMovimentoRetorno> movimentoRetorno) {
        this.movimentoRetorno = movimentoRetorno;
    }

    public Long getCodigoAgenciaCedente() {
        return codigoAgenciaCedente;
    }

    public void setCodigoAgenciaCedente(Long codigoAgenciaCedente) {
        this.codigoAgenciaCedente = codigoAgenciaCedente;
    }

    public Long getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Long codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getCodigoCedente() {
        return codigoCedente;
    }

    public void setCodigoCedente(String codigoCedente) {
        this.codigoCedente = codigoCedente;
    }

    public Long getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(Long codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Long getCodigoRemessa() {
        return codigoRemessa;
    }

    public void setCodigoRemessa(Long codigoRemessa) {
        this.codigoRemessa = codigoRemessa;
    }

    public Long getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(Long codigoServico) {
        this.codigoServico = codigoServico;
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

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getLiteralServico() {
        return literalServico;
    }

    public void setLiteralServico(String literalServico) {
        this.literalServico = literalServico;
    }

    public String getLiteralTransmissao() {
        return literalTransmissao;
    }

    public void setLiteralTransmissao(String literalTransmissao) {
        this.literalTransmissao = literalTransmissao;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeCedente() {
        return nomeCedente;
    }

    public void setNomeCedente(String nomeCedente) {
        this.nomeCedente = nomeCedente;
    }

    public Long getNumeroAvisoCobrancaCaucionada() {
        return numeroAvisoCobrancaCaucionada;
    }

    public void setNumeroAvisoCobrancaCaucionada(Long numeroAvisoCobrancaCaucionada) {
        this.numeroAvisoCobrancaCaucionada = numeroAvisoCobrancaCaucionada;
    }

    public Long getNumeroAvisoCobrancaDescontada() {
        return numeroAvisoCobrancaDescontada;
    }

    public void setNumeroAvisoCobrancaDescontada(Long numeroAvisoCobrancaDescontada) {
        this.numeroAvisoCobrancaDescontada = numeroAvisoCobrancaDescontada;
    }

    public Long getNumeroAvisoCobrancaSimples() {
        return numeroAvisoCobrancaSimples;
    }

    public void setNumeroAvisoCobrancaSimples(Long numeroAvisoCobrancaSimples) {
        this.numeroAvisoCobrancaSimples = numeroAvisoCobrancaSimples;
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

    public Long getQuantidadeRegistrosCobrancasCaucionadaReferenteCedente() {
        return quantidadeRegistrosCobrancasCaucionadaReferenteCedente;
    }

    public void setQuantidadeRegistrosCobrancasCaucionadaReferenteCedente(Long quantidadeRegistrosCobrancasCaucionadaReferenteCedente) {
        this.quantidadeRegistrosCobrancasCaucionadaReferenteCedente = quantidadeRegistrosCobrancasCaucionadaReferenteCedente;
    }

    public Long getQuantidadeRegistrosCobrancasDescontadaReferenteCedente() {
        return quantidadeRegistrosCobrancasDescontadaReferenteCedente;
    }

    public void setQuantidadeRegistrosCobrancasDescontadaReferenteCedente(Long quantidadeRegistrosCobrancasDescontadaReferenteCedente) {
        this.quantidadeRegistrosCobrancasDescontadaReferenteCedente = quantidadeRegistrosCobrancasDescontadaReferenteCedente;
    }

    public Long getQuantidadeRegistrosCobrancasSimplesReferenteCedente() {
        return quantidadeRegistrosCobrancasSimplesReferenteCedente;
    }

    public void setQuantidadeRegistrosCobrancasSimplesReferenteCedente(Long quantidadeRegistrosCobrancasSimplesReferenteCedente) {
        this.quantidadeRegistrosCobrancasSimplesReferenteCedente = quantidadeRegistrosCobrancasSimplesReferenteCedente;
    }

    public Double getValorTitulosCobrancaCaucionadaReferenteCedente() {
        return valorTitulosCobrancaCaucionadaReferenteCedente;
    }

    public void setValorTitulosCobrancaCaucionadaReferenteCedente(Double valorTitulosCobrancaCaucionadaReferenteCedente) {
        this.valorTitulosCobrancaCaucionadaReferenteCedente = valorTitulosCobrancaCaucionadaReferenteCedente;
    }

    public Double getValorTitulosCobrancaDescontadaReferenteCedente() {
        return valorTitulosCobrancaDescontadaReferenteCedente;
    }

    public void setValorTitulosCobrancaDescontadaReferenteCedente(Double valorTitulosCobrancaDescontadaReferenteCedente) {
        this.valorTitulosCobrancaDescontadaReferenteCedente = valorTitulosCobrancaDescontadaReferenteCedente;
    }

    public Double getValorTitulosCobrancaSimplesReferenteCedente() {
        return valorTitulosCobrancaSimplesReferenteCedente;
    }

    public void setValorTitulosCobrancaSimplesReferenteCedente(Double valorTitulosCobrancaSimplesReferenteCedente) {
        this.valorTitulosCobrancaSimplesReferenteCedente = valorTitulosCobrancaSimplesReferenteCedente;
    }
}
