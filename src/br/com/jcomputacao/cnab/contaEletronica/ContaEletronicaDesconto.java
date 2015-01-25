package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/12/2014 14:02:21
 * @author murilo
 */
public class ContaEletronicaDesconto extends LineArchetype {
    /**
     * Tipo de Registro - Valor 4 para serviços
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * Numero sequencial - Tam (012)
     */
    public static final String SEQUENCIAL = "SEQUENCIAL";
    /**
     * Vencimento da conta<br/>
     * Padrao AAAAMMDD
     */
    public static final String VENCIMENTO = "VENCIMENTO";
    public static final String EMISSAO = "EMISSAO";
    /**
     * Identificador individual
     * por recurso junto a
     * concessionária 
     * Tam (25)
     */
    public static final String IDENTIFICADOR_UNICO_RECURSO = "IDENTIFICADOR_UNICO_RECURSO";
    /**
     * IDENTIFICADOR DA CONTA UNICA Tam (025)
     * UTILIZADO PRINCIPALMENTE PARA DEBITO AUTOMATICO JUNTO A CONCESSIONARIA
     */
    public static final String IDENTIFICADOR_CONTA_UNICA = "IDENTIFICADOR_CONTA_UNICA";
    /**
     * Tamanho 5
     */
    public static final String CODIGO_NACIONAL_LOCALIDADE = "CNL";
    public static final String DDD = "DDD";
    public static final String TELEFONE_NUMERO = "TELEFONE_NUMERO";
    public static final String CATEGORIA = "CATEGORIA";
    public static final String CATEGORIA_DESCRICAO = "CATEGORIA_DESCRICAO";
    public static final String VALOR_SINAL = "VALOR_SINAL"; //Tamanho 1
    public static final String VALOR_BASE = "VALOR_BASE"; //13,2
    public static final String DESCONTO_PERCENTUAL = "DESCONTO_PERCENTUAL"; // 5,2
    public static final String VALOR_LIQUIDO = "VALOR_LIQUIDO"; //13,2
    public static final String ACERTO_INICIO = "ACERTO_INICIO";
    public static final String ACERTO_FIM = "ACERTO_FIM";
    public static final String SERVICO_CLASSE = "SERVICO_CLASSE";    
    public static final String FILLER = "FILLER";
    
    public ContaEletronicaDesconto() {
        setName("Conta Eletronica - Desconto");
        addFieldArchetype(TIPO_REGISTRO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(EMISSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(IDENTIFICADOR_UNICO_RECURSO, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(IDENTIFICADOR_CONTA_UNICA, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(CODIGO_NACIONAL_LOCALIDADE, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DDD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(TELEFONE_NUMERO, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(CATEGORIA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CATEGORIA_DESCRICAO, new FieldStringFixedLengthArchetype(80));
        addFieldArchetype(VALOR_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VALOR_BASE, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(DESCONTO_PERCENTUAL, new FieldDecimalFixedLengthArchetype(5,2));
        addFieldArchetype(VALOR_LIQUIDO, new FieldDecimalFixedLengthArchetype(13,2));
        FieldDateTimeFixedLengthArchetype fa = new FieldDateTimeFixedLengthArchetype();
        fa.setNullableRepresentation("              ");
        addFieldArchetype(ACERTO_INICIO, fa);
        addFieldArchetype(ACERTO_FIM, fa);
        addFieldArchetype(SERVICO_CLASSE, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(FILLER, new FieldFillerArchetype(106, ' '));
    }

}
