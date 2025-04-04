package br.com.jcomputacao.cnab.t240.v040.cobranca;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 25/08/2024 11:18:22
 *
 * @author murilo
 */
public class LineCnab240v040SegmentoY extends LineArchetype {

    /**
     * VERSÃO 040
     */

    /**
     * CODIGO DO BANCO - DEFAULT 001 POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * CODIGO DO LOTE LOTE DE SERVICO POSICAO 004 007
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * TIPO DE REGISTRO - DEFAULT 3 REGISTRO HEADER DO LOTE POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE TIPO DE OPERACAO POSICAO 009
     * 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014 CONTEUDO 'U'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * CODIGO DO SERVICO IDENTIFICACAO DO TIPO DE SERVICO POSICAO 015 015
     * CONTEUDO ' '
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * CODIGO DE MOVIMENTO DE RETORNO POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
    
    /**
     * IDENTIFICACAO REGISTRO OPCIONAL 018 019
     */
    public static final String IDENTIFICACAO_REGISTRO_OPCIONAL = "IDENTIFICACAO_REGISTRO_OPCIONAL";
    
    /**
     * IDENTIFICACAO DO CHEQUE 020 - 053
     */
    public static final String IDENTIFICACAO_DO_CHEQUE_01 = "IDENTIFICACAO_DO_CHEQUE_01";
    /**
     * IDENTIFICACAO DO CHEQUE 054 - 087
     */
    public static final String IDENTIFICACAO_DO_CHEQUE_02 = "IDENTIFICACAO_DO_CHEQUE_02";
    /**
     * IDENTIFICACAO DO CHEQUE 088 - 0121
     */
    public static final String IDENTIFICACAO_DO_CHEQUE_03 = "IDENTIFICACAO_DO_CHEQUE_03";
    /**
     * IDENTIFICACAO DO CHEQUE 122 - 155
     */
    public static final String IDENTIFICACAO_DO_CHEQUE_04 = "IDENTIFICACAO_DO_CHEQUE_04";
    /**
     * IDENTIFICACAO DO CHEQUE 156 - 189
     */
    public static final String IDENTIFICACAO_DO_CHEQUE_05 = "IDENTIFICACAO_DO_CHEQUE_05";
    /**
     * IDENTIFICACAO DO CHEQUE 190 - 223
     */
    public static final String IDENTIFICACAO_DO_CHEQUE_06 = "IDENTIFICACAO_DO_CHEQUE_06";
    

    public LineCnab240v040SegmentoY() {

//*****************************Registro Header de Lote****************************************
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("Y"));
        //06
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(1, ' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        
        addFieldArchetype(IDENTIFICACAO_REGISTRO_OPCIONAL, new FieldIntegerFixedLengthArchetype(4));
        
        addFieldArchetype(IDENTIFICACAO_DO_CHEQUE_01, new FieldStringFixedLengthArchetype(34));
        
        addFieldArchetype(IDENTIFICACAO_DO_CHEQUE_02, new FieldStringFixedLengthArchetype(34));
        
        addFieldArchetype(IDENTIFICACAO_DO_CHEQUE_03, new FieldStringFixedLengthArchetype(34));
        
        addFieldArchetype(IDENTIFICACAO_DO_CHEQUE_04, new FieldStringFixedLengthArchetype(34));
        
        addFieldArchetype(IDENTIFICACAO_DO_CHEQUE_05, new FieldStringFixedLengthArchetype(34));
        
        addFieldArchetype(IDENTIFICACAO_DO_CHEQUE_06, new FieldStringFixedLengthArchetype(34));
    }

}
