package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.cnab.t240.LineCnab240SegmentoS;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040SegmentoSRemessa extends LineCnab240SegmentoS {

    /**
     * IMPRESSÃO TIPO 1 - 01 <br>
     * NÚMERO DA LINHA A SER IMPRESSA <br>
     * POSICAO 019 020 <br>
     * TIPO NUM <br>
     * NOTA 35 <br>
     * CAMPO DESTINADO A INFORMAÇÃO DA LINHA NO QUAL SERÁ IMPRESSO A MENSAGEM 'CÓDIGO 1' (01 A 22)
     */
    public static final String NUMERO_LINHA_IMPRESSA = "NUMERO_LINHA_IMPRESSA";
    
    /**
     * IMPRESSÃO TIPO 1 - 02 <br>
     * MENSAGEM PARA O RECIBO DO SACADO <br>
     * POSICAO 021 021 <br>
     * TIPO NUM <br>
     * NOTA 36 <br>
     * 2. MENSAGEM COMUM PARA TODOS OS TÍTULOS DO MOVIMENTO <br>
     * 4. MENSAGEM PARA UM TÍTULO, A QUAL ESTÁ RELACIONADA AO REGISTRO DETALHE (TÍTULO ANTERIOR) <br>
     */
    public static final String MENSAGEM_PARA_RECIBO_SACADO = "MENSAGEM_PARA_RECIBO_SACADO";
    
    /**
     * IMPRESSÃO TIPO 1 - 03 <br>
     * MENSAGEM A SER IMPRESSA <br>
     * POSICAO 022 121 <br>
     * TIPO ALFA
     */
    public static final String MENSAGEM_IMPRESSA = "MENSAGEM_IMPRESSA";
    
    /**
     * IMPRESSÃO TIPO 1 - 04 OU  IMPRESSÃO TIPO 2 - 04 <br>
     * RESRVADO (USO BANCO) <br>
     * TIPO 1 - POSICAO 122 240 <br>
     * TIPO 2 - POSICAO 219 240
     * TIPO ALFA <br>
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    
    /**
     * IMPRESSÃO TIPO 2 - 01 <br>
     * MENSAGEM 5 <br>
     * POSICAO 019 058 <br>
     * TIPO ALFA <br>
     */
    public static final String MENSAGEM_5 = "MENSAGEM_5";
    
    /**
     * IMPRESSÃO TIPO 2 - 02 <br>
     * MENSAGEM 6 <br>
     * POSICAO 059 098 <br>
     * TIPO ALFA <br>
     */
    public static final String MENSAGEM_6 = "MENSAGEM_6";
    
    /**
     * IMPRESSÃO TIPO 2 - 03 <br>
     * MENSAGEM 7 <br>
     * POSICAO 099 138 <br>
     * TIPO ALFA <br>
     */
    public static final String MENSAGEM_7 = "MENSAGEM_7";
    
    /**
     * IMPRESSÃO TIPO 2 - 04 <br>
     * MENSAGEM 8 <br>
     * POSICAO 139 178 <br>
     * TIPO ALFA <br>
     */
    public static final String MENSAGEM_8 = "MENSAGEM_8";
    
    /**
     * IMPRESSÃO TIPO 2 - 05 <br>
     * MENSAGEM 9 <br>
     * POSICAO 179 218 <br>
     * TIPO ALFA <br>
     */
    public static final String MENSAGEM_9 = "MENSAGEM_9";
    
    public LineCnab240v040SegmentoSRemessa() {
        setName("CNAB - Segmento S");
        removeFieldArchetype(NUMERO_LINHA);
        removeFieldArchetype(MENSAGEM);
        removeFieldArchetype(TIPO_FONTE);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);    
    }
}
