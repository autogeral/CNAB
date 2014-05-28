
package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/04/2014 11:12:11
 * @author Cesário
 */

//Registro Detalhe - Segmento Y (Opcional - Remessa)
public class LineCnabCaixaEconomicaDetalheSegmentoY08RemessaRetorno extends LineArchetype{
    
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
     * POSICAO 004 007 <br>
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    
    /**
     * 03 <br>
     * Tipo de Registro <br>
     * DEFAULT 3 <br>
     * POSICAO 008 008 <br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    
    /**
     * 04 <br>
     * Nº do Registro <br>
     * POSICAO 009 013 <br>
     */
    public static final String NUMERO_SEQUENCIAL_REG_LOTE = "NUMERO_SEQUENCIAL_REG_LOTE";
    
    /**
     * 05 <br>
     * Segmento <br>
     * POSICAO 014 014 tamanho 1 alfaNumérico default 'Y' <br>
     */
    public static final String SEGMENTO = "SEGMENTO";
    
    /**
     * 06 <br>
     * cnab <br>
     * POSICAO 015 015 tamanho 2 alfaNumerico default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN = "USO_EXCLUSIVO_FEBRABAN";
    
    /**
     * 07 <br>
     * Cód. Mov. <br>
     * Código de Movimento Remessa <br>
     * POSICAO 016 017  tamanho 2 numerico <br>
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";
    
    /**
     * 08 <br>
     * Cod. Reg. Opcional <br>
     * Identificação Registro Opcional <br>
     * POSICAO 018 019 <br> 
     * tamanho 2 default '08'Numérico 
     */
    public static final String IDENTIFICACAO_REGISTRO_OPCIONAL = "IDENTIFICACAO_REGISTRO_OPCIONAL";
    
    /**
     * 09 <br>
     * Codigo da solicitação <br>
     * Identificação Registro Opcional <br>
     * POSICAO 020 021 <br>
     * tamanho 2 Numérico
     */
    public static final String SOLICITACAO_CODIGO = "SOLICITACAO_CODIGO";
    
    /**
     * 10 <br>
     * ID Número Identificador <br>
     * IID Número Identificador <br>
     * POSICAO 022 022 <br>
     * tamanho 1 Numérico
     */
    public static final String IDENTIFICADOR_NUMERO_ID = "IDENTIFICADOR_NUMERO_ID";
    
    /**
     * 11 <br>
     *  Número Identificador da Solicitação <br>
     * Número Identificador da Solicitação<br>
     * POSICAO 023 040 <br>
     * tamanho 18 Numérico
     */
    public static final String IDENTIFICADOR_NUMERO = "IDENTIFICADOR_NUMERO";
    
    /**
     * 12 <br>
     * Descrição da Solicitação<br>
     * Descrição da Solicitação<br>
     * POSICAO 041 0200 <br>
     * tamanho 160 alfaNumérico
     */
    public static final String DESCRICAO_SOLICITACAO = "DESCRICAO_SOLICITACAO";
    
    /**
     * 13 <br>
     * Quantidade S0olicitaca<br>
     * Quantidade solicitada<br>
     * POSICAO 0201 0204 <br>
     * tamanho 4 Numérico
     */
    public static final String QUANTIDADE_SOLICITADA = "QUANTIDADE_SOLICITADA";
    
    /**
     * 14 <br>
     * Código do Erro<br>
     * Código do Erro<br>
     * POSICAO 0205 0207 <br>
     * tamanho 3 Numérico
     */
    public static final String ERRO_CODIGO = "ERRO_CODIGO";
    
    /**
     * 15 <br>
     *Uso Exclusivo FEBRABAN/CNAB<br>
     * Uso Exclusivo FEBRABAN/CNAB<br>
     * POSICAO 0208 0240 <br>
     * tamanho 32 AlfaNumérico default ' '
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";

    public LineCnabCaixaEconomicaDetalheSegmentoY08RemessaRetorno() {
         setName("CNAB -Registro Detalhe - Segmento Y-08 (Opcional - Remessa/Retorno Serviços)");
         //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'3'));
        //04
        addFieldArchetype(NUMERO_SEQUENCIAL_REG_LOTE, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(SEGMENTO, new FieldIntegerFixedLengthArchetype(5));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldDefaultArchetype("40"));        
        //08
        addFieldArchetype(IDENTIFICACAO_REGISTRO_OPCIONAL, new FieldDefaultArchetype("08"));
        //09
        addFieldArchetype(SOLICITACAO_CODIGO, new FieldIntegerFixedLengthArchetype(2));
        //10
        addFieldArchetype(IDENTIFICADOR_NUMERO_ID, new FieldIntegerFixedLengthArchetype(1));
        //11
        addFieldArchetype(IDENTIFICADOR_NUMERO, new FieldIntegerFixedLengthArchetype(18));
        //12
        addFieldArchetype(DESCRICAO_SOLICITACAO, new FieldStringFixedLengthArchetype(160));
        //13
        addFieldArchetype(QUANTIDADE_SOLICITADA, new FieldIntegerFixedLengthArchetype(4));
        //14
        addFieldArchetype(ERRO_CODIGO, new FieldIntegerFixedLengthArchetype(3));
        //15
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldIntegerFixedLengthArchetype(32));
    }
    
    
}
