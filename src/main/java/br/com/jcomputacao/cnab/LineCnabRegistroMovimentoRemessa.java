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
public class LineCnabRegistroMovimentoRemessa extends LineArchetype {

    /**
     * Código do registro = 1
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Tipo de inscrição do cedente:
     * 01 = CPF 02 = CGC
     */
    public static final String TIPO_INSCRICAO_CEDENTE = "TIPO_INSCRICAO_CEDENTE";
    /**
     * CGC ou CPF do cedente
     */
    public static final String CGC_CPF_CEDENTE = "CGC_CPF_CEDENTE";
    /**
     * Código de Transmissão (nota 1)
     */
    public static final String CODIGO_TRANSMISSAO = "CODIGO_TRANSMISSAO";
    /**
     * Número de controle do participante, para controle por
     * parte do cedente
     */
    public static final String NUMERO_CONTROLE_PARTICIPANTE = "NUMERO_CONTROLE_PARTICIPANTE";
    /**
     * Nosso número (nota 3)
     */
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    /**
     * Data do segundo desconto
     */
    public static final String DATA_SEGUNDO_DESCONTO = "DATA_SEGUNDO_DESCONTO";
    /**
     * Branco
     */
    public static final String BRANCO_1 = "BRANCO_1";
    /**
     * Informação de multa = 4, senão houver informar zero
     * Verificar página 16
     */
    public static final String INFORMCAO_MULTA = "INFORMCAO_MULTA";
    /**
     * Percentual multa por atraso %
     */
    public static final String PERCENTUAL_MULTA_POR_ATRASO = "PERCENTUAL_MULTA_POR_ATRASO";
    /**
     * Unidade de valor moeda corrente = 00
     */
    public static final String UNIDADE_VALOR_MOEDA_CORRENTE = "UNIDADE_VALOR_MOEDA_CORRENTE";
    /**
     * Valor do título em outra unidade (consultar banco)
     */
    public static final String VALOR_TITULO_OUTRA_UNIDADE = "VALOR_TITULO_OUTRA_UNIDADE";
    /**
     * Brancos
     */
    public static final String BRANCOS_1 = "BRANCOS_1";
    /**
     * Data para cobrança de multa. (Nota 4)
     */
    public static final String DATA_COBRANCA_MULTA = "DATA_COBRANCA_MULTA";
    /**
     * Código da carteira
     * 1 = ELETRÔNICA COM REGISTRO
     * 2 = ELETRÔNICA COM REGISTRO
     * 3 = CAUCIONADA ELETRÔNICA
     * 4 = ELETRÔNICA SEM REGISTRO
     * 5 = RÁPIDA COM REGISTRO
     * (BLOQUETE EMITIDO PELO CLIENTE)
     * 6 = CAUCIONADA RAPIDA
     * 7 = DESCONTADA ELETRÔNICA
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    /**
     * Código da ocorrência:
     * 01 = ENTRADA DE TÍTULO
     * 02 = BAIXA DE TÍTULO
     * 04 = CONCESSÃO DE ABATIMENTO
     * 05 = CANCELAMENTO ABATIMENTO
     * 06 = PRORROGAÇÃO DE VENCIMENTO
     * 07 = ALT. NÚMERO CONT.CEDENTE
     * 08 = ALTERAÇÃO DO SEU NÚMERO
     * 09 = PROTESTAR
     * 18 = SUSTAR PROTESTO
     */
    public static final String CODIGO_OCORRENCIA = "CODIGO_OCORRENCIA";
    /**
     * Seu número
     */
    public static final String SEU_NUMERO = "SEU_NUMERO";
    /**
     * Data de vencimento do título
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    /**
     * Valor do título - moeda corrente
     */
    public static final String VALOR_TITULO = "VALOR_TITULO";
    /**
     * Número do Banco cobrador = 033
     */
    public static final String NUMERO_BANCO_COBRADOR = "NUMERO_BANCO_COBRADOR";
    /**
     * Código da agência cobradora do Banco Santander
     * informar somente se carteira for igual a 5, caso
     * contrário, informar zeros.
     */
    public static final String CODIGO_AGENCIA_COBRADORA = "CODIGO_AGENCIA_COBRADORA";
    /**
     * Espécie de documento:
     * 01 = DUPLICATA
     * 02 = NOTA PROMISSÓRIA
     * 03 = APÓLICE / NOTA DE SEGURO
     * 05 = RECIBO
     * 06 = DUPLICATA DE SERVIÇO
     * 07 = LETRA DE CAMBIO
     */
    public static final String ESPECIE_DOCUMENTO = "ESPECIE_DOCUMENTO";
    /**
     * Tipo de aceite = N
     */
    public static final String TIPO_ACEITE = "TIPO_ACEITE";
    /**
     * Data da emissão do título
     */
    public static final String DATA_EMISSAO_TITULO = "DATA_EMISSAO_TITULO";
    /**
     * Primeira instrução cobrança
     */
    public static final String PRIMEIRA_INSTRUCAO_COBRANCA = "PRIMEIRA_INSTRUCAO_COBRANCA";
    /**
     * Segunda instrução cobrança
     * código
     * 00 = NÃO HÁ INSTRUÇÕES
     * 02 = BAIXAR APÓS QUINZE DIAS DO VENCIMENTO
     * 03 = BAIXAR APÓS 30 DIAS DO VENCIMENTO
     * 04 = NÃO BAIXAR
     * 06 = PROTESTAR (VIDE POSIÇÃO392/393)
     * 07 = NÃO PROTESTAR
     * 08 = NÃO COBRAR JUROS DE MORA
     */
    public static final String SEGUNDA_INSTRUCAO_COBRANCA = "SEGUNDA_INSTRUCAO_COBRANCA";
    /**
     * Valor de mora a ser cobrado por dia de atraso
     */
    public static final String VALOR_MORA_COBRADO_DIA_ATRASO = "VALOR_MORA_COBRADO_DIA_ATRASO";
    /**
     * Data limite para concessão de desconto
     */
    public static final String DATA_LIMITE_CONCESSAO_DESCONTO = "DATA_LIMITE_CONCESSAO_DESCONTO";
    /**
     * Valor de desconto a ser concedido
     */
    public static final String VALOR_DESCONTO_CONCEDIDO = "VALOR_DESCONTO_CONCEDIDO";
    /**
     * Valor do IOF a ser recolhido pelo Banco para nota deseguro
     */
    public static final String VALOR_IOF_RECOLHIDO = "VALOR_IOF_RECOLHIDO'";
    /**
     * Valor do abatimento a ser concedido ou valor do
     * segundo desconto. Vide posição 71.
     */
    public static final String VALOR_SEGUNDO_DESCONTO = "VALOR_SEGUNDO_DESCONTO";
    /**
     * Tipo de inscrição do sacado:
     * 01 = CPF 02 = CGC
     */
    public static final String TIPO_INSCRICAO_SACADO = "TIPO_INSCRICAO_SACADO";
    /**
     * CGC ou CPF do sacado
     */
    public static final String CGC_CPF_SACADO = "CGC_CPF_SACADO";
    /**
     * Nome do sacado
     */
    public static final String NOME_SACADO = "NOME_SACADO";
    /**
     * Endereço do sacado
     */
    public static final String ENDERECO_SACADO = "ENDERECO_SACADO";
    /**
     * Bairro do sacado
     */
    public static final String BAIRRO_SACADO = "BAIRRO_SACADO";
    /**
     * CEP do sacado
     */
    public static final String CEP_SACADO = "CEP_SACADO";
    /**
     * Complemento do CEP
     */
    public static final String COMPLEMENTO_CEP = "COMPLEMENTO_CEP";
    /**
     * Município do sacado
     */
    public static final String MUNICIPIO_SACADO = "MUNICIPIO_SACADO";
    /**
     * UF Estado do sacado
     */
    public static final String UF_ESTADO_SACADO = "UF_ESTADO_SACADO";
    /**
     * Nome do sacador ou coobrigado
     */
    public static final String NOME_SACADOR_COOBRIGADO = "NOME_SACADOR_COOBRIGADO";
    /**
     * Brancos
     */
    public static final String BRANCOS_2 = "BRANCOS_2";
    /**
     * Identificador do Complemento (i maiúsculo – vide nota 2)
     */
    public static final String IDENTIFICADOR_COMPLEMENTO = "IDENTIFICADOR_COMPLEMENTO";
    /**
     * Complemento (nota 2)
     */
    public static final String COMPLEMENTO = "COMPLEMENTO";
    /**
     * Brancos
     */
    public static final String BRANCOS_3 = "BRANCOS_3";
    /**
     * Número de dias para protesto.
     * Quando posições 157/158 ou 159/160 for igual a 06.
     */
    public static final String NUMERO_DIAS_PROTESTO = "NUMERO_DIAS_PROTESTO";
    /**
     * Branco
     */
    public static final String BRANCO_2 = "BRANCO_2";
    /**
     * Número seqüencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabRegistroMovimentoRemessa() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("1"));
        addFieldArchetype(TIPO_INSCRICAO_CEDENTE, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CGC_CPF_CEDENTE, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(CODIGO_TRANSMISSAO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NUMERO_CONTROLE_PARTICIPANTE, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(NOSSO_NUMERO, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(DATA_SEGUNDO_DESCONTO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(BRANCO_1, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(INFORMCAO_MULTA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(PERCENTUAL_MULTA_POR_ATRASO, new FieldDecimalFixedLengthArchetype(4,2));
        addFieldArchetype(UNIDADE_VALOR_MOEDA_CORRENTE, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VALOR_TITULO_OUTRA_UNIDADE, new FieldDecimalFixedLengthArchetype(13,5));
        addFieldArchetype(BRANCOS_1, new FieldFillerArchetype(4, ' '));
        addFieldArchetype(DATA_COBRANCA_MULTA, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_OCORRENCIA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SEU_NUMERO, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(VALOR_TITULO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(NUMERO_BANCO_COBRADOR, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_AGENCIA_COBRADORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(ESPECIE_DOCUMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(TIPO_ACEITE, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DATA_EMISSAO_TITULO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(PRIMEIRA_INSTRUCAO_COBRANCA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SEGUNDA_INSTRUCAO_COBRANCA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(VALOR_MORA_COBRADO_DIA_ATRASO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(DATA_LIMITE_CONCESSAO_DESCONTO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(VALOR_DESCONTO_CONCEDIDO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(VALOR_IOF_RECOLHIDO, new FieldDecimalFixedLengthArchetype(13,5));
        addFieldArchetype(VALOR_SEGUNDO_DESCONTO, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(TIPO_INSCRICAO_SACADO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CGC_CPF_SACADO, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(NOME_SACADO, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(ENDERECO_SACADO, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(BAIRRO_SACADO, new FieldStringFixedLengthArchetype(12));
        addFieldArchetype(CEP_SACADO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(COMPLEMENTO_CEP, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(MUNICIPIO_SACADO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(UF_ESTADO_SACADO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NOME_SACADOR_COOBRIGADO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(BRANCOS_2, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(IDENTIFICADOR_COMPLEMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COMPLEMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(BRANCOS_3, new FieldFillerArchetype(6, ' '));
        addFieldArchetype(NUMERO_DIAS_PROTESTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(BRANCO_2, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
    }
}
