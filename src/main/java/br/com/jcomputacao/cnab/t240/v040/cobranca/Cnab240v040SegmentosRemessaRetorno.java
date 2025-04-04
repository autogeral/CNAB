package br.com.jcomputacao.cnab.t240.v040.cobranca;

import java.util.Date;

/**
 *
 * @author maria.fernanda
 */
public class Cnab240v040SegmentosRemessaRetorno {
    
    private String codSegmento;
    private String codBancoString;
    private int codBanco;
    private int numeroLote;
    private int codRegistro = 3;
    private int numeroSequencial;
    private int codMovimento;
    //Especificacoes comuns entre remessa e retorno
    private int agenciaDoCedente; //P e T
    private int digAgenciaCedente; //P e T
    private String digAgenciaCedenteString;
    private int numContaCorrente; //P e T
    private int digVerificadorConta; //P e T
    private String digVerificaforContaString;
    private String nossoNumeroString; //P e T
    private int nossoNumero;
    private Date dataVencimentoTitulo; //P e T
    private double valorTitulo; //P e T
    private String identificacaoTituloEmpresa; //P e T
    private int codMoeda; //P e T
    private int tipoInscricaoSacado; //Q e T
    private long numeroInscricaoSacado; //Q e T
    private String nomeSacado; //Q e T
    private String contaCobrancaString; //P e T
    private int contaCobranca;
    private double valorAbatimento; //P e U
    private double valorIOF; //P e U
    //Segmento P 
    private int digContaCobranca;
    private int tipoCobranca;
    private int formaCadastramento;
    private int tipoDocumento;
    private int numeroDocumento;
    private int agenciaCobradora;
    private int especieTitulo;
    private String tituloAceito;
    private Date dataEmissaoTitulo;
    private int codJurosMora;
    private Date dataJurosMora;
    private double valorJurosMora;
    private int codDesconto1;
    private int dataDesconto1;
    private double valorDesconto1;
    private int codProtesto;
    private int numDiasProtesto;
    private int codBaixa;
    private int numDiasBaixa;
    //Segmento Q
    private String enderecoSacado;
    private String bairroSacado;
    private int cepSacado;
    private int sufixoCepSacado;
    private String cidadeSacado;
    private String uFSacado;
    private String tipoInscricaoSacador;
    private String numeroInscricaoSacador;
    private String nomeSacador;
    private int identificacaoCarne;
    private int numSequencialParcela;
    private int quantidadeParcela;
    private int numeroPlano;
    //Segmento R
    private String codDesconto2;
    private Date dataDesconto2;
    private double valorConcedido;
    private int codMulta;
    private Date dataMulta;
    private double valorAplicado;
    private String mensagem3;
    private String mensagem4;
    //Segmento S
    private int tipoImpressao;
    private int numeroLinha;
    private int mensagemSacado;
    private String mensagemImpressa;
    private String mensagem5;
    private String mensagem6;
    private String mensagem7;
    private String mensagem8;
    private String mensagem9;
    //Segmento T
    private int codCarteira;
    private String numeroCobranca;
    private int numeroBanco;
    private int numAgencia;
    private int digVerificadorAgCedente;
    private double valorTarifa;
    private String motivoOcorrencia;
    //Segmento U
    private double jurosMultaEncargos;
    private double valorDescontoConcedido;
    private double valorPago;
    private double valorLiquido;
    private double valorOutrasDespesas;
    private double valorOutrosCreditos;
    private Date dataOcorrencia;
    private Date dataEfetivacaoCredito;
    private String codOcorrenciaSacado;
    private Date dataOcorrenciaSacado;
    private double valOcorrenciaSacado;
    private String complementoOcorrencia;
    private int codBancoCorrespondente;

    public String getCodSegmento() {
        return codSegmento;
    }

    public void setCodSegmento(String codSegmento) {
        this.codSegmento = codSegmento;
    }

    public String getDigAgenciaCedenteString() {
        return digAgenciaCedenteString;
    }

    public void setDigAgenciaCedenteString(String digAgenciaCedenteString) {
        this.digAgenciaCedenteString = digAgenciaCedenteString;
    }

    public String getDigVerificaforContaString() {
        return digVerificaforContaString;
    }

    public void setDigVerificaforContaString(String digVerificaforContaString) {
        this.digVerificaforContaString = digVerificaforContaString;
    }

    public int getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(int nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public int getContaCobranca() {
        return contaCobranca;
    }

    public void setContaCobranca(int contaCobranca) {
        this.contaCobranca = contaCobranca;
    }

    public String getCodBancoString() {
        return codBancoString;
    }

    public void setCodBancoString(String codBanco) {
        this.codBancoString = codBanco;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }
    
    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(int codRegistro) {
        this.codRegistro = codRegistro;
    }

    public int getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(int numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    public int getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(int codMovimento) {
        this.codMovimento = codMovimento;
    }

    public int getAgenciaDoCedente() {
        return agenciaDoCedente;
    }

    public void setAgenciaDoCedente(int agenciaDoCedente) {
        this.agenciaDoCedente = agenciaDoCedente;
    }

    public int getDigAgenciaCedente() {
        return digAgenciaCedente;
    }

    public void setDigAgenciaCedente(int digAgenciaCedente) {
        this.digAgenciaCedente = digAgenciaCedente;
    }
 
    public int getNumContaCorrente() {
        return numContaCorrente;
    }

    public void setNumContaCorrente(int numContaCorrente) {
        this.numContaCorrente = numContaCorrente;
    }

    public int getDigVerificadorConta() {
        return digVerificadorConta;
    }

    public void setDigVerificadorConta(int digVerificadorConta) {
        this.digVerificadorConta = digVerificadorConta;
    }

    public String getNossoNumeroString() {
        return nossoNumeroString;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumeroString = nossoNumero;
    }

    public Date getDataVencimentoTitulo() {
        return dataVencimentoTitulo;
    }

    public void setDataVencimentoTitulo(Date dataVencimentoTitulo) {
        this.dataVencimentoTitulo = dataVencimentoTitulo;
    }

    public double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public String getIdentificacaoTituloEmpresa() {
        return identificacaoTituloEmpresa;
    }

    public void setIdentificacaoTituloEmpresa(String identificacaoTituloEmpresa) {
        this.identificacaoTituloEmpresa = identificacaoTituloEmpresa;
    }

    public int getCodMoeda() {
        return codMoeda;
    }

    public void setCodMoeda(int codMoeda) {
        this.codMoeda = codMoeda;
    }

    public int getTipoInscricaoSacado() {
        return tipoInscricaoSacado;
    }

    public void setTipoInscricaoSacado(int tipoInscricaoSacado) {
        this.tipoInscricaoSacado = tipoInscricaoSacado;
    }

    public long getNumeroInscricaoSacado() {
        return numeroInscricaoSacado;
    }

    public void setNumeroInscricaoSacado(long numeroInscricaoSacado) {
        this.numeroInscricaoSacado = numeroInscricaoSacado;
    }

    public String getNomeSacado() {
        return nomeSacado;
    }

    public void setNomeSacado(String nomeSacado) {
        this.nomeSacado = nomeSacado;
    }

    public String getContaCobrancaString() {
        return contaCobrancaString;
    }

    public void setContaCobranca(String contaCobranca) {
        this.contaCobrancaString = contaCobranca;
    }

    public double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public double getValorIOF() {
        return valorIOF;
    }

    public void setValorIOF(double valorIOF) {
        this.valorIOF = valorIOF;
    }

    public int getDigContaCobranca() {
        return digContaCobranca;
    }

    public void setDigContaCobranca(int digContaCobranca) {
        this.digContaCobranca = digContaCobranca;
    }

    public int getTipoCobranca() {
        return tipoCobranca;
    }

    public void setTipoCobranca(int tipoCobranca) {
        this.tipoCobranca = tipoCobranca;
    }

    public int getFormaCadastramento() {
        return formaCadastramento;
    }

    public void setFormaCadastramento(int formaCadastramento) {
        this.formaCadastramento = formaCadastramento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getAgenciaCobradora() {
        return agenciaCobradora;
    }

    public void setAgenciaCobradora(int agenciaCobradora) {
        this.agenciaCobradora = agenciaCobradora;
    }

    public int getEspecieTitulo() {
        return especieTitulo;
    }

    public void setEspecieTitulo(int especieTitulo) {
        this.especieTitulo = especieTitulo;
    }

    public String getTituloAceito() {
        return tituloAceito;
    }

    public void setTituloAceito(String tituloAceito) {
        this.tituloAceito = tituloAceito;
    }

    public Date getDataEmissaoTitulo() {
        return dataEmissaoTitulo;
    }

    public void setDataEmissaoTitulo(Date dataEmissaoTitulo) {
        this.dataEmissaoTitulo = dataEmissaoTitulo;
    }

    public int getCodJurosMora() {
        return codJurosMora;
    }

    public void setCodJurosMora(int codJurosMora) {
        this.codJurosMora = codJurosMora;
    }

    public Date getDataJurosMora() {
        return dataJurosMora;
    }

    public void setDataJurosMora(Date dataJurosMora) {
        this.dataJurosMora = dataJurosMora;
    }

    public double getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(double valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }

    public int getCodDesconto1() {
        return codDesconto1;
    }

    public void setCodDesconto1(int codDesconto1) {
        this.codDesconto1 = codDesconto1;
    }

    public int getDataDesconto1() {
        return dataDesconto1;
    }

    public void setDataDesconto1(int dataDesconto1) {
        this.dataDesconto1 = dataDesconto1;
    }

    public double getValorDesconto1() {
        return valorDesconto1;
    }

    public void setValorDesconto1(double valorDesconto1) {
        this.valorDesconto1 = valorDesconto1;
    }

    public int getCodProtesto() {
        return codProtesto;
    }

    public void setCodProtesto(int codProtesto) {
        this.codProtesto = codProtesto;
    }

    public int getNumDiasProtesto() {
        return numDiasProtesto;
    }

    public void setNumDiasProtesto(int numDiasProtesto) {
        this.numDiasProtesto = numDiasProtesto;
    }

    public int getCodBaixa() {
        return codBaixa;
    }

    public void setCodBaixa(int codBaixa) {
        this.codBaixa = codBaixa;
    }

    public int getNumDiasBaixa() {
        return numDiasBaixa;
    }

    public void setNumDiasBaixa(int numDiasBaixa) {
        this.numDiasBaixa = numDiasBaixa;
    }

    public String getEnderecoSacado() {
        return enderecoSacado;
    }

    public void setEnderecoSacado(String enderecoSacado) {
        this.enderecoSacado = enderecoSacado;
    }

    public String getBairroSacado() {
        return bairroSacado;
    }

    public void setBairroSacado(String bairroSacado) {
        this.bairroSacado = bairroSacado;
    }

    public int getCepSacado() {
        return cepSacado;
    }

    public void setCepSacado(int cepSacado) {
        this.cepSacado = cepSacado;
    }

    public int getSufixoCepSacado() {
        return sufixoCepSacado;
    }

    public void setSufixoCepSacado(int sufixoCepSacado) {
        this.sufixoCepSacado = sufixoCepSacado;
    }

    public String getCidadeSacado() {
        return cidadeSacado;
    }

    public void setCidadeSacado(String cidadeSacado) {
        this.cidadeSacado = cidadeSacado;
    }

    public String getuFSacado() {
        return uFSacado;
    }

    public void setuFSacado(String uFSacado) {
        this.uFSacado = uFSacado;
    }

    public String getTipoInscricaoSacador() {
        return tipoInscricaoSacador;
    }

    public void setTipoInscricaoSacador(String tipoInscricaoSacador) {
        this.tipoInscricaoSacador = tipoInscricaoSacador;
    }

    public String getNumeroInscricaoSacador() {
        return numeroInscricaoSacador;
    }

    public void setNumeroInscricaoSacador(String numeroInscricaoSacador) {
        this.numeroInscricaoSacador = numeroInscricaoSacador;
    }

    public String getNomeSacador() {
        return nomeSacador;
    }

    public void setNomeSacador(String nomeSacador) {
        this.nomeSacador = nomeSacador;
    }

    public int getIdentificacaoCarne() {
        return identificacaoCarne;
    }

    public void setIdentificacaoCarne(int identificacaoCarne) {
        this.identificacaoCarne = identificacaoCarne;
    }

    public int getNumSequencialParcela() {
        return numSequencialParcela;
    }

    public void setNumSequencialParcela(int numSequencialParcela) {
        this.numSequencialParcela = numSequencialParcela;
    }

    public int getQuantidadeParcela() {
        return quantidadeParcela;
    }

    public void setQuantidadeParcela(int quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    public int getNumeroPlano() {
        return numeroPlano;
    }

    public void setNumeroPlano(int numeroPlano) {
        this.numeroPlano = numeroPlano;
    }

    public String getCodDesconto2() {
        return codDesconto2;
    }

    public void setCodDesconto2(String codDesconto2) {
        this.codDesconto2 = codDesconto2;
    }

    public Date getDataDesconto2() {
        return dataDesconto2;
    }

    public void setDataDesconto2(Date dataDesconto2) {
        this.dataDesconto2 = dataDesconto2;
    }

    public double getValorConcedido() {
        return valorConcedido;
    }

    public void setValorConcedido(double valorConcedido) {
        this.valorConcedido = valorConcedido;
    }

    public int getCodMulta() {
        return codMulta;
    }

    public void setCodMulta(int codMulta) {
        this.codMulta = codMulta;
    }

    public Date getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(Date dataMulta) {
        this.dataMulta = dataMulta;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public String getMensagem3() {
        return mensagem3;
    }

    public void setMensagem3(String mensagem3) {
        this.mensagem3 = mensagem3;
    }

    public String getMensagem4() {
        return mensagem4;
    }

    public void setMensagem4(String mensagem4) {
        this.mensagem4 = mensagem4;
    }

    public int getTipoImpressao() {
        return tipoImpressao;
    }

    public void setTipoImpressao(int tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public int getMensagemSacado() {
        return mensagemSacado;
    }

    public void setMensagemSacado(int mensagemSacado) {
        this.mensagemSacado = mensagemSacado;
    }

    public String getMensagemImpressa() {
        return mensagemImpressa;
    }

    public void setMensagemImpressa(String mensagemImpressa) {
        this.mensagemImpressa = mensagemImpressa;
    }

    public String getMensagem5() {
        return mensagem5;
    }

    public void setMensagem5(String mensagem5) {
        this.mensagem5 = mensagem5;
    }

    public String getMensagem6() {
        return mensagem6;
    }

    public void setMensagem6(String mensagem6) {
        this.mensagem6 = mensagem6;
    }

    public String getMensagem7() {
        return mensagem7;
    }

    public void setMensagem7(String mensagem7) {
        this.mensagem7 = mensagem7;
    }

    public String getMensagem8() {
        return mensagem8;
    }

    public void setMensagem8(String mensagem8) {
        this.mensagem8 = mensagem8;
    }

    public String getMensagem9() {
        return mensagem9;
    }

    public void setMensagem9(String mensagem9) {
        this.mensagem9 = mensagem9;
    }

    public int getCodCarteira() {
        return codCarteira;
    }

    public void setCodCarteira(int codCarteira) {
        this.codCarteira = codCarteira;
    }

    public String getNumeroCobranca() {
        return numeroCobranca;
    }

    public void setNumeroCobranca(String numeroCobranca) {
        this.numeroCobranca = numeroCobranca;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getDigVerificadorAgCedente() {
        return digVerificadorAgCedente;
    }

    public void setDigVerificadorAgCedente(int digVerificadorAgCedente) {
        this.digVerificadorAgCedente = digVerificadorAgCedente;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public String getMotivoOcorrencia() {
        return motivoOcorrencia;
    }

    public void setMotivoOcorrencia(String motivoOcorrencia) {
        this.motivoOcorrencia = motivoOcorrencia;
    }

    public double getJurosMultaEncargos() {
        return jurosMultaEncargos;
    }

    public void setJurosMultaEncargos(double jurosMultaEncargos) {
        this.jurosMultaEncargos = jurosMultaEncargos;
    }

    public double getValorDescontoConcedido() {
        return valorDescontoConcedido;
    }

    public void setValorDescontoConcedido(double valorDescontoConcedido) {
        this.valorDescontoConcedido = valorDescontoConcedido;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public double getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    public void setValorOutrasDespesas(double valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    public double getValorOutrosCreditos() {
        return valorOutrosCreditos;
    }

    public void setValorOutrosCreditos(double valorOutrosCreditos) {
        this.valorOutrosCreditos = valorOutrosCreditos;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Date getDataEfetivacaoCredito() {
        return dataEfetivacaoCredito;
    }

    public void setDataEfetivacaoCredito(Date dataEfetivacaoCredito) {
        this.dataEfetivacaoCredito = dataEfetivacaoCredito;
    }
    
    public String getCodOcorrenciaSacado() {
        return codOcorrenciaSacado;
    }

    public void setCodOcorrenciaSacado(String codOcorrenciaSacado) {
        this.codOcorrenciaSacado = codOcorrenciaSacado;
    }

    public Date getDataOcorrenciaSacado() {
        return dataOcorrenciaSacado;
    }

    public void setDataOcorrenciaSacado(Date dataOcorrenciaSacado) {
        this.dataOcorrenciaSacado = dataOcorrenciaSacado;
    }

    public double getValOcorrenciaSacado() {
        return valOcorrenciaSacado;
    }

    public void setValOcorrenciaSacado(double valOcorrenciaSacado) {
        this.valOcorrenciaSacado = valOcorrenciaSacado;
    }

    public String getComplementoOcorrencia() {
        return complementoOcorrencia;
    }

    public void setComplementoOcorrencia(String complementoOcorrencia) {
        this.complementoOcorrencia = complementoOcorrencia;
    }

    public int getCodBancoCorrespondente() {
        return codBancoCorrespondente;
    }

    public void setCodBancoCorrespondente(int codBancoCorrespondente) {
        this.codBancoCorrespondente = codBancoCorrespondente;
    }   

    /**
     * Quem deve executar este metodo eh o segmento U
     * @param ultimoSegmentoT 
     */
    public void unirSegmentosUeT(Cnab240v040SegmentosRemessaRetorno segT) {
        String tipoSegmentoU = this.getCodSegmento();
        String tipoSegmentoT = segT.getCodSegmento();
        if (!"U".equals(tipoSegmentoU) || !"T".equals(tipoSegmentoT)) {
            throw new IllegalArgumentException("Metodo unirSegmentosUeT() so deve ser chamado a partir de um objeto de segmento U com um ojeto segmento T como parametro");
        }
        this.setAgenciaDoCedente(segT.getAgenciaDoCedente());
        this.setDigAgenciaCedente(segT.getDigAgenciaCedente());
        this.setNumContaCorrente(segT.getNumContaCorrente());
        this.setDigVerificadorConta(segT.getDigVerificadorConta());
        this.setNossoNumero(segT.getNossoNumero());
        this.setNossoNumero(segT.getNossoNumeroString());
        this.setCodCarteira(segT.getCodCarteira());
        this.setNumeroCobranca(segT.getNumeroCobranca());
        this.setDataVencimentoTitulo(segT.getDataVencimentoTitulo());
        this.setValorTitulo(segT.getValorTitulo());
        this.setNumeroBanco(segT.getNumeroBanco());
        this.setNumAgencia(segT.getNumAgencia());
        this.setDigVerificadorAgCedente(segT.getDigVerificadorAgCedente());
        this.setIdentificacaoTituloEmpresa(segT.getIdentificacaoTituloEmpresa());
        this.setCodMoeda(segT.getCodMoeda());
        this.setTipoInscricaoSacado(segT.getTipoInscricaoSacado());
        this.setNumeroInscricaoSacado(segT.getNumeroInscricaoSacado());
        this.setNomeSacado(segT.getNomeSacado());
        this.setContaCobranca(segT.getContaCobranca());
        this.setValorTarifa(segT.getValorTarifa());
        this.setMotivoOcorrencia(segT.getMotivoOcorrencia());
    }

    @Override
    public String toString() {
        return "Cnab240v040SegmentosRemessaRetorno{" + "codSegmento=" + codSegmento + ", codBancoString=" + codBancoString + ", codBanco=" + codBanco + ", numeroLote=" + numeroLote + ", codRegistro=" + codRegistro + ", numeroSequencial=" + numeroSequencial + ", codMovimento=" + codMovimento + ", agenciaDoCedente=" + agenciaDoCedente + ", digAgenciaCedente=" + digAgenciaCedente + ", digAgenciaCedenteString=" + digAgenciaCedenteString + ", numContaCorrente=" + numContaCorrente + ", digVerificadorConta=" + digVerificadorConta + ", digVerificaforContaString=" + digVerificaforContaString + ", nossoNumeroString=" + nossoNumeroString + ", nossoNumero=" + nossoNumero + ", dataVencimentoTitulo=" + dataVencimentoTitulo + ", valorTitulo=" + valorTitulo + ", identificacaoTituloEmpresa=" + identificacaoTituloEmpresa + ", codMoeda=" + codMoeda + ", tipoInscricaoSacado=" + tipoInscricaoSacado + ", numeroInscricaoSacado=" + numeroInscricaoSacado + ", nomeSacado=" + nomeSacado + ", contaCobrancaString=" + contaCobrancaString + ", contaCobranca=" + contaCobranca + ", valorAbatimento=" + valorAbatimento + ", valorIOF=" + valorIOF + ", digContaCobranca=" + digContaCobranca + ", tipoCobranca=" + tipoCobranca + ", formaCadastramento=" + formaCadastramento + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", agenciaCobradora=" + agenciaCobradora + ", especieTitulo=" + especieTitulo + ", tituloAceito=" + tituloAceito + ", dataEmissaoTitulo=" + dataEmissaoTitulo + ", codJurosMora=" + codJurosMora + ", dataJurosMora=" + dataJurosMora + ", valorJurosMora=" + valorJurosMora + ", codDesconto1=" + codDesconto1 + ", dataDesconto1=" + dataDesconto1 + ", valorDesconto1=" + valorDesconto1 + ", codProtesto=" + codProtesto + ", numDiasProtesto=" + numDiasProtesto + ", codBaixa=" + codBaixa + ", numDiasBaixa=" + numDiasBaixa + ", enderecoSacado=" + enderecoSacado + ", bairroSacado=" + bairroSacado + ", cepSacado=" + cepSacado + ", sufixoCepSacado=" + sufixoCepSacado + ", cidadeSacado=" + cidadeSacado + ", uFSacado=" + uFSacado + ", tipoInscricaoSacador=" + tipoInscricaoSacador + ", numeroInscricaoSacador=" + numeroInscricaoSacador + ", nomeSacador=" + nomeSacador + ", identificacaoCarne=" + identificacaoCarne + ", numSequencialParcela=" + numSequencialParcela + ", quantidadeParcela=" + quantidadeParcela + ", numeroPlano=" + numeroPlano + ", codDesconto2=" + codDesconto2 + ", dataDesconto2=" + dataDesconto2 + ", valorConcedido=" + valorConcedido + ", codMulta=" + codMulta + ", dataMulta=" + dataMulta + ", valorAplicado=" + valorAplicado + ", mensagem3=" + mensagem3 + ", mensagem4=" + mensagem4 + ", tipoImpressao=" + tipoImpressao + ", numeroLinha=" + numeroLinha + ", mensagemSacado=" + mensagemSacado + ", mensagemImpressa=" + mensagemImpressa + ", mensagem5=" + mensagem5 + ", mensagem6=" + mensagem6 + ", mensagem7=" + mensagem7 + ", mensagem8=" + mensagem8 + ", mensagem9=" + mensagem9 + ", codCarteira=" + codCarteira + ", numeroCobranca=" + numeroCobranca + ", numeroBanco=" + numeroBanco + ", numAgencia=" + numAgencia + ", digVerificadorAgCedente=" + digVerificadorAgCedente + ", valorTarifa=" + valorTarifa + ", motivoOcorrencia=" + motivoOcorrencia + ", jurosMultaEncargos=" + jurosMultaEncargos + ", valorDescontoConcedido=" + valorDescontoConcedido + ", valorPago=" + valorPago + ", valorLiquido=" + valorLiquido + ", valorOutrasDespesas=" + valorOutrasDespesas + ", valorOutrosCreditos=" + valorOutrosCreditos + ", dataOcorrencia=" + dataOcorrencia + ", dataEfetivacaoCredito=" + dataEfetivacaoCredito + ", codOcorrenciaSacado=" + codOcorrenciaSacado + ", dataOcorrenciaSacado=" + dataOcorrenciaSacado + ", valOcorrenciaSacado=" + valOcorrenciaSacado + ", complementoOcorrencia=" + complementoOcorrencia + ", codBancoCorrespondente=" + codBancoCorrespondente + '}';
    }
}
