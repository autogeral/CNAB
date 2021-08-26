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
public class LineCnabRegistroDetalheRateio {
    private String tipoRegistro;
    private String codigoInscricao;
    private String numeroInscricao;
    private String agencia;
    private String zeros;
    private String conta;
    private String dac;
    private String numCarteira;
    private String nossoNumero;
    private String dacNossoNumero;
    private String sequencia;
    private String agencia1;
    private String conta1;
    private String dac1;
    private String valor1;
    private String agencia2;
    private String conta2;
    private String dac2;
    private String valor2;
    private String agencia3;
    private String conta3;
    private String dac3;
    private String valor3;
    private String agencia4;
    private String conta4;
    private String dac4;
    private String valor4;
    private String agencia5;
    private String conta5;
    private String dac5;
    private String valor5;
    private String agencia6;
    private String conta6;
    private String dac6;
    private String valor6;
    private String agencia7;
    private String conta7;
    private String dac7;
    private String valor7;
    private String agencia8;
    private String conta8;
    private String dac8;
    private String valor8;
    private String agencia9;
    private String conta9;
    private String dac9;
    private String valor9;
    private String agencia10;
    private String conta10;
    private String dac10;
    private String valor10;
    private String agencia11;
    private String conta11;
    private String dac11;
    private String valor11;
    private String agencia12;
    private String conta12;
    private String dac12;
    private String valor12;
    private String agencia13;
    private String conta13;
    private String dac13;
    private String valor13;
    private String agencia14;
    private String conta14;
    private String dac14;
    private String valor14;
    private String tipoValor;
    private String numeroSequencial;

    @Field(offset = 1, length= 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

      @Field(offset = 2, length= 2)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    @Field(offset = 4, length= 14)
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
    
   @Field(offset = 18, length= 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Field(offset = 22, length= 2)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

    @Field(offset = 24, length= 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Field(offset = 29, length= 1)
    public String getDac() {
        return dac;
    }

    public void setDac(String dac) {
        this.dac = dac;
    }

    @Field(offset = 30, length= 3)
    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

    @Field(offset = 33, length= 8)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Field(offset = 41, length= 1)
    public String getDacNossoNumero() {
        return dacNossoNumero;
    }

    public void setDacNossoNumero(String dacNossoNumero) {
        this.dacNossoNumero = dacNossoNumero;
    }

    @Field(offset = 42, length= 2)
    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    @Field(offset = 44, length= 4)
    public String getAgencia1() {
        return agencia1;
    }

    public void setAgencia1(String agencia1) {
        this.agencia1 = agencia1;
    }

    @Field(offset = 48, length= 7)
    public String getConta1() {
        return conta1;
    }

    public void setConta1(String conta1) {
        this.conta1 = conta1;
    }

    @Field(offset = 55, length= 1)
    public String getDac1() {
        return dac1;
    }

    public void setDac1(String dac1) {
        this.dac1 = dac1;
    }

    @Field(offset = 56, length= 13)
    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    @Field(offset = 69, length= 4)
    public String getAgencia2() {
        return agencia2;
    }

    public void setAgencia2(String agencia2) {
        this.agencia2 = agencia2;
    }

    @Field(offset = 73, length= 7)
    public String getConta2() {
        return conta2;
    }

    public void setConta2(String conta2) {
        this.conta2 = conta2;
    }

    @Field(offset = 80, length= 1)
    public String getDac2() {
        return dac2;
    }

    public void setDac2(String dac2) {
        this.dac2 = dac2;
    }

   @Field(offset = 81, length= 13)
    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    @Field(offset = 94, length= 4)
    public String getAgencia3() {
        return agencia3;
    }

    public void setAgencia3(String agencia3) {
        this.agencia3 = agencia3;
    }

    @Field(offset = 98, length= 7)
    public String getConta3() {
        return conta3;
    }

    public void setConta3(String conta3) {
        this.conta3 = conta3;
    }

    @Field(offset = 105, length= 1)
    public String getDac3() {
        return dac3;
    }

    public void setDac3(String dac3) {
        this.dac3 = dac3;
    }

    @Field(offset = 106, length= 13)
    public String getValor3() {
        return valor3;
    }

    public void setValor3(String valor3) {
        this.valor3 = valor3;
    }
    
    @Field(offset = 119, length= 4)
    public String getAgencia4() {
        return agencia4;
    }

    public void setAgencia4(String agencia4) {
        this.agencia4 = agencia4;
    }

    @Field(offset = 123, length= 7)
    public String getConta4() {
        return conta4;
    }

    public void setConta4(String conta4) {
        this.conta4 = conta4;
    }

    @Field(offset = 130, length= 1)
    public String getDac4() {
        return dac4;
    }

    public void setDac4(String dac4) {
        this.dac4 = dac4;
    }

    @Field(offset = 131, length= 13)
    public String getValor4() {
        return valor4;
    }

    public void setValor4(String valor4) {
        this.valor4 = valor4;
    }

    @Field(offset = 144, length= 4)
    public String getAgencia5() {
        return agencia5;
    }

    public void setAgencia5(String agencia5) {
        this.agencia5 = agencia5;
    }

    @Field(offset = 148, length= 7)
    public String getConta5() {
        return conta5;
    }

    public void setConta5(String conta5) {
        this.conta5 = conta5;
    }

    @Field(offset = 155, length= 1)
    public String getDac5() {
        return dac5;
    }

    public void setDac5(String dac5) {
        this.dac5 = dac5;
    }

    @Field(offset = 156, length= 13)
    public String getValor5() {
        return valor5;
    }

    public void setValor5(String valor5) {
        this.valor5 = valor5;
    }

    @Field(offset = 169, length= 4)
    public String getAgencia6() {
        return agencia6;
    }

    public void setAgencia6(String agencia6) {
        this.agencia6 = agencia6;
    }

    @Field(offset = 173, length= 7)
    public String getConta6() {
        return conta6;
    }

    public void setConta6(String conta6) {
        this.conta6 = conta6;
    }

    @Field(offset = 180, length= 1)
    public String getDac6() {
        return dac6;
    }

    public void setDac6(String dac6) {
        this.dac6 = dac6;
    }

    @Field(offset = 181, length= 13)
    public String getValor6() {
        return valor6;
    }

    public void setValor6(String valor6) {
        this.valor6 = valor6;
    }

    @Field(offset = 194, length= 4)
    public String getAgencia7() {
        return agencia7;
    }

    public void setAgencia7(String agencia7) {
        this.agencia7 = agencia7;
    }

    @Field(offset = 198, length= 7)
    public String getConta7() {
        return conta7;
    }

    public void setConta7(String conta7) {
        this.conta7 = conta7;
    }

   @Field(offset = 205, length= 1)
    public String getDac7() {
        return dac7;
    }

    public void setDac7(String dac7) {
        this.dac7 = dac7;
    }

    @Field(offset = 206, length= 13)
    public String getValor7() {
        return valor7;
    }

    public void setValor7(String valor7) {
        this.valor7 = valor7;
    }

    @Field(offset = 219, length= 4)
    public String getAgencia8() {
        return agencia8;
    }

    public void setAgencia8(String agencia8) {
        this.agencia8 = agencia8;
    }

    @Field(offset = 223, length= 7)
    public String getConta8() {
        return conta8;
    }

    public void setConta8(String conta8) {
        this.conta8 = conta8;
    }

    @Field(offset = 230, length= 1)
    public String getDac8() {
        return dac8;
    }

    public void setDac8(String dac8) {
        this.dac8 = dac8;
    }

   @Field(offset = 231, length= 13)
    public String getValor8() {
        return valor8;
    }

    public void setValor8(String valor8) {
        this.valor8 = valor8;
    }

    @Field(offset = 244, length= 4)
    public String getAgencia9() {
        return agencia9;
    }

    public void setAgencia9(String agencia9) {
        this.agencia9 = agencia9;
    }

    @Field(offset = 248, length= 7)
    public String getConta9() {
        return conta9;
    }

    public void setConta9(String conta9) {
        this.conta9 = conta9;
    }

    @Field(offset = 255, length= 1)
    public String getDac9() {
        return dac9;
    }

    public void setDac9(String dac9) {
        this.dac9 = dac9;
    }

    @Field(offset = 256, length= 13)
    public String getValor9() {
        return valor9;
    }

    public void setValor9(String valor9) {
        this.valor9 = valor9;
    }

    @Field(offset = 269, length= 4)
    public String getAgencia10() {
        return agencia10;
    }

    public void setAgencia10(String agencia10) {
        this.agencia10 = agencia10;
    }

    @Field(offset = 273, length= 7)
    public String getConta10() {
        return conta10;
    }

    public void setConta10(String conta10) {
        this.conta10 = conta10;
    }

    @Field(offset = 280, length= 1)
    public String getDac10() {
        return dac10;
    }

    public void setDac10(String dac10) {
        this.dac10 = dac10;
    }

    @Field(offset = 281, length= 13)
    public String getValor10() {
        return valor10;
    }

    public void setValor10(String valor10) {
        this.valor10 = valor10;
    }

    @Field(offset = 294, length= 4)
    public String getAgencia11() {
        return agencia11;
    }

    public void setAgencia11(String agencia11) {
        this.agencia11 = agencia11;
    }
    
    @Field(offset = 298, length= 7)
    public String getConta11() {
        return conta11;
    }

    public void setConta11(String conta11) {
        this.conta11 = conta11;
    }

   @Field(offset = 305, length= 1)
    public String getDac11() {
        return dac11;
    }

    public void setDac11(String dac11) {
        this.dac11 = dac11;
    }   
    
    @Field(offset = 306, length= 13)
    public String getValor11() {
        return valor11;
    }

    public void setValor11(String valor11) {
        this.valor11 = valor11;
    }

    @Field(offset = 319, length= 4)
    public String getAgencia12() {
        return agencia12;
    }

    public void setAgencia12(String agencia12) {
        this.agencia12 = agencia12;
    }

    @Field(offset = 323, length= 7)
    public String getConta12() {
        return conta12;
    }

    public void setConta12(String conta12) {
        this.conta12 = conta12;
    }

    @Field(offset = 330, length= 1)
    public String getDac12() {
        return dac12;
    }

    public void setDac12(String dac12) {
        this.dac12 = dac12;
    }

    @Field(offset = 331, length= 13)
    public String getValor12() {
        return valor12;
    }

    public void setValor12(String valor12) {
        this.valor12 = valor12;
    }

    @Field(offset = 344, length= 4)
    public String getAgencia13() {
        return agencia13;
    }

    public void setAgencia13(String agencia13) {
        this.agencia13 = agencia13;
    }

    @Field(offset = 348, length= 7)
    public String getConta13() {
        return conta13;
    }

    public void setConta13(String conta13) {
        this.conta13 = conta13;
    }

    @Field(offset = 355, length= 1)
    public String getDac13() {
        return dac13;
    }

    public void setDac13(String dac13) {
        this.dac13 = dac13;
    }

    @Field(offset = 356, length= 13)
    public String getValor13() {
        return valor13;
    }

    public void setValor13(String valor13) {
        this.valor13 = valor13;
    }

    @Field(offset = 369, length= 4)
    public String getAgencia14() {
        return agencia14;
    }

    public void setAgencia14(String agencia14) {
        this.agencia14 = agencia14;
    }

    @Field(offset = 373, length= 7)
    public String getConta14() {
        return conta14;
    }

    public void setConta14(String conta14) {
        this.conta14 = conta14;
    }

    @Field(offset = 380, length= 1)
    public String getDac14() {
        return dac14;
    }

    public void setDac14(String dac14) {
        this.dac14 = dac14;
    }

    @Field(offset = 381, length= 13)
    public String getValor14() {
        return valor14;
    }

    public void setValor14(String valor14) {
        this.valor14 = valor14;
    }

    @Field (offset = 394 , length= 1)
    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    @Field (offset = 395 , length= 6)
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(String numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroDetalheRateio{" + "tipoRegistro=" + tipoRegistro + ", codigoInscricao=" + codigoInscricao + ", numeroInscricao=" + numeroInscricao + ", agencia=" + agencia + ", zeros=" + zeros + ", conta=" + conta + ", dac=" + dac + ", numCarteira=" + numCarteira + ", nossoNumero=" + nossoNumero + ", dacNossoNumero=" + dacNossoNumero + ", sequencia=" + sequencia + ", agencia1=" + agencia1 + ", conta1=" + conta1 + ", dac1=" + dac1 + ", valor1=" + valor1 + ", agencia2=" + agencia2 + ", conta2=" + conta2 + ", dac2=" + dac2 + ", valor2=" + valor2 + ", agencia3=" + agencia3 + ", conta3=" + conta3 + ", dac3=" + dac3 + ", valor3=" + valor3 + ", agencia4=" + agencia4 + ", conta4=" + conta4 + ", dac4=" + dac4 + ", valor4=" + valor4 + ", agencia5=" + agencia5 + ", conta5=" + conta5 + ", dac5=" + dac5 + ", valor5=" + valor5 + ", agencia6=" + agencia6 + ", conta6=" + conta6 + ", dac6=" + dac6 + ", valor6=" + valor6 + ", agencia7=" + agencia7 + ", conta7=" + conta7 + ", dac7=" + dac7 + ", valor7=" + valor7 + ", agencia8=" + agencia8 + ", conta8=" + conta8 + ", dac8=" + dac8 + ", valor8=" + valor8 + ", agencia9=" + agencia9 + ", conta9=" + conta9 + ", dac9=" + dac9 + ", valor9=" + valor9 + ", agencia10=" + agencia10 + ", conta10=" + conta10 + ", dac10=" + dac10 + ", valor10=" + valor10 + ", agencia11=" + agencia11 + ", conta11=" + conta11 + ", dac11=" + dac11 + ", valor11=" + valor11 + ", agencia12=" + agencia12 + ", conta12=" + conta12 + ", dac12=" + dac12 + ", valor12=" + valor12 + ", agencia13=" + agencia13 + ", conta13=" + conta13 + ", dac13=" + dac13 + ", valor13=" + valor13 + ", agencia14=" + agencia14 + ", conta14=" + conta14 + ", dac14=" + dac14 + ", valor14=" + valor14 + ", tipoValor=" + tipoValor + ", numeroSequencial=" + numeroSequencial + '}';
    }
  
    
}
