package br.com.jcomputacao.cnab.bb400;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author murilo.lima
 */
public class LineCnabBBRegistroTraillerRetorno extends LineArchetype {

    /**
     * Código do registro = 9
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Código da remessa = 2
     */
    public static final String CODIGO_REMESSA = "CODIGO_REMESSA";
    /**
     * Código do serviço = 01
     */
    public static final String CODIGO_SERVICO = "CODIGO_SERVICO";
    /**
     * Código do Banco = 033
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * Brancos
     */
    public static final String BRANCOS_1 = "BRANCOS_1";
    /**
     * Quantidade de registros em cobrança simples referente ao cedente
     */
    public static final String QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE = "QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE";
    /**
     * Valor dos títulos em cobrança simples referente ao cendente
     */
    public static final String VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE = "VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE";
    /**
     * Número do aviso da cobrança simples
     */
    public static final String NUMERO_AVISO_COBRANCA_SIMPLES = "NUMERO_AVISO_COBRANCA_SIMPLES";
    /**
     * Brancos
     */
    public static final String BRANCOS_2 = "BRANCOS_2";
    /**
     * Quantidade de registros em cobrança caucionada referente ao cedente
     */
    public static final String QUANTIDADE_REGISTROS_COBRANCAS_CONFIRMACAO_ENTRADA = "QUANTIDADE_REGISTROS_COBRANCAS_CONFIRMACAO_ENTRADA";
    /**
     * Valor dos títulos em cobrança caucionada referente ao cedente
     */
    public static final String VALOR_TITULOS_COBRANCA_CONFIRMACAO_ENTRADA = "VALOR_TITULOS_COBRANCA_CONFIRMACAO_ENTRADA";
    /**
     * Valor dos títulos em cobrança ocorrência 06 - Liquidação
     */
    public static final String VALOR_TITULOS_COBRANCA_LIQUIDACAO = "VALOR_TITULOS_COBRANCA_LIQUIDACAO";
    /**
     * Quantidade registros ocorrência 06 - Liquidação
     */
    public static final String QUANTIDADE_REGISTROS_COBRANCAS_LIQUIDACAO = "QUANTIDADE_REGISTROS_COBRANCAS_LIQUIDACAO";
        /**
     * Valor dos títulos ocorrência 06
     */
    public static final String VALOR_TITULOS_OCORRENCIA_6 = "VALOR_TITULOS_OCORRENCIA_6";
    /**
     * Quantidade registros ocorrência 09 a 10 - Títulos baixados
     */
    public static final String QUANTIDADE_REGISTROS_TITULOS_BAIXADOS = "QUANTIDADE_REGISTROS_TITULOS_BAIXADOS";
    /**
     * Valor dos títulos em cobrança ocorrência 09 a 10 - Baixados
     */
    public static final String VALOR_TITULOS_BAIXADOS = "VALOR_TITULOS_BAIXADOS";
    /**
     * Quantidade registros ocorrência 13 - Abatimentos Cancelados
     */
    public static final String QUANTIDADE_REGISTROS_ABATIMENTO_CANCELADO = "QUANTIDADE_REGISTROS_ABATIMENTO_CANCELADO";
    /**
     * Valor dos títulos em cobrança ocorrência 13 - Abatimentos cancelados
     */
    public static final String VALOR_TITULOS_ABATIMENTO_CANCELADO = "VALOR_TITULOS_ABATIMENTO_CANCELADO";    
    /**
     * Quantidade registros ocorrência 14 - Vencimento Alterado
     */
    public static final String QUANTIDADE_REGISTROS_VENCIMENTO_ALTERADO = "QUANTIDADE_REGISTROS_VENCIMENTO_ALTERADO";
    /**
     * Valor dos títulos em cobrança ocorrência 14 - Vencimento Alterado
     */
    public static final String VALOR_TITULOS_VENCIMENTO_ALTERADO = "VALOR_TITULOS_VENCIMENTO_ALTERADO";        
    /**
     * Quantidade registros ocorrência 12 - Abatimento Concedido
     */
    public static final String QUANTIDADE_REGISTROS_ABATIMENTO_CONCEDIDO = "QUANTIDADE_REGISTROS_ABATIMENTO_CONCEDIDO";
    /**
     * Valor dos títulos em cobrança ocorrência 12 - Abatimento Concedido
     */
    public static final String VALOR_TITULOS_ABATIMENTO_CONCEDIDO = "VALOR_TITULOS_ABATIMENTO_CONCEDIDO";            
    /**
     * Quantidade registros ocorrência 19 - Instrução Protesto
     */
    public static final String QUANTIDADE_REGISTROS_INSTRUCAO_PROTESTO = "QUANTIDADE_REGISTROS_INSTRUCAO_PROTESTO";
    /**
     * Valor dos títulos em cobrança ocorrência 19 - Instrução Protesto
     */
    public static final String VALOR_TITULOS_INSTRUCAO_PROTESTO = "VALOR_TITULOS_INSTRUCAO_PROTESTO";                
    /**
     * Brancos
     */
    public static final String BRANCOS_3 = "BRANCOS_3";    
    /**
     * Valor total dos rateios efetuados
     */
    public static final String VALOR_TOTAL_RATEIOS = "VALOR_TOTAL_RATEIOS";
    /**
     * Quantidade total dos rateios efetuados
     */
    public static final String QUANTIDADE_TOTAL_RATEIOS = "QUANTIDADE_TOTAL_RATEIOS";
    /**
     * Brancos
     */
    public static final String BRANCOS_4 = "BRANCOS_4";    
    /**
     * Número sequencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabBBRegistroTraillerRetorno() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("9"));
        addFieldArchetype(CODIGO_REMESSA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(BRANCOS_1, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE, new FieldDecimalFixedLengthArchetype(14, 2));
        addFieldArchetype(NUMERO_AVISO_COBRANCA_SIMPLES, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(BRANCOS_2, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(QUANTIDADE_REGISTROS_COBRANCAS_CONFIRMACAO_ENTRADA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(VALOR_TITULOS_COBRANCA_CONFIRMACAO_ENTRADA, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(VALOR_TITULOS_COBRANCA_LIQUIDACAO, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(QUANTIDADE_REGISTROS_COBRANCAS_LIQUIDACAO, new FieldIntegerFixedLengthArchetype(5));        
        addFieldArchetype(VALOR_TITULOS_OCORRENCIA_6, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(QUANTIDADE_REGISTROS_TITULOS_BAIXADOS, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(VALOR_TITULOS_BAIXADOS, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(QUANTIDADE_REGISTROS_ABATIMENTO_CANCELADO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(VALOR_TITULOS_ABATIMENTO_CANCELADO, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(QUANTIDADE_REGISTROS_VENCIMENTO_ALTERADO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(VALOR_TITULOS_VENCIMENTO_ALTERADO, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(QUANTIDADE_REGISTROS_ABATIMENTO_CONCEDIDO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(VALOR_TITULOS_ABATIMENTO_CONCEDIDO, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(QUANTIDADE_REGISTROS_INSTRUCAO_PROTESTO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(VALOR_TITULOS_INSTRUCAO_PROTESTO, new FieldDecimalFixedLengthArchetype(12, 2));
        addFieldArchetype(BRANCOS_3, new FieldFillerArchetype(174, ' '));        
        addFieldArchetype(VALOR_TOTAL_RATEIOS, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(QUANTIDADE_TOTAL_RATEIOS, new FieldIntegerFixedLengthArchetype(8));        
        addFieldArchetype(BRANCOS_4, new FieldFillerArchetype(9, ' '));        
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));

    }
}
