package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/04/2014 10:15:49
 * @author Cesário
 */

/**
 * Registro Detalhe - Segmento S (Opcional - Remessa)
 */
public class LineCnabCaixaEconomicaDetalheSegmentoSRemessa extends LineArchetype {
     
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
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT S<br>
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
     * 8<br>
     * Tipo de Impressão<br>
     * IDENTIFICACAO Impressão<br>
     * POSICAO 018 018<br>
     * tamanho 1<br>
     */
    public static final String IDENTIFICACAO_IMPRESSAO = "IDENTIFICACAO_IMPRESSAO";
    
   
   
}
