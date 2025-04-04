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
public class LineCnabRegistroTraillerRetornoTest {

    public LineCnabRegistroTraillerRetornoTest() {
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
    public void LineCnabRegistroTraillerRetornoTest() throws ParseException {

        LineCnabRegistroTraillerRetorno achetype = new LineCnabRegistroTraillerRetorno();
        LineModel line = achetype.createModel();
        line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_REMESSA, 2L);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_SERVICO, 01L);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.CODIGO_BANCO, 333L);
        String brancos1 = "          ";
        line.setFieldValue(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_SIMPLES_REFERENTE_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_SIMPLES_REFERENTE_CEDENTE, 123456789012.00);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_SIMPLES, 12345678L);
        String brancos2 = "                                                  ";
        line.setFieldValue(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_CAUCIONADA_REFERENTE_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_CAUCIONADA_REFERENTE_CEDENTE, 123456789012.00);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_CAUCIONADA, 12345678L);
        String brancos3 = "          ";
        line.setFieldValue(LineCnabRegistroTraillerRetorno.QUANTIDADE_REGISTROS_COBRANCAS_DESCONTADA_REFERENTE_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.VALOR_TITULOS_COBRANCA_DESCONTADA_REFERENTE_CEDENTE, 123456789012.00);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_AVISO_COBRANCA_DESCONTADA, 12345678L);
        String brancos4 = "                                                                                                    " +
                "                                                                                                    " +
                "                        ";
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_VERSAO, 123L);
        line.setFieldValue(LineCnabRegistroTraillerRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, 123456L);

        StringBuffer sb = line.getRepresentation();
        String expected = "9201333" + brancos1 + "123456781234567890120012345678" + brancos2 + "123456781234567890120012345678" + brancos3 + "123456781234567890120012345678" + brancos4 + "123123456";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);

//        System.out.println("Linha retornada : " + sb.toString());
//        System.out.println("Linha esperada : " + expected);
        assertEquals(expected, sb.toString());
    }
}