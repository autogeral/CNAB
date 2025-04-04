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
public class FileCnab400SantanderEnvio extends FileArchetype {

    public static final String HEADER_REMESSA = "HEADER_REMESSA";
    public static final String MOVIMENTO_REMESSA = "MOVIMENTO_REMESSA";
    public static final String OPCIONAL_MOVIMENTO_REMESSA = "OPCIONAL_MOVIMENTO_REMESSA";
    public static final String TRAILLER_REMESSA = "TRAILLER_REMESSA";

    public FileCnab400SantanderEnvio() {

        this.addLineArchetype(HEADER_REMESSA, new LineCnabRegistroHeaderRemessa());
        this.addLineArchetype(MOVIMENTO_REMESSA, new LineCnabRegistroMovimentoRemessa());
        this.addLineArchetype(OPCIONAL_MOVIMENTO_REMESSA, new LineCnabRegistroOpcionalMovimentoRemessa());
        this.addLineArchetype(TRAILLER_REMESSA, new LineCnabRegistroTraillerRemessa());

    }
}
