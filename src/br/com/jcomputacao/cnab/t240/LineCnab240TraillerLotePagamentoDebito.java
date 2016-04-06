package br.com.jcomputacao.cnab.t240;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/07/2012 19:19:04
 *
 * @author Murilo
 */
public class LineCnab240TraillerLotePagamentoDebito extends LineArchetype {

    /**
     * CODIGO DO BANCO NA COMPENSAÇÃO<br> POSIÇÃO: 1 a 3<br> FORMATO: NUM<br>
     * DEFAULT: '001'
     */
    public static final String CODIGO_BANCO = "CODIGO_BANCO";
    /**
     * LOTE DE SERVICO<br> POSIÇÃO: 4 a 7<br> FORMATO: NUM
     */
    public static final String LOTE_SERVICO = "LOTE_SERVICO";
    /**
     * TIPO DE REGISTRO<br> POSIÇÃO: 8 a 8<br> FORMATO: NUM<br> DEFAULT: '5'
     */
    public static final String TIPO_REGISTRO = "TIPO_REGISTRO";
    /**
     * USO EXCLUSIVO DA FEBRABAN<br> POSIÇÃO: 9 a 17<br> FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN = "EXCLUSIVO_FEBRABAN";
    /**
     * QUANTIDADE DE REGISTROS NO LOTE POSIÇÃO: 18 a 23<br> FORMATO: NUM<br>
     */
    public static final String QTDE_REGISTROS_LOTE = "QTDE_REGISTROS_LOTE";
    public static final String SOMATORIO_VALORES = "SOMATORIO_VALORES";
    public static final String SOMATORIO_QUANTIDADE_MOEDA = "SOMATORIO_QUANTIDADE_MOEDA";
    public static final String NUMERO_AVISO_DEBITO = "NUMERO_AVISO_DEBITO";
    /**
     * USO EXCLUSIVO DA FEBRABAN<br> POSIÇÃO: 9 a 17<br> FORMATO: ALFA<br>
     * DEFAULT: BRANCOS
     */
    public static final String EXCLUSIVO_FEBRABAN_2 = "EXCLUSIVO_FEBRABAN_2";
    /**
     * G059
     * Código das Ocorrências para Retorno/Remessa Código adotado pela FEBRABAN
     * para identificar as ocorrências detectadas no processamento. Pode-se
     * informar até 5 ocorrências simultaneamente, cada uma delas codificada com
     * dois dígitos, conforme relação abaixo. Domínio: 
     * '00' = Crédito ou Débito Efetivado 
     * '01' = Insuficiência de Fundos - Débito Não Efetuado 
     * '02' = Crédito ou Débito Cancelado pelo Pagador/Credor 
     * '03' = Débito Autorizado pela Agência - Efetuado 
     * 'AA' = Controle Inválido 
     * 'AB' = Tipo de Operação Inválido 
     * 'AC' = Tipo de Serviço Inválido 
     * 'AD' = Forma de Lançamento Inválida 
     * 'AE' = Tipo/Número de Inscrição Inválido 
     * 'AF' = Código de Convênio Inválido 
     * 'AG' = Agência/Conta Corrente/DV Inválido 
     * 'AH' = Nº Seqüencial do Registro no Lote Inválido 
     * 'AI' = Código de Segmento de Detalhe Inválido 
     * 'AJ' = Tipo de Movimento Inválido 
     * 'AK' = Código da Câmara de Compensação do Banco Favorecido/Depositário Inválido 
     * 'AL' = Código do Banco Favorecido ou Depositário Inválido 
     * 'AM' = Agência Mantenedora da Conta Corrente do Favorecido Inválida 
     * 'AN' = Conta Corrente/DV do Favorecido Inválido 
     * 'AO' = Nome do Favorecido Não Informado 
     * 'AP' = Data Lançamento Inválido 
     * 'AQ' = Tipo/Quantidade da Moeda Inválido 
     * 'AR' = Valor do Lançamento Inválido 
     * 'AS' = Aviso ao Favorecido -Identificação Inválida 
     * 'AT' = Tipo/Número de Inscrição do Favorecido Inválido 
     * 'AU' = Logradouro do Favorecido Não Informado 
     * 'AV' = Nº do Local do Favorecido Não Informado 
     * 'AW' = Cidade do Favorecido Não Informada
     * 'AX' = CEP/Complemento do Favorecido Inválido 'AY' = Sigla do Estado do
     * 'AZ' = Código/Nome do Banco Depositário Inválido
'BA' = Código/Nome da Agência Depositária Não Informado
'BB' = Seu Número Inválido
'BC' = Nosso Número Inválido
'BD' = Inclusão Efetuada com Sucesso
'BE' = Alteração Efetuada com Sucesso
'BF' = Exclusão Efetuada com Sucesso
'BG' = Agência/Conta Impedida Legalmente
‘BH’= Empresa não pagou salário
‘BI’ = Falecimento do mutuário
‘BJ’ = Empresa não enviou remessa do mutuário
‘BK’= Empresa não enviou remessa no vencimento
‘BL’ = Valor da parcela inválida
‘BM’= Identificação do contrato inválida
‘BN’ = Operação de Consignação Incluída com Sucesso
‘BO’ = Operação de Consignação Alterada com Sucesso
‘BP’ = Operação de Consignação Excluída com Sucesso
‘BQ’ = Operação de Consignação Liquidada com Sucesso
'CA' = Código de Barras - Código do Banco Inválido
'CB' = Código de Barras - Código da Moeda Inválido
'CC' = Código de Barras - Dígito Verificador Geral Inválido
'CD' = Código de Barras - Valor do Título Inválido
'CE' = Código de Barras - Campo Livre Inválido
'CF' = Valor do Documento Inválido
'CG' = Valor do Abatimento Inválido
'CH' = Valor do Desconto Inválido
'CI' = Valor de Mora Inválido
'CJ' = Valor da Multa Inválido
'CK' = Valor do IR Inválido
'CL' = Valor do ISS Inválido
'CM' = Valor do IOF Inválido
'CN' = Valor de Outras Deduções Inválido
'CO' = Valor de Outros Acréscimos Inválido
'CP' = Valor do INSS Inválido
'HA' = Lote Não Aceito
'HB' = Inscrição da Empresa Inválida para o Contrato
'HC' = Convênio com a Empresa Inexistente/Inválido para o Contrato
'HD' = Agência/Conta Corrente da Empresa Inexistente/Inválido para o Contrato
'HE' = Tipo de Serviço Inválido para o Contrato
'HF' = Conta Corrente da Empresa com Saldo Insuficiente
'HG' = Lote de Serviço Fora de Seqüência
'HH' = Lote de Serviço Inválido
`HI` = Arquivo não aceito
`HJ` = Tipo de Registro Inválido
`HK` = Código Remessa / Retorno Inválido
`HL` = Versão de layout inválida
`HM` = Mutuário não identificado
`HN` = Tipo do beneficio não permite empréstimo
`HO` = Beneficio cessado/suspenso
`HP` = Beneficio possui representante legal
`HQ` = Beneficio é do tipo PA (Pensão alimentícia)
`HR` = Quantidade de contratos permitida excedida
`HS` = Beneficio não pertence ao Banco informado
`HT` = Início do desconto informado já ultrapassado
`HU`= Número da parcela inválida
`HV`= Quantidade de parcela inválida
`HW`= Margem consignável excedida para o mutuário dentro do prazo do contrato
`HX` = Empréstimo já cadastrado
`HY` = Empréstimo inexistente
`HZ` = Empréstimo já encerrado Favorecido Inválida
`H1` = Arquivo sem trailer
`H2` = Mutuário sem crédito na competência
`H3` = Não descontado – outros motivos
`H4` = Retorno de Crédito não pago
`H5` = Cancelamento de empréstimo retroativo
`H6` = Outros Motivos de Glosa
‘H7’ = Margem consignável excedida para o mutuário acima do prazo do contrato
‘H8’ = Mutuário desligado do empregador
‘H9’ = Mutuário afastado por licença
‘IA’ = Primeiro nome do mutuário diferente do primeiro nome do movimento do censo oudiferente da base de Titular do Benefício
'TA' = Lote Não Aceito - Totais do Lote com Diferença
'YA' = Título Não Encontrado
'YB' = Identificador Registro Opcional Inválido
'YC' = Código Padrão Inválido
'YD' = Código de Ocorrência Inválido
'YE' = Complemento de Ocorrência Inválido
'YF' = Alegação já Informada Observação: As ocorrências iniciadas com 'ZA' tem caráter informativo para o cliente
'ZA' = Agência / Conta do Favorecido Substituída
‘ZB’ = Divergência entre o primeiro e último nome do beneficiário versus primeiro e último nome na Receita Federal
‘ZC’ = Confirmação de Antecipação de Valor
     */
    public static final String OCORRENCIAS = "OCORRENCIAS";

    public LineCnab240TraillerLotePagamentoDebito() {
        addFieldArchetype(CODIGO_BANCO, new FieldStringFixedLengthArchetype(3));
        addFieldArchetype(LOTE_SERVICO, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(TIPO_REGISTRO, new FieldDefaultArchetype("5"));
        addFieldArchetype(EXCLUSIVO_FEBRABAN, new FieldFillerArchetype(9, ' '));
        addFieldArchetype(QTDE_REGISTROS_LOTE, new FieldIntegerFixedLengthArchetype(6));
        FieldArchetype fa = new FieldDecimalFixedLengthArchetype(18, 2);
        fa.setNullableRepresentation("");
        addFieldArchetype(SOMATORIO_VALORES, fa);
        fa = new FieldDecimalFixedLengthArchetype(15, 2);
        fa.setNullableRepresentation("");
        addFieldArchetype(SOMATORIO_QUANTIDADE_MOEDA, fa);
        fa = new FieldIntegerFixedLengthArchetype(6);
        fa.setNullableRepresentation("");
        addFieldArchetype(NUMERO_AVISO_DEBITO, fa);
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(168, ' '));
        fa = new FieldStringFixedLengthArchetype(10);
        fa.setNullableRepresentation("");
        addFieldArchetype(OCORRENCIAS, fa);
    }
}
