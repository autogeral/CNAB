/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;

/**
 *
 * @author larissa.camargo
 */
public class Cnab400InterLoteRetorno {

   //LineCnabRegistroHeaderRetorno
    private String codigoRegistro;
    private String codigoRetorno;
    private String literalRetorno;
    private String codigoServico;
    private String literalServico;
    private String branco1;
    private String nomeEmpresa;
    private String codigoBanco;
    private String nomeBanco;
    private Integer dataGravacao;
    private String branco2;
    private String sequencialRegistro;
    
    // LineCnabRetornoRegistroTipo1
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
   
     
   //LineCnabRetornoRegistroTrailer
   private String codigoRegistroTrailer;
   private String codigoRetornoTrailer;
   private String tipoRegisro;
   private String codigoBancoTrailer;
   private String brancoTrailer;
   private String qtdRegistros1;
   private String brancoTrailer2;
   private String qtdRegistros2;
   private String valorRegistros1;
   private String brancoTrailer3;
   private String qtdRegistros3;
   private String brancoTrailer4;
   private String qtdRegistros4;
   private String valorRegistros2;
   private String brancoTrailer5;
   private String sequencialRegistroTrailer;
    
    //LineCnabRegistroHeaderRetorno
    @Field(offset = 1, length = 1)
    public String getIntegerCodigoRegistro() {
        return codigoRegistro;
    }
    public void setStringCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    @Field(offset = 2, length = 1)
    public String getIntegercodigoRetorno() {
        return codigoRetorno;
    }
    public void setStringcodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    @Field(offset = 3, length = 7)
    public String getStringliteralRetorno() {
        return literalRetorno;
    }
    public void setStringliteralRetorno(String literalRetorno) {
        this.literalRetorno = literalRetorno;
    }

    @Field(offset = 10, length = 2)
    public String getStringCodigoServico() {
        return codigoServico;
    }
    public void setStringCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }
    
    @Field(offset = 12, length = 15)
    public String getStringLiteralServico() {
        return literalServico;
    }
    public void setStringLiteralServico(String literalServico) {
        this.literalServico = literalServico;
    }
    
    @Field(offset = 27, length = 20)
    public String getBranco1() {
        return branco1;
    }
    public void setBranco1(String branco1) {
        this.branco1 = branco1;
    }
    
    @Field(offset = 47, length = 30)
    public String getStringNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setStringNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Field(offset = 77, length = 3)
    public String getStringCodigoBanco() {
        return codigoBanco;
    }
    public void setStringCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
    
    @Field(offset = 80, length = 15)
    public String getStringNomeBanco() {
        return nomeBanco;
    }
    public void setStringNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    @Field(offset = 95, length = 6)
    public Integer getIntegerDataGravacao() {
        return dataGravacao;
    }
    public void setIntegerDataGravacao(Integer dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    @Field(offset = 101, length = 294)
    public String getStringBranco2() {
        return branco2;
    }
    public void setStringBranco2(String branco2) {
        this.branco2 = branco2;
    }
    @Field(offset =395 , length = 6)
    public String getStringSequencialRegistro() {
        return sequencialRegistro;
    }
    public void setStringSequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    } 
    
    
    // LineCnabRetornoRegistroTipo1
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

    // Identificação de registro = 1
    @Field(offset = 1, length = 1)
    public String getStringcodigoRegistro() {
        return codigoRegistro;
    }
    public void setStringcodigoRegistro(String codigoRegistro) {
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
    
    
    //LineCnabRetornoRegistroTrailer
    @Field(offset = 1, length = 1)
    public String getCodigoRegistroTrailer() {
        return codigoRegistroTrailer;
    }
    public void setCodigoRegistroTrailer(String codigoRegistroTrailer) {
        this.codigoRegistroTrailer = codigoRegistroTrailer;
    }

    // Identificação do retorno = 2
    @Field(offset = 2, length = 1)
    public String getCodigoRetornoTrailer() {
        return codigoRetornoTrailer;
    }
    public void setCodigoRetornoTrailer(String codigoRetornoTrailer) {
        this.codigoRetornoTrailer = codigoRetornoTrailer;
    }

    // Identificação do tipo de registro = 01
    @Field(offset = 3, length = 2)
    public String getStringtipoRegisro() {
        return tipoRegisro;
    }
    public void setStringtipoRegisro(String tipoRegisro) {
        this.tipoRegisro = tipoRegisro;
    }

    // Código banco = 077
    @Field(offset = 5, length = 3)
    public String getCodigoBancoTrailer() {
        return codigoBancoTrailer;
    }
    public void setCodigoBancoTrailer(String codigoBancoTrailer) {
        this.codigoBancoTrailer = codigoBancoTrailer;
    }
    
    //Identificação da empresa beneficiária no Inter = Carteira (112), Agência (0001) e Conta corrente 
    @Field(offset = 8, length = 10)
    public String getBrancoTrailer() {
        return brancoTrailer;
    }
    public void setBrancoTrailer(String brancoTrailer) {
        this.brancoTrailer = brancoTrailer;
    }
    
    //Nº Controle de participante=  Uso da empresa
    @Field(offset = 18, length = 8)
    public String getStringqtdRegistros1() {
        return qtdRegistros1;
    }
    public void setStringqtdRegistros1(String qtdRegistros1) {
        this.qtdRegistros1 = qtdRegistros1;
    }
    
    // Zeros
    @Field(offset = 26, length = 32)
    public String getBrancoTrailer2() {
        return brancoTrailer2;
    }
    public void setBrancoTrailer2(String brancoTrailer2) {
        this.brancoTrailer2 = brancoTrailer2;
    }
    
    //Identificação do título no banco= ("Nosso número")
    @Field(offset = 58, length = 5)
    public String getStringqtdRegistros2() {
        return qtdRegistros2;
    }
    public void setStringqtdRegistros2(String qtdRegistros2) {
        this.qtdRegistros2 = qtdRegistros2;
    }
    
    // Branco
    @Field(offset = 63, length = 12)
    public String getStringvalorRegistros1() {
        return valorRegistros1;
    }
    public void setStringvalorRegistros1(String valorRegistros1) {
        this.valorRegistros1 = valorRegistros1;
    }

    // Carteira = 112
    @Field(offset = 75, length = 12)
    public String getBrancoTrailer3() {
        return brancoTrailer3;
    }
    public void setBrancoTrailer3(String brancoTrailer3) {
        this.brancoTrailer3 = brancoTrailer3;
    }

    //Identificação de ocorrência = 02. Entrada confirmada (verificar motivo na posição XXX a XXX)
    //03. Entrada rejeitada (verificar motivo na posição XXX a XXX)
    // 04. Liquidação normal (sem motivo)
    @Field(offset = 87, length = 5)
    public String getStringqtdRegistros3() {
        return qtdRegistros3;
    }
    public void setStringqtdRegistros3(String qtdRegistros3) {
        this.qtdRegistros3 = qtdRegistros3;
    }
    
    //Data ocorrência no banco = DDMMAA
    @Field(offset =92 , length = 24)
    public String getBrancoTrailer4() {
        return brancoTrailer4;
    }
    public void setBrancoTrailer4(String brancoTrailer4) {
        this.brancoTrailer4 = brancoTrailer4;
    }
    
    // Nº do Documento = Seu número
   @Field(offset =116 , length = 5)
    public String getStringqtdRegistros4() {
        return qtdRegistros4;
    }
    public void setStringqtdRegistros4(String qtdRegistros4) {
        this.qtdRegistros4 = qtdRegistros4;
    }
     
    // Identificação do título no Inter = Nº banco (nosso número)
    @Field(offset =121 , length = 12)
    public String getStringvalorRegistros2() {
        return valorRegistros2;
    }
    public void setStringvalorRegistros2(String valorRegistros2) {
        this.valorRegistros2 = valorRegistros2;
    }  
    // Branco
    @Field(offset =133 , length = 262)
    public String getBrancoTrailer5() {
        return brancoTrailer5;
    }
    public void setBrancoTrailer5(String brancoTrailer5) {
        this.brancoTrailer5 = brancoTrailer5;
    }
    
    // Nº Sequencial registro
    @Field(offset =395 , length = 6)
    public String getSequencialRegistroTrailer() {
        return sequencialRegistroTrailer;
    }
    public void setSequencialRegistroTrailer(String sequencialRegistroTrailer) {
        this.sequencialRegistroTrailer = sequencialRegistroTrailer;
    }
   
   
    
    
     @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", codigoRetorno=" + codigoRetorno + ", literalRetorno=" + literalRetorno + ", codigoServico=" + codigoServico + ", literalServico=" + literalServico + ", branco1=" + branco1 + ", nomeEmpresa=" + nomeEmpresa + ", codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", dataGravacao=" + dataGravacao + ", branco2=" + branco2 + ",sequencialRegistro= " + sequencialRegistro + ", codigoRegistroTipo=" + codigoRegistroTipo + ", tipoInscricao=" + tipoInscricao + ", numeroInscricao=" + numeroInscricao + ", zeros1=" + zeros1 + ", identificacaoEmpresa=" + identificacaoEmpresa + ", controleParticipante=" + controleParticipante + ", zeros2=" + zeros2 + ", nossoNumero1=" + nossoNumero1 + ", brancoTipo1=" + brancoTipo1 + ", carteira=" + carteira + ", identificacaoOcorrencia=" + identificacaoOcorrencia + ",dataOcorrencia= " + dataOcorrencia + ",seuNumero= " + seuNumero + ",nossoNumero2= " + nossoNumero2 + ",dataVencimentoTitulo= " + dataVencimentoTitulo + ",valorTitulo= " + valorTitulo + ",agenciaCobradora= " + agenciaCobradora + ",especieTitulo= " + especieTitulo + ",especieTitulo= " + especieTitulo + ",brancoTipo2= " + brancoTipo2 +", valorPago= " + valorPago + ", dataCredito= " + dataCredito +", branco3= " + branco3 + ",nomePagador= " +nomePagador + ", branco4= " + branco4 +", inscricaoPagador= " + inscricaoPagador + ", motivoOcorrencia= " + motivoOcorrencia + ", branco5= " + branco5 +", sequencialRegistroTipo= " + sequencialRegistroTipo + ", codigoRegistro=" + codigoRegistroTrailer + ", codigoRetornoTrailer=" + codigoRetornoTrailer + ", tipoRegisro=" + tipoRegisro + ", codigoBancoTrailer=" + codigoBancoTrailer + ", brancoTrailer=" + brancoTrailer + ", qtdRegistros1=" + qtdRegistros1 + ", brancoTrailer2=" + brancoTrailer2 + ", qtdRegistros2=" + qtdRegistros2 + ", valorRegistros1=" + valorRegistros1 + ", brancoTrailer3=" + brancoTrailer3 + ", qtdRegistros3=" + qtdRegistros3 + ",brancoTrailer4= " + brancoTrailer4 + ",qtdRegistros4= " + qtdRegistros4 + ",valorRegistros2= " + valorRegistros2 + ",brancoTrailer5= " + brancoTrailer5 + ",sequencialRegistroTrailer= " + sequencialRegistroTrailer + "}";
    }  
}
