/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private String identificacaoRegistro;
    private String qtdBoletos;
    private String branco;
    private String sequencialRegistro;

    @Field(offset = 1, length = 1)
    public String getStringidentificacaoRegistro() {
        return identificacaoRegistro;
    }
    public void setStringidentificacaoRegistro(String identificacaoRegistro) {
        this.identificacaoRegistro = identificacaoRegistro;
    }

    @Field(offset = 2, length = 6  ) 
    public String getStringqtdBoletos() {
        return qtdBoletos;
    }
    public void setStringqtdBoletos(String qtdBoletos) {
        this.qtdBoletos = qtdBoletos;
    }

    @Field(offset = 8, length = 387)
    public String getStringbranco() {
        return branco;
    }
    public void setStringbranco(String branco) {
        this.branco = branco;
    }
    
     @Field(offset =395 , length = 6)
    public String getStrinsequencialRegistro() {
        return sequencialRegistro;
    }
    public void setStrinsequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "identificacaoRegistro=" + identificacaoRegistro + ", qtdBoletos=" + qtdBoletos + ", branco=" + branco + ", sequencialRegistro=" + sequencialRegistro +"}";
    }
}
