/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import br.com.jcomputacao.aristoteles.field.FieldVolatile;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.LineCnabRegistroHeaderRetorno;
import br.com.jcomputacao.cnab.LineCnabRegistroMovimentoRetorno;
import br.com.jcomputacao.cnab.LineCnabRegistroTraillerRetorno;
import br.com.jcomputacao.cnab.bb400.LineCnabBBRegistroHeaderRetorno;
import br.com.jcomputacao.cnab.bb400.LineCnabBBRegistroMovimentoRetorno;
import br.com.jcomputacao.cnab.bb400.LineCnabBBRegistroTraillerRetorno;
import br.com.jcomputacao.cnab.util.NumberUtil;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Nieri
 */
public class Cnab400SantanderArquivoRetorno {

    private int bancoCodigo = 33;

    public int getBancoCodigo() {
        return bancoCodigo;
    }

    public void setBancoCodigo(int bancoCodigo) {
        this.bancoCodigo = bancoCodigo;
    }

    public void trataLinha(Cnab400SantanderLoteRetorno retorno, String buf) throws ParseException {
        if (buf == null) {
            return;
        }
        if (buf.startsWith("0")) {
            setBancoCodigo(Integer.parseInt(buf.substring(76, 79)));
            if (getBancoCodigo() == 33) {
                trataHeaderRetorno(buf, retorno);
            } else {
                trataHeaderRetornoBB(buf, retorno);
            }
        } else if (buf.startsWith("9")) {
            if (getBancoCodigo() == 33) {
                trataTraillerRetorno(buf, retorno);
            } else {
                trataTraillerRetornoBB(buf, retorno);
            }
        }
    }

    private void trataHeaderRetorno(String buf, Cnab400SantanderLoteRetorno retorno) throws ParseException {
        LineCnabRegistroHeaderRetorno lar = new LineCnabRegistroHeaderRetorno();
        LineModel lineModel = lar.createModel();
        lineModel.setRepresentation(buf);
//        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_REGISTRO);
//        retorno.setCodigoRegistro((Long) field.getValue());
        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_REMESSA);
        retorno.setCodigoRemessa((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.LITERAL_TRANSMISSAO);
        retorno.setLiteralTransmissao((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_SERVICO);
        retorno.setCodigoServico((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.LITERAL_SERVICO);
        retorno.setLiteralServico((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_AGENCIA_CEDENTE);
        retorno.setCodigoAgenciaCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CONTA_MOVIMENTO_CEDENTE);
        retorno.setContaMovimentoCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CONTA_COBRANCA_CEDENTE);
        retorno.setContaCobrancaCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.NOME_CEDENTE);
        retorno.setNomeCedente((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_BANCO);
        retorno.setCodigoBanco((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.NOME_BANCO);
        retorno.setNomeBanco((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.DATA_MOVIMENTO);
        retorno.setDataMovimento((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_CEDENTE);
        retorno.setCodigoCedente((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.NUMERO_VERSAO);
        retorno.setNumeroVersao((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO);
        retorno.setNumeroSequencialRegistroArquivo((Long) field.getValue());
    }

    public Cnab400SantanderMovimentoRetorno trataMovimentoRetorno(String buf, Cnab400SantanderMovimentoRetorno movimentoRetorno) throws ParseException {
        LineCnabRegistroMovimentoRetorno lar = new LineCnabRegistroMovimentoRetorno();
        LineModel lineModel = lar.createModel();
        lineModel.setRepresentation(buf);

        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_REGISTRO);
        movimentoRetorno.setCodigoRegistro((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.TIPO_INSCRICAO_CEDENTE);
        movimentoRetorno.setTipoInscricaoCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CGC_CPF_CEDENTE);
        movimentoRetorno.setCgcCpfCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_AGENCIA_CEDENTE);
        movimentoRetorno.setCodigoAgenciaCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CONTA_MOVIMENTO_CEDENTE);
        movimentoRetorno.setContaMovimentoCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CONTA_COBRANCA_CEDENTE);
        movimentoRetorno.setContaCobrancaCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NUMERO_CONTROLE_PARTICIPANTE);
        movimentoRetorno.setNumeroControleParticipante((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NOSSO_NUMERO_1);
        movimentoRetorno.setNossoNumero1((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_CARTEIRA);
        movimentoRetorno.setCodigoCarteira((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_OCORRENCIA);
        movimentoRetorno.setCodigoOcorrencia((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.DATA_OCORRENCIA);
        movimentoRetorno.setDataOcorrencia((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.SEU_NUMERO);
        movimentoRetorno.setSeuNumero((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NOSO_NUMERO_2);
        movimentoRetorno.setNossoNumero2((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_ORIGINAL_REMESSA);
        movimentoRetorno.setCodigoOriginalRemessa((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_PRIMEIRA_OCORRENCIA);
        movimentoRetorno.setCodigoErroPrimeiraOcorrencia((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_SEGUNDA_OCORRENCIA);
        movimentoRetorno.setCodigoErroSegundaOcorrencia((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_TERCEIRA_OCORRENCIA);
        movimentoRetorno.setCodigoErroTerceiraOcorrencia((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.DATA_VENCIMENTO_TITULO);
        movimentoRetorno.setDataVencimentoTitulo((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_TITULO);
        movimentoRetorno.setValorTitulo(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NUMERO_BANCO_COBRADOR);
        movimentoRetorno.setNumeroBancoCobrador((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_AGENCIA_RECEBEDORA_TITULO);
        movimentoRetorno.setCodigoAgenciaRecebedoraTitulo((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.ESPECIE_DOCUMENTO);
        movimentoRetorno.setEspecieDocumento((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_TARIFA_COBRADA);
        movimentoRetorno.setValorTarifaCobrada(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_OUTRAS_DESPESAS);
        movimentoRetorno.setValorOutrasDespesas(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_JUROS_ATRASO);
        movimentoRetorno.setValorJurosAtraso(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_IOF_DEVIDO);
        movimentoRetorno.setValorIofDevido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_ABATIMENTO_CONCEDIDO);
        movimentoRetorno.setValorAbatimentoConcedido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_DESCONTO_CONCEDIDO);
        movimentoRetorno.setValorDescontoConcedido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_TOTAL_RECEBIDO);
        movimentoRetorno.setValorTotalRecebido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_JUROS_MORA);
        movimentoRetorno.setValorJurosMora(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_OUTROS_CREDITOS);
        movimentoRetorno.setValorOutrosCreditos(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.CODIGO_ACEITE);
        movimentoRetorno.setCodigoAceite((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.DATA_CREDITO);
        movimentoRetorno.setDataCredito((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NOME_SACADO);
        movimentoRetorno.setNomeSacado((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.IDENTIFICADOR_COMPLEMENTO);
        movimentoRetorno.setIdentificadorComplemento((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.UNIDADE_VALOR_MOEDA_CORRENTE);
        movimentoRetorno.setUnidadeValorMoedaCorrente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_TITULO_OUTRA_UNIDADE_VALOR);
        movimentoRetorno.setValorTituloOutraUnidadeValor(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_IOC_OUTRA_UNIDADE_VALOR);
        movimentoRetorno.setValorIocOutraUnidadeValor(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.VALOR_DEBITO_CREDITO);
        movimentoRetorno.setValorDebitoCredito(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.DEBITO_CREDITO);
        movimentoRetorno.setDebitoCredito((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NUMERO_VERSAO);
        movimentoRetorno.setNumeroVersao((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroMovimentoRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO);
        movimentoRetorno.setNumeroSequencialRegistroArquivo((Long) field.getValue());
        return movimentoRetorno;
    }

    private void trataTraillerRetorno(String buf, Cnab400SantanderLoteRetorno retorno) throws ParseException {
        LineCnabRegistroTraillerRetorno lar = new LineCnabRegistroTraillerRetorno();
        LineModel lineModel = lar.createModel();
        lineModel.setRepresentation(buf);
//        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.CODIGO_REGISTRO);
//        retorno.setCodigoRegistro((Long) field.getValue());
        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.CODIGO_REMESSA);
        retorno.setCodigoRemessa((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.CODIGO_SERVICO);
        retorno.setCodigoServico((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.CODIGO_BANCO);
        retorno.setCodigoBanco((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE);
        retorno.setQuantidadeRegistrosCobrancasSimplesReferenteCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE);
        retorno.setValorTitulosCobrancaSimplesReferenteCedente(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_SIMPLES);
        retorno.setNumeroAvisoCobrancaSimples((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_CAUCIONADA_REFERENTE_CEDENTE);
        retorno.setQuantidadeRegistrosCobrancasCaucionadaReferenteCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_CAUCIONADA_REFERENTE_CEDENTE);
        retorno.setValorTitulosCobrancaCaucionadaReferenteCedente(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_CAUCIONADA);
        retorno.setNumeroAvisoCobrancaCaucionada((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_DESCONTADA_REFERENTE_CEDENTE);
        retorno.setQuantidadeRegistrosCobrancasDescontadaReferenteCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_DESCONTADA_REFERENTE_CEDENTE);
        retorno.setValorTitulosCobrancaDescontadaReferenteCedente(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_DESCONTADA);
        retorno.setNumeroAvisoCobrancaDescontada((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.NUMERO_VERSAO);
        retorno.setNumeroVersao((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO);
        retorno.setNumeroSequencialRegistroArquivo((Long) field.getValue());
    }

    private void trataHeaderRetornoBB(String buf, Cnab400SantanderLoteRetorno retorno) throws ParseException {
        LineCnabBBRegistroHeaderRetorno lar = new LineCnabBBRegistroHeaderRetorno();
        LineModel lineModel = lar.createModel();
        lineModel.setRepresentation(buf);
//        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroHeaderRetorno.CODIGO_REGISTRO);
//        retorno.setCodigoRegistro((Long) field.getValue());
        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.CODIGO_REMESSA);
        retorno.setCodigoRemessa((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.LITERAL_TRANSMISSAO);
        retorno.setLiteralTransmissao((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.CODIGO_SERVICO);
        retorno.setCodigoServico((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.LITERAL_SERVICO);
        retorno.setLiteralServico((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.NOME_CEDENTE);
        retorno.setNomeCedente((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.CODIGO_BANCO);
        retorno.setCodigoBanco((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.NOME_BANCO);
        retorno.setNomeBanco((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.DATA_GRAVACAO_ARQUIVO);
        retorno.setDataMovimento((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroHeaderRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO);
        retorno.setNumeroSequencialRegistroArquivo((Long) field.getValue());
    }

    public Cnab400SantanderMovimentoRetorno trataMovimentoRetornoBB (String buf, Cnab400SantanderMovimentoRetorno movimentoRetorno) throws ParseException {
        LineCnabBBRegistroMovimentoRetorno lar = new LineCnabBBRegistroMovimentoRetorno();
        LineModel lineModel = lar.createModel();
        lineModel.setRepresentation(buf);

        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.CODIGO_REGISTRO);
        movimentoRetorno.setCodigoRegistro((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.TIPO_INSCRICAO_CEDENTE);
        movimentoRetorno.setTipoInscricaoCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.CGC_CPF_CEDENTE);
        movimentoRetorno.setCgcCpfCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.INDENTIFICACAO_CEDENTE);        
        String identificacaoCedente = (String) field.getValue();
        movimentoRetorno.setCodigoAgenciaCedente(Long.parseLong(identificacaoCedente.substring(5, 9)));        
        movimentoRetorno.setContaMovimentoCedente(Long.parseLong(identificacaoCedente.substring(9, 17)));        
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.NUMERO_CONTROLE_PARTICIPANTE);
        movimentoRetorno.setNumeroControleParticipante((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.NOSSO_NUMERO_1);
        movimentoRetorno.setNossoNumero1((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.CODIGO_CARTEIRA);
        movimentoRetorno.setCodigoCarteira((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.CODIGO_OCORRENCIA);
        movimentoRetorno.setCodigoOcorrencia((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.DATA_OCORRENCIA);
        movimentoRetorno.setDataOcorrencia((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.SEU_NUMERO);
        movimentoRetorno.setSeuNumero((String) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.NOSO_NUMERO_2);
        movimentoRetorno.setNossoNumero2((Long) field.getValue());                
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.MOTIVO_REJEICAO_OCORRENCIA);     
        //segundo o layout do Bradesco, o codigo do motivo tem no máximo 3 dígitos
        String motivoRejeicao = Long.toString((Long) field.getValue());
        if(!motivoRejeicao.isEmpty() && motivoRejeicao.length() > 3) {
            motivoRejeicao = motivoRejeicao.substring(0, 3);
        }
        movimentoRetorno.setCodigoErroPrimeiraOcorrencia(motivoRejeicao);
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.DATA_VENCIMENTO_TITULO);
        movimentoRetorno.setDataVencimentoTitulo((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_TITULO);
        movimentoRetorno.setValorTitulo(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.NUMERO_BANCO_COBRADOR);
        movimentoRetorno.setNumeroBancoCobrador((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.CODIGO_AGENCIA_RECEBEDORA_TITULO);
        movimentoRetorno.setCodigoAgenciaRecebedoraTitulo((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.ESPECIE_DOCUMENTO);
        movimentoRetorno.setEspecieDocumento((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_TARIFA_COBRADA);
        movimentoRetorno.setValorTarifaCobrada(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_OUTRAS_DESPESAS);
        movimentoRetorno.setValorOutrasDespesas(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_JUROS_ATRASO);
        movimentoRetorno.setValorJurosAtraso(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_IOF_DEVIDO);
        movimentoRetorno.setValorIofDevido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_ABATIMENTO_CONCEDIDO);
        movimentoRetorno.setValorAbatimentoConcedido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_DESCONTO_CONCEDIDO);
        movimentoRetorno.setValorDescontoConcedido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_TOTAL_RECEBIDO);
        movimentoRetorno.setValorTotalRecebido(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_JUROS_MORA);
        movimentoRetorno.setValorJurosMora(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.VALOR_OUTROS_CREDITOS);
        movimentoRetorno.setValorOutrosCreditos(NumberUtil.asDouble(field.getValue()));        
        movimentoRetorno.setCodigoAceite("N");
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.DATA_CREDITO);
        movimentoRetorno.setDataCredito((Date) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroMovimentoRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO);
        movimentoRetorno.setNumeroSequencialRegistroArquivo((Long) field.getValue());
        return movimentoRetorno;
    }

    private void trataTraillerRetornoBB(String buf, Cnab400SantanderLoteRetorno retorno) throws ParseException {
        LineCnabBBRegistroTraillerRetorno lar = new LineCnabBBRegistroTraillerRetorno();
        LineModel lineModel = lar.createModel();
        lineModel.setRepresentation(buf);
//        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabRegistroTraillerRetorno.CODIGO_REGISTRO);
//        retorno.setCodigoRegistro((Long) field.getValue());
        FieldVolatile field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.CODIGO_REMESSA);
        retorno.setCodigoRemessa((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.CODIGO_SERVICO);
        retorno.setCodigoServico((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.CODIGO_BANCO);
        retorno.setCodigoBanco((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE);
        retorno.setQuantidadeRegistrosCobrancasSimplesReferenteCedente((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE);
        retorno.setValorTitulosCobrancaSimplesReferenteCedente(NumberUtil.asDouble(field.getValue()));
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_SIMPLES);
        retorno.setNumeroAvisoCobrancaSimples((Long) field.getValue());
        field = (FieldVolatile) lineModel.getField(LineCnabBBRegistroTraillerRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO);
        retorno.setNumeroSequencialRegistroArquivo((Long) field.getValue());
    }
}
