/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroTraillerRetorno extends LineArchetype {

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
     * Quantidade de registros em cobrança caucionada
     * referente ao cedente
     */
    public static final String QUANTIDADE_REGISTROS_COBRANCAS_CAUCIONADA_REFERENTE_CEDENTE = "QUANTIDADE_REGISTROS_COBRANCAS_CAUCIONADA_REFERENTE_CEDENTE";
    /**
     * Valor dos títulos em cobrança caucionada referente ao cedente
     */
    public static final String VALOR_TITULOS_COBRANCA_CAUCIONADA_REFERENTE_CEDENTE = "VALOR_TITULOS_COBRANCA_CAUCIONADA_REFERENTE_CEDENTE";
    /**
     * Número do aviso da cobrança caucionada
     */
    public static final String NUMERO_AVISO_COBRANCA_CAUCIONADA = "NUMERO_AVISO_COBRANCA_CAUCIONADA";
    /**
     * Brancos
     */
    public static final String BRANCOS_3 = "BRANCOS_3";
    /**
     * Quantidade de registros em cobrança descontada
     * referente ao cedente
     */
    public static final String QUANTIDADE_REGISTROS_COBRANCAS_DESCONTADA_REFERENTE_CEDENTE = "QUANTIDADE_REGISTROS_COBRANCAS_DESCONTADA_REFERENTE_CEDENTE";
    /**
     * Valor dos títulos em cobrança descontada referente ao cedente
     */
    public static final String VALOR_TITULOS_COBRANCA_DESCONTADA_REFERENTE_CEDENTE = "VALOR_TITULOS_COBRANCA_DESCONTADA_REFERENTE_CEDENTE";
    /**
     * Número do aviso da cobrança descontada
     */
    public static final String NUMERO_AVISO_COBRANCA_DESCONTADA = "NUMERO_AVISO_COBRANCA_DESCONTADA";
    /**
     * Brancos
     */
    public static final String BRANCOS_4 = "BRANCOS_4";
    /**
     * Número da versão
     */
    public static final String NUMERO_VERSAO = "NUMERO_VERSAO";
    /**
     * Número sequencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabRegistroTraillerRetorno() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("9"));
        addFieldArchetype(CODIGO_REMESSA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(BRANCOS_1, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE, new FieldDecimalFixedLengthArchetype(14));
        addFieldArchetype(NUMERO_AVISO_COBRANCA_SIMPLES, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(BRANCOS_2, new FieldFillerArchetype(50, ' '));
        addFieldArchetype(QUANTIDADE_REGISTROS_COBRANCAS_CAUCIONADA_REFERENTE_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_TITULOS_COBRANCA_CAUCIONADA_REFERENTE_CEDENTE, new FieldDecimalFixedLengthArchetype(14));
        addFieldArchetype(NUMERO_AVISO_COBRANCA_CAUCIONADA, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(BRANCOS_3, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(QUANTIDADE_REGISTROS_COBRANCAS_DESCONTADA_REFERENTE_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(VALOR_TITULOS_COBRANCA_DESCONTADA_REFERENTE_CEDENTE, new FieldDecimalFixedLengthArchetype(14));
        addFieldArchetype(NUMERO_AVISO_COBRANCA_DESCONTADA, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(BRANCOS_4, new FieldFillerArchetype(224, ' '));
        addFieldArchetype(NUMERO_VERSAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));

    }
}
