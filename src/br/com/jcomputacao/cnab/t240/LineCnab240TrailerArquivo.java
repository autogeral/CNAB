package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author David
 */
public class LineCnab240TrailerArquivo extends LineArchetype{

    /**
     * CODIGO DO BANCO NA COMPENSACAO<br>
     * POSICAO: 1 a 3<br>
     * FORMATO: NUM
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";

    
    /**
     * LOTE DE SERVICO + TIPO DE REGISTRO (CAMPOS AGRUPADOS)<BR>
     * POSICAO: 4 a 8<br>
     * FORMATO: NUM<br>
     * DEFAULT: '99999'
     */
    public static final String LOTE_TIPO_REGISTRO = "LOTE_TIPO_REGISTRO";
     
    /**
     * USO EXCLUSIVO FEBRABAN<br>
     * POSIÇÃO: 9 a 17<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * QUANTIDADE DE LOTES DO ARQUIVO<br>
     * POSIÇÃO: 18 a 23<br>
     * FORMATO: NUM
     */
     public static final String QTDE_LOTES_ARQUIVO = "QTDE_LOTES_ARQUIVO";

    /**
     * QUANTIDADE DE REGISTROS DO ARQUIVO<br>
     * POSICÃO: 24 a 29<br>
     * FORMATO: NUM
     */
     public static final String QTDE_REGISTROS_ARQUIVO = "QTDE_REGISTROS_ARQUIVO";

    /**
     * QTDE DE CONTAS PARA CONC.<br>
     * POSICÃO: 30 a 35<br>
     * FORMATO: NUM
     */
     public static final String QTDE_CONTAS_CONCIL = "QTDE_CONTAS_CONCIL";
     
    /**
     * USO EXCLUSIVO FEBRABAN<br>
     * POSIÇÃO: 36 a 240<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240TrailerArquivo(){
        //01
         addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
         //new FieldDefaultArchetype("99999") - não é adequado para a leitura do arquivo
         //02 e 03
         addFieldArchetype(LOTE_TIPO_REGISTRO, new FieldDefaultArchetype("99999"));
         //04
         addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(9, ' '));
         //05
         addFieldArchetype(QTDE_LOTES_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
         //06
         addFieldArchetype(QTDE_REGISTROS_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
         //07
         FieldIntegerFixedLengthArchetype fa = new FieldIntegerFixedLengthArchetype(6);
         fa.setAcceptNullable(true);
         addFieldArchetype(QTDE_CONTAS_CONCIL, fa);
         //08
         addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(205, ' '));
    }
}
