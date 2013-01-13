package br.com.jcomputacao.cnab.t240.v060.pagamentos;

/**
 * 16/12/2012 17:09:11
 * @author Murilo
 */
public enum PagamentoCodigoHistorico {

    CREDITO_DE_DIVIDENDOS(13), 
    LIQUIDO_DE_VENCIMENTO(21),
    PAGAMENTO_DE_SINISTRO_SEGURADO(91),
    PGTO_DESPESAS_VIAJANTE_EM_TRANSITO(109),
    PGTO_REPRES_VENDEDORES_AUTORIZADOS(137),
    PAGAMENTO_DE_BENEFICIOS_INSS(149),
    PAGAMENTO_A_FORNECEDORES(183),
    DEVOLUCAO_DE_LANÇAMENTO(187),
    PGTO_CREDENCIADO_DE_EMPRESA_CONVENIADA(295),
    TRANSFERENCIA_MESMA_TITULARIDADE(2060),
    PAGAMENTO_DE_PENSÃO_ALIMENTICIA(367),
    RESGATE_PREVIDENCIA(491),
    PAGAMENTO_BENEFICIO_PREVIDENCIA(493),
    ESTORNO_CONTRIBUIÇÃO_PREVIDENCIA(495),
    TRANSFERENCIA_DE_SALDO(1070),
    CREDITOS_DIVERSOS(2214),
    RECEBIMENTO_VIA_PGTO_FORNECEDORES(8051),
    PAGAMENTO_DIVERSOS_FORNECEDOR(2039),
    BOLSA_AUXILIO(2644);
    
    private long codigo;

    private PagamentoCodigoHistorico(int codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }
}
