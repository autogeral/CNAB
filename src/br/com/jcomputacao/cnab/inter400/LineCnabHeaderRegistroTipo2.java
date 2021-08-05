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
    public String getTipoRegistro() {
        return tipoRegistro;
    }
    public void seTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 2, length = 78  ) 
    public String getMenssagem2() {
        return menssagem2;
    }
    public void setMenssagem2(String menssagem2) {
        this.menssagem2 = menssagem2;
    }

    @Field(offset = 80, length = 78)
    public String getMenssagem3() {
        return menssagem3;
    }
    public void setMenssagem3(String menssagem3) {
        this.menssagem3 = menssagem3;
    }

    @Field(offset = 158, length = 78)
    public String getMenssagem4() {
        return menssagem4;
    }
    public void setMenssagem4(String menssagem4) {
        this.menssagem4 = menssagem4;
    }
    
    @Field(offset = 236, length = 78)
    public String getMenssagem5() {
        return menssagem5;
    }
    public void setMenssagem5(String menssagem5) {
        this.menssagem5 = menssagem5;
    }
    
    @Field(offset = 314, length = 6)
    public String getDataLimiteConcessaoDesconto2() {
        return dataLimiteConcessaoDesconto2;
    }
    public void setDataLimiteConcessaoDesconto2(String dataLimiteConcessaoDesconto2) {
        this.dataLimiteConcessaoDesconto2 = dataLimiteConcessaoDesconto2;
    }
    
    @Field(offset = 320, length = 13)
    public String getValorDesconto2() {
        return valorDesconto2;
    }
    public void setValorDesconto2(String valorDesconto2) {
        this.valorDesconto2 = valorDesconto2;
    }
    
    @Field(offset = 333, length = 4)
    public String getPercentualDesconto2() {
        return percentualDesconto2;
    }
    public void setPercentualDesconto2(String percentualDesconto2) {
        this.percentualDesconto2 = percentualDesconto2;
    }
    
    @Field(offset = 337, length = 10)
    public String getBranco1() {
        return branco1;
    }
    public void setBranco1(String branco1) {
        this.branco1 = branco1;
    }
    
    @Field(offset = 347, length = 6)
    public String getDataLimiteConcessaoDesconto3() {
        return dataLimiteConcessaoDesconto3;
    }
    public void setDataLimiteConcessaoDesconto3(String dataLimiteConcessaoDesconto3) {
        this.dataLimiteConcessaoDesconto3 = dataLimiteConcessaoDesconto3;
    }
       
    @Field(offset = 353, length = 13)
    public String getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(String valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    @Field(offset =366 , length = 4)
    public String getPercentualDesconto() {
        return percentualDesconto;
    }
    public void setPercentualDesconto(String percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
  
   @Field(offset = 370, length = 10)
    public String getBranco2() {
        return branco2;
    }
    public void setBranco2(String branco2) {
        this.branco2 = branco2;
    }
    
    @Field(offset = 380, length = 11)
    public String getNossoNumero() {
        return nossoNumero;
    }
    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }
    
    @Field(offset = 391, length = 4)
    public String getBranco3() {
        return branco3;
    }
    public void setBranco3(String branco3) {
        this.branco3 = branco3;
    }
    
     @Field(offset =395 , length = 6)
    public String getSequencialRegistro() {
        return sequencialRegistro;
    }
    public void setSequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "tipoRegistro=" + tipoRegistro + ", menssagem2=" + menssagem2 + ", menssagem3=" + menssagem3 + ", menssagem4=" + menssagem4 + ", menssagem5=" + menssagem5 + ", dataLimiteConcessaoDesconto2=" + dataLimiteConcessaoDesconto2 + ", valorDesconto2=" + valorDesconto2 + ", percentualDesconto2=" + percentualDesconto2 + ", branco1=" + branco1 + ", dataLimiteConcessaoDesconto3=" + dataLimiteConcessaoDesconto3 + ", valorDesconto=" + valorDesconto + ", percentualDesconto=" + percentualDesconto + ",branco2=" + branco2 + ",nossoNumero= " + nossoNumero + ",branco3=" + branco3 + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}
