/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.santander400;

import br.com.jcomputacao.aristoteles.file.FileModel;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.FileCnab400SantanderEnvio;
import br.com.jcomputacao.cnab.LineCnabRegistroHeaderRemessa;
import br.com.jcomputacao.cnab.LineCnabRegistroMovimentoRemessa;
import br.com.jcomputacao.cnab.LineCnabRegistroOpcionalMovimentoRemessa;
import br.com.jcomputacao.cnab.LineCnabRegistroTraillerRemessa;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nieri
 */
public class Cnab400SantanderArquivoGerador {

    public static void gerarArquivo(String nomeArquivo, Cnab400SantanderLoteEnvio lote) {
        FileCnab400SantanderEnvio arquivoArchetype = new FileCnab400SantanderEnvio();
        LineCnabRegistroHeaderRemessa lineAchetype = (LineCnabRegistroHeaderRemessa) arquivoArchetype.getLineArchetype(FileCnab400SantanderEnvio.HEADER_REMESSA);
        LineModel line = lineAchetype.createModel();
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_REMESSA, lote.getCodigoRemessa());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.LITERAL_TRANSMISSAO, lote.getLiteralTransmissao());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_SERVICO, lote.getCodigoServico());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.LITERAL_SERVICO, lote.getLiteralServico());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_TRANSMISSAO, lote.getCodigoTransmissao());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NOME_CEDENTE, lote.getCedenteNome());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_BANCO, lote.getBancoCodigo());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NOME_BANCO, lote.getBancoNome());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.DATA_GRAVACAO, lote.getDataGravacao());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_1, lote.getMensagem1());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_2, lote.getMensagem2());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_3, lote.getMensagem3());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_4, lote.getMensagem4());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_5, lote.getMensagem5());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_6, lote.getMensagem6());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NUMERO_VERSAO_REMESSA_OPCIONAL, lote.getNumeroVersaoRemessa());
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NUMERO_SEQUENCIA_REGISTRO_ARQUIVO, lote.getNumeroSequencialRegistroArquivo1());
        FileModel arquivo = arquivoArchetype.createModel();

        arquivo.addLine(line);

        for (Cnab400SantanderLoteEnvioBoleto boleto : lote.getBoletos()) {
            line = arquivoArchetype.getLineArchetype(FileCnab400SantanderEnvio.MOVIMENTO_REMESSA).createModel();
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.TIPO_INSCRICAO_CEDENTE, boleto.getTipoIncricaoCedente());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CGC_CPF_CEDENTE, boleto.getCpfCnpjCedente());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_TRANSMISSAO, boleto.getCodigoTransmissao());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_CONTROLE_PARTICIPANTE, boleto.getNumeroControleParticipante());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NOSSO_NUMERO, boleto.getNossoNumero());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_SEGUNDO_DESCONTO, boleto.getDataSegundoDesconto());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.INFORMCAO_MULTA, boleto.getInformacaoMulta());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.PERCENTUAL_MULTA_POR_ATRASO, boleto.getPercentualMultaPorAtraso());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.UNIDADE_VALOR_MOEDA_CORRENTE, boleto.getUnidadeValorMoedaCorrente());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_TITULO_OUTRA_UNIDADE, boleto.getValorTituloOutraUnidade());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_COBRANCA_MULTA, boleto.getDataCobrancaMulta());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_CARTEIRA, boleto.getCodigoCarteira());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_OCORRENCIA, boleto.getCodigoOcorrencia());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.SEU_NUMERO, boleto.getSeuNumero());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_VENCIMENTO_TITULO, boleto.getDataVencimentoTitulo());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_TITULO, boleto.getValorTitulo());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_BANCO_COBRADOR, boleto.getNumeroBancoCobrador());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_AGENCIA_COBRADORA, boleto.getCodigoAgenciaCobradora());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.ESPECIE_DOCUMENTO, boleto.getEspecieDocumento());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.TIPO_ACEITE, boleto.getTipoAceite());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_EMISSAO_TITULO, boleto.getDataEmissaoTitulo());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.PRIMEIRA_INSTRUCAO_COBRANCA, boleto.getPrimeiraInstrucaoCobranca());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.SEGUNDA_INSTRUCAO_COBRANCA, boleto.getSegundaInstrucaoCobrada());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_MORA_COBRADO_DIA_ATRASO, boleto.getValorMoraCobradoDiaAtraso());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_LIMITE_CONCESSAO_DESCONTO, boleto.getDataLimiteConcessaoDesconto());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_DESCONTO_CONCEDIDO, boleto.getValorDescontoConcedido());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_IOF_RECOLHIDO, boleto.getValorIofRecolhido());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_SEGUNDO_DESCONTO, boleto.getValorSegundoDesconto());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.TIPO_INSCRICAO_SACADO, boleto.getTipoInscricaoSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CGC_CPF_SACADO, boleto.getCgcCpfSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NOME_SACADO, boleto.getNomeSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.ENDERECO_SACADO, boleto.getEnderecoSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.BAIRRO_SACADO, boleto.getBairroSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.CEP_SACADO, boleto.getCepSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.COMPLEMENTO_CEP, boleto.getComplementoCep());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.MUNICIPIO_SACADO, boleto.getMunicipioSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.UF_ESTADO_SACADO, boleto.getUfEstadoSacado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NOME_SACADOR_COOBRIGADO, boleto.getNomeSacadorCoobrigado());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.IDENTIFICADOR_COMPLEMENTO, boleto.getIdentificadorComplemento());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.COMPLEMENTO, boleto.getComplemento());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_DIAS_PROTESTO, boleto.getNumeroDiasProtesto());
            line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, boleto.getNumeroSequencialRegistroArquivo2());

            arquivo.addLine(line);

            if (boleto.temOpcional() == true) {
                Cnab400SantanderLoteEnvioBoletoOpcional opcional = boleto.getOpcional();
                line = arquivoArchetype.getLineArchetype(FileCnab400SantanderEnvio.OPCIONAL_MOVIMENTO_REMESSA).createModel();
                line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.CODIGO_TRANSMISSAO, opcional.getCodigoTransmissao());
                line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.SUB_SEQUENCIA_REGISTRO, opcional.getSubSequenciaRegistro());
                line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.MENSAGEM_VARIAVEL_TITULO, opcional.getMensagemVariavelTitulo());
                line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.IDENTIFICADOR_COMPLEMENTO, opcional.getIdentificadorComplemento());
                line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.COMPLEMENTO, opcional.getComplemento());
                line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, opcional.getNumeroSequencialRegistroArquivo3());

            }

            arquivo.addLine(line);
        }

        Cnab400SantanderLoteEnvio trailler = (Cnab400SantanderLoteEnvio) lote;
        line = arquivoArchetype.getLineArchetype(FileCnab400SantanderEnvio.TRAILLER_REMESSA).createModel();
        line.setFieldValue(LineCnabRegistroTraillerRemessa.QUANTIDADE_TOTAL_LINHAS_ARQUIVO, trailler.getQuantidadeTotalLinhas());
        line.setFieldValue(LineCnabRegistroTraillerRemessa.VALOR_TOTAL_TITULOS, trailler.getValorTotalTitulo());
        line.setFieldValue(LineCnabRegistroTraillerRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, trailler.getNumeroVersaoRemessa());
        line.setFieldValue(LineCnabRegistroTraillerRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, trailler.getNumeroSequencialRegistroArquivo4());

        arquivo.addLine(line);
        try {
            FileWriter fw = new FileWriter(nomeArquivo);
            fw.write(arquivo.getRepresentation().toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Cnab400SantanderArquivoGerador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
