/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroOpcionalMovimentoRemessa extends LineArchetype {

    /**
     * Código do registro = 7
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Uso do Banco
     */
    public static final String USO_BANCO_1 = "USO_BANCO_1";
    /**
     * Código de Transmissão (nota 1)
     */
    public static final String CODIGO_TRANSMISSAO = "CODIGO_TRANSMISSAO";
    /**
     * Uso do Banc
     */
    public static final String USO_BANCO_2 = "USO_BANCO_2";
    /**
     * Sub-sequência do registro = 01; 02; 03...
     */
    public static final String SUB_SEQUENCIA_REGISTRO = "SUB_SEQUENCIA_REGISTRO";
    /**
     * Mensagem variável por título
     */
    public static final String MENSAGEM_VARIAVEL_TITULO = "MENSAGEM_VARIAVEL_TITULO";
    /**
     * Uso do Banco
     */
    public static final String USO_BANCO_3 = "USO_BANCO_3";
    /**
     * Identificador do Complemento (nota 2)
     */
    public static final String IDENTIFICADOR_COMPLEMENTO = "IDENTIFICADOR_COMPLEMENTO";
    /**
     * Complemento (nota 2)
     */
    public static final String COMPLEMENTO = "COMPLEMENTO";
    /**
     * Brancos
     */
    public static final String BRANCOS = "BRANCOS";
    /**
     * Número seqüencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabRegistroOpcionalMovimentoRemessa() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("7"));
        addFieldArchetype(USO_BANCO_1, new FieldFillerArchetype(16, ' '));
        addFieldArchetype(CODIGO_TRANSMISSAO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(USO_BANCO_2, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(SUB_SEQUENCIA_REGISTRO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(MENSAGEM_VARIAVEL_TITULO, new FieldStringFixedLengthArchetype(50));
        addFieldArchetype(USO_BANCO_3, new FieldFillerArchetype(283, ' '));
        addFieldArchetype(IDENTIFICADOR_COMPLEMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COMPLEMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(9, ' '));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));

    }
}
