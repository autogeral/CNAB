package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240SegmentoP extends LineArchetype {

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
     * SEQUENCIAL DE REGISTRO - NUMERICO
     * POSICAO 009 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * CODIGO DO SEGMENTO DE REGISTRO - DEFAULT P
     * POSICAO 014 014
     * CONTEUDO 'P'
     */
    public static final String CODIGO_SEGMENTO_REGISTRO = "CODIGO_SEGMENTO_REGISTRO";
    /**
     * EXCLUSIVO FEBRABAN - BRANCOS
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 015 015
     * CONTEUDO '  '
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * CODIGO DO MOVIMENTO DE REMESSA - NUMERICO
     * Códigos de Movimento para Remessa tratados pelo Banco do Brasil:
     * 01 – Entrada de títulos
     * 02 – Pedido de baixa
     * 04 – Concessão de Abatimento
     * 05 – Cancelamento de Abatimento
     * 06 – Alteração de Vencimento
     * 07 – Concessão de Desconto
     * 08 – Cancelamento de Desconto
     * 09 – Protestar
     * 10 – Cancela/Sustação da Instrução de protesto
     * 30 – Recusa da Alegação do Sacado
     * 31 – Alteração de Outros Dados
     * 40 – Alteração de Modalidade.
     * POSICAO 016 017
     * PICTURE 9(02)
     */
    public static final String CODIGO_MOVIMENTO_REMESSA = "CODIGO_MOVIMENTO_REMESSA";
    /**
     * AGENCIA MANTENEDORA
     * POSICAO 018 022
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * DIGITO VERIFICADOR DA AGENCIA
     * POSICAO 023 023
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA = "DIGITO_VERIFICADOR_AGENCIA";
    /**
     * NUMERO DA CONTA - NUMERICO 12
     * POSICAO 024 035
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    /**
     * DIGITO VERIFICADOR DA CONTA
     * POSICAO 036 036
     */
    public static final String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";
    /**
     * BRANCOS
     * POSICAO 037 037
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA_CONTA = "DIGITO_VERIFICADOR_AGENCIA_CONTA";
    /**
     * IDENTIFICACAO DO TITULO NO BANCO
     * POSICAO 038 057
     * 20 POSICOES
     */
    public static final String NOSSO_NUMERO = "NOSSO_NUMERO";
    /**
     * POSICAO 58
     **/
    public static final String CODIGO_CARTEIRA = "CODIGO_CARTEIRA";
    /**
     * POSICAO 59
     **/
    public static final String FORMA_CADASTRO_TITULO_BANCO = "FORMA_CADASTRO_TITULO_BANCO";
    /**
     * POSICAO 60
     * Código adotado pela FEBRABAN para identificar a existência material do documento no processo. Domínio:
     * '1' = Tradicional
     * '2' = Escritural
     **/
    public static final String TIPO_DOCUMENTO = "TIPO_DOCUMENTO";
    /**
     * POSICAO 61
     **/
    public static final String IDENTIFICACAO_EMISSAO_BLOQUETO = "IDENTIFICACAO_EMISSAO_BLOQUETO";
    /**
     * POSICAO 62
     * '1' = Banco Distribui
     * '2' = Cliente Distribui
     * ‘3’ = Banco envia e-mail
     * ‘4’ = Banco envia SMS
     */
    public static final String IDENTIFICACAO_DISTRIBUICAO = "IDENTIFICACAO_DISTRIBUICAO";
    /**
     * POSICAO 63 A 77
     */
    public static final String NUMERO_DOCUMENTO_COBRANCA = "NUMERO_DOCUMENTO_COBRANCA";
    /**
     * "A Vista" Preencher com 11111111
     * "Contra-apresentação" Preencher com 99999999
     * POSICAO 78 A 85
     */
    public static final String DATA_VENCIMENTO_TITULO = "DATA_VENCIMENTO_TITULO";
    /**
     * POSICAO 86 A 100
     */
    public static final String VALOR_NOMINAL_TITULO = "VALOR_NOMINAL_TITULO";
    /**
     * POSICAO 101 A 105
     */
    public static final String AGENCIA_COBRADORA = "AGENCIA_COBRADORA";
    /**
     * DIGITO_VERIFICADOR_AGENCIA_COBRADORA
     * POSICAO 106 106
     * 1 POSICAO
     */
    public static final String DIGITO_VERIFICADOR_AGENCIA_COBRADORA = "DIGITO_VERIFICADOR_AGENCIA_COBRADORA";
    /**
     * ESPECIE_TITULO
     * POS 107 A 108
     * 01 - CH Cheque
     * 02 - DM Duplicata Mercantil
     * 03 - DMI Duplicata Mercantil p/ Indicação
     * 04 - DS Duplicata de Serviço
     * 05 - DSI Duplicata de Serviço p/ Indicação
     * 06 - DR Duplicata Rural
     * 07 - LC Letra de Câmbio
     * 08 - NCC Nota de Crédito Comercial
     * 09 - NCE Nota de Crédito a Exportação
     * 10 - NCI Nota de Crédito Industrial
     * 11 - NCR Nota de Crédito Rural
     * 12 - NP Nota Promissória
     * 13 - NPR Nota Promissória Rural
     * 14 - TM Triplicata Mercantil
     * 15 - TS Triplicata de Serviço
     * 16 - NS Nota de Seguro
     * 17 - RC Recibo
     * 18 - FAT Fatura
     * 19 - ND Nota de Débito
     * 20 - AP Apólice de Seguro
     * 21 - ME Mensalidade Escolar
     * 22 - PC Parcela de Consórcio
     * 23 - NF Nota Fiscal
     * 24 - DD Documento de Dívida
     * 25 - Cédula de Produto Rural
     * 26 = Warrant
     * 27 = Dívida Ativa de Estado
     * 28 = Dívida Ativa de Município
     * 29 = Dívida Ativa da União
     * 30 = Encargos condominiais
     * 99 - Outros
     */
    public static final String ESPECIE_TITULO = "ESPECIE_TITULO";

    /**
     * posicao 109
     * Código adotado pela FEBRABAN para identificar se o título de cobrança foi aceito (reconhecimento da dívida pelo Sacado).
     * Domínio:
     * 'A' = Aceite 'N' = Não Aceite
     */
    public static final String TITULO_ACEITO = "TITULO_ACEITO";
    /**
     * 110 A 117
     */
    public static final String DATA_EMISSAO_TITULO = "DATA_EMISSAO_TITULO";
    /**
     * POSICAO 118
     * '1' = Valor por Dia
     * '2' = Taxa Mensal
     * '3' = Isento
     */
    public static final String CODIGO_JUROS_MORA = "CODIGO_JUROS_MORA";
    /**
     * 119 A 126
     * Caso nao seja informada entao sera assumida a data de vencimento
     */
    public static final String DATA_JUROS_MORA = "DATA_JUROS_MORA";
    // 127 A 141
    public static final String JUROS_MORA_POR_DIA = "JUROS_MORA_POR_DIA";
    //142
    public static final String CODIGO_DESCONTO_1 = "CODIGO_DESCONTO_1";
    /**
     * DATA_DESCONTO_1
     * 143 A 150
     * '1' = Valor Fixo Até a Data Informada
     * '2' = Percentual Até a Data Informada
     * '3' = Valor por Antecipação Dia Corrido
     **/
    public static final String DATA_DESCONTO_1 = "DATA_DESCONTO_1";
    //151 A 165
    public static final String VALOR_PERCENTUAL_DESCONTO_1 = "VALOR_PERCENTUAL_DESCONTO_1";
    //166 A 180
    public static final String VALOR_IOF = "VALOR_IOF";
    //182 A 195
    public static final String VALOR_ABATIMENTO = "VALOR_ABATIMENTO";
    //196 A 220
    public static final String IDENTIFICACAO_TITULO_EMPRESA = "IDENTIFICACAO_TITULO_EMPRESA";
    /**
     * CODIGO_PARA_PROTESTO
     * '1' = Protestar Dias Corridos
     * '2' = Protestar Dias Úteis
     * '3' = Não Protestar
     * ‘4’ = Protestar Fim Falimentar - Dias Úteis
     * ‘5’ = Protestar Fim Falimentar - Dias Corridos
     * ‘8’ = Negativação sem Protesto
     * '9' = Cancelamento Protesto Automático (somente válido p/ CódigoMovimento Remessa = '31' - Descrição C004)
     * 221
     **/
    public static final String CODIGO_PARA_PROTESTO = "CODIGO_PARA_PROTESTO";
    //222 A 223
    public static final String PRAZO_PARA_PROTESTO = "PRAZO_PARA_PROTESTO";
    /**
     * CODIGO_BAIXA_DEVOLUCAO
     * Posicao 224
     * '1' = Baixar / Devolver
     * '2' = Não Baixar / Não Devolver
     * '3' = Cancelar Prazo para Baixa / Devolução (somente válido p/ CódigoMovimento Remessa = '31' - Descrição C004)
     */
    
    public static final String CODIGO_PARA_BAIXA_DEVOLUCAO = "CODIGO_PARA_BAIXA_DEVOLUCAO";
    //225 a 227
    public static final String PRAZO_PARA_BAIXA_DEVOLUCAO = "PRAZO_PARA_BAIXA_DEVOLUCAO";
    /**
     * Posição de 228 a 229
     * '01' = Reservado para Uso Futuro
     * '02' = Dólar Americano Comercial (Venda)
     * '03' = Dólar Americano Turismo (Venda)
     * '04' = ITRD
     * '05' = IDTR
     * '06' = UFIR Diária
     * '07' = UFIR Mensal
     * '08' = FAJ-TR
     * '09' = Real
     * '10' = TR
     * '11' = IGPM
     * '12' = CDI
     * '13' = Percentual do CDI
     * ‘14’ = Euro
     **/
    public static final String CODIGO_MOEDA = "CODIGO_MOEDA";
    //230 A 239
    public static final String NUMERO_CONTRATO = "NUMERO_CONTRATO";
    //240
    public static final String CAMPO_EXCLUSIVO_CNAB = "CAMPO_EXCLUSIVO_CNAB";

    public LineCnab240SegmentoP() {
        setName("CNAB BB - Segmento P");
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldStringFixedLengthArchetype(3));//4
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));//7
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));//8
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));//13
        addFieldArchetype(CODIGO_SEGMENTO_REGISTRO, new FieldDefaultArchetype("P"));//14
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldDefaultArchetype(" "));//15
        addFieldArchetype(CODIGO_MOVIMENTO_REMESSA, new FieldIntegerFixedLengthArchetype(2));//17
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));//22
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA, new FieldStringFixedLengthArchetype(1));//23
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));//35
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA, new FieldStringFixedLengthArchetype(1));//36
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA_CONTA, new FieldStringFixedLengthArchetype(1));//37
        addFieldArchetype(NOSSO_NUMERO, new FieldStringFixedLengthArchetype(20));//Nosso numero 57
        addFieldArchetype(CODIGO_CARTEIRA, new FieldIntegerFixedLengthArchetype(1)); //58
        addFieldArchetype(FORMA_CADASTRO_TITULO_BANCO, new FieldIntegerFixedLengthArchetype(1));//59
        addFieldArchetype(TIPO_DOCUMENTO, new FieldIntegerFixedLengthArchetype(1));//60
        addFieldArchetype(IDENTIFICACAO_EMISSAO_BLOQUETO, new FieldIntegerFixedLengthArchetype(1));//61
        addFieldArchetype(IDENTIFICACAO_DISTRIBUICAO, new FieldStringFixedLengthArchetype(1));//62
        addFieldArchetype(NUMERO_DOCUMENTO_COBRANCA, new FieldStringFixedLengthArchetype(15));//Numero de documento 77
        addFieldArchetype(DATA_VENCIMENTO_TITULO, new FieldDateFixedLengthArchetype("ddMMyyyy")); //85
        addFieldArchetype(VALOR_NOMINAL_TITULO, new FieldDecimalFixedLengthArchetype(15, 2)); //100
        addFieldArchetype(AGENCIA_COBRADORA, new FieldIntegerFixedLengthArchetype(5));//105
        addFieldArchetype(DIGITO_VERIFICADOR_AGENCIA_COBRADORA, new FieldStringFixedLengthArchetype(1));//106
        addFieldArchetype(ESPECIE_TITULO, new FieldIntegerFixedLengthArchetype(2));//108
        addFieldArchetype(TITULO_ACEITO, new FieldStringFixedLengthArchetype(1));//109
        addFieldArchetype(DATA_EMISSAO_TITULO, new FieldDateFixedLengthArchetype("ddMMyyyy"));//117
        addFieldArchetype(CODIGO_JUROS_MORA, new FieldIntegerFixedLengthArchetype(1));//118
        addFieldArchetype(DATA_JUROS_MORA, new FieldDateFixedLengthArchetype("ddMMyyyy"));//126
        addFieldArchetype(JUROS_MORA_POR_DIA, new FieldDecimalFixedLengthArchetype(15, 2));//141
        addFieldArchetype(CODIGO_DESCONTO_1, new FieldIntegerFixedLengthArchetype(1));//142
        addFieldArchetype(DATA_DESCONTO_1, new FieldIntegerFixedLengthArchetype(8));//150
        addFieldArchetype(VALOR_PERCENTUAL_DESCONTO_1, new FieldDecimalFixedLengthArchetype(15, 2));//165
        addFieldArchetype(VALOR_IOF, new FieldDecimalFixedLengthArchetype(15, 2));//180
        addFieldArchetype(VALOR_ABATIMENTO, new FieldDecimalFixedLengthArchetype(15, 2));//195
        addFieldArchetype(IDENTIFICACAO_TITULO_EMPRESA, new FieldStringFixedLengthArchetype(25));//220
        addFieldArchetype(CODIGO_PARA_PROTESTO, new FieldIntegerFixedLengthArchetype(1));//221
        addFieldArchetype(PRAZO_PARA_PROTESTO, new FieldIntegerFixedLengthArchetype(2));//223
        addFieldArchetype(CODIGO_PARA_BAIXA_DEVOLUCAO, new FieldIntegerFixedLengthArchetype(1));//224
        addFieldArchetype(PRAZO_PARA_BAIXA_DEVOLUCAO, new FieldIntegerFixedLengthArchetype(3));//227
        addFieldArchetype(CODIGO_MOEDA, new FieldIntegerFixedLengthArchetype(2));//229
        addFieldArchetype(NUMERO_CONTRATO, new FieldIntegerFixedLengthArchetype(10));//239
        addFieldArchetype(CAMPO_EXCLUSIVO_CNAB, new FieldDefaultArchetype(" "));//240
        
    }
}
