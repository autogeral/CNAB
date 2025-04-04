package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * Representa um registro de detalhe do tipo segmento B conforme layout definido na página 88 do
 * documento <b>Layout Padrão Febraban 240 posições V08.6</b>, que pode ser baixado em:
 * http://www.febraban.org.br/acervo.asp?id_pagina=173
 *
 * @author Alipio
 */
public class LineCnab240SegmentoB extends LineArchetype {

    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * 0 - Isento/Nao informado
     * 1 - CPF
     * 2 - CNPJ
     * 3 - PIS/PASEP
     * 9 - Outros
     */
    public static final String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    public static final String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    public static final String LOGRADOURO = "LOGRADOURO";
    public static final String NUMERO = "NUMERO";
    public static final String COMPLEMENTO = "COMPLEMENTO";
    public static final String BAIRRO = "BAIRRO";
    public static final String CIDADE = "CIDADE";
    public static final String CEP = "CEP";
    public static final String SUFIXO_CEP = "SUFIXO_CEP";
    public static final String ESTADO = "ESTADO";
    public static final String DATA_VENCIMENTO = "DATA_VENCIMENTO";
    public static final String VALOR_DOCUMENTO = "VALOR_DOCUMENTO";
    public static final String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";
    public static final String VALOR_DESCONTO = "VALOR_DESCONTO";
    public static final String VALOR_MORA = "VALOR_MORA";
    public static final String VALOR_MULTA = "VALOR_MULTA";
    /**
     * Conteudo nao tratado pelo banco
     */
    public static final String CODIGO_DOCUMENTO_PAGADOR_FAVORECIDO = "CODIGO_DOCUMENTO_PAGADOR_FAVORECIDO";
    /**
     * P006
     * '0' = Não Emite Aviso
     * '2' = Emite Aviso Somente para o Remetente
     * '5' = Emite Aviso Somente para o Favorecido
     * '6' = Emite Aviso para o Remetente e Favorecido
     * '7' = Emite Aviso para o Favorecido e 2 Vias para o Remetente*
     */
    public static final String AVISO = "AVISO";
    public static final String USO_SIAPE = "USO_SIAPE";
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240SegmentoB() {
        setName("CNAB BB - Segmento B");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("B"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(3, ' '));
        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(LOGRADOURO, new FieldStringFixedLengthArchetype(30));
        FieldArchetype fa = new FieldIntegerFixedLengthArchetype(5);
        fa.setNullableRepresentation("     ");
        addFieldArchetype(NUMERO, fa);
        fa = new FieldStringFixedLengthArchetype(15);
        fa.setNullableRepresentation("               ");
        addFieldArchetype(COMPLEMENTO, fa);
        addFieldArchetype(BAIRRO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CIDADE, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(SUFIXO_CEP, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(ESTADO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(DATA_VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_DOCUMENTO, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_DESCONTO, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_MORA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_MULTA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(CODIGO_DOCUMENTO_PAGADOR_FAVORECIDO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(AVISO, new FieldIntegerFixedLengthArchetype(1));
        fa = new FieldIntegerFixedLengthArchetype(6);
        fa.setNullableRepresentation("      ");
        addFieldArchetype(USO_SIAPE, fa);
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(8, ' '));
    }
}
