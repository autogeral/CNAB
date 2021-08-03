/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 * 29.07.21
 */

@Record
public class LineCnabHeaderRegistroTipo1 {
    
    private String codigoRegistro;
    private String branco1;
    private String carteira;
    private String controleParticipante;
    private String branco2;
    private String multa;
    private String valorMulta;
    private String percentualMulta;
    private String dataMulta;
    private String nossoNumero;
    private String branco3;
    private String identificacaoOcorrencia;
    private String numeroDocumento;
    private String dataVencimentoTitulo;
    private String valorTitulo;
    private String dataLimitePagamento;
    private String branco4;
    private String especieTitulo;
    private String codigoIdentificacao;
    private String dataEmissaoTitulo;
    private String branco5;
    private String jurosMora;
    private String valorAtraso;
    private String percentualAtraso;
    private String dataMora;
    private String descontos;
    private String valorDescontos1;
    private String percentualDesconto1;
    private String dataLimiteConcessao;
    private String valorAbtimentoConcessao;
    private String tipoPagador;
    private String inscricaoPagador;
    private String nomePagador;
    private String enderecoPagador;
    private String cepPagador;
    private String sufixoCep;
    private String menssagem1;
    private String sequencialRegistro;
    
    // Uso livre da empresa = 1
    @Field(offset = 1, length = 1)
    public String getStringCodigoRegistro() {
        return codigoRegistro;
    }
    public void setStringCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    
    @Field(offset = 2, length = 19  ) 
    public String getStringbranco1() {
        return branco1;
    }
    public void setStringbranco1(String branco1) {
        this.branco1 = branco1;
    }
    
    // Preencher na sequencia com: carteira (112), agência (0001) e o número da conta corrente PJ (se menor que 10 caracteres, preencher com zeros a esquerda).
    @Field(offset = 21, length = 17)
    public String getStringcarteira() {
        return carteira;
    }
    public void setStringcarteira(String carteira) {
        this.carteira = carteira;
    }
    
    // Uso livre da empresa
    @Field(offset = 38, length = 25)
    public String getStringcontroleParticipante() {
        return controleParticipante;
    }
    public void setStringcontroleParticipante(String controleParticipante) {
        this.controleParticipante = controleParticipante;
    }
    
    @Field(offset = 63, length = 3)
    public String getStringbranco2() {
        return branco2;
    }
    public void setStringbranco2(String branco2) {
        this.branco2 = branco2;
    }
    
    //Se = 0, sem multa; Se = 1, valor fixo de multa ; Se = 2, percentual de multa;
    @Field(offset = 66, length = 1)
    public String getStringmulta() {
        return multa;
    }
    public void setStringmulta(String multa) {
        this.multa = multa;
    }
    
    // Valor da multa, caso 1 no campo 66. Do contrário, preencher com zeros.
    @Field(offset = 67, length = 13)
    public String getStringvalorMulta() {
        return valorMulta;
    }
    public void setStringvalorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }
    
    // Percentual de multa com 2 casas decimais, caso 2 no campo 66. Do contrário, preencher com zeros.
    @Field(offset = 80, length = 4)
    public String getStringpercentualMulta() {
        return percentualMulta;
    }
    public void setStringpercentualMulta(String percentualMulta) {
        this.percentualMulta = percentualMulta;
    }
    
    
    @Field(offset = 84, length = 6)
    public String getStringdataMulta() {
        return dataMulta;
    }
    public void setStringdataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
    }
    
    //será preenchido pelo Inter no arquivo retorno
    @Field(offset = 90, length = 11)
    public String getStringnossoNumero() {
        return nossoNumero;
    }
    public void setStringnossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }
    
  
    @Field(offset = 101, length = 8)
    public String getStringbranco3() {
        return branco3;
    }
    public void setStringBranco3(String branco3) {
        this.branco3 = branco3;
    }
    
    // 01 - Remessa
    @Field(offset = 109, length = 2)
    public String getStringidentificacaoOcorrencia() {
        return identificacaoOcorrencia;
    }
    public void setSStringidentificacaoOcorrencia(String identificacaoOcorrencia) {
        this.identificacaoOcorrencia = identificacaoOcorrencia;
    }
    
    //Retorna o mesmo conteúdo no arquivo de retorno
    @Field(offset = 111, length = 10)
    public String getStringnumeroDocumento() {
        return numeroDocumento;
    }
    public void setStringnumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    @Field(offset =121 , length = 6)
    public String getStringdataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }
    public void setStringdataVencimentoTitulo(String dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }
    
     @Field(offset =127 , length = 13)
    public String getStringvalorTitulo() {
        return valorTitulo;
    }
    public void setStringvalorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }
    
    //Informar "30" ou "60". Esses são os dias decorridos da data de vencimento do título em que ainda será possível o pagamento
    @Field(offset =140 , length = 2)
    public String getStringdataLimitePagamento() {
        return dataLimitePagamento;
    }
    public void setStringdataLimitePagamento(String dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }

    
    @Field(offset =142 , length = 6)
    public String getStringbranco4() {
        return branco4;
    }
    public void setStringbranco4(String branco4) {
        this.branco4 = branco4;
    }
    
    // 99 - Outros
    @Field(offset =148 , length = 2)
    public String getStringespecieTitulo() {
        return especieTitulo;
    }
    public void setStringespecieTitulo(String especieTitulo) {
        this.especieTitulo = especieTitulo;
    }
    
    // Sempre = N
    @Field(offset =150 , length = 1)
    public String getStringcodigoIdentificacao() {
        return codigoIdentificacao;
    }
    public void setStringcodigoIdentificacao(String codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }
    
    //Arquivo retorno informará sempre a data que o boleto foi registrado
    @Field(offset =151 , length = 6)
    public String getStringdataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }
    public void setStringdataEmissaoTitulo(String dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }
    
    @Field(offset =157 , length = 3)
    public String getStringbranco5() {
        return branco5;
    }
    public void setStringbranco5(String branco5) {
        this.branco5 = branco5;
    }
    
    //Se = 0, sem juros/mora Se = 1, valor fixo de juros/mora  Se = 2, percentual de juros/mora
    @Field(offset =160 , length = 1)
    public String getStringjurosMora() {
        return jurosMora;
    }
    public void setStringjurosMora(String jurosMora) {
        this.jurosMora = jurosMora;
    }
    
    //Mora por dia de atraso, se campo "160" é igual a "1" (um). Do contrário, preencher com zeros.
    @Field(offset =161 , length = 13)
    public String getStringvalorAtraso() {
        return valorAtraso;
    }
    public void setStringvalorAtraso(String valorAtraso) {
        this.valorAtraso = valorAtraso;
    }
    
    // Percentual a ser cobrado por atraso, caso campo "160" é igual a "2" (dois). Do contrário, preencher com zeros.
    @Field(offset =174 , length = 4)
    public String getStringpercentualAtraso() {
        return percentualAtraso;
    }
    public void setStringpercentualAtraso(String percentualAtraso) {
        this.percentualAtraso = percentualAtraso;
    }
    
    
    @Field(offset =178 , length = 6)
    public String getStringdataMora() {
        return dataMora;
    }
    public void setStringdataMora(String dataMora) {
        this.dataMora = dataMora;
    }
   
    //Se = 0, título não tem desconto Para códigos de desconto, vide notas - pag 16
   @Field(offset =184 , length = 1)
    public String getStringdescontos() {
        return descontos;
    }
    public void setStringdescontos(String descontos) {
        this.descontos = descontos;
    }
    
    //Se 1, 2 ou 3 no campo 184. Do contrário, preencher com zeros.
    @Field(offset =185 , length = 13)
    public String getStringvalorDescontos1() {
        return valorDescontos1;
    }
    public void setStringvalorDescontos1(String valorDescontos1) {
        this.valorDescontos1 = valorDescontos1;
    }
    
    
    @Field(offset =198 , length = 4)
    public String getStringpercentualDesconto1() {
        return percentualDesconto1;
    }
    public void setStringpercentualDesconto1(String percentualDesconto1) {
        this.percentualDesconto1 = percentualDesconto1;
    }
    
    @Field(offset =202 , length = 6)
    public String getStringdataLimiteConcessao() {
        return dataLimiteConcessao;
    }
    public void setStringdataLimiteConcessao(String dataLimiteConcessao) {
        this.dataLimiteConcessao = dataLimiteConcessao;
    }
    
    //Valor abatimento. Se não houver, preencher com zeros.
    @Field(offset =208 , length = 13)
    public String getStringvalorAbtimentoConcessao() {
        return valorAbtimentoConcessao;
    }
    public void setStringvalorAbtimentoConcessao(String valorAbtimentoConcessao) {
        this.valorAbtimentoConcessao = valorAbtimentoConcessao;
    }
    
    //01 - Pessoa física (CPF)02 - Pessoa jurídica (CNPJ) 
    @Field(offset =221 , length = 2)
    public String getStringtipoPagador() {
        return tipoPagador;
    }
    public void setStringtipoPagador(String tipoPagador) {
        this.tipoPagador = tipoPagador;
    }
    
    // CNPJ ou CPF; Preencher com zeros à esquerda, se necessário
    @Field(offset =223 , length = 14)
    public String getStringinscricaoPagador() {
        return inscricaoPagador;
    }
    public void setStringinscricaoPagador(String inscricaoPagador) {
        this.inscricaoPagador = inscricaoPagador;
    }
    
    @Field(offset =237 , length = 40)
    public String getStringnomePagador() {
        return nomePagador;
    }
    public void setStringnomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }
    
    @Field(offset =277 , length = 40)
    public String getStringenderecoPagador() {
        return enderecoPagador;
    }
    public void setStringenderecoPagador(String enderecoPagador) {
        this.enderecoPagador = enderecoPagador;
    }
        @Field(offset =317 , length = 5)
    public String getStringcepPagador() {
        return cepPagador;
    }
    public void setStringcepPagador(String cepPagador) {
        this.cepPagador = cepPagador;
    }
    
    @Field(offset =322 , length = 3)
    public String getStringsufixoCep() {
        return sufixoCep;
    }
    public void setStringsufixoCep(String sufixoCep) {
        this.sufixoCep = sufixoCep;
    }
    
    @Field(offset =325 , length = 70)
    public String getStringmenssagem1() {
        return menssagem1;
    }
    public void setStringmenssagem1(String menssagem1) {
        this.menssagem1 = menssagem1;
    }
    
     @Field(offset =395 , length = 6)
    public String getStrinsequencialRegistro() {
        return sequencialRegistro;
    }
    public void setStrinsequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", branco1=" + branco1 + ", carteira=" + carteira + ", controleParticipante=" + controleParticipante + ", branco2=" + branco2 + ", multa=" + multa + ", valorMulta=" + valorMulta + ", percentualMulta=" + percentualMulta + ", dataMulta=" + dataMulta + ", nossoNumero=" + nossoNumero + ", branco3=" + branco3 + ", identificacaoOcorrencia=" + identificacaoOcorrencia + ",numeroDocumento=" + numeroDocumento + ",dataVencimentoTitulo= " + dataVencimentoTitulo + ",valorTitulo=" + valorTitulo + ",dataLimitePagamento= " + dataLimitePagamento + ",branco4=" + branco4 + ",especieTitulo=" + especieTitulo + ",codigoIdentificacao=" + codigoIdentificacao + ",dataEmissaoTitulo=" + dataEmissaoTitulo + ",branco5=" + branco5 + ",jurosMora=" + jurosMora + ",valorAtraso=" + valorAtraso + ",percentualAtraso=" + percentualAtraso + ",dataMora=" + dataMora + ",descontos=" + descontos + ",valorDescontos1=" + valorDescontos1 + ",percentualDesconto1=" + percentualDesconto1 + ",dataLimiteConcessao=" + dataLimiteConcessao + ",valorAbtimentoConcessao=" + valorAbtimentoConcessao + ",tipoPagador=" + tipoPagador + ",inscricaoPagador=" + inscricaoPagador + ",nomePagador=" + nomePagador + ",enderecoPagador=" + enderecoPagador + ",cepPagador=" + cepPagador + ",sufixoCep=" + sufixoCep + ",menssagem1=" + menssagem1 + ",sequencialRegistro=" + sequencialRegistro + "}";
    }
}
