package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 10/11/2012 10:51:19
 * @author Murilo
 */
public class LineCnab240SegmentoZ extends LineArchetype {
    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";

    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";

    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE
     * TIPO DE OPERACAO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";

    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO 'Z'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";

    /**
     * AUTENTICACAO DO PAGAMENTO
     * POSICAO 015 078
     */
    
    public static final String PAGAMENTO_AUTENTICACAO = "PAGAMENTO_AUTENTICACAO";
    
    /**
     * PROTOCOLO DO PAGAMENTO
     * POSICAO 079 103
     */
    
    public static final String PROTOCOLO_PAGAMENTO = "PROTOCOLO_PAGAMENTO";

    public LineCnab240SegmentoZ() {
        setName("CNAB 240v084 - Segmento Z");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("Z"));
        addFieldArchetype(PAGAMENTO_AUTENTICACAO, new FieldStringFixedLengthArchetype(64));
        addFieldArchetype(PROTOCOLO_PAGAMENTO, new FieldStringFixedLengthArchetype(25));

    }

}
