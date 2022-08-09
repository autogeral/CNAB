package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   08.08.2022
 */
@Record
public class LineCnabRegistroTrailerArquivoPagamento extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String brancos1;
    private String totalQtdLotes;
    private String totalQtdRegistros;
    private String brancos2;
    
    
    /*
       REGISTRO TRAILER DE ARQUIVO
    */
    
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
    public String getTotalQtdLotes() {
        return totalQtdLotes;
    }

    public void setTotalQtdLotes(String totalQtdLotes) {
        this.totalQtdLotes = totalQtdLotes;
    }

    @Field(offset = 24, length = 6)
    public String getTotalQtdRegistros() {
        return totalQtdRegistros;
    }

    public void setTotalQtdRegistros(String totalQtdRegistros) {
        this.totalQtdRegistros = totalQtdRegistros;
    }

    @Field(offset = 30, length = 211)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTrailerArquivoPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancos1=" + brancos1 + ", totalQtdLotes=" + totalQtdLotes + ", totalQtdRegistros=" + totalQtdRegistros + ", brancos2=" + brancos2 + '}';
    }
}
