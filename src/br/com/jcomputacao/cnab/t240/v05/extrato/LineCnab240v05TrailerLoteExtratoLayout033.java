package br.com.jcomputacao.cnab.t240.v05.extrato;

import br.com.jcomputacao.aristoteles.field.*;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v05TrailerLoteExtratoLayout033 extends LineCnab240v05TrailerLoteExtratoLayout031 {

    public LineCnab240v05TrailerLoteExtratoLayout033() {
        setName("CNAB 240 v5.0 - Trailer do lote - versão do Layout 033");
        //01
//        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
//        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
//        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("5"));
        //04
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(9, ' '));
        //05
//        addFieldArchetype(TIPO_INSCRICAO, new FieldIntegerFixedLengthArchetype(1));
        //06
//        addFieldArchetype(NUM_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(14));
        //07
        removeFieldArchetype(BRANCOS2);
        //08
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(20));
        //09
        removeFieldArchetype(ZEROS);
        //10
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        //11
//        addFieldArchetype(DIGITO_VER_AGENCIA,  new FieldStringFixedLengthArchetype(1));
        //12
        removeFieldArchetype(ZEROS2);
        //13
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));
        //14
        /**
         * Digito verificador da conta.
         */
        addFieldArchetype(BRANCOS3, new FieldStringFixedLengthArchetype(1));
        //15
        addFieldArchetype(DIGITO_VER_AG_CONTA, new FieldStringFixedLengthArchetype(1));
        //16
        addFieldArchetype(BRANCOS4, new FieldStringFixedLengthArchetype(16));
        //17
        addFieldArchetype(SALDO_BLOQUEADO_ACIMA_24, new FieldDecimalFixedLengthArchetype(18, 2));
        //18
        addFieldArchetype(LIMITE_CONTA, new FieldDecimalFixedLengthArchetype(18, 2));
        //19
        addFieldArchetype(SALDO_BLOQUEADO_ATE_24, new FieldDecimalFixedLengthArchetype(18, 2));
        //20
        addFieldArchetype(DATA_FINAL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //21
        addFieldArchetype(SALDO_FINAL, new FieldDecimalFixedLengthArchetype(18, 2));
        //22
        addFieldArchetype(SITUACAO_SALDO_FINAL, new FieldStringFixedLengthArchetype(1));
        //23
        addFieldArchetype(STATUS_SALDO_FINAL, new FieldStringFixedLengthArchetype(1));
        //24        
        addFieldArchetype(QTDE_REGISTROS_LOTE, new FieldIntegerFixedLengthArchetype(6));
        //25
        addFieldArchetype(TOTAL_VALOR_DEBITO, new FieldDecimalFixedLengthArchetype(18, 2));
        //26
        addFieldArchetype(TOTAL_VALOR_CREDITO, new FieldDecimalFixedLengthArchetype(18, 2));
        //27
        removeFieldArchetype(TOTAL_VALORES_NAO_CONTABEIS);        
        //28
        addFieldArchetype(BRANCOS5, new FieldStringFixedLengthArchetype(28));
    }
}
