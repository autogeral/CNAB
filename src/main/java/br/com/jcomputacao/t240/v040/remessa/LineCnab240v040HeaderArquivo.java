package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040HeaderArquivo extends LineArchetype{

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
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    /**
     * 03 <br>
     * TIPO DE REGISTRO <br>
     * DEFAULT 0 <br>
     * POSICAO 008 008 <br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 04 <br>
     * RESERVADO (USO BANCO) <br> 
     * DEFAULT - BRANCOS <br>
     * POSICAO 009 016 <br>
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * 05 <br>
     * TIPO INSCRICAO DA EMPRESA <br>
     * POSICAO 017 017 <br>
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 06 <br>
     * NUMERO INSCRICAO DA EMPRESA <br>
     * POSICAO 018 032 <br>
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * 07 <br>
     * CÓDIGO DE TRASMISSÃO <br>
     * POSICAO 033 047 <br>
     */
    public static final String CODIGO_TRASMISSAO = "CODIGO_TRASMISSAO";
    /**
     * 08 <br>
     * RESERVADO (USO BANCO) <br>
     * POSICAO 048 072
     */
    public static final String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";
    /**
     * 09 <br>
     * NOME DA EMPRESA <br>
     * POSICAO 073 102 <br>
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * 10 <br>
     * NOME DO BANCO <br>
     * POSICAO 103 132 <br>
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * 11 <br>
     * RESERVADO (USO BANCO) <br>
     * POSICAO 133 142 <br>
     */
    public static final String RESERVADO_USO_BANCO3 = "RESERVADO_USO_BANCO3";
    /**
     * 12 <br> 
     * CODIGO DE REMESSA OU RETORNO <br>
     * POSICAO 143 143
     * 1 - Remessa <br>
     * 2 - Retorno <br>
     */
    public static final String CODIGO_REM_RET = "CODIGO_REM_RET";
    /**
     * 13 <br>
     * DATA DE GERACAO DO ARQUIVO <br>
     * POSICAO 144 151 <br>
     */
    public static final String DATA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    /**
     * 14 <br> 
     * RESERVADO USO BANCO <br>
     * POSIÇÃO 152 157 <br>
     */
    public static final String RESERVADO_USO_BANCO4 = "RESERVADO_USO_BANCO4";
    /**
     * 15 <br>
     * NUMERO SEQUENCIAL DO ARQUIVO <br>
     * POSICAO 158 163 <br>
     */
    public static final String NUM_SEQUENCIAL_ARQUIVO = "NUM_SEQUENCIAL_ARQUIVO";
    /**
     * 16 <br>
     * NUMERO VERSAO DO LAYOUT <br>
     * DEFAULT 040' <br>
     * POSICAO 164 166 <br>
     */
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    /**
     * 17 <br>
     * RESERVADO (USO BANCO)  <br>
     * POSICAO 167 240 <br>
     */
    public static final String RESERVADO_USO_BANCO5 = "RESERVADO_USO_BANCO5";

    public LineCnab240v040HeaderArquivo() {
        setName("CNAB - Arquivo Header - v040 - Remessa");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldDefaultArchetype("0000"));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("0"));
        //04
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(8, ' '));
        //05
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        //07
        addFieldArchetype(CODIGO_TRASMISSAO, new FieldIntegerFixedLengthArchetype(15));
        //08
        addFieldArchetype(RESERVADO_USO_BANCO2, new FieldFillerArchetype(25, ' '));
        //09
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //10
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(30));
        //11
        addFieldArchetype(RESERVADO_USO_BANCO3, new FieldFillerArchetype(10, ' '));
        //12
        addFieldArchetype(CODIGO_REM_RET, new FieldIntegerFixedLengthArchetype(1));
        //13
        addFieldArchetype(DATA_GERACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //19
        addFieldArchetype(RESERVADO_USO_BANCO4, new FieldFillerArchetype (6, ' '));
        //20
        addFieldArchetype(NUM_SEQUENCIAL_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //21
        addFieldArchetype(VERSAO_LAYOUT, new FieldStringFixedLengthArchetype(3));
        //22
        addFieldArchetype(RESERVADO_USO_BANCO5, new FieldFillerArchetype(74, ' '));
    }
    
}
