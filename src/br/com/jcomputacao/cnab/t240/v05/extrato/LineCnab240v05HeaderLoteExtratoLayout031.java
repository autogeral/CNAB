package br.com.jcomputacao.cnab.t240.v05.extrato;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v05HeaderLoteExtratoLayout031  extends LineArchetype{

    
    /**
     * 01
     * CODIGO DO BANCO NA COMPENSAÇÃO<br>
     * POSIÇÃO: 1 a 3<br>
     * FORMATO: NUM<br>
     * DEFAULT: '001'
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";

    /**
     * 02
     * LOTE DE SERVICO<br>
     * POSIÇÃO: 4 a 7<br>
     * FORMATO: NUM
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";

    /**
     * 03
     * TIPO DE REGISTRO<br>
     * POSIÇÃO: 8 a 8<br>
     * FORMATO: NUM<br>
     * DEFAULT: '1'
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";

    /**
     * 04
     * TIPO DA OPERACAO<br>
     * POSIÇÃO: 9 a 9<br>
     * FORMATO: ALFA<br>
     */
    public static final String TIPO_OPERACAO = "TIPO_OPERACAO";

    /**
     * 05
     * TIPO DO SERVICO<br>
     * POSIÇÃO: 10 a 11<br>
     * FORMATO: NUM
     * DEFAULT: '04'
     * '01' = Cobrança
     * '03' = Bloqueto Eletrônico
     * '04' = Conciliação Bancária
     * '05' = Débitos
     * '06' = Custódia de Cheques
     * '07' = Gestão de Caixa
     * '08' = Consulta/Informação Margem
     * '09' = Averbação da Consignação/Retenção
     * '10' = Pagamento Dividendos
     * ‘11’ = Manutenção da Consignação
     * ‘12’ = Consignação de Parcelas
     * ‘13’ = Glosa da Consignação (INSS)
     * ‘14’ = Consulta de Tributos a pagar
     * '20' = Pagamento Fornecedor
     * ‘22’ = Pagamento de Contas, Tributos e Impostos
     * ‘25’ = Compror
     * ‘26’ = Compror Rotativo
     * '29' = Alegação do Sacado
     * '30' = Pagamento Salários
     * ‘32’ = Pagamento de honorários
     * ‘33’ = Pagamento de bolsa auxílio
     * ‘34’ = Pagamento de prebenda (remuneração a padres e sacerdotes)
     * '40' = Vendor
     * '41' = Vendor a Termo
     * '50' = Pagamento Sinistros Segurados
     * '60' = Pagamento Despesas Viajante em Trânsito
     * '70' = Pagamento Autorizado
     * '75' = Pagamento Credenciados
     * ‘77’ = Pagamento de Remuneração
     * '80' = Pagamento Representantes / Vendedores Autorizados
     * '90' = Pagamento Benefícios
     * '98' = Pagamentos Diversos
     */
    public static final String TIPO_SERVICO = "TIPO_SERVICO";
    /**
     * 06
     * FORMA DE LANCAMENTO<br>
     * POSIÇÃO: 12 a 13<br>
     * FORMATO: NUM
     * DEFAULT: '40'
     * '01' = Crédito em Conta Corrente / Conta Salário
     * '02' = Cheque Administrativo
     * '03' = DOC / TED
     * '10' = Recibo (OP à Disposição)
     * ‘11’ = Pagamento de Contas e ou Tributos com Código de Barras
     * ‘16’ = Tributo - DARF Normal
     * ‘17’ = Tributo - GPS (Guia da Previdência Social)
     * ‘18’ = Tributo - DARF Simples
     * '41' = TED – Outra Titularidade (1)
     * '43' = TED – Mesma Titularidade (1)
     */
    public static final String FORMA_LANCAMENTO = "FORMA_LANCAMENTO";
    /**
     * 07
     * LAYOUT <br>
     * POSICAO 14 A 16 <br>
     * DEFAULT '031'
     */
    public static final String LAYOUT = "LAYOUT";
    /**
     * 08
     * BRANCOS - COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 17 a 17<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String BRANCOS = "BRANCOS";
    /**
     * 09
     * TIPO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 18 a 18<br>
     * FORMATO: NUM
     * '1' - CPF
     * '2' - CNPJ
     */
    public static final String TIPO_INSCRICAO_EMPRESA = "TIPO_INSCRICAO_EMPRESA";
    /**
     * 10
     * NUMERO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 19 a 32<br>
     * FORMATO: NUM
     */
    public static final String NUM_INSCRICAO_EMPRESA = "NUM_INSCRICAO_EMPRESA";
    /**
     * 11
     * TIPO DE CONTA<br>
     * posicao: 33 a 36<br>
     * FORMATO: ALFA
     */
    public static final String TIPO_CONTA = "TIPO_CONTA";
    /**
     * 12
     * BRANCOS - COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 33  A 47<br>
     * FORMATO: ALFA
     */
    public static final String BRANCOS2 = "BRANCOS2";
    /**
     * 13
     * CODIGO DO CONVENIO NO BANCO<br>
     * POSIÇÃO: 48 a 52<br>
     * FORMATO: ALFA
     */
    public static final String CONVENIO = "CONVENIO";
    /**
     * 14
     * ZEROS - COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 53 A 53<br>
     * FORMATO: NUM
     * DEFAULT '0'
     */
    public static final String ZEROS = "ZEROS";
    /**
     * 15
     * AGENCIA MANTENEDORA DA CONTA<br>
     * POSIÇÃO: 54 a 57<br>
     * FORMATO: NUM
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * 16
     * DIGITO VERIFICADOR DA AGENCIA<br>
     * POSIÇÃO: 58 a 58<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    /**
     * 17
     * ZEROS
     * POSIÇÃO: 59 A 65<br>
     * FORMATO: NUM<br>
     * DEFAULT '0000000'
     */
    public static final String ZEROS2 = "ZEROS2";
    /**
     * 18
     * NUMERO DA CONTA CORRENTE<br>
     * POSIÇÃO: 66 a 70<br>
     * FORMATO: NUM
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";
    /**
     * 19
     * BRANCOS
     * POSICÃO: 71 A 71<br>
     * FORMATO: ALFA<br>
     * DEFAULT BRANCOS
     */
    public static final String BRANCOS3 = "BRANCOS3";
    /**
     * 20
     * DIGITO VERIFICADOR AG/CONTA<br>
     * POSIÇÃO: 72 a 72<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";

    /**
     * 21
     * NOME DA EMPRESA<br>
     * POSIÇÃO: 73 a 102<br>
     * FORMATO: ALFA
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * 22
     * BRANCOS<br>
     * POSIÇÃO: 103 a 142<br>
     * FORMATO: ALFA
     */
    public static final String BRANCOS4 = "BRANCOS4";
    /**
     * 23
     * DATA INICIAL<br>
     * POSICAO: 143 A 150<br>
     * FORMATO: DDMMYYYY
     */
    public static final String DATA_SALDO_INICIAL = "DATA_SALDO_INICIAL";
    /**
     * 24
     * VALOR INICIAL<br>
     * POSICAO: 151  A 168<br>
     * FORMATO: 9(16)V9(2)
     */
    public static final String VALOR_SALDO_INICIAL = "VALOR_SALDO_INICIAL";
    /**
     * 25
     * SITUAÇÃO INICIAL<br>
     * POSIÇÃO: 169 A 169<br>
     * D - DEVEDOR
     * C - CREDOR
     */
    public static final String SITUACAO_INICIAL = "SITUACAO_INICIAL";
    /**
     * 26
     * STATUS INICIAL<br>
     * POSIÇÃO: 170 A 170<br>
     * P - PARCIAL
     * F - FINAL
     */
    public static final String STATUS_INICIAL = "STATUS_INICIAL";
    /**
     * 27
     * TIPO DE MOEDA<br>
     * POSIÇÃO: 171 A 173<br>
     * DEFAULT 'BRL'
     */
    public static final String TIPO_MOEDA = "TIPO_MOEDA";
    /**
     * 28
     * SEQUENCIA EXTRATO<br>
     * POSIÇÃO: 174 A 178<br>
     */
    public static final String SEQUENCIA_EXTRATO = "SEQUENCIA_EXTRATO";    
    /**
     * 29
     * BRANCOS - COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 179 A 240<br>
     * DEFAULT BRANCOS
     */
    public static final String BRANCOS5 = "BRANCOS5";
    
    public LineCnab240v05HeaderLoteExtratoLayout031 (){
        setName("CNAB 240 v5.0 - Header do lote - layout 031");
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        //02
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("1"));
        //04
        addFieldArchetype(TIPO_OPERACAO, new FieldStringFixedLengthArchetype(1));
        //05
        addFieldArchetype(TIPO_SERVICO, new FieldIntegerFixedLengthArchetype(2));
        //06
        addFieldArchetype(FORMA_LANCAMENTO, new FieldIntegerFixedLengthArchetype(2));
        //07
        addFieldArchetype(LAYOUT, new FieldStringFixedLengthArchetype(3));
        //08
        addFieldArchetype(BRANCOS, new FieldDefaultArchetype(" "));
        //09
        addFieldArchetype(TIPO_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(NUM_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(14));
        //11
        addFieldArchetype(TIPO_CONTA, new FieldStringFixedLengthArchetype(4));
        //12
        addFieldArchetype(BRANCOS2, new FieldStringFixedLengthArchetype(11));
        //13
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(5));
        //14
        addFieldArchetype(ZEROS, new FieldDefaultArchetype("0"));
        //15
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(4));
        //16
        addFieldArchetype(DIGITO_VER_AGENCIA,  new FieldStringFixedLengthArchetype(1));
        //17
        addFieldArchetype(ZEROS2, new FieldDefaultArchetype("0000000"));
        //18
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(5));
        //19
        addFieldArchetype(BRANCOS3, new FieldDefaultArchetype(" "));
        //20
        addFieldArchetype(DIGITO_VER_AG_CONTA, new FieldStringFixedLengthArchetype(1));
        //21
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //22
        addFieldArchetype(BRANCOS4, new FieldFillerArchetype(40, ' '));
        //23
        addFieldArchetype(DATA_SALDO_INICIAL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //24
        addFieldArchetype(VALOR_SALDO_INICIAL, new FieldDecimalFixedLengthArchetype(18, 2));
        //25
        addFieldArchetype(SITUACAO_INICIAL, new FieldStringFixedLengthArchetype(1));
        //26
        addFieldArchetype(STATUS_INICIAL, new FieldStringFixedLengthArchetype(1));
        //27
        addFieldArchetype(TIPO_MOEDA, new FieldStringFixedLengthArchetype(3));
        //28
        addFieldArchetype(SEQUENCIA_EXTRATO, new FieldIntegerFixedLengthArchetype(5));
        //29
        addFieldArchetype(BRANCOS5, new FieldStringFixedLengthArchetype(62));

    }
}
