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
public class LineCnabRegistroSegmentoTRetornoTest {
    
    private final FixedFormatManager FF_MANAGER = new FixedFormatManagerImpl();
    
    
    @Test
    public void gerarRegistroSegmentoTRetornoRemessa() throws ParseException {
        
        LineCnabRegistroSegmentoTRetorno record = new LineCnabRegistroSegmentoTRetorno();
        record.setCodigoBanco("341");
        record.setCodigoLote("");
        record.setTipoRegistro("3");
        record.setNumRegistro("");
        record.setSegmento("T");
        record.setBoletoDda("");
        record.setCodOcorrencia("");
        record.setZeros1("0");
        record.setAgencia("");
        record.setZeros2("00000000");
        record.setConta("");
        record.setZeros3("");
        record.setDac1("");
        record.setNumCarteira("");
        record.setNossoNumero("");
        record.setDac2("");
        record.setBrancos1("");
        record.setZeros4("");
        record.setSeuNumero("");
        record.setBrancos2("");
        record.setVencimento("01082021");
        record.setValorTitulo("50.00");
        record.setZeros5("");
        record.setAgCobradora("");
        record.setDac3("");
        record.setUsoEmpresa("");
        record.setZeros6("");
        record.setCodigoInscricao("2");
        record.setInscricaoNumero("");
        record.setNome("LARISSA ANTUNES DE CAMARGO");
        record.setBrancos3("");
        record.setZeros7("");
        record.setTarifaCustas("");
        record.setErros("");
        record.setCodLiquidacao("");
        record.setBrancos4("");
        
        
        FixedFormatManager manager = new FixedFormatManagerImpl();
        String expected = "341    3     T   0    00000000                                           0108202150.00                                              2               LARISSA ANTUNES DE CAMARGO                                                                  ";
        System.out.println(expected);
        String result = manager.export(record);
        System.out.println(result);
        assertEquals(expected, result);
        assertTrue (result.contains(""));
        
        System.out.println("\nResultado: " + manager.export(record));
        
        
    } 
    
    @Test
    public void parseSegmentoURetorno_000() throws ParseException {
        String linha00 = "3410001300285T 0200278000000009365700109000330342        00010266705     07082023000000000014522000000412                         000000000000000000ALTOS E AUTOS AUTOS E VEICULOS          000000000000000000000000000000000                   ";
        assertEquals(240, linha00.length());
        LineCnabRegistroSegmentoTRetorno r00 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha00);
        assertEquals("341", r00.getCodigoBanco());
        System.out.println(r00);
    }
    
    @Test
    public void parseSegmentoURetorno_001() throws ParseException {
        String linha01 = "3410001300001T 3200278000000009365700109000255648        00010481103     19062023000000000077591000065541                         000000000000000000OURO E OUTROS METAIS PRECIOSOS          000000000000000000000000000000000                   ";
        assertEquals(240, linha01.length());
        LineCnabRegistroSegmentoTRetorno r01 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha01);
        assertEquals("341", r01.getCodigoBanco());
        System.out.println(r01);
    }
    
    @Test
    public void parseSegmentoURetorno_002() throws ParseException {
        String linha02 = "3410001300003T 0900278000000009365700109000257933        00053342101     23062023000000000215250000077106                         000000000000000000TRANSPORTES E CORRERIAS LTDA            000000000000000000000000000000000                   ";
        assertEquals(240, linha02.length());
        LineCnabRegistroSegmentoTRetorno r02 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha02);
        assertEquals("341", r02.getCodigoBanco());
        System.out.println(r02);
    }
    
    @Test
    public void parseSegmentoURetorno_003() throws ParseException {
        String linha03 = "3410001300005T 3500278000000009365700109000262347        00053392001     12062023000000000034254000000000                         000000000000000000JULIANA LINDA DE MATAR                  000000000000000000000091400000000                   ";
        assertEquals(240, linha03.length());
        LineCnabRegistroSegmentoTRetorno r03 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha03);
        assertEquals("341", r03.getCodigoBanco());
        System.out.println(r03);
    }
    
    @Test
    public void parseSegmentoURetorno_004() throws ParseException {
        String linha04 = "3410001300007T 2300278000000009365700109000262347        00053392001     12062023000000000034254000002783                         000000000000000000JOAZINHO DA SILVA SAURO                 000000000000000000000066500000000                   ";
        assertEquals(240, linha04.length());
        LineCnabRegistroSegmentoTRetorno r04 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha04);
        assertEquals("341", r04.getCodigoBanco());
        System.out.println(r04);
    }
    
    @Test
    public void parseSegmentoURetorno_005() throws ParseException {
        String linha05 = "3410001300009T 0600278000000009365700109000262701        00010209705     13072023000000000111370341027313                         000000000000000000JOSE APARECIDO DE JESUS AUTO P          000000000000000000000000000000000CK                 ";
        assertEquals(240, linha05.length());
        LineCnabRegistroSegmentoTRetorno r05 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha05);
        assertEquals("341", r05.getCodigoBanco());
        System.out.println(r05);
    }
    
    @Test
    public void parseSegmentoURetorno_006() throws ParseException {
        String linha06 = "3410001300011T 3200278000000009365700109000264202        00010490403     19062023000000000053003000065541                         000000000000000000OUROFERT COMERCIO DE AGROQUIMI          000000000000000000000000000000000                   ";
        assertEquals(240, linha06.length());
        LineCnabRegistroSegmentoTRetorno r06 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha06);
        assertEquals("341", r06.getCodigoBanco());
        System.out.println(r06);
    }
    
    @Test
    public void parseSegmentoURetorno_007() throws ParseException {
        String linha07 = "3410001300013T 0900278000000009365700109000266009        00053413701     07062023000000000230198000077106                         000000000000000000FRANCISCO FRANCISCANO DE SAO FRANCISCO  000000000000000000000000000000000                   ";
        assertEquals(240, linha07.length());
        LineCnabRegistroSegmentoTRetorno r07 = FF_MANAGER.load(LineCnabRegistroSegmentoTRetorno.class, linha07);
        assertEquals("341", r07.getCodigoBanco());
        System.out.println(r07);
    }
}
