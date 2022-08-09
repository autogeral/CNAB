package br.com.jcomutacao.cnab.itau240.pagamentos;

import br.com.jcomputacao.cnab.itau240.LineModel;
import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *  05.08.2022
 */
@Record
public class LineCnabRegistroSegmentoDPagamento extends LineModel{
    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String codigoSegmento;
    private String brancos1;
    private String periodoCompetencia;
    private String centroCusto;
    private String codigoFuncionario;
    private String cargo;
    private String periodoFeriasDe;
    private String periodoFeriasAte;
    private String dependenteIR;
    private String dependenteSF;
    private String horasSemanais;
    private String salarioContribuicao;
    private String fgts;
    private String valorCreditos;
    private String valorDebito;
    private String valorLiquido;
    private String valorFixoBase;
    private String baseCalculoIRRF;
    private String baseCalculoFGTS;
    private String disponibilizacaoHolerite;
    private String brancos2;
    private String ocorrencias;
    
    /*
        REGISTRO DETALHE SEGMENTO - D (OPCIONAL)
    P/PAGAMENTOS DE SALÁRIOS ATRAVÉS DE CRÉDITO EM CONTA CORRENTE(HOLERITE)
    
    Este segmento só é obrigatório quando for contratado junto ao Banco o serviço “Holerite - Demonstrativo de
    Pagamento de Salários
    */
    
    @Field(offset = 1, length = 3)
    public String getCodigoBanco(){
        return codigoBanco;
    }
    
    public void setCodigoBanco(String codigoBanco){
        this.codigoBanco = codigoBanco;
    }
    
    @Field(offset = 4, length = 4)
    public String getCodigoLote(){
        return codigoLote;
    }
    
    public void setCodigoLote(String codigoLote){
        this.codigoLote = codigoLote;
    }
    
    @Field(offset = 8, length = 1)
    public String getTipoRegistro(){
        return tipoRegistro;
    }
    
    public void setTipoRegistro(String tipoRegistro){
        this.tipoRegistro = tipoRegistro;
    }
    
    @Field(offset = 9, length = 5)
    public String getNumRegistro(){
        return numRegistro;
    }
    
    public void setNumRegistro(String numRegistro){
        this.numRegistro = numRegistro;
    }
    
    @Field(offset = 14, length = 1)
    public String getCodigoSegmento(){
        return codigoSegmento;
    }
    
    public void setCodigoSegmento(String codigoSegmento){
        this.codigoSegmento = codigoSegmento;
    }
    
    @Field(offset = 15, length = 3)
    public String getBrancos1(){
        return brancos1;
    }
    
    public void setBrancos1(String brancos1){
        this.brancos1 = brancos1;
    }
    
    @Field(offset = 18, length = 6)
    public String getPeriodoCompetencia(){
        return periodoCompetencia;
    }
    
    public void setPeriodoCompetencia(String periodoCompetencia){
        this.periodoCompetencia = periodoCompetencia;
    }
    
    @Field(offset = 24, length = 15)
    public String getCentroCusto(){
        return centroCusto;
    }
    
    public void setCentroCusto(String centroCusto){
        this.centroCusto = centroCusto;
    }
    
    @Field(offset = 39, length = 15)
    public String getCodigoFuncionario(){
        return codigoFuncionario;
    }
    
    public void setCodigoFuncionario(String codigoFuncionario){
        this.codigoFuncionario = codigoFuncionario;
    }
    
    @Field(offset = 54, length = 30)
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(){
        this.cargo = cargo;
    }
    
    @Field(offset = 84, length = 8)
    public String getPeriodoFeriasDe(){
        return periodoFeriasDe;
    }
    
    public void setPeriodoFeriasDe(String periodoFeriasDe){
        this.periodoFeriasDe = periodoFeriasDe;
    }
    
    @Field(offset = 92, length = 8)
    public String getPeriodosFeriasAte(){
        return periodoFeriasAte;
    }
    
    public void setPeriodoFeriaAte(String periodoFeriasAte){
        this.periodoFeriasAte = periodoFeriasAte;
    }
    
    @Field(offset = 100, length = 2)
    public String getDependenteIR(){
        return dependenteIR;
    }
    
    public void setDependenteIR(String dependenteIR){
        this.dependenteIR = dependenteIR;
    }
    
    @Field(offset = 102, length = 2)
    public String getDependenteSF(){
        return dependenteSF;
    }
    
    public void setDependentesSF(String dependentesSF){
        this.dependenteSF = dependentesSF;
    }
    
    @Field(offset = 104, length = 2)
    public String getHorasSemanais(){
        return horasSemanais;
    }
    
    public void setHorasSemanais(String horasSemanais){
        this.horasSemanais = horasSemanais;
    }
    
    @Field(offset = 106, length = 15)
    public String getSalarioContribuicao(){
        return salarioContribuicao;
    }
    
    public void setSalarioContribuicao(String salarioContribuicao){
        this.salarioContribuicao = salarioContribuicao;
    }
    
    @Field(offset = 121, length = 15)
    public String getFgts(){
        return fgts;
    }
    
    public void setFgts(String fgts){
        this.fgts = fgts;
    }
    
    @Field(offset = 136, length = 15)
    public String getValorCreditos(){
        return valorCreditos;
    }
    
    public void setValorCreditos(String valorCreditos){
        this.valorCreditos = valorCreditos;
    }
    
    @Field(offset = 151, length = 15)
    public String getValorDebito(){
        return valorDebito;
    }
    
    public void setValorDebito(String valorDebito){
        this.valorDebito = valorDebito;
    }
    
    @Field(offset = 166, length = 15)
    public String getValorLiquido(){
        return valorLiquido;
    }
    
    public void setValorLiquido(String valorLiquido){
        this.valorLiquido = valorLiquido;
    }
    
    @Field(offset = 181, length = 15)
    public String getValorFixoBase(){
        return valorFixoBase;
    }
    
    public void setValorFixoBase(String valorFixoBase){
        this.valorFixoBase = valorFixoBase;
    }
    
    @Field(offset = 196, length = 15)
    public String getBaseCalculoIRRF(){
        return baseCalculoIRRF;
    }
    
    public void setBaseCalculoIRRF(String baseCalculoIRRF){
        this.baseCalculoIRRF = baseCalculoIRRF;
    }
    
    @Field(offset = 211, length = 15)
    public String getBaseCalculoFGTS(){
        return baseCalculoFGTS;
    }
    
    public void setBaseCalculoFGTS(String baseCalculoFGTS){
        this.baseCalculoFGTS = baseCalculoFGTS;
    }
    
    @Field(offset = 226, length = 2)
    public String getDisponibilizacaoHolerite(){
        return disponibilizacaoHolerite;
    }
    
    public void setDisponibilizacaoHolerite(String disponibilizacaoHolerite){
        this.disponibilizacaoHolerite = disponibilizacaoHolerite;
    }
    
    @Field(offset = 228, length = 3)
    public String getBrancos2(){
        return brancos2;
    }
    
    public void setBrancos2(String brancos2){
        this.brancos2 = brancos2;
    }
    
    @Field(offset = 231, length = 10)
    public String getOcorrencias(){
        return ocorrencias;
    }
    
    public void setOcorrencias(String ocorrencias){
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoDPagamento{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", codigoSegmento=" + codigoSegmento + ", brancos1=" + brancos1 + ", periodoCompetencia=" + periodoCompetencia + ", centroCusto=" + centroCusto + ", codigoFuncionario=" + codigoFuncionario + ", cargo=" + cargo + ", periodoFeriasDe=" + periodoFeriasDe + ", periodoFeriasAte=" + periodoFeriasAte + ", dependenteIR=" + dependenteIR + ", dependenteSF=" + dependenteSF + ", horasSemanais=" + horasSemanais + ", salarioContribuicao=" + salarioContribuicao + ", fgts=" + fgts + ", valorCreditos=" + valorCreditos + ", valorDebito=" + valorDebito + ", valorLiquido=" + valorLiquido + ", valorFixoBase=" + valorFixoBase + ", baseCalculoIRRF=" + baseCalculoIRRF + ", baseCalculoFGTS=" + baseCalculoFGTS + ", disponibilizacaoHolerite=" + disponibilizacaoHolerite + ", brancos2=" + brancos2 + ", ocorrencias=" + ocorrencias + '}';
    }
}
