package br.com.jcomputacao.cnab.t240.v05.extrato;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v05TrailerLoteExtrato extends LineArchetype{
    /**
     * 01
     * CODIGO DO BANCO NA COMPENSAÇÃO<br> 
     * POSIÇÃO: 1 a 3<br> 
     * FORMATO: NUM<br>
     * DEFAULT: '341'
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * 02
     * LOTE DE SERVICO<br> 
     * POSIÇÃO: 4 a 7<br> 
     * FORMATO: NUM
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    /**
     * 03
     * TIPO DE REGISTRO<br> 
     * POSIÇÃO: 8 a 8<br> 
     * FORMATO: NUM<br> 
     * DEFAULT: '5'
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 04
     * USO EXCLUSIVO DA FEBRABAN<br> 
     * POSIÇÃO: 9 a 17<br> 
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
    public static final String BRANCOS = "BRANCOS";
    /**
     * 05
     * TIPO DE INSCRIÇÃO 
     * POSIÇÃO: 18 a 18<br> 
     * FORMATO: NUM<br>
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 06
     * NUMERO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 19 a 32<br>
     * FORMATO: NUM
     */
    public static final String NUM_INSCRICAO_EMPRESA = "NUM_INSCRICAO_EMPRESA";
    /**
     * 07
     * BRANCOS - COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 33  A 47<br>
     * FORMATO: ALFA
     */
    public static final String BRANCOS2 = "BRANCOS2";
    /**
     * 08
     * CODIGO DO CONVENIO NO BANCO<br>
     * POSIÇÃO: 48 a 52<br>
     * FORMATO: ALFA
     */
    public static final String CONVENIO = "CONVENIO";
    /**
     * 09
     * ZEROS - COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 53 A 53<br>
     * FORMATO: NUM
     * DEFAULT '0'
     */
    public static final String ZEROS = "ZEROS";
    /**
     * 10
     * AGENCIA MANTENEDORA DA CONTA<br>
     * POSIÇÃO: 54 a 57<br>
     * FORMATO: NUM
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * 11
     * DIGITO VERIFICADOR DA AGENCIA<br>
     * POSIÇÃO: 58 a 58<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    /**
     * 12
     * ZEROS
     * POSIÇÃO: 59 A 65<br>
     * FORMATO: NUM<br>
     * DEFAULT '0000000'
     */
    public static final String ZEROS2 = "ZEROS2";
    /**
     * 13
     * NUMERO DA CONTA CORRENTE<br>
     * POSIÇÃO: 66 a 70<br>
     * FORMATO: NUM
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    /**
     * 14
     * BRANCOS
     * POSICÃO: 71 A 71<br>
     * FORMATO: ALFA<br>
     * DEFAULT BRANCOS
     */
    public static final String BRANCOS3 = "BRANCOS3";
    /**
     * 15
     * DIGITO VERIFICADOR AG/CONTA<br>
     * POSIÇÃO: 72 a 72<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";
    /**
     * 16
     * BRANCOS<br>
     * POSIÇÃO: 73 a 88<br>
     * FORMATO: ALFA
     */
    public static final String BRANCOS4 = "BRANCOS4";
    /**
     * 17
     * SALDO BLOQUEADO ACIMA DE 24H<br>
     * POSIÇÃO: 89 a 106<br>
     * FORMATO: NUM
     */
    public static final String SALDO_BLOQUEADO_ACIMA_24 = "SALDO_BLOQUEADO_ACIMA_24";
    /**
     * 18
     * LIMITE<br>
     * POSIÇÃO: 107 a 124<br>
     * FORMATO: NUM
     */
    public static final String LIMITE_CONTA = "LIMITE_CONTA";
    /**
     * 19
     * SALDO BLOQUEADO ATÉ DE 24H<br>
     * POSIÇÃO: 125 a 142<br>
     * FORMATO: NUM
     */
    public static final String SALDO_BLOQUEADO_ATE_24 = "SALDO_BLOQUEADO_ATE_24";
    
    /**
     * 20
     * DATA FINAL<br>
     * POSIÇÃO: 143 a 150<br>
     * FORMATO: NUM
     */
    public static final String DATA_FINAL = "DATA_FINAL";
    
    /**
     * 21
     * SALDO FINAL<br>
     * POSIÇÃO: 151 a 168<br>
     * FORMATO: 9(16)V9(02)
     */
    public static final String SALDO_FINAL = "SALDO_FINAL";
    
    /**
     * 22
     * SITUAÇÃO DO SALDO FINAL<br>
     * POSIÇÃO: 169 a 169<br>
     * D - DEVEDOR
     * C - CREDOR
     */
    public static final String SITUACAO_SALDO_FINAL = "SITUACAO_SALDO_FINAL";
    
    /**
     * 23
     * STATUS DO SALDO FINAL<br>
     * POSIÇÃO: 170 a 170<br>
     * P - PARCIAL
     * F - FINAL
     */
    public static final String STATUS_SALDO_FINAL = "STATUS_SALDO_FINAL";
    
    /**
     * 24
     * QUANTIDADE DE REGISTROS NO LOTE 
     * POSIÇÃO: 171 A 176<br> 
     * FORMATO: NUM<br>
     */
    public static final String QTDE_REGISTROS_LOTE = "QTDE_REGISTROS_LOTE";
   
    /**
     * 25
     * TOTAL VALOR DÉBITOL<br>
     * POSIÇÃO: 177 a 194<br>
     * FORMATO: 9(16)V9(02)
     */
    public static final String TOTAL_VALOR_DEBITO = "TOTAL_VALOR_DEBITO";
    
    /**
     * 26
     * TOTAL VALOR CRÉDITO<br>
     * POSIÇÃO: 195 a 212<br>
     * FORMATO: 9(16)V9(02)
     */
    public static final String TOTAL_VALOR_CREDITO = "TOTAL_VALOR_CREDITO";
    
    /**
     * 27
     * TOTAL VALORES NÃO CONTÁBEIS<br>
     * POSIÇÃO: 213 a 230<br>
     * FORMATO: 9(16)V9(02)
     */
    public static final String TOTAL_VALORES_NAO_CONTABEIS = "TOTAL_VALORES_NAO_CONTABEIS";
    
    /**
     * 28
     * BRANCOS<br>
     * POSIÇÃO: 231 a 240<br>
     * DEFAULT BRANCOS
     */
    public static final String BRANCOS5 = "BRANCOS5";
    
    public LineCnab240v05TrailerLoteExtrato() {
        setName("CNAB 240 v5.0 - Trailer do lote");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("5"));
        //04
        addFieldArchetype(BRANCOS, new FieldStringFixedLengthArchetype(9));
        //05
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
        addFieldArchetype(NUM_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(14));
        //07
        addFieldArchetype(BRANCOS2, new FieldStringFixedLengthArchetype(15));
        //08
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(5));
        //09
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("0"));
        //10
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(4));
        //11
        addFieldArchetype(DIGITO_VER_AGENCIA,  new FieldStringFixedLengthArchetype(1));
        //12
        addFieldArchetype(ZEROS2, new FieldDefaultArchetype("0000000"));
        //13
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(5));
        //14
        addFieldArchetype(BRANCOS3, new FieldDefaultArchetype(" "));
        //15
        addFieldArchetype(DIGITO_VER_AG_CONTA, new FieldIntegerFixedLengthArchetype(1));
        //16
        addFieldArchetype(BRANCOS4, new FieldStringFixedLengthArchetype(16));
        //17
        addFieldArchetype(SALDO_BLOQUEADO_ACIMA_24, new FieldDecimalFixedLengthArchetype(18, 2));
        //18
        addFieldArchetype(LIMITE_CONTA, new FieldDecimalFixedLengthArchetype(18, 2));
        //19
        addFieldArchetype(SALDO_BLOQUEADO_ATE_24, new FieldDecimalFixedLengthArchetype(18, 2));
        //20
        addFieldArchetype(DATA_FINAL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //21
        addFieldArchetype(SALDO_FINAL, new FieldDecimalFixedLengthArchetype(18, 2));
        //22
        addFieldArchetype(SITUACAO_SALDO_FINAL, new FieldStringFixedLengthArchetype(1));
        //23
        addFieldArchetype(STATUS_SALDO_FINAL, new FieldStringFixedLengthArchetype(1));
        //24        
        addFieldArchetype(QTDE_REGISTROS_LOTE, new FieldIntegerFixedLengthArchetype(6));
        //25
        addFieldArchetype(TOTAL_VALOR_DEBITO, new FieldDecimalFixedLengthArchetype(18, 2));
        //26
        addFieldArchetype(TOTAL_VALOR_CREDITO, new FieldDecimalFixedLengthArchetype(18, 2));
        //27
        addFieldArchetype(TOTAL_VALORES_NAO_CONTABEIS, new FieldDecimalFixedLengthArchetype(18, 2));        
        //28
        addFieldArchetype(BRANCOS5, new FieldStringFixedLengthArchetype(10));
    }
}
