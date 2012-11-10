package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * GARE-SP ICMS/DR/ITCMD
 * 10/11/2012 10:49:20
 * @author Murilo
 */
public class LineCnab240SegmentoN4  extends LineCnab240SegmentoN {

    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String IE_MUNICIPIO_DECLARACAO = "IE_MUNICIPIO_DECLARACAO";
    public static final String DIVIDA_ATIVA_ETIQUETA = "DIVIDA_ATIVA_ETIQUETA";
    public static final String REFERENCIA = "REFERENCIA";
    public static final String PARCELA_NOTIFICACAO = "PARCELA_NOTIFICACAO";
    public static final String VALOR_RECEITA = "VALOR_RECEITA";
    public static final String VALOR_JUROS = "VALOR_JUROS";
    public static final String VALOR_MULTA = "VALOR_MULTA";
    public static final String CNAB = "CNAB";

    public LineCnab240SegmentoN4() {
        setName("CNAB 240v084 - Segmento N4 GARE-SP ICMS/DR/ITCMD");
        addFieldArchetype(IDENTIFICACAO_TRIBUTO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(IE_MUNICIPIO_DECLARACAO, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIVIDA_ATIVA_ETIQUETA, new FieldIntegerFixedLengthArchetype(13));
        addFieldArchetype(REFERENCIA, new FieldIntegerFixedLengthArchetype(6));
        addFieldArchetype(PARCELA_NOTIFICACAO, new FieldIntegerFixedLengthArchetype(13));
        addFieldArchetype(VALOR_RECEITA, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(VALOR_JUROS, new FieldDecimalFixedLengthArchetype(14, 2));
        addFieldArchetype(VALOR_MULTA, new FieldDecimalFixedLengthArchetype(14, 2));
        addFieldArchetype(CNAB, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }

}
