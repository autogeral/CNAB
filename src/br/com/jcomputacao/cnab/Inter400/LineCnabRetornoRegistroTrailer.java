/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.Inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
/**
 *
 * @author larissa.camargo
 */
@Record
public class LineCnabRetornoRegistroTrailer {
    private String codigoRegistro;
    private String codigoRetorno;
    private String tipoRegisro;
    private String codigoBanco;
    private String branco1;
    private String qtdRegistros1;
    private String branco2;
    private String qtdRegistros2;
    private String valorRegistros1;
    private String branco3;
    private String qtdRegistros3;
    private String branco4;
    private String qtdRegistros4;
    private String valorRegistros2;
    private String branco5;
    private String sequencialRegistro;
   
    
    //Identificação de registro = 9
    @Field(offset = 1, length = 1)
    public String getStringCodigoRegistro() {
        return codigoRegistro;
    }
    public void setStringCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    // Identificação do retorno = 2
    @Field(offset = 2, length = 1)
    public String getStringcodigoRetorno() {
        return codigoRetorno;
    }
    public void setStringcodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    // Identificação do tipo de registro = 01
    @Field(offset = 3, length = 2)
    public String getStringtipoRegisro() {
        return tipoRegisro;
    }
    public void setStringtipoRegisro(String tipoRegisro) {
        this.tipoRegisro = tipoRegisro;
    }

    // Código banco = 077
    @Field(offset = 5, length = 3)
    public String getStringcodigoBanco() {
        return codigoBanco;
    }
    public void setStringcodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
    
    //Identificação da empresa beneficiária no Inter = Carteira (112), Agência (0001) e Conta corrente 
    @Field(offset = 8, length = 10)
    public String getStringbranco1() {
        return branco1;
    }
    public void setStringbranco1(String branco1) {
        this.branco1 = branco1;
    }
    
    //Nº Controle de participante=  Uso da empresa
    @Field(offset = 18, length = 8)
    public String getStringqtdRegistros1() {
        return qtdRegistros1;
    }
    public void setStringqtdRegistros1(String qtdRegistros1) {
        this.qtdRegistros1 = qtdRegistros1;
    }
    
    // Zeros
    @Field(offset = 26, length = 32)
    public String getStringbranco2() {
        return branco2;
    }
    public void setStringbranco2(String branco2) {
        this.branco2 = branco2;
    }
    
    //Identificação do título no banco= ("Nosso número")
    @Field(offset = 58, length = 5)
    public String getStringqtdRegistros2() {
        return qtdRegistros2;
    }
    public void setStringqtdRegistros2(String qtdRegistros2) {
        this.qtdRegistros2 = qtdRegistros2;
    }
    
    // Branco
    @Field(offset = 63, length = 12)
    public String getStringvalorRegistros1() {
        return valorRegistros1;
    }
    public void setStringvalorRegistros1(String valorRegistros1) {
        this.valorRegistros1 = valorRegistros1;
    }

    // Carteira = 112
    @Field(offset = 75, length = 12)
    public String getStringbranco3() {
        return branco3;
    }
    public void setStringbranco3(String branco3) {
        this.branco3 = branco3;
    }

    //Identificação de ocorrência = 02. Entrada confirmada (verificar motivo na posição XXX a XXX)
    //03. Entrada rejeitada (verificar motivo na posição XXX a XXX)
    // 04. Liquidação normal (sem motivo)
    @Field(offset = 87, length = 5)
    public String getStringqtdRegistros3() {
        return qtdRegistros3;
    }
    public void setStringqtdRegistros3(String qtdRegistros3) {
        this.qtdRegistros3 = qtdRegistros3;
    }
    
    //Data ocorrência no banco = DDMMAA
    @Field(offset =92 , length = 24)
    public String getStringbranco4() {
        return branco4;
    }
    public void setStringbranco4(String branco4) {
        this.branco4 = branco4;
    }
    
    // Nº do Documento = Seu número
   @Field(offset =116 , length = 5)
    public String getStringqtdRegistros4() {
        return qtdRegistros4;
    }
    public void setStringqtdRegistros4(String qtdRegistros4) {
        this.qtdRegistros4 = qtdRegistros4;
    }
     
    // Identificação do título no Inter = Nº banco (nosso número)
    @Field(offset =121 , length = 12)
    public String getStringvalorRegistros2() {
        return valorRegistros2;
    }
    public void setStringvalorRegistros2(String valorRegistros2) {
        this.valorRegistros2 = valorRegistros2;
    }  
    // Branco
    @Field(offset =133 , length = 262)
    public String getStringbranco5() {
        return branco5;
    }
    public void setStringbranco5(String branco5) {
        this.branco5 = branco5;
    }
    
    // Nº Sequencial registro
    @Field(offset =395 , length = 6)
    public String getStringsequencialRegistro() {
        return sequencialRegistro;
    }
    public void setStringsequencialRegistro(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistro=" + codigoRegistro + ", codigoRetorno=" + codigoRetorno + ", tipoRegisro=" + tipoRegisro + ", codigoBanco=" + codigoBanco + ", branco1=" + branco1 + ", qtdRegistros1=" + qtdRegistros1 + ", branco2=" + branco2 + ", qtdRegistros2=" + qtdRegistros2 + ", valorRegistros1=" + valorRegistros1 + ", branco3=" + branco3 + ", qtdRegistros3=" + qtdRegistros3 + ",branco4= " + branco4 + ",qtdRegistros4= " + qtdRegistros4 + ",valorRegistros2= " + valorRegistros2 + ",branco5= " + branco5 + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}
