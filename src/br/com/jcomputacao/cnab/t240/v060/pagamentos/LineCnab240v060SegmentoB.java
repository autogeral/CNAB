package br.com.jcomputacao.cnab.t240.v060.pagamentos;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240SegmentoB;

/**
 * Nov 8, 2012 2:03:57 PM
 * @author Murilo
 */
public class LineCnab240v060SegmentoB extends LineCnab240SegmentoB {

    public static final String HORARIO_ENVIO_TED = "HORARIO_ENVIO_TED";
    /**
     * 0013 = CRÉDITO DE DIVIDENDOS</br>
     * 0021 = LIQUIDO DE VENCIMENTO</br>
     * 0091 = PAGAMENTO DE SINISTRO - SEGURADO</br>
     * 0109 = PGTO DESPESAS VIAJANTE EM TRANSITO</br>
     * 0137 = PGTO REPRES/VENDEDORES AUTORIZADOS</br>
     * 0149 = PAGAMENTO DE BENEFÍCIOS DO INSS</br>
     * 0183 = PAGAMENTO A FORNECEDORES</br>
     * 0197 = DEVOLUÇÃO DE LANÇAMENTO</br>
     * 0295 = PGTO CREDENCIADO DE EMPR CONV</br>
     * 2060 = TRANSFERÊNCIA MESMA TITULARIDADE</br>
     * 0367 = PAGAMENTO DE PENSÃO ALIMENTÍCIA</br>
     * 0491 = RESGATE PREVIDÊNCIA</br>
     * 0493 = PAGAMENTO BENEFÍCIO PREVIDÊNCIA</br>
     * 0495 = ESTORNO CONTRIBUIÇÃO PREVIDÊNCIA</br>
     * 1070 = TRANSFERÊNCIA DE SALDO</br>
     * 2214 = CRÉDITOS DIVERSOS</br>
     * 8051 = RECEBIMENTO VIA PGTO FORNECEDORES</br>
     * 2039 = PAGAMENTO DIVERSOS - FORNECEDOR</br>
     * 2644 = BOLSA AUXÍLIO</br>
     */
    public static final String CODIGO_HISTORICO = "CODIGO_HISTORICO";
    public static final String EXCLUSIVO_FEBRABAN_3 = "EXCLUSIVO_FEBRABAN_3";

    /**
     * Podem haver ate 5 ocorrencias</br>
     * 00 Crédito ou Débito Efetivado</br>
     * 01 Insuficiência de Fundos - Débito Não Efetuado</br>
     * 02 Crédito ou Débito Cancelado pelo Pagador/Credor</br>
     * 03 Débito Autorizado pela Agência - Efetuado</br>
     * AA Controle Inválido</br>
     * AB Tipo de Operação Inválido</br>
     * AC Tipo de Serviço Inválido</br>
     * AD Forma de Lançamento Inválida</br>
     * AE Tipo/Número de Inscrição Inválido (gerado na crítica ou para informar rejeição)*</br>
     * AF Código de Convênio Inválido</br>
     * AG Agência/Conta Corrente/DV Inválido</br>
     * AH Número Seqüencial do Registro no Lote Inválido</br>
     * AI Código de Segmento de Detalhe Inválido</br>
     * AJ Tipo de Movimento Inválido</br>
     * AK Código da Câmara de Compensação do Banco do Favorecido/Depositário Inválido</br>
     * AL Código do Banco do Favorecido ou Depositário Inválido</br>
     * AM Agência Mantenedora da Conta Corrente do Favorecido Inválida</br>
     * AN Conta Corrente/DV do Favorecido Inválido</br>
     * AO Nome do Favorecido não Informado</br>
     * AP Data Lançamento Inválida/Vencimento Inválido</br>
     * AQ Tipo/Quantidade da Moeda Inválido</br>
     * AR Valor do Lançamento Inválido</br>
     * AS Aviso ao Favorecido - Identificação Inválida</br>
     * AT Tipo/Número de Inscrição do Favorecido/Contribuinte Inválido</br>
     * AU Logradouro do Favorecido não Informado</br>
     * AV Número do Local do Favorecido não Informado</br>
     * AW Cidade do Favorecido não Informada</br>
     * AX CEP/Complemento do Favorecido Inválido</br>
     * AY Sigla do Estado do Favorecido Inválido</br>
     * AZ Código/Nome do Banco Depositário Inválido</br>
     * BA Código/Nome da Agência Depositário não Informado</br>
     * BB Número do Documento Inválido(Seu Número)</br>
     * BC Nosso Número Invalido</br>
     * BD Inclusão Efetuada com Sucesso</br>
     * BE Alteração Efetuada com Sucesso</br>
     * BF Exclusão Efetuada com Sucesso</br>
     * BG Agência/Conta Impedida Legalmente</br>
     * B1 Bloqueado Pendente de Autorização</br>
     * B3 Bloqueado pelo cliente</br>
     * B4 Bloqueado pela captura de titulo da cobrança</br>
     * B8 Bloqueado pela Validação de Tributos</br>
     * CA Código de barras - Código do Banco Inválido</br>
     * CB Código de barras - Código da Moeda Inválido</br>
     * CC Código de barras - Dígito Verificador Geral Inválido</br>
     * CD Código de barras - Valor do Título Inválido</br>
     * CE Código de barras - Campo Livre Inválido</br>
     * CF Valor do Documento/Principal/menor que o minimo Inválido</br>
     * CH Valor do Desconto Inválido</br>
     * CI Valor de Mora Inválido</br>
     * CJ Valor da Multa Inválido</br>
     * CK Valor do IR Inválido</br>
     * CL Valor do ISS Inválido</br>
     * CM Valor do IOF Inválido</br>
     * CN Valor de Outras Deduções Inválido</br>
     * CO Valor de Outros Acréscimos Inválido</br>
     * HA Lote Não Aceito</br>
     * HB Inscrição da Empresa Inválida para o Contrato</br>
     * HC Convênio com a Empresa Inexistente/Inválido para o Contrato</br>
     * HD Agência/Conta Corrente da Empresa Inexistente/Inválida para o Contrato</br>
     * HE Tipo de Serviço Inválido para o Contrato</br>
     * HF Conta Corrente da Empresa com Saldo Insuficiente</br>
     * HG Lote de Serviço fora de Seqüência</br>
     * HH Lote de Serviço Inválido</br>
     * HI Arquivo não aceito</br>
     * HJ Tipo de Registro Inválido</br>
     * HL Versão de Layout Inválida</br>
     * HU Hora de Envio Inválida</br>
     * IJ Competência ou Período de Referencia ou Numero da Parcela invalido</br>
     * IM Município Invalido</br>
     * IN Numero Declaração Invalido</br>
     * IO Numero Etiqueta invalido</br>
     * IP Numero Notificação invalido</br>
     * IQ Inscrição Estadual invalida</br>
     * IR Divida Ativa Invalida</br>
     * IS Valor Honorários ou Outros Acréscimos invalido</br>
     * IT Período Apuração invalido</br>
     * IU Valor ou Percentual da Receita invalido</br>
     * IV Numero Referencia invalido</br>
     * TA Lote não Aceito - Totais do Lote com Diferença</br>
     * XB Número de Inscrição do Contribuinte Inválido</br>
     * XC Código do Pagamento ou Competência ou Número de Inscrição Inválido</br>
     * XF Código do Pagamento ou Competência não Numérico ou igual á zeros</br>
     * YA Título não Encontrado</br>
     * YB Identificação Registro Opcional Inválido</br>
     * YC Código Padrão Inválido</br>
     * YD Código de Ocorrência Inválido</br>
     * YE Complemento de Ocorrência Inválido</br>
     * YF Alegação já Informada</br>
     * ZA Transferencia Devolvida</br>
     * ZB Transferencia mesma titularidade não permitida</br>
     * ZC Código pagamento Tributo inválido</br>
     * ZD Competência Inválida</br>
     * ZE Valor outras entidades inválido</br>
     * ZF Sistema Origem Inválido</br>
     * ZG Banco Destino não recebe DOC</br>
     * ZH Banco Destino inoperante para DOC</br>
     * ZI Código do Histórico de Credito Invalido</br>
     * ZK Autorização iniciada no Internet Banking</br>
     * Z0 Conta com bloqueio*</br>
     * Z1 Conta fechada. É necessário ativar a conta*</br>
     * Z2 Conta com movimento controlado*</br>
     * Z3 Conta cancelada*</br>
     * Z4 Registro inconsistente (Título)*</br>
     * Z5 Apresentação indevida (Título)*</br>
     * Z6 Dados do destinatário inválidos*</br>
     * Z7 Agência ou conta destinatária do crédito inválida*</br>
     * Z8 Divergência na titularidade*</br>
     * Z9 Conta destinatária do crédito encerrada*</br>
     * C1 COMPROR – Devolvido por outros bancos**</br>
     * C2 COMPROR – Recusado**</br>
     * C3 COMPROR – Rejeitado por sistema**</br>
     * C4 COMPROR – Rejeitado por horário**</br>
     * C6 COMPROR – Aprovado**</br>
     * C7 COMPROR – Compromisso Inválido**
     */
    public static final String OCORRENCIAS_RETORNO = "OCORRENCIAS_RETORNO";
    
    public LineCnab240v060SegmentoB() {
        setName("CNAB 240v060 - Segmento B");
        removeFieldArchetype(CODIGO_DOCUMENTO_PAGADOR_FAVORECIDO);
        removeFieldArchetype(AVISO);
        removeFieldArchetype(USO_SIAPE);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);
        
        FieldIntegerFixedLengthArchetype fa = new FieldIntegerFixedLengthArchetype(6);
        fa.setNullableRepresentation("    ");
        addFieldArchetype(HORARIO_ENVIO_TED, fa);
        addFieldArchetype(EXCLUSIVO_FEBRABAN_2, new FieldFillerArchetype(11, ' '));
        addFieldArchetype(CODIGO_HISTORICO, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(EXCLUSIVO_FEBRABAN_3, new FieldFillerArchetype(1, ' '));
        addFieldArchetype(OCORRENCIAS_RETORNO, new FieldStringFixedLengthArchetype(10));
    }
}
