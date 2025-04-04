package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/12/2014 14:02:38
 * @author murilo
 */
public class ContaEletronicaTotalizadorFinal extends LineArchetype {
    /**
     * Tipo de Registro - Valor 4 para serviços
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * Numero sequencial - Tam (012)
     */
    public static final String SEQUENCIAL = "SEQUENCIAL";
    /**
     * O mesmo campo dos registros 0 e 1.
     * Tam (15)
     */
    public static final String CLIENTE_CODIGO = "CLIENTE_CODIGO";
    /**
     * IDENTIFICADOR DA CONTA UNICA Tam (025)
     * UTILIZADO PRINCIPALMENTE PARA DEBITO AUTOMATICO JUNTO A CONCESSIONARIA
     */
    public static final String IDENTIFICADOR_CONTA_UNICA = "IDENTIFICADOR_CONTA_UNICA";
    /**
     * Vencimento da conta<br/>
     * Padrao AAAAMMDD
     */
    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String EMISSAO = "EMISSAO";
    
    public static final String QUANTIDADE_REGISTROS = "QUANTIDADE_REGISTROS";
    public static final String QUANTIDADE_LINHAS = "QUANTIDADE_LINHAS";
    public static final String CONTA_SINAL = "CONTA_SINAL";
    public static final String CONTA_VALOR = "CONTA_VALOR";
    public static final String FILLER = "FILLER";
    
    public ContaEletronicaTotalizadorFinal() {
        setName("Conta Eletronica - Totalizador Final");
        addFieldArchetype(TIPO_REGISTRO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(CLIENTE_CODIGO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(IDENTIFICADOR_CONTA_UNICA, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(EMISSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(QUANTIDADE_REGISTROS, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(QUANTIDADE_LINHAS, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(CONTA_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CONTA_VALOR, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(FILLER, new FieldFillerArchetype(243, ' '));
    }

}
