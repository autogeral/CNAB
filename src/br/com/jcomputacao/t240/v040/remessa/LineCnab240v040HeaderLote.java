package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040HeaderLote extends LineArchetype{
    
    /**
     * 01 <br>
     * CODIGO DO BANCO <br>
     * DEFAULT 353 / 008 / 033 <br>
     * POSICAO 001 003 <br>
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * 02 <br>
     * LOTE DE SERVICO <br>
     * DEFAULT 0000 <br>
     * POSICAO 004 007 <br>
     */
    public static final String NUMERO_LOTE = "NUMERO_LOTE";
    /**
     * 03 <br>
     * TIPO DE REGISTRO <br>
     * DEFAULT 0 <br>
     * POSICAO 008 008 <br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
     /**
      * 04
     * TIPO DA OPERACAO<br>
     * DEFAULT R
     * POSIÇÃO: 9 a 9<br>
     * FORMATO: ALFA<br>
     */
    public static final String TIPO_OPERACAO = "TIPO_OPERACAO";
    /**
     * 05
     * TIPO DO SERVICO<br>
     * POSIÇÃO: 10 a 11<br>
     * FORMATO: NUM<br>
     * DEFAULT: '01'<br>
     * '01' = Cobrança<br>
     */
    public static final String TIPO_SERVICO = "TIPO_SERVICO";
    /**
     * 06 <br>
     * RESERVADO (USO BANCO) <br> 
     * DEFAULT - BRANCOS <br>
     * POSICAO 012 013 <br>
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * 07 <br>
     * NUMERO VERSAO DO LAYOUT <br>
     * DEFAULT 030 <br>
     * POSICAO 014 016 <br>
     */
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    /**
     * 08 <br>
     * RESERVADO (USO BANCO)  <br>
     * POSICAO 17 17 <br>
     */
    public static final String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";
    /**
     * 09 <br>
     * TIPO INSCRICAO DA EMPRESA <br>
     * POSICAO 018 018 <br>
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 10 <br>
     * NUMERO INSCRICAO DA EMPRESA <br>
     * POSICAO 019 033 <br>
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * 11 <br>
     * RESERVADO (USO BANCO) <br>
     * POSICAO 034 053 <br>
     */
    public static final String RESERVADO_USO_BANCO3 = "RESERVADO_USO_BANCO3";
    /**
     * 12 <br>
     * CÓDIGO DE TRASMISSÃO <br>
     * POSICAO 054 068 <br>
     */
    public static final String CODIGO_TRASMISSAO = "CODIGO_TRASMISSAO";
    /**
     * 13 <br> 
     * RESERVADO USO BANCO <br>
     * POSIÇÃO 069 073 <br>
     */
    public static final String RESERVADO_USO_BANCO4 = "RESERVADO_USO_BANCO4";
    /**
     * 14 <br>
     * NOME DO CEDENTE <br>
     * POSIÇÃO 074 103 <br>
     */
    public static final String NOME_CEDENTE = "NOME_CEDENTE";
    /**
     * 15 <br>
     * MENSAGEM 1 <br>
     * POSIÇÃO 104 143 <br>
     */
    public static final String MENSAGEM_1 = "MENSAGEM_1";
    /**
     * 16 <br>
     * MENSAGEM 2 <br>
     * POSIÇÃO 144 183 <br>
     */
    public static final String MENSAGEM_2 = "MENSAGEM_2";
    /**
     * 17 <br>
     * NÚMERO REMESSA / RETORNO <br>
     * POSICAO 184 191
     */
    public static final String NUMERO_REMESSA_RETORNO = "NUMERO_REMESSA_RETORNO";
    /**
     * 18 <br>
     * DATA GRAVAÇÃO DO RETORNO <br>
     * POSICAO 192 199 <br>
     */
    public static final String DATA_GRAVACAO_REMESSA_RETORNO = "DATA_GRAVACAO_REMESSA_RETORNO";
    /**
     * 19 <br>
     * RESERVADO (USO BANCO) <br>
     * POSICAO 200 240 <br>
     */
    public static final String RESERVADO_USO_BANCO5 = "RESERVADO_USO_BANCO5";
    public LineCnab240v040HeaderLote (){
        setName("CNAB - Lote Header - v040 - Remessa");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
        addFieldArchetype(NUMERO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("1"));
        //04
        addFieldArchetype(TIPO_OPERACAO, new FieldStringFixedLengthArchetype(1));
        //05
        addFieldArchetype(TIPO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        //06
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(2, ' '));
        //07
        addFieldArchetype(VERSAO_LAYOUT, new FieldIntegerFixedLengthArchetype(3));
        //08
        addFieldArchetype(RESERVADO_USO_BANCO2, new FieldFillerArchetype(1, ' '));
        //09
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(NUMERO_INSCRICAO, new FieldStringFixedLengthArchetype(15));
        //11
        addFieldArchetype(RESERVADO_USO_BANCO3, new FieldFillerArchetype(20, ' '));
        //12
        addFieldArchetype(CODIGO_TRASMISSAO, new FieldStringFixedLengthArchetype(15));
        //13
        addFieldArchetype(RESERVADO_USO_BANCO4, new FieldFillerArchetype(5, ' '));
        //14
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(30));
        //15
        addFieldArchetype(MENSAGEM_1, new FieldStringFixedLengthArchetype(40));
        //16
        addFieldArchetype(MENSAGEM_2, new FieldStringFixedLengthArchetype(40));
        //17
        addFieldArchetype(NUMERO_REMESSA_RETORNO, new FieldIntegerFixedLengthArchetype(8));
        //18
        addFieldArchetype(DATA_GRAVACAO_REMESSA_RETORNO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //19
        addFieldArchetype(RESERVADO_USO_BANCO5, new FieldFillerArchetype(41, ' '));
    }
}
