package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/12/2014 09:57:25
 * @author murilo
 */
public class ContaEletronicaHeader extends LineArchetype {

    /**
     * TIPOS DE REGISTRO POSICAO 001 - DEFAULT ZEROS
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * NUMERO SEQUENCIAL DO ARQUIVO POSICAO 002 - Tam(012)
     */
    public static final String SEQUENCIAL = "SEQUENCIAL";
    /**
     * DATA GERACAO ARQUIVO AAAAMMDD
     */
    public static final String DATA_GERACAO_ARQUIVO = "DATA_GERACAO_ARQUIVO";
    /**
     * Nome da operadora de Telefonia Tam(15)
     */
    public static final String OPERADORA_IDENTIFICACAO = "OPERADORA_IDENTIFICACAO";
    /**
     * Tam (2)
     */
    public static final String OPERADORA_UF = "OPERADORA_UF";
    /**
     * Tam (15)
     */
    public static final String CLIENTE_CODIGO = "CLIENTE_CODIGO";
    /**
     * Tam (40)
     */
    public static final String CLIENTE_NOME = "CLIENTE_NOME";
    /**
     * Tam (15)
     */
    public static final String CLIENTE_CNPJ = "CLIENTE_CNPJ";
    /**
     * IDENTIFICADOR DA CONTA UNICA Tam (025)
     * UTILIZADO PRINCIPALMENTE PARA DEBITO AUTOMATICO JUNTO A CONCESSIONARIA
     */
    public static final String IDENTIFICADOR_CONTA_UNICA = "IDENTIFICADOR_CONTA_UNICA";
    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String EMISSAO = "EMISSAO";
    /**
     * FILLER 201
     */
    public static final String FILLER = "FILLER";
    
    public ContaEletronicaHeader() {
        setName("Conta Eletronica - Arquivo Header");
        addFieldArchetype(TIPO_REGISTRO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DATA_GERACAO_ARQUIVO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(OPERADORA_IDENTIFICACAO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(OPERADORA_UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CLIENTE_CODIGO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CLIENTE_NOME, new FieldStringFixedLengthArchetype(40));
        addFieldArchetype(CLIENTE_CNPJ, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(IDENTIFICADOR_CONTA_UNICA, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(EMISSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(FILLER, new FieldFillerArchetype(201, ' '));
    }
}
