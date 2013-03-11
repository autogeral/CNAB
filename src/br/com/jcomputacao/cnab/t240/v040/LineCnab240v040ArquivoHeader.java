package br.com.jcomputacao.cnab.t240.v040;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2012 01:15:58
 * @author Murilo
 */
public class LineCnab240v040ArquivoHeader extends LineArchetype{

    /**
     * 01
     * CODIGO DO BANCO - DEFAULT 353 / 008 / 033
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * 02 e 03
     * TIPOS DE REGISTRO
     * POSICAO 004 008 - DEFAULT ZEROS
     */
    public static final String LOTE_TIPO_REGISTRO = "LOTE_TIPO_REGISTRO";
    /**
     * 04
     * BRANCOS - EXCLUSIVO FEBRABAN
     * POSICAO 009 016 - BRANCOS
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * 05
     * TIPO INSCRICAO DA EMPRESA
     * POSICAO 017 017
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 06
     * NUMERO INSCRICAO DA EMPRESA
     * POSICAO 018 032
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * 07
     * AGÊNCIA DO CEDENTE
     * POSICAO 033 036
     */
    public static final String AGENCIA_CEDENTE = "AGENCIA_CEDENTE";
    /**
     * 08
     * DIGITO DA AGÊNCIA DO CEDENTE
     * POSIÇÃO 037 - 037
     */
    public static String DIGITO_AGENCIA_CEDENTE = "DIGITO_AGENCIA_CEDENTE";
    /**
     * 09
     * NUMERO DA CONTA CORRENTE
     * POSICAO 038 046
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";    
    /**
     * 10
     * DIGITO_VER_CONTA
     * POSICAO 047 047
     */
    public static final String DIGITO_VER_CONTA = "DIGITO_VER_CONTA";
    /**
     * 11
     * RESERVADO - USO BANCO
     * POSIÇÃO 048 052
     */
    public static final String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";
    /**
     * 12
     * CÓDIGO DO CEDENTE
     * POSIÇÃO 053 061
     */
    public static final String CODIGO_CEDENTE = "CODIGO_CEDENTE";
    /**
     * 13
     * RESERVADO USO BANCO
     * 062 - 072
     */
    public static final String RESERVADO_USO_BANCO3 = "RESERVADO_USO_BANCO3";
    /**
     * 14
     * NOME DA EMPRESA
     * POSICAO 073 102
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * 15
     * NOME DO BANCO
     * POSICAO 103 132
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * 16
     * RESERVADO
     * POSICAO 133 142 - BRANCOS
     */
    public static final String RESERVADO = "RESERVADO";
    /**
     * 17
     * CODIGO DE REMESSA OU RETORNO
     * POSICAO 143 143
     * 1 - Remessa
     * 2 - Retorno
     */
    public static final String CODIGO_REM_RET = "CODIGO_REM_RET";
    /**
     * 18
     * DATA DE GERACAO DO ARQUIVO
     * POSICAO 144 151
     */
    public static final String DATA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    /**
     * 19
     * RESERVADO USO BANCO
     * POSIÇÃO 152 157
     */
    public static final String RESERVADO_USO_BANCO4 = "RESERVADO_USO_BANCO4";
    /**
     * 20
     * NUMERO SEQUENCIAL DO ARQUIVO
     * POSICAO 158 163
     */
    public static final String NUM_SEQUENCIAL_ARQUIVO = "NUM_SEQUENCIAL_ARQUIVO";
    /**
     * 21
     * NUMERO VERSAO DO LAYOUT - '040'
     * POSICAO 164 166
     */
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    /**
     * 22
     * RESERVADO 
     * POSICAO 167 240
     */
    public static final String RESERVADO_EMPRESA = "RESERVADO_EMPRESA";
    


    public LineCnab240v040ArquivoHeader() {
        setName("CNAB BB - Arquivo Header - v040");
        
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02 e 03
        //Obs: campos agrupados (Lote e Tipo de Registro)
        addFieldArchetype(LOTE_TIPO_REGISTRO, new FieldDefaultArchetype("00000"));
        //04
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(8, ' '));
        //05
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        //07
        addFieldArchetype(AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(4));
        //08
        addFieldArchetype(DIGITO_AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(1));
        //09
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(9));
        //10
        addFieldArchetype(DIGITO_VER_CONTA, new FieldIntegerFixedLengthArchetype(1));
        //11
        addFieldArchetype(RESERVADO_USO_BANCO2, new FieldFillerArchetype(5, ' '));
        //12
        addFieldArchetype(CODIGO_CEDENTE, new FieldIntegerFixedLengthArchetype(9));
        //13
        addFieldArchetype(RESERVADO_USO_BANCO3, new FieldFillerArchetype(11, ' '));
        //14
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //15
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(30));
        //16
        addFieldArchetype(RESERVADO, new FieldFillerArchetype(10, ' '));
        //17
        addFieldArchetype(CODIGO_REM_RET, new FieldIntegerFixedLengthArchetype(1));
        //18
        addFieldArchetype(DATA_GERACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //19
        addFieldArchetype(RESERVADO_USO_BANCO4, new FieldFillerArchetype (6, ' '));
        //20
        addFieldArchetype(NUM_SEQUENCIAL_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //21
        addFieldArchetype(VERSAO_LAYOUT, new FieldStringFixedLengthArchetype(3));
        //22
        addFieldArchetype(RESERVADO_EMPRESA, new FieldFillerArchetype(74, ' '));
        

    }

}
