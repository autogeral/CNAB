package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * DPVAT
 * 10/11/2012 10:49:41
 * @author Murilo
 */
public class LineCnab240SegmentoN6 extends LineCnab240SegmentoN {

    public static final String EXERCICIO = "EXERCICIO";
    public static final String RENAVAM = "RENAVAM";
    public static final String UNIDADE_FEDERACAO = "UNIDADE_FEDERACAO";
    public static final String MUNICIPIO = "MUNICIPIO";
    public static final String PLACA = "PLACA";
    public static final String OPCAO_PAGAMENTO = "OPCAO_PAGAMENTO";
    public static final String CNAB = "CNAB";
    
    public LineCnab240SegmentoN6() {
        setName("CNAB 240v084 - Segmento N6 DPVAT");
        addFieldArchetype(IDENTIFICACAO_TRIBUTO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(EXERCICIO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(RENAVAM, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(UNIDADE_FEDERACAO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MUNICIPIO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(PLACA, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(OPCAO_PAGAMENTO, new FieldDefaultArchetype("5"));
        addFieldArchetype(CNAB, new FieldFillerArchetype(68, ' '));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }
}
