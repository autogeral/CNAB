/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Nieri
 */
public interface Cnab400SantanderLoteEnvio {

    public Long getCodigoServico();

    public Long getBancoCodigo();

    public String getBancoNome();

    public List<Cnab400SantanderLoteEnvioBoleto> getBoletos();

    public String getCedenteNome();

    public Long getCodigoRemessa();

    public String getCodigoTransmissao();

    public Date getDataGravacao();

    public String getLiteralServico();

    public String getLiteralTransmissao();

    public String getMensagem1();

    public String getMensagem2();

    public String getMensagem3();

    public String getMensagem4();

    public String getMensagem5();

    public String getMensagem6();

    public Long getNumeroSequencialRegistroArquivo1();

    public Long getNumeroSequencialRegistroArquivo4();

    public Long getNumeroVersaoRemessa();

    public List<Cnab400SantanderLoteEnvioBoletoOpcional> getOpcional();

    public Long getQuantidadeTotalLinhas();

    public Double getValorTotalTitulo();
}
