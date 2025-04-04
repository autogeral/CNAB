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
public class Cnab240v040HeaderTraillerArquivo {
    //LineCnabRegistroHeaderArquivoRemessaRetorno
        private String codigoBanco;
        private int tipoDeInscricao;
        private int numeroDeInscricao;
        private Long numeroInscricao;
        private int codTransmissao;
        private int agenciaCedente;
        private int digAgenciaCedente;
        private int contaCorrente;
        private int digVerificadorConta;
        private int codCedente;
        private String nomeDaEmpresa;
        private String nomeDoBanco;
        private int codRemessa;
        private int codRetorno;
        private Date dataGeracao;
        private int numSequencialArquivo;
        private String versaoDoLayout;
    //LineCnabRegistroTraillerArquivoRetorno
        private int quantidadeLote; 
        private int quantidadeRegistros;
        private int quantidadeContas;
        
            
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public int getTipoDeInscricao() {
        return tipoDeInscricao;
    }

    public void setTipoDeInscricao(int tipoDeInscricao) {
        this.tipoDeInscricao = tipoDeInscricao;
    }

    public int getNumeroDeInscricao() {
        return numeroDeInscricao;
    }

    public void setNumeroDeInscricao(int numeroDeInscricao) {
        this.numeroDeInscricao = numeroDeInscricao;
    }

    public Long getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(Long numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
    
    public int getCodTransmissao() {
        return codTransmissao;
    }

    public void setCodTransmissao(int codTransmissao) {
        this.codTransmissao = codTransmissao;
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

    public int getCodCedente() {
        return codCedente;
    }

    public void setCodCedente(int codCedente) {
        this.codCedente = codCedente;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public int getCodRemessa() {
        return codRemessa;
    }

    public void setCodRemessa(int codRemessa) {
        this.codRemessa = codRemessa;
    }
    
    public int getCodRetorno() {
        return codRetorno;
    }

    public void setCodRetorno(int codRetorno) {
        this.codRetorno = codRetorno;
    }
        
    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public int getNumSequencialArquivo() {
        return numSequencialArquivo;
    }

    public void setNumSequencialArquivo(int numSequencialArquivo) {
        this.numSequencialArquivo = numSequencialArquivo;
    }

    public String getVersaoDoLayout() {
        return versaoDoLayout;
    }

    public void setVersaoDoLayout(String versaoDoLayout) {
        this.versaoDoLayout = versaoDoLayout;
    }

    public int getQuantidadeLote() {
        return quantidadeLote;
    }

    public void setQuantidadeLote(int quantidadeLote) {
        this.quantidadeLote = quantidadeLote;
    }

    public int getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    public void setQuantidadeRegistros(int quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    public int getQuantidadeContas() {
        return quantidadeContas;
    }

    public void setQuantidadeContas(int quantidadeContas) {
        this.quantidadeContas = quantidadeContas;
    }       

    public void getCodRetorno(int codRetorno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
