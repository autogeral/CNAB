/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/04/2014 13:49:55
 * @author Cesário
 */
//Registro Detalhe - Segmento U (Obrigatório - Retorno)
public class LineCnabCaixaEconomicaDetalheSegmentoURetorno extends LineArchetype{
    
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
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
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
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT S<br>
     * POSICAO 014 014<br>
     * DEFAULT 'U'<br>
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
     * 8<br>
     * Dados do Título
     * Acréscimos,Juros / Multa / Encargos<br>
     * POSICAO 018 032<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String JUROS_MULTA_ENCARGO = "JUROS_MULTA_ENCARGO";
    
    /**
     * 9<br>
     * Dados do Título
     * Vlr do Desconto,Valor do Desconto Concedido<br>
     * POSICAO 033 047<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_DESCONTO_CONCEDIDO = "VALOR_DESCONTO_CONCEDIDO";
    
    /**
     * 10<br>
     * Dados do Título
     * Vlr do Abatimento,Valor do Abat. Concedido/Cancel.<br>
     * POSICAO 048 062<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_ABATIMENTO_CONCEDIDO = "VALOR_ABATIMENTO_CONCEDIDO";
    
    /**
     * 11<br>
     * Dados do Título
     * Vlr Pago,Valor do IOF Recolhido.<br>
     * POSICAO 063 077<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_IOF_RECOLHIDO = "VALOR_IOF_RECOLHIDO";
    
     /**
     * 12<br>
     * Dados do Título
     * Vlr PAGO,Valor Pago pelo Sacado.<br>
     * POSICAO 078 092<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_PAGO_SACADO = "VALOR_PAGO_SACADO";
    
     /**
     * 13<br>
     * Dados do Título
     * Vlr LIQUIDO,Valor Líquido a ser Creditado.<br>
     * POSICAO 093 0107<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_LIQUIDO_CREDITAR = "VALOR_LIQUIDO_CREDITAR";
    
    /**
     * 14<br>
     * Outras Despesas
     * Vlr Outras Despesas.<br>
     * POSICAO 0108 0122<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_OUTRAS_DESPESAS = "VALOR_OUTRAS_DESPESAS";
    
    /**
     * 15<br>
     * Outros Créditos
     * Vlr Outros Créditos.<br>
     * POSICAO 0123 0137<br>     
     * tamanho 15 PRECISAO 2 Numérico<br>
     */
    public static final String VALOR_OUTROS_CREDITOS = "VALOR_OUTROS_CREDITOS";
    
    /**
     * 16<br>
     * Data da Ocorrência
     * Data da Ocorrência.<br>
     * POSICAO 0138 0145<br>     
     * tamanho 8 Numérico<br>
     */
    public static final String DATA_OCORRENCIA = "DATA_OCORRENCIA";
    
    /**
     * 17<br>
     * Data do Crédito
     * Data da Efetivação do Crédito.<br>
     * POSICAO 0146 0153<br>     
     * tamanho 8 Numérico<br>
     */
    public static final String DATA_EFETIVACAO_CREDITO = "DATA_EFETIVACAO_CREDITO";
    
    /**
     * 18<br>
     * Uso Exclusivo CAIXA
     * Uso Exclusivo CAIXA.<br>
     * POSICAO 0154 0157<br>     
     * tamanho 4 Numérico DEFAULT '0' <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";
    
    /**
     * 19<br>
     * Data do Débito da Tarifa
     * Data do Débito da Tarifa<br>
     * POSICAO 0158 0165<br>     
     * tamanho 8 Numérico  <br>
     */
    public static final String DATA_DEBITO_TARIFA = "DATA_DEBITO_TARIFA";
    
    /**
     * 20<br>
     * Código do SACADO
     * Código do Sacado no Banco<br>
     * POSICAO 0166 0180<br>     
     * tamanho 15 Numérico  <br>
     */
    public static final String CODIGO_SACADO_BANCO = "CODIGO_SACADO_BANCO";
    
     /**
     * 21<br>
     * Uso Exclusivo CAIXA
     * Uso Exclusivo CAIXA<br>
     * POSICAO 0181 0210<br>     
     * tamanho 30  DEFAULT '0' Numérico  <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN3 = "USO_EXCLUSIVO_FEBRABAN3";
    
    /**
     * 22<br>
     * Cód. Bco. Corr.
     * Cód. Banco Correspondente Compens.<br>
     * POSICAO 0211 0213<br>     
     * tamanho 3  Numérico  <br>
     */
    public static final String CODIGO_BANCO_CORRESPONDENTE_COMPENSACAO = "CODIGO_BANCO_CORRESPONDENTE_COMPENSACAO";
    
    /**
     * 23<br>
     * Nosso Nº Banco Correspondente.
     * Nosso Nº Banco Correspondente<br>
     * POSICAO 0214 0233<br>     
     * tamanho 20  Numérico  <br>
     */
    public static final String NOSSO_NUMERO_BANCO_CORRESPONDENTE_COMPENSACAO = "NOSSO_NUMERO_BANCO_CORRESPONDENTE_COMPENSACAO";
    
    /**
     * 24<br>
     * CNAB
     * Uso Exclusivo FEBRABAN/CNAB<br>
     * POSICAO 0234 0240<br>     
     * tamanho 7  AlfaNumérico ' '  <br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN4 = "USO_EXCLUSIVO_FEBRABAN4";

    public LineCnabCaixaEconomicaDetalheSegmentoURetorno() {
        setName("Registro Detalhe - Segmento U (Obrigatório - Retorno)");
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'3'));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldFillerArchetype(1,'U'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(JUROS_MULTA_ENCARGO, new FieldDecimalFixedLengthArchetype(15,2));
        //09
        addFieldArchetype(VALOR_DESCONTO_CONCEDIDO, new FieldDecimalFixedLengthArchetype(15,2));
        //10
        addFieldArchetype(VALOR_ABATIMENTO_CONCEDIDO, new FieldDecimalFixedLengthArchetype(15,2));
        //11
        addFieldArchetype(VALOR_IOF_RECOLHIDO, new FieldDecimalFixedLengthArchetype(15,2));
        //12
        addFieldArchetype(VALOR_PAGO_SACADO, new FieldDecimalFixedLengthArchetype(15,2));
        //13
        addFieldArchetype(VALOR_LIQUIDO_CREDITAR, new FieldDecimalFixedLengthArchetype(15,2));
        //14
        addFieldArchetype(VALOR_OUTRAS_DESPESAS, new FieldDecimalFixedLengthArchetype(15,2));
        //15
        addFieldArchetype(VALOR_OUTROS_CREDITOS, new FieldDecimalFixedLengthArchetype(15,2));
        //16
        addFieldArchetype(DATA_OCORRENCIA, new FieldIntegerFixedLengthArchetype(8));
        //17
        addFieldArchetype(DATA_EFETIVACAO_CREDITO, new FieldIntegerFixedLengthArchetype(8));
        //18
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(4,'0'));
        //19
        addFieldArchetype(DATA_DEBITO_TARIFA, new FieldIntegerFixedLengthArchetype(8));
        //20
        addFieldArchetype(CODIGO_SACADO_BANCO, new FieldIntegerFixedLengthArchetype(15));
        //21
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN3, new FieldFillerArchetype(30,'0'));
        //22
        addFieldArchetype(CODIGO_BANCO_CORRESPONDENTE_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //23
        addFieldArchetype(NOSSO_NUMERO_BANCO_CORRESPONDENTE_COMPENSACAO, new FieldIntegerFixedLengthArchetype(20));
        //24
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN4, new FieldFillerArchetype(7,' '));
    }
    
    
    
}
