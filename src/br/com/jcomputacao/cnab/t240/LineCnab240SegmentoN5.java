package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;

/**
 * IPVA
 * 10/11/2012 10:49:30
 * @author Murilo
 */
public class LineCnab240SegmentoN5 extends LineCnab240SegmentoN {

    public static final String EXERCICIO = "EXERCICIO";
    public static final String RENAVAM = "RENAVAM";
    public static final String UNIDADE_FEDERACAO = "UNIDADE_FEDERACAO";
    public static final String MUNICIPIO = "MUNICIPIO";
    public static final String PLACA = "PLACA";
    /**
     * Opção de Pagamento</br>
     * • 1 = Parcela Única com Desconto</br>
     * • 2 = Parcela Única sem Desconto</br>
     * • 3 = Parcela No 1</br>
     * • 4 = Parcela No 2</br>
     * • 5 = Parcela No 3</br>
     * • 6 = Parcela No 4</br>
     * • 7 = Parcela No 5</br>
     * • 8 = Parcela No 6</br>
     * OBS.: Para as Formas de Lançamento = 16 (Licenciamento) e 17 (DPVAT) é obrigatório utilizar o código = 5
     */
    public static final String OPCAO_PAGAMENTO = "OPCAO_PAGAMENTO";
    public static final String CNAB = "CNAB";

    public LineCnab240SegmentoN5() {
        setName("CNAB 240v084 - Segmento N5 IPVA");
        addFieldArchetype(IDENTIFICACAO_TRIBUTO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(EXERCICIO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(RENAVAM, new FieldIntegerFixedLengthArchetype(9));
        addFieldArchetype(UNIDADE_FEDERACAO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(MUNICIPIO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(PLACA, new FieldStringFixedLengthArchetype(7));
        addFieldArchetype(OPCAO_PAGAMENTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CNAB, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(OCORRENCIAS, new FieldStringFixedLengthArchetype(10));
    }
}
