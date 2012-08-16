package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Marcos
 */
public class LineCnab240HeaderRetorno  extends LineArchetype{

    /**
     * CODIGO DO BANCO - DEFAULT 001
     * POSICAO 001 003
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCOS";

    /**
     * CODIGO DO LOTE
     * LOTE DE SERVICO
     * POSICAO 004 007
     */
    public static final String CODIGO_DO_LOTE = "CODIGO_DO_LOTE";

    /**
     * TIPO DE REGISTRO - DEFAULT 1
     * REGISTRO HEADER DO LOTE
     * POSICAO 008 008
     */
    public static final String TIPO_DE_REGISTRO = "TIPO_DE_REGISTRO";

    /**
     * OPERACAO
     * TIPO DE OPERACAO
     * POSICAO 009 009
     * CONTEUDO 1
     */
    public static final String OPERACAO = "OPERACAO";

    /**
     * CODIGO DO SERVICO
     * IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 010 011
     * CONTEUDO '03'
     */
    public static final String CODIGO_SERVICO = "CODIGO_SERVICO";

    /**
     * FORMA DE LANCAMENTO
     * POSICAO 012 013
     * CONTEUDO '00'
     */
    public static final String FORMA_LANCAMENTO = "FORMA_LANCAMENTO";

    /**
     * LAYOUT DO LOTE
     * NUMERO DA VERSAO DO LAYOUT DO LOTE
     * POSICAO 014 016
     * PICTURE 9(03)
     * CONTEUDO '010'
     */
    public static final String LAYOUT_LOTE = "LAYOUT_LOTE";

    /**
     * BRANCOS
     * COMPLEMENTO DE REGISTRO
     * POSICAO 017 017
     * CONTEUDO BRANCOS
     */
    public static final String BRANCOS_LAYOUT_LOTE = "BRANCOS_LAYOUT_LOTE";

    /**
     * CODIGO DE INSCRICAO
     * TIPO DE INSCRICAO DA EMPRESA
     * POSICAO 018 018
     * PICTURE 9(01)
     * CONTEUDO '1'=CPF / '2'=CNPJ
     */
    public static final String CODIGO_INSCRICAO_2 = "CODIGO_INSCRICAO_2";

    /**
     * INSCRICAO NUMERO
     * NUMERO DE INSCRICAO DA EMPRESA
     * NUMERO DO CNPJ - CPF
     * POSICAO 019 033
     * PICTURE 9(15)
     * CONTEUDO NOTA 2
     */
    public static final String INSCRICAO_NUMERO_2 = "INSCRICAO_NUMERO_2";

    /**
     * NOME DO ARQUIVO - DEFAULT CBR438
     * POSICAO 034 039
     * CONTEUDO NOTA 2
     */
    public static final String NOME_ARQUIVO = "NOME_ARQUIVO";

    /**
     * DATA GRAVACAO
     * POSICAO 040 047
     * CONTEUDO NOTA 2
     */
    public static final String DATA_GRAVACAO_ARQUIVO = "DATA_GRAVACAO_ARQUIVO";

    /**
     * USO DO BANCO - ESPACOS EM BRANCO
     * POSICAO 048 053
     * PICTURE 9(2)
     * CONTEUDO NOTA 2
     */
    public static final String BRANCOS = "BRANCOS";

    /* AGENCIA
     * AGENCIA MANTENEDORA DA CONTA
     * POSICAO 054 058
     * PICTURE 9(05)
     */
    public static final String AGENCIA_MANTENEDORA = "AGENCIA_MANTENEDORA";

    /**
     * DIGITO VERIFICADOR DA CONTA
     * POSICAO 059 059
     * PICTURE X(01)
     */
    public static final String DIGITO_VERIFICADOR_1 = "DIGITO_VERIFICADOR_1";

    /**
     * NUMERO DA CONTA CORRENTE
     * POSICAO 060 071
     * PICTURE 9(12)
     */
    public static final String NUMERO_CONTA = "NUMERO_CONTA";

    /**
     * DIGITO VERIFICADOR DA CONTA
     * POSICAO 072 072
     * PICTURE X(01)
     */
    public static final String DIGITO_VERIFICADOR_CONTA = "DIGITO_VERIFICADOR_CONTA";

    /**
     * DIGITO VERIFICADOR DA CONTA AGENCIA
     * POSICAO 073 073
     * PICTURE X(01)
     */
    public static final String DIGITO_VERIFICADOR_CONTA_AGENCIA = "DIGITO_VERIFICADOR_CONTA_AGENCIA";

    /**
     * NOME DA EMPRESA
     * POSICAO 074 103
     * PICTURE X(01)
     */
    public static final String NOME_EMPRESA = "NOME_EMPRESA";

    /**
     * COMPLEMENTO DE REGISTRO
     * POSICAO 104 232
     * PICTURE X(01)
     * CONTEUDO BRANCOS
     */
    public static final String BRANCOS_CONTA_2 = "BRANCOS_CONTA_2";

    /**
     * CONTRATO IED
     * POSICAO 233 240
     * PICTURE X(01)
     */
    public static final String CONTRATO_IED = "CONTRATO_IED";

        public LineCnab240HeaderRetorno() {

//*****************************Registro Header de Lote****************************************
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(CODIGO_DO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_DE_REGISTRO, new FieldDefaultArchetype("1"));
        addFieldArchetype(OPERACAO, new FieldDefaultArchetype("1"));
        addFieldArchetype(CODIGO_SERVICO, new FieldDefaultArchetype("03"));
        addFieldArchetype(FORMA_LANCAMENTO, new FieldDefaultArchetype("00"));
        addFieldArchetype(LAYOUT_LOTE, new FieldDefaultArchetype("010"));
        addFieldArchetype(BRANCOS_LAYOUT_LOTE, new FieldDefaultArchetype(" "));
        addFieldArchetype(CODIGO_INSCRICAO_2, new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(INSCRICAO_NUMERO_2, new FieldIntegerFixedLengthArchetype(15));
        addFieldArchetype(NOME_ARQUIVO, new FieldStringFixedLengthArchetype(6));
        addFieldArchetype(DATA_GRAVACAO_ARQUIVO, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(BRANCOS, new FieldDefaultArchetype("      "));
        addFieldArchetype(AGENCIA_MANTENEDORA, new FieldIntegerFixedLengthArchetype(5));
        addFieldArchetype(DIGITO_VERIFICADOR_1, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NUMERO_CONTA, new FieldIntegerFixedLengthArchetype(12));
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DIGITO_VERIFICADOR_CONTA_AGENCIA, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NOME_EMPRESA, new FieldStringFixedLengthArchetype(30));
        addFieldArchetype(BRANCOS_CONTA_2, new FieldFillerArchetype(129, ' '));
        addFieldArchetype(CONTRATO_IED, new FieldIntegerFixedLengthArchetype(8));

    }
}
