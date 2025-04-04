package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
/**
 *
 * @author larissa.camargo
 *    30.07.21
 */

@Record
public class LineCnabHeaderRegistroTrailer {
    private String identificacaoRegistroTrailer;
    private String qtdBoletos;
    private String branco;
    private String sequencialRegistro;

    @Field(offset = 1, length = 1)
    public String getIdentificacaoRegistroTrailer() {
        return identificacaoRegistroTrailer;
    }
    public void setIdentificacaoRegistroTrailer(String identificacaoRegistroTrailer) {
        this.identificacaoRegistroTrailer = identificacaoRegistroTrailer;
    }

    @Field(offset = 2, length = 6  ) 
    public String getQtdBoletosTrailer() {
        return qtdBoletos;
    }
    public void setQtdBoletosTrailer(String qtdBoletos) {
        this.qtdBoletos = qtdBoletos;
    }

    @Field(offset = 8, length = 387)
    public String getBrancoTrailer() {
        return branco;
    }
    public void setBrancoTrailer(String branco) {
        this.branco = branco;
    }
    
     @Field(offset =395 , length = 6)
    public String getSequencialRegistroTrailer() {
        return sequencialRegistro;
    }
    public void setSequencialRegistroTrailer(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "identificacaoRegistroTrailer=" + identificacaoRegistroTrailer + ", qtdBoletos=" + qtdBoletos + ", branco=" + branco + ", sequencialRegistro=" + sequencialRegistro +"}";
    }
}
