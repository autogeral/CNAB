package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;

/**
 *
 * @author larissa.camargo
 *    27.08.2021
 * 
 */
@Record
public class LineCnabRegistroSegmentoTRetorno extends LineModel {

    private String codigoBanco;
    private String codigoLote;
    private String tipoRegistro;
    private String numRegistro;
    private String segmento;
    private String boletoDda;
    private String codOcorrencia;
    private String zeros1;
    private String agencia;
    private String zeros2;
    private String conta;
    private String zeros3;
    private String dac1;
    private String numCarteira;
    private String nossoNumero;
    private String dac2;
    private String brancos1;
    private String zeros4;
    private String seuNumero;
    private String brancos2;
    private String vencimento;
    private String valorTitulo;
    private String zeros5;
    private String agCobradora;
    private String dac3;
    private String usoEmpresa;
    private String zeros6;
    private String codigoInscricao;
    private String inscricaoNumero;
    private String nome;
    private String brancos3;
    private String zeros7;
    private String tarifaCustas;
    private String erros;
    private String codLiquidacao;
    private String brancos4;
    

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

     @Field(offset = 9, length = 5)
    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

     @Field(offset = 14, length = 1)
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

     @Field(offset = 15, length = 1)
    public String getBoletoDda() {
        return boletoDda;
    }

    public void setBoletoDda(String boletoDda) {
        this.boletoDda = boletoDda;
    }

    /**
     * 02 - ENTRADA CONFIRMADA (COM POSSIBILIDADE DE MENSAGEM – NOTA 23 – TABELA 8)</br>
     * 03 ENTRADA REJEITADA (NOTA 23 - TABELA 1)</br>
     * 04 ALTERAÇÃO DE DADOS – NOVA ENTRADA OU ALTERAÇÃO/EXCLUSÃOADOS ACATADA</br>
     * 05 ALTERAÇÃO DE DADOS – BAIXA</br>
     * 06 LIQUIDAÇÃO NORMAL</br>
     * 08 LIQUIDAÇÃO EM CARTÓRIO</br>
     * 09 BAIXA SIMPLES</br>
     * 10 BAIXA POR TER SIDO LIQUIDADO</br>
     * 11 EM SER (SÓ NO RETORNO MENSAL)</br>
     * 12 ABATIMENTO CONCEDIDO</br>
     * 13 ABATIMENTO CANCELADO 14 VENCIMENTO ALTERADO</br>
     * 15 BAIXAS REJEITADAS (NOTA 23 - TABELA 4)</br>
     * 16 INSTRUÇÕES REJEITADAS (NOTA 23 – TABELA 3)</br>
     * 17 ALTERAÇÃO/EXCLUSÃO DE DADOS REJEITADA (NOTA 23 - TABELA 2)</br>
     * 18 COBRANÇA CONTRATUAL – INSTRUÇÕES/ALTERAÇÕES REJEITADAS/PENDENTES (NOTA 23 - TABELA 5)</br>
     * 19 CONFIRMAÇÃO RECEBIMENTO DE INSTRUÇÃO DE PROTESTO 20 CONFIRMAÇÃO RECEBIMENTO DE INSTRUÇÃO DE SUSTAÇÃO DE PROTESTO /TARIFA</br>
     * 21 CONFIRMAÇÃO RECEBIMENTO DE INSTRUÇÃO DE NÃO PROTESTAR 23 PROTESTO ENVIADO A CARTÓRIO/TARIFA</br>
     * 24 INSTRUÇÃO DE PROTESTO SUSTADA (NOTA 23 - TABELA 7)</br>
     * 25 ALEGAÇÕES DO PAGADOR (NOTA 23 - TABELA 6)</br>
     * 26 TARIFA DE AVISO DE COBRANÇA</br>
     * 27 TARIFA DE EXTRATO POSIÇÃO (B40X)</br>
     * 28 TARIFA DE RELAÇÃO DAS LIQUIDAÇÕES A 29 TARIFA DE MANUTENÇÃO DE TÍTULOS VENCIDOS</br>
     * 30 DÉBITO MENSAL DE TARIFAS (PARA ENTRADAS E BAIXAS) 32 BAIXA POR TER SIDO PROTESTADO</br>
     * 33 CUSTAS DE PROTESTO</br>
     * 34 CUSTAS DE SUSTAÇÃO</br>
     * 35 CUSTAS DE CARTÓRIO DISTRIBUIDOR</br>
     * 36 CUSTAS DE EDITAL</br>
     * 37 TARIFA DE EMISSÃO DE BOLETO/TARIFA DE ENVIO DE DUPLICATA</br>
     * 38 TARIFA DE INSTRUÇÃO</br>
     * 39 TARIFA DE OCORRÊNCIAS</br>
     * 40 TARIFA MENSAL DE EMISSÃO DE BOLETO/TARIFA MENSAL DE ENVIO DE DUPLICATA</br>
     * 41 DÉBITO MENSAL DE TARIFAS – EXTRATO DE POSIÇÃO (B4EP/B4OX)</br>
     * 42 DÉBITO MENSAL DE TARIFAS – OUTRAS INSTRUÇÕES</br>
     * 43 DÉBITO MENSAL DE TARIFAS – MANUTENÇÃO DE TÍTULOS VENCIDOS</br>
     * 44 DÉBITO MENSAL DE TARIFAS – OUTRAS OCORRÊNCIAS</br>
     * 45 DÉBITO MENSAL DE TARIFAS – PROTESTO</br>
     * 46 DÉBITO MENSAL DE TARIFAS – SUSTAÇÃO DE PROTESTO</br>
     * 47 BAIXA COM TRANSFERÊNCIA PARA DESCONTO</br>
     * 48 CUSTAS DE SUSTAÇÃO JUDICIAL</br>
     * 51 TARIFA MENSAL REFERENTE A ENTRADAS BANCOS CORRESPONDENTES NA CARTEIRA</br>
     * 52 TARIFA MENSAL BAIXAS NA CARTEIRA</br>
     * 53 TARIFA MENSAL BAIXAS EM BANCOS CORRESPONDENTES NA CARTEIRA</br>
     * 54 TARIFA MENSAL DE LIQUIDAÇÕES NA CARTEIRA</br>
     * 55 TARIFA MENSAL DE LIQUIDAÇÕES EM BANCOS CORRESPONDENTES NA CARTEIRA</br>
     * 56 CUSTAS DE IRREGULARIDADE</br>
     * 57 INSTRUÇÃO CANCELADA (NOTA 23 – TABELA 8)</br>
     * 60 ENTRADA REJEITADA CARNÊ (NOTA 20 – TABELA 1)</br>
     * 61 TARIFA EMISSÃO AVISO DE MOVIMENTAÇÃO DE TÍTULOS (2154)</br>
     * 62 DÉBITO MENSAL DE TARIFA – AVISO DE MOVIMENTAÇÃO DE TÍTULOS (2154)</br>
     * 63 TÍTULO SUSTADO JUDICIALMENTE</br>
     * 74 INSTRUÇÃO DE NEGATIVAÇÃO EXPRESSA REJEITADA (NOTA 25 – TABELA 3)</br>
     * 75 CONFIRMA O RECEBIMENTO DE INSTRUÇÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA</br>
     * 77 CONFIRMA O RECEBIMENTO DE INSTRUÇÃO DE EXCLUSÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA</br>
     * 78 CONFIRMA O RECEBIMENTO DE INSTRUÇÃO DE CANCELAMENTO DA NEGATIVAÇÃO EXPRESSA</br>
     * 79 NEGATIVAÇÃO EXPRESSA INFORMACIONAL (NOTA 25 – TABELA 12)</br>
     * 80 CONFIRMAÇÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA – TARIFA</br>
     * 82 CONFIRMAÇÃO O CANCELAMENTO DE NEGATIVAÇÃO EXPRESSA - TARIFA</br>
     * 83 CONFIRMAÇÃO DA EXCLUSÃO/CANCELAMENTO DA NEGATIVAÇÃO EXPRESSA POR LIQUIDAÇÃO - TARIFA</br>
     * 85 TARIFA POR BOLETO (ATÉ 03 ENVIOS) COBRANÇA ATIVA ELETRÔNICA</br>
     * 86 TARIFA EMAIL COBRANÇA ATIVA ELETRÔNICA</br>
     * 87 TARIFA SMS COBRANÇA ATIVA ELETRÔNICA</br>
     * 88 TARIFA MENSAL POR BOLETO (ATÉ 03 ENVIOS) COBRANÇA ATIVA ELETRÔNICA</br>
     * 89 TARIFA MENSAL EMAIL COBRANÇA ATIVA ELETRÔNICA</br>
     * 90 TARIFA MENSAL SMS COBRANÇA ATIVA ELETRÔNICA</br>
     * 91 TARIFA MENSAL DE EXCLUSÃO DE ENTRADA EM NEGATIVAÇÃO EXPRESSA</br>
     * 92 TARIFA MENSAL DE CANCELAMENTO DE NEGATIVAÇÃO EXPRESSA</br>
     * 93 TARIFA MENSAL DE EXCLUSÃO/CANCELAMENTO DE NEGATIVAÇÃO EXPRESSA POR LIQUIDAÇÃO</br>
     * 94 CONFIRMA RECEBIMENTO DE INSTRUÇÃO DE NÃO NEGATIVAR</br>
     * @return 
     */
    @Field(offset = 16, length = 2)
    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

     @Field(offset = 18, length = 1)
    public String getZeros1() {
        return zeros1;
    }

    public void setZeros1(String zeros1) {
        this.zeros1 = zeros1;
    }

     @Field(offset = 19, length = 4)
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

     @Field(offset = 23, length = 8)
    public String getZeros2() {
        return zeros2;
    }

    public void setZeros2(String zeros2) {
        this.zeros2 = zeros2;
    }

     @Field(offset = 31, length = 5)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

     @Field(offset = 36, length = 1)
    public String getZeros3() {
        return zeros3;
    }

    public void setZeros3(String zeros3) {
        this.zeros3 = zeros3;
    }

     @Field(offset = 37, length = 1)
    public String getDac1() {
        return dac1;
    }

    public void setDac1(String dac1) {
        this.dac1 = dac1;
    }

     @Field(offset = 38, length = 3)
    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

     @Field(offset = 41, length = 8)
    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

     @Field(offset = 49, length = 1)
    public String getDac2() {
        return dac2;
    }

    public void setDac2(String dac2) {
        this.dac2 = dac2;
    }

     @Field(offset = 50, length = 8)
    public String getBrancos1() {
        return brancos1;
    }

    public void setBrancos1(String brancos1) {
        this.brancos1 = brancos1;
    }

     @Field(offset = 58, length = 1)
    public String getZeros4() {
        return zeros4;
    }

    public void setZeros4(String zeros4) {
        this.zeros4 = zeros4;
    }

     @Field(offset = 59, length = 10)
    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

     @Field(offset = 69, length = 5)
    public String getBrancos2() {
        return brancos2;
    }

    public void setBrancos2(String brancos2) {
        this.brancos2 = brancos2;
    }

     @Field(offset = 74, length = 8)
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

     @Field(offset = 82, length = 15)
    public String getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(String valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

     @Field(offset = 97, length = 3)
    public String getZeros5() {
        return zeros5;
    }

    public void setZeros5(String zeros5) {
        this.zeros5 = zeros5;
    }

     @Field(offset = 100, length = 5)
    public String getAgCobradora() {
        return agCobradora;
    }

    public void setAgCobradora(String agCobradora) {
        this.agCobradora = agCobradora;
    }

     @Field(offset = 105, length = 1)
    public String getDac3() {
        return dac3;
    }

    public void setDac3(String dac3) {
        this.dac3 = dac3;
    }

     @Field(offset = 106, length = 25)
    public String getUsoEmpresa() {
        return usoEmpresa;
    }

    public void setUsoEmpresa(String usoEmpresa) {
        this.usoEmpresa = usoEmpresa;
    }

     @Field(offset = 131, length = 2)
    public String getZeros6() {
        return zeros6;
    }

    public void setZeros6(String zeros6) {
        this.zeros6 = zeros6;
    }

     @Field(offset = 133, length = 2)
    public String getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(String codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

     @Field(offset = 134, length = 15)
    public String getInscricaoNumero() {
        return inscricaoNumero;
    }

    public void setInscricaoNumero(String inscricaoNumero) {
        this.inscricaoNumero = inscricaoNumero;
    }

     @Field(offset = 149, length = 30)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     @Field(offset = 179, length = 10)
    public String getBrancos3() {
        return brancos3;
    }

    public void setBrancos3(String brancos3) {
        this.brancos3 = brancos3;
    }

     @Field(offset = 189, length = 10)
    public String getZeros7() {
        return zeros7;
    }

    public void setZeros7(String zeros7) {
        this.zeros7 = zeros7;
    }

     @Field(offset = 199, length = 15)
    public String getTarifaCustas() {
        return tarifaCustas;
    }

    public void setTarifaCustas(String tarifaCustas) {
        this.tarifaCustas = tarifaCustas;
    }

    @Field(offset = 214, length = 8)
    public String getErros() {
        return erros;
    }

    public void setErros(String erros) {
        this.erros = erros;
    }

    @Field(offset = 222, length = 2)
    public String getCodLiquidacao() {
        return codLiquidacao;
    }

    public void setCodLiquidacao(String codLiquidacao) {
        this.codLiquidacao = codLiquidacao;
    }

    @Field(offset = 224, length = 17)
    public String getBrancos4() {
        return brancos4;
    }

    public void setBrancos4(String brancos4) {
        this.brancos4 = brancos4;
    }

    @Override
    public String toString() {
        return "LineCnabRegistroSegmentoTRetorno{" + "codigoBanco=" + codigoBanco + ", codigoLote=" + codigoLote + ", tipoRegistro=" + tipoRegistro + ", numRegistro=" + numRegistro + ", segmento=" + segmento + ", boletoDda=" + boletoDda + ", codOcorrencia=" + codOcorrencia + ", zeros1=" + zeros1 + ", agencia=" + agencia + ", zeros2=" + zeros2 + ", conta=" + conta + ", zeros3=" + zeros3 + ", dac1=" + dac1 + ", numCarteira=" + numCarteira + ", nossoNumero=" + nossoNumero + ", dac2=" + dac2 + ", brancos1=" + brancos1 + ", zeros4=" + zeros4 + ", seuNumero=" + seuNumero + ", brancos2=" + brancos2 + ", vencimento=" + vencimento + ", valorTitulo=" + valorTitulo + ", zeros5=" + zeros5 + ", agCobradora=" + agCobradora + ", dac3=" + dac3 + ", usoEmpresa=" + usoEmpresa + ", zeros6=" + zeros6 + ", codigoInscricao=" + codigoInscricao + ", inscricaoNumero=" + inscricaoNumero + ", nome=" + nome + ", brancos3=" + brancos3 + ", zeros7=" + zeros7 + ", tarifaCustas=" + tarifaCustas + ", erros=" + erros + ", codLiquidacao=" + codLiquidacao + ", brancos4=" + brancos4 + '}';
    }  
    
    public void unirSegmentosUeT(LineCnabRegistroSegmentoTRetorno segT) {
        LineCnabRegistroSegmentoURetorno tipoSegmentoU = new LineCnabRegistroSegmentoURetorno();
        tipoSegmentoU.getSegmento();
        String tipoSegmentoT = segT.getSegmento();
        if (!"U".equals(tipoSegmentoU) || !"T".equals(tipoSegmentoT)) {
            throw new IllegalArgumentException("Metodo unirSegmentosUeT() so deve ser chamado a partir de um objeto de segmento U com um ojeto segmento T como parametro");
        }
        this.setAgencia(segT.getAgencia());
        this.setConta(segT.getConta());
        this.setDac1(segT.getDac1());
        this.setNossoNumero(segT.getNossoNumero());
        this.setNumCarteira(segT.getNumCarteira());
        this.setVencimento(segT.getVencimento());
        this.setValorTitulo(segT.getValorTitulo());
        tipoSegmentoU.setCodigoBanco(segT.getCodigoBanco()); // segmento U
        this.setAgCobradora(segT.getAgCobradora());
        this.setDac3(segT.getDac3());
        this.setCodigoInscricao(segT.getCodigoInscricao());
        this.setInscricaoNumero(segT.getInscricaoNumero());
        this.setNome(segT.getNome());
        tipoSegmentoU.setValorIof(segT.getTarifaCustas());
        tipoSegmentoU.setCodOcorrencia(segT.getCodOcorrencia());
    }
}
