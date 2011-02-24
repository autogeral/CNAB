/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nieri
 */
public class LineCnabRegistroTraillerRemessaTest {

    public LineCnabRegistroTraillerRemessaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void LineCnabRegistroTraillerRemessaTest() throws ParseException {

        LineCnabRegistroTraillerRemessa achetype = new LineCnabRegistroTraillerRemessa();
        LineModel line = achetype.createModel();
        line.setFieldValue(LineCnabRegistroTraillerRemessa.QUANTIDADE_TOTAL_LINHAS_ARQUIVO, 123456L);
        line.setFieldValue(LineCnabRegistroTraillerRemessa.VALOR_TOTAL_TITULOS, 12345678901.00);
        line.setFieldValue(LineCnabRegistroTraillerRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, 123456L);

        StringBuffer sb = line.getRepresentation();
        String expected = "912345612345678901000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                "00000000000000000000000000000000000000000000000000000000000000000000000000123456";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);

//        System.out.println("Linha retornada : " + sb.toString());
//        System.out.println("Linha esperada : " + expected);
        assertEquals(expected, sb.toString());
    }
}