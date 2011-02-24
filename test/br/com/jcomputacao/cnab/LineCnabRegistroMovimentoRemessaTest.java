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
public class LineCnabRegistroMovimentoRemessaTest {

    public LineCnabRegistroMovimentoRemessaTest() {
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
    public void LineCnabRegistroMovimentoRemessaTest() throws ParseException {

        LineCnabRegistroMovimentoRemessa achetype = new LineCnabRegistroMovimentoRemessa();
        LineModel line = achetype.createModel();
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.TIPO_INSCRICAO_CEDENTE, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CGC_CPF_CEDENTE, 34866702800111L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_TRANSMISSAO, "12345678901234567890");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_CONTROLE_PARTICIPANTE, "1234567890123456789012345");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NOSSO_NUMERO, 12345678L);
        String dataSegundoDesconto = "051109";
        String branco_1 = " ";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.INFORMCAO_MULTA, 1L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.PERCENTUAL_MULTA_POR_ATRASO, 99.99);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.UNIDADE_VALOR_MOEDA_CORRENTE, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_TITULO_OUTRA_UNIDADE, 12345678.12345);
        String brancos_1 = "    ";
        String dataConrancaMulta = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_CARTEIRA, 1L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_OCORRENCIA, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.SEU_NUMERO, "1234567890");
        String dataVencimentoTitulo = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_TITULO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_BANCO_COBRADOR, 333L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CODIGO_AGENCIA_COBRADORA, 12345L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.ESPECIE_DOCUMENTO, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.TIPO_ACEITE, "N");
        String dataEmissaoTitulo = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.PRIMEIRA_INSTRUCAO_COBRANCA, 00L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.SEGUNDA_INSTRUCAO_COBRANCA, 00L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_MORA_COBRADO_DIA_ATRASO, 12345678901.00);
        String dataLimiteConcessaoDesconto = "051109";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_DESCONTO_CONCEDIDO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_IOF_RECOLHIDO, 12345678.12345);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.VALOR_SEGUNDO_DESCONTO, 12345678901.00);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.TIPO_INSCRICAO_SACADO, 01L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CGC_CPF_SACADO, 99999999999999L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NOME_SACADO, "NOME DO SACADOXXXXXXNOME DO SACADOXXXXXX");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.ENDERECO_SACADO, "ENDERECO DO SACADOXXENDERECO DO SACADOXX");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.BAIRRO_SACADO, "BAIRROSACADO");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.CEP_SACADO, 12345L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.COMPLEMENTO_CEP, 123L);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.MUNICIPIO_SACADO, "MUNICIPIOSACADO");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.UF_ESTADO_SACADO, "XX");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NOME_SACADOR_COOBRIGADO, "NOME SACADOR COOBRIGATOXXXXXXX");
        String brancos_2 = " ";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.IDENTIFICADOR_COMPLEMENTO, "I");
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.COMPLEMENTO, 00L);
        String brancos_3 = "      ";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_DIAS_PROTESTO, 01L);
        String branco_2 = " ";
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.NUMERO_SEQUENCIAL_REGISTRO_ARQUIVO, 1L);


        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

        Date data1 = null;
        Date data2 = null;
        Date data3 = null;
        Date data4 = null;
        Date data5 = null;


        try {

            data1 = sdf.parse(dataSegundoDesconto);
            data2 = sdf.parse(dataConrancaMulta);
            data3 = sdf.parse(dataVencimentoTitulo);
            data4 = sdf.parse(dataEmissaoTitulo);
            data5 = sdf.parse(dataLimiteConcessaoDesconto);

        } catch (ParseException ex) {
            Logger.getLogger(LineCnabRegistroMovimentoRemessa.class.getName()).log(Level.SEVERE, null, ex);
        }

        line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_SEGUNDO_DESCONTO, data1);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_COBRANCA_MULTA, data2);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_VENCIMENTO_TITULO, data3);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_EMISSAO_TITULO, data4);
        line.setFieldValue(LineCnabRegistroMovimentoRemessa.DATA_LIMITE_CONCESSAO_DESCONTO, data5);


        StringBuffer sb = line.getRepresentation();
        String expected = "1013486670280011112345678901234567890123456789012345678901234512345678051109" + branco_1 + "19999011234567812345" + brancos_1 +
                "051109101123456789005110912345678901003331234501N051109000012345678901000511091234567890100123456781234512345678901000199999999999999" +
                "NOME DO SACADOXXXXXXNOME DO SACADOXXXXXXENDERECO DO SACADOXXENDERECO DO SACADOXXBAIRROSACADO12345123MUNICIPIOSACADOXXNOME SACADOR COOBRIGATOXXXXXXX" + brancos_2 + "I00" + brancos_3 + "01" + branco_2 + "000001";


//        assertEquals(expected.length(), 400);
//        assertEquals(sb.toString().length(), 400);

        System.out.println("Linha retornada : " + sb.toString());
        System.out.println("Linha esperada : " + expected);
        assertEquals(expected, sb.toString());
    }
}