package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 07/04/2014 17:20:38
 * @author Cesário
 */

//3.1.2.2 - Registro Trailer de Arquivo
public class LineCnabCaixaEconomicaTrailerArquivo extends LineArchetype{

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
     * DEFAULT 9999 <br>
     * POSICAO 004 007 <br>
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    
    /**
     * 03 <br>
     * Tipo de Registro <br>
     * DEFAULT 9 <br>
     * POSICAO 008 008 <br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    
    /**
     * 04 <br>
     * Uso Exclusivo FEBRABAN/CNAB <br>
     * DEFAULT BRANCOS <br>
     * POSICAO 009 017 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";
    
    /**
     * 05 <br>
     * Quantidade de Lotes do Arquivo <br>
     *  <br>
     * POSICAO 018 023 <br>
     */
    public static final String QUANTIDE_LOTES_ARQUIVO = "QUANTIDE_LOTES_ARQUIVO";
    
    /**
     * 06 <br>
     *Quantidade de Registros do Arquivo <br>
     *  <br>
     * POSICAO 018 023 <br>
     */
    public static final String QUANTIDE_REGISTROS_ARQUIVO = "QUANTIDE_REGISTROS_ARQUIVO";
    
    /**
     * 07 <br>
     * Uso Exclusivo FEBRABAN/CNAB <br>
     * DEFAULT BRANCOS <br>
     * POSICAO 030 035 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";
    
    /**
     * 08 <br>
     * Uso Exclusivo FEBRABAN/CNAB <br>
     * DEFAULT BRANCOS <br>
     * POSICAO 036 0240 <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN3 = "USO_EXCLUSIVO_FEBRABAN3";
    
    public LineCnabCaixaEconomicaTrailerArquivo(){
        setName("CNAB - Arquivo Header - v240 - Remessa");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldIntegerFixedLengthArchetype(1));
        //04
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(9,' '));
        //05
        addFieldArchetype(QUANTIDE_LOTES_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //06
        addFieldArchetype(QUANTIDE_REGISTROS_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
        //07
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(6,' '));
        //08
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN3, new FieldFillerArchetype(205, ' '));
    }
}
