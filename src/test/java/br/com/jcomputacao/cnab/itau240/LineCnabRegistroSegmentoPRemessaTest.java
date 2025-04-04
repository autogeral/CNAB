package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *     27.08.2021
 */
public class LineCnabRegistroSegmentoPRemessaTest{
    @Test
    public void gerarSegmentoP() throws ParseException {
        LineCnabRegistroSegmentoPRemessa record = new LineCnabRegistroSegmentoPRemessa();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("P");
        record.setBrancos1("");
        record.setCodOcorrencia("");
        record.setZeros6("0");
        record.setAgencia("");
        record.setBrancos2("");
        record.setZeros1("0000000");
        record.setConta("");
        record.setBrancos3("");
        record.setDac1("");
        record.setNumCarteira("");
        record.setNossoNumero("");
        record.setDac2("");
        record.setBrancos4("");
        record.setZeros2("");
        record.setNumDocumento("");
        record.setBrancos5("");
        record.setVencimento("31082021");
        record.setValorTitulo("50.00");
        record.setAgCobradora("");
        record.setDac3("");
        record.setEspecieTitulo("");
        record.setAceite("A");
        record.setDataEmissaoTitulo("27082021");
        record.setZeros3("");
        record.setDataJurosMora("");
        record.setJuros1Dia("");
        record.setZeros4("");
        record.setData1Desconto("");
        record.setValor1Desconto("");
        record.setValorIof("");
        record.setValorAbatimento("");
        record.setUsoEmpresa("");
        record.setCodigoNegativacaoProtesto("");
        record.setPrazoNegativacaoProtesto("");
        record.setCodBaixa("");
        record.setPrazoBaixa("");
        record.setZeros5("");
        record.setBrancos6("");
        
        
        FixedFormatManager manager  = new FixedFormatManagerImpl();
        String  expected = "341    3     P   0                                                           3108202150.00                  A27082021                                                                                                             0             ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
        
    }
    
}
