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
 */
public class LineCnabRegistroSegmentoYRemessaTest {
     @Test
    public void gerarSegmentoR() throws ParseException {
        LineCnabRegistroSegmentoYRemessa record = new LineCnabRegistroSegmentoYRemessa();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("Y");
        record.setBrancos1("");
        record.setCodOcorrencia("");
        record.setCodRegOpcional("01");
        record.setCodigoInscricao("2");
        record.setInscricaoNumero("");
        record.setNomeSacadorAvalista("LARISSA ANTUNES DE CAMARGO");
        record.setEnderecoSacador("RUA SAN MARINO, 323, CASA");
        record.setBairroSacador("JD SALTENSE");
        record.setCepSacador("13323400");
        record.setCidadeSacador("SALTO");
        record.setUfSacador("SP");
        record.setBrancos2("");
        
         FixedFormatManager manager = new FixedFormatManagerImpl();
         String expected = "341    3     Y   012               LARISSA ANTUNES DE CAMARGO              RUA SAN MARINO, 323, CASA               JD SALTENSE    13323400SALTO          SP                                                                                     ";
         System.out.println(expected);
         String result = manager.export(record);
         System.out.println(result);
         assertEquals(expected, result);
         assertTrue (result.contains(""));
         
         System.out.println("\nResultado: " + manager.export(record));
    }
}
