package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/04/2014 09:16:53 
 * @author Cesário
 * /

/**
 * Registro Detalhe - Segmento Q (Obrigatório - Remessa)<br>
 * para o Código de Movimento: 36, 37, 38 (Banco de Sacados)<br>
 * possui 5 campos  a mais correpondente ao Banco de Sacados * 
 */
public class LineCnabCaixaEconomicaDetalheSegmentoQRemessa2  extends LineArchetype {
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
     *17 "Banco de Sacados"<br>
     * -Número do Banco-     <br>
     *  154 a 156, tamanho 3 ,numérico<br>
     */
    public static final String SACADO_NUMERO_BANCO = "SACADO_NUMERO_BANCO";
    
    /**
     *18 "Banco de Sacados"<br>
     * -Nome do Banco-     <br>
     *  157 a 176, tamanho 20 ,Alfanumérico<br>
     */
    public static final String SACADO_NOME_BANCO = "SACADO_NOME_BANCO";
    
    /**
     *19 "Banco de Sacados"<br>
     * -Código do sacado do Banco-     <br>
     *  177 a 191, tamanho 15 ,Alfanumérico<br>
     */
    public static final String SACADO_CODIGO_BANCO = "SACADO_NOME_BANCO";
    
    /**
     *20 "Banco de Sacados"<br>
     * -Id Manutenção-     <br>
     *  192 a 192, tamanho 1 ,numérico<br>
     */
    public static final String SACADO_MANUTENCAO_ID = "SACADO_MANUTENCAO_ID";
    
    /**
     *21 "Banco de Sacados"<br>
     * -Valor do Título-     <br>
     *  193 a 207, tamanho 13 ,numérico DECIMAL PRECISAO 2<br>
     */
    public static final String VALOR_TITULO = "VALOR_TITULO";
    
    /**
     *22 "uso caixa"<br>
     * -Uso Exclusivo CAIXA-     <br>
     *  208 a 209, tamanho 2 ,Alfanumérico Default Brancos<br>
     */
    public static final String USO_EXCLUSIVO_CAIXA = "USO_EXCLUSIVO_CAIXA";
    
    /**
     *22 "uso FEBRABAN"<br>
     * -Uso Exclusivo FEBRABAN-     <br>
     *  210 a 240, tamanho 31 ,Alfanumérico Default Brancos<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";
    
    
    
 /**
 * Registro Detalhe - Segmento Q (Obrigatório - Remessa)<br>
 * para o Código de Movimento: 36, 37, 38 (Banco de Sacados)
 * possui 5 campos  a mais correpondente ao Banco de Sacados * 
 */
     public LineCnabCaixaEconomicaDetalheSegmentoQRemessa2() {
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
        addFieldArchetype(SACADO_NUMERO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //18
        addFieldArchetype(SACADO_NOME_BANCO, new FieldStringFixedLengthArchetype(20));
        //19
        addFieldArchetype(SACADO_CODIGO_BANCO, new FieldStringFixedLengthArchetype(15));
        //20
        addFieldArchetype(SACADO_MANUTENCAO_ID, new FieldIntegerFixedLengthArchetype(1));
        //21
        addFieldArchetype(VALOR_TITULO, new FieldDecimalMaximumLengthArchetype(15,2));
        //22
        addFieldArchetype(USO_EXCLUSIVO_CAIXA, new FieldFillerArchetype(2,' '));
        //22
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(31,' '));
     }
}
