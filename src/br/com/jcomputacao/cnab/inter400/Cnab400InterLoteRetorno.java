package br.com.jcomputacao.cnab.inter400;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author larissa.camargo
 *    04.08.21
 */
public class Cnab400InterLoteRetorno {

   //LineCnabRegistroHeaderRetorno
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
    
    // LineCnabRetornoRegistroTipo1
    private List<Cnab400InterTipo1Retorno> tipo1Retorno = new ArrayList<Cnab400InterTipo1Retorno>();
     
   //LineCnabRetornoRegistroTrailer
   private String codigoRegistroTrailer;
   private String codigoRetornoTrailer;
   private String tipoRegisro;
   private String codigoBancoTrailer;
   private String brancoTrailer;
   private String qtdRegistros1;
   private String brancoTrailer2;
   private String qtdRegistros2;
   private String valorRegistros1;
   private String brancoTrailer3;
   private String qtdRegistros3;
   private String brancoTrailer4;
   private String qtdRegistros4;
   private String valorRegistros2;
   private String brancoTrailer5;
   private String sequencialRegistroTrailer;
    
    //LineCnabRegistroHeaderRetorno   
    public String getCodigoRegistroHeaderRetorno() {
        return codigoRegistroHeader;
    }
    public void setCodigoRegistroHeaderRetorno(String codigoRegistro) {
        this.codigoRegistroHeader = codigoRegistro;
    }
    
    public String getCodigoRetorno() {
        return codigoRetorno;
    }
    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }
    
    public String getLiteralRetorno() {
        return literalRetorno;
    }
    public void setLiteralRetorno(String literalRetorno) {
        this.literalRetorno = literalRetorno;
    }

    public String getCodigoServicoRetorno() {
        return codigoServico;
    }
    public void setCodigoServicoRetorno(String codigoServico) {
        this.codigoServico = codigoServico;
    }
    
    public String getLiteralServicoRetorno() {
        return literalServico;
    }
    public void setLiteralServicoRetorno(String literalServico) {
        this.literalServico = literalServico;
    }
    
    public String getBranco1Retorno() {
        return branco1;
    }
    public void setBranco1Retorno(String branco1) {
        this.branco1 = branco1;
    }
    
    public String getNomeEmpresaRetorno() {
        return nomeEmpresa;
    }
    public void setNomeEmpresaRetorno(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public String getCodigoBancoRetorno() {
        return codigoBanco;
    }
    public void setCodigoBancoRetorno(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
    
    public String getNomeBancoRetorno() {
        return nomeBanco;
    }
    public void setNomeBancoRetorno(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getDataGravacaoRetorno() {
        return dataGravacao;
    }
    public void setDataGravacaoRetorno(Integer dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    public String getBranco2Retorno() {
        return branco2;
    }
    public void setBranco2Retorno(String branco2) {
        this.branco2 = branco2;
    }
    
    public String getSequencialRegistroRetorno() {
        return sequencialRegistro;
    }
    public void setSequencialRegistroRetorno(String sequencialRegistro) {
        this.sequencialRegistro = sequencialRegistro;
    }   

    public List<Cnab400InterTipo1Retorno> getTipo1Retorno() {
        return tipo1Retorno;
    }

    public void setTipo1Retorno(List<Cnab400InterTipo1Retorno> tipo1Retorno) {
        this.tipo1Retorno = tipo1Retorno;
    }
    
    //LineCnabRetornoRegistroTrailer
    public String getCodigoRegistroTrailer() {
        return codigoRegistroTrailer;
    }
    public void setCodigoRegistroTrailer(String codigoRegistroTrailer) {
        this.codigoRegistroTrailer = codigoRegistroTrailer;
    }

    public String getCodigoRetornoTrailer() {
        return codigoRetornoTrailer;
    }
    public void setCodigoRetornoTrailer(String codigoRetornoTrailer) {
        this.codigoRetornoTrailer = codigoRetornoTrailer;
    }

    public String getTipoRegisroTrailer() {
        return tipoRegisro;
    }
    public void setTipoRegistroTrailer(String tipoRegisro) {
        this.tipoRegisro = tipoRegisro;
    }

    public String getCodigoBancoTrailer() {
        return codigoBancoTrailer;
    }
    public void setCodigoBancoTrailer(String codigoBancoTrailer) {
        this.codigoBancoTrailer = codigoBancoTrailer;
    }
    
    public String getBrancoTrailer() {
        return brancoTrailer;
    }
    public void setBrancoTrailer(String brancoTrailer) {
        this.brancoTrailer = brancoTrailer;
    }
    
    public String getQtdRegistros1Trailer() {
        return qtdRegistros1;
    }
    public void setQtdRegistros1Trailer(String qtdRegistros1) {
        this.qtdRegistros1 = qtdRegistros1;
    }
    
    public String getBrancoTrailer2() {
        return brancoTrailer2;
    }
    public void setBrancoTrailer2(String brancoTrailer2) {
        this.brancoTrailer2 = brancoTrailer2;
    }
    
    public String getQtdRegistros2Trailer() {
        return qtdRegistros2;
    }
    public void setQtdRegistros2Trailer(String qtdRegistros2) {
        this.qtdRegistros2 = qtdRegistros2;
    }
    
    public String getValorRegistros1Trailer() {
        return valorRegistros1;
    }
    public void setValorRegistros1Trailer(String valorRegistros1) {
        this.valorRegistros1 = valorRegistros1;
    }

    public String getBrancoTrailer3() {
        return brancoTrailer3;
    }
    public void setBrancoTrailer3(String brancoTrailer3) {
        this.brancoTrailer3 = brancoTrailer3;
    }

    public String getQtdRegistros3Trailer() {
        return qtdRegistros3;
    }
    public void setQtdRegistros3Trailer(String qtdRegistros3) {
        this.qtdRegistros3 = qtdRegistros3;
    }
    
    public String getBrancoTrailer4() {
        return brancoTrailer4;
    }
    public void setBrancoTrailer4(String brancoTrailer4) {
        this.brancoTrailer4 = brancoTrailer4;
    }
    
    public String getQtdRegistros4Trailer() {
        return qtdRegistros4;
    }
    public void setQtdRegistros4Trailer(String qtdRegistros4) {
        this.qtdRegistros4 = qtdRegistros4;
    }
    
    public String getValorRegistros2Trailer() {
        return valorRegistros2;
    }
    public void setValorRegistros2Trailer(String valorRegistros2) {
        this.valorRegistros2 = valorRegistros2;
    }  
    
    public String getBrancoTrailer5() {
        return brancoTrailer5;
    }
    public void setBrancoTrailer5(String brancoTrailer5) {
        this.brancoTrailer5 = brancoTrailer5;
    }
    
    public String getSequencialRegistroTrailer() {
        return sequencialRegistroTrailer;
    }
    public void setSequencialRegistroTrailer(String sequencialRegistroTrailer) {
        this.sequencialRegistroTrailer = sequencialRegistroTrailer;
    }    
}
