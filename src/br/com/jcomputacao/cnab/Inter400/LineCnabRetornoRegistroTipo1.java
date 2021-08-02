/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.Inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
/**
 *
 * @author larissa.camargo
 *     02.08.21
 */
@Record
public class LineCnabRetornoRegistroTipo1 {
    private String codigoRegistro;
    private String tipoInscricao;
    private String numeroInscricao;
    private String zeros1;
    private String identificacaoEmpresa;
    private String controleParticipante;
    private String zeros2;
    private String nossoNumero1;
    private String branco1;
    private String carteira;
    private String identificacaoOcorrencia;
    private String dataOcorrencia;
    private String seuNumero;
    private String nossoNumero2;
    private String dataVencimentoTitulo;
    private String valorTitulo;
    private String bancoCobrador;
    private String agenciaCobradora;
    private String especieTitulo;
    private String branco2;
    private String valorPago;
    private String dataCredito;
    private String branco3;
    private String nomePagador;
    private String branco4;
    private String inscricaoPagador;
    private String motivoOcorrencia;
    private String branco5;
    private String sequencialRegistro;
   
    
    // Identificação de registro = 1
    @Field(offset = 1, length = 1)
    public String getStringCodigoRegistro() {
        return codigoRegistro;
    }
    public void setStringCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    // Tipo de inscrição da empresa = 1 Pessoa física (CPF) e 02 Pessoa jurídica (CNPJ) 
    @Field(offset = 2, length = 2)
    public String getStringtipoInscricao() {
        return tipoInscricao;
    }
    public void setStringtipoInscricao(String tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    // Nº Inscrição da empresa = CNPJ ou CPF 
    @Field(offset = 4, length = 14)
    public String getStringnumeroInscricao() {
        return numeroInscricao;
    }
    public void setStringnumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    // Zeros
    @Field(offset = 18, length = 3)
    public String getStringzeros1() {
        return zeros1;
    }
    public void setStringzeros1(String zeros1) {
        this.zeros1 = zeros1;
    }
    
    //Identificação da empresa beneficiária no Inter = Carteira (112), Agência (0001) e Conta corrente 
    @Field(offset = 21, length = 17)
    public String getStringidentificacaoEmpresa() {
        return identificacaoEmpresa;
    }
    public void setStringidentificacaoEmpresa(String identificacaoEmpresa) {
        this.identificacaoEmpresa = identificacaoEmpresa;
    }
    
    //Nº Controle de participante=  Uso da empresa
    @Field(offset = 38, length = 25)
    public String getStringcontroleParticipante() {
        return controleParticipante;
    }
    public void setStringcontroleParticipante(String controleParticipante) {
        this.controleParticipante = controleParticipante;
    }
    
    // Zeros
    @Field(offset = 63, length = 8)
    public String getStringzeros2() {
        return zeros2;
    }
    public void setStringzeros2(String zeros2) {
        this.zeros2 = zeros2;
    }
    
    //Identificação do título no banco= ("Nosso número")
    @Field(offset = 71, length = 11)
    public String getStringnossoNumero1() {
        return nossoNumero1;
    }
    public void setStringnossoNumero1(String nossoNumero1) {
        this.nossoNumero1 = nossoNumero1;
    }
    
    // Branco
    @Field(offset = 82, length = 5)
    public String getStringbranco1() {
        return branco1;
    }
    public void setStringbranco1(String branco1) {
        this.branco1 = branco1;
    }

    // Carteira = 112
    @Field(offset = 87, length = 3)
    public String getStringcarteira() {
        return carteira;
    }
    public void setStringcarteira(String carteira) {
        this.carteira = carteira;
    }

    //Identificação de ocorrência = 02. Entrada confirmada (verificar motivo na posição XXX a XXX)
    //03. Entrada rejeitada (verificar motivo na posição XXX a XXX)
    // 04. Liquidação normal (sem motivo)
    @Field(offset = 90, length = 2)
    public String getStringidentificacaoOcorrencia() {
        return identificacaoOcorrencia;
    }
    public void setStringidentificacaoOcorrencia(String identificacaoOcorrencia) {
        this.identificacaoOcorrencia = identificacaoOcorrencia;
    }
    
    //Data ocorrência no banco = DDMMAA
    @Field(offset =92 , length = 6)
    public String getStringdataOcorrencia() {
        return dataOcorrencia;
    }
    public void setStringdataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
    
    // Nº do Documento = Seu número
   @Field(offset =98 , length = 10)
    public String getStringseuNumero() {
        return seuNumero;
    }
    public void setStringseuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }
     
    // Identificação do título no Inter = Nº banco (nosso número)
    @Field(offset =108 , length = 11)
    public String getStringnossoNumero2() {
        return nossoNumero2;
    }
    public void setStringnossoNumero2(String nossoNumero2) {
        this.nossoNumero2 = nossoNumero2;
    }
    
    // Data vencimento do titulo= DDMMAA
    @Field(offset =119 , length = 6)
    public String getStringdataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }
    public void setStringdataVencimentoTitulo(String dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }
    
    // Valor do titulo = R$ XXX,XXX
    @Field(offset =125 , length = 13)
    public String getStringvalorTitulo() {
        return valorTitulo;
    }
    public void setStringvalorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }
    
    // Banco cobrador = 077
    @Field(offset =138 , length = 3)
    public String getStringbancoCobrador() {
        return bancoCobrador;
    }
    public void setStringbancoCobrador(String bancoCobrador) {
        this.bancoCobrador = bancoCobrador;
    }
    
    // Agencia cobradora = 0001
    @Field(offset =141 , length = 4)
    public String getStringagenciaCobradora() {
        return agenciaCobradora;
    }
    public void setStringagenciaCobradora(String agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
    }
    
    // Especie do titulo = 99- Outros
    @Field(offset =145 , length = 2)
    public String getStringespecieTitulo() {
        return especieTitulo;
    }
    public void setStringespecieTitulo(String especieTitulo) {
        this.especieTitulo = especieTitulo;
    }
    
    // Branco
    @Field(offset =147 , length = 13)
    public String getStringbranco2() {
        return branco2;
    }
    public void setStringbranco2(String branco2) {
        this.branco2 = branco2;
    }
    
    // Valor pago 
    @Field(offset =160 , length = 13)
    public String getStringvalorPago() {
        return valorPago;
    }
    public void setStringvalorPago(String valorPago) {
        this.valorPago = valorPago;
    }  
    
    // Data do crédito = DDMMAA
    @Field(offset =173 , length = 6)
    public String getStringdataCredito() {
        return dataCredito;
    }
    public void setStringdataCredito(String dataCredito) {
        this.dataCredito = dataCredito;
    } 
    
    // Branco
   @Field(offset =179 , length = 3)
    public String getStringbranco3() {
        return branco3;
    }
    public void setStringbranco3(String branco3) {
        this.branco3 = branco3;
    }
    
    // Nome do pagador = 
    @Field(offset =182 , length = 40)
    public String getStringnomePagador() {
        return nomePagador;
    }
    public void setStringnomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }
    
    // Branco 
    @Field(offset =222 , length = 5)
    public String getStringbranco4() {
        return branco4;
    }
    public void setStringbranco4(String branco4) {
        this.branco4 = branco4;
    }
    
    // N] inscrição do pagador = CNPJ ou CPF
   @Field(offset =227 , length = 14)
    public String getStringinscricaoPagador() {
        return inscricaoPagador;
    }
    public void setStringinscricaoPagador(String inscricaoPagador) {
        this.inscricaoPagador = inscricaoPagador;
    }
   
    //Motivos das rejeições para o código de ocorrência 03 da posição 090 a 091 = Motivo para ocorrência 03- Entrada rejeitada
   @Field(offset =241 , length = 140)
    public String getStringmotivoOcorrencia() {
        return motivoOcorrencia;
    }
    public void setStringmotivoOcorrencia(String motivoOcorrencia) {
        this.motivoOcorrencia = motivoOcorrencia;
    }
    
    // Branco
    @Field(offset =381 , length = 14)
    public String getStringbranco5() {
        return branco5;
    }
    public void setStringbranco5(String branco5) {
        this.branco5 = branco5;
    }
    
    // Nº Sequencial registro
    @Field(offset =395 , length = 6)
    public String getStringsequencialRegistro() {
        return sequencialRegistro;
    }
    public void setStringsequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", tipoInscricao=" + tipoInscricao + ", numeroInscricao=" + numeroInscricao + ", zeros1=" + zeros1 + ", identificacaoEmpresa=" + identificacaoEmpresa + ", controleParticipante=" + controleParticipante + ", zeros2=" + zeros2 + ", nossoNumero1=" + nossoNumero1 + ", branco1=" + branco1 + ", carteira=" + carteira + ", identificacaoOcorrencia=" + identificacaoOcorrencia + ",dataOcorrencia= " + dataOcorrencia + ",seuNumero= " + seuNumero + ",nossoNumero2= " + nossoNumero2 + ",dataVencimentoTitulo= " + dataVencimentoTitulo + ",valorTitulo= " + valorTitulo + ",agenciaCobradora= " + agenciaCobradora + ",especieTitulo= " + especieTitulo + ",especieTitulo= " + especieTitulo + ",branco2= " + branco2 +", valorPago= " + valorPago + ", dataCredito= " + dataCredito +", branco3= " + branco3 + ",nomePagador= " +nomePagador + ", branco4= " + branco4 +", inscricaoPagador= " + inscricaoPagador + ", motivoOcorrencia= " + motivoOcorrencia + ", branco5= " + branco5 +", sequencialRegistro= " + sequencialRegistro + "}";
    }
}
