package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 07/04/2014 16:32:41
 * @author Cesário
 */

///3.1.2.1 - Registro Header de Arquivo
public class LineCnabCaixaEconomicaHeaderArquivo extends LineArchetype{

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
     * POSICAO 009 017 <br>
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * 05 <br>
     * TIPO INSCRICAO DA EMPRESA <br>
     * POSICAO 018 018 <br>
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * 06 <br>
     * NUMERO INSCRICAO DA EMPRESA <br>
     * POSICAO 019 032 <br>
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    
    /**
     * 07 <br>
     * Uso Exclusivo Caixa <br>
     * POSICAO 033 052 <br>
     */
    public static final String USO_EXCLUSIVO_CAIXA = "USO_EXCLUSIVO_CAIXA";

    /**
     * 08 <br>
     * Agencia mandenedora da conta- ag Codigo <br>
     * POSICAO 053 057 <br>
     */
    public static final String AGENCIA_MANTENEDORA_AG_DIG = "AGENCIA_MANTENEDORA_AG_DIG";
    
    /**
     * 09 <br>
     * Agencia mandenedora da conta-digito <br>
     * POSICAO 058 058 <br>
     */
    public static final String AGENCIA_MANTENEDORA_DIG = "AGENCIA_MANTENEDORA_DIG";
    
    /**
     * 010 <br>
     * Código do Convênio no Banco <br>
     * POSICAO 059 064 <br>
     */
    public static final String CODIGO_CONVENIO_BANCO = "CODIGO_CONVENIO_BANCO";

    /**
     * 011 <br>
     * Uso Exclusivo CAIXA <br>
     * POSICAO 065 071 <br>
     */
    public static final String USO_EXCLUSIVO_CAIXA2 = "USO_EXCLUSIVO_CAIXA2";
    
    /**
     * 012 <br>
     * Uso Exclusivo CAIXA <br>
     * POSICAO 072 072 <br>
     */
    public static final String USO_EXCLUSIVO_CAIXA3 = "USO_EXCLUSIVO_CAIXA3";
    
    /**
     * 013 <br>
     * Nome da Empresa <br>
     * POSICAO 073 0102 <br>
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    
    /**
     * 014 <br>
     * Nome do Banco <br>
     * POSICAO 0103 0132 <br>
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    
    /**
     * 015 <br>
     * Uso Exclusivo FEBRABAN / CNAB <br>
     * POSICAO 0133 0142 <br>
     */
    public static final String USO_FEBRABAN = "USO_FEBRABAN";
    
    /**
     * 016 <br>
     * Código Remessa / Retorno / CNAB <br>
     * POSICAO 0143 0143 <br>
     */
    public static final String CODIGO_REMESSA_RETORNO = "CODIGO_REMESSA_RETORNO";
    
    /**
     * 017 <br>
     * Data de Geração do Arquivo <br>
     * POSICAO 0145 0151 <br>
     */
    public static final String DATA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    
    /**
     * 018 <br>
     * Hora de Geração do Arquivo <br>
     * POSICAO 0152 0157 <br>
     */
    public static final String HORA_GERACAO_ARQUIVO = "HORA_GERACAO_ARQUIVO";
    
    /**
     * 019 <br>
     * Número Seqüencial do Arquivo <br>
     * POSICAO 0158 0163 <br>
     */
    public static final String NUMERO_SEQUENCIAL_ARQUIVO = "NUMERO_SEQUENCIAL_ARQUIVO";
    
    /**
     * 020 <br>
     * No da Versão do Layout do Arquivo <br>
     * POSICAO 0164 0166 <br>
     */
    public static final String NUMERO_VERSAO_ARQUIVO = "NUMERO_VERSAO_ARQUIVO";
    
    /**
     * 021 <br>
     * Densidade de Gravação do Arquivo <br>
     * POSICAO 0167 0171 <br>
     */
    public static final String DENSIDADE_GRAVACAO_ARQUIVO = "DENSIDADE_GRAVACAO_ARQUIVO";
    
    /**
     * 022 <br>
     * Para Uso Reservado do Banco <br>
     * POSICAO 0172 0191 <br>
     */
    public static final String USO_RESERVADO_BANCO = "USO_RESERVADO_BANCO";
    
    /**
     * 023 <br>
     * Para Uso Reservado da Empresa <br>
     * POSICAO 0192 0211 <br>
     */
    public static final String USO_RESERVADO_EMPRESA = "USO_RESERVADO_EMPRESA";
    
    /**
     * 024 <br>
     * Versão Aplicativo CAIXA <br>
     * POSICAO 0212 0215 <br>
     */
    public static final String VERSAO_APLICATIVO = "VERSAO_APLICATIVO";
    
    /**
     * 025 <br>
     * Uso Exclusivo FEBRABAN / CNAB <br>
     * POSICAO 0216 0240 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN3 = "USO_EXCLUSIVO_FEBRABAN3";
    
    public LineCnabCaixaEconomicaHeaderArquivo(){
        setName("CNAB - Arquivo Header - v240 - Remessa");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        //04
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(9, ' '));
        //05        
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
        addFieldArchetype(NUMERO_INSCRICAO, new FieldStringFixedLengthArchetype(14));
        //07
        addFieldArchetype(USO_EXCLUSIVO_CAIXA, new FieldFillerArchetype(20, '0'));
        //08
        addFieldArchetype(AGENCIA_MANTENEDORA_AG_DIG, new FieldIntegerFixedLengthArchetype(5));
        //09
        addFieldArchetype(AGENCIA_MANTENEDORA_DIG, new FieldStringFixedLengthArchetype(1));
        //10
        addFieldArchetype(CODIGO_CONVENIO_BANCO, new FieldIntegerFixedLengthArchetype(6));
        //11
        addFieldArchetype(USO_EXCLUSIVO_CAIXA2, new FieldFillerArchetype(7,'0'));
        //12
        addFieldArchetype(USO_EXCLUSIVO_CAIXA3, new FieldFillerArchetype(1,'0'));
        //13
        //addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //14 o correto é 30 mas não esta pegando /\ então juntei
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(60));
        //15
        addFieldArchetype(USO_FEBRABAN, new FieldFillerArchetype(10, ' '));
        //16
        addFieldArchetype(CODIGO_REMESSA_RETORNO, new FieldIntegerFixedLengthArchetype(1));
        //17
        addFieldArchetype(DATA_GERACAO_ARQUIVO, new FieldStringFixedLengthArchetype(8));
        //18
        addFieldArchetype(HORA_GERACAO_ARQUIVO, new FieldStringFixedLengthArchetype(6));
        //19
        addFieldArchetype(NUMERO_SEQUENCIAL_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //20
        addFieldArchetype(NUMERO_VERSAO_ARQUIVO, new FieldIntegerFixedLengthArchetype(3));
        //21
        addFieldArchetype(DENSIDADE_GRAVACAO_ARQUIVO, new FieldIntegerFixedLengthArchetype(5));
        //22
        addFieldArchetype(USO_RESERVADO_BANCO, new FieldFillerArchetype(20, ' '));
        //23
        addFieldArchetype(USO_RESERVADO_EMPRESA, new FieldStringFixedLengthArchetype(20));
        //24
        addFieldArchetype(VERSAO_APLICATIVO, new FieldStringFixedLengthArchetype(4));
        //25
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN3, new FieldFillerArchetype(25, ' '));
        
    }
    
}
