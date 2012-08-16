package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240SegmentoG  extends LineArchetype {

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
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";
    /**
     * TIPO DE REGISTRO - DEFAULT 3
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";
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
     * CONTEUDO 'G'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014
     * CONTEUDO ' '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * CODIGO DE MOVIMENTO DE RETORNO
     * Códigos de movimento de retorno, informados pelo Banco do Brasil:
     * /01/ - Entrada de Titulos
     * /02/ - Pedido de Baixa
     * /04/ - Concessao de Abatimento
     * /05/ - Cancelamento de Abatimento
     * /06/ - Alteracao no Vencimento
     * /07/ - Concessao de Desconto
     * /08/ - Cancelamento de Desconto
     * /09/ - Protestar
     * /10/ - Sustar Protesto e Baixar Titulo
     * /11/ - Sustar Protesto e Manter em Carteira
     * POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
    /**
     * CODIGO DE BARRAS - CAMPO PARA O BANCO DESTINATARIO
     * 3 ESPACOS
     * POSICAO 018 020
     */
    public static final String CODIGO_BARRAS_BANCO_DEST = "CODIGO_BARRAS_BANCO_DEST";
    /**
     * CODIGO DE BARRAS - CAMPO PARA O CODIGO DA MOEDA
     * POSICAO 021 021
     * PICTURE 9(01)
     */
    public static final String CODIGO_BARRAS_MOEDA = "CODIGO_BARRAS_MOEDA";
    /**
     * CODIGO DE BARRAS - DIGITO VERIFICADOR
     * POSICAO 022 022
     */
    public static final String CODIGO_BARRAS_DIG_VERIF = "CODIGO_BARRAS_DIG_VERIF";
    /**
     * CODIGO DE BARRAS - VALOR DO TITULO
     * POSICAO 023 036
     */
    public static final String CODIGO_BARRAS_VALOR_TITULO = "CODIGO_BARRAS_VALOR_TITULO";
    /**
     * CODIGO DE BARRAS - CAMPO LIVRE
     * POSICAO 037 061
     */
    public static final String CODIGO_BARRAS_CAMPO_LIVRE = "CODIGO_BARRAS_CAMPO_LIVRE";
    /**
     * INSCRICAO DO CEDENTE
     * 1 - CPF
     * 2 - CNPJ
     * POSICAO 062 062
     */
    public static final String INSCRICAO_CEDENTE = "INSCRICAO_CEDENTE";
    /**
     * NUMERO DE INSCRICAO DO CEDENTE
     * POSICAO 063 077
     */
    public static final String NUMERO_INSCRICAO_CEDENTE = "NUMERO_INSCRICAO_CEDENTE";
    /**
     * NOME DO CEDENTE
     * POSICAO 078 107
     */
    public static final String NOME_CEDENTE = "NOME_CEDENTE";
    /**
     * DATA VENCIMENTO DO TITULO
     * POSICAO 108 115
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    /**
     * VALOR NOMINAL DO TITULO
     * POSICAO 116 130
     */
    public static final String VALOR_NOMINAL = "VALOR_NOMINAL";
    /**
     * QUANTIDADE DE MOEDA
     * POSICAO 131 145
     */
    public static final String QUANTIDADE_MOEDA = "QUANTIDADE_MOEDA";
    /**
     * CODIGO DE MOEDA
     * /02/ - Dolar
     * /07/ - UFIR
     * /04/ - ITRD
     * /08/ - FAJTR
     * /05/ - IDTR
     * /09/ - REAL
     * POSICAO 146 147
     */
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";
    /**
     * NUMERO DO TITULO PARA CEDENTE
     * POSICAO 148 162
     */
    public static final String NUMERO_TITULO_CEDENTE = "NUMERO_TITULO_CEDENTE";
    /**
     * BRANCOS
     * POSICAO 163 163
     */
    public static final String BRANCOS = "BRANCOS";
    /**
     * VALOR DO ABATIMENTO
     * POSICAO 164 178
     */
    public static final String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";
    /**
     * CODIGO DA CARTEIRA
     * /1/ - Cobranca Simples
     * /3/ - Cobranca Caucionada
     * /2/ - Cobranca Vinculada
     * /4/ - Cobranca Descontada
     * POSICAO 179 179
     */
    public static final String CODIGO_DA_CARTEIRA = "CODIGO_DA_CARTEIRA";
    /**
     * ESPECIE DO TITULO
     * /01/ - CH Cheque
     * /02/ - DM Duplicata Mercantil
     * /03/ - DMI Duplicata Mercantil p/indicacao
     * /04/ - DS Duplicata de Servico
     * /05/ - DSI Duplicata de Servico p/indicacao
     * /06/ - DR Duplicata Rural
     * /07/ - LC Letra de Cambio
     * /08/ - NCC Nota de Credito Comercial
     * /09/ - NCE Nota de Credito a Exportacao
     * /10/ - NCI Nota de Credito Industrial
     * /11/ - NCR Nota de Credito Rural
     * /12/ - NP Nota Promissoria
     * /13/ - NPR Nota Promissoria Rural
     * /14/ - TM Triplicata Mercantil
     * /15/ - TS Triplicata de Servico
     * /16/ - NS Nota de Seguro
     * /17/ - RC Recibo
     * /18/ - FAT Fatura
     * /19/ - ND Nota de Debito
     * /20/ - AP Apolice de Seguro
     * /21/ - ME Mensalidade Escolar
     * /22/ - PC Parcela de Consorcio
     * /25/ - DAU Divida Ativa da Uniao
     * /26/ - DAE Divida Ativa de Estado
     * /27/ - DAM Divida Ativa de Municipio
     * /99/ - Outros
     * POSICAO 180 181
     */
    public static final String ESPECIE_TITULO = "ESPECIE_TITULO";
    /**
     * DATA DE EMISSAO DO TITULO
     * POSICAO 182 189
     */
    public static final String DATA_EMISSAO_TITULO = "DATA_EMISSAO_TITULO";
    /**
     * CNPJ DO SACADO NO TITULO
     * POSICAO 190 204
     */
    public static final String CNPJ_SACADO_TITULO = "CNPJ_SACADO_TITULO";
    /**
     * CODIGO DO DESCONTO
     * /1/ - Valor Fixo Ateh a Data Informada
     * /2/ - Percentual Ateh a Data Informada
     * /3/ - Valor por Antecipacao Dia Corrido
     * POSICAO 205 205
     */
    public static final String CODIGO_DESCONTO = "CODIGO_DESCONTO";
    /**
     * DATA DE DESCONTO NO TITULO
     * POSICAO 206 213
     */
    public static final String DATA_DESCONTO = "DATA_DESCONTO";
    /**
     * VALOR PERCENTUAL DESCONTO
     * POSICAO 214 228
     */
    public static final String VALOR_PERCENTUAL_DESCONTO = "VALOR_PERCENTUAL_DESCONTO";
    /**
     * INSTRUCAO PARA PROTESTO
     * /0/ - Nao Hah Instrucao Protesto
     * /1/ - Protestar Dias Corridos
     * /2/ - Protestar Dias Uteis
     * POSICAO 229 229
     */
    public static final String INSTRUCAO_PROTESTO = "INSTRUCAO_PROTESTO";
    /**
     * NUMERO DE DIAS PARA PROTESTO
     * POSICAO 230 231
     */
    public static final String NUMERO_DIAS_PROTESTO = "NUMERO_DIAS_PROTESTO";
    /**
     * DATA LIMITE PARA PAGAMENTO DO TITULO
     * POSICAO 232 239
     */
    public static final String DATA_LIMITE_PAGAMENTO = "DATA_LIMITE_PAGAMENTO";

    /**
     * USO EXCLUSIVO FEBRABAN
     * POSICAO 240 240
     * CONTEUDO BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";

    public LineCnab240SegmentoG() {

//*****************************Registro Segmento T****************************************
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("3"));
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("U"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(CODIGO_BARRAS_BANCO_DEST, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_BARRAS_MOEDA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_BARRAS_DIG_VERIF, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(CODIGO_BARRAS_VALOR_TITULO, new FieldDecimalFixedLengthArchetype(14, 2));
        addFieldArchetype(CODIGO_BARRAS_CAMPO_LIVRE, new FieldIntegerFixedLengthArchetype(25));
        addFieldArchetype(INSCRICAO_CEDENTE, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_INSCRICAO_CEDENTE, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(NOME_CEDENTE, new FieldStringFixedLengthArchetype(20));
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_NOMINAL, new FieldDecimalFixedLengthArchetype(15, 2));
        addFieldArchetype(QUANTIDADE_MOEDA, new FieldIntegerFixedLengthArchetype(10));
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(NUMERO_TITULO_CEDENTE, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(BRANCOS, new FieldDefaultArchetype(" "));
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(CODIGO_DA_CARTEIRA, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(ESPECIE_TITULO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DATA_EMISSAO_TITULO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CNPJ_SACADO_TITULO, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(CODIGO_DESCONTO, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DATA_DESCONTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VALOR_PERCENTUAL_DESCONTO, new FieldDecimalFixedLengthArchetype(15,2));
        addFieldArchetype(INSTRUCAO_PROTESTO, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_DIAS_PROTESTO, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(DATA_LIMITE_PAGAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldDefaultArchetype(" "));

    }
}