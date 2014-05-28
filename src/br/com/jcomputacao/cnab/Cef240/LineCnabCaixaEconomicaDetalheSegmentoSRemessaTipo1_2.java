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
 * @author Cesário
 */
public class LineCnabCaixaEconomicaDetalheSegmentoSRemessaTipo1_2 extends LineCnabCaixaEconomicaDetalheSegmentoSRemessa {

     /**
     * Para o tipo de impressao 1 e 2
     * usar esses padrões
     */
    
    
    /**
     * 9<br>
     * Filler01<br>
     * POSICAO 019 020<br>
     * tamanho 2 numerico default 0<br>
     */
    public static final String FILLER1 = "FILLER1";
    
    /**
     * 10<br>
     * mensagem<br>
     * POSICAO 021 0160<br>
     * tamanho 150 alfanumérico<br>
     */
    public static final String MENSAGEM = "MENSAGEM";
    
    /**
     * 11<br>
     * Filler02<br>
     * POSICAO 0161 0162<br>
     * tamanho 2 numérico default 0<br>
     */
    public static final String FILLER2 = "FILLER2";
    
    /**
     * 12<br>
     * CNAB<br>
     * POSICAO 0163 0240<br>
     * tamanho 78 Alfanumérico default ' '<br>
     */
    public static final String USO_EXCLUSIVO_FEBRABAN = "USO_EXCLUSIVO_FEBRABAN";

    public LineCnabCaixaEconomicaDetalheSegmentoSRemessaTipo1_2() {
        setName("CNAB -Registro Detalhe - Segmento S (Opcional - Remessa)");
         //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldFillerArchetype(1,'3'));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldFillerArchetype(1,'S'));
        //06
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN1, new FieldFillerArchetype(1,' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));
        //08
        addFieldArchetype(IDENTIFICACAO_IMPRESSAO, new FieldIntegerFixedLengthArchetype(1));
        //09
        addFieldArchetype(FILLER1, new FieldIntegerFixedLengthArchetype(2));
        //10
        addFieldArchetype(MENSAGEM, new FieldStringFixedLengthArchetype(140));
        //11
        addFieldArchetype(FILLER1, new FieldIntegerFixedLengthArchetype(2));
        //12
        addFieldArchetype(USO_EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(2,' '));
        
        
    }
    
    
    
}
