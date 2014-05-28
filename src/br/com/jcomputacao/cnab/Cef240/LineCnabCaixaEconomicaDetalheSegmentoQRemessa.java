package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/04/2014 08:13:02
 * @author Cesário
 */

/**
 * Registro Detalhe - Segmento Q (Obrigatório - Remessa) 
 * 
 */
public class LineCnabCaixaEconomicaDetalheSegmentoQRemessa extends LineArchetype {

     /**
     * 1 <br>
     * CODIGO DO BANCO - DEFAULT 104 <br>
     * POSICAO 001 003<br>
     * tamanho 3<br>
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * 2-<br>
     * CODIGO DO LOTE<br>
     * LOTE DE SERVICO<br>
     * POSICAO 004 007<br>
     * tamanho 4<br>
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * 3<br>
     * TIPO DE REGISTRO - DEFAULT 3<br>
     * REGISTRO HEADER DO LOTE<br>
     * POSICAO 008 008<br>
     * tamanho 1<br>
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * 4<br>
     * SEQUENCIAL DE REGISTRO - NUMERICO<br>
     * POSICAO 009 013<br>
     * tamanho 5<br>
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * 5
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT Q<br>
     * POSICAO 014 014<br>
     * DEFAULT 'P'<br>
     * tamanho 1<br>
     */
    public static final String CODIGO_SEGMENTO_REGISTRO = "CODIGO_SEGMENTO_REGISTRO";

    /**
     * 6<br>
     * EXCLUSIVO FEBRABAN - BRANCOS<br>
     * IDENTIFICACAO DO TIPO DE SERVICO<br>
     * POSICAO 015 015<br>
     * DEFAULT ' '<br>
     * tamanho 1<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN1 = "USO_EXCLUSIVO_FEBRABAN1";
    
    /**
     * 7<br>
     * CODIGO DO MOVIMENTO DE REMESSA - NUMERICO<br>
     * Códigos de Movimento para Remessa tratados pelo Banco do Brasil:<br>
     * 01 – Entrada de títulos
     * 02 – Pedido de baixa
     * 04 – Concessão de Abatimento
     * 05 – Cancelamento de Abatimento
     * 06 – Alteração de Vencimento
     * 07 – Concessão de Desconto
     * 08 – Cancelamento de Desconto
     * 09 – Protestar
     * 10 – Cancela/Sustação da Instrução de protesto
     * 30 – Recusa da Alegação do Sacado
     * 31 – Alteração de Outros Dados
     * 40 – Alteração de Modalidade.
     * POSICAO 016 017<br>
     * 
     * tamanho 2
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";
    
    /**
     * 8 "Dados do Sacado"<br>
     *  -Inscrição-<br>
     * Tipo de Inscrição <br>
     *  18 a 18, tamanho 1 ,numérico<br>
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    
    /**
     * 9 "Dados do Sacado"<br>
     * -Inscrição-<br>
     * Numero de Inscrição <br>
     *  19 a 33, tamanho 15 ,numérico<br>
     */
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    
    /**
     *10 "Dados do Sacado"<br>
     * -Nome-     <br>
     *  34 a 73, tamanho 40 ,Alfanumérico<br>
     */
    public static final String NOME = "NOME";
    
    /**
     *11 "Dados do Sacado"<br>
     * -ENDEREÇO-     <br>
     *  74 a 113, tamanho 40 ,Alfanumérico<br>
     */
    public static final String ENDERECO = "ENDERECO";
    
    /**
     *12 "Dados do Sacado"<br>
     * -BAIRRO-     <br>
     *  114 a 128, tamanho 15 ,Alfanumérico<br>
     */
    public static final String BAIRRO = "BAIRRO";
    
    /**
     *13 "Dados do Sacado"<br>
     * -CEP-     <br>
     *  129 a 133, tamanho 5 ,numérico<br>
     */
    public static final String CEP = "CEP";
    
    /**
     *14 "Dados do Sacado"<br>
     * -SULFIXO DO CEP-     <br>
     *  134 a 136, tamanho 3 ,numérico<br>
     */
    public static final String SULFIXOCEP = "SULFIXOCEP";
    
    /**
     *15 "Dados do Sacado"<br>
     * -CIDADE-     <br>
     *  137 a 151, tamanho 15 ,Alfanumérico<br>
     */
    public static final String CIDADE = "CIDADE";
    
    /**
     *16 "Dados do Sacado"<br>
     * -UF-     <br>
     *  152 a 153, tamanho 2 ,Alfanumérico<br>
     */
    public static final String UF = "UF";
    
    /**
     *17 "SACADOR /AVALISTA"<br>
     * INSCRIÇÃO<br>
     * -INSCRICAO_TIPO-     <br>
     *  154 a 154, tamanho 1 ,numérico<br>
     */
    public static final String INSCRICAO_TIPO = "INSCRICAO_TIPO";
    
    /**
     *18 "SACADOR /AVALISTA"<br>
     * NUMERO DE INSCRICAO DO SACADOR/AVALISTA<br>
     * NUMERO_INSCRICAO-     <br>
     *  155 a 169, tamanho 15 ,numérico<br>
     */
    public static final String NUMERO_INSCRICAO_SAC = "NUMERO_INSCRICAO_SAC";
    
    /**
     *19 "SACADOR /AVALISTA"<br>
     * NOME DO SACADOR/AVALISTA<br>
     * NOME_SACADOR-     <br>
     *  170 a 209, tamanho 40 ,Alfanumérico<br>
     */
    public static final String NOME_SACADOR = "NOME_SACADOR";
    
    /**
     *20 Banco correspondente<br>
     * Cód. Bco. Corresp. na Compensação<br>
     * BANCO_CORRESP_COD-     <br>
     *  210 a 212, tamanho 3 ,numérico<br>
     */
    public static final String BANCO_CORRESP_COD = "BANCO_CORRESP_COD";
    
    /**
     *21 Nosso Numero Banco correspondente<br>
     * Nosso Numero Bco. Corresp. <br>
     * BANCO_CORRESP_NOSSO_NUMERO-     <br>
     *  213 a 232, tamanho 20 ,Alfanumérico<br>
     */
    public static final String BANCO_CORRESP_NOSSO_NUMERO = "BANCO_CORRESP_NOSSO_NUMERO";
    
    /**
     *22 CNAB<br>
     * CNAB USO FEBRABAN<br>
     * USO_EXCLUSIVO_FEBRABAN-     <br>
     *  233 a 240, tamanho 8 ,Alfanumérico DEFAULT BRANCOS<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";
    
     public LineCnabCaixaEconomicaDetalheSegmentoQRemessa() {
        setName("CNAB - Registro Detalhe - Segmento Q (Obrigatório - Remessa)");
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'3'));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldFillerArchetype(1,'Q'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //09
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(15));
        //10
        addFieldArchetype(NOME, new FieldStringFixedLengthArchetype(40));
        //11
        addFieldArchetype(ENDERECO, new FieldStringFixedLengthArchetype(40));
        //12
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(15));
        //13
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(5));
        //14
        addFieldArchetype(SULFIXOCEP, new FieldIntegerFixedLengthArchetype(3));
        //15
        addFieldArchetype(CIDADE, new FieldStringFixedLengthArchetype(15));
        //16
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        //17
        addFieldArchetype(INSCRICAO_TIPO, new FieldIntegerFixedLengthArchetype(1));
        //18
        addFieldArchetype(NUMERO_INSCRICAO_SAC, new FieldStringFixedLengthArchetype(15));
        //19
        addFieldArchetype(NOME_SACADOR, new FieldStringFixedLengthArchetype(40));
        //20
        addFieldArchetype(BANCO_CORRESP_COD, new FieldIntegerFixedLengthArchetype(3));
        //21
        addFieldArchetype(BANCO_CORRESP_NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));
        //22
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(8,' '));
        
        
     }
    
}
