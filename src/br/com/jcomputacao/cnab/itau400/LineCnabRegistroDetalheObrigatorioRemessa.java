package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo 25.08.2021
 */
@Record
public class LineCnabRegistroDetalheObrigatorioRemessa {

    private String tipoRegistro;
    private String codigoInscricao1;
    private String numeroInscricao1;
    private String agencia;
    private String zeros;
    private String conta;
    private String dac;
    private String brancos1;
    private String instrucaoAlegacao;
    private String usoEmpresa;
    private String nossoNumero;
    private String qtdMoeda;
    private String numeroCarteira;
    private String usoBanco;
    private String carteira;
    private String codOcorrencia;
    private String numDocumento;
    private String vencimento;
    private String valorTitulo;
    private String codigoBanco;
    private String agenciaCobradora;
    private String especie;
    private String aceite;
    private String dataEmissao;
    private String instrucao1;
    private String instrucao2;
    private String juros1Dia;
    private String desconto;
    private String valorDesconto;
    private String valorIof;
    private String abatimento;
    private String codigoInscricao2;
    private String numeroInscricao2;
    private String nome;
    private String brancos;
    private String logradouros;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String sacadorAvalista;
    private String brancos2;
    private String dataMora;
    private String prazo;
    private String brancos3;
    private String numeroSequencial;

    @Field(offset = 1, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2, length = 2)
    public String getCodigoInscricao1() {
        return codigoInscricao1;
    }

    public void setCodigoInscricao1(String codigoInscricao1) {
        this.codigoInscricao1 = codigoInscricao1;
    }

    @Field(offset = 4, length = 14)
    public String getNumeroInscricao1() {
        return numeroInscricao1;
    }

    public void setNumeroInscricao1(String numeroInscricao1) {
        this.numeroInscricao1 = numeroInscricao1;
    }

   @Field(offset = 18, length = 4)
    public String getAgencia() {
        return agencia;
    }
  
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

   @Field(offset = 22, length = 2)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

   @Field(offset = 24, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

  @Field(offset = 29, length = 1)
    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

   @Field(offset = 30, length = 4)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 34, length = 4)
    public String getInstrucaoAlegacao() {
        return instrucaoAlegacao;
    }

    public void setInstrucaoAlegacao(String instrucaoAlegacao) {
        this.instrucaoAlegacao = instrucaoAlegacao;
    }

    @Field(offset = 38, length = 25)
    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }

   @Field(offset = 63, length = 8)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

   @Field(offset = 71, length = 13) 
    public String getQtdMoeda() {
        return qtdMoeda;
    }

    public void setQtdMoeda(String qtdMoeda) {
        this.qtdMoeda = qtdMoeda;
    }

    @Field(offset = 84, length = 3)
    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

   @Field(offset = 87, length = 21)
    public String getUsoBanco() {
        return usoBanco;
    }

    public void setUsoBanco(String usoBanco) {
        this.usoBanco = usoBanco;
    }

    @Field(offset = 108, length = 1)
    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    @Field(offset = 109, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    @Field(offset = 111, length = 10)
    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    @Field(offset = 121, length = 6)
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

   @Field(offset = 127, length = 13)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    @Field(offset = 140, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

   @Field(offset = 143, length = 5)
    public String getAgenciaCobradora() {
        return agenciaCobradora;
    }

    public void setAgenciaCobradora(String agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
    }

    @Field(offset = 148, length = 2)
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

   @Field(offset = 150, length = 1)
    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

   @Field(offset = 151, length = 6)
    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

   @Field(offset = 157, length = 2)
    public String getInstrucao1() {
        return instrucao1;
    }

    public void setInstrucao1(String instrucao1) {
        this.instrucao1 = instrucao1;
    }

    @Field(offset = 159, length = 2)
    public String getInstrucao2() {
        return instrucao2;
    }

    public void setInstrucao2(String instrucao2) {
        this.instrucao2 = instrucao2;
    }

   @Field(offset = 161, length = 13)
    public String getJuros1Dia() {
        return juros1Dia;
    }

    public void setJuros1Dia(String juros1Dia) {
        this.juros1Dia = juros1Dia;
    }

    @Field(offset = 174, length = 6)
    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    @Field(offset = 180, length = 13)
    public String getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Field(offset = 193, length = 13)
    public String getValorIof() {
        return valorIof;
    }

    public void setValorIof(String valorIof) {
        this.valorIof = valorIof;
    }

   @Field(offset = 206, length = 13)
    public String getAbatimento() {
        return abatimento;
    }

    public void setAbatimento(String abatimento) {
        this.abatimento = abatimento;
    }

   @Field(offset = 219, length = 2)
    public String getCodigoInscricao2() {
        return codigoInscricao2;
    }

    public void setCodigoInscricao2(String codigoInscricao2) {
        this.codigoInscricao2 = codigoInscricao2;
    }

   @Field(offset = 221, length = 14)
    public String getNumeroInscricao2() {
        return numeroInscricao2;
    }

    public void setNumeroInscricao2(String numeroInscricao2) {
        this.numeroInscricao2 = numeroInscricao2;
    }

    @Field(offset = 235, length = 30)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Field(offset = 265, length = 10)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

    @Field(offset = 275, length = 40)
    public String getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(String logradouros) {
        this.logradouros = logradouros;
    }

   @Field(offset = 315, length = 12)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

   @Field(offset = 327, length = 8)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

   @Field(offset = 335, length = 15)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Field(offset = 350, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   @Field(offset = 352, length = 30)
    public String getSacadorAvalista() {
        return sacadorAvalista;
    }

    public void setSacadorAvalista(String sacadorAvalista) {
        this.sacadorAvalista = sacadorAvalista;
    }

   @Field(offset = 382, length = 4)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

   @Field(offset = 386, length = 6)
    public String getDataMora() {
        return dataMora;
    }

    public void setDataMora(String dataMora) {
        this.dataMora = dataMora;
    }

   @Field(offset = 392, length = 2)
    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

   @Field(offset = 394, length = 1)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

   @Field(offset = 395, length = 6)
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(String numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroDetalheObrigatorioRemessa{" + "tipoRegistro=" + tipoRegistro + ", codigoInscricao1=" + codigoInscricao1 + ", numeroInscricao1=" + numeroInscricao1 + ", agencia=" + agencia + ", zeros=" + zeros + ", conta=" + conta + ", dac=" + dac + ", brancos1=" + brancos1 + ", instrucaoAlegacao=" + instrucaoAlegacao + ", usoEmpresa=" + usoEmpresa + ", nossoNumero=" + nossoNumero + ", qtdMoeda=" + qtdMoeda + ", numeroCarteira=" + numeroCarteira + ", usoBanco=" + usoBanco + ", carteira=" + carteira + ", codOcorrencia=" + codOcorrencia + ", numDocumento=" + numDocumento + ", vencimento=" + vencimento + ", valorTitulo=" + valorTitulo + ", codigoBanco=" + codigoBanco + ", agenciaCobradora=" + agenciaCobradora + ", especie=" + especie + ", aceite=" + aceite + ", dataEmissao=" + dataEmissao + ", instrucao1=" + instrucao1 + ", instrucao2=" + instrucao2 + ", juros1Dia=" + juros1Dia + ", desconto=" + desconto + ", valorDesconto=" + valorDesconto + ", valorIof=" + valorIof + ", abatimento=" + abatimento + ", codigoInscricao2=" + codigoInscricao2 + ", numeroInscricao2=" + numeroInscricao2 + ", nome=" + nome + ", brancos=" + brancos + ", logradouros=" + logradouros + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", sacadorAvalista=" + sacadorAvalista + ", brancos2=" + brancos2 + ", dataMora=" + dataMora + ", prazo=" + prazo + ", brancos3=" + brancos3 + ", numeroSequencial=" + numeroSequencial +'}';
    }

}
