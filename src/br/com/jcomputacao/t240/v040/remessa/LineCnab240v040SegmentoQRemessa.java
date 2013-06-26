package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240SegmentoQ;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040SegmentoQRemessa extends LineCnab240SegmentoQ {

    /**
     * IDENTIFICADOR DE CARNE <br>
     * POSICAO 210 212 <br> 
     * TIPO NUM  <br>
     * NOTA 28  <br>
     * 000 - NÃO POSSUI CARNÊ <br>
     * 001 - POSSUI CARNÊ <br>
     */
    public static final String IDENTIFICADOR_CARNE = "IDENTIFICADOR_CARNE";
    /**
     * SEQUENCIAL DA PARCELA OU NÚMERO INICIAL DA PARCELA  <br>
     * POSICAO 213 215  <br>
     * NOTA 28 <br>
     */
    public static final String NUMERO_SEQUENCIA_PARCELA = "NUMERO_SEQUENCIA_PARCELA";

    /**
     * QUANTIDADE TOTAL DE PARCELAS <br>
     * POSICAO 216 218 <br>
     * TIPO NUM <br>
     * NOTA 28 <br>
     */
    public static final String QUANTIDADE_TOTAL_PARCELAS = "QUANTIDADE_TOTAL_PARCELAS";
    
    /**
     * NÚMERO DO PLANO <br>
     * POSICAO 219 221 <br>
     * TIPO NUM <br>
     * NOTA 28 <br>
     */
    public static final String NUMERO_PLANO = "NUMERO_PLANO";
    
    /**
     * RESERVADO (USO BANCO) <br>
     * POSICAO 222 240 <br>
     * TIPO ALFA <br>
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    
    public LineCnab240v040SegmentoQRemessa() {
        removeFieldArchetype(CODIGO_BANCO_CORRESP);
        removeFieldArchetype(NOSSO_NUMERO_BANCO_CORRESP);
        removeFieldArchetype(CAMPO_EXCLUSIVO_CNAB);

        //01
        addFieldArchetype(IDENTIFICADOR_CARNE, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(NUMERO_SEQUENCIA_PARCELA, new FieldIntegerFixedLengthArchetype(3));
        //03
        addFieldArchetype(QUANTIDADE_TOTAL_PARCELAS, new FieldIntegerFixedLengthArchetype(3));
        //04
        addFieldArchetype(NUMERO_PLANO, new FieldIntegerFixedLengthArchetype(3));
        //05
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(19, ' '));
    }
}
