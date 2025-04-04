package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *   30.07.21
 */
@Record
public class LineCnabRegistroHeaderRetorno {
    private String codigoRegistroHeader;
    private String codigoRetorno;
    private String literalRetorno;
    private String codigoServico;
    private String literalServico;
    private String branco1;
    private String nomeEmpresa;
    private String codigoBanco;
    private String nomeBanco;
    private Integer dataGravacao;
    private String branco2;
    private String sequencialRegistro;

    @Field(offset = 1, length = 1)
    public String getCodigoRegistroHeaderRetorno() {
        return codigoRegistroHeader;
    }
    public void setCodigoRegistroHeaderRetorno(String codigoRegistro) {
        this.codigoRegistroHeader = codigoRegistro;
    }

    @Field(offset = 2, length = 1)
    public String getCodigoRetorno() {
        return codigoRetorno;
    }
    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    @Field(offset = 3, length = 7)
    public String getLiteralRetorno() {
        return literalRetorno;
    }
    public void setLiteralRetorno(String literalRetorno) {
        this.literalRetorno = literalRetorno;
    }

    @Field(offset = 10, length = 2)
    public String getCodigoServicoRetorno() {
        return codigoServico;
    }
    public void setCodigoServicoRetorno(String codigoServico) {
        this.codigoServico = codigoServico;
    }
    
    @Field(offset = 12, length = 15)
    public String getLiteralServicoRetorno() {
        return literalServico;
    }
    public void setLiteralServicoRetorno(String literalServico) {
        this.literalServico = literalServico;
    }
    
    @Field(offset = 27, length = 20)
    public String getBranco1Retorno() {
        return branco1;
    }
    public void setBranco1Retorno(String branco1) {
        this.branco1 = branco1;
    }
    
    @Field(offset = 47, length = 30)
    public String getNomeEmpresaRetorno() {
        return nomeEmpresa;
    }
    public void setNomeEmpresaRetorno(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    @Field(offset = 77, length = 3)
    public String getCodigoBancoRetorno() {
        return codigoBanco;
    }
    public void setCodigoBancoRetorno(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
    
    @Field(offset = 80, length = 15)
    public String getNomeBancoRetorno() {
        return nomeBanco;
    }
    public void setNomeBancoRetorno(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    @Field(offset = 95, length = 6)
    public Integer getDataGravacaoRetorno() {
        return dataGravacao;
    }
    public void setDataGravacaoRetorno(Integer dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    @Field(offset = 101, length = 294)
    public String getBranco2Retorno() {
        return branco2;
    }
    public void setBranco2Retorno(String branco2) {
        this.branco2 = branco2;
    }
    @Field(offset =395 , length = 6)
    public String getSequencialRegistroRetorno() {
        return sequencialRegistro;
    }
    public void setSequencialRegistroRetorno(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }
    @Override
    public String toString() {
        return "Registro0002HeaderArquivo{" + "codigoRegistroHeader=" + codigoRegistroHeader + ", codigoRetorno=" + codigoRetorno + ", literalRetorno=" + literalRetorno + ", codigoServico=" + codigoServico + ", literalServico=" + literalServico + ", branco1=" + branco1 + ", nomeEmpresa=" + nomeEmpresa + ", codigoBanco=" + codigoBanco + ", nomeBanco=" + nomeBanco + ", dataGravacao=" + dataGravacao + ", branco2=" + branco2 + ",sequencialRegistro= " + sequencialRegistro + "}";
    }
}
