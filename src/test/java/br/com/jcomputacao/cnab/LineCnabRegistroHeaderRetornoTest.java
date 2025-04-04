/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class LineCnabRegistroHeaderRetornoTest {

    public LineCnabRegistroHeaderRetornoTest() {
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
    public void LineCnabRegistroHeaderRetornoTest() throws ParseException {

        LineCnabRegistroHeaderRetorno achetype = new LineCnabRegistroHeaderRetorno();
        LineModel line = achetype.createModel();
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_REMESSA, 2L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.LITERAL_TRANSMISSAO, "RETORNO");
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_SERVICO, 01L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.LITERAL_SERVICO, "COBRANÇA       ");
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_AGENCIA_CEDENTE, 1234L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CONTA_MOVIMENTO_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CONTA_COBRANCA_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NOME_CEDENTE, "Hermanoteu godofredo durvalino");
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_BANCO, 333L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NOME_BANCO, "SANTANDER      ");
        String dataMovimento = "051109";
        line.setFieldValue(LineCnabRegistroHeaderRetorno.CODIGO_CEDENTE, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        String brancos = "    ";
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NUMERO_VERSAO, 123L);
        line.setFieldValue(LineCnabRegistroHeaderRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, 123456L);



        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

        Date data = null;


        try {

            data = sdf.parse(dataMovimento);

        } catch (ParseException ex) {
            Logger.getLogger(LineCnabRegistroHeaderRetorno.class.getName()).log(Level.SEVERE, null, ex);
        }

        line.setFieldValue(LineCnabRegistroHeaderRetorno.DATA_MOVIMENTO, data);

        StringBuffer sb = line.getRepresentation();
        String expected = "02RETORNO01COBRANÇA       12341234567812345678Hermanoteu godofredo durvalino333SANTANDER      051109" +
                "0000000000XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + brancos + "123123456";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);

//        System.out.println("Linha retornada : " + sb.toString());
//        System.out.println("Linha esperada : " + expected);
        assertEquals(expected, sb.toString());
    }
}