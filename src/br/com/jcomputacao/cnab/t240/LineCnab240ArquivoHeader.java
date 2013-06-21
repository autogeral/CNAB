package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldVolatileArchetye;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240ArquivoHeader extends LineArchetype {

    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * TIPOS DE REGISTRO
     * POSICAO 004 008 - DEFAULT ZEROS
     */
    public static final String LOTE_TIPO_REGISTRO = "LOTE_TIPO_REGISTRO";
    /**
     * BRANCOS - EXCLUSIVO FEBRABAN
     * POSICAO 009 017 - BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * TIPO INSCRICAO DA EMPRESA
     * POSICAO 018 018
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * NUMERO INSCRICAO DA EMPRESA
     * POSICAO 019 032
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * CODIGO DO CONVENIO NO BANCO
     * POSICAO 033 052
     */
    public static final String CODIGO_CONVENIO = "CODIGO_CONVENIO";
    /**
     * AGENCIA MANTENEDORA DA AGENCIA
     * POSICAO 053 057
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 058 058
     */
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    /**
     * NUMERO DA CONTA CORRENTE
     * POSICAO 059 070
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    /**
     * DIGITO VERIFICADOR CONTA CORRENTE
     * POSICAO 071 071
     */
    public static final String DIGITO_VER_CONTA = "DIGITO_VER_CONTA";
    /**
     * DIGITO VERIFICADOR AG/CONTA
     * POSICAO 072 072
     */
    public static final String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";
    /**
     * NOME DA EMPRESA
     * POSICAO 073 102
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * NOME DO BANCO
     * POSICAO 103 132
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * BRANCOS - EXCLUSIVO FEBRABAN - 2
     * POSICAO 133 142 - BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";
    /**
     * CODIGO DE REMESSA OU RETORNO
     * POSICAO 143 143
     * 1 - Remessa
     * 2 - Retorno
     */
    public static final String CODIGO_REM_RET = "CODIGO_REM_RET";
    /**
     * DATA DE GERACAO DO ARQUIVO
     * POSICAO 144 151
     */
    public static final String DATA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    /**
     * HORA DE GERACAO DO ARQUIVO
     * POSICAO 152 157
     */
    public static final String HORA_GERACAO_ARQUIVO = "HORA_GERACAO_ARQUIVO";
    /**
     * NUMERO SEQUENCIAL DO ARQUIVO
     * POSICAO 158 163
     */
    public static final String NUM_SEQUENCIAL_ARQUIVO = "NUM_SEQUENCIAL_ARQUIVO";
    /**
     * NUMERO VERSAO DO LAYOUT - '084'
     * POSICAO 164 166
     */
    public static final String VERSAO_LAYOUT = "VERSAO_LAYOUT";
    /**
     * DENSIDADE DE GRAVACAO DO ARQUIVO
     * POSICAO 167 171
     */
    public static final String DENSIDADE_GRAVACAO = "DENSIDADE_GRAVACAO";
    /**
     * RESERVADO BANCO
     * POSICAO 172 191
     */
    public static final String RESERVADO_BANCO = "RESERVADO_BANCO";
    /**
     * RESERVADO EMPRESA
     * POSICAO 192 211
     */
    public static final String RESERVADO_EMPRESA = "RESERVADO_EMPRESA";
    /**
     * EXCLUSIVO FEBRABAN 3 - 29 BRANCOS
     * POSICAO 103 132
     */
    public static final String EXCLUSIVO_FEBRABAN_3 = "EXCLUSIVO_FEBRABAN_3";


    public LineCnab240ArquivoHeader() {
        setName("CNAB BB - Arquivo Header");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02 e 03
        //Obs: campos agrupados (Lote e Tipo de Registro)
        addFieldArchetype(LOTE_TIPO_REGISTRO, new FieldDefaultArchetype("00000"));
        //04
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(9, ' '));
        //05
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(14));
        //07
        addFieldArchetype(CODIGO_CONVENIO, new FieldStringFixedLengthArchetype(20));
        //08
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        //09
        FieldStringFixedLengthArchetype fa = new FieldStringFixedLengthArchetype(1);
        fa.setNullableRepresentation(" ");
        addFieldArchetype(DIGITO_VER_AGENCIA, fa);
        //10
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));
        fa = new FieldStringFixedLengthArchetype(1);
        fa.setNullableRepresentation(" ");
        //11
        addFieldArchetype(DIGITO_VER_CONTA, fa);
        fa = new FieldStringFixedLengthArchetype(1);
        fa.setNullableRepresentation(" ");
        //12
        addFieldArchetype(DIGITO_VER_AG_CONTA, fa);
        //13
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //14
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(30));
        //15
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(10, ' '));
        //16
        addFieldArchetype(CODIGO_REM_RET, new FieldIntegerFixedLengthArchetype(1));
        //17
        addFieldArchetype(DATA_GERACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //18
        FieldDateFixedLengthArchetype fd = new FieldDateFixedLengthArchetype("HHmmss");
        fd.setAcceptNullable(true);
        addFieldArchetype(HORA_GERACAO_ARQUIVO, fd);
        //19
        addFieldArchetype(NUM_SEQUENCIAL_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //20
        addFieldArchetype(VERSAO_LAYOUT, new FieldStringFixedLengthArchetype(3));
        FieldIntegerFixedLengthArchetype fc = new FieldIntegerFixedLengthArchetype(5);
        fc.setNullableRepresentation("00000");
        //21
        addFieldArchetype(DENSIDADE_GRAVACAO, fa);
        //22
        addFieldArchetype(RESERVADO_BANCO, new FieldFillerArchetype(20, ' '));
        //23
        addFieldArchetype(RESERVADO_EMPRESA, new FieldFillerArchetype(20, ' '));
        //24
        addFieldArchetype(EXCLUSIVO_FEBRABAN_3, new FieldFillerArchetype(29, ' '));

    }
}
