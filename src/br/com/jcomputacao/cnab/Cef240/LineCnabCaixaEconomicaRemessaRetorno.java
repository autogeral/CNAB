package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;

/**
 * 05/08/2014 15:52:32
 *
 * @author Thiago Balthazar
 */
public class LineCnabCaixaEconomicaRemessaRetorno {

    public void trataHeaderArquivoRemessa(LineCnabCaixaEconomicaCnabHeaderTraillerArquivo arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaHeaderArquivo();
        model = la.createModel();

        model.setRepresentation(linha);

        int codBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.CODIGO_BANCO));
        arquivo240.setCodigoBanco(codBanco);

        int loteServico = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.LOTE_SERVICO));
        arquivo240.setLoteServico(loteServico);

        int tipoRegistro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.TIPO_REGISTRO));
        arquivo240.setTipoServico(tipoRegistro);

        String RESERVADO_USO_BANCO = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.RESERVADO_USO_BANCO));
        arquivo240.setRESERVADO_USO_BANCO(RESERVADO_USO_BANCO);

        String numeroInscricaoEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NUMERO_INSCRICAO);
        arquivo240.setNumeroInscriçãoEmpresa(Integer.parseInt(numeroInscricaoEmpresa));

        int usoExclusivoCaixa = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_CAIXA));
        arquivo240.setUsoExclusivoCAIXA(usoExclusivoCaixa);

        int agenciaMantenedoraConta = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.AGENCIA_MANTENEDORA_AG_DIG));
        arquivo240.setAgenciaMantenedoraConta(agenciaMantenedoraConta);

        int AGENCIA_MANTENEDORA_DIG = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.AGENCIA_MANTENEDORA_DIG));
        arquivo240.setAgenciaMantenedoraConta(AGENCIA_MANTENEDORA_DIG);

        int codigo_ConvenioBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.CODIGO_CONVENIO_BANCO));
        arquivo240.setCodigoConvenioBanco(codigo_ConvenioBanco);

        int UsoExclusivoCAIXA2 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUsoExclusivoCAIXA2(UsoExclusivoCAIXA2);

        int UsoExclusivoCAIXA3 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_CAIXA3));
        arquivo240.setUsoExclusivoCAIXA3(UsoExclusivoCAIXA3);

        String Nome_Empresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NOME_EMPRESA);
        arquivo240.setNomeEmpresa(Nome_Empresa);

        String Nome_Bamco = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NOME_BANCO);
        arquivo240.setNOME_BANCO(Nome_Bamco);

        String USO_FEBRABAN = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_FEBRABAN);
        arquivo240.setUsoExclusivoFEBRABANCNAB(USO_FEBRABAN);

        int Codigo_Remessa_Retorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.CODIGO_REMESSA_RETORNO));
        arquivo240.setCodigoRemessaRetorno(Codigo_Remessa_Retorno);

        int DataGeraçãoArquivo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.DATA_GERACAO_ARQUIVO));
        arquivo240.setDataGeracaoArquivo(DataGeraçãoArquivo);

        int HoraGeraçãoArquivo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.HORA_GERACAO_ARQUIVO));
        arquivo240.setHoraGeracaoArquivo(HoraGeraçãoArquivo);

        int numeroSequencialArquivo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NUMERO_SEQUENCIAL_ARQUIVO));
        arquivo240.setNumeroSequencialArquivo(numeroSequencialArquivo);

        int NumeroVersaoLayoutArquivo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NUMERO_VERSAO_ARQUIVO));
        arquivo240.setNumeroVersaoaLayoutArquivo(NumeroVersaoLayoutArquivo);

        int DensidadeGravaçãoArquivo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.DENSIDADE_GRAVACAO_ARQUIVO));
        arquivo240.setDensiadadeGravacaiArquivo(DensidadeGravaçãoArquivo);

        String ParaUsoReservadoBanco = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_RESERVADO_BANCO);
        arquivo240.setParaUsoReservadoBanco(ParaUsoReservadoBanco);

        String ParaUsoReservadoEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_RESERVADO_EMPRESA);
        arquivo240.setParaUsoReservadoEmpresa(ParaUsoReservadoEmpresa);

        String versaoAplicativoCAIXA = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.VERSAO_APLICATIVO);
        arquivo240.setVersaoAplicativoCaixa(versaoAplicativoCAIXA);

        String usoExclusivoFebrabanCNAB3 = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_FEBRABAN3);
        arquivo240.setUsoExclusivoFEBRABANCNAB3(usoExclusivoFebrabanCNAB3);
    }

    public void trataTrailerArquivoRemessa(LineCnabCaixaEconomicaCnabHeaderTraillerArquivo arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaTrailerArquivo();
        model = la.createModel();

        model.setRepresentation(linha);

        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.CODIGO_BANCO));
        arquivo240.setCodigoBanco(CodigoBancoCompensacao);

        int loteServico = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.LOTE_SERVICO));
        arquivo240.setLoteServico(loteServico);

        int tipoRegistro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.TIPO_REGISTRO));
        arquivo240.setTipoServico(tipoRegistro);

        String RESERVADO_USO_BANCO = (model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setRESERVADO_USO_BANCO(RESERVADO_USO_BANCO);

        int quantidadeLotes = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.QUANTIDE_LOTES_ARQUIVO));
        arquivo240.setTipoServico(quantidadeLotes);

        int QuantidadeRegistros = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.QUANTIDE_REGISTROS_ARQUIVO));
        arquivo240.setTipoServico(quantidadeLotes);

        String usoEsclusivoFebraban = model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.USO_EXCLUSIVO_FEBRABAN1);
        arquivo240.setUsoExclusivoFEBRABANCNAB2(usoEsclusivoFebraban);

        String usoEsclusivoFebraban2 = model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.USO_EXCLUSIVO_FEBRABAN2);
        arquivo240.setUsoExclusivoFEBRABANCNAB2(usoEsclusivoFebraban2);

        String usoEsclusivoFebraban3 = model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.USO_EXCLUSIVO_FEBRABAN3);
        arquivo240.setUsoExclusivoFEBRABANCNAB3(usoEsclusivoFebraban3);

    }

    public void trataRegistroHeaderLote(LineCnabCaixaEconomicaRetornoHeaderLote arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaHeaderLote();
        model = la.createModel();

        model.setRepresentation(linha);

        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.CODIGO_BANCO));
        arquivo240.setCodigoBancoCompensação(CodigoBancoCompensacao);

        int lote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.LOTE_SERVICO));
        arquivo240.setLOTE_SERVICO(lote);

        int registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        String operacao = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.TIPO_OPERACAO));
        arquivo240.setTIPO_OPERACAO(operacao);

        int servico = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.TIPO_SERVICO));
        arquivo240.setTIPO_SERVICO(servico);

        int usoExclusivoCnab1 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(usoExclusivoCnab1);

        int N_VersaoLayaout = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.NUMERO_VERSAO_LOTE));
        arquivo240.setNUMERO_VERSAO_LOTE(N_VersaoLayaout);

        String usoExclusivoCnab2 = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_FEBRABAN2);
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(operacao);

        int tipoIncricaoEmpresa = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.TIPO_INSCRICAO_EMPRESA));
        arquivo240.setTIPO_INSCRICAO_EMPRESA(tipoIncricaoEmpresa);

        int numeroInscricaoEmpresa = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.NUMERO_INSCRICAO_EMPRESA));
        arquivo240.setNUMERO_INSCRICAO_EMPRESA(numeroInscricaoEmpresa);

        int codigoCedenteBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.CODIGO_CEDENTE_BANCO));
        arquivo240.setCODIGO_CEDENTE_BANCO(codigoCedenteBanco);

        int usoExclusivoCaixa1 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_CAIXA1));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa1);

        int agenciaMantenedoraConta = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.AGENCIA_MANTENEDORA_CONTA));
        arquivo240.setAGENCIA_MANTENEDORA_CONTA(agenciaMantenedoraConta);

        String digitoVerificadorConta = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.DIGITO_VERIFICADOR_CONTA);
        arquivo240.setDIGITO_VERIFICADOR_CONTA(usoExclusivoCnab2);

        int codigoConvenioBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.CODIGO_CONVENIO_BANCO));
        arquivo240.setCODIGO_CONVENIO_BANCO(codigoConvenioBanco);

        int codigoModeloPersonalizado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.CODIGO_MODELO_PERSONALIZADO));
        arquivo240.setCODIGO_MODELO_PERSONALIZADO(codigoModeloPersonalizado);

        int usoExclusivoCaixa2 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa2);

        String nomeEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.NOME_EMPRESA);
        arquivo240.setNOME_EMPRESA(nomeEmpresa);

        String mensagem1 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.MENSAGEM1));
        arquivo240.setMENSAGEM1(mensagem1);

        String mensagem2 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.MENSAGEM2));
        arquivo240.setMENSAGEM2(mensagem2);

        int numeroRemesaRetorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.NUMERO_REMESSA_RETORNO));
        arquivo240.setNUMERO_REMESSA_RETORNO(numeroRemesaRetorno);

        int dataGravacaoRetorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.DATA_GRAVACAO_REMESSA_RETORNO));
        arquivo240.setDATA_GRAVACAO_REMESSA_RETORNO(dataGravacaoRetorno);

        int dataCredito = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.DATA_CREDITO));
        arquivo240.setDATA_CREDITO(dataCredito);

        String usoExclusivoFebraban3 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoExclusivoFebraban3);

    }

    public void trataRegistroRegistroDetalheSegmentoP(LineCnabCaixaEconomicaRetornoSegmentoP arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoPRemessa();
        model = la.createModel();

        model.setRepresentation(linha);
        
        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_BANCO_COMPENSACAO));
        arquivo240.setCODIGO_BANCO_COMPENSACAO(CodigoBancoCompensacao);

        int lote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_LOTE));
        arquivo240.setLOTE_SERVICO(lote);

        int registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        int N_Registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.SEQUENCIAL_REGISTRO));
        arquivo240.setSEQUENCIAL_REGISTRO(N_Registro);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_SEGMENTO_REGISTRO));
        arquivo240.setCODIGO_SEGMENTO_REGISTRO(segmento);

        String cnab = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(cnab);

        int codigoMovimentoRetorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_MOVIMENTO_REMESSA));
        arquivo240.setCODIGO_MOVIMENTO_REMESSA(codigoMovimentoRetorno);

        int agenciaMantenedoraConta = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.AGENCIA_MANTENEDORA_CEDENTE));
        arquivo240.setAGENCIA_MANTENEDORA_CEDENTE(agenciaMantenedoraConta);
 
        String digitoVerificadorAgencia = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA_CEDENTE));
        arquivo240.setDIGITO_VERIFICADOR_AGENCIA_CEDENTE(digitoVerificadorAgencia);
        
        int codigoConvenioBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_CONVENIO_BANCO_CEDENTE));
        arquivo240.setCODIGO_CONVENIO_BANCO_CEDENTE(codigoConvenioBanco);
        
        int usoExclusivoCaixa1 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA1));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa1);
        
        int usoExclusivoCaixa2 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUSO_EXCLUSIVO_CAIXA2(usoExclusivoCaixa2);
        
        int modalidadeCArteira = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.MODALIDADE_CARTEIRA));
        arquivo240.setMODALIDADE_CARTEIRA(modalidadeCArteira);
        
        int identificacaoTituloBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_TITULO_BANCO));
        arquivo240.setIDENTIFICACAO_TITULO_BANCO(identificacaoTituloBanco);
        
        int codigoCarteira = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_CARTEIRA));
        arquivo240.setCODIGO_CARTEIRA(codigoCarteira);
        
        int formaCadastroTituloBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.FORMA_CADASTRO_BANCO));
        arquivo240.setFORMA_CADASTRO_BANCO(formaCadastroTituloBanco);
        
        String tipoDocumento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.TIPO_DOCUMENTO));
        arquivo240.setTIPO_DOCUMENTO(tipoDocumento);
        
        int identificacaoEmissaoBloqueto = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_EMISSAO_BOLETO));
        arquivo240.setIDENTIFICACAO_EMISSAO_BOLETO(formaCadastroTituloBanco);
        
        String IDENTIFICACAO_ENTREGA_BOLETO = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_ENTREGA_BOLETO));
        arquivo240.setIDENTIFICACAO_ENTREGA_BOLETO(IDENTIFICACAO_ENTREGA_BOLETO);
        
        String numeroDocumentoCobranca = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.NUMERO_DOCUMENTO_COBRANCA));
        arquivo240.setNUMERO_DOCUMENTO_COBRANCA(numeroDocumentoCobranca);
        
        String usoExclusivoCaixa3 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA3));
        arquivo240.setUSO_EXCLUSIVO_CAIXA3(usoExclusivoCaixa3);
        
        int dataVencimentoTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_VENCIMENTO_TITULO));
        arquivo240.setDATA_VENCIMENTO_TITULO(dataVencimentoTitulo);
        
        int valorNominalTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.VALOR_NOMINAL_TITULO));
        arquivo240.setVALOR_NOMINAL_TITULO(valorNominalTitulo);
        
        int agenciaEncarregadaCobranca = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.AGENCIA_ENCARREGADA_COBRANCA));
        arquivo240.setAGENCIA_ENCARREGADA_COBRANCA(agenciaEncarregadaCobranca);
        
        String digitoVerificadorAgencia2 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA));
        arquivo240.setDIGITO_VERIFICADOR_AGENCIA(digitoVerificadorAgencia2);
        
        int especieTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.ESPECIE_TITULO  ));
        arquivo240.setESPECIE_TITULO(especieTitulo);
        
        String identificacaoTituloAceitoNaoAceito = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_ACEITO_NAO));
        arquivo240.setIDENTIFICACAO_ACEITO_NAO(identificacaoTituloAceitoNaoAceito);
        
        int dataEmisssaoTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_EMISSAO_TITULO));
        arquivo240.setDATA_EMISSAO_TITULO(dataEmisssaoTitulo);
        
        int codigoJuroMora= Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_JUROS_MORA));
        arquivo240.setCODIGO_JUROS_MORA(codigoJuroMora);
        
        int Data_Juros_Mora = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_JUROS_MORA));
        arquivo240.setDATA_JUROS_MORA(Data_Juros_Mora);
        
        int juros_mora_dia = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.JUROS_MORA_DIA));
        arquivo240.setJUROS_MORA_DIA(juros_mora_dia);
        
        int codigoDEsconto1 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_DESCONTO1));
        arquivo240.setCODIGO_DESCONTO1(codigoDEsconto1);
        
        int dataDEsconto1 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_DESCONTO1));
        arquivo240.setDATA_DESCONTO1(dataDEsconto1);
        
        int valorIOFRecolhido = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.VALOR_IOF));
        arquivo240.setVALOR_IOF(valorIOFRecolhido);
        
        int valorAbatimento = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.VALOR_ABATIMENTO));
        arquivo240.setVALOR_ABATIMENTO(valorAbatimento);
        
        String identificacaoTituloEmpresa = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_TITULO_EMPRESA));
        arquivo240.setIDENTIFICACAO_TITULO_EMPRESA(IDENTIFICACAO_ENTREGA_BOLETO);
        
        int codigoProtesto = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_PROTESTO));
        arquivo240.setCODIGO_PROTESTO(codigoProtesto);
        
        int numeroDiasProtesto = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIAS_PROTESTO));
        arquivo240.setDIAS_PROTESTO(numeroDiasProtesto);
        
        int CodigoBaixaDEvolucao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_BAIXA_DEVOLUCAO));
        arquivo240.setCODIGO_BAIXA_DEVOLUCAO(CodigoBaixaDEvolucao);
        
        String numeroDiasBaixaDevolucao = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIAS_BAIXA_DEVOLUCAO));
        arquivo240.setNUMERO_DIAS_BAIXA_DEVOLUCAO(numeroDiasBaixaDevolucao);
        
        int CodigoMoeda = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_MOEDA));
        arquivo240.setCODIGO_MOEDA(CodigoMoeda);
        
        int usoExclusivoCaixa4 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA4));
        arquivo240.setUSO_EXCLUSIVO_CAIXA4(usoExclusivoCaixa4);
        
        String usoExclusivoFebraban2 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoExclusivoFebraban2);            
    }
    
    
    public void trataRegistroRegistroDetalheSegmentoT(LineCnabCaixaEconomicaRetornoSegmentoT arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoT_Retorno();
        model = la.createModel();

        model.setRepresentation(linha);

        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_BANCO));
        arquivo240.setCODIGO_BANCO(CodigoBancoCompensacao);

        int lote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.LOTE_SERVICO));
        arquivo240.setLOTE_SERVICO(lote);

        int registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        int numeroSequencialRegistroLote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.NUMERO_SEQUENCIAL_REG_LOTE));
        arquivo240.setNUMERO_SEQUENCIAL_REG_LOTE(numeroSequencialRegistroLote);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SEGMENTO));
        arquivo240.setCodigoSegmentoRegistroDetalhe(segmento);

        String usoExclusivoFebraban = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_FEBRABAN1);
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(usoExclusivoFebraban);

        int codigoMovimentoRetorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_MOVIMENTO_RETORNO));
        arquivo240.setCODIGO_MOVIMENTO_RETORNO(codigoMovimentoRetorno);

        int usoExclusivoCaixa1 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA1));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa1);

        int usoExclusivoCaixa2 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUSO_EXCLUSIVO_CAIXA2(usoExclusivoCaixa2);

        int codigoConvenioBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_CONVENIO_BANCO));
        arquivo240.setCODIGO_CONVENIO_BANCO(codigoConvenioBanco);

        int usoExclusivoCaixa3 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA3));
        arquivo240.setUSO_EXCLUSIVO_CAIXA3(usoExclusivoCaixa3);

        int numeroBancoSacado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.NUMERO_BANCO_SACADOS));
        arquivo240.setNUMERO_BANCO_SACADOS(numeroBancoSacado);

        int usoExclusivoCaixa4 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA4));
        arquivo240.setUSO_EXCLUSIVO_CAIXA4(usoExclusivoCaixa4);

        int identificacaoTituloBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.IDENTIFICACAO_TITULO_BANCO));
        arquivo240.setIDENTIFICACAO_TITULO_BANCO(identificacaoTituloBanco);

        int usoExclusivoCaixa5 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA5));
        arquivo240.setUSO_EXCLUSIVO_CAIXA5(usoExclusivoCaixa5);

        int dataVencimentoTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.VENCIMENTO));
        arquivo240.setVENCIMENTO(dataVencimentoTitulo);

        int valorNominalTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.VALOR_NOMINAL_TITULO));
        arquivo240.setVALOR_NOMINAL_TITULO(valorNominalTitulo);

        int codigoBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_BANCO));
        arquivo240.setCODIGO_BANCO(codigoBanco);

        int codigoAgenciaCobrReg = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_AGENCIA_COBRADOR));
        arquivo240.setCODIGO_AGENCIA_COBRADOR(codigoAgenciaCobrReg);

        int digitoVerificadorAgenciaCobr = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.DIGITO_VERIFICADOR_AGENCIA));
        arquivo240.setDIGITO_VERIFICADOR_AGENCIA(digitoVerificadorAgenciaCobr);

        String identificacaoTituloEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.IDENTIFICACAO_TITULO_EMPRESA);
        arquivo240.setIDENTIFICACAO_TITULO_EMPRESA(identificacaoTituloEmpresa);

        int codigoMoeda = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_MOEDA));
        arquivo240.setCODIGO_MOEDA(codigoMoeda);

        int tipoIncrecao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SACADO_TIPO_INSCRICAO));
        arquivo240.setSACADO_TIPO_INSCRICAO(tipoIncrecao);

        int numeroInscricao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SACADO_NUMERO_INSCRICAO));
        arquivo240.setSACADO_NUMERO_INSCRICAO(numeroInscricao);

        String nome = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SACADO_NOME);
        arquivo240.setSACADO_NOME(nome);

        String usoExclusivoFebraban7 = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA7);
        arquivo240.setUSO_EXCLUSIVO_CAIXA7(usoExclusivoFebraban7);

        int valorTarifasCustas = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.VALOR_TARIFA));
        arquivo240.setVALOR_TARIFA(valorTarifasCustas);

        String MOTIVO_OCORRENCIA = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.MOTIVO_OCORRENCIA));
        arquivo240.setMOTIVO_OCORRENCIA(MOTIVO_OCORRENCIA);

        String usoExclusivoFebraban8 = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA8);
        arquivo240.setUSO_EXCLUSIVO_CAIXA8(usoExclusivoFebraban8);
    }

    public void trataRegistroRegistroDetalheSegmentoU(LineCnabCaixaEconomicaRetornoSegmentoU arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoURetorno();
        model = la.createModel();
        model.setRepresentation(linha);

        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_BANCO_COMPENSACAO));
        arquivo240.setCODIGO_BANCO_COMPENSACA(CodigoBancoCompensacao);

        int lote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.LOTE_SERVICO));
        arquivo240.setLOTE_SERVIC(lote);

        int registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        int N_Registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.SEQUENCIAL_REGISTRO));
        arquivo240.setNOSSO_NUMERO_BANCO_CORRESPONDENTE_COMPENSACAO(N_Registro);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_SEGMENTO_REGISTRO));
        arquivo240.setCODIGO_SEGMENTO_REGISTRO(segmento);

        String cnab = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(cnab);

        int codigoMovimentoRetorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_MOVIMENTO_REMESSA));
        arquivo240.setCODIGO_MOVIMENTO_REMESS(codigoMovimentoRetorno);

        int jurosMultaEncargo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.JUROS_MULTA_ENCARGO));
        arquivo240.setJUROS_MULTA_ENCARGO(jurosMultaEncargo);

        int valorDescansoConcedido = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_DESCONTO_CONCEDIDO));
        arquivo240.setVALOR_DESCONTO_CONCEDIDO(valorDescansoConcedido);

        int valorAbtConcedidoCancel = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_ABATIMENTO_CONCEDIDO));
        arquivo240.setVALOR_ABATIMENTO_CONCEDIDO(valorAbtConcedidoCancel);

        int valorIOFRecolhido = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_IOF_RECOLHIDO));
        arquivo240.setVALOR_IOF_RECOLHIDO(valorIOFRecolhido);

        int valorPeagoPeloSacado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_PAGO_SACADO));
        arquivo240.setVALOR_PAGO_SACADO(valorPeagoPeloSacado);

        int valorLiquidoSerCreditado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_LIQUIDO_CREDITAR));
        arquivo240.setVALOR_LIQUIDO_CREDITAR(valorLiquidoSerCreditado);

        int valorOutrasDespesas = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_OUTRAS_DESPESAS));
        arquivo240.setVALOR_OUTRAS_DESPESAS(valorOutrasDespesas);

        int valorOutrosCreditos = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_OUTROS_CREDITOS));
        arquivo240.setVALOR_OUTROS_CREDITOS(valorOutrosCreditos);

        int dataOcorrencia = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.DATA_OCORRENCIA));
        arquivo240.setDATA_OCORRENCI(dataOcorrencia);

        int dataEfetivacaoCredito = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.DATA_EFETIVACAO_CREDITO));
        arquivo240.setDATA_EFETIVACAO_CREDIT(dataEfetivacaoCredito);

        int usoExclusivoCaixa2 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoExclusivoCaixa2);

        int dataDebitoTarifa = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.DATA_DEBITO_TARIFA));
        arquivo240.setDATA_DEBITO_TARIF(dataDebitoTarifa);

        int CodigoSacadoBanco = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_SACADO_BANCO));
        arquivo240.setCODIGO_SACADO_BANCO(CodigoSacadoBanco);

        int usoExclusivoCaixa3 = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoExclusivoCaixa3);

        int codigoBancoCorrespondenteCompens = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_BANCO_CORRESPONDENTE_COMPENSACAO));
        arquivo240.setCODIGO_BANCO_CORRESPONDENTE_COMPENSACA(codigoBancoCorrespondenteCompens);

        String usoExclusivoCaixa4 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN4));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN4(usoExclusivoCaixa4);
    }

    public void trataRegistroRegistroDetalheSegmentoU35_36_37(LineCnabCaixaEconomicaRetornoSegmentoUMovimento arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoURetorno();
        model = la.createModel();
        model.setRepresentation(linha);

        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_BANCO_COMPENSACAO));
        arquivo240.setCODIGO_BANCO_COMPENSACA(CodigoBancoCompensacao);

        int lote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.LOTE_SERVICO));
        arquivo240.setLOTE_SERVIC(lote);

        int registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        int N_Registro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.SEQUENCIAL_REGISTRO));
        arquivo240.setSEQUENCIAL_REGISTRO(N_Registro);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_SEGMENTO_REGISTRO));
        arquivo240.setCODIGO_SEGMENTO_REGISTRO(segmento);

        String cnab = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(cnab);

        int codigoMovimentoRetorno = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_MOVIMENTO_REMESSA));
        arquivo240.setCODIGO_MOVIMENTO_REMESS(codigoMovimentoRetorno);

        int jurosMultaEncargo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.JUROS_MULTA_ENCARGO));
        arquivo240.setJUROS_MULTA_ENCARGO(jurosMultaEncargo);

        int valorDescansoConcedido = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_DESCONTO_CONCEDIDO));
        arquivo240.setVALOR_DESCONTO_CONCEDIDO(valorDescansoConcedido);

        int valorAbtConcedidoCancel = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_ABATIMENTO_CONCEDIDO));
        arquivo240.setVALOR_ABATIMENTO_CONCEDIDO(valorAbtConcedidoCancel);

        int valorIOFRecolhido = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_IOF_RECOLHIDO));
        arquivo240.setVALOR_IOF_RECOLHIDO(valorIOFRecolhido);

        int valorPeagoPeloSacado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_PAGO_SACADO));
        arquivo240.setVALOR_PAGO_SACADO(valorPeagoPeloSacado);

        int valorLiquidoSerCreditado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_LIQUIDO_CREDITAR));
        arquivo240.setVALOR_LIQUIDO_CREDITAR(valorLiquidoSerCreditado);

        int valorOutrasDespesas = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_OUTRAS_DESPESAS));
        arquivo240.setVALOR_OUTRAS_DESPESAS(valorOutrasDespesas);

        int valorOutrosCreditos = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_OUTROS_CREDITOS));
        arquivo240.setVALOR_OUTROS_CREDITOS(valorOutrosCreditos);

        int dataOcorrencia = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.DATA_OCORRENCIA));
        arquivo240.setDATA_OCORRENCI(dataOcorrencia);

        int dataEfetivacaoCredito = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.DATA_EFETIVACAO_CREDITO));
        arquivo240.setDATA_EFETIVACAO_CREDITO(dataEfetivacaoCredito);

        int numeroBancoSacado = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.NUMERO_BANCO_SACADOS));
        arquivo240.setNUMERO_BANCO_SACADOS(numeroBancoSacado);

        String nomeBancoSacado = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.NOME_BANCO_SACADOS));
        arquivo240.setNOME_BANCO_SACADOS(nomeBancoSacado);

        String idAjusteVencimento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_AJUSTE_VENCIMENTO));
        arquivo240.setID_AJUSTE_VENCIMENTO(idAjusteVencimento);

        String idAjusteEmissao = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_AJUSTE_EMISSAO));
        arquivo240.setID_AJUSTE_EMESSAO(idAjusteEmissao);

        int idModeloBloqueto = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_MODELO_BOLETO_BANCO_SACADOS));
        arquivo240.setID_MODELO_BLOQUETO_BANCO_SACADOS(idModeloBloqueto);

        int idViaEntrega = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_VIA_ENTREGA_DISTRIBUICAO));
        arquivo240.setID_VIA_ENTREGA_DISTRIBUICAO(idAjusteEmissao);

        int idEspecieTitulo = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_ESPECIE_TITULO));
        arquivo240.setID_ESPECIE_TITULO(idEspecieTitulo);

        String idAceite = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_ACEITE));
        arquivo240.setID_ACEITE(idAceite);

        String codigoSacadoBanco = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_SACADO_BANCO));
        arquivo240.setCODIGO_DO_SACADO_BANCO(codigoSacadoBanco);

        String usoExclusivoCaixa = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoExclusivoCaixa);

        String usoExclusivoFebraban = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoExclusivoFebraban);
    }

    public void trataRegistroRegistroDetalheTralerLote(LineCnabCaixaEconomicaRetornoTrailerLote arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaRegistroTrailerLote();
        model = la.createModel();
        model.setRepresentation(linha);
        
        int CodigoBancoCompensacao = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.CODIGO_BANCO_COMPENSACAO));
        arquivo240.setCODIGO_BANCO_COMPENSACAO(CodigoBancoCompensacao);
        
        int loteServico = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.LOTE_SERVICO));
        arquivo240.setLOTE_SERVICO(loteServico);
        
        int tipoRegistro = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(tipoRegistro);
        
        String usoEsclusivo = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(usoEsclusivo);

        int quantidadeRegistroLote = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_REGISTROS_LOTE));
        arquivo240.setQUANTIDADE_REGISTROS_LOTE(quantidadeRegistroLote);
        
        int quantidaedTitulosCobranca = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_COBRANCA));
        arquivo240.setQUANTIDADE_TITULOS_COBRANCA(quantidaedTitulosCobranca);
        
        int valorTotalTitulosCarteiras = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.VALOR_TITULOS_CARTEIRA));
        arquivo240.setVALOR_TITULOS_CARTEIRA(valorTotalTitulosCarteiras);
        
        int quantidadeTituloCobrancaCausionada = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_COBRANCA_CAUCIONADA));
        arquivo240.setQUANTIDADE_TITULOS_COBRANCA_CAUCIONADA(quantidadeTituloCobrancaCausionada);
        
        int valorTituloCobrancaCausionada = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.VALOR_TITULOS_CARTEIRA_CAUCIONADA));
        arquivo240.setVALOR_TITULOS_CARTEIRA_CAUCIONADA(valorTituloCobrancaCausionada);
        
        int quantidadeTitulosCobrancaDescontada = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_COBRANCA_DESCONTADA));
        arquivo240.setQUANTIDADE_TITULOS_COBRANCA_DESCONTADA(quantidadeTitulosCobrancaDescontada);
        
        int quantidadeTitulosCarteiras = Integer.parseInt(model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_CARTEIRA_DESCONTADA));
        arquivo240.setQUANTIDADE_TITULOS_CARTEIRA_DESCONTADA(quantidadeTitulosCarteiras);
        
        String usoEsclusivo2 = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoEsclusivo2);
         
        String usoEsclusivo3 = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoEsclusivo3);                
    }
    
    

}
