package br.com.jcomputacao.cnab.Cef240;

/**
 * 05/08/2014 16:19:30
 *
 * @author Thiago Balthazar
 */
public class LineCnabCaixaEconomicaCnabHeaderTraillerArquivo {

    private int codigoBanco;
    private int loteServico;
    private int tipoRegistro;
    private String tipoOperacao;
    private int tipoServico;
    private int febrabanCnab;
    private int nVersaoLayoutLote;
    private String febrabanCnabString;
    private int tipoInscricaoEmpresa;
    private String numeroInscriçãoEmpresa;
    private int codigoCedenteBanco;
    private String usoExclusivoCAIXA;
    private int agenciaMantenedoraConta;
    private String digitoVerificadorConta;
    private int codigoConvenioBanco;
    private int codigoModeloPersonalizado;
    private String usoExclusivoCAIXA2;
    private String usoExclusivoCAIXA3;
    private String nomeEmpresa; 
    private String mensagem1;
    private String mensagem2;
    private int numeroRemessaRetorno;                    
    private int dataGravaçãoRemessaRetorno;
    private int dataCrédito;
    private String UsoExclusivoFEBRABANCNAB2;
    private String RESERVADO_USO_BANCO;
    private String NOME_BANCO;
    private int codigoRemessaRetorno;
    private int dataGeracaoArquivo;
    private int horaGeracaoArquivo;
    private int numeroSequencialArquivo;
    private int numeroVersaoaLayoutArquivo;
    private int densiadadeGravacaiArquivo;
    private String ParaUsoReservadoBanco;
    private String ParaUsoReservadoEmpresa;
    private String versaoAplicativoCaixa;
    private String UsoExclusivoFEBRABANCNAB3;

    public String getUsoExclusivoFEBRABANCNAB3() {
        return UsoExclusivoFEBRABANCNAB3;
    }

    public void setUsoExclusivoFEBRABANCNAB3(String UsoExclusivoFEBRABANCNAB3) {
        this.UsoExclusivoFEBRABANCNAB3 = UsoExclusivoFEBRABANCNAB3;
    }
    
    public String getUsoExclusivoFEBRABANCNAB2() {
        return UsoExclusivoFEBRABANCNAB2;
    }

    public void setUsoExclusivoFEBRABANCNAB2(String UsoExclusivoFEBRABANCNAB2) {
        this.UsoExclusivoFEBRABANCNAB2 = UsoExclusivoFEBRABANCNAB2;
    }
    
    public String getVersaoAplicativoCaixa() {
        return versaoAplicativoCaixa;
    }

    public void setVersaoAplicativoCaixa(String versaoAplicativoCaixa) {
        this.versaoAplicativoCaixa = versaoAplicativoCaixa;
    }

    public String getParaUsoReservadoEmpresa() {
        return ParaUsoReservadoEmpresa;
    }

    public void setParaUsoReservadoEmpresa(String ParaUsoReservadoEmpresa) {
        this.ParaUsoReservadoEmpresa = ParaUsoReservadoEmpresa;
    }    
    
    public String getParaUsoReservadoBanco() {
        return ParaUsoReservadoBanco;
    }

    public void setParaUsoReservadoBanco(String ParaUsoReservadoBanco) {
        this.ParaUsoReservadoBanco = ParaUsoReservadoBanco;
    }
    
    public int getDensiadadeGravacaiArquivo() {
        return densiadadeGravacaiArquivo;
    }

    public void setDensiadadeGravacaiArquivo(int densiadadeGravacaiArquivo) {
        this.densiadadeGravacaiArquivo = densiadadeGravacaiArquivo;
    }

    public int getNumeroSequencialArquivo() {
        return numeroSequencialArquivo;
    }

    public void setNumeroSequencialArquivo(int numeroSequencialArquivo) {
        this.numeroSequencialArquivo = numeroSequencialArquivo;
    }
    
    public int getHoraGeracaoArquivo() {
        return horaGeracaoArquivo;
    }

    public void setHoraGeracaoArquivo(int horaGeracaoArquivo) {
        this.horaGeracaoArquivo = horaGeracaoArquivo;
    }
    
    public int getDataGeracaoArquivo() {
        return dataGeracaoArquivo;
    }

    public void setDataGeracaoArquivo(int dataGeracaoArquivo) {
        this.dataGeracaoArquivo = dataGeracaoArquivo;
    }
        
    public int getCodigoRemessaRetorno() {
        return codigoRemessaRetorno;
    }

    public void setCodigoRemessaRetorno(int codigoRemessaRetorno) {
        this.codigoRemessaRetorno = codigoRemessaRetorno;
    }
    
    public String getNOME_BANCO() {
        return NOME_BANCO;
    }

    public void setNOME_BANCO(String NOME_BANCO) {
        this.NOME_BANCO = NOME_BANCO;
    }
   

    public String getRESERVADO_USO_BANCO() {
        return RESERVADO_USO_BANCO;
    }

    public void setRESERVADO_USO_BANCO(String RESERVADO_USO_BANCO) {
        this.RESERVADO_USO_BANCO = RESERVADO_USO_BANCO;
    }
    
    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public int getLoteServico() {
        return loteServico;
    }

    public void setLoteServico(int loteServico) {
        this.loteServico = loteServico;
    }

    public int getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(int tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public int getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(int tipoServico) {
        this.tipoServico = tipoServico;
    }

    public int getFebrabanCnab() {
        return febrabanCnab;
    }

    public void setFebrabanCnab(int febrabanCnab) {
        this.febrabanCnab = febrabanCnab;
    }

    public int getnVersaoLayoutLote() {
        return nVersaoLayoutLote;
    }

    public void setnVersaoLayoutLote(int nVersaoLayoutLote) {
        this.nVersaoLayoutLote = nVersaoLayoutLote;
    }

    public String getFebrabanCnabString() {
        return febrabanCnabString;
    }

    public void setFebrabanCnabString(String febrabanCnabString) {
        this.febrabanCnabString = febrabanCnabString;
    }

    public int getTipoInscricaoEmpresa() {
        return tipoInscricaoEmpresa;
    }

    public void setTipoInscricaoEmpresa(int tipoInscricaoEmpresa) {
        this.tipoInscricaoEmpresa = tipoInscricaoEmpresa;
    }

    public String getNumeroInscriçãoEmpresa() {
        return numeroInscriçãoEmpresa;
    }

    public void setNumeroInscriçãoEmpresa(String numeroInscriçãoEmpresa) {
        this.numeroInscriçãoEmpresa = numeroInscriçãoEmpresa;
    }

    public int getCodigoCedenteBanco() {
        return codigoCedenteBanco;
    }

    public void setCodigoCedenteBanco(int codigoCedenteBanco) {
        this.codigoCedenteBanco = codigoCedenteBanco;
    }

    public String getUsoExclusivoCAIXA() {
        return usoExclusivoCAIXA;
    }

    public void setUsoExclusivoCAIXA(String usoExclusivoCAIXA) {
        this.usoExclusivoCAIXA = usoExclusivoCAIXA;
    }

    public int getAgenciaMantenedoraConta() {
        return agenciaMantenedoraConta;
    }

    public void setAgenciaMantenedoraConta(int agenciaMantenedoraConta) {
        this.agenciaMantenedoraConta = agenciaMantenedoraConta;
    }

    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    public void setDigitoVerificadorConta(String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
    }

    public int getCodigoConvenioBanco() {
        return codigoConvenioBanco;
    }

    public void setCodigoConvenioBanco(int codigoConvenioBanco) {
        this.codigoConvenioBanco = codigoConvenioBanco;
    }

    public int getCodigoModeloPersonalizado() {
        return codigoModeloPersonalizado;
    }

    public void setCodigoModeloPersonalizado(int codigoModeloPersonalizado) {
        this.codigoModeloPersonalizado = codigoModeloPersonalizado;
    }

    public String getUsoExclusivoCAIXA2() {
        return usoExclusivoCAIXA2;
    }

    public void setUsoExclusivoCAIXA2(String usoExclusivoCAIXA2) {
        this.usoExclusivoCAIXA2 = usoExclusivoCAIXA2;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getMensagem1() {
        return mensagem1;
    }

    public void setMensagem1(String mensagem1) {
        this.mensagem1 = mensagem1;
    }

    public String getMensagem2() {
        return mensagem2;
    }

    public void setMensagem2(String mensagem2) {
        this.mensagem2 = mensagem2;
    }

    public int getNumeroRemessaRetorno() {
        return numeroRemessaRetorno;
    }

    public void setNumeroRemessaRetorno(int numeroRemessaRetorno) {
        this.numeroRemessaRetorno = numeroRemessaRetorno;
    }

    public int getDataGravaçãoRemessaRetorno() {
        return dataGravaçãoRemessaRetorno;
    }

    public void setDataGravaçãoRemessaRetorno(int dataGravaçãoRemessaRetorno) {
        this.dataGravaçãoRemessaRetorno = dataGravaçãoRemessaRetorno;
    }

    public int getDataCrédito() {
        return dataCrédito;
    }

    public void setDataCrédito(int dataCrédito) {
        this.dataCrédito = dataCrédito;
    }

    public String getUsoExclusivoFEBRABANCNAB() {
        return UsoExclusivoFEBRABANCNAB2;
    }

    public void setUsoExclusivoFEBRABANCNAB(String UsoExclusivoFEBRABANCNAB) {
        this.UsoExclusivoFEBRABANCNAB2 = UsoExclusivoFEBRABANCNAB;
    }

    public String getUsoExclusivoCAIXA3() {
        return usoExclusivoCAIXA3;
    }

    public void setUsoExclusivoCAIXA3(String usoExclusivoCAIXA3) {
        this.usoExclusivoCAIXA3 = usoExclusivoCAIXA3;
    }

    public int getNumeroVersaoaLayoutArquivo() {
        return numeroVersaoaLayoutArquivo;
    }

    public void setNumeroVersaoaLayoutArquivo(int numeroVersaoaLayoutArquivo) {
        this.numeroVersaoaLayoutArquivo = numeroVersaoaLayoutArquivo;
    }
    
}
