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
public class LineCnabRegistroMovimentoRetornoTest {

    public LineCnabRegistroMovimentoRetornoTest() {
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
    public void LineCnabRegistroMovimentoRetornoTest() throws ParseException {

        LineCnabRegistroMovimentoRetorno achetype = new LineCnabRegistroMovimentoRetorno();
        LineModel line = achetype.createModel();
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.TIPO_INSCRICAO_CEDENTE, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CGC_CPF_CEDENTE, 34866702800123L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_AGENCIA_CEDENTE, 1234L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CONTA_MOVIMENTO_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CONTA_COBRANCA_CEDENTE, 12345678L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_CONTROLE_PARTICIPANTE, "1234567890123456789012345");
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NOSSO_NUMERO_1, 12345678L);
        String brancos1 = "                                     ";
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_CARTEIRA, 2L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_OCORRENCIA, 01L);
        String dataOcorrencia = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.SEU_NUMERO, "1234567890");
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NOSO_NUMERO_2, 12345678L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ORIGINAL_REMESSA, 12L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_PRIMEIRA_OCORRENCIA, "123");
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_SEGUNDA_OCORRENCIA, "123");
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ERRO_TERCEIRA_OCORRENCIA, "123");
        String brancos2 = " ";
        String dataVencimentoTitulo = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TITULO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_BANCO_COBRADOR, 123L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_AGENCIA_RECEBEDORA_TITULO, 12345L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.ESPECIE_DOCUMENTO, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TARIFA_COBRADA, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_OUTRAS_DESPESAS, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_JUROS_ATRASO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_IOF_DEVIDO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_ABATIMENTO_CONCEDIDO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_DESCONTO_CONCEDIDO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TOTAL_RECEBIDO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_JUROS_MORA, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_OUTROS_CREDITOS, 12345678901.00);
        String brancos3 = " ";
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.CODIGO_ACEITE, "N");
        String brancos4 = " ";
        String dataCredito = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NOME_SACADO, "NOME DO SACADOXXXXXXNOME DO SACADOXX");
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.IDENTIFICADOR_COMPLEMENTO, "X");
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.UNIDADE_VALOR_MOEDA_CORRENTE, 00L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_TITULO_OUTRA_UNIDADE_VALOR, 12345678.12345);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_IOC_OUTRA_UNIDADE_VALOR, 12345678.12345);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.VALOR_DEBITO_CREDITO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DEBITO_CREDITO, "D");
        String brancos5 = "           ";
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_VERSAO, 123L);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, 123456L);


        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

        Date data1 = null;
        Date data2 = null;
        Date data3 = null;


        try {

            data1 = sdf.parse(dataOcorrencia);
            data2 = sdf.parse(dataVencimentoTitulo);
            data3 = sdf.parse(dataCredito);

        } catch (ParseException ex) {
            Logger.getLogger(LineCnabRegistroMovimentoRetorno.class.getName()).log(Level.SEVERE, null, ex);
        }

        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DATA_OCORRENCIA, data1);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DATA_VENCIMENTO_TITULO, data2);
        line.setFieldValue(LineCnabRegistroMovimentoRetorno.DATA_CREDITO, data3);

        StringBuffer sb = line.getRepresentation();
        String expected = "1013486670280012312341234567812345678123456789012345678901234512345678" + brancos1 + "20105110912345678901234567812123123123" + brancos2 +
                "05110912345678901001231234501123456789010012345678901001234567890100123456789010012345678901001234567890100123456789010012345678901001234567890100" + brancos3 +
                "N" + brancos4 + "051109NOME DO SACADOXXXXXXNOME DO SACADOXXX00123456781234512345678123451234567890100D" + brancos5 +
                "123123456";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);

//        System.out.println("Linha retornada : " + sb.toString());
//        System.out.println("Linha esperada : " + expected);
        assertEquals(expected, sb.toString());
    }
}