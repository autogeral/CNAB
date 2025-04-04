package br.com.jcomputacao.cnab.t240.v040.cobranca;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/08/2024 11:19:20
 *
 * @author murilo
 */
public class LineCnab240v040SegmentoY03 extends LineArchetype {

    /**
     * VERSÃO 040
     */

    /**
     * CODIGO DO BANCO - DEFAULT 001 POSICAO 001 003
     */
    public static final String CODIGO_BANCO_COMPENSACAO = "CODIGO_BANCO_COMPENSACAO";
    /**
     * CODIGO DO LOTE LOTE DE SERVICO POSICAO 004 007
     */
    public static final String CODIGO_LOTE = "CODIGO_LOTE";
    /**
     * TIPO DE REGISTRO - DEFAULT 3 REGISTRO HEADER DO LOTE POSICAO 008 008
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * SEQUENCIAL DE REGISTRO DO ARQUIVO NO LOTE TIPO DE OPERACAO POSICAO 009
     * 013
     */
    public static final String SEQUENCIAL_REGISTRO = "SEQUENCIAL_REGISTRO";
    /**
     * CODIGO DO SEGMENTO DO REGISTRO DETALHE IDENTIFICACAO DO TIPO DE SERVICO
     * POSICAO 014 014 CONTEUDO 'U'
     */
    public static final String CODIGO_SEGMENTO = "CODIGO_SEGMENTO";
    /**
     * CODIGO DO SERVICO IDENTIFICACAO DO TIPO DE SERVICO POSICAO 015 015
     * CONTEUDO ' '
     */
    public static final String RESERVADO_USO_BANCO_1 = "RESERVADO_USO_BANCO_1";
    /**
     * CODIGO DE MOVIMENTO DE RETORNO POSICAO 016 017
     */
    public static final String CODIGO_MOVIMENTO_RETORNO = "CODIGO_MOVIMENTO_RETORNO";
    /**
     * IDENTIFICACAO 018-019
     */
    public static final String IDENTIFICACO_REGISTRO = "IDENTIFICACO_REGISTRO";
    /**
     * RESERVADO USO BANCO 020 080
     */
    public static final String RESERVADO_USO_BANCO_2 = "RESERVADO_USO_BANCO_2";
    /**
     * PIX_TIPO_CHAVE 081-081</br>
     * NOTA 49</br>
     * 1 = CPF</br>
     * 2 = CNPJ</br>
     * 3 = Celular</br>
     * 4 = E-Mail</br>
     * 5 = EVP – Chave Aleatória</br>
     */
    public static final String PIX_TIPO_CHAVE = "PIX_TIPO_CHAVE";
    /**
     * PIX_URL_QR_CODE 082 158</br>
     * Retorno - NOTA 50</br>
     * Codigo da chave DICT</br>
     * Codigo da chave cadastrada no banco para identificar o beneficiario e a conta corretne cadastrada para receber os creditos.
     */
    public static final String PIX_CODIGO_CHAVE = "PIX_CODIGO_CHAVE";
    /**
     * PIX_TXID_QR_CODE 159 193</br>
     * Retorno - NOTA 52</br>
     * Identificação adotada e controlado pelo Beneficiário se preenchido, se não preencher o Banco atribui essa identificação automaticamente, conforme regra abaixo.</br>
     * 2 digitos - sigla do sistema de cobranca com 2 digitos</br>
     * 1 digito - ambiente de teste ou producao, T ou P</br>
     * 9 digitos - codigo do beneficiario</br>
     * 13 digitos - nosso numero</br>
     * 8 digitos - data do dia</br>
     * 
     */
    public static final String PIX_CODIGO_QR_CODE = "PIX_CODIGO_QR_CODE";
    
    /**
     * RESERVADO USO BANCO 194 240
     */
    public static final String RESERVADO_USO_BANCO_3 = "RESERVADO_USO_BANCO_3";

    public LineCnab240v040SegmentoY03() {

//*****************************Registro Header de Lote****************************************
        //01
        addFieldArchetype(CODIGO_BANCO_COMPENSACAO, new FieldIntegerFixedLengthArchetype(3));
        //02
        addFieldArchetype(CODIGO_LOTE, new FieldIntegerFixedLengthArchetype(4));
        //03
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("3"));
        //04
        addFieldArchetype(SEQUENCIAL_REGISTRO, new FieldIntegerFixedLengthArchetype(5));
        //05
        addFieldArchetype(CODIGO_SEGMENTO, new FieldDefaultArchetype("Y"));
        //06
        addFieldArchetype(RESERVADO_USO_BANCO_1, new FieldFillerArchetype(1, ' '));
        //07
        addFieldArchetype(CODIGO_MOVIMENTO_RETORNO, new FieldIntegerFixedLengthArchetype(2));
        
        addFieldArchetype(IDENTIFICACO_REGISTRO, new FieldDefaultArchetype("03"));
        addFieldArchetype(RESERVADO_USO_BANCO_2, new FieldFillerArchetype(61, ' '));
        
        addFieldArchetype(PIX_TIPO_CHAVE, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(PIX_CODIGO_CHAVE, new FieldStringFixedLengthArchetype(77));
        addFieldArchetype(PIX_CODIGO_QR_CODE, new FieldStringFixedLengthArchetype(35));
        
        addFieldArchetype(RESERVADO_USO_BANCO_3, new FieldFillerArchetype(47, ' '));
    }
}
