package br.com.jcomputacao.cnab.t240.v040.cobranca;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
/**
 *
 * @author Jennifer
 */
public class LineCnab240HeaderLoteCobranca extends LineArchetype{
    /**
     * 01
     * CODIGO DO BANCO NA COMPENSAÇÃO<br>
     * POSIÇÃO: 1 a 3<br>
     * FORMATO: NUM<br>
     * DEFAULT: '001'
     * 353 / 008 / 033
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
     * 06
     * CNAB - uso exclusivo CNAB
     * POSIÇÃO: 12 a 13<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";

    /**
     * 07
     * NUM. DA VERSAO DO LAYOUT DO LOTE<br>
     * POSIÇÃO: 14 a 16<br>
     * FORMATO: NUM<br>
     * DEFAULT: '040'
     */
    public static final String VERSAO_LAYOUT_LOTE = "VERSAO_LAYOUT_LOTE";

    /**
     * 08
     * RESERVADO <br>
     * POSIÇÃO: 17 a 17<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String RESERVADO = "RESERVADO";
     
    /**
     * 09
     * TIPO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 18 a 18<br>
     * FORMATO: NUM
     */
    public static final String TIPO_INSCRICAO_EMPRESA = "TIPO_INSCRICAO_EMPRESA";

    /**
     * 10
     * NUMERO DE INSCRICAO DA EMPRESA<br>
     * POSIÇÃO: 19 a 33<br>
     * FORMATO: NUM
     */
    public static final String NUM_INSCRICAO_EMPRESA = "NUM_INSCRICAO_EMPRESA";

    /**
     * 11
     * CODIGO DO CEDENTE<br>
     * POSIÇÃO: 34 a 42<br>
     * FORMATO: NUM
     */
    public static final String CODIGO_CEDENTE = "CODIGO_CEDENTE";

    /**
     * 12
     * RESERVADO USO BANCO<br>
     * POSIÇÃO: 43 a 53<br>
     * FORMATO: ALF
     */
    public static final String RESERVADO_USO_BANCO2 = "RESERVADO_USO_BANCO2";

    /**
     * 13
     * AGENCIA DO CEDENTE<br>
     * POSIÇÃO: 54 a 57<br>
     * FORMATO: ALFA
     */
    public static final String AGENCIA_CEDENTE = "AGENCIA_CEDENTE";

    /**
     * 14
     * DÍGITO DA AGÊNCIA DO CEDENTE<br>
     * POSIÇÃO: 58 a 58<br>
     * FORMATO: NUM
     */
    public static final String DIGITO_AGENCIA_CEDENTE = "DIGITO_AGENCIA_CEDENTE";

    /**
     * 15
     * NÚMERO DA CONTA DO CEDENTE<br>
     * POSIÇÃO: 59 a 67<br>
     * FORMATO: NUM
     */
    public static final String NUMERO_CONTA_CEDENTE = "NUMERO_CONTA_CEDENTE";

    /**
     * 16
     * DIGITO VERIFICADOR CONTA<br>
     * POSIÇÃO: 68 a 68<br>
     * FORMATO: ALFA
     */
    public static final String DIGITO_VER_CONTA = "DIGITO_VER_CONTA";
    
    /**
     * 17
     * RESERVADO USO BANCO
     * PISIÇÃO: 69 73
     * FORMATO: ALFA
     */
    public static final String RESERVADO_USO_BANCO3 = "RESERVADO_USO_BANCO3";
    
    /**
     * 18
     * NOME DA EMPRESA<br>
     * POSIÇÃO: 74 a 103<br>
     * FORMATO: ALFA
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";

    /**
     * 19
     * RESERVADO USO BANCO<br>
     * POSIÇÃO: 104 a 183<br>
     * FORMATO: ALFA
     */
    public static final String RESERVADO_USO_BANCO4 = "RESERVADO_USO_BANCO4";
    /**
     * 20
     * NUM. REMESSA/RETORNO<br>
     * POSIÇÃO: 184 a 191<br>
     * FORMATO: NUM<br>
     */
     public static final String NUM_REMESSA_RETORNO = "NUM_REMESSA_RETORNO";

    /**
     * 21
     * DATA DE GRAVACAO REMESSA/RETORNO<br>
     * POSIÇÃO: 192 a 199<br>
     * FORMATO: NUM<br>
     */
     public static final String DATA_GRAVACAO_REMESSA_RETORNO = "DATA_GRAVACAO_REMESSA_RETORNO";

     /**
     * RESERVADO<br>
     * POSIÇÃO: 200 a 240<br>
     * FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
     public static final String RESERVADO_USO_BANCO5 = "RESERVADO_USO_BANCO5";
    
    
    public LineCnab240HeaderLoteCobranca() {
        
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
        FieldStringFixedLengthArchetype f06 = new FieldStringFixedLengthArchetype(2);
        f06.setAcceptNullable(true);
        addFieldArchetype(RESERVADO_USO_BANCO, f06);
        //07
        addFieldArchetype(VERSAO_LAYOUT_LOTE, new FieldStringFixedLengthArchetype(3));
        //08
        addFieldArchetype(RESERVADO, new FieldDefaultArchetype(" "));
        //09
        addFieldArchetype(TIPO_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(1));
        //10
        addFieldArchetype(NUM_INSCRICAO_EMPRESA, new FieldIntegerFixedLengthArchetype(15));
        //11
        addFieldArchetype(CODIGO_CEDENTE, new FieldIntegerFixedLengthArchetype(9));
        //12
        addFieldArchetype(RESERVADO_USO_BANCO2, new FieldStringFixedLengthArchetype(11));
        //13
        addFieldArchetype(AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(4));
        //14
        addFieldArchetype(DIGITO_AGENCIA_CEDENTE, new FieldIntegerFixedLengthArchetype(1));
        //15
        addFieldArchetype(NUMERO_CONTA_CEDENTE, new FieldIntegerFixedLengthArchetype(9));
        //16
        addFieldArchetype(DIGITO_VER_CONTA, new FieldIntegerFixedLengthArchetype(1));
        //17
        addFieldArchetype(RESERVADO_USO_BANCO3, new FieldStringFixedLengthArchetype(5));
        //18
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //19
        addFieldArchetype(RESERVADO_USO_BANCO4, new FieldFillerArchetype(80, ' '));
        //20
        addFieldArchetype(NUM_REMESSA_RETORNO, new FieldIntegerFixedLengthArchetype(8));
        //21
        addFieldArchetype(DATA_GRAVACAO_REMESSA_RETORNO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //22
        addFieldArchetype(RESERVADO_USO_BANCO5, new FieldFillerArchetype(41, ' '));
        
    }
}
