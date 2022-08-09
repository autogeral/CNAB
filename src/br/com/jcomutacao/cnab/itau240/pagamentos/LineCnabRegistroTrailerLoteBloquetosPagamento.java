package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   08.08.2022
 */
@Record
public class LineCnabRegistroTrailerLoteBloquetosPagamento extends LineModel {
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String brancos1;
    private String totalQtdRegistros;
    private String totalValorPgtos;
    private String zeros;
    private String brancos2;
    private String ocorrencias;
    
   /*
        REGISTRO TRAILER DE LOTE
    P/LIQUIDAÇÃO DE TÍTULOS (BLOQUETOS) EM COBRANÇA NO ITAÚ E EM OUTROS BANCOS
    */
    
    @Field(offset = 1, length = 3)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Field(offset = 4, length = 4)
    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    @Field(offset = 8, length = 1)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Field(offset = 9, length = 9)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

    @Field(offset = 18, length = 6)
    public String getTotalQtdRegistros() {
        return totalQtdRegistros;
    }

    public void setTotalQtdRegistros(String totalQtdRegistros) {
        this.totalQtdRegistros = totalQtdRegistros;
    }

    @Field(offset = 24, length = 18)
    public String getTotalValorPgtos() {
        return totalValorPgtos;
    }

    public void setTotalValorPgtos(String totalValorPgtos) {
        this.totalValorPgtos = totalValorPgtos;
    }

    @Field(offset = 42, length = 18)
    public String getZeros() {
        return zeros;
    }

    public void setZeros(String zeros) {
        this.zeros = zeros;
    }

    @Field(offset = 60, length = 171)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

    @Field(offset = 231, length = 10)
    public String getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroTrailerLoteBloquetoPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", brancos1=" + brancos1 + ", totalQtdRegistros=" + totalQtdRegistros + ", totalValorPgtos=" + totalValorPgtos + ", zeros=" + zeros + ", brancos2=" + brancos2 + ", ocorrencias=" + ocorrencias + '}';
    }
}
