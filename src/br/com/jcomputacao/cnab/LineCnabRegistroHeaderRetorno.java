/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroHeaderRetorno extends LineArchetype {

    /**
     * Código do registro = 0
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Código da remessa = 1
     */
    public static final String CODIGO_REMESSA = "CODIGO_REMESSA";
    /**
     * Literal de transmissão = REMESSA
     */
    public static final String LITERAL_TRANSMISSAO = "LITERAL_TRANSMISSAO";
    /**
     * Código do serviço = 01
     */
    public static final String CODIGO_SERVICO = "CODIGO_SERVICO";
    /**
     * Literal de serviço = COBRANÇA
     */
    public static final String LITERAL_SERVICO = "LITERAL_SERVICO";
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
     * Nome do cedente
     */
    public static final String NOME_CEDENTE = "NOME_CEDENTE";
    /**
     * Código do Banco = 033
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * Nome do Banco = SANTANDER
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * Data do movimento
     */
    public static final String DATA_MOVIMENTO = "DATA_MOVIMENTO";
    /**
     * Zeros
     */
    public static final String ZEROS = "ZEROS";
    /**
     * Código do cedente
     */
    public static final String CODIGO_CEDENTE = "CODIGO_CEDENTE";
    /**
     * Brancos
     */
    public static final String BRANCOS = "BRANCOS";
    /**
     * Número da versão
     */
    public static final String NUMERO_VERSAO = "NUMERO_VERSAO";
    /**
     * Número seqüencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabRegistroHeaderRetorno() {
        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("0"));
        addFieldArchetype(CODIGO_REMESSA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(LITERAL_TRANSMISSAO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(CODIGO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(LITERAL_SERVICO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CODIGO_AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(CONTA_MOVIMENTO_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(CONTA_COBRANCA_CEDENTE, new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(DATA_MOVIMENTO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("0000000000"));
        addFieldArchetype(CODIGO_CEDENTE, new FieldStringFixedLengthArchetype(277));
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(4, ' '));
        addFieldArchetype(NUMERO_VERSAO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
    }
}
