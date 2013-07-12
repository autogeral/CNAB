package br.com.jcomputacao.cnab.t240.v05.extrato;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v05HeaderArquivoExtrato extends LineArchetype {
    /**
     * 01
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * 02
     * CÓDIGO DO LOTE
     * POSICAO 004 007 
     * DEFAULT '0000'
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * 03
     * TIPO DE REGISTRO
     * POSICAO 008 008 
     * DEFAULT '0'
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 04
     * BRANCOS
     * POSICAO 009 017 
     * DEFAULT BRANCOS
     */
    public static final String BRANCOS = "BRANCOS";
    /**
     * 05
     * TIPO INSCRICAO DA EMPRESA
     * POSICAO 018 018
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 06
     * NUMERO INSCRICAO DA EMPRESA
     * POSICAO 019 032
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * 07
     * BRANCOS - COMPLEMENTO DE REGISTRO
     * POSICAO 033 047
     * DEFAULT BRANCOS
     */
    public static final String BRANCOS1 = "BRANCOS1";
    /**
     * 08
     * CONVÊNIO - CÓDIGO DA EMPRESA NO BANCO
     * POSICAO 045 052
     */
    public static final String CONVENIO = "CONVENIO";
    /**
     * 09
     * ZEROS - COMPLEMENTO DE REGISTRO
     * POSICAO 053 053
     * DEFAULT '0'
     */
    public static final String ZEROS = "ZEROS";
    /**
     * 10
     * AGENCIA MANTENEDORA DA AGENCIA
     * POSICAO 054 057
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * 11
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 058 058
     */
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    /**
     * 12
     * ZEROS - COMPLEMENTO DE REGISTRO
     * POSICAO 059 065
     * DEFAULT '0000000'
     */
    public static final String ZEROS2 = "ZEROS2";
    /**
     * 13
     * NUMERO DA CONTA CORRENTE
     * POSICAO 066 070
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    /**
     * 14
     * BRANCOS - COMPLEMENTO DE REGISTRO
     * POSICAO 071 071
     */
    public static final String BRANCOS2 = "BRANCOS2";
    /**
     * 15
     * DIGITO VERIFICADOR AG/CONTA
     * POSICAO 072 072
     */
    public static final String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";
    /**
     * 16
     * NOME DA EMPRESA
     * POSICAO 073 102
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * 17
     * NOME DO BANCO
     * POSICAO 103 132
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * 18
     * BRANCOS - COMPLEMENTO DE REGISTRO
     * POSICAO 133 142 - BRANCOS
     */
    public static final String BRANCOS3 = "BRANCOS3";
    /**
     * 19
     * CODIGO DE REMESSA OU RETORNO
     * POSICAO 143 143
     * 1 - Remessa
     * 2 - Retorno
     */
    public static final String CODIGO_RETORNO = "CODIGO_RETORNO";
    /**
     * 20
     * DATA DE GERACAO DO ARQUIVO
     * POSICAO 144 151
     */
    public static final String DATA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    /**
     * 21
     * HORA DE GERACAO DO ARQUIVO
     * POSICAO 152 157
     */
    public static final String HORA_GERACAO_ARQUIVO = "HORA_GERACAO_ARQUIVO";
    /**
     * 22
     * NUMERO SEQUENCIAL DO ARQUIVO
     * POSICAO 158 163
     */
    public static final String NUM_SEQUENCIAL_ARQUIVO = "NUM_SEQUENCIAL_ARQUIVO";
    /**
     * 23
     * NUMERO VERSAO DO LAYOUT - '084'
     * POSICAO 164 166
     */
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    /**
     * 24
     * DENSIDADE DE GRAVACAO DO ARQUIVO
     * POSICAO 167 171
     */
    public static final String ZEROS1 = "ZEROS1";
    /**
     * 25
     * RESERVADO BANCO
     * POSICAO 172 191
     */
    public static final String RESERVADO_BANCO = "RESERVADO_BANCO";
    /**
     * 26
     * RESERVADO EMPRESA
     * POSICAO 192 240
     */
    public static final String BRANCOS4 = "BRANCOS4";
        
    public LineCnab240v05HeaderArquivoExtrato (){
        setName ("CNAB 240 v5.0 - Header do Arquivo");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldDefaultArchetype("0000"));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("0"));
        //04
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(9, ' '));
        //05
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
        addFieldArchetype(NUMERO_INSCRICAO, new FieldStringFixedLengthArchetype(14));
        //07
        addFieldArchetype(BRANCOS1, new FieldFillerArchetype(15, ' '));
        //08
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(5));
        //09
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("0"));
        //10
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(4));
        //11
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(1);
        fa.setNullableRepresentation(" ");
        addFieldArchetype(DIGITO_VER_AGENCIA, fa);
        //12
        addFieldArchetype(ZEROS2, new FieldDefaultArchetype("0000000"));
        //13
        addFieldArchetype(NUMERO_CONTA_COR, new FieldStringFixedLengthArchetype(5));
        //14
        addFieldArchetype(BRANCOS2, new FieldDefaultArchetype(" "));
        //15
        FieldStringFixedLengthArchetype fw = new FieldStringFixedLengthArchetype(1);
        fw.setAcceptNullable(true);
        fw.setNullableRepresentation(" ");
        addFieldArchetype(DIGITO_VER_AG_CONTA, fw);
        //16
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //17
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(30));
        //18
        addFieldArchetype(BRANCOS3, new FieldFillerArchetype(10, ' '));
        //19
        addFieldArchetype(CODIGO_RETORNO, new FieldIntegerFixedLengthArchetype(1));
        //20
        addFieldArchetype(DATA_GERACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //21
        FieldDateFixedLengthArchetype fd = new FieldDateFixedLengthArchetype("HHmmss");
        fd.setAcceptNullable(true);
        addFieldArchetype(HORA_GERACAO_ARQUIVO, fd);
        //22
        addFieldArchetype(NUM_SEQUENCIAL_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //23
        addFieldArchetype(VERSAO_LAYOUT, new FieldStringFixedLengthArchetype(3));
        //24
        addFieldArchetype(ZEROS1, new FieldDefaultArchetype("00000"));
        //25
        addFieldArchetype(RESERVADO_BANCO, new FieldFillerArchetype(20, ' '));
        //26
        addFieldArchetype(BRANCOS4, new FieldFillerArchetype(49, ' '));
    }
}
