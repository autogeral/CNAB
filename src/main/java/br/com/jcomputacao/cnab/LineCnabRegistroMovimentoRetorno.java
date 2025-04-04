/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroMovimentoRetorno extends LineArchetype {

    /**
     * Código do registro = 1
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Tipo de inscrição do cedente
     * 01 = CPF
     * 02 = CGC
     */
    public static final String TIPO_INSCRICAO_CEDENTE = "TIPO_INSCRICAO_CEDENTE";
    /**
     * CGC ou CPF do cedente
     */
    public static final String CGC_CPF_CEDENTE = "CGC_CPF_CEDENTE";
    /**
     * Código da agência cedente (nota 2)
     */
    public static final String CODIGO_AGENCIA_CEDENTE = "CODIGO_AGENCIA_CEDENTE";
    /**
     * Conta movimento cedente (nota 2)
     */
    public static final String CONTA_MOVIMENTO_CEDENTE = "CONTA_MOVIMENTO_CEDENTE";
    /**
     * Conta cobrança cedente (nota 2)
     */
    public static final String CONTA_COBRANCA_CEDENTE = "CONTA_COBRANCA_CEDENTE";
    /**
     * Número de controle do participante, para controle por
     * parte do cedente
     */
    public static final String NUMERO_CONTROLE_PARTICIPANTE = "NUMERO_CONTROLE_PARTICIPANTE";
    /**
     * Nosso número
     */
    public static final String NOSSO_NUMERO_1 = "NOSSO_NUMERO_1";
    /**
     * Brancos
     */
    public static final String BRANCOS_1 = "BRANCOS_1";
    /**
     * Código da carteira:
     * 2 = ELETRÔNICA COM REGISTRO
     * 3 = CAUCIONADA ELETRÔNICA
     * 4 = COBRANÇA SEM REGISTRO
     * 5 = RÁPIDA COM REGISTRO
     * (BLOQUETE EMITIDO PELO CLIENTE)
     * 7 = DESCONTADA ELETRÔNICA
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    /**
     * Código de ocorrência:
     * 01 = TÍTULO NÃO EXISTE
     * 02 = ENTRADA TÍT. CONFIRMADA
     * 03 = ENTRADA TÍT. REJEITADA
     * 06 = LIQUIDAÇÃO
     * 07 = LIQUIDAÇÃO POR CONTA
     * 08 = LIQUIDAÇÃO POR SALDO
     * 09 = BAIXA AUTOMÁTICA
     * 10 = TÍT. BAIX. CONF. INSTRUÇÃO
     * 11 = EM SER
     * 12 = ABATIMENTO CONCEDIDO
     * 13 = ABATIMENTO CANCELADO
     * 14 = PRORROGAÇÃO DE VENCIMENTO
     * 15 = CONFIRMAÇÃO DE PROTESTO16 = TÍT. JÁ BAIXADO/LIQUIDADO
     * 17 = LIQUIDADO EM CARTÓRIO
     * 21 = TÍT. ENVIADO A CARTÓRIO
     * 22 = TÍT. RETIRADO DE CARTÓRIO
     * 24 = CUSTAS DE CARTÓRIO
     * 25 = PROTESTAR TÍTULO
     * 26 = SUSTAR PROTESTO
     */
    public static final String CODIGO_OCORRENCIA = "CODIGO_OCORRENCIA";
    /**
     * Data da ocorrência
     */
    public static final String DATA_OCORRENCIA = "DATA_OCORRENCIA";
    /**
     * Seu número
     */
    public static final String SEU_NUMERO = "SEU_NUMERO";
    /**
     * Nosso número
     */
    public static final String NOSO_NUMERO_2 = "NOSO_NUMERO_2";
    /**
     * Código Original da Remessa
     * Obs.: Esse campo terá conteúdo diferente de 0(zeros)
     * caso ocorra erro no processamento da remessa - Nota 5
     */
    public static final String CODIGO_ORIGINAL_REMESSA = "CODIGO_ORIGINAL_REMESSA";
    /**
     * Código do Erro (1ª ocorrência), será preenchido com
     * brancos quando não ocorrer erro Nota 5
     */
    public static final String CODIGO_ERRO_PRIMEIRA_OCORRENCIA = "CODIGO_ERRO_PRIMEIRA_OCORRENCIA";
    /**
     * Código do Erro (2ª ocorrência), será preenchido com
     * brancos quando não ocorrer erro Nota 5
     */
    public static final String CODIGO_ERRO_SEGUNDA_OCORRENCIA = "CODIGO_ERRO_SEGUNDA_OCORRENCIA";
    /**
     * Código do Erro (3ª ocorrência), será preenchido com
     * brancos quando não ocorrer erro Nota 5
     */
    public static final String CODIGO_ERRO_TERCEIRA_OCORRENCIA = "CODIGO_ERRO_TERCEIRA_OCORRENCIA";
    /**
     * Brancos
     */
    public static final String BRANCOS_2 = "BRANCOS_2";
    /**
     * Data de vencimento do título
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    /**
     * Valor do título em moeda corrente
     */
    public static final String VALOR_TITULO = "VALOR_TITULO";
    /**
     * Número do Banco cobrador
     */
    public static final String NUMERO_BANCO_COBRADOR = "NUMERO_BANCO_COBRADOR";
    /**
     * Código da agência recebedora do título
     */
    public static final String CODIGO_AGENCIA_RECEBEDORA_TITULO = "CODIGO_AGENCIA_RECEBEDORA_TITULO";
    /**
     * Espécie de documento:
     * 01 = DUPLICATA
     * 02 = NOTA PROMISSÓRIA
     * 03 = APÓLICE OU NOTA DE SEGURO
     * 05 = RECIBO
     * 06 = DUPLICATA DE SERVIÇO
     * 07 = LETRA DE CÂMBIO
     */
    public static final String ESPECIE_DOCUMENTO = "ESPECIE_DOCUMENTO";
    /**
     * Valor da tarifa cobRADA
     */
    public static final String VALOR_TARIFA_COBRADA = "VALOR_TARIFA_COBRADA";
    /**
     * Valor de outras despesas
     */
    public static final String VALOR_OUTRAS_DESPESAS = "VALOR_OUTRAS_DESPESAS";
    /**
     * Valor dos juros de atraso
     */
    public static final String VALOR_JUROS_ATRASO = "VALOR_JUROS_ATRASO";
    /**
     * Valor do IOF devido
     */
    public static final String VALOR_IOF_DEVIDO = "VALOR_IOF_DEVIDO";
    /**
     * Valor do abatimento concedido
     */
    public static final String VALOR_ABATIMENTO_CONCEDIDO = "VALOR_ABATIMENTO_CONCEDIDO";
    /**
     * Valor do desconto concedido
     */
    public static final String VALOR_DESCONTO_CONCEDIDO = "VALOR_DESCONTO_CONCEDIDO";
    /**
     * Valor total recebido
     */
    public static final String VALOR_TOTAL_RECEBIDO = "VALOR_TOTAL_RECEBIDO";
    /**
     * Valor dos juros de mora
     */
    public static final String VALOR_JUROS_MORA = "VALOR_JUROS_MORA";
    /**
     * Valor de outros créditos
     */
    public static final String VALOR_OUTROS_CREDITOS = "VALOR_OUTROS_CREDITOS";
    /**
     * Branco
     */
    public static final String BRANCOS_3 = "BRANCOS_3";
    /**
     * Código de aceite = N
     */
    public static final String CODIGO_ACEITE = "CODIGO_ACEITE";
    /**
     * Branco
     */
    public static final String BRANCOS_4 = "BRANCOS_4";
    /**
     * Data do crédito
     */
    public static final String DATA_CREDITO = "DATA_CREDITO";
    /**
     * Nome do sacado
     */
    public static final String NOME_SACADO = "NOME_SACADO";
    /**
     * Identificador do Complemento (nota 2)
     */
    public static final String IDENTIFICADOR_COMPLEMENTO = "IDENTIFICADOR_COMPLEMENTO";
    /**
     * Unidade de valor moeda corrente = 00
     */
    public static final String UNIDADE_VALOR_MOEDA_CORRENTE = "UNIDADE_VALOR_MOEDA_CORRENTE";
    /**
     * Valor do título em outra unidade de valor
     */
    public static final String VALOR_TITULO_OUTRA_UNIDADE_VALOR = "VALOR_TITULO_OUTRA_UNIDADE_VALOR";
    /**
     * Valor do IOC em outra unidade de valor
     */
    public static final String VALOR_IOC_OUTRA_UNIDADE_VALOR = "VALOR_IOC_OUTRA_UNIDADE_VALOR";
    /**
     * Valor do débito ou crédito
     */
    public static final String VALOR_DEBITO_CREDITO = "VALOR_DEBITO_CREDITO";
    /**
     * D = DÉBITO
     * C = CRÉDITO
     */
    public static final String DEBITO_CREDITO = "DEBITO_CREDITO";
    /**
     * Brancos
     */
    public static final String BRANCOS_5 = "BRANCOS_5";
    /**
     * Número da versão
     */
    public static final String NUMERO_VERSAO = "NUMERO_VERSAO";
    /**
     * Número sequencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabRegistroMovimentoRetorno() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(TIPO_INSCRICAO_CEDENTE, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CGC_CPF_CEDENTE, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(CODIGO_AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(CONTA_MOVIMENTO_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(CONTA_COBRANCA_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(NUMERO_CONTROLE_PARTICIPANTE, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(NOSSO_NUMERO_1, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(BRANCOS_1, new FieldFillerArchetype(37, ' '));
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_OCORRENCIA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DATA_OCORRENCIA, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(SEU_NUMERO, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(NOSO_NUMERO_2, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(CODIGO_ORIGINAL_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_ERRO_PRIMEIRA_OCORRENCIA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_ERRO_SEGUNDA_OCORRENCIA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_ERRO_TERCEIRA_OCORRENCIA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(BRANCOS_2, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(VALOR_TITULO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(NUMERO_BANCO_COBRADOR, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_AGENCIA_RECEBEDORA_TITULO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(ESPECIE_DOCUMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VALOR_TARIFA_COBRADA, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_OUTRAS_DESPESAS, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_JUROS_ATRASO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_IOF_DEVIDO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_ABATIMENTO_CONCEDIDO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_DESCONTO_CONCEDIDO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_TOTAL_RECEBIDO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_JUROS_MORA, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_OUTROS_CREDITOS, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(BRANCOS_3, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_ACEITE, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(BRANCOS_4, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(DATA_CREDITO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(NOME_SACADO, new FieldStringFixedLengthArchetype(36));
        addFieldArchetype(IDENTIFICADOR_COMPLEMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(UNIDADE_VALOR_MOEDA_CORRENTE, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VALOR_TITULO_OUTRA_UNIDADE_VALOR, new FieldDecimalFixedLengthArchetype(13, 5));
        addFieldArchetype(VALOR_IOC_OUTRA_UNIDADE_VALOR, new FieldDecimalFixedLengthArchetype(13, 5));
        addFieldArchetype(VALOR_DEBITO_CREDITO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(DEBITO_CREDITO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(BRANCOS_5, new FieldFillerArchetype(11, ' '));
        addFieldArchetype(NUMERO_VERSAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));


    }
}
