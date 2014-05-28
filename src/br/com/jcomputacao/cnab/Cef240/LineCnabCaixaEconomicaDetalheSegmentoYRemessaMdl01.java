
package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;


/**
 * 19/04/2014 11:12:11
 * @author Cesário
 */

//Registro Detalhe - Segmento Y (Opcional - Remessa)
public class LineCnabCaixaEconomicaDetalheSegmentoYRemessaMdl01 extends LineCnabCaixaEconomicaDetalheSegmentoYRemessa{
    
     /**
     * 10 <br>
     * Telefone do Cedente<br>
     * DDD Codigo <br>
     * POSICAO 021 023 
     * tamanho 3<br>
     */
    public static final String CEDENTE_TELEFONE_DDD = "CEDENTE_TELEFONE_DDD";
    
    /**
     * 11 <br>
     * Telefone do Cedente<br>
     * NUMERO TELEFONE <br>
     * POSICAO 024 033 <br>
     * * tamanho 10<br>
     */   
    public static final String CEDENTE_TELEFONE = "CEDENTE_TELEFONE";
    
    /**
     * 12 <br>
     * Telefone do Sacado<br>
     * DDD TELEFONE <br>
     * POSICAO 034 036 <br>
     * * tamanho 3<br>
     */
    public static final String SACADO_TELEFONE_DDD = "SACADO_TELEFONE_DDD";
    
    /**
     * 13 <br>
     * Telefone do Sacado<br>
     * sacado TELEFONE <br>
     * POSICAO 037 046 <br>
     * * tamanho 10<br>
     */
    public static final String SACADO_TELEFONE = "SACADO_TELEFONE";
    
     /**
     * 14 <br>
     * Telefone do Avalista<br>
     * DDD TELEFONE <br>
     * POSICAO 047 049 <br>
     * * tamanho 3<br>
     */
    public static final String AVALISTA_TELEFONE_DDD = "AVALISTA_TELEFONE_DDD";
    
    /**
     * 15 <br>
     * Telefone do Avalista<br>
     * Avalista TELEFONE <br>
     * POSICAO 050 059 <br>
     * * tamanho 10<br>
     */
    public static final String AVALISTA_TELEFONE = "AVALISTA_TELEFONE";
    
    /**
     * 16 <br>
     * Codigo do documento<br>
     * POSICAO 060 074 <br>
     * * tamanho 15<br>
     */
    public static final String DOCUMENTO_CODIGO = "DOCUMENTO_CODIGO";
    
    /**
     * 17 <br>
     * ESPECIE do documento<br>
     * POSICAO 075 084 <br>
     * * tamanho 15<br>
     */
    public static final String DOCUMENTO_ESPECIE = "DOCUMENTO_ESPECIE";
    
    /**
     * 18 <br>
     * USO CNAB<br>
     * POSICAO 085 0240 <br>
     * * tamanho 156<br>
     */    
    public static final String USO_EXCLUSIVO_CNAB = "USO_EXCLUSIVO_CNAB";

    public LineCnabCaixaEconomicaDetalheSegmentoYRemessaMdl01() {
         setName("CNAB -Registro Detalhe - Segmento Y (Opcional - Modelo de Bloqueto 10 - Genérico Mod 01)");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'3'));
        //04
        addFieldArchetype(NUMERO_SEQUENCIAL_REG_LOTE, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(SEGMENTO, new FieldFillerArchetype(1,'Y'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(IDENTIFICACAO_REGISTRO_OPCIONAL, new FieldIntegerFixedLengthArchetype(2));
        //09
        addFieldArchetype(TIPO_REGISTRO_MODELO, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(CEDENTE_TELEFONE_DDD, new FieldIntegerFixedLengthArchetype(3));
        //11
        addFieldArchetype(CEDENTE_TELEFONE, new FieldIntegerFixedLengthArchetype(10));
        //12
        addFieldArchetype(SACADO_TELEFONE_DDD, new FieldIntegerFixedLengthArchetype(3));
        //13
        addFieldArchetype(SACADO_TELEFONE, new FieldIntegerFixedLengthArchetype(10));
        //14
        addFieldArchetype(AVALISTA_TELEFONE_DDD, new FieldIntegerFixedLengthArchetype(3));
        //15
        addFieldArchetype(AVALISTA_TELEFONE, new FieldIntegerFixedLengthArchetype(10));
        //16
        addFieldArchetype(DOCUMENTO_CODIGO, new FieldStringFixedLengthArchetype(15));
        //17
        addFieldArchetype(DOCUMENTO_ESPECIE, new FieldStringFixedLengthArchetype(10));
        //18
        addFieldArchetype(USO_EXCLUSIVO_CNAB, new FieldStringFixedLengthArchetype(156));
    }
    
    
}
