package br.com.jcomputacao.cnab.t240.v040.cobranca;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240TrailerLoteCobranca extends LineArchetype{


    /**
     * CODIGO DO BANCO NA COMPENSAÇÃO<br> POSIÇÃO: 1 a 3<br> FORMATO: NUM<br>
     * DEFAULT: '001'
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * LOTE DE SERVICO<br> POSIÇÃO: 4 a 7<br> FORMATO: NUM
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    /**
     * TIPO DE REGISTRO<br> POSIÇÃO: 8 a 8<br> FORMATO: NUM<br> DEFAULT: '5'
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * USO EXCLUSIVO DA FEBRABAN<br> POSIÇÃO: 9 a 17<br> FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * QUANTIDADE DE REGISTROS NO LOTE POSIÇÃO: 18 a 23<br> FORMATO: NUM<br>
     */
    public static final String QTDE_REGISTROS_LOTE = "QTDE_REGISTROS_LOTE";
    /**
     * COBRANÇA SIMPLES - QUANTIDADE DE TÍTULOS POSIÇÃO: 24 a 29<br> FORMATO:
     * NUM<br>
     */
    public static final String QTDE_TITULOS_COBRANCA_SIMPLES = "QTDE_TITULOS_COBRANCA_SIMPLES";
    /**
     * COBRANÇA SIMPLES - VALOR TOTAL DOS TÍTULOS POSIÇÃO: 30 a 46<br> FORMATO:
     * NUM<br> DEC: 2
     */
    public static final String VALOR_TOTAL_TITULOS_COBRANCA_SIMPLES = "VALOR_TOTAL_TITULOS_COBRANCA_SIMPLES";
    /**
     * COBRANÇA VINCULADA - QUANTIDADE DE TÍTULOS POSIÇÃO: 47 a 52<br> FORMATO:
     * NUM<br>
     */
    public static final String QTDE_TITULOS_COBRANCA_VINCULADA = "QTDE_TITULOS_COBRANCA_VINCULADA";
    /**
     * COBRANÇA VINCULADA - VALOR TOTAL DOS TÍTULOS POSIÇÃO: 53 a 69<br>
     * FORMATO: NUM<br> DEC: 2
     */
    public static final String VALOR_TOTAL_TITULOS_COBRANCA_VINCULADA = "VALOR_TOTAL_TITULOS_COBRANCA_VINCULADA";
    /**
     * COBRANÇA CAUCIONADA - QUANTIDADE DE TÍTULOS POSIÇÃO: 70 a 75<br> FORMATO:
     * NUM<br>
     */
    public static final String QTDE_TITULOS_COBRANCA_CAUCIONADA = "QTDE_TITULOS_COBRANCA_CAUCIONADA";
    /**
     * COBRANÇA CAUCIONADA - VALOR TOTAL DOS TÍTULOS POSIÇÃO: 76 a 92<br>
     * FORMATO: NUM<br> DEC: 2
     */
    public static final String VALOR_TOTAL_TITULOS_COBRANCA_CAUCIONADA = "VALOR_TOTAL_TITULOS_COBRANCA_CAUCIONADA";
    /**
     * COBRANÇA DESCONTADA - QUANTIDADE DE TÍTULOS POSIÇÃO: 93 a 98<br> FORMATO:
     * NUM<br>
     */
    public static final String QTDE_TITULOS_COBRANCA_DESCONTADA = "QTDE_TITULOS_COBRANCA_DESCONTADA";
    /**
     * COBRANÇA DESCONTADA - VALOR TOTAL DOS TÍTULOS POSIÇÃO: 99 a 115<br>
     * FORMATO: NUM<br> DEC: 2
     */
    public static final String VALOR_TOTAL_TITULOS_COBRANCA_DESCONTADA = "VALOR_TOTAL_TITULOS_COBRANCA_DESCONTADA";
    /**
     * NÚMERO DO AVISO DE LANÇAMENTO POSIÇÃO: 116 a 123<br> FORMATO: ALFA<br>
     */
    public static final String NUMERO_AVISO = "NUMERO_AVISO";
    /**
     * USO EXCLUSIVO DA FEBRABAN<br> POSIÇÃO: 124 a 240<br> FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240TrailerLoteCobranca() {
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        //04
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(9, ' '));
        //05
        addFieldArchetype(QTDE_REGISTROS_LOTE, new FieldIntegerFixedLengthArchetype(6));
        //06
        addFieldArchetype(QTDE_TITULOS_COBRANCA_SIMPLES, new FieldIntegerFixedLengthArchetype(6));
        //07
        addFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_SIMPLES, new FieldDecimalFixedLengthArchetype(15, 2));
        //08
        addFieldArchetype(QTDE_TITULOS_COBRANCA_VINCULADA, new FieldIntegerFixedLengthArchetype(6));
        //09
        addFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_VINCULADA, new FieldDecimalFixedLengthArchetype(15, 2));
        //10
        addFieldArchetype(QTDE_TITULOS_COBRANCA_CAUCIONADA, new FieldIntegerFixedLengthArchetype(6));
        //11
        addFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_CAUCIONADA, new FieldDecimalFixedLengthArchetype(15, 2));
        //12
        addFieldArchetype(QTDE_TITULOS_COBRANCA_DESCONTADA, new FieldIntegerFixedLengthArchetype(6));
        //13
        addFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_DESCONTADA, new FieldDecimalFixedLengthArchetype(15, 2));
        //14
        addFieldArchetype(NUMERO_AVISO, new FieldFillerArchetype(8, ' '));
        //15
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(117, ' '));
    }
}
