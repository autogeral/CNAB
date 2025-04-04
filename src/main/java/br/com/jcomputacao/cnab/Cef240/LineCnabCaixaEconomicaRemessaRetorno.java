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

        int codBanco = model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.CODIGO_BANCO).intValue();
        arquivo240.setCodigoBanco(codBanco);

        int loteServico = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.LOTE_SERVICO).intValue());
        arquivo240.setLoteServico(loteServico);

        int tipoRegistro = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.TIPO_REGISTRO).intValue());
        arquivo240.setTipoServico(tipoRegistro);

        String RESERVADO_USO_BANCO = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.RESERVADO_USO_BANCO));
        arquivo240.setRESERVADO_USO_BANCO(RESERVADO_USO_BANCO);

        String numeroInscricaoEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NUMERO_INSCRICAO);
        arquivo240.setNumeroInscriçãoEmpresa(numeroInscricaoEmpresa);

        String usoExclusivoCaixa = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_CAIXA));
        arquivo240.setUsoExclusivoCAIXA(usoExclusivoCaixa);

        int agenciaMantenedoraConta = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.AGENCIA_MANTENEDORA_AG_DIG).intValue());
        arquivo240.setAgenciaMantenedoraConta(agenciaMantenedoraConta);

        String AGENCIA_MANTENEDORA_DIG = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.AGENCIA_MANTENEDORA_DIG));
        arquivo240.setDigitoVerificadorConta(AGENCIA_MANTENEDORA_DIG);

        int codigo_ConvenioBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.CODIGO_CONVENIO_BANCO).intValue());
        arquivo240.setCodigoConvenioBanco(codigo_ConvenioBanco);

        String UsoExclusivoCAIXA2 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUsoExclusivoCAIXA2(UsoExclusivoCAIXA2);

        String UsoExclusivoCAIXA3 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_EXCLUSIVO_CAIXA3));
        arquivo240.setUsoExclusivoCAIXA3(UsoExclusivoCAIXA3);

//        String Nome_Empresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NOME_EMPRESA);
//        arquivo240.setNomeEmpresa(Nome_Empresa);
        String Nome_Bamco = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.NOME_BANCO);
        arquivo240.setNOME_BANCO(Nome_Bamco);

        String USO_FEBRABAN = model.getFieldValueString(LineCnabCaixaEconomicaHeaderArquivo.USO_FEBRABAN);
        arquivo240.setUsoExclusivoFEBRABANCNAB(USO_FEBRABAN);

        int Codigo_Remessa_Retorno = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.CODIGO_REMESSA_RETORNO).intValue());
        arquivo240.setCodigoRemessaRetorno(Codigo_Remessa_Retorno);

        int DataGeraçãoArquivo = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.DATA_GERACAO_ARQUIVO).intValue());
        arquivo240.setDataGeracaoArquivo(DataGeraçãoArquivo);

        int HoraGeraçãoArquivo = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.HORA_GERACAO_ARQUIVO).intValue());
        arquivo240.setHoraGeracaoArquivo(HoraGeraçãoArquivo);

        int numeroSequencialArquivo = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.NUMERO_SEQUENCIAL_ARQUIVO).intValue());
        arquivo240.setNumeroSequencialArquivo(numeroSequencialArquivo);

        int NumeroVersaoLayoutArquivo = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.NUMERO_VERSAO_ARQUIVO).intValue());
        arquivo240.setNumeroVersaoaLayoutArquivo(NumeroVersaoLayoutArquivo);

        int DensidadeGravaçãoArquivo = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderArquivo.DENSIDADE_GRAVACAO_ARQUIVO).intValue());
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

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaTrailerArquivo.CODIGO_BANCO).intValue());
        arquivo240.setCodigoBanco(CodigoBancoCompensacao);

        int loteServico = (model.getFieldValueNumber(LineCnabCaixaEconomicaTrailerArquivo.LOTE_SERVICO).intValue());
        arquivo240.setLoteServico(loteServico);

        int tipoRegistro = (model.getFieldValueNumber(LineCnabCaixaEconomicaTrailerArquivo.TIPO_REGISTRO).intValue());
        arquivo240.setTipoServico(tipoRegistro);

        String RESERVADO_USO_BANCO = (model.getFieldValueString(LineCnabCaixaEconomicaTrailerArquivo.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setRESERVADO_USO_BANCO(RESERVADO_USO_BANCO);

        int quantidadeLotes = (model.getFieldValueNumber(LineCnabCaixaEconomicaTrailerArquivo.QUANTIDE_LOTES_ARQUIVO).intValue());
        arquivo240.setTipoServico(quantidadeLotes);

        int QuantidadeRegistros = (model.getFieldValueNumber(LineCnabCaixaEconomicaTrailerArquivo.QUANTIDE_REGISTROS_ARQUIVO).intValue());
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

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.CODIGO_BANCO).intValue());
        arquivo240.setCodigoBancoCompensação(CodigoBancoCompensacao);

        int lote = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.LOTE_SERVICO).intValue());
        arquivo240.setLOTE_SERVICO(lote);

        int registro = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.TIPO_REGISTRO).intValue());
        arquivo240.setTIPO_REGISTRO(registro);

        String operacao = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.TIPO_OPERACAO));
        arquivo240.setTIPO_OPERACAO(operacao);

        int servico = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.TIPO_SERVICO).intValue());
        arquivo240.setTIPO_SERVICO(servico);

        String usoExclusivoCnab1 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(usoExclusivoCnab1);

        int N_VersaoLayaout = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.NUMERO_VERSAO_LOTE).intValue());
        arquivo240.setNUMERO_VERSAO_LOTE(N_VersaoLayaout);

        String usoExclusivoCnab2 = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_FEBRABAN2);
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoExclusivoCnab2);

        int tipoIncricaoEmpresa = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.TIPO_INSCRICAO_EMPRESA).intValue());
        arquivo240.setTIPO_INSCRICAO_EMPRESA(tipoIncricaoEmpresa);

        String numeroInscricaoEmpresa = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.NUMERO_INSCRICAO_EMPRESA));
        arquivo240.setNUMERO_INSCRICAO_EMPRESA(numeroInscricaoEmpresa);

        int codigoCedenteBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.CODIGO_CEDENTE_BANCO).intValue());
        arquivo240.setCODIGO_CEDENTE_BANCO(codigoCedenteBanco);

        String usoExclusivoCaixa1 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_CAIXA1));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa1);

        int agenciaMantenedoraConta = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.AGENCIA_MANTENEDORA_CONTA).intValue());
        arquivo240.setAGENCIA_MANTENEDORA_CONTA(agenciaMantenedoraConta);

        String digitoVerificadorConta = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.DIGITO_VERIFICADOR_CONTA);
        arquivo240.setDIGITO_VERIFICADOR_CONTA(digitoVerificadorConta);

        String codigoConvenioBanco = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.CODIGO_CONVENIO_BANCO);
        arquivo240.setCODIGO_CONVENIO_BANCO(codigoConvenioBanco);

        int codigoModeloPersonalizado = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.CODIGO_MODELO_PERSONALIZADO).intValue());
        arquivo240.setCODIGO_MODELO_PERSONALIZADO(codigoModeloPersonalizado);

        String usoExclusivoCaixa2 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa2);

        String nomeEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.NOME_EMPRESA);
        arquivo240.setNOME_EMPRESA(nomeEmpresa);

        String mensagem1 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.MENSAGEM1));
        arquivo240.setMENSAGEM1(mensagem1);

        String mensagem2 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.MENSAGEM2));
        arquivo240.setMENSAGEM2(mensagem2);

        int numeroRemesaRetorno = (model.getFieldValueNumber(LineCnabCaixaEconomicaHeaderLote.NUMERO_REMESSA_RETORNO).intValue());
        arquivo240.setNUMERO_REMESSA_RETORNO(numeroRemesaRetorno);

        String dataGravacaoRetorno = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.DATA_GRAVACAO_REMESSA_RETORNO));
        arquivo240.setDATA_GRAVACAO_REMESSA_RETORNO(dataGravacaoRetorno);

        String dataCredito = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.DATA_CREDITO));
        arquivo240.setDATA_CREDITO(dataCredito);

        String usoExclusivoFebraban3 = (model.getFieldValueString(LineCnabCaixaEconomicaHeaderLote.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoExclusivoFebraban3);

    }

    public void trataRegistroRegistroDetalheSegmentoP(LineCnabCaixaEconomicaRetornoSegmentoP arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoPRemessa();
        model = la.createModel();

        model.setRepresentation(linha);

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_BANCO_COMPENSACAO).intValue());
        arquivo240.setCODIGO_BANCO_COMPENSACAO(CodigoBancoCompensacao);

        int lote = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_LOTE).intValue());
        arquivo240.setLOTE_SERVICO(lote);

        int registro = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.TIPO_REGISTRO).intValue());
        arquivo240.setTIPO_REGISTRO(registro);

        int N_Registro = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.SEQUENCIAL_REGISTRO).intValue());
        arquivo240.setSEQUENCIAL_REGISTRO(N_Registro);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_SEGMENTO_REGISTRO));
        arquivo240.setCODIGO_SEGMENTO_REGISTRO(segmento);

        String cnab = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(cnab);

        int codigoMovimentoRetorno = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_MOVIMENTO_REMESSA).intValue());
        arquivo240.setCODIGO_MOVIMENTO_REMESSA(codigoMovimentoRetorno);

        int agenciaMantenedoraConta = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.AGENCIA_MANTENEDORA_CEDENTE).intValue());
        arquivo240.setAGENCIA_MANTENEDORA_CEDENTE(agenciaMantenedoraConta);

        String digitoVerificadorAgencia = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA_CEDENTE));
        arquivo240.setDIGITO_VERIFICADOR_AGENCIA_CEDENTE(digitoVerificadorAgencia);

        int codigoConvenioBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_CONVENIO_BANCO_CEDENTE).intValue());
        arquivo240.setCODIGO_CONVENIO_BANCO_CEDENTE(codigoConvenioBanco);

        int usoExclusivoCaixa1 = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA1).intValue());
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa1);

        int usoExclusivoCaixa2 = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA2).intValue());
        arquivo240.setUSO_EXCLUSIVO_CAIXA2(usoExclusivoCaixa2);

        int modalidadeCArteira = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.MODALIDADE_CARTEIRA).intValue());
        arquivo240.setMODALIDADE_CARTEIRA(modalidadeCArteira);

        int identificacaoTituloBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_TITULO_BANCO).intValue());
        arquivo240.setIDENTIFICACAO_TITULO_BANCO(identificacaoTituloBanco);

        int codigoCarteira = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_CARTEIRA).intValue());
        arquivo240.setCODIGO_CARTEIRA(codigoCarteira);

        int formaCadastroTituloBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.FORMA_CADASTRO_BANCO).intValue());
        arquivo240.setFORMA_CADASTRO_BANCO(formaCadastroTituloBanco);

        String tipoDocumento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.TIPO_DOCUMENTO));
        arquivo240.setTIPO_DOCUMENTO(tipoDocumento);

        int identificacaoEmissaoBloqueto = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_EMISSAO_BOLETO).intValue());
        arquivo240.setIDENTIFICACAO_EMISSAO_BOLETO(formaCadastroTituloBanco);

        String IDENTIFICACAO_ENTREGA_BOLETO = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_ENTREGA_BOLETO));
        arquivo240.setIDENTIFICACAO_ENTREGA_BOLETO(IDENTIFICACAO_ENTREGA_BOLETO);

        String numeroDocumentoCobranca = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.NUMERO_DOCUMENTO_COBRANCA));
        arquivo240.setNUMERO_DOCUMENTO_COBRANCA(numeroDocumentoCobranca);

        String usoExclusivoCaixa3 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA3));
        arquivo240.setUSO_EXCLUSIVO_CAIXA3(usoExclusivoCaixa3);

        int dataVencimentoTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_VENCIMENTO_TITULO).intValue());
        arquivo240.setDATA_VENCIMENTO_TITULO(dataVencimentoTitulo);

        double valorNominalTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.VALOR_NOMINAL_TITULO).doubleValue());
        arquivo240.setVALOR_NOMINAL_TITULO(valorNominalTitulo);

        int agenciaEncarregadaCobranca = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.AGENCIA_ENCARREGADA_COBRANCA).intValue());
        arquivo240.setAGENCIA_ENCARREGADA_COBRANCA(agenciaEncarregadaCobranca);

        String digitoVerificadorAgencia2 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA));
        arquivo240.setDIGITO_VERIFICADOR_AGENCIA(digitoVerificadorAgencia2);

        int especieTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.ESPECIE_TITULO).intValue());
        arquivo240.setESPECIE_TITULO(especieTitulo);

        String identificacaoTituloAceitoNaoAceito = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_ACEITO_NAO));
        arquivo240.setIDENTIFICACAO_ACEITO_NAO(identificacaoTituloAceitoNaoAceito);

        int dataEmisssaoTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_EMISSAO_TITULO).intValue());
        arquivo240.setDATA_EMISSAO_TITULO(dataEmisssaoTitulo);

        int codigoJuroMora = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_JUROS_MORA).intValue());
        arquivo240.setCODIGO_JUROS_MORA(codigoJuroMora);

        int Data_Juros_Mora = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_JUROS_MORA).intValue());
        arquivo240.setDATA_JUROS_MORA(Data_Juros_Mora);

        int juros_mora_dia = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.JUROS_MORA_DIA).intValue());
        arquivo240.setJUROS_MORA_DIA(juros_mora_dia);

        int codigoDEsconto1 = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_DESCONTO1).intValue());
        arquivo240.setCODIGO_DESCONTO1(codigoDEsconto1);

        int dataDEsconto1 = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DATA_DESCONTO1).intValue());
        arquivo240.setDATA_DESCONTO1(dataDEsconto1);

        int valorIOFRecolhido = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.VALOR_IOF).intValue());
        arquivo240.setVALOR_IOF(valorIOFRecolhido);

        int valorAbatimento = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.VALOR_ABATIMENTO).intValue());
        arquivo240.setVALOR_ABATIMENTO(valorAbatimento);

        String identificacaoTituloEmpresa = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.IDENTIFICACAO_TITULO_EMPRESA));
        arquivo240.setIDENTIFICACAO_TITULO_EMPRESA(IDENTIFICACAO_ENTREGA_BOLETO);

        int codigoProtesto = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_PROTESTO).intValue());
        arquivo240.setCODIGO_PROTESTO(codigoProtesto);

        int numeroDiasProtesto = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIAS_PROTESTO).intValue());
        arquivo240.setDIAS_PROTESTO(numeroDiasProtesto);

        int CodigoBaixaDEvolucao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_BAIXA_DEVOLUCAO).intValue());
        arquivo240.setCODIGO_BAIXA_DEVOLUCAO(CodigoBaixaDEvolucao);

        String numeroDiasBaixaDevolucao = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.DIAS_BAIXA_DEVOLUCAO));
        arquivo240.setNUMERO_DIAS_BAIXA_DEVOLUCAO(numeroDiasBaixaDevolucao);

        int CodigoMoeda = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.CODIGO_MOEDA).intValue());
        arquivo240.setCODIGO_MOEDA(CodigoMoeda);

        int usoExclusivoCaixa4 = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_CAIXA4).intValue());
        arquivo240.setUSO_EXCLUSIVO_CAIXA4(usoExclusivoCaixa4);

        String usoExclusivoFebraban2 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoPRemessa.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoExclusivoFebraban2);
    }

    public void trataRegistroRegistroDetalheSegmentoT(LineCnabCaixaEconomicaRetornoSegmentoT arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoT_Retorno();
        model = la.createModel();

        model.setRepresentation(linha);

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_BANCO).intValue());
        arquivo240.setCODIGO_BANCO(CodigoBancoCompensacao);

        int lote = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.LOTE_SERVICO).intValue());
        arquivo240.setLOTE_SERVICO(lote);

        String registro = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        int numeroSequencialRegistroLote = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.NUMERO_SEQUENCIAL_REG_LOTE).intValue());
        arquivo240.setNUMERO_SEQUENCIAL_REG_LOTE(numeroSequencialRegistroLote);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SEGMENTO));
        arquivo240.setCodigoSegmentoRegistroDetalhe(segmento);

        String usoExclusivoFebraban = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA1);
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoFebraban);
        
        int codigoMovimentoRetorno = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_MOVIMENTO_RETORNO).intValue());
        arquivo240.setCODIGO_MOVIMENTO_RETORNO(codigoMovimentoRetorno);

        String usoExclusivoCaixa1 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA1));
        arquivo240.setUSO_EXCLUSIVO_CAIXA1(usoExclusivoCaixa1);

        String usoExclusivoCaixa2 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA2));
        arquivo240.setUSO_EXCLUSIVO_CAIXA2(usoExclusivoCaixa2);

        int codigoConvenioBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_CONVENIO_BANCO).intValue());
        arquivo240.setCODIGO_CONVENIO_BANCO(codigoConvenioBanco);

        String usoExclusivoCaixa3 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA3));
        arquivo240.setUSO_EXCLUSIVO_CAIXA3(usoExclusivoCaixa3);

        String numeroBancoSacado = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.NUMERO_BANCO_SACADOS));
        arquivo240.setNUMERO_BANCO_SACADOS(numeroBancoSacado);

        String usoExclusivoCaixa4 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA4));
        arquivo240.setUSO_EXCLUSIVO_CAIXA4(usoExclusivoCaixa4);
        
        int modalidadeNossoNumero = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.MODALIDADE_NOSSO_NUMERO).intValue());
        arquivo240.setMODALIDADE_NOSSO_NUMERO(modalidadeNossoNumero);
        
        String identificacaoTituloBanco = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.IDENTIFICACAO_TITULO_BANCO));
        arquivo240.setIDENTIFICACAO_TITULO_BANCO(identificacaoTituloBanco);

        String usoExclusivoCaixa5 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA5));
        arquivo240.setUSO_EXCLUSIVO_CAIXA5(usoExclusivoCaixa5);
                
        int codigoCarteira = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_CARTEIRA).intValue());
        arquivo240.setCODIGO_CARTEIRA(codigoCarteira);

        String documentoCobranca = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.NUMERO_DOCUMENTO_COBRANCA));
        arquivo240.setNUMERO_DOCUMENTO_COBRANCA(documentoCobranca);

        String usoExclusivoCaixa6 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA6));
        arquivo240.setUSO_EXCLUSIVO_CAIXA6(usoExclusivoCaixa6);
        
        int dataVencimentoTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.VENCIMENTO).intValue());
        arquivo240.setVENCIMENTO(dataVencimentoTitulo);

        double valorNominalTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.VALOR_NOMINAL_TITULO).doubleValue());
        arquivo240.setVALOR_NOMINAL_TITULO(valorNominalTitulo);

        int codigoBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_BANCO).intValue());
        arquivo240.setCODIGO_BANCO(codigoBanco);

        int codigoAgenciaCobrReg = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_AGENCIA_COBRADOR).intValue());
        arquivo240.setCODIGO_AGENCIA_COBRADOR(codigoAgenciaCobrReg);

        int digitoVerificadorAgenciaCobr = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.DIGITO_VERIFICADOR_AGENCIA).intValue());
        arquivo240.setDIGITO_VERIFICADOR_AGENCIA(digitoVerificadorAgenciaCobr);

        String identificacaoTituloEmpresa = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.IDENTIFICACAO_TITULO_EMPRESA);
        arquivo240.setIDENTIFICACAO_TITULO_EMPRESA(identificacaoTituloEmpresa);

        int codigoMoeda = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.CODIGO_MOEDA).intValue());
        arquivo240.setCODIGO_MOEDA(codigoMoeda);

        int tipoIncrecao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SACADO_TIPO_INSCRICAO).intValue());
        arquivo240.setSACADO_TIPO_INSCRICAO(tipoIncrecao);

        int numeroInscricao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SACADO_NUMERO_INSCRICAO).intValue());
        arquivo240.setSACADO_NUMERO_INSCRICAO(numeroInscricao);

        String nome = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.SACADO_NOME);
        arquivo240.setSACADO_NOME(nome);

        String usoExclusivoFebraban7 = model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.USO_EXCLUSIVO_CAIXA7);
        arquivo240.setUSO_EXCLUSIVO_CAIXA7(usoExclusivoFebraban7);

        double valorTarifasCustas = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoT_Retorno.VALOR_TARIFA).doubleValue());
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

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_BANCO_COMPENSACAO).intValue());
        arquivo240.setCODIGO_BANCO_COMPENSACA(CodigoBancoCompensacao);

        int lote = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.LOTE_SERVICO).intValue());
        arquivo240.setLOTE_SERVIC(lote);

        String registro = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.TIPO_REGISTRO));
        arquivo240.setTIPO_REGISTRO(registro);

        int N_Registro = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.SEQUENCIAL_REGISTRO).intValue());
        arquivo240.setSEQUENCIAL_REGISTRO(N_Registro);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_SEGMENTO_REGISTRO));
        arquivo240.setCODIGO_SEGMENTO_REGISTRO(segmento);

        String cnab = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(cnab);

        int codigoMovimentoRetorno = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_MOVIMENTO_REMESSA).intValue());
        arquivo240.setCODIGO_MOVIMENTO_REMESS(codigoMovimentoRetorno);

        int jurosMultaEncargo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.JUROS_MULTA_ENCARGO).intValue());
        arquivo240.setJUROS_MULTA_ENCARGO(jurosMultaEncargo);

        double valorDescansoConcedido = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_DESCONTO_CONCEDIDO).doubleValue());
        arquivo240.setVALOR_DESCONTO_CONCEDIDO(valorDescansoConcedido);

        double valorAbtConcedidoCancel = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_ABATIMENTO_CONCEDIDO).doubleValue());
        arquivo240.setVALOR_ABATIMENTO_CONCEDIDO(valorAbtConcedidoCancel);

        double valorIOFRecolhido = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_IOF_RECOLHIDO).doubleValue());
        arquivo240.setVALOR_IOF_RECOLHIDO(valorIOFRecolhido);

        double valorPeagoPeloSacado = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_PAGO_SACADO).doubleValue());
        arquivo240.setVALOR_PAGO_SACADO(valorPeagoPeloSacado);

        double valorLiquidoSerCreditado = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_LIQUIDO_CREDITAR).doubleValue());
        arquivo240.setVALOR_LIQUIDO_CREDITAR(valorLiquidoSerCreditado);

        double valorOutrasDespesas = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_OUTRAS_DESPESAS).doubleValue());
        arquivo240.setVALOR_OUTRAS_DESPESAS(valorOutrasDespesas);

        double valorOutrosCreditos = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.VALOR_OUTROS_CREDITOS).doubleValue());
        arquivo240.setVALOR_OUTROS_CREDITOS(valorOutrosCreditos);

        int dataOcorrencia = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.DATA_OCORRENCIA).intValue());
        arquivo240.setDATA_OCORRENCI(dataOcorrencia);

        int dataEfetivacaoCredito = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.DATA_EFETIVACAO_CREDITO).intValue());
        arquivo240.setDATA_EFETIVACAO_CREDIT(dataEfetivacaoCredito);

        String usoExclusivoCaixa2 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoExclusivoCaixa2);

        int dataDebitoTarifa = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.DATA_DEBITO_TARIFA).intValue());
        arquivo240.setDATA_DEBITO_TARIF(dataDebitoTarifa);

        int CodigoSacadoBanco = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_SACADO_BANCO).intValue());
        arquivo240.setCODIGO_SACADO_BANCO(CodigoSacadoBanco);

        String usoExclusivoCaixa3 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoExclusivoCaixa3);

        int codigoBancoCorrespondenteCompens = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetorno.CODIGO_BANCO_CORRESPONDENTE_COMPENSACAO).intValue());
        arquivo240.setCODIGO_BANCO_CORRESPONDENTE_COMPENSACA(codigoBancoCorrespondenteCompens);

        String usoExclusivoCaixa4 = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetorno.USO_EXCLUSIVO_FEBRABAN4));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN4(usoExclusivoCaixa4);
    }

    public void trataRegistroRegistroDetalheSegmentoU35_36_37(LineCnabCaixaEconomicaRetornoSegmentoUMovimento arquivo240, String linha) throws ParseException {

        LineModel model = null;
        LineArchetype la = new LineCnabCaixaEconomicaDetalheSegmentoURetorno();
        model = la.createModel();
        model.setRepresentation(linha);

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_BANCO_COMPENSACAO).intValue());
        arquivo240.setCODIGO_BANCO_COMPENSACA(CodigoBancoCompensacao);

        int lote = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.LOTE_SERVICO).intValue());
        arquivo240.setLOTE_SERVIC(lote);

        int registro = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.TIPO_REGISTRO).intValue());
        arquivo240.setTIPO_REGISTRO(registro);

        int N_Registro = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.SEQUENCIAL_REGISTRO).intValue());
        arquivo240.setSEQUENCIAL_REGISTRO(N_Registro);

        String segmento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_SEGMENTO_REGISTRO));
        arquivo240.setCODIGO_SEGMENTO_REGISTRO(segmento);

        String cnab = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(cnab);

        int codigoMovimentoRetorno = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.CODIGO_MOVIMENTO_REMESSA).intValue());
        arquivo240.setCODIGO_MOVIMENTO_REMESS(codigoMovimentoRetorno);

        int jurosMultaEncargo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.JUROS_MULTA_ENCARGO).intValue());
        arquivo240.setJUROS_MULTA_ENCARGO(jurosMultaEncargo);

        double valorDescansoConcedido = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_DESCONTO_CONCEDIDO).doubleValue());
        arquivo240.setVALOR_DESCONTO_CONCEDIDO(valorDescansoConcedido);

        double valorAbtConcedidoCancel = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_ABATIMENTO_CONCEDIDO).doubleValue());
        arquivo240.setVALOR_ABATIMENTO_CONCEDIDO(valorAbtConcedidoCancel);

        double valorIOFRecolhido = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_IOF_RECOLHIDO).doubleValue());
        arquivo240.setVALOR_IOF_RECOLHIDO(valorIOFRecolhido);

        double valorPeagoPeloSacado = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_PAGO_SACADO).doubleValue());
        arquivo240.setVALOR_PAGO_SACADO(valorPeagoPeloSacado);

        double valorLiquidoSerCreditado = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_LIQUIDO_CREDITAR).doubleValue());
        arquivo240.setVALOR_LIQUIDO_CREDITAR(valorLiquidoSerCreditado);

        double valorOutrasDespesas = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_OUTRAS_DESPESAS).doubleValue());
        arquivo240.setVALOR_OUTRAS_DESPESAS(valorOutrasDespesas);

        double valorOutrosCreditos = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.VALOR_OUTROS_CREDITOS).doubleValue());
        arquivo240.setVALOR_OUTROS_CREDITOS(valorOutrosCreditos);

        int dataOcorrencia = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.DATA_OCORRENCIA).intValue());
        arquivo240.setDATA_OCORRENCI(dataOcorrencia);

        int dataEfetivacaoCredito = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.DATA_EFETIVACAO_CREDITO).intValue());
        arquivo240.setDATA_EFETIVACAO_CREDITO(dataEfetivacaoCredito);

        int numeroBancoSacado = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.NUMERO_BANCO_SACADOS).intValue());
        arquivo240.setNUMERO_BANCO_SACADOS(numeroBancoSacado);

        String nomeBancoSacado = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.NOME_BANCO_SACADOS));
        arquivo240.setNOME_BANCO_SACADOS(nomeBancoSacado);

        String idAjusteVencimento = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_AJUSTE_VENCIMENTO));
        arquivo240.setID_AJUSTE_VENCIMENTO(idAjusteVencimento);

        String idAjusteEmissao = (model.getFieldValueString(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_AJUSTE_EMISSAO));
        arquivo240.setID_AJUSTE_EMESSAO(idAjusteEmissao);

        int idModeloBloqueto = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_MODELO_BOLETO_BANCO_SACADOS).intValue());
        arquivo240.setID_MODELO_BLOQUETO_BANCO_SACADOS(idModeloBloqueto);

        int idViaEntrega = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_VIA_ENTREGA_DISTRIBUICAO).intValue());
        arquivo240.setID_VIA_ENTREGA_DISTRIBUICAO(idAjusteEmissao);

        int idEspecieTitulo = (model.getFieldValueNumber(LineCnabCaixaEconomicaDetalheSegmentoURetornoMovientos.ID_ESPECIE_TITULO).intValue());
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

        int CodigoBancoCompensacao = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.CODIGO_BANCO_COMPENSACAO).intValue());
        arquivo240.setCODIGO_BANCO_COMPENSACAO(CodigoBancoCompensacao);

        int loteServico = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.LOTE_SERVICO).intValue());
        arquivo240.setLOTE_SERVICO(loteServico);

        String tipoRegistro = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.TIPO_REGISTRO));

        if (tipoRegistro == null || tipoRegistro.equals(" ") || tipoRegistro.equals("")) {
            tipoRegistro = "5";
        }

        arquivo240.setTIPO_REGISTRO(Integer.parseInt(tipoRegistro));

        String usoEsclusivo = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.USO_EXCLUSIVO_FEBRABAN1));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN1(usoEsclusivo);

        int quantidadeRegistroLote = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_REGISTROS_LOTE).intValue());
        arquivo240.setQUANTIDADE_REGISTROS_LOTE(quantidadeRegistroLote);

        int quantidaedTitulosCobranca = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_COBRANCA).intValue());
        arquivo240.setQUANTIDADE_TITULOS_COBRANCA(quantidaedTitulosCobranca);

        int valorTotalTitulosCarteiras = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.VALOR_TITULOS_CARTEIRA).intValue());
        arquivo240.setVALOR_TITULOS_CARTEIRA(valorTotalTitulosCarteiras);

        int quantidadeTituloCobrancaCausionada = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_COBRANCA_CAUCIONADA).intValue());
        arquivo240.setQUANTIDADE_TITULOS_COBRANCA_CAUCIONADA(quantidadeTituloCobrancaCausionada);

        int valorTituloCobrancaCausionada = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.VALOR_TITULOS_CARTEIRA_CAUCIONADA).intValue());
        arquivo240.setVALOR_TITULOS_CARTEIRA_CAUCIONADA(valorTituloCobrancaCausionada);

        int quantidadeTitulosCobrancaDescontada = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_COBRANCA_DESCONTADA).intValue());
        arquivo240.setQUANTIDADE_TITULOS_COBRANCA_DESCONTADA(quantidadeTitulosCobrancaDescontada);

        int quantidadeTitulosCarteiras = (model.getFieldValueNumber(LineCnabCaixaEconomicaRegistroTrailerLote.QUANTIDADE_TITULOS_CARTEIRA_DESCONTADA).intValue());
        arquivo240.setQUANTIDADE_TITULOS_CARTEIRA_DESCONTADA(quantidadeTitulosCarteiras);

        String usoEsclusivo2 = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.USO_EXCLUSIVO_FEBRABAN2));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN2(usoEsclusivo2);

        String usoEsclusivo3 = (model.getFieldValueString(LineCnabCaixaEconomicaRegistroTrailerLote.USO_EXCLUSIVO_FEBRABAN3));
        arquivo240.setUSO_EXCLUSIVO_FEBRABAN3(usoEsclusivo3);
    }

}
