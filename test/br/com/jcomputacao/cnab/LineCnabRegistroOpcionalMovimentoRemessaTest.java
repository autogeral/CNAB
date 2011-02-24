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
public class LineCnabRegistroOpcionalMovimentoRemessaTest {

    public LineCnabRegistroOpcionalMovimentoRemessaTest() {
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
    public void LineCnabRegistroOpcionalMovimentoRemessaTest() throws ParseException {

        LineCnabRegistroOpcionalMovimentoRemessa achetype = new LineCnabRegistroOpcionalMovimentoRemessa();
        LineModel line = achetype.createModel();
        String usoBanco1 = "                ";
        line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.CODIGO_TRANSMISSAO, "12345678901234567890");
        String usoBanco2 = "          ";
        line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.SUB_SEQUENCIA_REGISTRO, 01L);
        line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.MENSAGEM_VARIAVEL_TITULO, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        String usoBanco3 = "                                                                                                    " +
                "                                                                                                    " +
                "                                                                                   ";
        line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.IDENTIFICADOR_COMPLEMENTO, "X");
        line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.COMPLEMENTO, 11L);
        String brancos = "         ";
        line.setFieldValue(LineCnabRegistroOpcionalMovimentoRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, 123456L);

        StringBuffer sb = line.getRepresentation();
        String expected = "7" + usoBanco1 + "12345678901234567890" + usoBanco2 + "01XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + usoBanco3 + "X11" + brancos + "123456";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);

//        System.out.println("Linha retornada : " + sb.toString());
//        System.out.println("Linha esperada : " + expected);
        assertEquals(expected, sb.toString());
    }
}