package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *     26.08.2021
 */
@Record
public class LineCnabRegistroTrailerRetorno {
    private String tipoRegistro;
    private String codigoRetorno;
    private String codigoServico;
    private String codigoBanco;
    private String brancos1;
    private String qtdTitulos1;
    private String valorTotal1;
    private String avisoBancario1;
    private String brancos2;
    private String qtdTitulos2;
    private String valorTotal2;
    private String avisoBancario2;
    private String brancos3;
    private String qtdTitulos3;
    private String valorTotal3;
    private String avisoBancario3;
    private String controleArquivo;
    private String qtdDetalhes;
    private String valorTotalInformado;
    private String Brancos4;
    private String numeroSequencial;

    @Field(offset = 1, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2, length = 1)
    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    @Field(offset = 3, length = 2)
    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    @Field(offset = 5, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 8, length = 10)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 18, length = 8)
    public String getQtdTitulos1() {
        return qtdTitulos1;
    }

    public void setQtdTitulos1(String qtdTitulos1) {
        this.qtdTitulos1 = qtdTitulos1;
    }

    @Field(offset = 26, length = 14)
    public String getValorTotal1() {
        return valorTotal1;
    }

    public void setValorTotal1(String valorTotal1) {
        this.valorTotal1 = valorTotal1;
    }

    @Field(offset = 40, length = 8)
    public String getAvisoBancario1() {
        return avisoBancario1;
    }

    public void setAvisoBancario1(String avisoBancario1) {
        this.avisoBancario1 = avisoBancario1;
    }

    @Field(offset = 48, length = 10)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 58, length = 8)
    public String getQtdTitulos2() {
        return qtdTitulos2;
    }

    public void setQtdTitulos2(String qtdTitulos2) {
        this.qtdTitulos2 = qtdTitulos2;
    }

    @Field(offset = 66, length = 14)
    public String getValorTotal2() {
        return valorTotal2;
    }

    public void setValorTotal2(String valorTotal2) {
        this.valorTotal2 = valorTotal2;
    }

    @Field(offset = 80, length = 8)
    public String getAvisoBancario2() {
        return avisoBancario2;
    }

    public void setAvisoBancario2(String avisoBancario2) {
        this.avisoBancario2 = avisoBancario2;
    }

    @Field(offset = 88, length = 90)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

    @Field(offset = 178, length = 8)
    public String getQtdTitulos3() {
        return qtdTitulos3;
    }

    public void setQtdTitulos3(String qtdTitulos3) {
        this.qtdTitulos3 = qtdTitulos3;
    }

    @Field(offset = 186, length = 14)
    public String getValorTotal3() {
        return valorTotal3;
    }

    public void setValorTotal3(String valorTotal3) {
        this.valorTotal3 = valorTotal3;
    }

    @Field(offset = 200, length = 8)
    public String getAvisoBancario3() {
        return avisoBancario3;
    }

    public void setAvisoBancario3(String avisoBancario3) {
        this.avisoBancario3 = avisoBancario3;
    }

    @Field(offset = 208, length = 5)
    public String getControleArquivo() {
        return controleArquivo;
    }

    public void setControleArquivo(String controleArquivo) {
        this.controleArquivo = controleArquivo;
    }

    @Field(offset = 213, length = 8)
    public String getQtdDetalhes() {
        return qtdDetalhes;
    }

    public void setQtdDetalhes(String qtdDetalhes) {
        this.qtdDetalhes = qtdDetalhes;
    }

    @Field(offset = 221, length = 14)
    public String getValorTotalInformado() {
        return valorTotalInformado;
    }

    public void setValorTotalInformado(String valorTotalInformado) {
        this.valorTotalInformado = valorTotalInformado;
    }

    @Field(offset = 235, length = 160)
    public String getBrancos4() {
        return Brancos4;
    }

    public void setBrancos4(String Brancos4) {
        this.Brancos4 = Brancos4;
    }

    @Field(offset = 395, length = 6)
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(String numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTrailerRetorno{" + "tipoRegistro=" + tipoRegistro + ", codigoRetorno=" + codigoRetorno + ", codigoServico=" + codigoServico + ", codigoBanco=" + codigoBanco + ", brancos1=" + brancos1 + ", qtdTitulos1=" + qtdTitulos1 + ", valorTotal1=" + valorTotal1 + ", avisoBancario1=" + avisoBancario1 + ", brancos2=" + brancos2 + ", qtdTitulos2=" + qtdTitulos2 + ", valorTotal2=" + valorTotal2 + ", avisoBancario2=" + avisoBancario2 + ", brancos3=" + brancos3 + ", qtdTitulos3=" + qtdTitulos3 + ", valorTotal3=" + valorTotal3 + ", avisoBancario3=" + avisoBancario3 + ", controleArquivo=" + controleArquivo + ", qtdDetalhes=" + qtdDetalhes + ", valorTotalInformado=" + valorTotalInformado + ", Brancos4=" + Brancos4 + ", numeroSequencial=" + numeroSequencial + '}';
    }

}
