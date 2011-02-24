/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroHeaderRemessa extends LineArchetype {

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
     * Código de Transmissão (nota 1)
     */
    public static final String CODIGO_TRANSMISSAO = "CODIGO_TRANSMISSAO";
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
     * Data de Gravação
     */
    public static final String DATA_GRAVACAO = "DATA_GRAVACAO";
    /**
     * Zeros
     */
    public static final String ZEROS = "ZEROS";
    /**
     * Mensagem 1
     */
    public static final String MENSAGEM_1 = "MENSAGEM_1";
    /**
     * Mensagem 2
     */
    public static final String MENSAGEM_2 = "MENSAGEM_2";
    /**
     * Mensagem 3
     */
    public static final String MENSAGEM_3 = "MENSAGEM_3";
    /**
     * Mensagem 4
     */
    public static final String MENSAGEM_4 = "MENSAGEM_4";
    /**
     * Mensagem 5
     */
    public static final String MENSAGEM_5 = "MENSAGEM_5";
    /**
     * Mensagem 6
     * A documentação fala que o campo deve ter 47 posiçoes, porém verificando
     * a posição inicial e a final tem-se apenas 40 posiçoes...por isso
     * fora feito alteração
     */
    public static final String MENSAGEM_6 = "MENSAGEM_6";
    /**
     * Número da versão da remessa opcional, se informada,
     * será controlada pelo sistema
     */
    public static final String NUMERO_VERSAO_REMESSA_OPCIONAL = "NUMERO_VERSAO_REMESSA_OPCIONAL";
    /**
     * Número seqüencial do registro no arquivo = 000001
     */
    public static final String NUMERO_SEQUENCIA_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIA_REGISTRO_ARQUIVO";

    public LineCnabRegistroHeaderRemessa() {
        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("0"));
        addFieldArchetype(CODIGO_REMESSA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(LITERAL_TRANSMISSAO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(CODIGO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(LITERAL_SERVICO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CODIGO_TRANSMISSAO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(DATA_GRAVACAO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("0000000000000000"));
        addFieldArchetype(MENSAGEM_1, new FieldStringFixedLengthArchetype(47));
        addFieldArchetype(MENSAGEM_2, new FieldStringFixedLengthArchetype(47));
        addFieldArchetype(MENSAGEM_3, new FieldStringFixedLengthArchetype(47));
        addFieldArchetype(MENSAGEM_4, new FieldStringFixedLengthArchetype(47));
        addFieldArchetype(MENSAGEM_5, new FieldStringFixedLengthArchetype(47));
        addFieldArchetype(MENSAGEM_6, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(NUMERO_VERSAO_REMESSA_OPCIONAL, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NUMERO_SEQUENCIA_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
    }
}
