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
 *     02.08.21
 */
@Record
public class LineCnabRetornoRegistroTipo1 {
    private String codigoRegistroTipo;
    private String tipoInscricao;
    private String numeroInscricao;
    private String zeros1;
    private String identificacaoEmpresa;
    private String controleParticipante;
    private String zeros2;
    private String nossoNumero1;
    private String brancoTipo1;
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
    private String brancoTipo2;
    private String valorPago;
    private String dataCredito;
    private String branco3;
    private String nomePagador;
    private String branco4;
    private String inscricaoPagador;
    private String motivoOcorrencia;
    private String branco5;
    private String sequencialRegistroTipo;
   
    
    // Identificação de registro = 1
    @Field(offset = 1, length = 1)
    public String getCodigoRegistroTipo() {
        return codigoRegistroTipo;
    }
    public void setCodigoRegistroTipo(String codigoRegistroTipo) {
        this.codigoRegistroTipo = codigoRegistroTipo;
    }

    // Tipo de inscrição da empresa = 1 Pessoa física (CPF) e 02 Pessoa jurídica (CNPJ) 
    @Field(offset = 2, length = 2)
    public String getTipoInscricao() {
        return tipoInscricao;
    }
    public void setTiipoInscricao(String tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    // Nº Inscrição da empresa = CNPJ ou CPF 
    @Field(offset = 4, length = 14)
    public String getNumeroInscricao() {
        return numeroInscricao;
    }
    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    // Zeros
    @Field(offset = 18, length = 3)
    public String getZeros1() {
        return zeros1;
    }
    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }
    
    //Identificação da empresa beneficiária no Inter = Carteira (112), Agência (0001) e Conta corrente 
    @Field(offset = 21, length = 17)
    public String getIdentificacaoEmpresa() {
        return identificacaoEmpresa;
    }
    public void setIdentificacaoEmpresa(String identificacaoEmpresa) {
        this.identificacaoEmpresa = identificacaoEmpresa;
    }
    
    //Nº Controle de participante=  Uso da empresa
    @Field(offset = 38, length = 25)
    public String getControleParticipante() {
        return controleParticipante;
    }
    public void setControleParticipante(String controleParticipante) {
        this.controleParticipante = controleParticipante;
    }
    
    // Zeros
    @Field(offset = 63, length = 8)
    public String getZeros2() {
        return zeros2;
    }
    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }
    
    //Identificação do título no banco= ("Nosso número")
    @Field(offset = 71, length = 11)
    public String getNossoNumero1() {
        return nossoNumero1;
    }
    public void setNossoNumero1(String nossoNumero1) {
        this.nossoNumero1 = nossoNumero1;
    }
    
    // Branco
    @Field(offset = 82, length = 5)
    public String getBrancoTipo1() {
        return brancoTipo1;
    }
    public void setBrancoTipo1(String brancoTipo1) {
        this.brancoTipo1 = brancoTipo1;
    }

    // Carteira = 112
    @Field(offset = 87, length = 3)
    public String getCarteira() {
        return carteira;
    }
    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    //Identificação de ocorrência = 02. Entrada confirmada (verificar motivo na posição XXX a XXX)
    //03. Entrada rejeitada (verificar motivo na posição XXX a XXX)
    // 04. Liquidação normal (sem motivo)
    @Field(offset = 90, length = 2)
    public String getIdentificacaoOcorrencia() {
        return identificacaoOcorrencia;
    }
    public void setIdentificacaoOcorrencia(String identificacaoOcorrencia) {
        this.identificacaoOcorrencia = identificacaoOcorrencia;
    }
    
    //Data ocorrência no banco = DDMMAA
    @Field(offset =92 , length = 6)
    public String getDataOcorrencia() {
        return dataOcorrencia;
    }
    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
    
    // Nº do Documento = Seu número
   @Field(offset =98 , length = 10)
    public String getSeuNumero() {
        return seuNumero;
    }
    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }
     
    // Identificação do título no Inter = Nº banco (nosso número)
    @Field(offset =108 , length = 11)
    public String getNossoNumero2() {
        return nossoNumero2;
    }
    public void setNossoNumero2(String nossoNumero2) {
        this.nossoNumero2 = nossoNumero2;
    }
    
    // Data vencimento do titulo= DDMMAA
    @Field(offset =119 , length = 6)
    public String getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }
    public void setDataVencimentoTitulo(String dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }
    
    // Valor do titulo = R$ XXX,XXX
    @Field(offset =125 , length = 13)
    public String getValorTitulo() {
        return valorTitulo;
    }
    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }
    
    // Banco cobrador = 077
    @Field(offset =138 , length = 3)
    public String getBancoCobrador() {
        return bancoCobrador;
    }
    public void setBancoCobrador(String bancoCobrador) {
        this.bancoCobrador = bancoCobrador;
    }
    
    // Agencia cobradora = 0001
    @Field(offset =141 , length = 4)
    public String getAgenciaCobradora() {
        return agenciaCobradora;
    }
    public void setAgenciaCobradora(String agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
    }
    
    // Especie do titulo = 99- Outros
    @Field(offset =145 , length = 2)
    public String getEspecieTitulo() {
        return especieTitulo;
    }
    public void setEspecieTitulo(String especieTitulo) {
        this.especieTitulo = especieTitulo;
    }
    
    // Branco
    @Field(offset =147 , length = 13)
    public String getBrancoTipo2() {
        return brancoTipo2;
    }
    public void setBrancoTipo2(String brancoTipo2) {
        this.brancoTipo2 = brancoTipo2;
    }
    
    // Valor pago 
    @Field(offset =160 , length = 13)
    public String getValorPago() {
        return valorPago;
    }
    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }  
    
    // Data do crédito = DDMMAA
    @Field(offset =173 , length = 6)
    public String getDataCredito() {
        return dataCredito;
    }
    public void setDataCredito(String dataCredito) {
        this.dataCredito = dataCredito;
    } 
    
    // Branco
   @Field(offset =179 , length = 3)
    public String getBranco3() {
        return branco3;
    }
    public void setBranco3(String branco3) {
        this.branco3 = branco3;
    }
    
    // Nome do pagador = 
    @Field(offset =182 , length = 40)
    public String getNomePagador() {
        return nomePagador;
    }
    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }
    
    // Branco 
    @Field(offset =222 , length = 5)
    public String getBranco4() {
        return branco4;
    }
    public void setBranco4(String branco4) {
        this.branco4 = branco4;
    }
    
    // N] inscrição do pagador = CNPJ ou CPF
   @Field(offset =227 , length = 14)
    public String getInscricaoPagador() {
        return inscricaoPagador;
    }
    public void setInscricaoPagador(String inscricaoPagador) {
        this.inscricaoPagador = inscricaoPagador;
    }
   
    //Motivos das rejeições para o código de ocorrência 03 da posição 090 a 091 = Motivo para ocorrência 03- Entrada rejeitada
   @Field(offset =241 , length = 140)
    public String getMotivoOcorrencia() {
        return motivoOcorrencia;
    }
    public void setMotivoOcorrencia(String motivoOcorrencia) {
        this.motivoOcorrencia = motivoOcorrencia;
    }
    
    // Branco
    @Field(offset =381 , length = 14)
    public String getBranco5() {
        return branco5;
    }
    public void setBranco5(String branco5) {
        this.branco5 = branco5;
    }
    
    // Nº Sequencial registro
    @Field(offset =395 , length = 6)
    public String getSequencialRegistroTipo() {
        return sequencialRegistroTipo;
    }
    public void setSequencialRegistroTipo(String sequencialRegistroTipo) {
        this.sequencialRegistroTipo = sequencialRegistroTipo;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistroTipo=" + codigoRegistroTipo + ", tipoInscricao=" + tipoInscricao + ", numeroInscricao=" + numeroInscricao + ", zeros1=" + zeros1 + ", identificacaoEmpresa=" + identificacaoEmpresa + ", controleParticipante=" + controleParticipante + ", zeros2=" + zeros2 + ", nossoNumero1=" + nossoNumero1 + ", brancoTipo1=" + brancoTipo1 + ", carteira=" + carteira + ", identificacaoOcorrencia=" + identificacaoOcorrencia + ",dataOcorrencia= " + dataOcorrencia + ",seuNumero= " + seuNumero + ",nossoNumero2= " + nossoNumero2 + ",dataVencimentoTitulo= " + dataVencimentoTitulo + ",valorTitulo= " + valorTitulo + ",agenciaCobradora= " + agenciaCobradora + ",especieTitulo= " + especieTitulo + ",especieTitulo= " + especieTitulo + ",brancoTipo2= " + brancoTipo2 +", valorPago= " + valorPago + ", dataCredito= " + dataCredito +", branco3= " + branco3 + ",nomePagador= " +nomePagador + ", branco4= " + branco4 +", inscricaoPagador= " + inscricaoPagador + ", motivoOcorrencia= " + motivoOcorrencia + ", branco5= " + branco5 +", sequencialRegistroTipo= " + sequencialRegistroTipo + "}";
    }
}
