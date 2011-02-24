/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.file.FileArchetype;

/**
 *
 * @author Nieri
 */
public class FileCnab400SantanderRetorno extends FileArchetype {

    public static final String HEADER_RETORNO = "HEADER_RETORNO";
    public static final String MOVIMENTO_RETORNO = "MOVIMENTO_RETORNO";
    public static final String TRAILLER_RETORNO = "TRAILLER_RETORNO";

    public FileCnab400SantanderRetorno() {

        this.addLineArchetype(HEADER_RETORNO, new LineCnabRegistroHeaderRemessa());
        this.addLineArchetype(MOVIMENTO_RETORNO, new LineCnabRegistroMovimentoRemessa());
        this.addLineArchetype(TRAILLER_RETORNO, new LineCnabRegistroTraillerRemessa());

    }
}