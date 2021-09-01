package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   30.08.2021
 */

@Record
public class LineCnabRegistroTrailerArquivo {
    private String codigoBanco;
    private String codigoLote;
    private String registro;
    private String brancos1;
    private String totalLotes;
    private String totalRegistros;
    private String zeros;
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
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Field(offset = 9, length = 9)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 18, length = 6)
    public String getTotalLotes() {
        return totalLotes;
    }

    public void setTotalLotes(String totalLotes) {
        this.totalLotes = totalLotes;
    }

    @Field(offset = 24, length = 6)
    public String getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(String totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    @Field(offset = 30, length = 6)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

    @Field(offset = 36, length =205)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTrailerRetorno{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", registro=" + registro + ", brancos1=" + brancos1 + ", totalLotes=" + totalLotes + ", totalRegistros=" + totalRegistros + ", zeros=" + zeros + ", brancos2=" + brancos2 + '}';
    } 
}
