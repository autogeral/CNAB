/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import java.util.Date;

/**
 *
 * @author Nieri
 */
public interface Cnab400SantanderLoteEnvioBoleto {

    public String getBairroSacado();

    public Long getCepSacado();

    public Long getCgcCpfSacado();

    public Long getCodigoAgenciaCobradora();

    public Long getCodigoCarteira();

    public Long getCodigoOcorrencia();

    public String getCodigoTransmissao();

    public Long getComplemento();

    public Long getComplementoCep();

    public Long getCpfCnpjCedente();

    public Date getDataCobrancaMulta();

    public Date getDataEmissaoTitulo();

    public Date getDataLimiteConcessaoDesconto();

    public Date getDataSegundoDesconto();

    public Date getDataVencimentoTitulo();

    public String getEnderecoSacado();

    public Long getEspecieDocumento();

    public String getIdentificadorComplemento();

    public Long getInformacaoMulta();

    public String getMunicipioSacado();

    public String getNomeSacado();

    public String getNomeSacadorCoobrigado();

    public Long getNossoNumero();

    public Long getNumeroBancoCobrador();

    public String getNumeroControleParticipante();

    public long getNumeroDiasProtesto();

    public Long getNumeroSequencialRegistroArquivo2();

    public Cnab400SantanderLoteEnvioBoletoOpcional getOpcional();

    public Double getPercentualMultaPorAtraso();

    public Long getPrimeiraInstrucaoCobranca();

    public Long getSegundaInstrucaoCobrada();

    public String getSeuNumero();

    public Object getTipoAceite();

    public Long getTipoIncricaoCedente();

    public Long getTipoInscricaoSacado();

    public String getUfEstadoSacado();

    public Long getUnidadeValorMoedaCorrente();

    public Double getValorDescontoConcedido();

    public Double getValorIofRecolhido();

    public Double getValorMoraCobradoDiaAtraso();

    public Double getValorSegundoDesconto();

    public Double getValorTitulo();

    public Double getValorTituloOutraUnidade();

    public boolean temOpcional();
}
