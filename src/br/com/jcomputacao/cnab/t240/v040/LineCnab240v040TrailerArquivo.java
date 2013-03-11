package br.com.jcomputacao.cnab.t240.v040;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 08/11/2012 01:17:52
 * @author Murilo
 */
public class LineCnab240v040TrailerArquivo extends LineArchetype {
   
    /**
     * REGISTRO TRAILES DO ARQUIVO VERSÃO 040
     */
    
   /**
     * 01
     * CODIGO DO BANCO NA COMPENSACAO<br>
     * POSICAO: 1 a 3<br>
     * FORMATO: NUM
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";

    /**
     * 02
     * LOTE DE SERVICO + TIPO DE REGISTRO (CAMPOS AGRUPADOS)<BR>
     * POSICAO: 4 a 7<br>
     * FORMATO: NUM<br>
     */
    public static final String NUM_LOTE = "NUM_LOTE";
    
    /**
     * 03
     * LOTE DE SERVICO + TIPO DE REGISTRO (CAMPOS AGRUPADOS)<BR>
     * POSICAO: 4 a 7<br>
     * FORMATO: NUM<br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 04
     * RESERVADO USO BANCO<br>
     * POSIÇÃO: 8 a 8<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";

    /**
     * 05
     * QUANTIDADE DE LOTES DO ARQUIVO<br>
     * POSIÇÃO: 18 a 23<br>
     * FORMATO: NUM
     */
     public static final String QTDE_LOTES_ARQUIVO = "QTDE_LOTES_ARQUIVO";

    /**
     * 06
     * QUANTIDADE DE REGISTROS DO ARQUIVO<br>
     * POSICÃO: 24 a 29<br>
     * FORMATO: NUM
     */
     public static final String QTDE_REGISTROS_ARQUIVO = "QTDE_REGISTROS_ARQUIVO";        
    /**
     * RESERVADO USO BANCO<br>
     * POSIÇÃO: 36 a 240<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";

    public LineCnab240v040TrailerArquivo(){
         
         //01
         addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
         //02
         addFieldArchetype(NUM_LOTE, new FieldIntegerFixedLengthArchetype(4));
         //03
         addFieldArchetype(TIPO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
         //04
         addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(9, ' '));
         //05
         addFieldArchetype(QTDE_LOTES_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
         //06
         addFieldArchetype(QTDE_REGISTROS_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
         //07
         addFieldArchetype(RESERVADO_USO_BANCO2, new FieldFillerArchetype(211, ' '));
    }

}
