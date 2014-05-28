package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 07/04/2014 17:39:36
 *
 * @author Cesário
 */
// 3.1.2.3 - Registro Header de Lote
public class LineCnabCaixaEconomicaHeaderLote extends LineArchetype {

    /**
     * 01 <br>
     * Código do Banco na Compensação <br>
     * DEFAULT 104 <br>
     * POSICAO 001 003 <br>
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";

    /**
     * 02 <br>
     * Lote de Serviço <br>
     * DEFAULT ' ' <br>
     * POSICAO 004 007 <br>
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";

    /**
     * 03 <br>
     * Tipo de Registro <br>
     * DEFAULT 1 <br>
     * POSICAO 008 008 <br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";

    /**
     * 04 <br>
     * Tipo de Operação <br>
     * DEFAULT 9 <br>
     * POSICAO 009 009 <br>
     */
    public static final String TIPO_OPERACAO = "TIPO_OPERACAO";

    /**
     * 05 <br>
     * Tipo de Serviço <br>
     * DEFAULT ' ' <br>
     * POSICAO 010 011 <br>
     */
    public static final String TIPO_SERVICO = "TIPO_SERVICO";

    /**
     * 06 <br>
     * Uso Exclusivo FEBRABAN/CNAB <br>
     * DEFAULT 00 <br>
     * POSICAO 012 013 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";

    /**
     * 07 <br>
     * Nº da Versão do Layout do Lote <br>
     * DEFAULT 030 <br>
     * POSICAO 014 016 <br>
     */
    public static final String NUMERO_VERSAO_LOTE = "NUMERO_VERSAO_LOTE";

    /**
     * 08 <br>
     * Uso Exclusivo FEBRABAN/CNAB <br>
     * DEFAULT ' ' <br>
     * POSICAO 017 017 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";

    /**
     * 09 <br>
     * Tipo de Inscrição da Empresa <br>
     * DEFAULT ' ' <br>
     * POSICAO 018 018 <br>
     */
    public static final String TIPO_INSCRICAO_EMPRESA = "TIPO_INSCRICAO_EMPRESA";

    /**
     * 10 <br>
     * Nº de Inscrição da Empresa <br>
     * DEFAULT <br>
     * POSICAO 019 033 <br>
     */
    public static final String NUMERO_INSCRICAO_EMPRESA = "NUMERO_INSCRICAO_EMPRESA";

    /**
     * 11 <br>
     * Código do Cedente no Banco <br>
     * DEFAULT <br>
     * POSICAO 034 039 <br>
     */
    public static final String CODIGO_CEDENTE_BANCO = "CODIGO_CEDENTE_BANCO";

    /**
     * 11- <br>
     * Uso Exclusivo CAIXA <br>
     * DEFAULT 0 <br>
     * POSICAO 040 053 <br>
     */
    public static final String USO_EXCLUSIVO_CAIXA1 = "USO_EXCLUSIVO_CAIXA1";

    /**
     * 12 <br>
     * Agência Mantenedora da Conta<br>
     * DEFAULT <br>
     * POSICAO 054 058 <br>
     */
    public static final String AGENCIA_MANTENEDORA_CONTA = "AGENCIA_MANTENEDORA_CONTA";

    /**
     * 13 <br>
     * Dígito Verificador da Conta<br>
     * DEFAULT <br>
     * POSICAO 059 059 <br>
     */
    public static final String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";

    /**
     * 14 <br>
     * Código do Convênio no Banco<br>
     * DEFAULT <br>
     * POSICAO 060 065 <br>
     */
    public static final String CODIGO_CONVENIO_BANCO = "CODIGO_CONVENIO_BANCO";

    /**
     * 15 <br>
     * Código do Modelo Personalizado<br>
     * DEFAULT <br>
     * POSICAO 066 072 <br>
     */
    public static final String CODIGO_MODELO_PERSONALIZADO = "CODIGO_MODELO_PERSONALIZADO";

    /**
     * 16 <br>
     * Uso Exclusivo CAIXA <br>
     * DEFAULT 0 <br>
     * POSICAO 073 073 <br>
     */
    public static final String USO_EXCLUSIVO_CAIXA2 = "USO_EXCLUSIVO_CAIXA2";

    /**
     * 17 <br>
     * Nome da Empresa <br>
     * DEFAULT <br>
     * POSICAO 074 0103 <br>
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";

    /**
     * 18 <br>
     * Mensagem 1 <br>
     * DEFAULT <br>
     * POSICAO 0104 0143 <br>
     */
    public static final String MENSAGEM1 = "MENSAGEM1";

    /**
     * 19 <br>
     * Mensagem 2 <br>
     * DEFAULT <br>
     * POSICAO 0144 0183 <br>
     */
    public static final String MENSAGEM2 = "MENSAGEM2";

    /**
     * 20 <br>
     * Número Remessa/Retorno <br>
     * DEFAULT <br>
     * POSICAO 0184 0191 <br>
     */
    public static final String NUMERO_REMESSA_RETORNO = "NUMERO_REMESSA_RETORNO";

    /**
     * 21 <br>
     * Data de Gravação Remessa/Retorno <br>
     * DEFAULT <br>
     * POSICAO 0192 0199 <br>
     */
    public static final String DATA_GRAVACAO_REMESSA_RETORNO = "DATA_GRAVACAO_REMESSA_RETORNO";

    /**
     * 22 <br>
     * Data do Crédito <br>
     * DEFAULT <br>
     * POSICAO 0200 0207 <br>
     */
    public static final String DATA_CREDITO = "DATA_CREDITO";

    /**
     * 23 <br>
     * Uso Exclusivo FEBRABAN/CNAB <br>
     * DEFAULT brancos <br>
     * POSICAO 0208 0240 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN3 = "USO_EXCLUSIVO_FEBRABAN3";

    public LineCnabCaixaEconomicaHeaderLote() {
        setName("CNAB - Registro Header de Lote - v240 - Remessa");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        //04
        addFieldArchetype(TIPO_OPERACAO, new FieldStringFixedLengthArchetype(1));
        //05
        addFieldArchetype(TIPO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(2,' '));
        //07
        addFieldArchetype(NUMERO_VERSAO_LOTE, new FieldIntegerFixedLengthArchetype(3));
        //08
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(1,' '));
        //09
        addFieldArchetype(TIPO_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(NUMERO_INSCRICAO_EMPRESA , new FieldStringFixedLengthArchetype(15));
        //11
        addFieldArchetype(CODIGO_CEDENTE_BANCO , new FieldStringFixedLengthArchetype(6));
        //11-
        addFieldArchetype(USO_EXCLUSIVO_CAIXA1 , new FieldFillerArchetype(14,'0'));
        //12
        addFieldArchetype(AGENCIA_MANTENEDORA_CONTA , new FieldIntegerFixedLengthArchetype(5));
        //13
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA , new FieldStringFixedLengthArchetype(1));
        //14
        addFieldArchetype(CODIGO_CONVENIO_BANCO , new FieldStringFixedLengthArchetype(6));
        //15
        addFieldArchetype(CODIGO_MODELO_PERSONALIZADO , new FieldIntegerFixedLengthArchetype(7));
        //16
        addFieldArchetype(USO_EXCLUSIVO_CAIXA2 , new FieldFillerArchetype(1,'0'));
        //17
        addFieldArchetype(NOME_EMPRESA , new FieldStringFixedLengthArchetype(30));
        //18
        addFieldArchetype(MENSAGEM1 , new FieldStringFixedLengthArchetype(40));
        //19
        addFieldArchetype(MENSAGEM2 , new FieldStringFixedLengthArchetype(40));
        //20
        addFieldArchetype(NUMERO_REMESSA_RETORNO , new FieldIntegerFixedLengthArchetype(8));
        //21
        addFieldArchetype(DATA_GRAVACAO_REMESSA_RETORNO , new FieldStringFixedLengthArchetype(8));
        //22
        addFieldArchetype(DATA_CREDITO , new FieldStringFixedLengthArchetype(8));
        //23
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN3 , new FieldFillerArchetype(33, ' '));
        
        
        
    }
        
}
