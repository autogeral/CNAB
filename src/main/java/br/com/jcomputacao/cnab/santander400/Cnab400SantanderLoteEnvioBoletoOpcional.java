/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

/**
 *
 * @author Nieri
 */
public interface Cnab400SantanderLoteEnvioBoletoOpcional {

    public String getCodigoTransmissao();

    public Long getComplemento();

    public String getIdentificadorComplemento();

    public String getMensagemVariavelTitulo();

    public Long getNumeroSequencialRegistroArquivo3();

    public Long getSubSequenciaRegistro();

//    public String getUsoBanco1();
//
//    public String getUsoBanco2();
//
//    public String getUsoBanco3();
}
