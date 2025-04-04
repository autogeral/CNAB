package br.com.jcomputacao.cnab.itau400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *     26.08.2021
 */

public class LineCnabRegistroDetalheObrgRemessaTest {
    @Test
    public void gerarRegistroDetalhe() throws ParseException {
       LineCnabRegistroDetalheObrigatorioRemessa record = new LineCnabRegistroDetalheObrigatorioRemessa();
       record.setTipoRegistro("1");
       record.setCodigoInscricao1("");
       record.setNumeroInscricao1("");
       record.setAgencia("");
       record.setZeros("00");
       record.setConta("");
       record.setDac("");
       record.setBrancos1("");
       record.setInstrucaoAlegacao("");
       record.setUsoEmpresa("");
       record.setNossoNumero("");
       record.setQtdMoeda("");
       record.setNumeroCarteira("");
       record.setUsoBanco("");
       record.setCarteira("");
       record.setCodOcorrencia("");
       record.setNumDocumento("");
       record.setVencimento("300821");
       record.setValorTitulo("123.45");
       record.setCodigoBanco("341");
       record.setAgenciaCobradora("");
       record.setEspecie("");
       record.setAceite("A");
       record.setDataEmissao("260821");
       record.setInstrucao1("");
       record.setInstrucao2("");
       record.setJuros1Dia("");
       record.setDesconto("");
       record.setValorDesconto("");
       record.setValorIof("");
       record.setAbatimento("");
       record.setCodigoInscricao2("1");
       record.setNumeroInscricao2("");
       record.setNome("LARISSA ANTUNES DE CAMARGO");
       record.setBrancos2("");
       record.setLogradouros("RUA SAN MARINO, 323 - CASA");
       record.setBairro("JD SALTENSE");
       record.setCep("13327400");
       record.setCidade("SALTO");
       record.setEstado("SP");
       record.setSacadorAvalista("LARISSA ANTUNES DE CAMARGO");
       record.setBrancos3("");
       record.setDataMora("");
       record.setPrazo("60");
       record.setBrancos("");
       record.setNumeroSequencial("");
       
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "1                    00                                                                                                 300821123.45       341       A260821                                                              1               LARISSA ANTUNES DE CAMARGO              RUA SAN MARINO, 323 - CASA              JD SALTENSE 13327400SALTO          SPLARISSA ANTUNES DE CAMARGO              60       ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
       
    }
}
