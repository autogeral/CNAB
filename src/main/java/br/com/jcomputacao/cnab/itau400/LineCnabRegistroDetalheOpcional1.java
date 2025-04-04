package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   26.08.2021
 * -> Layout referente ao arquivo remessa
 */
@Record
public class LineCnabRegistroDetalheOpcional1 {
    private String tipoRegistro;
    private String codMulta;
    private String dataMulta;
    private String multa;
    private String brancos;
    private String numeroSequencial;

    @Field(offset = 1 , length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2 , length = 1)
    public String getCodMulta() {
        return codMulta;
    }

    public void setCodMulta(String codMulta) {
        this.codMulta = codMulta;
    }
 
    @Field(offset = 3 , length = 8)
    public String getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
    }

    @Field(offset = 11 , length = 13)
    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    @Field(offset = 24 , length = 370)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
    }

    @Field(offset = 395 , length = 6)
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(String numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroDetalheOpcional1{" + "tipoRegistro=" + tipoRegistro + ", codMulta=" + codMulta + ", dataMulta=" + dataMulta + ", multa=" + multa + ", brancos=" + brancos + ", numeroSequencial=" + numeroSequencial + '}';
    }
    
    
    
    
}
