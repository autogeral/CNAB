package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2012 10:47:46
 *
 * @author Murilo
 */
public class LineCnab240SegmentoN extends LineArchetype {

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
     * POSICAO 014 014 CONTEUDO 'N'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * G060
     * '0' = Indica INCLUSAO
     * '3' = Indica ESTORNO (somente para retorno)
     * '5' = Indica ALTERACAO
     * '9' = Indica EXCLUSAO
     */    
    public static final String TIPO_MOVIMENTO = "TIPO_MOVIMENTO";
    /**
     * G061
     * '00' = Inclusao de Registro Detalhe Liberado
     * '09' = Inclusao do Registro Detalhe Bloqueado
     * '10' = Alteracao do Pagamento Liberado para Bloqueado (Bloqueio)
     * '11' = Alteracao do Pagamento Bloqueado para Liberado (Liberacao)
     * '19' = Alteracao da Data de Pagamento
     * '33' = Estorno por Devolucao da Camara Centralizadora (somente para Tipo de Movimento = '3')
     * '99' = Exclusao do Registro Detalhe Incluido Anteriormente
     */
    public static final String CODIGO_MOVIMENTO = "CODIGO_MOVIMENTO";
    public static final String SEU_NUMERO = "SEU_NUMERO";
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    public static final String CONTRIBUINTE = "CONTRIBUINTE";
    public static final String DATA_PAGAMENTO = "DATA_PAGAMENTO";
    public static final String VALOR_PAGAMENTO = "VALOR_PAGAMENTO";
    public static final String OCORRENCIAS = "OCORRENCIAS";
    /**
     * Código da Receita do Tributo</br>
     * Identifica o código de receita do tributo / imposto. Este código deve ser obtido nas agências da Secretaria da Receita Federal ou através do site http://www.receita.fazenda.gov.br. Para a GPS deve ser obtido através do “Manual de Preenchimento da GPS”, que pode ser encontrado no site do INSS através do endereço http://www.mpas.gov.br.</br>
     * Observação: Para situações em que a empresa está enquadrada no “SIMPLES” para pagamento de DARF, o código da Receita é único (“6106”)</br>
     */
    public static final String RECEITA = "RECEITA";
    public static final String TIPO_IDENTIFICACAO_CONTRIBUINTE = "TIPO_IDENTIFICACAO_CONTRIBUINTE";
    public static final String IDENTIFICACAO_CONTRIBUINTE = "IDENTIFICACAO_CONTRIBUINTE";
        /**
     * Código de Identificação do Tributo</br>
     * Sugestão : Utilizar os mesmos códigos de Forma de Lançamento Tributos Federais</br>
     * • ‘16’ = Tributo - DARF Normal</br>
     * • ‘18’ = Tributo - DARF Simples</br>
     * • ‘17’ = Tributo - GPS (Guia da Previdência Social)</br>
     * • ‘21’ = Tributo – DARJ</br>
     * • ‘25’ = Tributo – IPVA</br>
     * • ‘26’ = Tributo – Licenciamento</br>
     * • ‘27’ = Tributo – DPVAT</br>
     * Tributos Estaduais:</br>
     * • ‘22’ = Tributo - GARE-SP ICMS</br>
     * • ‘23’ = Tributo - GARE-SP DR</br>
     * • ‘24’ = Tributo - GARE-SP ITCMD</br>
     * Tributos Municipais:</br>
     * • ‘19’ = Tributo - IPTU – Prefeituras
     */
    public static final String IDENTIFICACAO_TRIBUTO = "IDENTIFICACAO_TRIBUTO";
    
    public LineCnab240SegmentoN() {
        setName("CNAB 240v084 - Segmento N");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("N"));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(SEU_NUMERO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CONTRIBUINTE, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(DATA_PAGAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PAGAMENTO, new FieldDecimalFixedLengthArchetype(15, 2));
        //A definicao do N vai ate o valor do pagamento
        addFieldArchetype(RECEITA, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(TIPO_IDENTIFICACAO_CONTRIBUINTE, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(IDENTIFICACAO_CONTRIBUINTE, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(IDENTIFICACAO_TRIBUTO, new FieldIntegerFixedLengthArchetype(2));
    }
}
