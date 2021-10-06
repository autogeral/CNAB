package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
/**
 *
 * @author larissa.camargo
 *      02.08.21
 */
@Record
public class LineCnabRetornoRegistroTrailer {
    private String codigoRegistroTrailer;
    private String codigoRetornoTrailer;
    private String tipoRegistro;
    private String codigoBancoTrailer;
    private String brancoTrailer;
    private String qtdRegistros1;
    private String brancoTrailer2;
    private String qtdRegistros2;
    private String valorRegistros1;
    private String brancoTrailer3;
    private String qtdRegistros3;
    private String brancoTrailer4;
    private String qtdRegistros4;
    private String valorRegistros2;
    private String brancoTrailer5;
    private String sequencialRegistroTrailer;
   
    
    //Identificação de registro = 9
    @Field(offset = 1, length = 1)
    public String getCodigoRegistroTrailer() {
        return codigoRegistroTrailer;
    }
    public void setCodigoRegistroTrailer(String codigoRegistroTrailer) {
        this.codigoRegistroTrailer = codigoRegistroTrailer;
    }

    // Identificação do retorno = 2
    @Field(offset = 2, length = 1)
    public String getCodigoRetornoTrailer() {
        return codigoRetornoTrailer;
    }
    public void setCodigoRetornoTrailer(String codigoRetornoTrailer) {
        this.codigoRetornoTrailer = codigoRetornoTrailer;
    }

    // Identificação do tipo de registro = 01
    @Field(offset = 3, length = 2)
    public String getTipoRegistroTrailer() {
        return tipoRegistro;
    }
    public void setTipoRegistroTrailer(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    // Código banco = 077
    @Field(offset = 5, length = 3)
    public String getCodigoBancoTrailer() {
        return codigoBancoTrailer;
    }
    public void setCodigoBancoTrailer(String codigoBancoTrailer) {
        this.codigoBancoTrailer = codigoBancoTrailer;
    }
    
    //Identificação da empresa beneficiária no Inter = Carteira (112), Agência (0001) e Conta corrente 
    @Field(offset = 8, length = 10)
    public String getBrancoTrailer() {
        return brancoTrailer;
    }
    public void setBrancoTrailer(String brancoTrailer) {
        this.brancoTrailer = brancoTrailer;
    }
    
    //Nº Controle de participante=  Uso da empresa
    @Field(offset = 18, length = 8)
    public String getQtdRegistros1Trailer() {
        return qtdRegistros1;
    }
    public void setQtdRegistros1Trailer(String qtdRegistros1) {
        this.qtdRegistros1 = qtdRegistros1;
    }
    
    // Zeros
    @Field(offset = 26, length = 32)
    public String getBrancoTrailer2() {
        return brancoTrailer2;
    }
    public void setBrancoTrailer2(String brancoTrailer2) {
        this.brancoTrailer2 = brancoTrailer2;
    }
    
    //Identificação do título no banco= ("Nosso número")
    @Field(offset = 58, length = 5)
    public String getQtdRegistros2Trailer() {
        return qtdRegistros2;
    }
    public void setQtdRegistros2Trailer(String qtdRegistros2) {
        this.qtdRegistros2 = qtdRegistros2;
    }
    
    // Branco
    @Field(offset = 63, length = 12)
    public String getValorRegistros1Trailer() {
        return valorRegistros1;
    }
    public void setValorRegistros1Trailer(String valorRegistros1) {
        this.valorRegistros1 = valorRegistros1;
    }

    // Carteira = 112
    @Field(offset = 75, length = 12)
    public String getBrancoTrailer3() {
        return brancoTrailer3;
    }
    public void setBrancoTrailer3(String brancoTrailer3) {
        this.brancoTrailer3 = brancoTrailer3;
    }

    //Identificação de ocorrência = 02. Entrada confirmada (verificar motivo na posição XXX a XXX)
    //03. Entrada rejeitada (verificar motivo na posição XXX a XXX)
    // 04. Liquidação normal (sem motivo)
    @Field(offset = 87, length = 5)
    public String getQtdRegistros3Trailer() {
        return qtdRegistros3;
    }
    public void setQtdRegistros3Trailer(String qtdRegistros3) {
        this.qtdRegistros3 = qtdRegistros3;
    }
    
    //Data ocorrência no banco = DDMMAA
    @Field(offset =92 , length = 24)
    public String getBrancoTrailer4() {
        return brancoTrailer4;
    }
    public void setBrancoTrailer4(String brancoTrailer4) {
        this.brancoTrailer4 = brancoTrailer4;
    }
    
    // Nº do Documento = Seu número
   @Field(offset =116 , length = 5)
    public String getQtdRegistros4Trailer() {
        return qtdRegistros4;
    }
    public void setQtdRegistros4Trailer(String qtdRegistros4) {
        this.qtdRegistros4 = qtdRegistros4;
    }
     
    // Identificação do título no Inter = Nº banco (nosso número)
    @Field(offset =121 , length = 12)
    public String getValorRegistros2Trailer() {
        return valorRegistros2;
    }
    public void setValorRegistros2Trailer(String valorRegistros2) {
        this.valorRegistros2 = valorRegistros2;
    }  
    // Branco
    @Field(offset =133 , length = 262)
    public String getBrancoTrailer5() {
        return brancoTrailer5;
    }
    public void setBrancoTrailer5(String brancoTrailer5) {
        this.brancoTrailer5 = brancoTrailer5;
    }
    
    // Nº Sequencial registro
    @Field(offset =395 , length = 6)
    public String getSequencialRegistroTrailer() {
        return sequencialRegistroTrailer;
    }
    public void setSequencialRegistroTrailer(String sequencialRegistroTrailer) {
        this.sequencialRegistroTrailer = sequencialRegistroTrailer;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistroTrailer + ", codigoRetornoTrailer=" + codigoRetornoTrailer + ", tipoRegistro=" + tipoRegistro + ", codigoBancoTrailer=" + codigoBancoTrailer + ", brancoTrailer=" + brancoTrailer + ", qtdRegistros1=" + qtdRegistros1 + ", brancoTrailer2=" + brancoTrailer2 + ", qtdRegistros2=" + qtdRegistros2 + ", valorRegistros1=" + valorRegistros1 + ", brancoTrailer3=" + brancoTrailer3 + ", qtdRegistros3=" + qtdRegistros3 + ",brancoTrailer4= " + brancoTrailer4 + ",qtdRegistros4= " + qtdRegistros4 + ",valorRegistros2= " + valorRegistros2 + ",brancoTrailer5= " + brancoTrailer5 + ",sequencialRegistroTrailer= " + sequencialRegistroTrailer + "}";
    }
}
