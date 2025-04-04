package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/12/2014 10:30:08
 * @author murilo
 */
public class ContaEletronicaResumo extends LineArchetype {
    
    /**
     * Tipo de Registro - Valor 1 para resumo
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * Numero sequencial - Tam (012)
     */
    public static final String SEQUENCIAL = "SEQUENCIAL";
    
    /**
     * Identificador da conta unica para<br/>
     * debito automatico junto a concessionaria<br/>
     * Tamanho (25)
     */
    public static final String IDENTIFICADOR_CONTA_UNICA = "IDENTIFICADOR_CONTA_UNICA";
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
     * Tamanho 5
     */
    public static final String CODIGO_NACIONAL_LOCALIDADE = "CNL";

    /**
     * Tamanho 25
     */
    public static final String NOME_LOCALIDADE = "NOME_LOCALIDADE";
    public static final String DDD = "DDD";
    public static final String TELEFONE_NUMERO = "TELEFONE_NUMERO";

    /**
     * STFC - Serviço Telefônico Fixo Comutado<br/>
     * SLDA - Servico Linha Dedicada para Sinais Digitais.<br/>
     * SLDD - Servico Linha Dedicada para Sinais Analogicos.<br/>
     * SPCC - Servico Publico de Comutacao Servicos Etc <br/>
     * Tamanho 4
     */
    public static final String SERVICO_TIPO = "SERVICO_TIPO";
    /**
     * Detalhamento da descricao do servico.<br/>
     * Tamanho 35
     */
    public static final String SERVICO_DESCRICAO = "SERVICO_DESCRICAO";
    /**
     * LP-ALARME<br/>
     * LP-FONIA<br/>
     * LP-ENLACE/JUNÇÃO<br/>
     * LP-RAMAL<br/>
     * LP-NÃO ESPEC.<br/>
     * LP-TRANSDATA<br/>
     * LP-FIBRA<br/>
     * LT-TRONCO<br/>
     * LT-NEGOCIO<br/>
     * LT-DDG<br/>
     * LT-DDR<br/>
     * LT-PABX<br/>
     * LT-RESIDENCIAL<br/>
     * DAN-SATELITE BAIXA<br/>
     * TAN-SATELITE ALTA<br/>
     * ETC<br/>
     * Tamanho 15
     */
    public static final String RECURSO_CARACTERISTICA = "RECURSO_CARACTERISTICA";
    /**
     * 01 ( 00 até 50 Km)<br/>
     * 02 (51 até 100 Km)<br/>
     * 03 (101 até 300 Km)<br/>
     * Tamanho (2)
     */
    public static final String RECURSO_DEGRAU = "RECURSO_DEGRAU";
    /**
     * 19200 ( bps)<br/>
     * 64 (bps)<br/>
     * 2<br/>
     * 2400<br/>
     * 4800<br/>
     * 9600<br/>
     * ETC<br/>
     * Tamanho (2)
     */
    public static final String RECURSO_VELOCIDADE = "RECURSO_VELOCIDADE";
    /**
     * KBps
     * Mbps
     * Tamanho (4)
     */
    public static final String RECURSO_VELOCIDADE_UNIDADE = "RECURSO_VELOCIDADE_UNIDADE";
    
    /**
     * AAAAMMDD
     */
    public static final String ASSINATURA_PERIODO_INICIO = "ASSINATURA_PERIODO_INICIO";
    /**
     * AAAAMMDD
     */
    public static final String ASSINATURA_PERIODO_FIM = "ASSINATURA_PERIODO_FIM";
    /**
     * AAAAMMDD
     */
    public static final String SERVICO_PERIODO_INICIO = "SERVICO_PERIODO_INICIO";
    /**
     * AAAAMMDD
     */
    public static final String SERVICO_PERIODO_FIM = "SERVICO_PERIODO_FIM";
    /**
     * Tamanho (5)
     */
    public static final String CONSUMO_UNIDADE = "CONSUMO_UNIDADE";
    /**
     * Tamanho (7)
     */
    public static final String CONSUMO_QUANTIDADE = "CONSUMO_QUANTIDADE";
    /**
     * Negativo (Crédito)<br/>
     * Positivo (Débito)
     * Tamanho (1)
     */
    public static final String CONSUMO_SINAL = "CONSUMO_SINAL";
    /**
     * Tamanho (13,2)
     */
    public static final String CONSUMO_VALOR = "CONSUMO_VALOR";
    /**
     * Negativo (Crédito)<br/>
     * Positivo (Débito)
     * Tamanho (1)
     */
    public static final String ASSINATURA_SINAL = "ASSINATURA_SINAL";
    /**
     * Tamanho (13,2)
     */
    public static final String ASSINATURA_VALOR = "ASSINATURA_VALOR";
    /**
     * Inteiro Percentual
     * Tamanho (2)
     */
    public static final String ALIQUOTA = "ALIQUOTA";
    public static final String ICMS_SINAL = "ICMS_SINAL";
    public static final String ICMS_VALOR = "ICMS_VALOR";
    public static final String IMPOSTOS_TOTAL_SINAL = "IMPOSTOS_TOTAL_SINAL";
    public static final String IMPOSTOS_VALOR_TOTAL = "IMPOSTOS_VALOR_TOTAL";
    public static final String NUMERO_NOTA_FISCAL = "NUMERO_NOTA_FISCAL";
    public static final String CONTA_SINAL = "CONTA_SINAL";
    public static final String CONTA_VALOR = "CONTA_VALOR";
    public static final String FILLER = "FILLER";

    public ContaEletronicaResumo() {
        setName("Conta Eletronica - Resumo");
        addFieldArchetype(TIPO_REGISTRO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(IDENTIFICADOR_CONTA_UNICA, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(EMISSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        
        addFieldArchetype(IDENTIFICADOR_UNICO_RECURSO, new FieldStringFixedLengthArchetype(25));
        FieldArchetype fa = new FieldIntegerFixedLengthArchetype(5);
        fa.setNullableRepresentation("     ");
        addFieldArchetype(CODIGO_NACIONAL_LOCALIDADE, fa);
        addFieldArchetype(NOME_LOCALIDADE, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(DDD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(TELEFONE_NUMERO, new FieldStringFixedLengthArchetype(10));

        addFieldArchetype(SERVICO_TIPO, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(SERVICO_DESCRICAO, new FieldStringFixedLengthArchetype(35));
        addFieldArchetype(RECURSO_CARACTERISTICA, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(RECURSO_DEGRAU, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(RECURSO_VELOCIDADE, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(RECURSO_VELOCIDADE_UNIDADE, new FieldStringFixedLengthArchetype(4));
        fa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        fa.setNullableRepresentation("        ");
        addFieldArchetype(ASSINATURA_PERIODO_INICIO, fa);
        addFieldArchetype(ASSINATURA_PERIODO_FIM, fa);
        addFieldArchetype(SERVICO_PERIODO_INICIO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(SERVICO_PERIODO_FIM, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(CONSUMO_UNIDADE, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(CONSUMO_QUANTIDADE, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(CONSUMO_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CONSUMO_VALOR, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(ASSINATURA_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(ASSINATURA_VALOR, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(ALIQUOTA, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(ICMS_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(ICMS_VALOR, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(IMPOSTOS_TOTAL_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(IMPOSTOS_VALOR_TOTAL, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(NUMERO_NOTA_FISCAL, new FieldStringFixedLengthArchetype(12));
        addFieldArchetype(CONTA_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CONTA_VALOR, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(FILLER, new FieldFillerArchetype(36, ' '));
    }

}
