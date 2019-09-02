/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author maria.fernanda
 */
public class LineCnab240SegmentoJ52 extends LineArchetype {
    /*
     * CODIGO DO BANCO
     * POSICAO 001 A 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCOS_COMPENSACAO";
    
    /*
     * LOTE DE SERVIÇO
     * POSICAO 004 A 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";
    
    /*
     * TIPO DE REGISTRO - PADRAO 3
     * POSICAO 008 A 008
     */
     public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";
     
     /*
      * NUMERO SEQUENCIAL DO REGISTRO NO LOTE
      * POSICAO 009 A 013
      */
     public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
     
     /*
      * CODIGO DO SEGMENTO - PADRAO J
      * POSICAO 014 A 014
      */
     public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
     
     /*
      * USO EXCLUSIVO FEBRABAN - PADRAO BRANCOS
      * POSICAO 015 A 015
      */
     public static final String USO_EXCLUSIVO_FEBRABAN_1 = "USO_EXCLUSIVO_FEBRABAN_1";
     
     /*
      * CODIGO DE MOVIMENTO REMESSA
      * POSICAO 016 A 017
      */
     public static final String CODIGO_MOVIMENTO = "CODIGO_MOVIMENTO";
     
     /*
      * IDENTIFICACAO REGISTRO OPCIONAL - PADRAO 52
      * POSICAO 018 A 019
      */
     public static final String IDENTIFICACAO_REGISTRO_OPCIONAL = "IDENTIFICACAO_REGISTRO_OPCIONAL";
     
     /* 
      * TIPO DE INSCRICAO
      * POSICAO 020 A 020
      */
     public static final String TIPO_INSCRICAO_PAGADOR = "TIPO_INSCRICAO_PAGADOR";
     
     /*
      * NUMERO DE INSCRICAO
      * POSICAO 021 A 035
      */
     public static final String NUMERO_INSCRICAO_PAGADOR = "NUMERO_INSCRICAO_PAGADOR";
     
     /*
      * NOME
      * POSICAO 036 A 075 
      */
     public static final String NOME_PAGADOR = "NOME_PAGADOR";
     
          /* 
      * TIPO DE INSCRICAO
      * POSICAO 076 A 076
      */
     public static final String TIPO_INSCRICAO_BENEFICIARIO = "TIPO_INSCRICAO_BENEFICIARIO";
     
     /*
      * NUMERO DE INSCRICAO
      * POSICAO 077 A 091
      */
     public static final String NUMERO_INSCRICAO_BENEFICIARIO = "NUMERO_INSCRICAO_BENEFICIARIO";
     
     /*
      * NOME
      * POSICAO 092 A 131 
      */
     public static final String NOME_BENEFICIARIO = "NOME_BENEFICIARIO";
     
          /* 
      * TIPO DE INSCRICAO
      * POSICAO 132 A 132
      */
     public static final String TIPO_INSCRICAO_SACADOR = "TIPO_INSCRICAO_SACADOR";
     
     /*
      * NUMERO DE INSCRICAO
      * POSICAO 133 A 147
      */
     public static final String NUMERO_INSCRICAO_SACADOR = "NUMERO_INSCRICAO_SACADOR";
     
     /*
      * NOME
      * POSICAO 148 A 187 
      */
     public static final String NOME_SACADOR = "NOME_SACADOR";
     
      /*
      * USO EXCLUSIVO FEBRABAN - PADRAO BRANCOS
      * POSICAO 188 A 240
      */
     public static final String USO_EXCLUSIVO_FEBRABAN_2 = "USO_EXCLUSIVO_FEBRABAN_2";
     
     public LineCnab240SegmentoJ52() {
         setName("CNAB - Segmento J52");
         addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
         addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
         addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
         addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
         addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("J"));
         addFieldArchetype(USO_EXCLUSIVO_FEBRABAN_1, new FieldFillerArchetype(1, ' '));
         addFieldArchetype(CODIGO_MOVIMENTO, new FieldStringFixedLengthArchetype(2));
         addFieldArchetype(IDENTIFICACAO_REGISTRO_OPCIONAL, new FieldDefaultArchetype("52"));
         addFieldArchetype(TIPO_INSCRICAO_PAGADOR, new FieldIntegerFixedLengthArchetype(1));
         addFieldArchetype(NUMERO_INSCRICAO_PAGADOR, new FieldIntegerFixedLengthArchetype(15));
         addFieldArchetype(NOME_PAGADOR, new FieldStringFixedLengthArchetype(40));
         addFieldArchetype(TIPO_INSCRICAO_BENEFICIARIO, new FieldIntegerFixedLengthArchetype(1));
         addFieldArchetype(NUMERO_INSCRICAO_BENEFICIARIO, new FieldIntegerFixedLengthArchetype(15));
         addFieldArchetype(NOME_BENEFICIARIO, new FieldStringFixedLengthArchetype(40));
         addFieldArchetype(TIPO_INSCRICAO_SACADOR, new FieldIntegerFixedLengthArchetype(1));
         addFieldArchetype(NUMERO_INSCRICAO_SACADOR, new FieldIntegerFixedLengthArchetype(15));
         addFieldArchetype(NOME_SACADOR, new FieldStringFixedLengthArchetype(40));
         addFieldArchetype(USO_EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(53, ' '));
     }    
}
