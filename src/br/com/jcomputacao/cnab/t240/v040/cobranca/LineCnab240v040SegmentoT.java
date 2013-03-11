package br.com.jcomputacao.cnab.t240.v040.cobranca;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2012 09:48:57
 * @author Murilo
 */
public class LineCnab240v040SegmentoT extends LineArchetype{

    /**
     * 01
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * 02
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * 03
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 04
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE
     * TIPO DE OPERACAO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * 05
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO 'T'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * 06
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 015 015
     * CONTEUDO ' '
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * 07
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
     * 08
     * AGENCIA DO CEDENTE
     * 5 ESPACOS
     * POSICAO 018 021
     */
    public static final String AGENCIA_CEDENTE = "AGENCIA_CEDENTE";
    /**
     * 09
     * DIGITO AGENCIA CEDENTE
     * POSICAO 022 022
     * PICTURE 9(01)
     */
    public static final String DIGITO_AGENCIA_CEDENTE = "DIGITO_AGENCIA_CEDENTE";
    /**
     * 10
     * NUMERO DA CONTA CORRENTE
     * POSICAO 022 031
     */
    public static final String NUMERO_CONTA_CORRENTE = "NUMERO_CONTA_CORRENTE";
    /**
     * 11
     * DIGITO VERIFICADOR DA CONTA
     * POSICAO 032 032
     */
   
    public static final String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";
    /**
     * 12
     * RESERVADO USO BANCO
     * POSIÇÃO: 033 040
     */
    public static String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";
    
    /**
     * 13
     * NOSSO NÚMERO
     * IDENTIFICACAO DO TITULO
     * POSICAO 038 053
     */
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    /**
     * 14
     * CODIGO DA CARTEIRA
     * POSICAO 054 054
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    /**
     * 15
     * NUMERO DO DOCUMENTO DE COBRANCA
     * POSICAO 055 069
     */
    public static final String NUMERO_DOC_COBRANCA = "NUMERO_DOC_COBRANCA";
    /**
     * 16
     * DATA VENCIMENTO DO TITULO
     * POSICAO 070 077
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    /**
     * 17
     * VALOR NOMINAL DO TITULO
     * POSICAO 078 092
     */
    public static final String VALOR_NOMINAL_TITULO = "VALOR_NOMINAL_TITULO";
    /**
     * 18
     * NUMERO DO BANCO
     * POSICAO 093 095
     */
    public static final String NUMERO_BANCO = "NUMERO_BANCO";
    /**
     * 19
     * AGENCIA COBRADORA / RECEBEDORA
     * POSICAO 96 99
     */
    public static final String AGENCIA_RECEBEDORA = "AGENCIA_RECEBEDORA";
    /**
     * 20
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 100 100
     */
    public static final String DIGITO_VERIFICADOR_AG_CEDENTE = "DIGITO_VERIFICADOR_AG_CEDENTE";
    /**
     * 21
     * IDENTIFICACAO DO TITULO NA EMPRESA
     * POSICAO 101 125
     */
    public static final String IDENTIFICACAO_TITULO_EMPRESA = "IDENTIFICACAO_TITULO_EMPRESA";
    /**
     * 22
     * CODIGO DA MOEDA
     * POSICAO 126 127
     */
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";
    /**
     * 23
     * TIPO DA INSCRICAO
     * NAO INFORMADO
     * POSICAO 128 128
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 24
     * NUMERO DE INSCRICAO
     * NAO INFORMADO
     * POSICAO 129 143
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * 25
     * NOME
     * NAO INFORMADO
     * POSICAO 144 183
     */
    public static final String NOME = "NOME";
    /**
     * 26
     * CONTA COBRANÇA
     * POSICAO 184 193
     */
    public static final String CONTA_COBRANCA = "CONTA_COBRANCA";
    /**
     * 28
     * VALOR DA TARIFA / CUSTAS
     * POSICAO 194 208
     */
    public static final String VALOR_TARIFA_CUSTAS = "VALOR_TARIFA_CUSTAS";
    /**
     * 29
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
     * POSICAO 209 218
     */
    public static final String MOTIVO_OCORRENCIA = "MOTIVO_OCORRENCIA";

    /**
     * 30
     * USO EXCLUSIVO FEBRABAN
     * POSICAO 224 240
     * CONTEUDO BRANCOS
     */
    public static final String RESERVADO_USO_BANCO3 = "RESERVADO_USO_BANCO3";

    public LineCnab240v040SegmentoT() {

        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("T"));
        //06
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldStringFixedLengthArchetype(1));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(4));
        //09
        addFieldArchetype(DIGITO_AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(NUMERO_CONTA_CORRENTE, new FieldIntegerFixedLengthArchetype(9));
        //11
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA, new FieldIntegerFixedLengthArchetype(1));
        //12
        addFieldArchetype(RESERVADO_USO_BANCO2, new FieldStringFixedLengthArchetype(1));
        //13
        addFieldArchetype(NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));
        //14
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        //15
        addFieldArchetype(NUMERO_DOC_COBRANCA, new FieldStringFixedLengthArchetype(15));
        //16
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //17
        addFieldArchetype(VALOR_NOMINAL_TITULO, new FieldDecimalFixedLengthArchetype(15,2));
        //18
        addFieldArchetype(NUMERO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //19
        addFieldArchetype(AGENCIA_RECEBEDORA, new FieldIntegerFixedLengthArchetype(4));
        //20
        addFieldArchetype(DIGITO_VERIFICADOR_AG_CEDENTE, new FieldIntegerFixedLengthArchetype(1));
        //21
        addFieldArchetype(IDENTIFICACAO_TITULO_EMPRESA, new FieldStringFixedLengthArchetype(25));
        //22
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        //23
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //24
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        //25
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(40));
        //26
        addFieldArchetype(CONTA_COBRANCA, new FieldStringFixedLengthArchetype(10));
        //27
        addFieldArchetype(VALOR_TARIFA_CUSTAS, new FieldDecimalFixedLengthArchetype(15,2));
        //28
        addFieldArchetype(MOTIVO_OCORRENCIA, new FieldStringFixedLengthArchetype(10));
        //29
        addFieldArchetype(RESERVADO_USO_BANCO3, new FieldFillerArchetype(22, ' '));
    }
    
}
