package br.com.jcomputacao.cnab.itau240.pagamentos;

import br.com.jcomutacao.cnab.itau240.pagamentos.LineCnabRegistroSegmentoJTitulosPagamento;
import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo
 *   10.08.2022
 */
public class LineCnabRegistroSegmentoJTitulosPagamentoTest {
     @Test
    public void gerarSegmentoJTituloPagamento() throws ParseException {
        //Liquidação de títulos (bloquetos) em cobrança no Itaú e em outros Bancos
        LineCnabRegistroSegmentoJTitulosPagamento record = new LineCnabRegistroSegmentoJTitulosPagamento();
        record.setCodigoBanco("341");
        record.setCodigoLote("0001");
        record.setTipoRegistro("3");
        record.setNumeroRegistro("00001");
        record.setCodigoSegmento("J");
        record.setTipoMovimento("000");
        record.setBancoFavorecido("");
        record.setCodigoMoeda("");
        record.setDigitoVerificador("");
        record.setVencimento("");
        record.setValor("");
        record.setCampoLivre("");
        record.setNomeFavorecido("");
        record.setDataVencimento("");
        record.setValorTitulo("");
        record.setDescontos("");
        record.setAcrescimos("");
        record.setDataPgto("");
        record.setValorPgto("");
        record.setZeros("000000000000000");
        record.setSeuNumero("");
        record.setBrancos("");
        record.setNossoNumero("");
        record.setOcorrencias("");
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "3410001300001J000                                                                                                                                                      000000000000000                                                          ";
        String result = manager.export(record);
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
         
        System.out.println("\nResultado: " + manager.export(record));
        
        
    }
}
