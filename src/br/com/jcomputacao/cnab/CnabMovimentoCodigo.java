
package br.com.jcomputacao.cnab;

/**
 * 26/01/2013 13:39:29
 * @author Murilo
 */
public enum CnabMovimentoCodigo {
    /**
     * @see br.com.jcomputacao.cnab.CnabMovimentoCodigo
     * G061
     * '00' = Inclusao de Registro Detalhe Liberado
     * '09' = Inclusao do Registro Detalhe Bloqueado
     * '10' = Alteracao do Pagamento Liberado para Bloqueado (Bloqueio)
     * '11' = Alteracao do Pagamento Bloqueado para Liberado (Liberacao)
     * '19' = Alteracao da Data de Pagamento
     * '33' = Estorno por Devolucao da Câmara Centralizadora (somente para Tipo de Movimento = '3')
     * '99' = Exclusao do Registro Detalhe Incluido Anteriormente
     */
    INCLUSAO_LIBERADA(0), 
    INCLUSAO_BLOQUEADA(9),
    ALTERACAO_PAGAMENTO_LIBERADO_PARA_BLOQUEIO(10),
    ALTERACAO_PAGAMENTO_BLOQUEADO_PARA_LIBERADO(11), 
    ALTERACAO_DATA_PAGAMENTO(19),
    ESTORNO_DEVOLUCAO_CAMARA_CENTRALIZADORA(33),
    EXCLUSAO(99);
    
    
    private int codigo;
    
    private CnabMovimentoCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public static CnabMovimentoCodigo getPorCodigo(int codigo) {
        CnabMovimentoCodigo c = null;
        switch (codigo) {
            case 0:
                c = INCLUSAO_LIBERADA;
                break;
            case 9:
                c = INCLUSAO_BLOQUEADA;
                break;
            case 10:
                c = ALTERACAO_PAGAMENTO_LIBERADO_PARA_BLOQUEIO;
                break;
            case 11:
                c = ALTERACAO_PAGAMENTO_BLOQUEADO_PARA_LIBERADO;
                break;
            case 19:
                c = ALTERACAO_DATA_PAGAMENTO;
                break;
            case 33:
                c = ESTORNO_DEVOLUCAO_CAMARA_CENTRALIZADORA;
                break;
            case 99:
                c = EXCLUSAO;
                break;

        }
        return c;
    }

}
