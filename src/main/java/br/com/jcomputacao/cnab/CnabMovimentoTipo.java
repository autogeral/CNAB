
package br.com.jcomputacao.cnab;

/**
 * 26/01/2013 13:39:18
 * @author Murilo
 */
public enum CnabMovimentoTipo {

    /**
     * @see br.com.jcomputacao.cnab.CnabMovimentoTipo
     * G060
     * '0' = Indica INCLUSAO
     * '3' = Indica ESTORNO (somente para retorno)
     * '5' = Indica ALTERACAO
     * '9' = Indica EXCLUSAO
     */    
    INCLUSAO(0), ESTORNO(3), ALTERACAO(5), EXCLUSAO(9);
    
    private int codigo;
    
    private CnabMovimentoTipo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public static CnabMovimentoTipo getPorCodigo(int codigo) {
        CnabMovimentoTipo t = null;
        switch(codigo) {
            case 0 : t = INCLUSAO; break;
            case 3 : t = ESTORNO; break;
            case 5 : t = ALTERACAO; break;
            case 9 : t = EXCLUSAO; break;
        }
        return t;
    }
    
}
