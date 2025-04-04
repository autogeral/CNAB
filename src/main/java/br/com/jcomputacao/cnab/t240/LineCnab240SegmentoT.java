package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240SegmentoT extends LineArchetype {

    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE
     * TIPO DE OPERACAO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO 'T'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO ' '
     */
    public static final String TIPO_MOVIMENTO = "TIPO_MOVIMENTO";
    /**
     * CODIGO DE MOVIMENTO DE RETORNO
     * Códigos de movimento de retorno, informados pelo Banco do Brasil:
     * 02 – Entrada confirmada,
     * 03 – Entrada Rejeitada,
     * 04 – Transferência de Carteira/Entrada,
     * 05 – Transferência de Carteira/Baixa,
     * 06 – Liquidação,
     * 09 – Baixa,
     * 11 – Títulos em Carteira (em ser),
     * 12 – Confirmação Recebimento Instrução de Abatimento,
     * 13 – Confirmação Recebimento Instrução de Cancelamento Abatimento,
     * 14 – Confirmação Recebimento Instrução Alteração de Vencimento,
     * 15 – Franco de Pagamento,
     * 17 – Liquidação Após Baixa ou Liquidação Título Não Registrado,
     * 19 – Confirmação Recebimento Instrução de Protesto,
     * 20 – Confirmação Recebimento Instrução de Sustação/Cancelamento de Protesto,
     * 23 – Remessa a Cartório (Aponte em Cartório),
     * 24 – Retirada de Cartório e Manutenção em Carteira,
     * 25 – Protestado e Baixado (Baixa por ter sido Protestado),
     * 26 – Instrução Rejeitada,
     * 27 – Confirmação do Pedido de Alteração de Outros Dados,
     * 28 – Débito de Tarifas/Custas,
     * 29 – Ocorrências do Sacado,
     * 30 – Alteração de Dados Rejeitada,
     * 44 – Título pago com cheque devolvido,
     * 50 – Título pago com cheque pendente de compensação.
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
    /**
     * AGENCIA MANTENEDORA
     * 5 ESPACOS
     * POSICAO 018 022
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 023 023
     * PICTURE 9(01)
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA = "DIGITO_VERIFICADOR_AGENCIA";
    /**
     * NUMERO DA CONTA CORRENTE
     * POSICAO 024 035
     */
    public static final String NUMERO_CONTA_CORRENTE = "NUMERO_CONTA_CORRENTE";
    /**
     * DIGITO VERIFICADOR DA CONTA
     * POSICAO 036 036
     */
    public static final String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";
    /**
     * DIGITO VERIFICADOR DA CONTA / AGENCIA
     * POSICAO 037 037
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA_CONTA = "DIGITO_VERIFICADOR_AGENCIA_CONTA";
    /**
     * IDENTIFICACAO DO TITULO
     * POSICAO 038 057
     */
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    /**
     * CODIGO DA CARTEIRA
     * POSICAO 058 058
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    /**
     * NUMERO DO DOCUMENTO DE COBRANCA
     * POSICAO 059 073
     */
    public static final String NUMERO_DOC_COBRANCA = "NUMERO_DOC_COBRANCA";
    /**
     * DATA VENCIMENTO DO TITULO
     * POSICAO 074 081
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    /**
     * VALOR NOMINAL DO TITULO
     * POSICAO 082 096
     */
    public static final String VALOR_NOMINAL_TITULO = "VALOR_NOMINAL_TITULO";
    /**
     * NUMERO DO BANCO
     * POSICAO 097 099
     */
    public static final String NUMERO_BANCO = "NUMERO_BANCO";
    /**
     * AGENCIA COBRADORA / RECEBEDORA
     * POSICAO 100 104
     */
    public static final String AGENCIA_RECEBEDORA = "AGENCIA_RECEBEDORA";
    /**
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 105 105
     */
    public static final String DIGITO_VERIFICADOR_AG_RECEBEDORA = "DIGITO_VERIFICADOR_AG_RECEBEDORA";
    /**
     * IDENTIFICACAO DO TITULO NA EMPRESA
     * POSICAO 106 130
     */
    public static final String CAMPO_USO_EMPRESA = "CAMPO_USO_EMPRESA";
    /**
     * CODIGO DA MOEDA
     * POSICAO 131 132
     */
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";
    /**
     * TIPO DA INSCRICAO
     * NAO INFORMADO
     * POSICAO 133 133
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * NUMERO DE INSCRICAO
     * NAO INFORMADO
     * POSICAO 134 148
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * NOME
     * NAO INFORMADO
     * POSICAO 149 188
     */
    public static final String NOME = "NOME";
    /**
     * NUMERO DO CONTRATANTE DA OPERACAO DE CREDITO
     * NAO INFORMADO
     * POSICAO 189 198
     */
    public static final String NUM_CONTRATO = "NUM_CONTRATO";
    /**
     * VALOR DA TARIFA / CUSTAS
     * POSICAO 189 198
     */
    public static final String VALOR_TARIFA_CUSTAS = "VALOR_TARIFA_CUSTAS";
    /**
     * IDENTIFICACAO PARA REJEICOES, TARIFAS,
     * CUSTAS, LIQUIDACAO E BAIXAS
     *
     * Os códigos de Rejeições, Tarifas, Custas, Liquidações e
     * Baixas, estão diretamente relacionados com os Códigos de
     * Movimentos Retorno (pos. 16 e 17). Vide tabelas leiaute
     * Febraban.
     * Exceção: Desconsiderar
     * Código de rejeição Febraban:
     * 52 - Unidade da Federação Inválida
     * Considerar
     * Código de rejeição Banco do Brasil:
     * 52 - Registro de Título já liquidado Cart. 17
     *
     * Detalhamento para DDA:
     * Para título DDA, o campo “Código de movimento de retorno”,
     * posição 16 a 17, apresentará a mensagem “02 – Entrada
     * confirmada”. Além disso, no campo “Motivo da Ocorrência”,
     * posição 214 a 223, haverá a mensagem “A4 – Sacado DDA”.
     * POSICAO 214 223
     */
    public static final String MOTIVO_OCORRENCIA = "MOTIVO_OCORRENCIA";

    /**
     * USO EXCLUSIVO FEBRABAN
     * POSICAO 224 240
     * CONTEUDO BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240SegmentoT() {

//*****************************Registro Segmento T****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("T"));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_CONTA_CORRENTE, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA_CONTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_DOC_COBRANCA, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_NOMINAL_TITULO, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(NUMERO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(AGENCIA_RECEBEDORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VERIFICADOR_AG_RECEBEDORA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CAMPO_USO_EMPRESA, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(NUM_CONTRATO, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(VALOR_TARIFA_CUSTAS, new FieldDecimalFixedLengthArchetype(13, 2));
        addFieldArchetype(MOTIVO_OCORRENCIA, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(17, ' '));
    }
}

