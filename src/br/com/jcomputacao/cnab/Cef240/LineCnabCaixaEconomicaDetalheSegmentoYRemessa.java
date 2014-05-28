
package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/04/2014 11:12:11
 * @author Cesário
 */

//Registro Detalhe - Segmento Y (Opcional - Remessa)
public class LineCnabCaixaEconomicaDetalheSegmentoYRemessa extends LineArchetype{
    
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
     * POSICAO 004 007 <br>
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    
    /**
     * 03 <br>
     * Tipo de Registro <br>
     * DEFAULT 3 <br>
     * POSICAO 008 008 <br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    
    /**
     * 04 <br>
     * Nº do Registro <br>
     * POSICAO 009 013 <br>
     */
    public static final String NUMERO_SEQUENCIAL_REG_LOTE = "NUMERO_SEQUENCIAL_REG_LOTE";
    
    /**
     * 05 <br>
     * Segmento <br>
     * POSICAO 014 014 tamanho 1 alfaNumérico default 'Y' <br>
     */
    public static final String SEGMENTO = "SEGMENTO";
    
    /**
     * 06 <br>
     * cnab <br>
     * POSICAO 015 015 tamanho 2 alfaNumerico default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN = "USO_EXCLUSIVO_FEBRABAN";
    
    /**
     * 07 <br>
     * Cód. Mov. <br>
     * Código de Movimento Remessa <br>
     * POSICAO 016 017  tamanho 2 numerico <br>
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";
    
    /**
     * 08 <br>
     * Cod. Reg. Opcional <br>
     * Identificação Registro Opcional <br>
     * POSICAO 018 019 <br>
     */
    public static final String IDENTIFICACAO_REGISTRO_OPCIONAL = "IDENTIFICACAO_REGISTRO_OPCIONAL";
    
    /**
     * 09 <br>
     * Tipo de Registro <br>
     * Identificação Registro Opcional <br>
     * POSICAO 020 020 <br>
     */
    public static final String TIPO_REGISTRO_MODELO = "TIPO_REGISTRO_MODELO";
    
    
}
