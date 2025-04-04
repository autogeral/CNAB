package br.com.jcomputacao.cnab.Cef240;

/**
 * 03/09/2014 17:32:29
 *
 * @author Thiago
 */
public class LineCnabCaixaEconomicaRetornoSegmentoUMovimento {

    int CODIGO_BANCO_COMPENSACA;
    int LOTE_SERVIC;
    int TIPO_REGISTRO;
    int SEQUENCIAL_REGISTRO;
    String CODIGO_SEGMENTO_REGISTRO;
    String USO_EXCLUSIVO_FEBRABAN1;
    int CODIGO_MOVIMENTO_REMESS;
    int JUROS_MULTA_ENCARGO;
    double VALOR_DESCONTO_CONCEDIDO;
    double VALOR_ABATIMENTO_CONCEDIDO;
    double VALOR_IOF_RECOLHIDO;
    double VALOR_PAGO_SACADO;
    double VALOR_LIQUIDO_CREDITAR;
    double VALOR_OUTRAS_DESPESAS;
    double VALOR_OUTROS_CREDITOS;
    int DATA_OCORRENCI;
    int DATA_EFETIVACAO_CREDITO;
    int NUMERO_BANCO_SACADOS;
    String NOME_BANCO_SACADOS;
    String ID_AJUSTE_VENCIMENTO;
    String ID_AJUSTE_EMESSAO;
    int ID_MODELO_BLOQUETO_BANCO_SACADOS;
    String ID_VIA_ENTREGA_DISTRIBUICAO;
    int ID_ESPECIE_TITULO;
    String ID_ACEITE;
    String CODIGO_DO_SACADO_BANCO;
    String USO_EXCLUSIVO_FEBRABAN;
    String USO_EXCLUSIVO_FEBRABAN2;
    String USO_EXCLUSIVO_FEBRABAN3;

    public int getCODIGO_BANCO_COMPENSACA() {
        return CODIGO_BANCO_COMPENSACA;
    }

    public void setCODIGO_BANCO_COMPENSACA(int CODIGO_BANCO_COMPENSACA) {
        this.CODIGO_BANCO_COMPENSACA = CODIGO_BANCO_COMPENSACA;
    }

    public int getLOTE_SERVIC() {
        return LOTE_SERVIC;
    }

    public void setLOTE_SERVIC(int LOTE_SERVIC) {
        this.LOTE_SERVIC = LOTE_SERVIC;
    }

    public int getTIPO_REGISTRO() {
        return TIPO_REGISTRO;
    }

    public void setTIPO_REGISTRO(int TIPO_REGISTRO) {
        this.TIPO_REGISTRO = TIPO_REGISTRO;
    }

    public int getSEQUENCIAL_REGISTRO() {
        return SEQUENCIAL_REGISTRO;
    }

    public void setSEQUENCIAL_REGISTRO(int SEQUENCIAL_REGISTRO) {
        this.SEQUENCIAL_REGISTRO = SEQUENCIAL_REGISTRO;
    }

    public String getCODIGO_SEGMENTO_REGISTRO() {
        return CODIGO_SEGMENTO_REGISTRO;
    }

    public void setCODIGO_SEGMENTO_REGISTRO(String CODIGO_SEGMENTO_REGISTRO) {
        this.CODIGO_SEGMENTO_REGISTRO = CODIGO_SEGMENTO_REGISTRO;
    }

    public String getUSO_EXCLUSIVO_FEBRABAN1() {
        return USO_EXCLUSIVO_FEBRABAN1;
    }

    public void setUSO_EXCLUSIVO_FEBRABAN1(String USO_EXCLUSIVO_FEBRABAN1) {
        this.USO_EXCLUSIVO_FEBRABAN1 = USO_EXCLUSIVO_FEBRABAN1;
    }

    public int getCODIGO_MOVIMENTO_REMESS() {
        return CODIGO_MOVIMENTO_REMESS;
    }

    public void setCODIGO_MOVIMENTO_REMESS(int CODIGO_MOVIMENTO_REMESS) {
        this.CODIGO_MOVIMENTO_REMESS = CODIGO_MOVIMENTO_REMESS;
    }

    public int getJUROS_MULTA_ENCARGO() {
        return JUROS_MULTA_ENCARGO;
    }

    public void setJUROS_MULTA_ENCARGO(int JUROS_MULTA_ENCARGO) {
        this.JUROS_MULTA_ENCARGO = JUROS_MULTA_ENCARGO;
    }

    public double getVALOR_DESCONTO_CONCEDIDO() {
        return VALOR_DESCONTO_CONCEDIDO;
    }

    public void setVALOR_DESCONTO_CONCEDIDO(double VALOR_DESCONTO_CONCEDIDO) {
        this.VALOR_DESCONTO_CONCEDIDO = VALOR_DESCONTO_CONCEDIDO;
    }

    public double getVALOR_ABATIMENTO_CONCEDIDO() {
        return VALOR_ABATIMENTO_CONCEDIDO;
    }

    public void setVALOR_ABATIMENTO_CONCEDIDO(double VALOR_ABATIMENTO_CONCEDIDO) {
        this.VALOR_ABATIMENTO_CONCEDIDO = VALOR_ABATIMENTO_CONCEDIDO;
    }

    public double getVALOR_IOF_RECOLHIDO() {
        return VALOR_IOF_RECOLHIDO;
    }

    public void setVALOR_IOF_RECOLHIDO(double VALOR_IOF_RECOLHIDO) {
        this.VALOR_IOF_RECOLHIDO = VALOR_IOF_RECOLHIDO;
    }

    public double getVALOR_PAGO_SACADO() {
        return VALOR_PAGO_SACADO;
    }

    public void setVALOR_PAGO_SACADO(double VALOR_PAGO_SACADO) {
        this.VALOR_PAGO_SACADO = VALOR_PAGO_SACADO;
    }

    public double getVALOR_LIQUIDO_CREDITAR() {
        return VALOR_LIQUIDO_CREDITAR;
    }

    public void setVALOR_LIQUIDO_CREDITAR(double VALOR_LIQUIDO_CREDITAR) {
        this.VALOR_LIQUIDO_CREDITAR = VALOR_LIQUIDO_CREDITAR;
    }

    public double getVALOR_OUTRAS_DESPESAS() {
        return VALOR_OUTRAS_DESPESAS;
    }

    public void setVALOR_OUTRAS_DESPESAS(double VALOR_OUTRAS_DESPESAS) {
        this.VALOR_OUTRAS_DESPESAS = VALOR_OUTRAS_DESPESAS;
    }

    public double getVALOR_OUTROS_CREDITOS() {
        return VALOR_OUTROS_CREDITOS;
    }

    public void setVALOR_OUTROS_CREDITOS(double VALOR_OUTROS_CREDITOS) {
        this.VALOR_OUTROS_CREDITOS = VALOR_OUTROS_CREDITOS;
    }

    public double getDATA_OCORRENCI() {
        return DATA_OCORRENCI;
    }

    public void setDATA_OCORRENCI(int DATA_OCORRENCI) {
        this.DATA_OCORRENCI = DATA_OCORRENCI;
    }

    public int getDATA_EFETIVACAO_CREDITO() {
        return DATA_EFETIVACAO_CREDITO;
    }

    public void setDATA_EFETIVACAO_CREDITO(int DATA_EFETIVACAO_CREDITO) {
        this.DATA_EFETIVACAO_CREDITO = DATA_EFETIVACAO_CREDITO;
    }

    public int getNUMERO_BANCO_SACADOS() {
        return NUMERO_BANCO_SACADOS;
    }

    public void setNUMERO_BANCO_SACADOS(int NUMERO_BANCO_SACADOS) {
        this.NUMERO_BANCO_SACADOS = NUMERO_BANCO_SACADOS;
    }

    public String getNOME_BANCO_SACADOS() {
        return NOME_BANCO_SACADOS;
    }

    public void setNOME_BANCO_SACADOS(String NOME_BANCO_SACADOS) {
        this.NOME_BANCO_SACADOS = NOME_BANCO_SACADOS;
    }

    public String getID_AJUSTE_VENCIMENTO() {
        return ID_AJUSTE_VENCIMENTO;
    }

    public void setID_AJUSTE_VENCIMENTO(String ID_AJUSTE_VENCIMENTO) {
        this.ID_AJUSTE_VENCIMENTO = ID_AJUSTE_VENCIMENTO;
    }

    public String getID_AJUSTE_EMESSAO() {
        return ID_AJUSTE_EMESSAO;
    }

    public void setID_AJUSTE_EMESSAO(String ID_AJUSTE_EMESSAO) {
        this.ID_AJUSTE_EMESSAO = ID_AJUSTE_EMESSAO;
    }

    public int getID_MODELO_BLOQUETO_BANCO_SACADOS() {
        return ID_MODELO_BLOQUETO_BANCO_SACADOS;
    }

    public void setID_MODELO_BLOQUETO_BANCO_SACADOS(int ID_MODELO_BLOQUETO_BANCO_SACADOS) {
        this.ID_MODELO_BLOQUETO_BANCO_SACADOS = ID_MODELO_BLOQUETO_BANCO_SACADOS;
    }

    public String getID_VIA_ENTREGA_DISTRIBUICAO() {
        return ID_VIA_ENTREGA_DISTRIBUICAO;
    }

    public void setID_VIA_ENTREGA_DISTRIBUICAO(String ID_VIA_ENTREGA_DISTRIBUICAO) {
        this.ID_VIA_ENTREGA_DISTRIBUICAO = ID_VIA_ENTREGA_DISTRIBUICAO;
    }

    public int getID_ESPECIE_TITULO() {
        return ID_ESPECIE_TITULO;
    }

    public void setID_ESPECIE_TITULO(int ID_ESPECIE_TITULO) {
        this.ID_ESPECIE_TITULO = ID_ESPECIE_TITULO;
    }

    public String getID_ACEITE() {
        return ID_ACEITE;
    }

    public void setID_ACEITE(String ID_ACEITE) {
        this.ID_ACEITE = ID_ACEITE;
    }

    public String getCODIGO_DO_SACADO_BANCO() {
        return CODIGO_DO_SACADO_BANCO;
    }

    public void setCODIGO_DO_SACADO_BANCO(String CODIGO_DO_SACADO_BANCO) {
        this.CODIGO_DO_SACADO_BANCO = CODIGO_DO_SACADO_BANCO;
    }

    public String getUSO_EXCLUSIVO_FEBRABAN() {
        return USO_EXCLUSIVO_FEBRABAN;
    }

    public void setUSO_EXCLUSIVO_FEBRABAN(String USO_EXCLUSIVO_FEBRABAN) {
        this.USO_EXCLUSIVO_FEBRABAN = USO_EXCLUSIVO_FEBRABAN;
    }

    public String getUSO_EXCLUSIVO_FEBRABAN2() {
        return USO_EXCLUSIVO_FEBRABAN2;
    }

    public void setUSO_EXCLUSIVO_FEBRABAN2(String USO_EXCLUSIVO_FEBRABAN2) {
        this.USO_EXCLUSIVO_FEBRABAN2 = USO_EXCLUSIVO_FEBRABAN2;
    }

    public String getUSO_EXCLUSIVO_FEBRABAN3() {
        return USO_EXCLUSIVO_FEBRABAN3;
    }

    public void setUSO_EXCLUSIVO_FEBRABAN3(String USO_EXCLUSIVO_FEBRABAN3) {
        this.USO_EXCLUSIVO_FEBRABAN3 = USO_EXCLUSIVO_FEBRABAN3;
    }
    
}
