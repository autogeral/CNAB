package br.com.jcomputacao.cnab.t240;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 29/08/2024 15:29:07
 *
 * @author murilo
 */
public class MapaCobrancaRetornoSegmentuTOcorrenciasItentificacao {

    // Banco, versao, ocorrenica, identificacao
    private static final Map<Integer, Map<Integer, Map<Integer, Map<String, String>>>> MAPA_DESCRICAO_IDENTIFICAO_OCORRENCIAS = new TreeMap<>();

    static {
        TreeMap<Integer, Map<Integer, Map<String, String>>> mapaVersoesSantander = new TreeMap<>();
        mapaVersoesSantander.put(40, mapaSantanderCnab240Versao040());
        MAPA_DESCRICAO_IDENTIFICAO_OCORRENCIAS.put(33, mapaVersoesSantander);

        TreeMap<Integer, Map<Integer, Map<String, String>>> mapaVersoesItau = new TreeMap<>();
        mapaVersoesItau.put(40, mapaItauCnab240Versao040());
        MAPA_DESCRICAO_IDENTIFICAO_OCORRENCIAS.put(341, mapaVersoesItau);
    }

    public static String getDescricaoIdentificaoOcorrencia(int bancoCodigo, int layoutArquivo, int codigoOcorrencia, String identificacaoOcorrencia) {
        if (!MAPA_DESCRICAO_IDENTIFICAO_OCORRENCIAS.containsKey(bancoCodigo)) {
            return "Identificação de ocorrência não registrado para o banco : " + bancoCodigo;
        }
        Map<Integer, Map<Integer, Map<String, String>>> mapaBancos = MAPA_DESCRICAO_IDENTIFICAO_OCORRENCIAS.get(bancoCodigo);
        if (!mapaBancos.containsKey(layoutArquivo)) {
            return "Identificação de ocorrência não registrado para o banco : " + bancoCodigo + " na versão " + layoutArquivo;
        }
        Map<Integer, Map<String, String>> mapaLayoutsDoBanco = mapaBancos.get(layoutArquivo);
        if (!mapaLayoutsDoBanco.containsKey(codigoOcorrencia)) {
            return "Identificação de ocorrência não registrado para o banco : " + bancoCodigo + " na versão " + layoutArquivo + ", ocorrência : " + codigoOcorrencia;
        }
        Map<String, String> mapaOcorrenciasDoBancoNoLayout = mapaLayoutsDoBanco.get(codigoOcorrencia);
        return mapaOcorrenciasDoBancoNoLayout.getOrDefault(identificacaoOcorrencia,
                 "Identificação de ocorrência não registrado para o banco : " + bancoCodigo + ", versão " + layoutArquivo + ", ocorrência : " + codigoOcorrencia + ", identificação : " + identificacaoOcorrencia);
    }

    private static Map<Integer, Map<String, String>> mapaItauCnab240Versao040() {
        Map<Integer, Map<String, String>> mapa = new TreeMap<>();
        Map<String, String> mapaItauCnab240Versao040EntradasRejeitadas = mapaItauCnab240Versao040EntradasRejeitadas();
        mapa.put(3, mapaItauCnab240Versao040EntradasRejeitadas);

        Map<String, String> mapaItauCnab240Versao040BaixasRejeitadas = mapaItauCnab240Versao040BaixasRejeitadas();
        mapa.put(15, mapaItauCnab240Versao040BaixasRejeitadas);

        Map<String, String> mapaItauCnab240Versao040InstrucoesRejeitadas = mapaItauCnab240Versao040InstrucoesRejeitadas();
        mapa.put(16, mapaItauCnab240Versao040InstrucoesRejeitadas);

        Map<String, String> mapaItauCnab240Versao040AlteracoesRejeitadas = mapaItauCnab240Versao040AlteracoesRejeitadas();
        mapa.put(17, mapaItauCnab240Versao040AlteracoesRejeitadas);

        Map<String, String> mapaItauCnab240Versao040AlteracoesDadosCobrancaRejeitadas = mapaItauCnab240Versao040AlteracoesDadosCobrancaRejeitadas();
        mapa.put(18, mapaItauCnab240Versao040AlteracoesDadosCobrancaRejeitadas);

        Map<String, String> mapaItauCnab240Veresao040OrdemSustada = mapaItauCnab240Veresao040OrdemSustada();
        mapa.put(24, mapaItauCnab240Veresao040OrdemSustada);

        Map<String, String> mapaItauCnab240Versao040AlegacoesPagador = mapaItauCnab240Versao040AlegacoesPagador();
        mapa.put(25, mapaItauCnab240Versao040AlegacoesPagador);
        
        Map<String, String> mapaItauCnab240Versao040InstrucaoDeNegativacaoRejeitdada = mapaItauCnab240Versao040InstrucaoDeNegativacaoRejeitdada();
        mapa.put(74, mapaItauCnab240Versao040InstrucaoDeNegativacaoRejeitdada);
        
        Map<String, String> mapaItauCnab240Versao040InstrucaoDeNegativacaoInformacional = mapaItauCnab240Versao040InstrucaoDeNegativacaoInformacional();
        mapa.put(79, mapaItauCnab240Versao040InstrucaoDeNegativacaoInformacional);

        return mapa;

    }

    /**
     * O mapa eh especifico do banco e da versao A chave do mapa eh a
     * ocorrencia, o mapa interno tem o codigo da identificacao da ocorrencia
     *
     * @return
     */
    private static Map<Integer, Map<String, String>> mapaSantanderCnab240Versao040() {
        Map<Integer, Map<String, String>> mapa = new TreeMap<>();

        // Para as ocorrencia 03, 26 e 30 se utiliza o a tabela 40A
        Map<String, String> mapaSantanderCnab240Versao040Tabela40A = mapaSantanderCnab240Versao040Tabela40A();
        mapa.put(3, mapaSantanderCnab240Versao040Tabela40A);
        mapa.put(26, mapaSantanderCnab240Versao040Tabela40A);
        mapa.put(30, mapaSantanderCnab240Versao040Tabela40A);

        // Para as ocorrencia 03, 26 e 30 se utiliza o a tabela 40A
        Map<String, String> mapaSantanderCnab240Versao040Tabela40C = mapaSantanderCnab240Versao040Tabela40C();
        mapa.put(6, mapaSantanderCnab240Versao040Tabela40C);
        mapa.put(9, mapaSantanderCnab240Versao040Tabela40C);
        mapa.put(17, mapaSantanderCnab240Versao040Tabela40C);
        mapa.put(93, mapaSantanderCnab240Versao040Tabela40C);
        mapa.put(94, mapaSantanderCnab240Versao040Tabela40C);
        return mapa;
    }

    /**
     * Santander, layout 040 Nota 40, códigos 03,26,30 -> 40-A Nota 40, códigos
     * 06,09,17,93,94 -> 40-C
     */
    private static Map<String, String> mapaSantanderCnab240Versao040Tabela40A() {
        Map<String, String> mapa = new HashMap<>();
        // 40-A
        mapa.put("01", "código do banco invalido");
        mapa.put("02", "código do registro detalhe inválido");
        mapa.put("03", "código do segmento invalido");
        mapa.put("04", "código do movimento não permitido para carteira");
        mapa.put("05", "código de movimento invalido");
        mapa.put("06", "tipo/numero de inscrição do Beneficiário inválidos");
        mapa.put("07", "agencia/conta/DV invalido");
        mapa.put("08", "nosso numero invalido");
        mapa.put("09", "nosso numero duplicado");
        mapa.put("10", "carteira invalida");
        mapa.put("11", "forma de cadastramento do boleto invalida se Desconto ou Cessão, boleto rejeitado - operação de Desconto ou Cessão fora do horário limite.");
        mapa.put("12", "tipo de documento invalido");
        mapa.put("13", "identificação da emissão do Boleto invalida");
        mapa.put("14", "identificação da distribuição do Boleto invalida");
        mapa.put("15", "características da cobrança incompatíveis");
        mapa.put("16", "data de vencimento invalida");
        mapa.put("17", "data de vencimento anterior a data de emissão");
        mapa.put("18", "vencimento fora do prazo de operação");
        mapa.put("19", "boleto a cargo de bancos correspondentes com vencimento inferior a xx dias");
        mapa.put("20", "valor do boleto invalido");
        mapa.put("21", "espécie do boleto invalida");
        mapa.put("22", "espécie não permitida para a carteira");
        mapa.put("23", "aceite invalido");
        mapa.put("24", "Data de emissão inválida");
        mapa.put("25", "Data de emissão posterior a data de entrada");
        mapa.put("26", "Código de juros de mora inválido");
        mapa.put("27", "Valor/Taxa de juros de mora inválido");
        mapa.put("28", "Código de desconto inválido");
        mapa.put("29", "Valor do desconto maior ou igual ao valor do boleto");
        mapa.put("30", "Desconto a conceder não confere");
        mapa.put("31", "Concessão de desconto - já existe desconto anterior");
        mapa.put("32", "Valor do IOF");
        mapa.put("33", "Valor do abatimento inválido");
        mapa.put("34", "Valor do abatimento maior ou igual ao valor do boleto");
        mapa.put("35", "Abatimento a conceder não confere");
        mapa.put("36", "Concessão de abatimento - já existe abatimento anterior");
        mapa.put("37", "Código para protesto inválido");
        mapa.put("38", "Prazo para protesto inválido");
        mapa.put("39", "Pedido de protesto não permitido para o boleto");
        mapa.put("40", "Boleto com ordem de protesto emitida");
        mapa.put("41", "Pedido de cancelamento/sustação para boletos sem instrução de protesto");
        mapa.put("42", "Código para baixa/devolução inválido");
        mapa.put("43", "Prazo para baixa/devolução inválido");
        mapa.put("44", "Boleto já baixado");
        mapa.put("45", "Nome do Pagador não informado");
        mapa.put("46", "Tipo /Número de inscrição do Pagador inválidos");
        mapa.put("47", "Endereço do Pagador não informado");
        mapa.put("48", "CEP inválido");
        mapa.put("49", "CEP sem praça de cobrança (não localizado)");
        mapa.put("50", "CEP referente a um Banco Correspondente");
        mapa.put("51", "CEP incompatível com a unidade de federação");
        mapa.put("52", "Unidade de federação inválida");
        mapa.put("53", "Tipo/Número de inscrição do sacador/avalista inválidos");
        mapa.put("54", "Sacador/Avalista não informado");
        mapa.put("55", "Nosso número no Banco Correspondente não informado");
        mapa.put("56", "Código do Banco Correspondente não informado");
        mapa.put("57", "Código da multa inválido");
        mapa.put("58", "Data da multa inválida");
        mapa.put("59", "Valor/Percentual da multa inválido");
        mapa.put("60", "Movimento para boleto não cadastrado");
        mapa.put("61", "Alteração de agência cobradora/dv inválida");
        mapa.put("62", "Tipo de impressão inválido");
        mapa.put("63", "Entrada para boleto já cadastrado");
        mapa.put("64", "Número da linha inválido");
        mapa.put("65", "A espécie de boleto não permite a instrução");
        mapa.put("72", "Entrada de boleto Sem Registro");
        mapa.put("90", "Identificador/Quantidade de Parcelas de carnê invalido");
        mapa.put("91", "Boleto Descontado, instrução não permitida");
        mapa.put("92", "Data de Desconto Inválida");
        mapa.put("93", "Número do lote remessa inválido");
        mapa.put("B2", "Valor Nominal do Boleto Conflitante");
        mapa.put("B3", "Tipo de Pagamento Inválido");
        mapa.put("B4", "Valor Máximo ou Percentual Máximo Inválido");
        mapa.put("B5", "Valor Mínimo ou Percentual Mínimo Inválido");
        mapa.put("C1", "Não foi realizada a contratação do produto SX Integra para operar com Cessão");
        mapa.put("C2", "Operação de Cessão não Confirmada");
        mapa.put("C3", "Operação de Cessão Rejeitada – Ver detalhes no relatório do SX Integra");
        mapa.put("E1", "CNPJ Raiz do pagador não pode ser igual ao do beneficiário original");
        mapa.put("E2", "CNPJ Raiz do pagador não pode ser igual ao do beneficiário final");
        mapa.put("E3", "CNPJ Raiz do beneficiário final não pode ser igual ao CNPJ Raiz do beneficiário original para o convênio");
        mapa.put("E4", "CPF do pagador não pode ser igual ao do beneficiário original");
        mapa.put("E5", "CPF do pagador não pode ser igual ao do beneficiário final");
        mapa.put("E6", "CPF do beneficiário final não pode ser igual ao CPF do beneficiário original para o convênio");
        mapa.put("E7", "Registro não permitido – Beneficiário Final com restrição");
        mapa.put("E8", "Código de Moeda Inválido");
        mapa.put("E9", "Obrigatório informar o Beneficiário Final para o boleto");
        mapa.put("P1", "Registrado com QR Code Pix");
        mapa.put("P2", "Registrado sem QR Code Pix");
        mapa.put("P3", "Chave PIX Inválida");
        mapa.put("P4", "Chave PIX sem cadastro na DICT");
        mapa.put("P5", "Chave PIX não é compatível com o CNPJ");
        mapa.put("P6", "Identificador (TXID) em duplicidade");
        mapa.put("P7", "Identificador (TXID) inválido ou não encontrado");
        mapa.put("P8", "Alteração não permitida – QR Code concluído, removido pelo PSP ou removido pelo usuário recebedor");
        mapa.put("P9", "Cancelamento não permitido – QR Code concluído, removido pelo PSP ou removido pelo usuário recebedor");
        mapa.put("Z1", "Quantidade de Pagamento Possíveis Inválido");
        mapa.put("Z5", "Boleto com reserva, instrução não permitida");
        mapa.put("Z6", "Segmento Inválido para o tipo de Carteira de Cobrança");
        mapa.put("Z7", "Instrução exige segmento Y53");
        return mapa;
    }

    /**
     * Santander, layout 040 Nota 40, códigos 03,26,30 -> 40-A Nota 40, códigos
     * 06,09,17,93,94 -> 40-C
     */
    private static Map<String, String> mapaSantanderCnab240Versao040Tabela40C() {
        Map<String, String> mapa = new HashMap<>();
        // 40-C
        mapa.put("01", "Por saldo");
        mapa.put("02", "Por conta");
        mapa.put("03", "No próprio banco");
        mapa.put("04", "Compensação eletrônica");
        mapa.put("05", "Compensação convencional");
        mapa.put("06", "Arquivo magnético");
        mapa.put("07", "Após feriado local");
        mapa.put("08", "Em cartório");
        mapa.put("09", "Pagamento Parcial");
        mapa.put("61", "Liquidação Por Pagamento PIX");
        mapa.put("92", "Pagamento PIX");
        mapa.put("93", "Baixa Operacional enviado pela CIP");
        mapa.put("94", "Cancelamento de Baixa Operacional enviado pela CIP");
        return mapa;
    }

    /**
     * Itau, rejeitadas Itaú Ocorrencia 03 códigos de ocorrência 03, 15, 16, 17
     * e 18, posições 16 a 17, do registro segmento T) pode-se ler nas posições
     * 214 a 221
     */
    private static Map<String, String> mapaItauCnab240Versao040EntradasRejeitadas() {
        Map<String, String> mapa = new HashMap<>();
        //, "Entradas rejeitas, ocorrência 3");
        mapa.put("03", "AG. COBRADORA - NÃO FOI POSSÍVEL ATRIBUIR A AGÊNCIA PELO CEP OU CEP INVÁLIDO");
        mapa.put("04", "ESTADO - SIGLA DO ESTADO INVÁLIDA");
        mapa.put("05", "DATA VENCIMENTO - PRAZO DA OPERAÇÃO MENOR QUE PRAZO MÍNIMO OU MAIOR QUE O MÁXIMO");
        mapa.put("08", "NOME DO PAGADOR NÃO INFORMADO OU DESLOCADO");
        mapa.put("09", "AGÊNCIA/CONTA - AGÊNCIA ENCERRADA");
        mapa.put("10", "LOGRADOURO NÃO INFORMADO OU DESLOCADO");
        mapa.put("11", "CEP - CEP NÃO NUMÉRICO");
        mapa.put("12", "SACADOR AVALISTA NOME NÃO INFORMADO OU DESLOCADO (BANCOS CORRESPONDENTES)");
        mapa.put("13", "ESTADO/CEP - CEP INCOMPATÍVEL COM A SIGLA DO ESTADO");
        mapa.put("14", "NOSSO NÚMERO - NOSSO NÚMERO JÁ REGISTRADO NO CADASTRO DO BANCO OU FORA DA FAIXA");
        mapa.put("15", "NOSSO NÚMERO - NOSSO NÚMERO EM DUPLICIDADE NO MESMO MOVIMENTO");
        mapa.put("18", "DATA DE ENTRADA DATA DE ENTRADA INVÁLIDA PARA OPERAR COM ESTA CARTEIRA");
        mapa.put("19", "OCORRÊNCIA - OCORRÊNCIA INVÁLIDA");
        mapa.put("21", "AG. COBRADORA * CARTEIRA NÃO ACEITA DEPOSITÁRIA CORRESPONDENTE * ESTADO DA AGÊNCIA DIFERENTE DO ESTADO DO PAGADOR * AG. COBRADORA NÃO CONSTA NO CADASTRO OU ENCERRANDO");
        mapa.put("22", "CARTEIRA - CARTEIRA NÃO PERMITIDA (NECESSÁRIO CADASTRAR FAIXA LIVRE)");
        mapa.put("27", "CNPJ INAPTO CNPJ DO BENEFICIÁRIO INAPTO DEVOLUÇÃO DE TÍTULO EM GARANTIA");
        mapa.put("29", "CÓDIGO EMPRESA - CATEGORIA DA CONTA INVÁLIDA");
        mapa.put("31", "AGÊNCIA/CONTA CONTA NÃO TEM PERMISSÃO PARA PROTESTAR (CONTATE SEU GERENTE)");
        mapa.put("35", "VALOR DO IOF - IOF MAIOR QUE 5%");
        mapa.put("36", "QTDADE DE MOEDA QUANTIDADE DE MOEDA INCOMPATÍVEL COM VALOR DO TÍTULO");
        mapa.put("37", "CNPJ/CPF DO PAGADOR - NÃO NUMÉRICO OU IGUAL A ZEROS");
        mapa.put("42", "NOSSO NÚMERO - NOSSO NÚMERO FORA DE FAIXA");
        mapa.put("52", "AG. COBRADORA - EMPRESA NÃO ACEITA BANCO CORRESPONDENTE");
        mapa.put("53", "AG. COBRADORA EMPRESA NÃO ACEITA BANCO CORRESPONDENTE - COBRANÇA MENSAGEM");
        mapa.put("54", "DATA DE VENCTO - BANCO CORRESPONDENTE – TÍTULO COM VENCIMENTO INFERIOR A 15 DIAS 55 DEP./BCO. CORRESP. CEP NÃO PERTENCE A DEPOSITÁRIA INFORMADA");
        mapa.put("56", "DT. VCTO./BCO. CORESP. - VENCTO. SUPERIOR A 180 DIAS DA DATA DE ENTRADA");
        mapa.put("57", "DATA DE VENCIMENTO CEP SÓ DEPOSITÁRIA BCO. DO BRASIL COM VENCTO. INFERIOR A 8 DIAS");
        mapa.put("60", "ABATIMENTO - VALOR DO ABATIMENTO INVÁLIDO");
        mapa.put("61", "JUROS DE MORA JUROS DE MORA MAIOR QUE O PERMITIDO");
        mapa.put("62", "DESCONTO - VALOR DO DESCONTO MAIOR QUE O VALOR DO TÍTULO");
        mapa.put("63", "DESCONTO DE ANTECIPAÇÃO VALOR DA IMPORTÂNCIA POR DIA DE DESCONTO (IDD) NÃO PERMITIDO");
        mapa.put("64", "EMISSÃO DO TÍTULO - DATA DE EMISSÃO DO TÍTULO INVÁLIDA (VENDOR)");
        mapa.put("65", "TAXA FINANCTO. TAXA INVÁLIDA (VENDOR)");
        mapa.put("66", "DATA DE VENCTO - INVALIDA/FORA DE PRAZO DE OPERAÇÃO (MÍNIMO OU MÁXIMO)");
        mapa.put("67", "VALOR/QTIDADE. VALOR DO TÍTULO/QUANTIDADE DE MOEDA INVÁLIDO");
        mapa.put("68", "CARTEIRA - CARTEIRA INVÁLIDA OU NÃO CADASTRADA NO INTERCÂMBIO DA COBRANÇA");
        mapa.put("98", "FLASH INVÁLIDO REGISTRO MENSAGEM SEM FLASH CADASTRADO OU FLASH INFORMADO DIFERENTE DO CADASTRADO");
        mapa.put("99", "FLASH INVÁLIDO - CONTA DE COBRANÇA COM FLASH CADASTRADO E SEM REGISTRO DE MENSAGEM CORRESPONDENTE");
        return mapa;
    }

    /**
     * Ocorrencia 15
     *
     * @return
     */
    private static Map<String, String> mapaItauCnab240Versao040BaixasRejeitadas() {
        Map<String, String> mapa = new HashMap<>();
        //, "Baixa Rejeitas, ocorrência 15");
        mapa.put("04", "NOSSO NÚMERO EM DUPLICIDADE NUM MESMO MOVIMENTO");
        mapa.put("05", "SOLICITAÇÃO DE BAIXA PARA TÍTULO JÁ BAIXADO OU LIQUIDADO");
        mapa.put("06", "SOLICITAÇÃO DE BAIXA PARA TÍTULO NÃO REGISTRADO NO SISTEMA");
        mapa.put("07", "COBRANÇA PRAZO CURTO - SOLICITAÇÃO DE BAIXA P/ TÍTULO NÃO REGISTRADO NO SISTEMA");
        mapa.put("08", "SOLICITAÇÃO DE BAIXA PARA TÍTULO EM FLOATING");
        return mapa;
    }

    /**
     * Ocorrencia 16
     *
     * @return
     */
    private static Map<String, String> mapaItauCnab240Versao040InstrucoesRejeitadas() {
        Map<String, String> mapa = new HashMap<>();
        //, "Instruções rejeitadas (código da ocorrência = 16 na posição 16 a 17)");
        mapa.put("01", "INSTRUÇÃO/OCORRÊNCIA NÃO EXISTENTE");
        mapa.put("03", "CONTA NÃO TEM PERMISSÃO PARA PROTESTAR (CONTATE SEU GERENTE)");
        mapa.put("06", "NOSSO NÚMERO IGUAL A ZEROS");
        mapa.put("09", "CNPJ/CPF DO SACADOR/AVALISTA INVÁLIDO");
        mapa.put("14", "REGISTRO EM DUPLICIDADE");
        mapa.put("15", "CNPJ/CPF INFORMADO SEM NOME DO SACADOR/AVALISTA");
        mapa.put("19", "VALOR DO ABATIMENTO MAIOR QUE 90% DO VALOR DO TÍTULO");
        mapa.put("20", "EXISTE SUSTACAO DE PROTESTO PENDENTE PARA O TITULO");
        mapa.put("21", "TÍTULO NÃO REGISTRADO NO SISTEMA");
        mapa.put("22", "TÍTULO BAIXADO OU LIQUIDADO");
        mapa.put("23", "INSTRUÇÃO NÃO ACEITA");
        mapa.put("24", "INSTRUÇÃO INCOMPATÍVEL - EXISTE INSTRUÇÃO DE PROTESTO PARA O TÍTULO");
        mapa.put("25", "INSTRUÇÃO INCOMPATÍVEL - NÃO EXISTE INSTRUÇÃO DE PROTESTO PARA O TÍTULO");
        mapa.put("26", "INSTRUÇÃO NÃO ACEITA POR JÁ TER SIDO EMITIDA A ORDEM DE PROTESTO AO CARTÓRIO");
        mapa.put("27", "INSTRUÇÃO NÃO ACEITA POR NÃO TER SIDO EMITIDA A ORDEM DE PROTESTO AO CARTÓRIO");
        mapa.put("28", "JÁ EXISTE UMA MESMA INSTRUÇÃO CADASTRADA ANTERIORMENTE PARA O TÍTULO");
        mapa.put("29", "VALOR LÍQUIDO + VALOR DO ABATIMENTO DIFERENTE DO VALOR DO TÍTULO REGISTRADO");
        mapa.put("30", "EXISTE UMA INSTRUÇÃO DE NÃO PROTESTAR ATIVA PARA O TÍTULO");
        mapa.put("31", "EXISTE UMA OCORRÊNCIA DO PAGADOR QUE BLOQUEIA A INSTRUÇÃO");
        mapa.put("32", "DEPOSITÁRIA DO TÍTULO = 9999 OU CARTEIRA NÃO ACEITA PROTESTO");
        mapa.put("33", "ALTERAÇÃO DE VENCIMENTO IGUAL À REGISTRADA NO SISTEMA OU QUE TORNA O TÍTULO VENCIDO");
        mapa.put("34", "INSTRUÇÃO DE EMISSÃO DE AVISO DE COBRANÇA PARA TÍTULO VENCIDO ANTES DO VENCIMENTO");
        mapa.put("35", "SOLICITAÇÃO DE CANCELAMENTO DE INSTRUÇÃO INEXISTENTE");
        mapa.put("36", "TÍTULO SOFRENDO ALTERAÇÃO DE CONTROLE (AGÊNCIA/CONTA/CARTEIRA/NOSSO NÚMERO)");
        mapa.put("37", "INSTRUÇÃO NÃO PERMITIDA PARA A CARTEIRA");
        mapa.put("40", "INSTRUÇÃO INCOMPATÍVEL – NÃO EXISTE INSTRUÇÃO DE NEGATIVAÇÃO EXPRESSA PARA O TÍTULO");
        mapa.put("41", "INSTRUÇÃO NÃO PERMITIDA – TÍTULO JÁ ENVIADO PARA NEGATIVAÇÃO EXPRESSA");
        mapa.put("42", "INSTRUÇÃO NÃO PERMITIDA – TÍTULO COM NEGATIVAÇÃO EXPRESSA CONCLUÍDA");
        mapa.put("43", "PRAZO INVÁLIDO PARA NEGATIVAÇÃO – MÍNIMO: 02 DIAS CORRIDOS APÓS O VENCIMENTO");
        mapa.put("45", "INSTRUÇÃO INCOMPATÍVEL PARA O MESMO TÍTULO NESTA DATA");
        mapa.put("47", "INSTRUÇÃO NÃO PERMITIDA – ESPÉCIE INVÁLIDA");
        mapa.put("48", "DADOS DO PAGADOR INVÁLIDOS (CPF / CNPJ / NOME)");
        mapa.put("49", "DADOS DO ENDEREÇO DO PAGADOR INVÁLIDOS");
        mapa.put("50", "DATA DE EMISSÃO DO TÍTULO INVÁLIDA");
        mapa.put("51", "INSTRUÇÃO NÃO PERMITIDA – TÍTULO COM NEGATIVAÇÃO EXPRESSA AGENDADA");
        return mapa;
    }

    /**
     * Ocorrencia 17
     *
     * @return
     */
    private static Map<String, String> mapaItauCnab240Versao040AlteracoesRejeitadas() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("02", "AGÊNCIA COBRADORA INVÁLIDA OU COM O MESMO CONTEÚDO");
        mapa.put("04", "SIGLA DO ESTADO INVÁLIDA");
        mapa.put("05", "DATA DE VENCIMENTO INVÁLIDA OU COM O MESMO CONTEÚDO");
        mapa.put("06", "VALOR DO TÍTULO COM OUTRA ALTERAÇÃO SIMULTÂNEA");
        mapa.put("08", "NOME DO PAGADOR COM O MESMO CONTEÚDO");
        mapa.put("11", "CEP INVÁLIDO");
        mapa.put("12", "NÚMERO INSCRIÇÃO INVÁLIDO DO SACADOR AVALISTA");
        mapa.put("13", "SEU NÚMERO COM O MESMO CONTEÚDO");
        mapa.put("21", "AGÊNCIA COBRADORA NÃO CONSTA NO CADASTRO DE DEPOSITÁRIA OU EM ENCERRAMENTO");
        mapa.put("42", "ALTERAÇÃO INVÁLIDA PARA TÍTULO VENCIDO");
        mapa.put("43", "ALTERAÇÃO BLOQUEADA – VENCIMENTO JÁ ALTERADO");
        mapa.put("53", "INSTRUÇÃO COM O MESMO CONTEÚDO");
        mapa.put("54", "DATA VENCIMENTO PARA BANCOS CORRESPONDENTES INFERIOR AO ACEITO PELO BANCO");
        mapa.put("55", "ALTERAÇÕES IGUAIS PARA O MESMO CONTROLE (AGÊNCIA/CONTA/CARTEIRA/NOSSO NÚMERO)");
        mapa.put("60", "VALOR DE IOF – ALTERAÇÃO NÃO PERMITIDA PARA CARTEIRAS DE N.S. – MOEDA VARIÁVEL");
        mapa.put("61", "TÍTULO JÁ BAIXADO OU LIQUIDADO OU NÃO EXISTE TÍTULO CORRESPONDENTE NO SISTEMA");
        mapa.put("66", "ALTERAÇÃO NÃO PERMITIDA PARA CARTEIRAS DE NOTAS DE SEGUROS – MOEDA VARIÁVEL");
        mapa.put("67", "NOME INVÁLIDO DO SACADOR AVALISTA");
        mapa.put("72", "ENDEREÇO INVÁLIDO – SACADOR AVALISTA");
        mapa.put("73", "BAIRRO INVÁLIDO – SACADOR AVALISTA");
        mapa.put("74", "CIDADE INVÁLIDA – SACADOR AVALISTA");
        mapa.put("75", "SIGLA ESTADO INVÁLIDO – SACADOR AVALISTA");
        mapa.put("76", "CEP INVÁLIDO – SACADOR AVALISTA");
        mapa.put("81", "ALTERAÇÃO BLOQUEADA - TÍTULO COM NEGATIVAÇÃO EXPRESSA OU PROTESTO");
        return mapa;
    }

    private static Map<String, String> mapaItauCnab240Versao040AlteracoesDadosCobrancaRejeitadas() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("16", "ABATIMENTO/ALTERAÇÃO DO VALOR DO TÍTULO OU SOLICITAÇÃO DE BAIXA BLOQUEADOS");
        mapa.put("40", "NÃO APROVADA DEVIDO AO IMPACTO NA ELEGIBILIDADE DE GARANTIAS");
        mapa.put("41", "AUTOMATICAMENTE REJEITADA");
        mapa.put("42", "CONFIRMA RECEBIMENTO DE INSTRUÇÃO – PENDENTE DE ANÁLISE");
        return mapa;
    }

    private static Map<String, String> mapaItauCnab240Veresao040OrdemSustada() {
        // Ordem de protesto sustada, motivo (código de ocorrência = 24
        Map<String, String> mapa = new HashMap<>();
        mapa.put("1610", "DOCUMENTAÇÃO SOLICITADA AO BENEFICIÁRIO");
        mapa.put("3103", "INSUFICIENCIA DE DADOS PARA ENVIO AO CARTÓRIO");
        mapa.put("3111", "SUSTAÇÃO SOLICITADA AG. BENEFICIÁRIO");
        mapa.put("3129", "TITULO NAO ENVIADO A CARTORIO");
        mapa.put("3137", "AGUARDAR UM DIA UTIL APOS O VENCTO PARA PROTESTAR");
        mapa.put("3145", "DM/DMI SEM COMPROVANTE AUTENTICADO OU DECLARACAO");
        mapa.put("3152", "FALTA CONTRATO DE SERV(AG.CED:ENVIAR)");
        mapa.put("3160", "NOME DO PAGADOR INCOMPLETO/INCORRETO");
        mapa.put("3178", "NOME DO BENEFICIÁRIO INCOMPLETO/INCORRETO");
        mapa.put("3186", "NOME DO SACADOR INCOMPLETO/INCORRETO");
        mapa.put("3194", "TIT ACEITO: IDENTIF ASSINANTE DO CHEQ");
        mapa.put("3202", "TIT ACEITO: RASURADO OU RASGADO");
        mapa.put("3210", "TIT ACEITO: FALTA TIT.(AG.CED:ENVIAR)");
        mapa.put("3228", "ATOS DA CORREGEDORIA ESTADUAL");
        mapa.put("3236", "NAO FOI POSSIVEL EFETUAR O PROTESTO");
        mapa.put("3244", "PROTESTO SUSTADO / BENEFICIÁRIO NÃO ENTREGOU A DOCUMENTAÇÃO");
        mapa.put("3251", "DOCUMENTACAO IRREGULAR");
        mapa.put("3269", "DATA DE EMISSÃO DO TÍTULO INVÁLIDA / IRREGULAR");
        mapa.put("3277", "ESPECIE INVALIDA PARA PROTESTO");
        mapa.put("3285", "PRAÇA NÃO ATENDIDA PELA REDE BANCÁRIA");
        mapa.put("3293", "CENTRALIZADORA DE PROTESTO NAO RECEBEU A DOCUMENTACAO");
        mapa.put("3301", "CNPJ/CPF DO PAGADOR INVÁLIDO / INCORRETO");
        mapa.put("3319", "SACADOR/AVALISTA E PESSOA FÍSICA");
        mapa.put("3327", "CEP DO PAGADOR INCORRETO");
        mapa.put("3335", "DEPOSITÁRIA INCOMPATÍVEL COM CEP DO PAGADOR");
        mapa.put("3343", "CNPJ/CPF SACADOR INVALIDO / INCORRETO");
        mapa.put("3350", "ENDEREÇO DO PAGADOR INSUFICIENTE");
        mapa.put("3368", "PRAÇA PAGTO INCOMPATÍVEL COM ENDEREÇO");
        mapa.put("3376", "FALTA NÚMERO/ESPÉCIE DO TÍTULO");
        mapa.put("3384", "TÍTULO ACEITO S/ ASSINATURA DO SACADOR");
        mapa.put("3392", "TÍTULO ACEITO S/ ENDOSSO BENEFICIÁRIO OU IRREGULAR");
        mapa.put("3400", "TÍTULO SEM LOCAL OU DATA DE EMISSÃO");
        mapa.put("3418", "TÍTULO ACEITO COM VALOR EXTENSO DIFERENTE DO NUMÉRICO");
        mapa.put("3426", "TÍTULO ACEITO DEFINIR ESPÉCIE DA DUPLICATA");
        mapa.put("3434", "DATA EMISSÃO POSTERIOR AO VENCIMENTO");
        mapa.put("3442", "TÍTULO ACEITO DOCUMENTO NÃO PROTESTÁVEL");
        mapa.put("3459", "TÍTULO ACEITO EXTENSO VENCIMENTO IRREGULAR");
        mapa.put("3467", "TÍTULO ACEITO FALTA NOME FAVORECIDO");
        mapa.put("3475", "TÍTULO ACEITO FALTA PRAÇA DE PAGAMENTO");
        mapa.put("3483", "TÍTULO ACEITO FALTA CPF ASSINANTE CHEQUE");
        mapa.put("3491", "FALTA NÚMERO DO TÍTULO (SEU NÚMERO)");
        mapa.put("3509", "CARTÓRIO DA PRAÇA COM ATIVIDADE SUSPENSA");
        mapa.put("3517", "DATA APRESENTACAO MENOR QUE A DATA VENCIMENTO");
        mapa.put("3525", "FALTA COMPROVANTE DA PRESTACAO DE SERVICO");
        mapa.put("3533", "CNPJ/CPF PAGADOR INCOMPATIVEL C/ TIPO DE DOCUMENTO");
        mapa.put("3541", "CNPJ/CPF SACADOR INCOMPATIVEL C/ ESPECIE");
        mapa.put("3558", "TIT ACEITO: S/ ASSINATURA DO PAGADOR");
        mapa.put("3566", "FALTA DATA DE EMISSAO DO TITULO");
        mapa.put("3574", "SALDO MAIOR QUE O VALOR DO TITULO");
        mapa.put("3582", "TIPO DE ENDOSSO INVALIDO");
        mapa.put("3590", "DEVOLVIDO POR ORDEM JUDICIAL");
        mapa.put("3608", "DADOS DO TITULO NAO CONFEREM COM DISQUETE");
        mapa.put("3616", "PAGADOR E SACADOR AVALISTA SÃO A MESMA PESSOA");
        mapa.put("3624", "COMPROVANTE ILEGIVEL PARA CONFERENCIA E MICROFILMAGEM");
        mapa.put("3632", "CONFIRMAR SE SAO DOIS EMITENTES");
        mapa.put("3640", "ENDERECO DO PAGADOR IGUAL AO DO SACADOR OU DO PORTADOR");
        mapa.put("3657", "ENDERECO DO BENEFICIÁRIO INCOMPLETO OU NAO INFORMADO");
        mapa.put("3665", "ENDERECO DO EMITENTE NO CHEQUE IGUAL AO DO BANCO PAGADOR");
        mapa.put("3673", "FALTA MOTIVO DA DEVOLUCAO NO CHEQUE OU ILEGIVEL");
        mapa.put("3681", "TITULO COM DIREITO DE REGRESSO VENCIDO");
        mapa.put("3699", "TITULO APRESENTADO EM DUPLICIDADE");
        mapa.put("3707", "LC EMITIDA MANUALMENTE (TITULO DO BANCO/CA)");
        mapa.put("3715", "NAO PROTESTAR LC (TITULO DO BANCO/CA)");
        mapa.put("3723", "ELIMINAR O PROTESTO DA LC (TITULO DO BANCO/CA)");
        mapa.put("3731", "TITULO JA PROTESTADO");
        mapa.put("3749", "TITULO - FALTA TRADUCAO POR TRADUTOR PUBLICO");
        mapa.put("3756", "FALTA DECLARACAO DE SALDO ASSINADA NO TITULO");
        mapa.put("3764", "CONTRATO DE CAMBIO - FALTA CONTA GRAFICA");
        mapa.put("3772", "PAGADOR FALECIDO");
        mapa.put("3780", "ESPECIE DE TITULO QUE O BANCO NAO PROTESTA");
        mapa.put("3798", "AUSENCIA DO DOCUMENTO FISICO");
        mapa.put("3806", "ORDEM DE PROTESTO SUSTADA, MOTIVO");
        mapa.put("3814", "PAGADOR APRESENTOU QUITAÇÃO DO TÍTULO");
        mapa.put("3822", "PAGADOR IRÁ NEGOCIAR COM BENEFICIÁRIO");
        mapa.put("3830", "CPF INCOMPATÍVEL COM A ESPÉCIE DO TÍTULO");
        mapa.put("3848", "TÍTULO DE OUTRA JURISDIÇÃO TERRITORIAL");
        mapa.put("3855", "TÍTULO COM EMISSÃO ANTERIOR A CONCORDATA DO PAGADOR");
        mapa.put("3863", "PAGADOR CONSTA NA LISTA DE FALÊNCIA");
        mapa.put("3871", "APRESENTANTE NÃO ACEITA PUBLICAÇÃO DE EDITAL");
        mapa.put("3889", "CARTÓRIO COM PROBLEMAS OPERACIONAIS");
        mapa.put("3897", "ENVIO DE TITULOS PARA PROTESTO TEMPORARIAMENTE PARALISADO");
        mapa.put("3905", "BENEFICIÁRIO COM CONTA EM COBRANCA SUSPENSA");
        mapa.put("3913", "CEP DO PAGADOR É UMA CAIXA POSTAL");
        mapa.put("3921", "ESPÉCIE NÃO PROTESTÁVEL NO ESTADO");
        mapa.put("3939", "FALTA ENDEREÇO OU DOCUMENTO DO SACADOR AVALISTA");
        mapa.put("3947", "CORRIGIR A ESPECIE DO TITULO");
        mapa.put("3954", "ERRO DE PREENCHIMENTO DO TITULO");
        mapa.put("3962", "VALOR DIVERGENTE ENTRE TITULO E COMPROVANTE");
        mapa.put("3970", "CONDOMINIO NAO PODE SER PROTESTADO P/ FINS FALIMENTARES");
        mapa.put("3988", "VEDADA INTIMACAO POR EDITAL PARA PROTESTO FALIMENTAR");
        return mapa;
    }

    private static Map<String, String> mapaItauCnab240Versao040AlegacoesPagador() {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("16", "ABATIMENTO/ALTERAÇÃO DO VALOR DO TÍTULO OU SOLICITAÇÃO DE BAIXA BLOQUEADOS");
        mapa.put("40", "NÃO APROVADA DEVIDO AO IMPACTO NA ELEGIBILIDADE DE GARANTIAS");
        mapa.put("41", "AUTOMATICAMENTE REJEITADA");
        mapa.put("42", "CONFIRMA RECEBIMENTO DE INSTRUÇÃO – PENDENTE DE ANÁLISE");
        return mapa;
    }

    private static Map<String, String> mapaItauCnab240Versao040InstrucaoDeNegativacaoRejeitdada() {
        Map<String, String> mapa = new HashMap<>();
// Instrução de Negativação Expressa rejeitada (código de ocorrência = 74
        mapa.put("6007", "INCLUSÃO BLOQUEADA FACE A DETERMINAÇÃO JUDICIAL");
        mapa.put("6015", "INCONSISTÊNCIAS NAS INFORMAÇÕES DE ENDEREÇO");
        mapa.put("6023", "TÍTULO JÁ DECURSADO");
        mapa.put("6031", "INCLUSÃO CONDICIONADA A APRESENTAÇÃO DE DOCUMENTO DE DÍVIDA");
        mapa.put("6163", "EXCLUSÃO NÃO PERMITIDA, REGISTRO SUSPENSO");
        mapa.put("6171", "EXCLUSÃO PARA REGISTRO INEXISTENTE");
        mapa.put("6379", "REJEIÇÃO POR DADO(S) INCONSISTENTE(S)");
        return mapa;
    }

    private static Map<String, String> mapaItauCnab240Versao040InstrucaoDeNegativacaoInformacional() {
        Map<String, String> mapa = new HashMap<>();
        // Negativação Expressa informacional (código de ocorrência = 79
        mapa.put("6049", "INFORMAÇÃO DOS CORREIOS – MUDOU-SE");
        mapa.put("6056", "INFORMAÇÃO DOS CORREIOS – DEVOLVIDO POR INFORMAÇÃO PRESTADA PELO SINDICO OU PORTEIRO");
        mapa.put("6064", "INFORMAÇÃO DOS CORREIOS – DEVOLVIDO POR INCONSISTÊNCIA NO ENDEREÇO");
        mapa.put("6072", "INFORMAÇÃO DOS CORREIOS – DESCONHECIDO");
        mapa.put("6080", "INFORMAÇÃO DOS CORREIOS – RECUSADO");
        mapa.put("6098", "INFORMAÇÃO DOS CORREIOS – AUSENTE");
        mapa.put("6106", "INFORMAÇÃO DOS CORREIOS – NÃO PROCURADO");
        mapa.put("6114", "INFORMAÇÃO DOS CORREIOS – FALECIDO");
        mapa.put("6122", "INFORMAÇÃO DOS CORREIOS – NÃO ESPECIFICADO");
        mapa.put("6130", "INFORMAÇÃO DOS CORREIOS – CAIXA POSTAL INEXISTENTE");
        mapa.put("6148", "INFORMAÇÃO DOS CORREIOS – DEVOLUÇÃO DO COMUNICADO DO CORREIO");
        mapa.put("6155", "INFORMAÇÃO DOS CORREIOS – OUTROS MOTIVOS");
        mapa.put("6478", "AR - ENTREGUE COM SUCESSO");
        mapa.put("6486", "INCLUSAO PARA REGISTRO JA EXISTENTE/RECUSADO");
        mapa.put("6494", "AR - CARTA EXTRAVIADA E NÃO ENTREGUE");
        mapa.put("6502", "AR - CARTA ROUBADA E NÃO ENTREGUE");
        mapa.put("6510", "AR - AUSENTE - ENCAMINHADO PARA ENTREGA INTERNA");
        mapa.put("6528", "AR INUTILIZADO - NÃO RETIRADO NOS CORREIOS APÓS 3 TENTATIVAS");
        mapa.put("6536", "AR - ENDERECO INCORRETO");
        mapa.put("6544", "AR - NAO PROCURADO – DEVOLVIDO AO REMETENTE");
        mapa.put("6551", "AR - NÃO ENTREGUE POR FALTA DE APRESENTAR DOCUMENTO COM FOTO");
        mapa.put("6569", "AR - MUDOU-SE");
        mapa.put("6577", "AR - DESCONHECIDO");
        mapa.put("6585", "AR - RECUSADO");
        mapa.put("6593", "AR - ENDERECO INSUFICIENTE");
        mapa.put("6601", "AR - NAO EXISTE O NUMERO INDICADO");
        mapa.put("6618", "AR – AUSENTE");
        mapa.put("6627", "AR - CARTA NAO PROCURADA NA UNIDADE DOS CORREIOS");
        mapa.put("6635", "AR – FALECIDO");
        mapa.put("6643", "AR - DEVIDO A DEVOLUCAO DO COMUNICADO DO CORREIO");
        return mapa;
    }

}
