package br.com.jcomputacao.cnab.Cef240;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.CODIGO_BANCO_COMPENSACAO;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.CODIGO_LOTE;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.CODIGO_MOVIMENTO_REMESSA;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.CODIGO_SEGMENTO_REGISTRO;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.IDENTIFICACAO_IMPRESSAO;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.SEQUENCIAL_REGISTRO;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.TIPO_REGISTRO;
import static br.com.jcomputacao.cnab.Cef240.LineCnabCaixaEconomicaDetalheSegmentoSRemessa.USO_EXCLUSIVO_FEBRABAN1;

/**
 * 28/04/2014 12:53:07
 *
 * @author Cesário
 */
public class LineCnabCaixaEconomicaDetalheSegmentoSRemessaTipo3 extends LineCnabCaixaEconomicaDetalheSegmentoSRemessa {

    /**
     * Para Tipo de Impressão 3 (Mensagens a serem impressas na parte Recibo do
     * Sacado do Bloqueto):
     */
    /**
     * 9<br>
     * Informação 5<br>
     * Informação 5<br>
     * POSICAO 019 058<br>
     * tamanho 40 AlfaNumérico<br>
     */
    public static final String INFORMACAO5 = "INFORMACAO5";

    /**
     * 10<br>
     * Informação 6<br>
     * Informação 6<br>
     * POSICAO 059 098<br>
     * tamanho 40 AlfaNumérico<br>
     */
    public static final String INFORMACAO6 = "INFORMACAO6";

    /**
     * 11<br>
     * Informação 7<br>
     * Informação 7<br>
     * POSICAO 099 0138<br>
     * tamanho 40 AlfaNumérico<br>
     */
    public static final String INFORMACAO7 = "INFORMACAO7";

    /**
     * 12<br>
     * Informação 8<br>
     * Informação 8<br>
     * POSICAO 0139 0178<br>
     * tamanho 40 AlfaNumérico<br>
     */
    public static final String INFORMACAO8 = "INFORMACAO8";

    /**
     * 13<br>
     * Uso Exclusivo <br>
     * Uso Exclusivo <br>
     * POSICAO 0179 0218<br>
     * tamanho 40 AlfaNumérico default brancos<br>
     */
    public static final String USO_EXCLUSIVO_CAIXA2 = "USO_EXCLUSIVO_CAIXA2";

    /**
     * 14<br>
     * Uso Exclusivo cnab<br>
     * Uso Exclusivo CANB<br>
     * POSICAO 0219 0240<br>
     * tamanho 22 AlfaNumérico default brancos<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN2 = "USO_EXCLUSIVO_FEBRABAN2";

    public LineCnabCaixaEconomicaDetalheSegmentoSRemessaTipo3() {
        setName("CNAB -Registro Detalhe - Segmento S (Opcional - Remessa)");
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1, '3'));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldFillerArchetype(1, 'S'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1, ' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(IDENTIFICACAO_IMPRESSAO, new FieldIntegerFixedLengthArchetype(1));
        //09
        addFieldArchetype(INFORMACAO5, new FieldStringFixedLengthArchetype(40));
        //10        
        addFieldArchetype(INFORMACAO6, new FieldStringFixedLengthArchetype(40));
        //11
        addFieldArchetype(INFORMACAO7, new FieldStringFixedLengthArchetype(40));
        //12
        addFieldArchetype(INFORMACAO8, new FieldStringFixedLengthArchetype(40));
        //13
        addFieldArchetype(USO_EXCLUSIVO_CAIXA2, new FieldFillerArchetype(40,' '));
        //14
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN2, new FieldFillerArchetype(22,' '));

    }

}
