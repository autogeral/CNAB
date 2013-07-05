package br.com.jcomputacao.cnab.t240.v05.extrato;

import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnabv05SegmentoEExtratoSantander extends LineCnabv05SegmentoEExtratoItau {

    public LineCnabv05SegmentoEExtratoSantander() {
        setName("REGISTRO DETALHE - SEGMENTO 'E' - CNABv5.0");

        addFieldArchetype(IDENTIFICACAO_TIPO_LANCAMENTO, new FieldStringFixedLengthArchetype(3));
        //07
        removeFieldArchetype(BRANCOS);
        //08
        //addFieldArchetype(TIPO_INSCRICAO, new FieldStringFixedLengthArchetype(1));
        //09
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(14));
        //10
        removeFieldArchetype(BRANCOS2);
        //11
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(20));
        //12
        removeFieldArchetype(ZEROS);
        //13
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        //14
        addFieldArchetype(DIGITO_VER_AGENCIA, new FieldStringFixedLengthArchetype(1));
        //15
        removeFieldArchetype(ZEROS2);
        //16
        addFieldArchetype(NUMERO_CONTA_CORRENTE, new FieldIntegerFixedLengthArchetype(12));
        //17
//        addFieldArchetype(BRANCOS3, new FieldStringFixedLengthArchetype(1));
        //18
//        addFieldArchetype(DIGITO_VER_AG_CONTA, new FieldStringFixedLengthArchetype(1));
        //19
//        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //20
//        addFieldArchetype(RESERVADO_USO_BANCO, new FieldStringFixedLengthArchetype(6));
        //21
//        addFieldArchetype(NATUREZA_LANCAMENTO, new FieldStringFixedLengthArchetype(3));
        //22
        addFieldArchetype(TIPO_COMPLEMENTO, new FieldStringFixedLengthArchetype(2));
        //23
        /**
         * Complemento do lancamento
         */
        addFieldArchetype(BANCO_ORIGEM_LANCAMENTO, new FieldStringFixedLengthArchetype(20));
        //24
        removeFieldArchetype(AGENCIA_ORIGEM_LANCAMENTO);
        //25
        removeFieldArchetype(AG_CONTA_ORIGEM_LANCAMENTO);
        //26
//        addFieldArchetype(IDENTIFICACAO_INSENCAO_CPMF, new FieldStringFixedLengthArchetype(1));
        //27
//        addFieldArchetype(DATA_CONTABIL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //28
//        addFieldArchetype(DATA_LANCAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //29
        addFieldArchetype(VALOR_LANCAMENTO, new FieldDecimalFixedLengthArchetype(18, 2));
        //30
//        addFieldArchetype(TIPO_LANCAMENTO, new FieldStringFixedLengthArchetype(1));
        //31
//        addFieldArchetype(CATEGORIA_LANCAMENTO, new FieldIntegerFixedLengthArchetype(3));
        //32
        /**
         * Código do Histórico do Lançamento no Banco Código adotado por cada
         * Banco para identificar o descritivo do Lançamento. Observar que no
         * Extrato de Conta Corrente para Conciliação Bancária este campo possui
         * 4 caracteres, enquanto no Extrato para Gestão de Caixa ele possui 5
         * caracteres.
         */
//        addFieldArchetype(CODIGO_LANCAMENTO, new FieldStringFixedLengthArchetype(4));
        //33
//        addFieldArchetype(HISTORICO_LANCAMENTO, new FieldStringFixedLengthArchetype(25));
        //34
        removeFieldArchetype(AG_ORIGEM_LANCAMENTO);
        //35
        removeFieldArchetype(COMPLEMENTO_REGISTRO);
        //36
        removeFieldArchetype(CONTA_ORIGEM_LANCAMENTO);
        //37
        removeFieldArchetype(DAC_AG_CONTA_ORIGEM);
        //38
        removeFieldArchetype(TIPO_INSCRICAO_EMITENTE);
        //39
        removeFieldArchetype(NUMERO_INSCRICAO_EMITENTE);
        //40
        removeFieldArchetype(BRANCOS4);
        //41
        addFieldArchetype(NUMERO_DOCUMENTO, new FieldStringFixedLengthArchetype(39));
    }
}
