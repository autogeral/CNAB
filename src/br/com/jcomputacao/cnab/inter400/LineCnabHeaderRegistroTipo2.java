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
 * 29.07.21
 */
@Record
public class LineCnabHeaderRegistroTipo2 {
    private String tipoRegistro;
    private String menssagem2;
    private String menssagem3;
    private String menssagem4;
    private String menssagem5;
    private String dataLimiteConcessaoDesconto2;
    private String valorDesconto2;
    private String percentualDesconto2;
    private String branco1;
    private String dataLimiteConcessaoDesconto3;
    private String valorDesconto;
    private String percentualDesconto;
    private String branco2;
    private String nossoNumero;
    private String branco3;
    private String sequencialRegistro;
    
    @Field(offset = 1, length = 1)
    public String getStringtipoRegistro() {
        return tipoRegistro;
    }
    public void setStringtipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2, length = 78  ) 
    public String getStringmenssagem2() {
        return menssagem2;
    }
    public void setStringmenssagem2(String menssagem2) {
        this.menssagem2 = menssagem2;
    }

    @Field(offset = 80, length = 78)
    public String getStringmenssagem3() {
        return menssagem3;
    }
    public void setStringmenssagem3(String menssagem3) {
        this.menssagem3 = menssagem3;
    }

    @Field(offset = 158, length = 78)
    public String getStringmenssagem4() {
        return menssagem4;
    }
    public void setStringmenssagem4(String menssagem4) {
        this.menssagem4 = menssagem4;
    }
    
    @Field(offset = 236, length = 78)
    public String getStringmenssagem5() {
        return menssagem5;
    }
    public void setStringmenssagem5(String menssagem5) {
        this.menssagem5 = menssagem5;
    }
    
    @Field(offset = 314, length = 6)
    public String getStringdataLimiteConcessaoDesconto2() {
        return dataLimiteConcessaoDesconto2;
    }
    public void setStringdataLimiteConcessaoDesconto2(String dataLimiteConcessaoDesconto2) {
        this.dataLimiteConcessaoDesconto2 = dataLimiteConcessaoDesconto2;
    }
    
    @Field(offset = 320, length = 13)
    public String getStringvalorDesconto2() {
        return valorDesconto2;
    }
    public void setStringvalorDesconto2(String valorDesconto2) {
        this.valorDesconto2 = valorDesconto2;
    }
    
    @Field(offset = 333, length = 4)
    public String getStringpercentualDesconto2() {
        return percentualDesconto2;
    }
    public void setStringpercentualDesconto2(String percentualDesconto2) {
        this.percentualDesconto2 = percentualDesconto2;
    }
    
    @Field(offset = 337, length = 10)
    public String getStringbranco1() {
        return branco1;
    }
    public void setStringbranco1(String branco1) {
        this.branco1 = branco1;
    }
    
    @Field(offset = 347, length = 6)
    public String getStringdataLimiteConcessaoDesconto3() {
        return dataLimiteConcessaoDesconto3;
    }
    public void setSStringdataLimiteConcessaoDesconto3(String dataLimiteConcessaoDesconto3) {
        this.dataLimiteConcessaoDesconto3 = dataLimiteConcessaoDesconto3;
    }
       
    @Field(offset = 353, length = 13)
    public String getStringvalorDesconto() {
        return valorDesconto;
    }
    public void setStringvalorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    @Field(offset =366 , length = 4)
    public String getStringpercentualDesconto() {
        return percentualDesconto;
    }
    public void setStringpercentualDesconto(String percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
  
   @Field(offset = 370, length = 10)
    public String getStringbranco2() {
        return branco2;
    }
    public void setStringBranco2(String branco2) {
        this.branco2 = branco2;
    }
    
    @Field(offset = 380, length = 11)
    public String getStringnossoNumero() {
        return nossoNumero;
    }
    public void setStringnossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }
    
    @Field(offset = 391, length = 4)
    public String getStringbranco3() {
        return branco3;
    }
    public void setStringBranco3(String branco3) {
        this.branco3 = branco3;
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
        return "Registro0002HeaderArquivo{" + "tipoRegistro=" + tipoRegistro + ", menssagem2=" + menssagem2 + ", menssagem3=" + menssagem3 + ", menssagem4=" + menssagem4 + ", menssagem5=" + menssagem5 + ", dataLimiteConcessaoDesconto2=" + dataLimiteConcessaoDesconto2 + ", valorDesconto2=" + valorDesconto2 + ", percentualDesconto2=" + percentualDesconto2 + ", branco1=" + branco1 + ", dataLimiteConcessaoDesconto3=" + dataLimiteConcessaoDesconto3 + ", valorDesconto=" + valorDesconto + ", percentualDesconto=" + percentualDesconto + ",branco2=" + branco2 + ",nossoNumero= " + nossoNumero + ",branco3=" + branco3 + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}
