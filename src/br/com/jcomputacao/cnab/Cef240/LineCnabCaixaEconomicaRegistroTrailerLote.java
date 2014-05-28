/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/04/2014 14:52:26
 * @author Cesário
 */
//Registro Trailer de Lote
public class LineCnabCaixaEconomicaRegistroTrailerLote  extends LineArchetype{

    /**
     * 1 <br>
     * CODIGO DO BANCO - DEFAULT 104 <br>
     * POSICAO 001 003<br>
     * tamanho 3 Numérico<br>
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * 2-<br>
     * CODIGO DO LOTE<br>
     * LOTE DE SERVICO<br>
     * POSICAO 004 007<br>
     * tamanho 4 Numérico<br>
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    
    /**
     * 3<br>
     * TIPO DE REGISTRO - DEFAULT 3<br>
     * REGISTRO HEADER DO LOTE<br>
     * POSICAO 008 008<br>
     * tamanho 1 default '5' Numérico<br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    
    /**
     * 4<br>
     * CNAB<br>
     * Uso Exclusivo FEBRABAN/CNAB<br>
     * POSICAO 009 017<br>
     * tamanho 9 default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";
    
    /**
     * 5<br>
     * Qtde de Registros<br>
     * Quantidade de Registros no Lote<br>
     * POSICAO 018 023<br>
     * tamanho 9 default  Numérico<br>
     */
    public static final String QUANTIDADE_REGISTROS_LOTE = "QUANTIDADE_REGISTROS_LOTE";
    
    /**
     * 6<br>
     * Totalização da Cobrança Simples<br>
     * Quantidade de Títulos em Cobrança<br>
     * POSICAO 024 029<br>
     * tamanho 6 default  Numérico<br>
     */
    public static final String QUANTIDADE_TITULOS_COBRANCA = "QUANTIDADE_TITULOS_COBRANCA";
    
    /**
     * 7<br>
     * Totalização da Cobrança Simples<br>
     * Valor Total dosTítulos em Carteiras<br>
     * POSICAO 030 046<br>
     * tamanho 15 default  Numérico precisao 2<br>
     */
    public static final String VALOR_TITULOS_CARTEIRA = "VALOR_TITULOS_CARTEIRA";
    
     /**
     * 8<br>
     * Totalização da Cobrança Caucionada<br>
     * Quantidade de Títulos em Cobrança<br>
     * POSICAO 047 052<br>
     * tamanho 6 default  Numérico<br>
     */
    public static final String QUANTIDADE_TITULOS_COBRANCA_CAUCIONADA = "QUANTIDADE_TITULOS_COBRANCA_CAUCIONADA";
    
    /**
     * 9<br>
     * Totalização da Cobrança Caucionada<br>
     * Valor Total dosTítulos em Carteiras<br>
     * POSICAO 053 069<br>
     * tamanho 15 default  Numérico PRECISAO 2<br>
     */
    public static final String VALOR_TITULOS_CARTEIRA_CAUCIONADA = "VALOR_TITULOS_CARTEIRA_CAUCIONADA";
    
     /**
     * 10<br>
     * Totalização da Cobrança Descontada<br>
     * Quantidade de Títulos em Cobrança<br>
     * POSICAO 070 075<br>
     * tamanho 6 default  Numérico<br>
     */
    public static final String QUANTIDADE_TITULOS_COBRANCA_DESCONTADA = "QUANTIDADE_TITULOS_COBRANCA_DESCONTADA";
    
    /**
     * 11<br>
     * Totalização da Cobrança Caucionada<br>
     * Quantidade de Títulos em Carteiras<br>
     * POSICAO 076 092<br>
     * tamanho 15 default  Numérico PRECISAO 2<br>
     */
    public static final String QUANTIDADE_TITULOS_CARTEIRA_DESCONTADA = "QUANTIDADE_TITULOS_CARTEIRA_DESCONTADA";
    
    /**
     * 12<br>
     * CNAB<br>
     * Uso Exclusivo FEBRABA/CNAB<br>
     * POSICAO 093 0123<br>
     * tamanho 31 default AlfaNumérico default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";
    
    /**
     * 13<br>
     * CNAB<br>
     * Uso Exclusivo FEBRABA/CNAB<br>
     * POSICAO 0124 0240<br>
     * tamanho 117 default AlfaNumérico default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN3 = "USO_EXCLUSIVO_FEBRABAN3";

    public LineCnabCaixaEconomicaRegistroTrailerLote() {
        setName("Registro Trailer de Lote");
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'5'));
        //04
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,' '));
        //05
        addFieldArchetype(QUANTIDADE_REGISTROS_LOTE, new FieldIntegerFixedLengthArchetype(6));
        //06
        addFieldArchetype(QUANTIDADE_TITULOS_COBRANCA, new FieldIntegerFixedLengthArchetype(6));
        //07
        addFieldArchetype(VALOR_TITULOS_CARTEIRA, new FieldDecimalFixedLengthArchetype(15,2));
        //08
        addFieldArchetype(QUANTIDADE_TITULOS_COBRANCA_CAUCIONADA, new FieldIntegerFixedLengthArchetype(6));
        //09
        addFieldArchetype(VALOR_TITULOS_CARTEIRA_CAUCIONADA, new FieldDecimalFixedLengthArchetype(15,2));
        //10
        addFieldArchetype(QUANTIDADE_TITULOS_COBRANCA_DESCONTADA, new FieldIntegerFixedLengthArchetype(6));
        //11
        addFieldArchetype(QUANTIDADE_TITULOS_CARTEIRA_DESCONTADA, new FieldDecimalFixedLengthArchetype(15,2));
        //12
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(31,' '));
        //13
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN3, new FieldFillerArchetype(117,' '));
    }
    
    
}
