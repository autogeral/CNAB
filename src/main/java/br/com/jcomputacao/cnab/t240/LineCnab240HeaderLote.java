package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author David
 */
public class LineCnab240HeaderLote extends LineArchetype {

    /**
     * CODIGO DO BANCO NA COMPENSAÇÃO<br>
     * POSIÇÃO: 1 a 3<br>
     * FORMATO: NUM<br>
     * DEFAULT: '001'
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";

    /**
     * LOTE DE SERVICO<br>
     * POSIÇÃO: 4 a 7<br>
     * FORMATO: NUM
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";

    /**
     * TIPO DE REGISTRO<br>
     * POSIÇÃO: 8 a 8<br>
     * FORMATO: NUM<br>
     * DEFAULT: '1'
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";

    /**
     * TIPO DA OPERACAO<br>
     * POSIÇÃO: 9 a 9<br>
     * FORMATO: ALFA<br>
     */
    public static final String TIPO_OPERACAO = "TIPO_OPERACAO";

    /**
     * TIPO DO SERVICO<br>
     * POSIÇÃO: 10 a 11<br>
     * FORMATO: NUM
     * DEFAULT: '01'
     * '01' = Cobrança
'03' = Bloqueto Eletrônico
'04' = Conciliação Bancária
'05' = Débitos
'06' = Custódia de Cheques
'07' = Gestão de Caixa
'08' = Consulta/Informação Margem
'09' = Averbação da Consignação/Retenção
'10' = Pagamento Dividendos
‘11’ = Manutenção da Consignação
‘12’ = Consignação de Parcelas
‘13’ = Glosa da Consignação (INSS)
‘14’ = Consulta de Tributos a pagar
'20' = Pagamento Fornecedor
‘22’ = Pagamento de Contas, Tributos e Impostos
‘25’ = Compror
‘26’ = Compror Rotativo
'29' = Alegação do Sacado
'30' = Pagamento Salários
‘32’ = Pagamento de honorários
‘33’ = Pagamento de bolsa auxílio
‘34’ = Pagamento de prebenda (remuneração a padres e sacerdotes)
'40' = Vendor
'41' = Vendor a Termo
'50' = Pagamento Sinistros Segurados
'60' = Pagamento Despesas Viajante em Trânsito
'70' = Pagamento Autorizado
'75' = Pagamento Credenciados
‘77’ = Pagamento de Remuneração
'80' = Pagamento Representantes / Vendedores Autorizados
'90' = Pagamento Benefícios
'98' = Pagamentos Diversos
     */
    public static final String TIPO_SERVICO = "TIPO_SERVICO";
    
    /**
     * FORMA DE LANCAMENTO<br>
     * POSIÇÃO: 10 a 11<br>
     * FORMATO: NUM
     * DEFAULT: '01'
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
     * ou
     * CNAB - usp exclusivo CNAB
     */
    public static final String FORMA_LANCAMENTO = "FORMA_LANCAMENTO";

    /**
     * USO EXCLUSIVO DA FEBRABAN<br>
     * POSIÇÃO: 12 a 13<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";

    /**
     * NUM. DA VERSAO DO LAYOUT DO LOTE<br>
     * POSIÇÃO: 14 a 16<br>
     * FORMATO: NUM<br>
     * DEFAULT: '045'
     */
    public static final String VERSAO_LAYOUT_LOTE = "VERSAO_LAYOUT_LOTE";


    /**
     * TIPO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 18 a 18<br>
     * FORMATO: NUM
     */
    public static final String TIPO_INSCRICAO_EMPRESA = "TIPO_INSCRICAO_EMPRESA";

    /**
     * NUMERO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 19 a 33<br>
     * FORMATO: NUM
     */
    public static final String NUM_INSCRICAO_EMPRESA = "NUM_INSCRICAO_EMPRESA";

    /**
     * CODIGO DO CONVENIO NO BANCO<br>
     * POSIÇÃO: 34 a 53<br>
     * FORMATO: ALFA
     */
    public static final String CODIGO_CONVENIO = "CODIGO_CONVENIO";

    /**
     * AGENCIA MANTENEDORA DA CONTA<br>
     * POSIÇÃO: 54 a 58<br>
     * FORMATO: NUM
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";

    /**
     * DIGITO VERIFICADOR DA AGENCIA<br>
     * POSIÇÃO: 59 a 59<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";

    /**
     * NUMERO DA CONTA CORRENTE<br>
     * POSIÇÃO: 60 a 71<br>
     * FORMATO: NUM
     */
    public static final String NUMERO_CONTA_COR = "NUMERO_CONTA_COR";

    /**
     * DIGITO VERIFICADOR CONTA<br>
     * POSIÇÃO: 72 a 72<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_CONTA = "DIGITO_VER_CONTA";

    /**
     * DIGITO VERIFICADOR AG/CONTA<br>
     * POSIÇÃO: 73 a 73<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";

    /**
     * NOME DA EMPRESA<br>
     * POSIÇÃO: 74 a 103<br>
     * FORMATO: ALFA
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";

    /**
     * INFORMACAO 1<br>
     * POSIÇÃO: 104 a 143<br>
     * FORMATO: ALFA
     */
    public static final String INFORMACAO_1 = "INFORMACAO_1";

    /**
     * INFORMACAO 2<br>
     * POSIÇÃO: 144 a 183<br>
     * FORMATO: ALFA
     */
    public static final String INFORMACAO_2 = "INFORMACAO_2";

//    /**
//     * NUM. REMESSA/RETORNO<br>
//     * POSIÇÃO: 184 a 191<br>
//     * FORMATO: NUM<br>
//     */
//     public static final String NUM_REMESSA_RETORNO = "NUM_REMESSA_RETORNO";

    /**
     * DATA DE GRAVACAO REMESSA/RETORNO<br>
     * POSIÇÃO: 192 a 199<br>
     * FORMATO: NUM<br>
     */
     public static final String DATA_GRAVACAO_REMESSA_RETORNO = "DATA_GRAVACAO_REMESSA_RETORNO";

//    /**
//     * DATA DO CREDITO<br>
//     * POSIÇÃO: 200 a 207<br>
//     * FORMATO: NUM<br>
//     */
//     public static final String DATA_CREDITO = "DATA_CREDITO";

    /**
     * USO EXCLUSIVO DA FEBRABAN<br>
     * POSIÇÃO: 208 a 240<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";
     
     public static final String LOGRADOURO = "LOGRADOURO";
     public static final String NUMERO = "NUMERO";
     public static final String COMPLEMENTO = "COMPLEMENTO";
     public static final String CIDADE = "CIDADE";
     public static final String CEP = "CEP";
     public static final String SUFIXO_CEP = "SUFIXO_CEP";
     public static final String ESTADO = "ESTADO";
     public static final String OCORRENCIAS = "OCORRENCIAS";

     public LineCnab240HeaderLote() {
         
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
        addFieldArchetype(VERSAO_LAYOUT_LOTE, new FieldStringFixedLengthArchetype(3));
        //08
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldDefaultArchetype(" "));
        //09
        addFieldArchetype(TIPO_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(NUM_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(14));
        //11
        addFieldArchetype(CODIGO_CONVENIO, new FieldStringFixedLengthArchetype(20));
        //12
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        //13
        FieldStringFixedLengthArchetype fa1 = new FieldStringFixedLengthArchetype(1);
        fa1.setNullableRepresentation(" ");
        addFieldArchetype(DIGITO_VER_AGENCIA, fa1);
        //14
        addFieldArchetype(NUMERO_CONTA_COR, new FieldIntegerFixedLengthArchetype(12));
        //15
        addFieldArchetype(DIGITO_VER_CONTA, new FieldStringFixedLengthArchetype(1));
        //16
        addFieldArchetype(DIGITO_VER_AG_CONTA, fa1);
        //17
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //18
        addFieldArchetype(INFORMACAO_1, new FieldFillerArchetype(40, ' '));
        //19
        addFieldArchetype(LOGRADOURO, new FieldStringFixedLengthArchetype(30));
        //20
        addFieldArchetype(NUMERO, new FieldIntegerFixedLengthArchetype(5));
        //21
        addFieldArchetype(COMPLEMENTO, new FieldStringFixedLengthArchetype(15));
        //22
        addFieldArchetype(CIDADE, new FieldStringFixedLengthArchetype(20));
        //23
        addFieldArchetype(CEP, new FieldIntegerFixedLengthArchetype(5));
        //24
        FieldIntegerFixedLengthArchetype fif = new FieldIntegerFixedLengthArchetype(3);
        //fif.setNullableRepresentation("");
        addFieldArchetype(SUFIXO_CEP, fif);
        //25
        addFieldArchetype(ESTADO, new FieldStringFixedLengthArchetype(2));
        //26
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(8, ' '));
        //27
        FieldStringFixedLengthArchetype ocorrencias = new FieldStringFixedLengthArchetype(10);
        ocorrencias.setNullableRepresentation("");
        addFieldArchetype(OCORRENCIAS, ocorrencias);
    }
}
