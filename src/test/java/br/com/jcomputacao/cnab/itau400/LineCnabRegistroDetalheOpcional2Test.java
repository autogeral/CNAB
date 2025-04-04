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
 *    26.08.2021
 *  -> Layout referente ao arquivo remessa
 */
public class LineCnabRegistroDetalheOpcional2Test {
    @Test
    public void gerarRegistroDetalhe() throws ParseException {
        LineCnabRegistroDetalheOpcional2 record = new LineCnabRegistroDetalheOpcional2();
        record.setTipoRegistro("5");
        record.setEnderecoEmail("larissa.camargo@autogeral.net.br");
        record.setCodigoInscricao("");
        record.setNumeroInscricao("");
        record.setLogradouro("RUA SAN MARINO,323,CASA");
        record.setBairro("JD SALTENSE");
        record.setCep("13323400");
        record.setCidade("SALTO");
        record.setEstado("SP");
        record.setBrancos("");
        record.setNumeroSequencial("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "5larissa.camargo@autogeral.net.br                                                                                                        RUA SAN MARINO,323,CASA                 JD SALTENSE 13323400SALTO          SP                                                                                                                                                                                          ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
        
        
    }
    
}
