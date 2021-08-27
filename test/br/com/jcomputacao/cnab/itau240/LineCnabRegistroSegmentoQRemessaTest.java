
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
 *    27.08.2021
 */
public class LineCnabRegistroSegmentoQRemessaTest {
    @Test
    public void gerarSegmentoQ() throws ParseException {
        LineCnabRegistroSegmentoQRemessa record = new LineCnabRegistroSegmentoQRemessa();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("Q");
        record.setBrancos1("");
        record.setCodOcorrencia("");
        record.setCodigoInscricao1("2");
        record.setInscricaoNumero1("");
        record.setNome("LARISSA ANTUNES DE CAMARGO");
        record.setBrancos2("");
        record.setLogradouro("RUA SAN MARINO,323,CASA");
        record.setBairro("JD SALTENSE");
        record.setCep("13323");
        record.setSufixoCep("400");
        record.setCidade("SALTO");
        record.setUf("SP");
        record.setCodigoInscricao2("2");
        record.setInscricaoNumero2("");
        record.setSacadorAvalista("LARISSA ANTUNES DE CAMARGO");
        record.setBrancos3("");
        record.setZeros("");
        record.setBrancos4("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "341    3     Q   2               LARISSA ANTUNES DE CAMARGO              RUA SAN MARINO,323,CASA                 JD SALTENSE    13323400SALTO          SP2               LARISSA ANTUNES DE CAMARGO                                             ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nresultado: " + manager.export(record));
    }
}
