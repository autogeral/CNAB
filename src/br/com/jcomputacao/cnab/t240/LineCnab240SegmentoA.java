package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Representa um registro de detalhe do tipo segmento A conforme layout definido na pagina 87 do
 * documento <b>Layout Padrao Febraban 240 posicões V08.6</b>, que pode ser baixado em:
 * http://www.febraban.org.br/acervo.asp?id_pagina=173
 *
 * @author Alipio
 */
public class LineCnab240SegmentoA extends LineArchetype {


    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * @see br.com.jcomputacao.cnab.CnabMovimentoTipo
     * G060
     * '0' = Indica INCLUSAO
     * '3' = Indica ESTORNO (somente para retorno)
     * '5' = Indica ALTERACAO
     * '9' = Indica EXCLUSAO
     */    
    public static final String TIPO_MOVIMENTO = "TIPO_MOVIMENTO";
    /**
     * @see br.com.jcomputacao.cnab.CnabMovimentoCodigo
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
    /**
     * Atribuir "" se nao for utilizar
     */
    public static final String CODIGO_CAMARA_CENTRALIZADORA = "CODIGO_CAMARA_CENTRALIZADORA";
    public static final String CODIGO_BANCO_PAGADOR_FAVORECIDO = "CODIGO_BANCO_PAGADOR_FAVORECIDO";
    public static final String AGENCIA_MANTENEDORA_PAGADOR_FAVORECIDO = "AGENCIA_MANTENEDORA_PAGADOR_FAVORECIDO";
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    public static final String DIGITO_VER_CONTA = "DIGITO_VER_CONTA";
    public static final String DIGITO_VER_AGENCIA_CONTA = "DIGITO_VER_AGENCIA_CONTA";
    public static final String NOME_PAGADOR_FAVORECIDO = "NOME_PAGADOR_FAVORECIDO";
    public static final String SEU_NUMERO = "SEU_NUMERO";
    public static final String DATA_LANCAMENTO = "DATA_LANCAMENTO";
    /**
     * 'BTN' = Bonus do Tesouro Nacional + TR 
     * 'BRL' = Real
     * 'USD' = Dolar Americano
     * 'PTE' = Escudo Portugues
     * 'FRF' = Franco Frances
     * 'CHF' = Franco Suico
     * 'JPY' = Ien Japones
     * 'IGP' = Indice Geral de Precos
     * 'IGM' = Indice Geral de Precos de Mercado
     * 'GBP' = Libra Esterlina
     * 'ITL' = Lira Italiana
     * 'DEM' = Marco Alemao
     * 'TRD' = Taxa Referencial Diaria
     * 'UPC' = Unidade Padrao de Capital
     * 'UPF' = Unidade Padrao de Financiamento
     * 'UFR' = Unidade Fiscal de Referencia 
     * 'XEU' = Unidade Monetaria Europeia
     */
    public static final String TIPO_MOEDA = "TIPO_MOEDA";
    public static final String QTDE_MOEDA = "QTDE_MOEDA";
    public static final String VALOR_LANCAMENTO = "VALOR_LANCAMENTO";
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    public static final String DATA_REAL = "DATA_REAL";
    public static final String VALOR_REAL = "VALOR_REAL";
    public static final String INFORMACAO_2 = "INFORMACAO_2";
    /**
     * COD_FINALIDADE_DOC
     * 01 - Credito em conta
     * 04 - Pagamento de Dividendos
     * 06 - Pagamento de Salarios
     * 09 - Pagamento de Tributos
     * 12 - DOC para Deposito Judicial
     * 13 - Outros
     */
    public static final String COD_FINALIDADE_DOC = "COD_FINALIDADE_DOC";
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";
    /**
     * P006
     * '0' = Nao Emite Aviso
     * '2' = Emite Aviso Somente para o Remetente
     * '5' = Emite Aviso Somente para o Favorecido
     * '6' = Emite Aviso para o Remetente e Favorecido
     * '7' = Emite Aviso para o Favorecido e 2 Vias para o Remetente*
     */
    public static final String AVISO_AO_PAGADOR_FAVORECIDO = "AVISO_AO_PAGADOR_FAVORECIDO";
    public static final String OCORRENCIAS = "OCORRENCIAS";

    public LineCnab240SegmentoA() {
        setName("CNAB BB - Segmento A");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("A"));
        addFieldArchetype(TIPO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_MOVIMENTO, new FieldIntegerFixedLengthArchetype(2));
        FieldStringFixedLengthArchetype ccc = new FieldStringFixedLengthArchetype(3);
        ccc.setNullableRepresentation("   ");
        addFieldArchetype(CODIGO_CAMARA_CENTRALIZADORA, ccc);
        addFieldArchetype(CODIGO_BANCO_PAGADOR_FAVORECIDO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(AGENCIA_MANTENEDORA_PAGADOR_FAVORECIDO, new FieldIntegerFixedLengthArchetype(5));
        ccc = new FieldStringFixedLengthArchetype(1);
        ccc.setNullableRepresentation(" ");
        addFieldArchetype(DIGITO_VER_AGENCIA, ccc);
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIGITO_VER_CONTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DIGITO_VER_AGENCIA_CONTA, ccc);
        addFieldArchetype(NOME_PAGADOR_FAVORECIDO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(SEU_NUMERO, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(DATA_LANCAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(TIPO_MOEDA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(QTDE_MOEDA, new FieldDecimalFixedLengthArchetype(15, 5));
        addFieldArchetype(VALOR_LANCAMENTO, new FieldDecimalFixedLengthArchetype(15, 2));
        ccc = new FieldStringFixedLengthArchetype(20);
        ccc.setNullableRepresentation("");
        addFieldArchetype(NOSSO_NUMERO, ccc);
        addFieldArchetype(DATA_REAL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_REAL, new FieldDecimalFixedLengthArchetype(15, 2));
        ccc = new FieldStringFixedLengthArchetype(40);
        ccc.setNullableRepresentation("");
        addFieldArchetype(INFORMACAO_2, ccc);
        addFieldArchetype(COD_FINALIDADE_DOC, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(10, ' '));
        addFieldArchetype(AVISO_AO_PAGADOR_FAVORECIDO, new FieldIntegerFixedLengthArchetype(1));
        ccc = new FieldStringFixedLengthArchetype(10);
        ccc.setNullableRepresentation("");
        addFieldArchetype(OCORRENCIAS, ccc);
    }
}