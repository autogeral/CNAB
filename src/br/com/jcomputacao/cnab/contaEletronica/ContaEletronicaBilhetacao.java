package br.com.jcomputacao.cnab.contaEletronica;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 29/12/2014 11:11:37
 * @author murilo
 */
public class ContaEletronicaBilhetacao extends LineArchetype {
    /**
     * Tipo de Registro - Valor 3 para bilhetacao
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
     * Tamanho 5
     */
    public static final String CODIGO_NACIONAL_LOCALIDADE = "CNL";
    public static final String DDD = "DDD";
    public static final String TELEFONE_NUMERO = "TELEFONE_NUMERO";
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
     * Data da ligação<br/>
     * Padrao AAAAMMDD
     */
    public static final String CHAMADA_DATA = "CHAMADA_DATA";
    public static final String CHAMADA_LOCALIDADE_CNL = "CHAMADA_LOCALIDADE_CNL"; //5
    public static final String CHAMADA_LOCALIDADE_NOME = "CHAMADA_LOCALIDADE_NOME"; //25
    public static final String CHAMADA_LOCALIDADE_UF = "CHAMADA_LOCALIDADE_UF"; //2
    public static final String CHAMADA_NACIONAL_INTERNACIONAL = "CHAMADA_NACIONAL_INTERNACIONAL"; //2
    public static final String CHAMADA_OPERADORA_CODIGO = "CHAMADA_OPERADORA_CODIGO"; //2
    public static final String CHAMADA_OPERADORA_NOME = "CHAMADA_OPERADORA_NOME"; //2
    public static final String CHAMADA_PAIS_CODIGO = "CHAMADA_PAIS_CODIGO"; //3
    public static final String CHAMADA_DDD = "CHAMADA_DDD"; //4
    public static final String CHAMADA_TELEFONE = "CHAMADA_TELEFONE";//10
    public static final String CHAMADA_CONJUGADO = "CHAMADA_CONJUGADO";//2
    /**
     * Valor numerico em minutos.<br/>
     * Decimal (6,1)
     */
    public static final String CHAMADA_DURACAO = "CHAMADA_DURACAO";
    /**
     * DDD – Discagem Direta a Cobrar.<br/>
     * DDC – Discagem Direta a Cobrar.<br/>
     * DLC – Discagem a Cobrar Local.<br/>
     * DDI – Lig. Internacional.<br/>
     * DDO – Discagem Direta Via Operadora.<br/>
     * VC1 –.<br/>
     * VC2 –.<br/>
     * VC3 , etc..
     */
    public static final String CHAMADA_CATEGORIA = "CHAMADA_CATEGORIA";
    public static final String CHAMADA_CATEGORIA_DESCRICAO = "CHAMADA_CATEGORIA_DESCRICAO";//50
    /**
     * HHmmss
     */
    public static final String CHAMADA_HORARIO = "CHAMADA_HORARIO";
    /**
     * 1 - Chamada normal.<br/>
     * 4 - Chamada a cobrar.<br/>
     * Tamanho (1)
     */
    public static final String CHAMADA_TIPO = "CHAMADA_TIPO";
    /**
     * K – Tarifa normal – TT.<br/>
     * L – Tarifa normal – ESP.<br/>
     * B – Tarifa reduzida – TT.<br/>
     * C – Tarifa reduzida – ESP.<br/>
     * S – Tarifa super-reduz TT.<br/>
     * T – Tarifa super-reduz ESP.<br/>
     * D – Tarifa de Horário de pico.<br/>
     * M – Tarifa de Horário misto.<br/>
     * Tamanho 1
     */
    public static final String CHAMADA_HORARIO_GRUPO = "CHAMADA_HORARIO_GRUPO";
    /**
     * Tamanho (25)
     */
    public static final String CHAMADA_HORARIO_DESCRICAO = "CHAMADA_HORARIO_DESCRICAO";
    /**
     * DC (CONURBADA)
     * 01 ( 00 até 50 Km)<br/>
     * 02 (51 até 100 Km)<br/>
     * 03 (101 até 300 Km)<br/>
     * Tamanho (2)
     */
    public static final String CHAMADA_DEGRAU = "CHAMADA_DEGRAU";
    public static final String CHAMADA_VALOR_SINAL = "CHAMADA_VALOR_SINAL"; //Tamanho 1
    public static final String ICMS_ALIQUOTA = "ICMS_ALIQUOTA"; // 5,2
    public static final String VALOR_COM_IMPOSTOS = "VALOR_COM_IMPOSTOS"; //13,2
    /**
     * Numerico Tamanhho 5
     */
    public static final String CHAMADA_CLASSE_SERVICO = "CHAMADA_CLASSE_SERVICO";
    public static final String FILLER = "FILLER";
    
    public ContaEletronicaBilhetacao() {
        setName("Conta Eletronica - Bilhetacao");
        addFieldArchetype(TIPO_REGISTRO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(EMISSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        
        addFieldArchetype(IDENTIFICADOR_UNICO_RECURSO, new FieldStringFixedLengthArchetype(25));
        FieldArchetype fa = new FieldIntegerFixedLengthArchetype(5);
        fa.setNullableRepresentation("     ");
        addFieldArchetype(CODIGO_NACIONAL_LOCALIDADE, fa);
        addFieldArchetype(DDD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(TELEFONE_NUMERO, new FieldStringFixedLengthArchetype(10));

        addFieldArchetype(RECURSO_CARACTERISTICA, new FieldStringFixedLengthArchetype(15));
        addFieldArchetype(RECURSO_DEGRAU, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHAMADA_DATA, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(CHAMADA_LOCALIDADE_CNL, fa);
        addFieldArchetype(CHAMADA_LOCALIDADE_NOME, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(CHAMADA_LOCALIDADE_UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHAMADA_NACIONAL_INTERNACIONAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHAMADA_OPERADORA_CODIGO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHAMADA_OPERADORA_NOME, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(CHAMADA_PAIS_CODIGO, new FieldStringFixedLengthArchetype(3));
        
        addFieldArchetype(CHAMADA_DDD, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(CHAMADA_TELEFONE, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(CHAMADA_CONJUGADO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHAMADA_DURACAO, new FieldDecimalFixedLengthArchetype(6,1));
        addFieldArchetype(CHAMADA_CATEGORIA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CHAMADA_CATEGORIA_DESCRICAO, new FieldStringFixedLengthArchetype(50));
        
        fa = new FieldTimeFixedLengthArchetype();
        fa.setNullableRepresentation("      ");
        addFieldArchetype(CHAMADA_HORARIO, fa);
        addFieldArchetype(CHAMADA_TIPO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CHAMADA_HORARIO_GRUPO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CHAMADA_HORARIO_DESCRICAO, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(CHAMADA_DEGRAU, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHAMADA_VALOR_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(ICMS_ALIQUOTA, new FieldDecimalFixedLengthArchetype(5,2));
        addFieldArchetype(VALOR_COM_IMPOSTOS, new FieldDecimalFixedLengthArchetype(13,2));
        fa = new FieldIntegerFixedLengthArchetype(5);
        fa.setNullableRepresentation("     ");
        addFieldArchetype(CHAMADA_CLASSE_SERVICO, fa);
        addFieldArchetype(FILLER, new FieldFillerArchetype(61, ' '));
    }
}
