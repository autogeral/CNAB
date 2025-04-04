package br.com.jcomputacao.cnab.bb400;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author murilo.lima
 */
public class LineCnabBBRegistroHeaderRetorno extends LineArchetype {

    /**
     * Código do registro = 0
     */
    public static final String CODIGO_REGISTRO = "CODIGO_REGISTRO";
    /**
     * Código da remessa = 1
     */
    public static final String CODIGO_REMESSA = "CODIGO_REMESSA";
    /**
     * Literal de transmissão = REMESSA
     */
    public static final String LITERAL_TRANSMISSAO = "LITERAL_TRANSMISSAO";
    /**
     * Código do serviço = 01
     */
    public static final String CODIGO_SERVICO = "CODIGO_SERVICO";
    /**
     * Literal de serviço = COBRANÇA
     */
    public static final String LITERAL_SERVICO = "LITERAL_SERVICO";
    /**
     * Código da empresa
     */
    public static final String CODIGO_EMPRESA = "CODIGO_EMPRESA";    
    /**
     * Nome do cedente
     */
    public static final String NOME_CEDENTE = "NOME_CEDENTE";
    /**
     * Código do Banco = 033
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * Nome do Banco = SANTANDER
     */
    public static final String NOME_BANCO = "NOME_BANCO";
    /**
     * Data da gravacao do arquivo
     */
    public static final String DATA_GRAVACAO_ARQUIVO = "DATA_GRAVACAO_ARQUIVO";
    /**
     * Densidade da gravação
     */
    public static final String DENSIDADE_GRAVACAO = "DENSIDADE_GRAVACAO";
    /**
     * N° aviso bancário
     */
    public static final String NUMERO_AVISO_BANCARIO = "NUMERO_AVISO_BANCARIO";
    /**
     * Brancos
     */
    public static final String BRANCOS = "BRANCOS";
    /**
     * Data do crédito
     */
    public static final String DATA_CREDITO = "DATA_CREDITO";
     /**
     * Brancos 2
     */
    public static final String BRANCOS_2 = "BRANCOS_2";
    /**
     * Número seqüencial do registro no arquivo
     */
    public static final String NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO = "NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO";

    public LineCnabBBRegistroHeaderRetorno() {
        addFieldArchetype(CODIGO_REGISTRO, new FieldDefaultArchetype("0"));
        addFieldArchetype(CODIGO_REMESSA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(LITERAL_TRANSMISSAO, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(CODIGO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(LITERAL_SERVICO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(CODIGO_EMPRESA, new FieldIntegerFixedLengthArchetype(20));        
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(NOME_BANCO, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(DATA_GRAVACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyy"));
        addFieldArchetype(DENSIDADE_GRAVACAO, new FieldDefaultArchetype("01600000"));
        addFieldArchetype(NUMERO_AVISO_BANCARIO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(BRANCOS, new FieldFillerArchetype(266, ' '));
        addFieldArchetype(DATA_CREDITO, new FieldDateFixedLengthArchetype("ddMMyy"));        
        addFieldArchetype(BRANCOS_2, new FieldFillerArchetype(9, ' '));
        addFieldArchetype(NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, new FieldIntegerFixedLengthArchetype(6));
    }
}
