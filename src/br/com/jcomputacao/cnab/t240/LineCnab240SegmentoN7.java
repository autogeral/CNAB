package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * Licenciamento
 * 10/11/2012 10:49:53
 * @author Murilo
 */
public class LineCnab240SegmentoN7 extends LineCnab240SegmentoN {

    public static final String EXERCICIO = "EXERCICIO";
    public static final String RENAVAM = "RENAVAM";
    public static final String UNIDADE_FEDERACAO = "UNIDADE_FEDERACAO";
    public static final String MUNICIPIO = "MUNICIPIO";
    public static final String PLACA = "PLACA";
    public static final String OPCAO_PAGAMENTO = "OPCAO_PAGAMENTO";
    /**
     * Opção de Retirada do CRVL</br> • 1 = Correio</br> • 2 = DETRAN / CIRETRAN
     */
    public static final String OPCAO_RETIRADA = "OPCAO_RETIRADA";
    public static final String CNAB = "CNAB";

    public LineCnab240SegmentoN7() {
        setName("CNAB 240v084 - Segmento N7 Licenciamento");
        addFieldArchetype(EXERCICIO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(RENAVAM, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(UNIDADE_FEDERACAO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MUNICIPIO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(PLACA, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(OPCAO_PAGAMENTO, new FieldDefaultArchetype("5"));
        addFieldArchetype(OPCAO_RETIRADA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CNAB, new FieldFillerArchetype(67, ' '));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }
}
