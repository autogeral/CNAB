package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   30.08.2021
 */

@Record
public class LineCnabRegistroTrailerLote {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String brancos1;
    private String qtdeRegistros;
    private String qtdeCobrancaSimples;
    private String valorCobrancaSimples;
    private String qtdeCobrancaVinculada;
    private String valorCobrancaVinculada;
    private String zeros;
    private String avisoBancario;
    private String brancos2;

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

     @Field(offset = 9, length = 9)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

     @Field(offset = 18, length = 6)
    public String getQtdeRegistros() {
        return qtdeRegistros;
    }

    public void setQtdeRegistros(String qtdeRegistros) {
        this.qtdeRegistros = qtdeRegistros;
    }

     @Field(offset = 24, length = 6)
    public String getQtdeCobrancaSimples() {
        return qtdeCobrancaSimples;
    }

    public void setQtdeCobrancaSimples(String qtdeCobrancaSimples) {
        this.qtdeCobrancaSimples = qtdeCobrancaSimples;
    }

     @Field(offset = 30, length = 17)
    public String getValorCobrancaSimples() {
        return valorCobrancaSimples;
    }

    public void setValorCobrancaSimples(String valorCobrancaSimples) {
        this.valorCobrancaSimples = valorCobrancaSimples;
    }

     @Field(offset = 47, length = 6)
    public String getQtdeCobrancaVinculada() {
        return qtdeCobrancaVinculada;
    }

    public void setQtdeCobrancaVinculada(String qtdeCobrancaVinculada) {
        this.qtdeCobrancaVinculada = qtdeCobrancaVinculada;
    }

     @Field(offset = 53, length = 17)
    public String getValorCobrancaVinculada() {
        return valorCobrancaVinculada;
    }

    public void setValorCobrancaVinculada(String valorCobrancaVinculada) {
        this.valorCobrancaVinculada = valorCobrancaVinculada;
    }

     @Field(offset = 70, length = 46)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

     @Field(offset = 116, length = 8)
    public String getAvisoBancario() {
        return avisoBancario;
    }

    public void setAvisoBancario(String avisoBancario) {
        this.avisoBancario = avisoBancario;
    }

     @Field(offset = 124, length = 117)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTrailerLoteRetorno{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancos1=" + brancos1 + ", qtdeRegistros=" + qtdeRegistros + ", qtdeCobrancaSimples=" + qtdeCobrancaSimples + ", valorCobrancaSimples=" + valorCobrancaSimples + ", qtdeCobrancaVinculada=" + qtdeCobrancaVinculada + ", valorCobrancaVinculada=" + valorCobrancaVinculada + ", zeros=" + zeros + ", avisoBancario=" + avisoBancario + ", brancos2=" + brancos2 + '}';
    } 
}
