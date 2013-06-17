package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Jennifer
 */
public class LineCnab240SegmentoE extends LineArchetype{
    /**
     * Campo: 01<br>
     * CÓDIGO DO BANCO<br>
     * POSIÇÃO: 001 A 003<br>
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * Campo: 02<br>
     * CÓDIGO DO LOTE<br>
     * POSIÇÃO: 004 A 007<br>
     * Identifica o número sequencial do lote no arquivo, não se repetindo dentro de um mesmo arquivo.
     * Obs.: As numerações 0000 e 9999 são exclusivas para o Header e o Trailer do arquivo.
     */
    public static String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * Campo: 03<br>
     * TIPO DE RETGISTRO<br>
     * POSIÇÃO: 008 A 008<br>
     */
    public static String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * Campo: 04<br>
     * NÚMERO DO REGISTRO<br>
     * POSIÇÃO: 009 A 0013<br>
     * Identifica o número sequencial do lote no arquivo, não se repetindo dentro de um mesmo arquivo.
     * Obs.: As numerações 0000 e 9999 são exclusivas para o Header e o Trailer do arquivo.
     */
    public static String NUMERO_REGISTRO = "NUMERO_REGISTRO";
    /**
     * Campo: 05<br>
     * CÓDIGO DO SEGMENTO<br>
     * POSIÇÃO: 014 A 014<br>
     * DEFAULT 'E'
     */
    public static String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * Campo: 06<br>
     * IDENTIFICAÇÃO DO TIPO DE LANÇAMENTO<br>
     * POSIÇÃO: 015 A 015<br>
     * A - 1 - Lançamento Normal em recurso “disponível”<br>
     * B - 2 - Lançamento Normal em recurso “a compensar”<br>
     * C - 5 - Lançamentos futuros<br>
     */
    public static String IDENTIFICACAO_TIPO_LANCAMENTO = "IDENTIFICACAO_TIPO_LANCAMENTO";
    /**
     * Campo: 07<br>
     * BRANCOS<br>
     * POSIÇÃO: 016 A 017<br>
     */
    public static String BRANCOS = "BRANCOS";
    /**
     * Campo: 08<br>
     * TIPO DE INSCRIÇÃO<br>
     * POSIÇÃO: 018 A 018<br>
     * 1 = CPF
     * 2 = CNPJ
     */
    public static String TIPO_INSCRICAO = "TIPO_INSCRICAO";
    /**
     * Campo: 09<br>
     * NÚMERO DE INSCRIÇÃO<br>
     * POSIÇÃO: 019 A 032<br>
     */
    public static String NUMERO_INSCRICAO = "NUMERO_INSCRICAO";
    /**
     * Campo: 10<br>
     * BRANCOS <br>
     * POSIÇÃO: 033 A 047<br>
     */
    public static String BRANCOS2 = "BRANCOS2";
    /**
     * Campo: 11<br>
     * CONVENIO<br>
     * POSIÇÃO: 048 A 052<br>
     * Este código será informado pelo Banco e tem por objetivo identificar o cadastro da empresa no banco.
     */
    public static String CONVENIO = "CONVENIO";
    /**
     * Campo: 12<br>
     * ZEROS<br>
     * POSIÇÃO: 053 A 053<br>
     */
    public static String ZEROS = "ZEROS";
    /**
     * Campo: 13<br>
     * AGENCIA MANTENEDORA<br>
     * POSIÇÃO: 054 A 057<br>
     */
    public static String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";
    /**
     * Campo: 14<br>
     * DÍGITO VERIFICADOR DA AGÊNCIA<br>
     * POSIÇÃO: 058 A 058<br>
     */
    public static String DIGITO_VER_AGENCIA = "DIGITO_VER_AGENCIA";
    /**
     * Campo: 15<br>
     * ZEROS<br>
     * POSIÇÃO: 059 A 065<br>
     * DEFAULT '0000000'
     */
    public static String ZEROS2 = "ZEROS2";
    /**
     * Campo: 16<br>
     * NÚMERO DA CONTA CORRENTE<br>
     * POSIÇÃO: 066 A 070<br>
     */
    public static String NUMERO_CONTA_CORRENTE = "NUMERO_CONTA_CORRENTE";
    /**
     * Campo: 17<br>
     * BRANCOS<br>
     * POSIÇÃO: 071 A 071<br>
     */
    public static String BRANCOS3 = "BRANCOS3";
    /**
     * Campo: 18<br>
     * DÍGITO VERIFICADOR DA AGÊNCIA / CONTA<br>
     * POSIÇÃO: 072 A 072<br>
     */
    public static String DIGITO_VER_AG_CONTA = "DIGITO_VER_AG_CONTA";
    /**
     * Campo: 19<br>
     * NOME DA EMPRESA<br>
     * POSIÇÃO: 73 A 102<br>
     */
    public static String NOME_EMPRESA = "NOME_EMPRESA";
    /**
     * Campo: 20<br>
     * RESERVADO PARA USO DO BANCO<br>
     * POSIÇÃO: 103 A 108<br>
     */
    public static String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";
    /**
     * Campo: 21<br>
     * NATUREZA DO LANÇAMENTO<br>
     * POSIÇÃO: 109 A 111<br>
     * CDS - LANÇAMENTOS COMPOSTOS DE RECURSOS DISPONÍVEIS E BLOQUEADOS 
     * DPV - LANÇAMENTO OCORRIDO EM RECURSO “DISPONÍVEL” 
     * SCR - LANÇAMENTO OCORRIDO EM RECURSO “DISPONÍVEL”, PORÉM NÃO LIBERADO PARA USO 
     * SSR - LANÇAMENTO OCORRIDO EM RECURSO “A COMPENSAR” 
     * APL - LANÇAMENTO REFERENTE À APLIC AUT MAIS
     */
    public static String NATUREZA_LANCAMENTO= "NATUREZA_LANCAMENTO";
    /**
     * Campo: 22<br>
     * TIPO DO COMPLEMENTO<br>
     * POSIÇÃO: 112 A 113<br>
     */
    public static String TIPO_COMPLEMENTO = "TIPO_COMPLEMENTO";
    /**
     * Campo: 23<br>
     * BANCO ORIGEM DO LANÇAMENTO<br>
     * POSIÇÃO: 114 A 116<br>
     */
    public static String BANCO_ORIGEM_LANCAMENTO = "BANCO_ORIGEM_LANCAMENTO";
    /**
     * Campo: 24<br>
     * AGÊNCIA ORIGEM DO LANÇAMENTO<br>
     * POSIÇÃO: 117 A 121<br>
     * Quando a numeração for superior a 4000, a operação foi executada através da câmara de 
     * compensação e o código indica um Órgão interno do Itaú; Quando for inferior a 4000, o 
     * lançamento teve origem na rede de agências do Banco Itaú e em se tratando de TED será 
     * apresentado o número da agência do banco origem; Igual a 0000, o lançamento originou-se 
     * na própria agência mantenedora da conta ou em um sistema interno.
     */
    public static String AGENCIA_ORIGEM_LANCAMENTO = "AGENCIA_ORIGEM_LANCAMENTO";
    /**
     * Campo: 25<br>
     * AGÊNCIA / CONTA ORIGEM DO LANÇAMENTO<br>
     * POSIÇÃO: 122 A 133<br>
     * Este campo será informado sempre que a transação envolver em sua origem uma agência/conta, 
     * como por exemplo, Transferência entre contas. No caso de TED o campo será formatado com o 
     * número da conta que originou o lançamento, alinhado à direita.
     */
    public static String AG_CONTA_ORIGEM_LANCAMENTO = "AG_CONTA_ORIGEM_LANCAMENTO";
    /**
     * Campo: 26<br>
     * IDENTIFICAÇÃO DE ISENÇÃO DE CPMF<br>
     * POSIÇÃO: 134 A 134<br>
     * S = ISENTO
     * N = NÃO ISENTO
     * B = BONIFICADO
     */
    public static String IDENTIFICACAO_INSENCAO_CPMF= "IDENTIFICACAO_INSENCAO_CPMF";
    /**
     * Campo: 27<br>
     * DATA CONTÁBIL<br>
     * POSIÇÃO: 135 A 142<br>
     * FORMATO: DDMMYYYY
     */
    public static String DATA_CONTABIL = "DATA_CONTABIL";
    /**
     * Campo: 28<br>
     * DATA LANÇAMENTO<br>
     * POSIÇÃO: 143 A 150<br>
     * FORMATO: DDMMYYYY
     */
    public static String DATA_LANCAMENTO = "DATA_LANCAMENTO";
    /**
     * Campo: 29<br>
     * VALOR DO LANÇAMENTO<br>
     * POSIÇÃO: 151 A 168<br>
     * 9(16)V9(2)
     */
    public static String VALOR_LANCAMENTO = "VALOR_LANCAMENTO";
    /**
     * Campo: 30<br>
     * TIPO DO LANÇAMENTO<br>
     * POSIÇÃO: 169 A 169<br>
     * D = DEVEDOR
     * C = CREDOR
     */
    public static String TIPO_LANCAMENTO = "TIPO_LANCAMENTO";
    /**
     * Campo: 31<br>
     * CATEGORIA DO LANÇAMENTO<br>
     * POSIÇÃO: 170 A 172<br>
     *      CRÉDITOS 
     * CÓDIGO 	DESCRIÇÃO 
     * 201	DEPÓSITOS 
     * 202	COBRANÇA 
     * 203	DEVOLUÇÃO DE CHEQUES 
     * 204	ESTORNOS 
     * 205	LANÇAMENTOS AVISADOS 
     * 206	RESGATE DE APLICAÇÕES 
     * 207	EMPRÉSTIMO / FINANCIAMENTO 
     * 208	CAMBIO 
     * 209	TRANSF. INTERBANCÁRIAS (DOC/TED) 
     * 210	AÇÕES 
     * 211	DIVIDENDOS 
     * 212	SEGURO 
     * 213	TRANSFERÊNCIA ENTRE CONTAS 
     * 214	DEPÓSITOS ESPECIAIS 
     * 215	DEVOLUÇÃO DE COMPENSAÇÃO 
     *          DÉBITOS 	
     * CÓDIGO 	DESCRIÇÃO 
     * 101	CHEQUES 
     * 102	ENCARGOS 
     * 103	ESTORNOS 
     * 104	LANÇAMENTOS AVISADOS 
     * 105	TARIFAS 
     * 106	APLICAÇÃO 
     * 107	EMPRESTIMO / FINANCIAMENTO 
     * 108	CAMBIO 
     * 109	CPMF 
     * 110	IOF 
     * 111	IMPOSTO DE RENDA 
     * 112	PAGAMENTO FORNECEDORES 
     * 113	PAGAMENTO FUNCIONÁRIOS 
     * 114	SAQUE ELETRÔNICO 
     * 115	AÇÕES 
     * 116	SEGURO 
     * 117	TRANSFERÊNCIA ENTRE CONTAS 
     * 118	DEVOLUÇÃO DA COMPENSAÇÃO 
     * 119	DEVOLUÇÃO DE CHEQUES 
     * 120	TRANSF. INTERBANCÁRIAS (DOC/TED) 
     * 121	DESCONTO DE DUPLICATAS 
     */
    public static String CATEGORIA_LANCAMENTO = "CATEGORIA_LANCAMENTO";
    /**
     * Campo: 32<br>
     * CÓDIGO DO LANÇAMENTO<br>
     * POSIÇÃO: 173 A 176<br>
     * PÁGINAS 14 E 15 DO MANUAL
     */
    public static String CODIGO_LANCAMENTO = "CODIGO_LANCAMENTO";
    /**
     * Campo: 33<br>
     * DESCRIÇÃO DO HISTÓRIDO DE LANÇAMENTO<br>
     * POSIÇÃO: 177 A 201<br>
     */
    public static String HISTORICO_LANCAMENTO = "HISTORICO_LANCAMENTO";
    /**
     * Campo: 34<br>
     * AGÊNCIA DE ORIGEM DO LANÇAMENTO<br>
     * POSIÇÃO: 202 A 205<br>
     */
    public static String AG_ORIGEM_LANCAMENTO = "AG_ORIGEM_LANCAMENTO";
    /**
     * Campo: 35<br>
     * COMPLEMENTO DE REGISTRO<br>
     * POSIÇÃO: 206 A 207<br>
     */
    public static String COMPLEMENTO_REGISTRO = "COMPLEMENTO_REGISTRO";
    /**
     * Campo: 36<br>
     * CONTA DE ORIGEM DO LANÇAMENTO<br>
     * POSIÇÃO: 208 A 212<br>
     */
    public static String CONTA_ORIGEM_LANCAMENTO = "CONTA_ORIGEM_LANCAMENTO";
    /**
     * Campo: 37<br>
     * DAC DA AGÊNCIA/CONTA DE ORIGEM<br>
     * POSIÇÃO: 213 A 213<br>
     */
    public static String DAC_AG_CONTA_ORIGEM = "DAC_AG_CONTA_ORIGEM";
    /**
     * Campo: 38<br>
     * TIPO DE INSCRIÇÃO DO EMITENTE<br>
     * POSIÇÃO: 214 A 214<br>
     * 1 CPF
     * 2 CNPJ
     */
    public static String TIPO_INSCRICAO_EMITENTE = "TIPO_INSCRICAO_EMITENTE";
    /**
     * Campo: 39<br>
     * NÚMERO DE INSCRIÇÃO DO EMITENTE<br>
     * POSIÇÃO: 215 A 228<br>
     * 1 CPF
     * 2 CNPJ
     */
    public static String NUMERO_INSCRICAO_EMITENTE = "NUMERO_INSCRICAO_EMITENTE";
    /**
     * Campo: 40<br>
     * BRANCOS<br>
     * POSIÇÃO: 229 A 234<br>
     */
    public static String BRANCOS4 = "BRANCOS4";
    /**
     * Campo: 41<br>
     * NÚMERO DO DOCUMENTO - COMPLEMENTO<br>
     * POSIÇÃO: 235 A 240<br>
     * Será informado neste campo, quando houver identificação controlada 
     * por sistema, o número do documento que originou o lançamento.
     */
    public static String NUMERO_DOCUMENTO = "NUMERO_DOCUMENTO";
    
    public LineCnab240SegmentoE (){
        setName("REGISTRO DETALHE - SEGIMENTO 'E' - CNABv5.0");
        
        //01
        addFieldArchetype(CODIGO_BANCO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        //04
        addFieldArchetype(NUMERO_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("E"));
        //06
        addFieldArchetype(IDENTIFICACAO_TIPO_LANCAMENTO, new FieldIntegerFixedLengthArchetype(1));
        //07
        addFieldArchetype(BRANCOS, new FieldStringFixedLengthArchetype(2));
        //08
        addFieldArchetype(TIPO_INSCRICAO, new FieldStringFixedLengthArchetype(1));
        //09
        addFieldArchetype(NUMERO_INSCRICAO, new FieldIntegerFixedLengthArchetype(14));
        //10
        addFieldArchetype(BRANCOS2, new FieldStringFixedLengthArchetype(15));
        //11
        addFieldArchetype(CONVENIO, new FieldStringFixedLengthArchetype(5));
        //12
        addFieldArchetype(ZEROS, new FieldIntegerFixedLengthArchetype(1));
        //13
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(4));
        //14
        addFieldArchetype(DIGITO_VER_AGENCIA, new FieldStringFixedLengthArchetype(1));
        //15
        addFieldArchetype(ZEROS2, new FieldIntegerFixedLengthArchetype(7));
        //16
        addFieldArchetype(NUMERO_CONTA_CORRENTE, new FieldIntegerFixedLengthArchetype(5));
        //17
        addFieldArchetype(BRANCOS3, new FieldStringFixedLengthArchetype(1));
        //18
        addFieldArchetype(DIGITO_VER_AG_CONTA, new FieldStringFixedLengthArchetype(1));
        //19
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        //20
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldStringFixedLengthArchetype(6));
        //21
        addFieldArchetype(NATUREZA_LANCAMENTO, new FieldStringFixedLengthArchetype(3));
        //22
        addFieldArchetype(TIPO_COMPLEMENTO, new FieldIntegerFixedLengthArchetype(2));
        //23
        addFieldArchetype(BANCO_ORIGEM_LANCAMENTO, new FieldIntegerFixedLengthArchetype(3));
        //24
        addFieldArchetype(AGENCIA_ORIGEM_LANCAMENTO, new FieldIntegerFixedLengthArchetype(5));
        //25
        addFieldArchetype(AG_CONTA_ORIGEM_LANCAMENTO, new FieldIntegerFixedLengthArchetype(12));
        //26
        addFieldArchetype(IDENTIFICACAO_INSENCAO_CPMF, new FieldStringFixedLengthArchetype(1));
        //27
        addFieldArchetype(DATA_CONTABIL, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //28
        addFieldArchetype(DATA_LANCAMENTO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        //29
        addFieldArchetype(VALOR_LANCAMENTO, new FieldDecimalFixedLengthArchetype(18, 2));
        //30
        addFieldArchetype(TIPO_LANCAMENTO, new FieldStringFixedLengthArchetype(1));
        //31
        addFieldArchetype(CATEGORIA_LANCAMENTO, new FieldIntegerFixedLengthArchetype(3));
        //32
        addFieldArchetype(CODIGO_LANCAMENTO, new FieldStringFixedLengthArchetype(4));
        //33
        addFieldArchetype(HISTORICO_LANCAMENTO, new FieldStringFixedLengthArchetype(25));
        //34
        addFieldArchetype(AG_ORIGEM_LANCAMENTO, new FieldIntegerFixedLengthArchetype(4));
        //35
        addFieldArchetype(COMPLEMENTO_REGISTRO, new FieldIntegerFixedLengthArchetype(2));
        //36
        addFieldArchetype(CONTA_ORIGEM_LANCAMENTO, new FieldIntegerFixedLengthArchetype(5));
        //37
        addFieldArchetype(DAC_AG_CONTA_ORIGEM, new FieldIntegerFixedLengthArchetype(1));
        //38
        addFieldArchetype(TIPO_INSCRICAO_EMITENTE, new FieldStringFixedLengthArchetype(1));
        //39
        addFieldArchetype(NUMERO_INSCRICAO_EMITENTE, new FieldStringFixedLengthArchetype(14));
        //40
        addFieldArchetype(BRANCOS4, new FieldStringFixedLengthArchetype(6));
        //41
        addFieldArchetype(NUMERO_DOCUMENTO, new FieldStringFixedLengthArchetype(6));
    }
}
