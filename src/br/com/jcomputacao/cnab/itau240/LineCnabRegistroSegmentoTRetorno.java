package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    27.08.2021
 * 
 */
@Record
public class LineCnabRegistroSegmentoTRetorno extends LineModel {

    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String segmento;
    private String boletoDda;
    private String codOcorrencia;
    private String zeros1;
    private String agencia;
    private String zeros2;
    private String conta;
    private String zeros3;
    private String dac1;
    private String numCarteira;
    private String nossoNumero;
    private String dac2;
    private String brancos1;
    private String zeros4;
    private String seuNumero;
    private String brancos2;
    private String vencimento;
    private String valorTitulo;
    private String zeros5;
    private String agCobradora;
    private String dac3;
    private String usoEmpresa;
    private String zeros6;
    private String codigoInscricao;
    private String inscricaoNumero;
    private String nome;
    private String brancos3;
    private String zeros7;
    private String tarifaCustas;
    private String erros;
    private String codLiquidacao;
    private String brancos4;
    

    @Field(offset = 1, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

     @Field(offset = 4, length = 4)
    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

     @Field(offset = 8, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

     @Field(offset = 9, length = 5)
    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

     @Field(offset = 14, length = 1)
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

     @Field(offset = 15, length = 1)
    public String getBoletoDda() {
        return boletoDda;
    }

    public void setBoletoDda(String boletoDda) {
        this.boletoDda = boletoDda;
    }

    @Field(offset = 16, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

     @Field(offset = 18, length = 1)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

     @Field(offset = 19, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

     @Field(offset = 23, length = 8)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

     @Field(offset = 31, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

     @Field(offset = 36, length = 1)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

     @Field(offset = 37, length = 1)
    public String getDac1() {
        return dac1;
    }

    public void setDac1(String dac1) {
        this.dac1 = dac1;
    }

     @Field(offset = 38, length = 3)
    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

     @Field(offset = 41, length = 8)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

     @Field(offset = 49, length = 1)
    public String getDac2() {
        return dac2;
    }

    public void setDac2(String dac2) {
        this.dac2 = dac2;
    }

     @Field(offset = 50, length = 8)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

     @Field(offset = 58, length = 1)
    public String getZeros4() {
        return zeros4;
    }

    public void setZeros4(String zeros4) {
        this.zeros4 = zeros4;
    }

     @Field(offset = 59, length = 10)
    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

     @Field(offset = 69, length = 5)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

     @Field(offset = 74, length = 8)
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

     @Field(offset = 82, length = 15)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

     @Field(offset = 97, length = 3)
    public String getZeros5() {
        return zeros5;
    }

    public void setZeros5(String zeros5) {
        this.zeros5 = zeros5;
    }

     @Field(offset = 100, length = 5)
    public String getAgCobradora() {
        return agCobradora;
    }

    public void setAgCobradora(String agCobradora) {
        this.agCobradora = agCobradora;
    }

     @Field(offset = 105, length = 1)
    public String getDac3() {
        return dac3;
    }

    public void setDac3(String dac3) {
        this.dac3 = dac3;
    }

     @Field(offset = 106, length = 25)
    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }

     @Field(offset = 131, length = 2)
    public String getZeros6() {
        return zeros6;
    }

    public void setZeros6(String zeros6) {
        this.zeros6 = zeros6;
    }

     @Field(offset = 133, length = 2)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

     @Field(offset = 134, length = 15)
    public String getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(String inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

     @Field(offset = 149, length = 30)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     @Field(offset = 179, length = 10)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

     @Field(offset = 189, length = 10)
    public String getZeros7() {
        return zeros7;
    }

    public void setZeros7(String zeros7) {
        this.zeros7 = zeros7;
    }

     @Field(offset = 199, length = 15)
    public String getTarifaCustas() {
        return tarifaCustas;
    }

    public void setTarifaCustas(String tarifaCustas) {
        this.tarifaCustas = tarifaCustas;
    }

    @Field(offset = 214, length = 8)
    public String getErros() {
        return erros;
    }

    public void setErros(String erros) {
        this.erros = erros;
    }

    @Field(offset = 222, length = 2)
    public String getCodLiquidacao() {
        return codLiquidacao;
    }

    public void setCodLiquidacao(String codLiquidacao) {
        this.codLiquidacao = codLiquidacao;
    }

    @Field(offset = 224, length = 17)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoTRetorno{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", boletoDda=" + boletoDda + ", codOcorrencia=" + codOcorrencia + ", zeros1=" + zeros1 + ", agencia=" + agencia + ", zeros2=" + zeros2 + ", conta=" + conta + ", zeros3=" + zeros3 + ", dac1=" + dac1 + ", numCarteira=" + numCarteira + ", nossoNumero=" + nossoNumero + ", dac2=" + dac2 + ", brancos1=" + brancos1 + ", zeros4=" + zeros4 + ", seuNumero=" + seuNumero + ", brancos2=" + brancos2 + ", vencimento=" + vencimento + ", valorTitulo=" + valorTitulo + ", zeros5=" + zeros5 + ", agCobradora=" + agCobradora + ", dac3=" + dac3 + ", usoEmpresa=" + usoEmpresa + ", zeros6=" + zeros6 + ", codigoInscricao=" + codigoInscricao + ", inscricaoNumero=" + inscricaoNumero + ", nome=" + nome + ", brancos3=" + brancos3 + ", zeros7=" + zeros7 + ", tarifaCustas=" + tarifaCustas + ", erros=" + erros + ", codLiquidacao=" + codLiquidacao + ", brancos4=" + brancos4 + '}';
    }  
    
    public void unirSegmentosUeT(LineCnabRegistroSegmentoTRetorno segT) {
        LineCnabRegistroSegmentoURetorno tipoSegmentoU = new LineCnabRegistroSegmentoURetorno();
        tipoSegmentoU.getSegmento();
        String tipoSegmentoT = segT.getSegmento();
        if (!"U".equals(tipoSegmentoU) || !"T".equals(tipoSegmentoT)) {
            throw new IllegalArgumentException("Metodo unirSegmentosUeT() so deve ser chamado a partir de um objeto de segmento U com um ojeto segmento T como parametro");
        }
        this.setAgencia(segT.getAgencia());
        this.setConta(segT.getConta());
        this.setDac1(segT.getDac1());
        this.setNossoNumero(segT.getNossoNumero());
        this.setNumCarteira(segT.getNumCarteira());
        this.setVencimento(segT.getVencimento());
        this.setValorTitulo(segT.getValorTitulo());
        tipoSegmentoU.setCodigoBanco(segT.getCodigoBanco()); // segmento U
        this.setAgCobradora(segT.getAgCobradora());
        this.setDac3(segT.getDac3());
        this.setCodigoInscricao(segT.getCodigoInscricao());
        this.setInscricaoNumero(segT.getInscricaoNumero());
        this.setNome(segT.getNome());
        tipoSegmentoU.setValorIof(segT.getTarifaCustas());
        tipoSegmentoU.setCodOcorrencia(segT.getCodOcorrencia());
    }
}
