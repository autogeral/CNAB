package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
/**
 * Testes para gerar o arquivo de remessa - estrutura.
 */
public class TestFile {

    SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
    String dataSrt = "26062013";
    Date data;
    private int numeroSequencialArquivo = 0;
    private int quantidadeTotalLotes = 0;
    private int quantidadeTotalRegistros = 0;
    private int quantidadeRegistroPorLote = 0;

    public TestFile() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestFile() throws ParseException, IOException {
        String local = "\\Users\\Cesário\\Desktop\\";
        String nomeArquivo = "TesteArquivoRemessa";
        String extensaoArquivo = ".txt";

        StringBuilder sb = new StringBuilder();
        sb.append(getRepresentation());
        FileWriter fileWriter = new FileWriter(local + nomeArquivo + extensaoArquivo);
        fileWriter.write(sb.toString());
        fileWriter.flush();
        System.out.print(sb);
    }

    public StringBuilder getRepresentation() throws ParseException {
        StringBuilder sb = new StringBuilder();
        criaHeaderArquivo(sb);

        criaHeaderLote(sb);
        criaSegmentoP(sb);
        criaSegmentoQ(sb);
        criaSegmentoR(sb);
        criaTrailerLote(sb);

        criaTrailerArquivo(sb);
        return sb;
    }

    public void criaHeaderArquivo(StringBuilder sb) throws ParseException {
        numeroSequencialArquivo++;
        quantidadeTotalRegistros++;
        LineCnab240v040HeaderArquivo la = new LineCnab240v040HeaderArquivo();
        LineModel lm = la.createModel();
        data = sdf2.parse(dataSrt);
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
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NOME_BANCO, "BANCO SANTANDER");
        //11
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO3, "          ");
        //12
        lm.setFieldValue(LineCnab240v040HeaderArquivo.CODIGO_REM_RET, 1);
        //13
        lm.setFieldValue(LineCnab240v040HeaderArquivo.DATA_GERACAO_ARQUIVO, data);
        //14
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO4, "      ");
        //15
        lm.setFieldValue(LineCnab240v040HeaderArquivo.NUM_SEQUENCIAL_ARQUIVO, numeroSequencialArquivo);
        //16
        lm.setFieldValue(LineCnab240v040HeaderArquivo.VERSAO_LAYOUT, "040");
        //17
        lm.setFieldValue(LineCnab240v040HeaderArquivo.RESERVADO_USO_BANCO5, "                                                                          ");

        sb.append(lm.getRepresentation()).append("\n");
    }

    private void criaHeaderLote(StringBuilder sb) throws ParseException {
        quantidadeTotalLotes++;
        quantidadeTotalRegistros++;
        LineArchetype la = new LineCnab240v040HeaderLote();
        LineModel lm = la.createModel();
        data = sdf2.parse(dataSrt);

        //01
        lm.setFieldValue(LineCnab240v040HeaderLote.CODIGO_BANCO, "033");
        //02
        lm.setFieldValue(LineCnab240v040HeaderLote.NUMERO_LOTE, quantidadeTotalLotes);
        //03
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_REGISTRO, "1");
        //04
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_OPERACAO, "R");
        //05
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_SERVICO, 1);
        //06
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO, "  ");
        //07
        lm.setFieldValue(LineCnab240v040HeaderLote.VERSAO_LAYOUT, 030);
        //08
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO2, " ");
        //09
        lm.setFieldValue(LineCnab240v040HeaderLote.TIPO_INSCRICAO, 2);
        //10
        lm.setFieldValue(LineCnab240v040HeaderLote.NUMERO_INSCRICAO, "10276553000125");
        //11
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO3, "                    ");
        //12
        lm.setFieldValue(LineCnab240v040HeaderLote.CODIGO_TRASMISSAO, "006500005534372");
        //13
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO4, "     ");
        //14
        lm.setFieldValue(LineCnab240v040HeaderLote.NOME_CEDENTE, "CONVIVERE EMPREENDIMENTOS IMOBILIARIOS LTDA");
        //15
        lm.setFieldValue(LineCnab240v040HeaderLote.MENSAGEM_1, "");
        //16
        lm.setFieldValue(LineCnab240v040HeaderLote.MENSAGEM_2, "");
        //17
        lm.setFieldValue(LineCnab240v040HeaderLote.NUMERO_REMESSA_RETORNO, 1);
        //18
        lm.setFieldValue(LineCnab240v040HeaderLote.DATA_GRAVACAO_REMESSA_RETORNO, data);
        //19
        lm.setFieldValue(LineCnab240v040HeaderLote.RESERVADO_USO_BANCO5, "                                         ");
        sb.append(lm.getRepresentation()).append("\n");
    }

    /**
     * DETALHES
     */
    private void criaSegmentoP(StringBuilder sb) throws ParseException {
        quantidadeTotalRegistros++;
        quantidadeRegistroPorLote++;
        LineArchetype la = new LineCnab240v040SegmentoPRemessa();
        LineModel lm = la.createModel();
        data = sdf2.parse(dataSrt);
        //01
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_LOTE, quantidadeTotalLotes);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TIPO_REGISTRO, 3);
        //04
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.SEQUENCIAL_REGISTRO, quantidadeRegistroPorLote);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_SEGMENTO_REGISTRO, "P");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_MOVIMENTO_REMESSA, 01);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.AGENCIA_MANTENEDORA, 0065);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA, "5");
        //10
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.NUMERO_CONTA_COR, 130038150L);
        //11
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_VERIFICADOR_CONTA, "0");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CONTA_COBRANCA, 123456789L);
        //13
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_CONTA_COBRANCA, 3);
        //14
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO, "  ");
        //15
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.NOSSO_NUMERO, "9999999999999");
        //16
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TIPO_DE_COBRANCA, 5);
        //17
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.FORMA_CADASTRO_TITULO_BANCO, 1);
        //18
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TIPO_DOCUMENTO, 1);
        //19
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO2, " ");
        //20
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO3, " ");
        //21
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.NUMERO_DOCUMENTO_COBRANCA, "111111111111111");
        //22
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_VENCIMENTO_TITULO, data);
        //23
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_NOMINAL_TITULO, 123456789123.12);
        //24
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.AGENCIA_COBRADORA, 1234);
        //25
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DIGITO_VERIFICADOR_AGENCIA_CEDENTE, 5);
        //26
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO2, " ");
        //27
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.ESPECIE_TITULO, 10);
        //28
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.TITULO_ACEITO, "N");
        //29
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_EMISSAO_TITULO, data);
        //30
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_JUROS_MORA, 1);
        //31
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_JUROS_MORA, data);
        //32
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.JUROS_MORA_POR_DIA, 1234567891231.12);
        //33
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_DESCONTO_1, 0);
        //34 
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.DATA_DESCONTO_1, 23102013);
        //35
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_PERCENTUAL_DESCONTO_1, 0.0);
        //36
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_IOF, 0.0);
        //37
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.VALOR_ABATIMENTO, 0.0);
        //38
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.IDENTIFICACAO_TITULO_EMPRESA, "12345678911234567891abcde");
        //39
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_PARA_PROTESTO, 2);
        //40
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.PRAZO_PARA_PROTESTO, 30);
        //41
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_PARA_BAIXA_DEVOLUCAO, 3);
        //42
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO3, " ");
        //43
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.PRAZO_PARA_BAIXA_DEVOLUCAO, 10);
        //44
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.CODIGO_MOEDA, 00);
        //45
        lm.setFieldValue(LineCnab240v040SegmentoPRemessa.RESERVADO_USO_BANCO6, "          ");

        sb.append(lm.getRepresentation()).append("\n");
    }

    private void criaSegmentoQ(StringBuilder sb) {
        quantidadeTotalRegistros++;
        quantidadeRegistroPorLote++;
        LineArchetype la = new LineCnab240v040SegmentoQRemessa();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_LOTE, quantidadeTotalLotes);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.TIPO_REGISTRO, "3");
        //04
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.SEQUENCIAL_REGISTRO, quantidadeRegistroPorLote);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_SEGMENTO, "Q");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CODIGO_MOVIMENTO_REMESSA, 33);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.TIPO_INSCRICAO, 2);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_INSCRICAO, 12345678912345L);
        //10
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NOME, "AUTO GERAL DE ITU LTDA");
        //11
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.ENDERECO, "RUA DR. OCTAVIANO PEREIRA MENDES");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.BAIRRO, "CENTRO");
        //13
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CEP, 13340);
        //14
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.SUFIXO_CEP, 000);
        //15
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.CIDADE, "ITU");
        //16
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.UF, "SP");
        //17
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.TIPO_INSCRICAO_SACADOR, 0);
        //18
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_INSCRICAO_SACADOR, 12345678912345L);
        //19
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NOME_SACADOR, null);
        //20
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.IDENTIFICADOR_CARNE, 1);
        //21
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_SEQUENCIA_PARCELA, 2);
        //22
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.QUANTIDADE_TOTAL_PARCELAS, 18);
        //23
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.NUMERO_PLANO, 3);
        //24
        lm.setFieldValue(LineCnab240v040SegmentoQRemessa.RESERVADO_USO_BANCO, null);

        sb.append(lm.getRepresentation()).append("\n");
    }

    private void criaSegmentoR(StringBuilder sb) {
        quantidadeTotalRegistros++;
        quantidadeRegistroPorLote++;
        LineArchetype la = new LineCnab240v040SegmentoRRemessaImpressao1();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_BANCO_COMPENSACAO, "033");
        //02
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_LOTE, quantidadeTotalLotes);
        //03
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.TIPO_REGISTRO, 3);
        //04
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.SEQUENCIAL_REGISTRO, quantidadeRegistroPorLote);
        //05
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_SEGMENTO, "S");
        //06
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.EXCLUSIVO_FEBRABAN, " ");
        //07
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.CODIGO_MOVIMENTO_REMESSA, 66);
        //08
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.TIPO_IMPRESSAO, 1);
        //09
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.NUMERO_LINHA_IMPRESSA, 22);
        //10
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.MENSAGEM_PARA_RECIBO_SACADO, 4);
        //11
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.MENSAGEM_IMPRESSA, "Jennifer Santos");
        //12
        lm.setFieldValue(LineCnab240v040SegmentoRRemessaImpressao1.RESERVADO_USO_BANCO, null);

        sb.append(lm.getRepresentation()).append("\n");
    }

    private void criaTrailerLote(StringBuilder sb) {
        quantidadeTotalRegistros++;
        LineArchetype la = new LineCnab240v040TrailerLote();
        LineModel lm = la.createModel();

        //01
        lm.setFieldValue(LineCnab240v040TrailerLote.CODIGO_BANCO, "033");
        //02
        lm.setFieldValue(LineCnab240v040TrailerLote.LOTE_SERVICO, 1);
        //03
        lm.setFieldValue(LineCnab240v040TrailerLote.TIPO_REGISTRO, "5");
        //04
        lm.setFieldValue(LineCnab240v040TrailerLote.EXCLUSIVO_FEBRABAN, "         ");
        //05
        lm.setFieldValue(LineCnab240v040TrailerLote.QTDE_REGISTROS_LOTE, quantidadeRegistroPorLote);
        //06
        lm.setFieldValue(LineCnab240v040TrailerLote.RESERVADO_USO_BANCO, null);

        quantidadeRegistroPorLote = 0;
        sb.append(lm.getRepresentation()).append("\n");
    }

    public void criaTrailerArquivo(StringBuilder sb) {
        quantidadeTotalRegistros++;
        LineArchetype la = new LineCnab240v040TrailerArquivo();
        LineModel lm = la.createModel();
        //01
        lm.setFieldValue(LineCnab240v040TrailerArquivo.CODIGO_BANCO_COMPENSACAO, "033");
        //02 e 03
        lm.setFieldValue(LineCnab240v040TrailerArquivo.LOTE_TIPO_REGISTRO, "99999");
        //04
        lm.setFieldValue(LineCnab240v040TrailerArquivo.EXCLUSIVO_FEBRABAN, "         ");
        //05
        lm.setFieldValue(LineCnab240v040TrailerArquivo.QTDE_LOTES_ARQUIVO, quantidadeTotalLotes);
        //06
        lm.setFieldValue(LineCnab240v040TrailerArquivo.QTDE_REGISTROS_ARQUIVO, quantidadeTotalRegistros);
        //07
        lm.setFieldValue(LineCnab240v040TrailerArquivo.RESERVADO_USO_BANCO, null);

        sb.append(lm.getRepresentation()).append("\n");
    }
}
