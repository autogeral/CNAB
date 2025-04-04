package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 28/04/2014 11:12:11
 *
 * @author Cesário
 */
//Registro Detalhe - Segmento T (Obrigatório - Retorno)
public class LineCnabCaixaEconomicaDetalheSegmentoT_Retorno extends LineArchetype {

    /**
     * 01 <br>
     * Código do Banco na Compensação <br>
     * DEFAULT 104 <br>
     * POSICAO 001 003 <br>
     * Tamanho 3
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";

    /**
     * 02 <br>
     * Lote de Serviço <br>
     * POSICAO 004 007 <br>
     * Tamanho 4
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";

    /**
     * 03 <br>
     * Tipo de Registro <br>
     * DEFAULT 3 <br>
     * POSICAO 008 008 <br>
     * Tamanho 1
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";

    /**
     * 04 <br>
     * Número Seqüencial Registro no Lote <br>
     * POSICAO 009 013 <br>
     * Tamanho 5
     */
    public static final String NUMERO_SEQUENCIAL_REG_LOTE = "NUMERO_SEQUENCIAL_REG_LOTE";

    /**
     * 05 <br>
     * Código Segmento do Registro Detalhe <br>
     * POSICAO 014 014 tamanho 1 alfaNumérico default 'T' <br>
     */
    public static final String SEGMENTO = "SEGMENTO";

    /**
     * 06 <br>
     * cnab <br>
     * POSICAO 015 015 tamanho 2 alfaNumerico default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";

    /**
     * 07 <br>
     * Cód. Mov. <br>
     * Código de Movimento Retorno <br>
     * POSICAO 016 017 tamanho 2 numerico <br>
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";

    /**
     * 08 <br>
     * Código Identif. <br>
     * Agência Código <br>
     * POSICAO 018 022 <br>
     * tamanho 5 default '0'Numérico
     */
    public static final String USO_EXCLUSIVO_CAIXA1 = "USO_EXCLUSIVO_CAIXA1";

    /**
     * 09 <br>
     * Código Identif. <br>
     * Agência dIGITO vERIFIC <br>
     * POSICAO 023 023 <br>
     * tamanho 1 default '0' Numérico
     */
    public static final String USO_EXCLUSIVO_CAIXA2 = "USO_EXCLUSIVO_CAIXA2";

    /**
     * 10 <br>
     * Código Identif. <br>
     * Código do Convênio no Banco <br>
     * POSICAO 024 029 <br>
     * tamanho 6 Numérico
     */
    public static final String CODIGO_CONVENIO_BANCO = "CODIGO_CONVENIO_BANCO";

    /**
     * 11 <br>
     * Uso Exclusivo da CAIXA <br>
     * POSICAO 030 032 <br>
     * tamanho 3 DEFAULT'0' Numérico
     */
    public static final String USO_EXCLUSIVO_CAIXA3 = "USO_EXCLUSIVO_CAIXA3";

    /**
     * 11.2 <br>
     * Número do Banco de Sacados <br>
     * POSICAO 033 035 <br>
     * tamanho 3 Numérico
     */
    public static final String NUMERO_BANCO_SACADOS = "NUMERO_BANCO_SACADOS";

    /**
     * 12 <br>
     * Uso Exclusivo da CAIXA<br>
     * POSICAO 036 039 <br>
     * tamanho 4 DEFAULT '0' Numérico
     */
    public static final String USO_EXCLUSIVO_CAIXA4 = "USO_EXCLUSIVO_CAIXA4";

    /**
     * 13 <br>
     * Modalidade Nosso Número<br>
     * POSICAO 040 041 <br>
     * tamanho 2 Numérico
     */
    public static final String MODALIDADE_NOSSO_NUMERO = "MODALIDADE_NOSSO_NUMERO";

    /**
     * 13.2 <br>
     * Identificação do Título no Banco<br>
     * POSICAO 042 056 <br>
     * tamanho 15 Numérico
     */
    public static final String IDENTIFICACAO_TITULO_BANCO = "IDENTIFICACAO_TITULO_BANCO";

    /**
     * 13.3 <br>
     * Uso Exclusivo CAIXA<br>
     * POSICAO 057 057 <br>
     * tamanho 1 DEFAULT '0' Numérico
     */
    public static final String USO_EXCLUSIVO_CAIXA5 = "USO_EXCLUSIVO_CAIXA5";

    /**
     * 14 <br>
     * Código da Carteira <br>
     * Código da Carteira<br>
     * POSICAO 058 058 <br>
     * tamanho 1 Numérico
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";

    /**
     * 15 <br>
     * Número do Documento de Cobrança<br>
     * POSICAO 059 069 <br>
     * tamanho 11 AlfaNumérico
     */
    public static final String NUMERO_DOCUMENTO_COBRANCA = "NUMERO_DOCUMENTO_COBRANCA";

    /**
     * 15.2 <br>
     * Uso Exclusivo CAIXA<br>
     * POSICAO 070 073 <br>
     * tamanho 4 DEFAULT ' ' AlfaNumérico
     */
    public static final String USO_EXCLUSIVO_CAIXA6 = "USO_EXCLUSIVO_CAIXA6";

    /**
     * 16 <br>
     * Data de Vencimento do Título<br>
     * POSICAO 074 081 <br>
     * tamanho 8 Numérico
     */
    public static final String VENCIMENTO = "VENCIMENTO";

    /**
     * 17 <br>
     * Valor Nominal do Título<br>
     * POSICAO 082 096 <br>
     * tamanho 15 Numérico PRECISAO 2 DECIM
     */
    public static final String VALOR_NOMINAL_TITULO = "VALOR_NOMINAL_TITULO";

    /**
     * 18 <br>
     * Banco Cobrador/Recebedor<br>
     * Código do Banco COBRADOR POSICAO 097 099 <br>
     * tamanho 3 Numérico
     */
    public static final String CODIGO_BANCO_COBRADOR = "CODIGO_BANCO_COBRADOR";

    /**
     * 19 <br>
     * Código da Agência Cobr/Recebr<br>
     * CCódigo da Agência Cobr/Receb POSICAO 0100 0104 <br>
     * tamanho 5 Numérico
     */
    public static final String CODIGO_AGENCIA_COBRADOR = "CODIGO_AGENCIA_COBRADOR";

    /**
     * 20 <br>
     * Dígito Verificador da Agência Cobr/Rec<br>
     * POSICAO 0105 0105 <br>
     * tamanho 1 Numérico
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA = "DIGITO_VERIFICADOR_AGENCIA";

    /**
     * 21 <br>
     * Identificação do Título na Empresa<br>
     * POSICAO 0106 0130 <br>
     * tamanho 25 ALFANumérico
     */
    public static final String IDENTIFICACAO_TITULO_EMPRESA = "IDENTIFICACAO_TITULO_EMPRESA";

    /**
     * 22 <br>
     * Código da Moeda<br>
     * POSICAO 0131 0132 <br>
     * tamanho 2 Numérico
     */
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";

    /**
     * 23 <br>
     * Tipo de Inscrição<br>
     * POSICAO 0133 0133 <br>
     * tamanho 1 Numérico
     */
    public static final String SACADO_TIPO_INSCRICAO = "SACADO_TIPO_INSCRICAO";

    /**
     * 24 <br>
     * Número de Inscrição<br>
     * POSICAO 0134 0148 <br>
     * tamanho 15 Numérico
     */
    public static final String SACADO_NUMERO_INSCRICAO = "SACADO_NUMERO_INSCRICAO";

    /**
     * 25 <br>
     * SACADO_NOME<br>
     * POSICAO 0149 0188 <br>
     * tamanho 40 ALFANumérico
     */
    public static final String SACADO_NOME = "SACADO_NOME";

    /**
     * 26 <br>
     * Uso Exclusivo FEBRABAN/CNAB<br>
     * POSICAO 0189 0198 <br>
     * tamanho 10 ALFANumérico default ' '
     */
    public static final String USO_EXCLUSIVO_CAIXA7 = "USO_EXCLUSIVO_CAIXA7";

    /**
     * 27 <br>
     * Valor da Tarifa / Custas<br>
     * POSICAO 0199 0213 <br>
     * tamanho 15 Numérico deCIMAL 2
     */
    public static final String VALOR_TARIFA = "VALOR_TARIFA";

    /**
     * 28 <br>
     * Identificação para Rejeições, Tarifas,Custas, Liquidação e Baixas<br>
     * POSICAO 0214 0223 <br>
     * tamanho 10 ALFANumérico
     */
    public static final String MOTIVO_OCORRENCIA = "MOTIVO_OCORRENCIA";

    /**
     * 29 <br>
     * Uso Exclusivo FEBRABAN/CNAB<br>
     * POSICAO 0224 0240 <br>
     * tamanho 17 ALFANumérico BRANCOS
     */
    public static final String USO_EXCLUSIVO_CAIXA8 = "USO_EXCLUSIVO_CAIXA8";

    public LineCnabCaixaEconomicaDetalheSegmentoT_Retorno() {
        setName("CNAB -Registro Detalhe - Segmento T (Obrigatório - Retorno)");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1, '3'));
        //04
        addFieldArchetype(NUMERO_SEQUENCIAL_REG_LOTE, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(SEGMENTO, new FieldFillerArchetype(1, 'T'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1, ' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(USO_EXCLUSIVO_CAIXA1, new FieldFillerArchetype(5, '0'));
        //09
        addFieldArchetype(USO_EXCLUSIVO_CAIXA2, new FieldFillerArchetype(1, '0'));
        //10
        addFieldArchetype(CODIGO_CONVENIO_BANCO, new FieldIntegerFixedLengthArchetype(6));
        //11
        addFieldArchetype(USO_EXCLUSIVO_CAIXA3, new FieldFillerArchetype(3, '0'));
        //11.2
        addFieldArchetype(NUMERO_BANCO_SACADOS, new FieldStringFixedLengthArchetype(3));
        //12
        addFieldArchetype(USO_EXCLUSIVO_CAIXA4, new FieldFillerArchetype(4, '0'));
        //13.1
        addFieldArchetype(MODALIDADE_NOSSO_NUMERO, new FieldIntegerFixedLengthArchetype(2));
        //13.2
        addFieldArchetype(IDENTIFICACAO_TITULO_BANCO, new FieldStringFixedLengthArchetype(15));
        //13.3
        addFieldArchetype(USO_EXCLUSIVO_CAIXA5, new FieldFillerArchetype(1,'0'));
        //14
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        //15.1
        addFieldArchetype(NUMERO_DOCUMENTO_COBRANCA, new FieldStringFixedLengthArchetype(11));
        //15.2
        addFieldArchetype(USO_EXCLUSIVO_CAIXA6, new FieldFillerArchetype(4,' '));
        //16
        addFieldArchetype(VENCIMENTO, new FieldIntegerFixedLengthArchetype(8));
        //17
        addFieldArchetype(VALOR_NOMINAL_TITULO, new FieldDecimalFixedLengthArchetype(15,2));
        //18
        addFieldArchetype(CODIGO_BANCO_COBRADOR, new FieldIntegerFixedLengthArchetype(3));
        //19
        addFieldArchetype(CODIGO_AGENCIA_COBRADOR, new FieldIntegerFixedLengthArchetype(5));
        //20
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA, new FieldIntegerFixedLengthArchetype(1));
        //21
        addFieldArchetype(IDENTIFICACAO_TITULO_EMPRESA, new FieldStringFixedLengthArchetype(25));
        //22
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        //23
        addFieldArchetype(SACADO_TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //24
        addFieldArchetype(SACADO_NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        //25
        addFieldArchetype(SACADO_NOME, new FieldStringFixedLengthArchetype(40));
        //26
        addFieldArchetype(USO_EXCLUSIVO_CAIXA7, new FieldFillerArchetype(10,' '));
        //27
        addFieldArchetype(VALOR_TARIFA, new FieldDecimalFixedLengthArchetype(15,2));
        //28
        addFieldArchetype(MOTIVO_OCORRENCIA, new FieldStringFixedLengthArchetype(10));
        //28
        addFieldArchetype(USO_EXCLUSIVO_CAIXA8, new FieldFillerArchetype(17,' '));

    }

}
