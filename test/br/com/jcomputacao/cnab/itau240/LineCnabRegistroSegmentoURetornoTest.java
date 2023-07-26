package br.com.jcomputacao.cnab.itau240;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author larissa.camargo 27.08.2021
 */
public class LineCnabRegistroSegmentoURetornoTest {

    private final FixedFormatManager FF_MANAGER = new FixedFormatManagerImpl();

    @Test
    public void gerarSegmentoURetorno() throws ParseException {
        LineCnabRegistroSegmentoURetorno record = new LineCnabRegistroSegmentoURetorno();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("U");
        record.setBrancos1("");
        record.setCodOcorrencia("");
        record.setJurosMulta("");
        record.setValorDesconto("");
        record.setValorAbatimento("");
        record.setValorIof("");
        record.setValorCreditado1("");
        record.setValorCreditado2("");
        record.setZeros1("");
        record.setDataOcorrencia1("");
        record.setDataCredito("");
        record.setOcorrenciaPagador("");
        record.setDataOcorrencia2("");
        record.setValorOcorrencia("");
        record.setBrancos2("");
        record.setZeros2("");
        record.setBrancos3("");

        String expected = "341    3     U                                                                                                                                                                                                                                  ";
        System.out.println(expected);
        String result = FF_MANAGER.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue(result.contains(""));

        System.out.println("\nResultado: " + FF_MANAGER.export(record));

    }

    @Test
    public void parseSegmentoURetorno_000() throws ParseException {
        String linha = "3410001300286U 020000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000607202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r00 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha);
        assertEquals("341", r00.getCodigoBanco());
        System.out.println(r00);
    }

    @Test
    public void parseSegmentoURetorno_001() throws ParseException {
        String linha01 = "3410001300002U 320000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001807202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r01 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha01);
        System.out.println(r01);
    }

    @Test
    public void parseSegmentoURetorno_002() throws ParseException {

        String linha02 = "3410001300004U 090000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001807202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r02 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha02);
        System.out.println(r02);
    }

    @Test
    public void parseSegmentoURetorno_003() throws ParseException {

        String linha03 = "3410001300006U 350000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001807202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r03 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha03);
        System.out.println(r03);
    }

    @Test
    public void parseSegmentoURetorno_004() throws ParseException {
        String linha04 = "3410001300008U 230000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001807202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r04 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha04);
        System.out.println(r04);
    }

    @Test
    public void parseSegmentoURetorno_005() throws ParseException {
        String linha05 = "3410001300010U 060000000000013380000000000000000000000000000000000000000000000000000001127080000000001127080000000000000000000000000000001807202319072023000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r05 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha05);
        System.out.println(r05);
    }

    @Test
    public void parseSegmentoURetorno_006() throws ParseException {
        String linha06 = "3410001300012U 320000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001807202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r06 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha06);
        System.out.println(r06);
    }

    @Test
    public void parseSegmentoURetorno_007() throws ParseException {
        String linha07 = "3410001300014U 090000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001807202300000000000000000000000000000000000                              00000000000000000000000       ";
        LineCnabRegistroSegmentoURetorno r07 = FF_MANAGER.load(LineCnabRegistroSegmentoURetorno.class, linha07);
        System.out.println(r07);
    }

}
