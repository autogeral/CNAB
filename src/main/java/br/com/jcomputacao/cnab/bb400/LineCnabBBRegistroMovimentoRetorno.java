package br.com.jcomputacao.cnab.bb400;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author murilo.lima
 */
public class LineCnabBBRegistroMovimentoRetorno extends LineArchetype {

    /**
     * Código do registro = 1
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Tipo de inscrição do cedente 01 = CPF 02 = CGC
     */
    public static final String TIPO_INSCRICAO_CEDENTE = "TIPO_INSCRICAO_CEDENTE";
    /**
     * CGC ou CPF do cedente
     */
    public static final String CGC_CPF_CEDENTE = "CGC_CPF_CEDENTE";
    /**
     * Zeros
     */
    public static final String ZEROS = "ZEROS";
    /**
     * Identificação empresa no banco - Zero + Carteira + Agência + Conta
     * Corrente
     */
    public static final String INDENTIFICACAO_CEDENTE = "INDENTIFICACAO_CEDENTE";
    /**
     * Número de controle do participante, para controle por parte do cedente
     */
    public static final String NUMERO_CONTROLE_PARTICIPANTE = "NUMERO_CONTROLE_PARTICIPANTE";
    /**
     * Zeros 2
     */
    public static final String ZEROS_2 = "ZEROS_2";
    /**
     * Nosso número
     */
    public static final String NOSSO_NUMERO_1 = "NOSSO_NUMERO_1";
    /**
     * Zeros 3
     */
    public static final String ZEROS_3 = "ZEROS_3";
    /**
     * Zeros 4
     */
    public static final String ZEROS_4 = "ZEROS_4";
    /**
     * Indicado de rateio 105 a 105 - Identificações do Rateio Somente será
     * informado “R”, para a Empresa participante da rotina de rateio de
     * crédito, caso não, será informado zeros.
     */
    public static final String INDICADOR_RATEIO = "INDICADOR_RATEIO";
    /**
     * Zeros 5
     */
    public static final String ZEROS_5 = "ZEROS_5";
    /**
     * Código da carteira: 2 = ELETRÔNICA COM REGISTRO 3 = CAUCIONADA ELETRÔNICA
     * 4 = COBRANÇA SEM REGISTRO 5 = RÁPIDA COM REGISTRO (BLOQUETE EMITIDO PELO
     * CLIENTE) 7 = DESCONTADA ELETRÔNICA
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    /**
     * Código de ocorrência: 01 = TÍTULO NÃO EXISTE 02 = ENTRADA TÍT. CONFIRMADA
     * 03 = ENTRADA TÍT. REJEITADA 06 = LIQUIDAÇÃO 07 = LIQUIDAÇÃO POR CONTA 08
     * = LIQUIDAÇÃO POR SALDO 09 = BAIXA AUTOMÁTICA 10 = TÍT. BAIX. CONF.
     * INSTRUÇÃO 11 = EM SER 12 = ABATIMENTO CONCEDIDO 13 = ABATIMENTO CANCELADO
     * 14 = PRORROGAÇÃO DE VENCIMENTO 15 = CONFIRMAÇÃO DE PROTESTO16 = TÍT. JÁ
     * BAIXADO/LIQUIDADO 17 = LIQUIDADO EM CARTÓRIO 21 = TÍT. ENVIADO A CARTÓRIO
     * 22 = TÍT. RETIRADO DE CARTÓRIO 24 = CUSTAS DE CARTÓRIO 25 = PROTESTAR
     * TÍTULO 26 = SUSTAR PROTESTO
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
     * Motivos das Rejeições para os Códigos de Ocorrência da Posição 109 a 110
     * Motivo Vide Obs. Pág. 39

     */
    public static final String MOTIVO_REJEICAO_OCORRENCIA = "MOTIVO_REJEICAO_OCORRENCIA";
    /**
     * Número do cartório     
     */
    public static final String NUMERO_CARTORIO = "NUMERO_CARTORIO";
    /**
     * Número do protocolo
     */
    public static final String NUMERO_PROTOCOLO = "NUMERO_PROTOCOLO";
    /**
     * Brancos
     */
    public static final String BRANCOS_2 = "BRANCOS_2";
    /**
     * Motivo do Código de Ocorrência 25 (Confirmação de Instrução de Protesto
     * Falimentar e (Do Código de Ocorrência 19 Confirmação de Instrução de
     * Protesto)
     */
    public static final String MOTIVO_OCORRENCIA_25 = "MOTIVO_OCORRENCIA_25";
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
     * Espécie de documento: 01 = DUPLICATA 02 = NOTA PROMISSÓRIA 03 = APÓLICE
     * OU NOTA DE SEGURO 05 = RECIBO 06 = DUPLICATA DE SERVIÇO 07 = LETRA DE
     * CÂMBIO
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
     * Quando cheque Bradesco informe 0237
     */
    public static final String CHEQUE_BRADESCO = "CHEQUE_BRADESCO";    
    /**
     * Branco
     */
    public static final String BRANCOS_4 = "BRANCOS_4";
    /**
     * Data do crédito
     */
    public static final String DATA_CREDITO = "DATA_CREDITO";
    /**
     * Origem do pagamento Informa o código correspondente ao canal de pagamento
     * para os códigos de ocorrência (06 – Liquidação, 15 – Liquidação em
     * Cartório 17 - Liquidação após baixa ou título não registrado).
     * Obs.: Essa informação será disponibilizada no arquivo retorno somente para as empresas previamente
     * cadastradas para essa condição.
     * Guichê de Caixa:
     * 01 – CICS (AT00)
     * 07 – TERM. GER. CBCA PF8
     * 10 – TER. GER. CBCA SENHAS
     * 74 – BOCA DO CAIXA
     * 75 – RETAGUARDA
     * 76 – SUBCENTRO
     * BDN:
     * 02 – BDN MULTI SAQUE
     * 24 – TERM. MULTI FUNÇÃO
     * 27 – PAG CONTAS
     * Internet:
     * 14 – INTERNET
     * 35 – NET EMPRESA
     * 52 – SHOP CREDIT
     * 73 – PAG FOR
     * Fone Fácil:
     * 13 – FONE FÁCIL
     * 67 – DEB AUTOMÁTICO
     * 77 – CARTAO DE CRÉDITO
     * 78 – COMPENSAÇÃO ELETRÔNICA
     * 82 - BRADESCO EXPRESSO
     */
    public static final String ORIGEM_PAGAMENTO = "ORIGEM_PAGAMENTO";            
    /**
     * Brancos
     */
    public static final String BRANCOS_5 = "BRANCOS_5";    
    /**
     * Número sequencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabBBRegistroMovimentoRetorno() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(TIPO_INSCRICAO_CEDENTE, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CGC_CPF_CEDENTE, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("000"));
        addFieldArchetype(INDENTIFICACAO_CEDENTE, new FieldStringFixedLengthArchetype(17));
        addFieldArchetype(NUMERO_CONTROLE_PARTICIPANTE, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(ZEROS_2, new FieldDefaultArchetype("00000000"));
        addFieldArchetype(NOSSO_NUMERO_1, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(ZEROS_3, new FieldDefaultArchetype("0000000000"));
        addFieldArchetype(ZEROS_4, new FieldDefaultArchetype("000000000000"));
        addFieldArchetype(INDICADOR_RATEIO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(ZEROS_5, new FieldDefaultArchetype("00"));
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_OCORRENCIA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DATA_OCORRENCIA, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(SEU_NUMERO, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(NOSO_NUMERO_2, new FieldIntegerFixedLengthArchetype(20));
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
        addFieldArchetype(BRANCOS_2, new FieldFillerArchetype(2, ' '));
        addFieldArchetype(MOTIVO_OCORRENCIA_25, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DATA_CREDITO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(ORIGEM_PAGAMENTO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(BRANCOS_3, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(CHEQUE_BRADESCO, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(MOTIVO_REJEICAO_OCORRENCIA, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(BRANCOS_4, new FieldFillerArchetype(40, ' '));
        addFieldArchetype(NUMERO_CARTORIO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_PROTOCOLO, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(BRANCOS_5, new FieldFillerArchetype(14, ' '));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));

    }
}
