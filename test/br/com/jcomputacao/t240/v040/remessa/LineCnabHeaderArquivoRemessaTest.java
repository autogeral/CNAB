package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Jennifer
 * @version 
 */
public class LineCnabHeaderArquivoRemessaTest {

    @Test
    public void testaHeaderConvivere() throws ParseException {
        LineArchetype la = new LineCnab240v040HeaderArquivo();
        LineModel lm = la.createModel();
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf2.parse("26062013");

        //01
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_BANCO, "033");
        //02
        lm.setFieldValue(LineCnab240v040HeaderArquivo.LOTE_SERVICO, "0000");
        //03
        lm.setFieldValue(LineCnab240v040HeaderArquivo.TIPO_REGISTRO, "0");
        //04
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO, "        ");
        //05
        lm.setFieldValue(LineCnab240v040HeaderArquivo.TIPO_INSCRICAO, 2);
        //06
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NUMERO_INSCRICAO, 10276553000125L);
        //07
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_TRASMISSAO, 6500005534372L);
        //08
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO2, "                         ");
        //09
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NOME_EMPRESA, "CONVIVERE EMPREENDIMENTOS IMOBILIARIOS LTDA");
        //10
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NOME_BANCO, "Banco Santander");
        //11
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO3, "          ");
        //12
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_REM_RET, 1);
        //13
        lm.setFieldValue(LineCnab240v040HeaderArquivo.DATA_GERACAO_ARQUIVO, data);
        //14
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO4, "      ");
        //15
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NUM_SEQUENCIAL_ARQUIVO, 1);
        //16
        lm.setFieldValue(LineCnab240v040HeaderArquivo.VERSAO_LAYOUT, "040");
        //17
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO5, "                                                                          ");

        StringBuffer sb = lm.getRepresentation();
        System.out.println(sb);

	String expected = "03300000        2010276553000125006500005534372                         CONVIVERE EMPREENDIMENTOS IMOBBanco Santander                         126062013      000001040                                                                          ";
        System.out.println(expected);
        String result = sb.toString();
	assertEquals (expected, result);
        assertTrue (result.contains("10276553000125"));
    }
    
    @Test
    public void testaHeaderAutoGeral() throws ParseException {
        LineArchetype la = new LineCnab240v040HeaderArquivo();
        //LineArchetype la = new LineCnab240v060ArquivoHeader();
        LineModel lm = la.createModel();
        String expected = "03300000         2054375370001370033006500490028050300065 0000480000414 AUTO GERAL DE ITU LTDA        BANCO SANTANDER                         10612201210573500004706000000                                        G4016PF00528               G4";
        lm.setRepresentation(expected);
        
        System.out.println("CODIGO_BANCO           : " + lm.getFieldValueString(LineCnab240v040HeaderArquivo.CODIGO_BANCO));
        System.out.println("TIPO_INSCRICAO         : " + lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.TIPO_INSCRICAO));
        System.out.println("NUMERO_INSCRICAO       : " + lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.NUMERO_INSCRICAO));
        System.out.println("CODIGO_TRASMISSAO      : " + lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.CODIGO_TRASMISSAO));
        System.out.println("NOME_EMPRESA           : " + lm.getFieldValueString(LineCnab240v040HeaderArquivo.NOME_EMPRESA));
        System.out.println("NOME_BANCO             : " + lm.getFieldValueString(LineCnab240v040HeaderArquivo.NOME_BANCO));
        System.out.println("CODIGO_REM_RET         : " + lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.CODIGO_REM_RET));
        System.out.println("DATA_GERACAO_ARQUIVO   : " + DateFormat.getDateInstance(DateFormat.SHORT).format(lm.getFieldValueDate(LineCnab240v040HeaderArquivo.DATA_GERACAO_ARQUIVO)));
        System.out.println("NUM_SEQUENCIAL_ARQUIVO : " + lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.NUM_SEQUENCIAL_ARQUIVO));
        System.out.println("VERSAO_LAYOUT          : " + lm.getFieldValueString(LineCnab240v040HeaderArquivo.VERSAO_LAYOUT));
        
        assertEquals("033", lm.getFieldValueString(LineCnab240v040HeaderArquivo.CODIGO_BANCO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.TIPO_INSCRICAO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.NUMERO_INSCRICAO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.CODIGO_TRASMISSAO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.NOME_EMPRESA));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.NOME_BANCO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.CODIGO_REM_RET));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.DATA_GERACAO_ARQUIVO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.NUM_SEQUENCIAL_ARQUIVO));
//        assertEquals(0, lm.getFieldValueNumber(LineCnab240v040HeaderArquivo.VERSAO_LAYOUT));
        
        String result = lm.getRepresentation().toString();
        assertEquals(expected, result);
        
        
    }
}
