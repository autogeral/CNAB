package br.com.jcomputacao.cnab.t240;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 29/08/2024 12:15:14
 * @author murilo
 */
public class MapaCobrancaRetornoSegmentuUOcorrencias {
    
    private static final Map<Integer, Map<Integer, Map<Integer, String>>> MAPA_DESCRICAO_OCORRENCIAS = new TreeMap<>();
    
    static {
        Map<Integer, Map<Integer, String>> mapaVersoesSantander = new TreeMap<>();
        mapaVersoesSantander.put(40, mapaSantanderCnab240Versao040());
        MAPA_DESCRICAO_OCORRENCIAS.put(33, mapaVersoesSantander);
        
        Map<Integer, Map<Integer, String>> mapaVersoesItau = new TreeMap<>();
        mapaVersoesItau.put(40, mapaItauCnab240Versao040());
        MAPA_DESCRICAO_OCORRENCIAS.put(341, mapaVersoesItau);
    }
    
    public static String getDescricaoOcorrencia(int bancoCodigo, int versao, int ocorrencia) {
        if (!MAPA_DESCRICAO_OCORRENCIAS.containsKey(bancoCodigo)) {
            return "Descricao de ocorrência não registrado para o banco : " + bancoCodigo;
        }
        Map<Integer, Map<Integer, String>> mapaVersoesDoBanco = MAPA_DESCRICAO_OCORRENCIAS.get(bancoCodigo);
        if (!mapaVersoesDoBanco.containsKey(versao)) {
            return "Descricao de ocorrência não registrado para o banco : " + bancoCodigo + " na versão " + versao;
        }
        Map<Integer, String> mapaOcorrencias = mapaVersoesDoBanco.get(versao);
        return mapaOcorrencias.getOrDefault(ocorrencia, "Descricao de ocorrência não registrado para o banco : " + bancoCodigo + ", versão " + versao + ", ocorrência : " + ocorrencia);
    }
    
    private static Map<Integer, String> mapaSantanderCnab240Versao040() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(2, "Entrada confirmada");
        mapa.put(3, "Entrada Rejeitada");
        mapa.put(4, "Transferência de Carteira/Entrada");
        mapa.put(5, "Transferência de Carteira/Baixa");
        mapa.put(6, "Liquidação");
        mapa.put(9, "Baixa");
        mapa.put(11, "Títulos em Carteira (em ser)");
        mapa.put(12, "Confirmação Recebimento Instrução de Abatimento");
        mapa.put(13, "Confirmação Recebimento Instrução de Cancelamento Abatimento");
        mapa.put(14, "Confirmação Recebimento Instrução Alteração de Vencimento");
        mapa.put(15, "Franco de Pagamento");
        mapa.put(17, "Liquidação Após Baixa ou Liquidação Título Não Registrado");
        mapa.put(19, "Confirmação Recebimento Instrução de Protesto");
        mapa.put(20, "Confirmação Recebimento Instrução de Sustação/Cancelamento de Protesto");
        mapa.put(23, "Remessa a Cartório (Aponte em Cartório)");
        mapa.put(24, "Retirada de Cartório e Manutenção em Carteira");
        mapa.put(25, "Protestado e Baixado (Baixa por ter sido Protestado)");
        mapa.put(26, "Instrução Rejeitada");
        mapa.put(27, "Confirmação do Pedido de Alteração de Outros Dados");
        mapa.put(28, "Débito de Tarifas/Custas");
        mapa.put(29, "Ocorrências do Sacado");
        mapa.put(30, "Alteração de Dados Rejeitada");
        mapa.put(44, "Título pago com cheque devolvido");
        mapa.put(50, "Título pago com cheque pendente de compensação.");
        return mapa;
    }
    
    private static Map<Integer, String> mapaItauCnab240Versao040() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(2, "ENTRADA CONFIRMADA (COM POSSIBILIDADE DE MENSAGEM – NOTA 23 – TABELA 8)");
        mapa.put(3, "ENTRADA REJEITADA (NOTA 23 - TABELA 1)");
        mapa.put(4, "ALTERAÇÃO DE DADOS – NOVA ENTRADA OU ALTERAÇÃO/EXCLUSÃOADOS ACATADA");
        mapa.put(5, "ALTERAÇÃO DE DADOS – BAIXA");
        mapa.put(6, "LIQUIDAÇÃO NORMAL");
        mapa.put(8, "LIQUIDAÇÃO EM CARTÓRIO");
        mapa.put(9, "BAIXA SIMPLES");
        mapa.put(10, "BAIXA POR TER SIDO LIQUIDADO");
        mapa.put(11, "EM SER (SÓ NO RETORNO MENSAL)");
        mapa.put(12, "ABATIMENTO CONCEDIDO");
        mapa.put(13, "ABATIMENTO CANCELADO 14 VENCIMENTO ALTERADO");
        mapa.put(15, "BAIXAS REJEITADAS (NOTA 23 - TABELA 4)");
        mapa.put(16, "INSTRUÇÕES REJEITADAS (NOTA 23 – TABELA 3)");
        mapa.put(17, "ALTERAÇÃO/EXCLUSÃO DE DADOS REJEITADA (NOTA 23 - TABELA 2)");
        mapa.put(18, "COBRANÇA CONTRATUAL – INSTRUÇÕES/ALTERAÇÕES REJEITADAS/PENDENTES (NOTA 23 - TABELA 5)");
        mapa.put(19, "CONFIRMAÇÃO RECEBIMENTO DE INSTRUÇÃO DE PROTESTO 20 CONFIRMAÇÃO RECEBIMENTO DE INSTRUÇÃO DE SUSTAÇÃO DE PROTESTO /TARIFA");
        mapa.put(21, "CONFIRMAÇÃO RECEBIMENTO DE INSTRUÇÃO DE NÃO PROTESTAR");
        mapa.put(23, "PROTESTO ENVIADO A CARTÓRIO/TARIFA");
        mapa.put(24, "INSTRUÇÃO DE PROTESTO SUSTADA (NOTA 23 - TABELA 7)");
        mapa.put(25, "ALEGAÇÕES DO PAGADOR (NOTA 23 - TABELA 6)");
        mapa.put(26, "TARIFA DE AVISO DE COBRANÇA");
        mapa.put(27, "TARIFA DE EXTRATO POSIÇÃO (B40X)");
        mapa.put(28, "TARIFA DE RELAÇÃO DAS LIQUIDAÇÕES");
        mapa.put(29, "TARIFA DE MANUTENÇÃO DE TÍTULOS VENCIDOS");
        mapa.put(30, "DÉBITO MENSAL DE TARIFAS (PARA ENTRADAS E BAIXAS)");
        mapa.put(32, "BAIXA POR TER SIDO PROTESTADO");
        mapa.put(33, "CUSTAS DE PROTESTO");
        mapa.put(34, "CUSTAS DE SUSTAÇÃO");
        mapa.put(35, "CUSTAS DE CARTÓRIO DISTRIBUIDOR");
        mapa.put(36, "CUSTAS DE EDITAL");
        mapa.put(37, "TARIFA DE EMISSÃO DE BOLETO/TARIFA DE ENVIO DE DUPLICATA");
        mapa.put(38, "TARIFA DE INSTRUÇÃO");
        mapa.put(39, "TARIFA DE OCORRÊNCIAS");
        mapa.put(40, "TARIFA MENSAL DE EMISSÃO DE BOLETO/TARIFA MENSAL DE ENVIO DE DUPLICATA");
        mapa.put(41, "DÉBITO MENSAL DE TARIFAS – EXTRATO DE POSIÇÃO (B4EP/B4OX)");
        mapa.put(42, "DÉBITO MENSAL DE TARIFAS – OUTRAS INSTRUÇÕES");
        mapa.put(43, "DÉBITO MENSAL DE TARIFAS – MANUTENÇÃO DE TÍTULOS VENCIDOS");
        mapa.put(44, "DÉBITO MENSAL DE TARIFAS – OUTRAS OCORRÊNCIAS");
        mapa.put(45, "DÉBITO MENSAL DE TARIFAS – PROTESTO");
        mapa.put(46, "DÉBITO MENSAL DE TARIFAS – SUSTAÇÃO DE PROTESTO");
        mapa.put(47, "BAIXA COM TRANSFERÊNCIA PARA DESCONTO");
        mapa.put(48, "CUSTAS DE SUSTAÇÃO JUDICIAL");
        mapa.put(51, "TARIFA MENSAL REFERENTE A ENTRADAS BANCOS CORRESPONDENTES NA CARTEIRA");
        mapa.put(52, "TARIFA MENSAL BAIXAS NA CARTEIRA");
        mapa.put(53, "TARIFA MENSAL BAIXAS EM BANCOS CORRESPONDENTES NA CARTEIRA");
        mapa.put(54, "TARIFA MENSAL DE LIQUIDAÇÕES NA CARTEIRA");
        mapa.put(55, "TARIFA MENSAL DE LIQUIDAÇÕES EM BANCOS CORRESPONDENTES NA CARTEIRA");
        mapa.put(56, "CUSTAS DE IRREGULARIDADE");
        mapa.put(57, "INSTRUÇÃO CANCELADA (NOTA 23 – TABELA 8)");
        mapa.put(60, "ENTRADA REJEITADA CARNÊ (NOTA 20 – TABELA 1)");
        mapa.put(61, "TARIFA EMISSÃO AVISO DE MOVIMENTAÇÃO DE TÍTULOS (2154)");
        mapa.put(62, "DÉBITO MENSAL DE TARIFA – AVISO DE MOVIMENTAÇÃO DE TÍTULOS (2154)");
        mapa.put(63, "TÍTULO SUSTADO JUDICIALMENTE");
        mapa.put(74, "INSTRUÇÃO DE NEGATIVAÇÃO EXPRESSA REJEITADA (NOTA 25 – TABELA 3)");
        mapa.put(75, "CONFIRMA O RECEBIMENTO DE INSTRUÇÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA");
        mapa.put(77, "CONFIRMA O RECEBIMENTO DE INSTRUÇÃO DE EXCLUSÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA");
        mapa.put(78, "CONFIRMA O RECEBIMENTO DE INSTRUÇÃO DE CANCELAMENTO DA NEGATIVAÇÃO EXPRESSA");
        mapa.put(79, "NEGATIVAÇÃO EXPRESSA INFORMACIONAL (NOTA 25 – TABELA 12)");
        mapa.put(80, "CONFIRMAÇÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA – TARIFA");
        mapa.put(82, "CONFIRMAÇÃO O CANCELAMENTO DE NEGATIVAÇÃO EXPRESSA - TARIFA");
        mapa.put(83, "CONFIRMAÇÃO DA EXCLUSÃO/CANCELAMENTO DA NEGATIVAÇÃO EXPRESSA POR LIQUIDAÇÃO - TARIFA");
        mapa.put(85, "TARIFA POR BOLETO (ATÉ 03 ENVIOS) COBRANÇA ATIVA ELETRÔNICA");
        mapa.put(86, "TARIFA EMAIL COBRANÇA ATIVA ELETRÔNICA");
        mapa.put(87, "TARIFA SMS COBRANÇA ATIVA ELETRÔNICA");
        mapa.put(88, "TARIFA MENSAL POR BOLETO (ATÉ 03 ENVIOS) COBRANÇA ATIVA ELETRÔNICA");
        mapa.put(89, "TARIFA MENSAL EMAIL COBRANÇA ATIVA ELETRÔNICA");
        mapa.put(90, "TARIFA MENSAL SMS COBRANÇA ATIVA ELETRÔNICA");
        mapa.put(91, "TARIFA MENSAL DE EXCLUSÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA");
        mapa.put(92, "TARIFA MENSAL DE CANCELAMENTO DE NEGATIVAÇÃO EXPRESSA");
        mapa.put(93, "TARIFA MENSAL DE EXCLUSÃO/CANCELAMENTO DE NEGATIVAÇÃO EXPRESSA POR LIQUIDAÇÃO");
        mapa.put(94, "CONFIRMA RECEBIMENTO DE INSTRUÇÃO DE NÃO NEGATIVAR");
        return mapa;        
    }

}
