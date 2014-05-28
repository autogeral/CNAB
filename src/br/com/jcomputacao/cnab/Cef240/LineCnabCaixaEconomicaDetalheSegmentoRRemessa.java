package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/04/2014 09:41:26
 * @author Cesário
 */

/**
 * Registro Detalhe - Segmento R (Opcional - Remessa)
 */
public class LineCnabCaixaEconomicaDetalheSegmentoRRemessa extends LineArchetype {
     /**
     * 1 <br>
     * CODIGO DO BANCO - DEFAULT 104 <br>
     * POSICAO 001 003<br>
     * tamanho 3<br>
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * 2-<br>
     * CODIGO DO LOTE<br>
     * LOTE DE SERVICO<br>
     * POSICAO 004 007<br>
     * tamanho 4<br>
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * 3<br>
     * TIPO DE REGISTRO - DEFAULT 3<br>
     * REGISTRO HEADER DO LOTE<br>
     * POSICAO 008 008<br>
     * tamanho 1<br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 4<br>
     * SEQUENCIAL DE REGISTRO - NUMERICO<br>
     * POSICAO 009 013<br>
     * tamanho 5<br>
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * 5
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT Q<br>
     * POSICAO 014 014<br>
     * DEFAULT 'P'<br>
     * tamanho 1<br>
     */
    public static final String CODIGO_SEGMENTO_REGISTRO = "CODIGO_SEGMENTO_REGISTRO";

    /**
     * 6<br>
     * EXCLUSIVO FEBRABAN - BRANCOS<br>
     * IDENTIFICACAO DO TIPO DE SERVICO<br>
     * POSICAO 015 015<br>
     * DEFAULT ' '<br>
     * tamanho 1<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";
    
    /**
     * 7<br>
     * CODIGO DO MOVIMENTO DE REMESSA - NUMERICO<br>
     * Códigos de Movimento para Remessa tratados pelo Banco do Brasil:<br>
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
     * POSICAO 016 017<br>
     * 
     * tamanho 2
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";
    
     /**
     * 8 Desc2<br>
     * Código do Desconto 2<br>
     * IDENTIFICACAO Código do Desconto 2<br>
     * POSICAO 018 018<br>
     * tamanho 1 numérico <br>
     */
    public static final String DESCONTO2_CODIGO = "DESCONTO2_CODIGO";
    
    /**
     * 9 Desc2<br>
     * data do Desconto 2<br>
     * data  do Desconto 2<br>
     * POSICAO 019 026<br>
     * tamanho 8 numérico DDmmYYYY<br>
     */
    public static final String DESCONTO2_DATA = "DESCONTO2_DATA";
    
    /**
     * 10 Desc2<br>
     * Valor/Percentual a ser Concedido do Desconto 2<br>
     * Valor/Percentual a ser Concedido<br>
     * POSICAO 027 041<br>
     * tamanho 15 precisao 2 numérico <br>
     */
    public static final String DESCONTO2_VALOR = "DESCONTO2_VALOR";
    
    /**
     * 11 Desc3<br>
     * Código do Desconto 3<br>
     * IDENTIFICACAO Código do Desconto 3<br>
     * POSICAO 042 042<br>
     * tamanho 1 numérico <br>
     */
    public static final String DESCONTO3_CODIGO = "DESCONTO3_CODIGO";
    
    /**
     * 12 Desc3<br>
     * data do Desconto 3<br>
     * data  do Desconto 3<br>
     * POSICAO 043 050<br>
     * tamanho 8 numérico DDmmYYYY<br>
     */
    public static final String DESCONTO3_DATA = "DESCONTO3_DATA";
    
    /**
     * 13 Desc3<br>
     * Valor/Percentual a ser Concedido do Desconto 3<br>
     * Valor/Percentual a ser Concedido<br>
     * POSICAO 051 065  <br>
     * tamanho 15 precisao 2 numérico <br>
     */
    public static final String DESCONTO3_VALOR = "DESCONTO3_VALOR";
    
    /**
     * 14 Multa<br>
     * Cód. Multa<br>
     * POSICAO 066 066<br>
     * tamanho 1 numérico <br>
     */
    public static final String MULTA_CODIGO = "MULTA_CODIGO";
    
    /**
     * 15 Multa<br>
     * Data Multa<br>
     * POSICAO 067 074<br>
     * tamanho 8 numérico DDmmYYYY <br>
     */
    public static final String MULTA_DATA = "MULTA_DATA";
    
    /**
     * 16 Multa<br>
     * VALOR Multa<br>
     * POSICAO 075 089<br>
     * tamanho 15 numérico precisao 2 <br>
     */
    public static final String MULTA_VALOR = "MULTA_VALOR";
    
    /**
     * 17 <br>
     * Informação ao Sacado<br>
     * POSICAO 090 099<br>
     * tamanho 10 Alfanumérico <br>
     */
    public static final String INFORMACAO_SACADO = "INFORMACAO_SACADO";
    
    /**
     * 18 <br>
     * Informação 3<br>
     * POSICAO 0100 0139<br>
     * tamanho 40 Alfanumérico <br>
     */
    public static final String INFORMACAO3 = "INFORMACAO3";
    
    /**
     * 19 <br>
     * Informação 4<br>
     * POSICAO 0140 0179<br>
     * tamanho 40 Alfanumérico <br>
     */
    public static final String INFORMACAO4 = "INFORMACAO4";
    
    /**
     * 20 <br>
     * E-mail sacado<br>
     * POSICAO 0180 0229<br>
     * tamanho 50 Alfanumérico <br>
     */
    public static final String SACADO_EMAIL = "SACADO_EMAIL";
    
    /**
     * 21 <br>
     * USO EXC CNAB<br>
     * POSICAO 0230 0240<br>
     * tamanho 11 Alfanumérico  DEFAULT BRANCO<br>
     */
    public static final String USO_EXCLUSIVO_CNAB1 = "USO_EXCLUSIVO_CNAB1";
    
    
    public LineCnabCaixaEconomicaDetalheSegmentoRRemessa() {
        setName("CNAB - Registro Detalhe - Segmento R (Obrigatório - Remessa)");
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
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldFillerArchetype(1,'Q'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(DESCONTO2_CODIGO, new FieldIntegerFixedLengthArchetype(1));
        //09
        addFieldArchetype(DESCONTO2_DATA, new FieldIntegerFixedLengthArchetype(8));
        //10
        addFieldArchetype(DESCONTO2_VALOR, new FieldDecimalMaximumLengthArchetype(15,2));
        //11
        addFieldArchetype(DESCONTO3_CODIGO, new FieldIntegerFixedLengthArchetype(1));
        //12
        addFieldArchetype(DESCONTO3_DATA, new FieldIntegerFixedLengthArchetype(8));
        //13
        addFieldArchetype(DESCONTO3_VALOR, new FieldDecimalMaximumLengthArchetype(15,2));
        //14
        addFieldArchetype(MULTA_CODIGO, new FieldIntegerFixedLengthArchetype(1));
        //15
        addFieldArchetype(MULTA_DATA, new FieldIntegerFixedLengthArchetype(8));
        //16
        addFieldArchetype(MULTA_VALOR, new FieldDecimalMaximumLengthArchetype(15,2));
        //17
        addFieldArchetype(INFORMACAO_SACADO, new FieldStringFixedLengthArchetype(10));
        //18
        addFieldArchetype(INFORMACAO3, new FieldStringFixedLengthArchetype(40));
        //19
        addFieldArchetype(INFORMACAO4, new FieldStringFixedLengthArchetype(40));
        //20
        addFieldArchetype(SACADO_EMAIL, new FieldStringFixedLengthArchetype(50));
        //21
        addFieldArchetype(USO_EXCLUSIVO_CNAB1, new FieldFillerArchetype(11,' '));        
    }
}
