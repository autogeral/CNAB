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
public class LineCnabRegistroHeaderRemessaTest {

    public LineCnabRegistroHeaderRemessaTest() {
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
    public void LineCnabRegistroHeaderRemessaTest() throws ParseException {
        
        LineCnabRegistroHeaderRemessa achetype = new LineCnabRegistroHeaderRemessa();
        LineModel line = achetype.createModel();
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_REMESSA, 1L);
        line.setFieldValue(LineCnabRegistroHeaderRemessa.LITERAL_TRANSMISSAO, "REMESSA");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_SERVICO, 01L);
        line.setFieldValue(LineCnabRegistroHeaderRemessa.LITERAL_SERVICO, "COBRANÇA       ");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_TRANSMISSAO, "12345678901234567890");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NOME_CEDENTE, "Hermanoteu godofredo durvalino");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.CODIGO_BANCO, 333L);
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NOME_BANCO, "SANTANDER      ");
        String dataGravacao = "051109";
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_1, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_3, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_4, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_5, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.MENSAGEM_6, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NUMERO_VERSAO_REMESSA_OPCIONAL, 123L);
        line.setFieldValue(LineCnabRegistroHeaderRemessa.NUMERO_SEQUENCIA_REGISTRO_ARQUIVO, 000001L);



        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

        Date data = null;


        try {

            data = sdf.parse(dataGravacao);

        } catch (ParseException ex) {
            Logger.getLogger(LineCnabRegistroHeaderRemessa.class.getName()).log(Level.SEVERE, null, ex);
        }

        line.setFieldValue(LineCnabRegistroHeaderRemessa.DATA_GRAVACAO, data);

        StringBuffer sb = line.getRepresentation();
        String expected = "01REMESSA01COBRANÇA       12345678901234567890Hermanoteu godofredo durvalino333SANTANDER      0511090000000000000000" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "123000001";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);
        assertEquals(expected, sb.toString());
    }
}