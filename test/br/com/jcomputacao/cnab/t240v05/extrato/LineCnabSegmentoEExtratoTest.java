package br.com.jcomputacao.cnab.t240v05.extrato;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v05.extrato.LineCnabv05SegmentoEExtrato;
import java.text.ParseException;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class LineCnabSegmentoEExtratoTest {
    //Método construtor
    public LineCnabSegmentoEExtratoTest() {
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
    public void LineCnabSegmentoEExtratoTest() throws ParseException {
        LineArchetype la = new LineCnabv05SegmentoEExtrato();
        LineModel line = la.createModel();
        line.setRepresentation("3410001300001E1  205437537000137000000         34202002782000000092471 7AUTO GERAL DE ITU LTDA.             DPV                      S        17052013000000000000539221C2060048RES APLIC AUT MAIS                                        000000");
        
        //01
        int codigoBanco = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CODIGO_BANCO).intValue();
        //02
        int codigoLote = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.CODIGO_LOTE).intValue();
        //03
        String tipoRegistro = line.getFieldValueString(LineCnabv05SegmentoEExtrato.TIPO_REGISTRO);
        //04
        int numeroRegistro = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.NUMERO_REGISTRO).intValue();
        //05
        String codigoSegmento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.CODIGO_SEGMENTO);
        //06
        int identificacaoTipoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.IDENTIFICACAO_TIPO_LANCAMENTO).intValue();
        //07
        String brancos = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS);
        //08
        String tipoInscricaoCliente = line.getFieldValueString(LineCnabv05SegmentoEExtrato.TIPO_INSCRICAO);
        //09
        int numeroInscricao = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.NUMERO_INSCRICAO).intValue();
        //10
        String brancos2 = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS2);
        //11
        String convenio = line.getFieldValueString(LineCnabv05SegmentoEExtrato.CONVENIO);
        //12
        int zeros = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.ZEROS).intValue();
        //13
        int agenciaMantenedora = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.AGENCIA_MANTENEDORA).intValue();
        //14
        String digitoVerificadorAgencia = line.getFieldValueString(LineCnabv05SegmentoEExtrato.DIGITO_VER_AGENCIA);
        //15
        int zeros2 = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.ZEROS2).intValue();
        //16
        int numeroContaCorrente = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.NUMERO_CONTA_CORRENTE).intValue();
        //17
        String brancos3 = line.getFieldValueString(LineCnabv05SegmentoEExtrato.BRANCOS3);
        //18
        String digitoVerificadosAgConta = line.getFieldValueString(LineCnabv05SegmentoEExtrato.DIGITO_VER_AG_CONTA);
        //19
        String nomeEmpresa = line.getFieldValueString(LineCnabv05SegmentoEExtrato.NOME_EMPRESA);
        //20
        String reservadoUsoBranco = line.getFieldValueString(LineCnabv05SegmentoEExtrato.RESERVADO_USO_BANCO);
        //21
        String naturezaLancamento = line.getFieldValueString(LineCnabv05SegmentoEExtrato.NATUREZA_LANCAMENTO);
        //22
        int tipoComplementoLancamento = line.getFieldValueNumber(LineCnabv05SegmentoEExtrato.TIPO_COMPLEMENTO).intValue();
        //23
        //24
        //25
        //26
        //27
        //28
        //29
        //30
        //31
        //32
        //33
        //34
        //35
        //36
        //37
        //38
        //39
        //40
        //41
    }
}
