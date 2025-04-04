package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240TraillerRetorno extends LineArchetype{

//*****************************REGISTRO TRAILER DE LOTE*************************

    /**
     * CODIGO DO BANCO
     * NUMER DO BANCO NA CAMARA DE COMPENSACAO
     * POSIOCAO 001 003
     * PICTURE 9(03)
     * CONTE�DO 341
     */

     public static final String CODIGO_BANCO_TRAILER = "CODIGO_BANCO_TRAILER";

    /**
     * CODIGO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     * PICTURE 9(04)
     * CONTEUDO NOTA 1
     */

     public static final String CODIGO_LOTE_TRAILER = "CODIGO_LOTE_TRAILER";

    /**
     * TIPO DE REGISTRO
     * REGISTRO TRAILER DE LOTE
     * POSICAO 008 008
     * PICTURE 9(01)
     * CONTE�DO '5'
     */

     public static final String TIPO_REGISTRO_TRAILER = "TIPO_REGISTRO_TRAILER";

    /**
     * BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSI��O 009 017
     * PICTURE X(09)
     * CONTE�DO BRANCOS
     */

     public static final String BRANCOS_REGISTRO_TRAILER_ARQUIVO = "BRANCOS_REGISTRO_TRAILER_ARQUIVO";

    /**
     * TOTAL DE LOTES DE REGISTROS
     * QUANTIDADE DE REGISTROS DO ARQUIVO
     * POSICAO 018 023
     * PICTURE 9(06)
     * CONTE�DO NOTA 26
     */

     public static final String TOTAL_LOTES_REGISTROS = "TOTAL_LOTES_REGISTROS";

     /**
     * TOTAL DE LOTES DE REGISTROS
     * QUANTIDADE DE REGISTROS DO ARQUIVO
     * POSICAO 024 040
     * PICTURE 9(06)
     * CONTE�DO NOTA 26
     */

     public static final String VALOR_TOTAL_LOTE = "VALOR_TOTAL_LOTE";

    /**
     * BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSICAO 036 240
     * PICTURE X(205)
     * CONTE�DO BRANCOS
     */

     public static final String USO_FEBRABAN = "USO_FEBRABAN";

    public LineCnab240TraillerRetorno(){
         addFieldArchetype(CODIGO_BANCO_TRAILER, new FieldStringFixedLengthArchetype(3));
         addFieldArchetype(CODIGO_LOTE_TRAILER, new FieldIntegerFixedLengthArchetype(4));
         addFieldArchetype(TIPO_REGISTRO_TRAILER, new FieldDefaultArchetype("5"));
         addFieldArchetype(BRANCOS_REGISTRO_TRAILER_ARQUIVO, new FieldFillerArchetype(9, ' '));
         addFieldArchetype(TOTAL_LOTES_REGISTROS, new FieldIntegerFixedLengthArchetype(6));
         addFieldArchetype(VALOR_TOTAL_LOTE, new FieldDecimalFixedLengthArchetype(15,2));
         addFieldArchetype(USO_FEBRABAN, new FieldFillerArchetype(217, ' '));
    }
}

