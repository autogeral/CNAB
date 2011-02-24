/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroTraillerRemessa extends LineArchetype {

    /**
     * Código do registro = 9
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Quantidade total de linhas no arquivo
     */
    public static final String QUANTIDADE_TOTAL_LINHAS_ARQUIVO = "QUANTIDADE_TOTAL_LINHAS_ARQUIVO";
    /**
     * Valor total dos títulos
     */
    public static final String VALOR_TOTAL_TITULOS = "VALOR_TOTAL_TITULOS";
    /**
     * Zeros
     */
    public static final String ZEROS = "ZEROS";
    /**
     * Número seqüencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabRegistroTraillerRemessa() {

        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("9"));
        addFieldArchetype(QUANTIDADE_TOTAL_LINHAS_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(VALOR_TOTAL_TITULOS, new FieldDecimalFixedLengthArchetype(13));
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "00000000000000000000000000000000000000000000000000000000000000000000000000"));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));

    }
}
