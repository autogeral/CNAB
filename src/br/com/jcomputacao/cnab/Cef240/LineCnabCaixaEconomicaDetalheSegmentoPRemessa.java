package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/04/2014 10:22:08
 * @author Cesário
 */

//3.1.2.4 - Registro Detalhe
//Registro Detalhe - Segmento P (Obrigatório - Remessa)
public class LineCnabCaixaEconomicaDetalheSegmentoPRemessa extends LineArchetype{
    
    /**
     * 1
     * CODIGO DO BANCO - DEFAULT 104
     * POSICAO 001 003
     * tamanho 3
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * 2-
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     * tamanho 4
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * 3
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     * tamanho 1
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 4
     * SEQUENCIAL DE REGISTRO - NUMERICO
     * POSICAO 009 013
     * tamanho 5
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * 5
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT P
     * POSICAO 014 014
     * DEFAULT 'P'
     * tamanho 1
     */
    public static final String CODIGO_SEGMENTO_REGISTRO = "CODIGO_SEGMENTO_REGISTRO";

    /**
     * 6
     * EXCLUSIVO FEBRABAN - BRANCOS
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 015 015
     * DEFAULT ' '
     * tamanho 1
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";
    
    /**
     * 7
     * CODIGO DO MOVIMENTO DE REMESSA - NUMERICO
     * Códigos de Movimento para Remessa tratados pelo Banco do Brasil:
     * 01 – Entrada de títulos
     * 02 – Pedido de baixa
     * 04 – Concessão de Abatimento
     * 05 – Cancelamento de Abatimento
     * 06 – Alteração de Vencimento
     * 07 – Concessão de Desconto
     * 08 – Cancelamento de Desconto
     * 09 – Protestar
     * 10 – Cancela/Sustação da Instrução de protesto
     * 30 – Recusa da Alegação do Sacado
     * 31 – Alteração de Outros Dados
     * 40 – Alteração de Modalidade.
     * POSICAO 016 017
     * 
     * tamanho 2
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";
    
    /**
     * 8
     * AGENCIA MANTENEDORA
     * POSICAO 018 022
     * tamanho 5
     */
    public static final String AGENCIA_MANTENEDORA_CEDENTE = "AGENCIA_MANTENEDORA_CEDENTE";
    /**
     * 9
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 023 023
     * tamanho 1
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA_CEDENTE = "DIGITO_VERIFICADOR_AGENCIA_CEDENTE";
    
    /**
     * 010 <br>
     * Código do Convênio no Banco <br>
     * POSICAO 024 029 
     * tamanho 6<br>
     */
    public static final String CODIGO_CONVENIO_BANCO_CEDENTE = "CODIGO_CONVENIO_BANCO_CEDENTE";
    
    /**
     * 011 <br>
     * Uso Exclusivo da CAIXA <br>
     * POSICAO 030 037
     * DEFAULT 0
     * tamanho 8<br>
     */
    public static final String USO_EXCLUSIVO_CAIXA1 = "USO_EXCLUSIVO_CAIXA1";
    
    /**
     * 012 <br>
     * Uso Exclusivo da CAIXA <br>
     * POSICAO 038 040
     * DEFAULT 0
     * tamanho 3<br>
     */
    public static final String USO_EXCLUSIVO_CAIXA2 = "USO_EXCLUSIVO_CAIXA2";
    
    /**
     * 013- <br>
     * Modalidade da Carteira <br>
     * POSICAO 041 042
     * tamanho 2<br>
     */
    public static final String MODALIDADE_CARTEIRA = "MODALIDADE_CARTEIRA";
    
    /**
     * 013- <br>
     * Identificação do Título no Banco <br>
     * POSICAO 043 057
     * tamanho 15<br>
     */
    public static final String IDENTIFICACAO_TITULO_BANCO = "IDENTIFICACAO_TITULO_BANCO";
    
    /**
     * 014- <br>
     * Código da Carteira <br>
     * POSICAO 058 058
     * tamanho 1<br>
     */
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    
    /**
     * 015- <br>
     * Forma de Cadastr. do Título no Banco <br>
     * POSICAO 059 059
     * tamanho 1<br>
     */
    public static final String FORMA_CADASTRO_BANCO = "FORMA_CADASTRO_BANCO";
    
    /**
     * 016- <br>
     * Tipo de Documento <br>
     * POSICAO 060 060
     * DEFAULT 2
     * tamanho 1<br>
     */
    public static final String TIPO_DOCUMENTO = "TIPO_DOCUMENTO";
     
    /**
     * 017- <br>
     * Identificação da Emissão do Bloqueto <br>
     * POSICAO 061 061 tamanho 1<br>
     */
    public static final String IDENTIFICACAO_EMISSAO_BOLETO = "IDENTIFICACAO_EMISSAO_BOLETO";
    
    /**
     * 018- <br>
     *Identificação da Entrega do Bloqueto <br>
     * POSICAO 062 062 tamanho 1<br>
     */
    public static final String IDENTIFICACAO_ENTREGA_BOLETO = "IDENTIFICACAO_ENTREGA_BOLETO";
    
    /**
     * 019- <br>
     * Número do Documento de Cobrança <br>
     * DEFAULT ' '
     * POSICAO 063 073 tamanho 11<br>
     */
    public static final String NUMERO_DOCUMENTO_COBRANCA = "NUMERO_DOCUMENTO_COBRANCA";
    
    /**
     * 019.2- <br>
     * Uso Exclusivo CAIXA <br>
     * POSICAO 074 077 tamanho 4<br>
     */
    public static final String USO_EXCLUSIVO_CAIXA3 = "USO_EXCLUSIVO_CAIXA3";
    
    /**
     * 020- <br>
     * Data de Vencimento do Título <br>
     * POSICAO 078 085 tamanho 8<br>
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    
    /**
     * 021- <br>
     * Valor Nominal do Título <br>
     * POSICAO 086 0100 tamanho 13 +2dec<br>
     */
    public static final String VALOR_NOMINAL_TITULO = "VALOR_NOMINAL_TITULO";
    
    /**
     * 022- <br>
     * Agência Encarregada da Cobrança <br>
     * DEFAULT 0
     * POSICAO 0101 0105 tamanho 5<br>
     */
    public static final String AGENCIA_ENCARREGADA_COBRANCA = "AGENCIA_ENCARREGADA_COBRANCA";
    
    /**
     * 023- <br>
     * Dígito Verificador da Agência <br>
     * POSICAO 0106 0106 tamanho 1<br>
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA = "DIGITO_VERIFICADOR_AGENCIA";
    
     /**
     * 024- <br>
     * Espécie do Título <br>
     * POSICAO 0107 0108 tamanho 2<br>
     */
    public static final String ESPECIE_TITULO = "ESPECIE_TITULO";
    
    /**
     * 025- <br>
     * Identific. de Título Aceito/Não Aceito <br>
     * POSICAO 0109 0109 tamanho 1<br>
     */
    public static final String IDENTIFICACAO_ACEITO_NAO = "IDENTIFICACAO_ACEITO_NAO";
    
    /**
     * 026- <br>
     * Data da Emissão do Título <br>
     * POSICAO 0110 0117 tamanho 8<br>
     */
    public static final String DATA_EMISSAO_TITULO = "DATA_EMISSAO_TITULO";
    
    /**
     * 027- <br>
     * Código do Juros de Mora <br>
     * POSICAO 0118 0118 tamanho 1<br>
     */
    public static final String CODIGO_JUROS_MORA = "CODIGO_JUROS_MORA";
    
    /**
     * 028- <br>
     * DATA do Juros de Mora <br>
     * POSICAO 0119 0126 tamanho 8<br>
     */
    public static final String DATA_JUROS_MORA = "DATA_JUROS_MORA";
    
    /**
     * 029- <br>
     * Juros de Mora por Dia/Taxa <br>
     * POSICAO 0127 0141 tamanho 13 +2dec <br>
     */
    public static final String JUROS_MORA_DIA = "JUROS_MORA_DIA";
    
    /**
     * 030- <br>
     * Código do Desconto 1 <br>
     * POSICAO 0142 0142 tamanho 1 <br>
     */
    public static final String CODIGO_DESCONTO1 = "CODIGO_DESCONTO1";
    
    /**
     * 031- <br>
     * DATA do Desconto 1 <br>
     * POSICAO 0143 0150 tamanho 8 <br>
     */
    public static final String DATA_DESCONTO1 = "DATA_DESCONTO1";
    
    /**
     * 032- <br>
     * Valor/Percentual a ser Concedido <br>
     * POSICAO 0151 0165 tamanho 13 +2DEC <br>
     */
    public static final String VALOR_PERC_DESCONTO1 = "VALOR_PERC_DESCONTO1";
    
    /**
     * 033- <br>
     * Valor do IOF a ser Recolhido <br>
     * POSICAO 0166 0180 tamanho 13 +2DEC <br>
     */
    public static final String VALOR_IOF = "VALOR_IOF";
    
    /**
     * 034- <br>
     * Valor do Abatimento <br>
     * POSICAO 0181 0195 tamanho 13 +2DEC <br>
     */
    public static final String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";
    
    /**
     * 035- <br>
     * Identificação do Título na Empresa <br>
     * POSICAO 0196 0220 tamanho 25 <br>
     */
    public static final String IDENTIFICACAO_TITULO_EMPRESA = "IDENTIFICACAO_TITULO_EMPRESA";
    
    /**
     * 036- <br>
     * Código para Protesto <br>
     * POSICAO 0221 0221 tamanho 1 <br>
     */
    public static final String CODIGO_PROTESTO = "CODIGO_PROTESTO";
    
    /**
     * 037- <br>
     * Número de Dias para Protesto <br>
     * POSICAO 0222 0223 tamanho 2 <br>
     */
    public static final String DIAS_PROTESTO = "DIAS_PROTESTO";
    
    /**
     * 038- <br>
     * Código para Baixa/Devolução <br>
     * POSICAO 0224 0224 tamanho 1 <br>
     */
    public static final String CODIGO_BAIXA_DEVOLUCAO = "CODIGO_BAIXA_DEVOLUCAO";
    
    /**
     * 039- <br>
     * Número de Dias para Baixa/Devolução <br>
     * POSICAO 0225 0227 tamanho 3 <br>
     */
    public static final String DIAS_BAIXA_DEVOLUCAO = "DIAS_BAIXA_DEVOLUCAO";
    
    /**
     * 040- <br>
     * Código da Moeda <br>
     * POSICAO 0228 0229 tamanho 2 <br>
     */
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";
    
    /**
     * 041- <br>
     * Uso Exclusivo CAIXA
     * DEFAULT '0'<br>
     * POSICAO 0230 0239 tamanho 10 <br>
     */
    public static final String USO_EXCLUSIVO_CAIXA4 = "USO_EXCLUSIVO_CAIXA4";
    
    /**
     * 042- <br>
     * Uso Exclusivo FEBRABAN/CNAB
     * DEFAULT ' '<br>
     * POSICAO 0240 0240 tamanho 1 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";
    
    public LineCnabCaixaEconomicaDetalheSegmentoPRemessa() {
        setName("CNAB - Arquivo Header - v240 - Remessa");
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'3'));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldFillerArchetype(1,'P'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(AGENCIA_MANTENEDORA_CEDENTE, new FieldIntegerFixedLengthArchetype(5));
        //09
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA_CEDENTE, new FieldStringFixedLengthArchetype(1));
        //10
        addFieldArchetype(CODIGO_CONVENIO_BANCO_CEDENTE, new FieldStringFixedLengthArchetype(6));
        //11
        addFieldArchetype(USO_EXCLUSIVO_CAIXA1, new FieldFillerArchetype(8,'0'));
        //12
        addFieldArchetype(USO_EXCLUSIVO_CAIXA2, new FieldFillerArchetype(3,'0'));
        //13
        addFieldArchetype(MODALIDADE_CARTEIRA, new FieldStringFixedLengthArchetype(2));
        //13.2
        addFieldArchetype(IDENTIFICACAO_TITULO_BANCO, new FieldStringFixedLengthArchetype(15));
        //14
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        //15
        addFieldArchetype(FORMA_CADASTRO_BANCO, new FieldIntegerFixedLengthArchetype(1));
        //16
        addFieldArchetype(TIPO_DOCUMENTO, new FieldFillerArchetype(1,'2'));
        //17
        addFieldArchetype(IDENTIFICACAO_EMISSAO_BOLETO, new FieldIntegerFixedLengthArchetype(1));
        //18
        addFieldArchetype(IDENTIFICACAO_ENTREGA_BOLETO, new FieldStringFixedLengthArchetype(1));
        //19
        addFieldArchetype(NUMERO_DOCUMENTO_COBRANCA, new FieldStringFixedLengthArchetype(11));
        //19.2
        addFieldArchetype(USO_EXCLUSIVO_CAIXA3, new FieldFillerArchetype(4,' '));
        //20
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldStringFixedLengthArchetype(8));
        //21
        addFieldArchetype(VALOR_NOMINAL_TITULO, new FieldDecimalFixedLengthArchetype(15,2));
        //22
        addFieldArchetype(AGENCIA_ENCARREGADA_COBRANCA, new FieldIntegerFixedLengthArchetype(5));
        //23
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA, new FieldStringFixedLengthArchetype(1));
        //24
        addFieldArchetype(ESPECIE_TITULO, new FieldIntegerFixedLengthArchetype(2));
        //25
        addFieldArchetype(IDENTIFICACAO_ACEITO_NAO, new FieldStringFixedLengthArchetype(1));
        //26
        addFieldArchetype(DATA_EMISSAO_TITULO, new FieldStringFixedLengthArchetype(8));
        //27
        addFieldArchetype(CODIGO_JUROS_MORA, new FieldIntegerFixedLengthArchetype(1));
        //28
        addFieldArchetype(DATA_JUROS_MORA, new FieldStringFixedLengthArchetype(8));
        //29
        addFieldArchetype(JUROS_MORA_DIA, new FieldDecimalFixedLengthArchetype(15,2));
        //30
        addFieldArchetype(CODIGO_DESCONTO1, new FieldIntegerFixedLengthArchetype(1));
        //31
        addFieldArchetype(DATA_DESCONTO1, new FieldStringFixedLengthArchetype(8));
        //32
        addFieldArchetype(VALOR_PERC_DESCONTO1, new FieldDecimalFixedLengthArchetype(15,2));
        //33
        addFieldArchetype(VALOR_IOF, new FieldDecimalFixedLengthArchetype(15,2));
        //34
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(15,2));
        //35
        addFieldArchetype(IDENTIFICACAO_TITULO_EMPRESA, new FieldStringFixedLengthArchetype(25));
        //36
        addFieldArchetype(CODIGO_PROTESTO, new FieldIntegerFixedLengthArchetype(1));
        //37
        addFieldArchetype(DIAS_PROTESTO, new FieldIntegerFixedLengthArchetype(2));
        //38
        addFieldArchetype(CODIGO_BAIXA_DEVOLUCAO, new FieldIntegerFixedLengthArchetype(1));
        //39
        addFieldArchetype(DIAS_BAIXA_DEVOLUCAO, new FieldStringFixedLengthArchetype(3));
        //40
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        //41
        addFieldArchetype(USO_EXCLUSIVO_CAIXA4, new FieldFillerArchetype(10,'0'));
        //42
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(1,' '));
        
        
    }

    
    
}
