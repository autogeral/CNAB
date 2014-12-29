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
 * 29/12/2014 12:17:01
 * @author murilo
 */
public class ContaEletronicaServico extends LineArchetype {
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
     * Data do servico<br/>
     * Padrao AAAAMMDD
     */
    public static final String SERVICO_DATA = "SERVICO_DATA";
    public static final String SERVICO_LOCALIDADE_CNL = "SERVICO_LOCALIDADE_CNL"; //5
    public static final String SERVICO_LOCALIDADE_NOME = "SERVICO_LOCALIDADE_NOME"; //25
    public static final String SERVICO_LOCALIDADE_UF = "SERVICO_LOCALIDADE_UF"; //2
    public static final String SERVICO_NACIONAL_INTERNACIONAL = "SERVICO_NACIONAL_INTERNACIONAL"; //2
    public static final String SERVICO_OPERADORA_CODIGO = "SERVICO_OPERADORA_CODIGO"; //2
    public static final String SERVICO_OPERADORA_NOME = "SERVICO_OPERADORA_NOME"; //2
    public static final String SERVICO_PAIS_CODIGO = "SERVICO_PAIS_CODIGO"; //3
    public static final String SERVICO_DDD = "SERVICO_DDD"; //4
    public static final String SERVICO_TELEFONE = "SERVICO_TELEFONE";//10
    public static final String SERVICO_CONJUGADO = "SERVICO_CONJUGADO";//2
    /**
     * Valor numerico em minutos.<br/>
     * Decimal (6,1)
     */
    public static final String SERVICO_DURACAO = "SERVICO_DURACAO";
    /**
     * Hhmmss
     */
    public static final String SERVICO_HORARIO = "SERVICO_HORARIO";
    /**
     * PUL – Pulsos.<br/>
     * ASS – Assinatura.<br/>
     * ALU – Aluguel de LP.<br/>
     * TER – Servs de Terceiros ( FNG, 0900, 300, etc).<br/>
     * CIA – Servs da Cia Telefônica (Videotexto, Instalação, visita não produtiva etc).<br/>
     * Tamanho 3
     */
    public static final String SERVICO_CATEGORIA_GRUPO = "SERVICO_CATEGORIA_GRUPO";
    public static final String SERVICO_CATEGORIA_GRUPO_DESCRICAO = "SERVICO_CATEGORIA_GRUPO_DESCRICAO";//30
    /**
     * 090 – Serviços 0900.<br/>
     * 900 – Serviços 900.<br/>
     * 300 – Serviços 300.<br/>
     * FNG – Fonegrama.<br/>
     * VNP- Visita não Produtiva VDT – videotexto.<br/>
     * etc..
     */
    public static final String SERVICO_CATEGORIA = "SERVICO_CATEGORIA";
    public static final String SERVICO_CATEGORIA_DESCRICAO = "SERVICO_CATEGORIA_DESCRICAO";//40
    public static final String SERVICO_VALOR_SINAL = "SERVICO_VALOR_SINAL"; //Tamanho 1
    public static final String VALOR_COM_IMPOSTOS = "VALOR_COM_IMPOSTOS"; //13,2
    /**
     * Numerico Tamanhho 5
     */
    public static final String SERVICO_CLASSE_SERVICO = "SERVICO_CLASSE_SERVICO";
    public static final String FILLER = "FILLER";

    public ContaEletronicaServico() {
        setName("Conta Eletronica - Serviço");
        addFieldArchetype(TIPO_REGISTRO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(SEQUENCIAL, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(VENCIMENTO, new FieldDateFixedLengthArchetype("yyyyMMdd"));
        addFieldArchetype(EMISSAO, new FieldDateFixedLengthArchetype("yyyyMMdd"));

        addFieldArchetype(IDENTIFICADOR_UNICO_RECURSO, new FieldStringFixedLengthArchetype(25));
        
        FieldArchetype fa = new FieldIntegerFixedLengthArchetype(5);
        fa.setAcceptNullable(true);
        addFieldArchetype(CODIGO_NACIONAL_LOCALIDADE, fa);
        addFieldArchetype(DDD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(TELEFONE_NUMERO, new FieldStringFixedLengthArchetype(10));

        addFieldArchetype(RECURSO_CARACTERISTICA, new FieldStringFixedLengthArchetype(15));
        
        fa = new FieldDateFixedLengthArchetype("yyyyMMdd");
        fa.setAcceptNullable(true);
        addFieldArchetype(SERVICO_DATA, fa);
        addFieldArchetype(SERVICO_LOCALIDADE_CNL, new FieldStringFixedLengthArchetype(5));
        addFieldArchetype(SERVICO_LOCALIDADE_NOME, new FieldStringFixedLengthArchetype(25));
        addFieldArchetype(SERVICO_LOCALIDADE_UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SERVICO_NACIONAL_INTERNACIONAL, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SERVICO_OPERADORA_CODIGO, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SERVICO_OPERADORA_NOME, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(SERVICO_PAIS_CODIGO, new FieldStringFixedLengthArchetype(3));
        
        addFieldArchetype(SERVICO_DDD, new FieldStringFixedLengthArchetype(4));
        addFieldArchetype(SERVICO_TELEFONE, new FieldStringFixedLengthArchetype(10));
        addFieldArchetype(SERVICO_CONJUGADO, new FieldStringFixedLengthArchetype(2));
        
        fa = new FieldDecimalFixedLengthArchetype(6,1);
        fa.setNullableRepresentation("      ");
        
        addFieldArchetype(SERVICO_DURACAO, fa);
        fa = new FieldTimeFixedLengthArchetype();
        fa.setNullableRepresentation("      ");
        addFieldArchetype(SERVICO_HORARIO, fa);
        addFieldArchetype(SERVICO_CATEGORIA_GRUPO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SERVICO_CATEGORIA_GRUPO_DESCRICAO, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(SERVICO_CATEGORIA, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(SERVICO_CATEGORIA_DESCRICAO, new FieldStringFixedLengthArchetype(40));
        
        addFieldArchetype(SERVICO_VALOR_SINAL, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(VALOR_COM_IMPOSTOS, new FieldDecimalFixedLengthArchetype(13,2));
        addFieldArchetype(SERVICO_CLASSE_SERVICO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(FILLER, new FieldFillerArchetype(74, ' '));
    }
}
