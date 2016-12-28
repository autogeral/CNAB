/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.t240.v040.cobranca;

import java.util.Date;

/**
 *
 * @author maria.fernanda
 */
public class Cnab240v040HeaderTraillerLote {
  //LineCnabRegistroHeaderLoteRemessaRetorno
    private String tipoOperacao;
    private int tipoServico;
    private int versaoLayout;
    private final String servicoDescricao = "COBRANCA";
    private int tipoInscricao;
    private long numeroInscricao;
    private Long numeroDaInscricao;
    private String codTransmissao;
    private int codCedente;
    private String nomeCedente;
    private int agenciaCedente;
    private int digAgenciaCedente;
    private int contaCorrente;
    private int digVerificadorConta;
    private String nomeDaEmpresa;
    private int numRetorno;
    private int numRemessa;
    private String mensagem1;
    private String mensagem2;
    private Date dataGravacao;
       
//LineCnabRegistroTraillerLoteRemessaRetorno
    private String codBanco;
    private int loteServico;
    private int quantidadeRegistros;
    private int cobrancaSimples;
    private double valorCobrancaSimples;
    private int cobrancaVinculada;
    private double valorCobrancaVinculada;
    private int cobrancaCaucionada;
    private double valorCobrancaCaucionada;
    private int cobrancaDescontada;
    private double valorCobrancaDescontada;
    private String numAviso;

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
    
    public int getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(int tipoServico) {
        this.tipoServico = tipoServico;
    }

    public int getVersaoLayout() {
        return versaoLayout;
    }

    public void setVersaoLayout(int versaoLayout) {
        this.versaoLayout = versaoLayout;
    }
    
    public String getServicoDescricao() {
        return servicoDescricao;
    }
    
    public int getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(int tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }
    
    public long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public Long getNumeroDaInscricao() {
        return numeroDaInscricao;
    }

    public void setNumeroDaInscricao(Long numeroDaInscricao) {
        this.numeroDaInscricao = numeroDaInscricao;
    }

    public String getCodTransmissao() {
        return codTransmissao;
    }

    public void setCodTransmissao(String codTransmissao) {
        this.codTransmissao = codTransmissao;
    }
      
    public int getCodCedente() {
        return codCedente;
    }

    public void setCodCedente(int codCedente) {
        this.codCedente = codCedente;
    }

    public String getNomeCedente() {
        return nomeCedente;
    }

    public void setNomeCedente(String nomeCedente) {
        this.nomeCedente = nomeCedente;
    }
    
    public int getAgenciaCedente() {
        return agenciaCedente;
    }

    public void setAgenciaCedente(int agenciaCedente) {
        this.agenciaCedente = agenciaCedente;
    }

    public int getDigAgenciaCedente() {
        return digAgenciaCedente;
    }

    public void setDigAgenciaCedente(int digAgenciaCedente) {
        this.digAgenciaCedente = digAgenciaCedente;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public int getDigVerificadorConta() {
        return digVerificadorConta;
    }

    public void setDigVerificadorConta(int digVerificadorConta) {
        this.digVerificadorConta = digVerificadorConta;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public int getNumRetorno() {
        return numRetorno;
    }

    public void setNumRetorno(int numRetorno) {
        this.numRetorno = numRetorno;
    }

    public int getNumRemessa() {
        return numRemessa;
    }

    public void setNumRemessa(int numRemessa) {
        this.numRemessa = numRemessa;
    }

    public String getMensagem1() {
        return mensagem1;
    }

    public void setMensagem1(String mensagem1) {
        this.mensagem1 = mensagem1;
    }

    public String getMensagem2() {
        return mensagem2;
    }

    public void setMensagem2(String mensagem2) {
        this.mensagem2 = mensagem2;
    }
    
    public Date getDataGravacao() {
        return dataGravacao;
    }

    public void setDataGravacao(Date dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public int getLoteServico() {
        return loteServico;
    }

    public void setLoteServico(int loteServico) {
        this.loteServico = loteServico;
    }

    public int getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    public void setQuantidadeRegistros(int quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    public int getCobrancaSimples() {
        return cobrancaSimples;
    }

    public void setCobrancaSimples(int cobrancaSimples) {
        this.cobrancaSimples = cobrancaSimples;
    }

    public double getValorCobrancaSimples() {
        return valorCobrancaSimples;
    }

    public void setValorCobrancaSimples(double valorCobrancaSimples) {
        this.valorCobrancaSimples = valorCobrancaSimples;
    }

    public int getCobrancaVinculada() {
        return cobrancaVinculada;
    }

    public void setCobrancaVinculada(int cobrancaVinculada) {
        this.cobrancaVinculada = cobrancaVinculada;
    }

    public double getValorCobrancaVinculada() {
        return valorCobrancaVinculada;
    }

    public void setValorCobrancaVinculada(double valorCobrancaVinculada) {
        this.valorCobrancaVinculada = valorCobrancaVinculada;
    }

    public int getCobrancaCaucionada() {
        return cobrancaCaucionada;
    }

    public void setCobrancaCaucionada(int cobrancaCaucionada) {
        this.cobrancaCaucionada = cobrancaCaucionada;
    }

    public double getValorCobrancaCaucionada() {
        return valorCobrancaCaucionada;
    }

    public void setValorCobrancaCaucionada(double valorCobrancaCaucionada) {
        this.valorCobrancaCaucionada = valorCobrancaCaucionada;
    }

    public int getCobrancaDescontada() {
        return cobrancaDescontada;
    }

    public void setCobrancaDescontada(int cobrancaDescontada) {
        this.cobrancaDescontada = cobrancaDescontada;
    }

    public double getValorCobrancaDescontada() {
        return valorCobrancaDescontada;
    }

    public void setValorCobrancaDescontada(double valorCobrancaDescontada) {
        this.valorCobrancaDescontada = valorCobrancaDescontada;
    }

    public String getNumAviso() {
        return numAviso;
    }

    public void setNumAviso(String numAviso) {
        this.numAviso = numAviso;
    }
    
    

}
