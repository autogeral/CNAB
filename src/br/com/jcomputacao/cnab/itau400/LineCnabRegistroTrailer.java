
package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    26.08.2021
 * -> Layout referente ao arquivo remessa
 */
@Record
public class LineCnabRegistroTrailer {
    private String tipoRegistro;
    private String brancos;
    private String numeroSequencial;

    
    @Field(offset = 1, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2, length = 393)
    public String getBrancos() {
        return brancos;
    }

    public void setBrancos(String brancos) {
        this.brancos = brancos;
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
        return "LineCnabRegistroTrailer{" + "tipoRegistro=" + tipoRegistro + ", brancos=" + brancos + ", numeroSequencial=" + numeroSequencial + '}';
    }
    
    
    
}
