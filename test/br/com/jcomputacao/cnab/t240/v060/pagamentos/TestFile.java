package br.com.jcomputacao.cnab.t240.v060.pagamentos;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import br.com.jcomputacao.cnab.t240.v060.LineCnab240v060ArquivoHeader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author murilodemoraestuvani
 */
public class TestFile {

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
    public void hello() {
        //File f = new File("./doc/exemplos/PB0111120047.rem");
        File dir = new File("./doc/exemplos/");
        File[] fs = dir.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return (name.toLowerCase().endsWith(".rem") || name.toLowerCase().endsWith("mov.txt"));
            }
            
        });
        for (File f : fs) {
            if (f.exists()) {
                try {
                    parseFile(f);
                } catch (IOException ex) {
                    ex.printStackTrace(System.err);
                    System.err.flush();
                } catch (ParseException ex) {
                    ex.printStackTrace(System.err);
                    System.err.flush();
                }
            } else {
                fail("Arquivo " + f.getAbsolutePath() + " nao encontrado");
            }
        }
    }

    private void parseFile(File f) throws IOException, ParseException {
        System.out.println("Parsing file : " + f.getAbsolutePath());
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String l;
        while ((l = br.readLine()) != null) {
            trataLinha(l);
        }

        br.close();
        fr.close();
    }

    private void trataLinha(String linha) throws ParseException {
        String tipoRegistroStr = linha.substring(7, 8);
        int tipoRegistro = Integer.parseInt(tipoRegistroStr);

        LineModel model;
        LineArchetype lah;
        switch (tipoRegistro) {
            case 0:
                String versao = linha.substring(163, 166);
                System.out.println("Header Arquivo versao  : " + versao);
                lah = new LineCnab240v060ArquivoHeader();
                model = lah.createModel();
                model.setRepresentation(linha);
                trataHeaderArquivo(model);
                
//                LineCnab240v060ArquivoHeader lah = new LineCnab240v060ArquivoHeader();
//                model = lah.createModel();
//                model.setRepresentation(linha);
//                trataHeaderArquivo(model);
//                this.headerArquivo = model;
                break;
            case 1:
                System.out.println("Header Lote   : ");
//                LineArchetype lote = new LineCnab240v060HeaderLote();
//                model = lote.createModel();
//                model.setRepresentation(linha);
//                this.headerLote = model;
//                trataHeaderLote();
                break;
            case 3:
                String segmento = linha.substring(13, 14);
                System.out.println("Segmento   : " + segmento);
//                if ("A".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoA();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                    segmentoA = model;
//                } else if ("B".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoB();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                    segmentoB = model;
//                    criaRepasse();
//                } else if ("G".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoG();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                } else if ("H".equals(segmento)) {
//                    System.out.println("Segmento       " + segmento + " : " + linha);
                if("J".equals(segmento)) {
                    lah = new LineCnab240v060SegmentoJ();
                    model = lah.createModel();
                    model.setRepresentation(linha);
                    trataSegmentoJ(model);
                }
//                } else if ("P".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoP();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                    if (this.segmentoP != null) {
//                        criaBoleto();
//                    }
//                    this.segmentoP = model;
//                } else if ("Q".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoQ();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                    this.segmentoQ = model;
//                } else if ("R".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoR();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                    this.segmentoR = model;
//                } else if ("S".equals(segmento)) {
//                    LineArchetype arch = new LineCnab240BBSegmentoS();
//                    model = arch.createModel();
//                    model.setRepresentation(linha);
//                    if (segmentosS == null) {
//                        segmentosS = new ArrayList<>();
//                    }
//                    segmentosS.add(model);
//                } else if ("T".equals(segmento)) {
//                    System.out.println("Segmento       " + segmento + " : " + linha);
//                    throw new UnsupportedOperationException("Implementar");
//                } else if ("U".equals(segmento)) {
//                    System.out.println("Segmento       " + segmento + " : " + linha);
//                    throw new UnsupportedOperationException("Implementar");
//                } else if ("Y".equals(segmento)) {
//                    System.out.println("Segmento       " + segmento + " : " + linha);
//                    throw new UnsupportedOperationException("Implementar");
//                } else {
//                    System.out.println("Segmento       " + segmento + " : Não identificado " + linha);
//                }
                break;
            case 5:
                System.out.println("Trailler Lote    " + linha);
                break;
            case 9:
                System.out.println("Trailler Arquivo " + linha);
//                arquivoFinalizado = true;
                break;
            default:
                System.out.println("Linha nao identificada : " + linha);
        }
    }
    
    private void trataHeaderArquivo(LineModel model) {
        System.out.println(model.getFieldValue(LineCnab240v060ArquivoHeader.NOME_EMPRESA));
        Long cnpj = model.getFieldValueNumber(LineCnab240v060ArquivoHeader.NUMERO_INSCRICAO).longValue();
        String convenio = model.getFieldValueString(LineCnab240v060ArquivoHeader.CODIGO_CONVENIO);
        int agenciaNumero = model.getFieldValueNumber(LineCnab240v060ArquivoHeader.AGENCIA_MANTENEDORA).intValue();
        String agenciaDig = model.getFieldValueString(LineCnab240v060ArquivoHeader.DIGITO_VER_AGENCIA);
        int contaNumero = model.getFieldValueNumber(LineCnab240v060ArquivoHeader.NUMERO_CONTA_COR).intValue();
        String contaDig = model.getFieldValueString(LineCnab240v060ArquivoHeader.DIGITO_VER_CONTA);
        String agContaDig = model.getFieldValueString(LineCnab240v060ArquivoHeader.DIGITO_VER_AG_CONTA);
        int remRet = model.getFieldValueNumber(LineCnab240v060ArquivoHeader.CODIGO_REM_RET).intValue();
        String verLayout = model.getFieldValueString(LineCnab240v060ArquivoHeader.VERSAO_LAYOUT);
        int sequencial = model.getFieldValueNumber(LineCnab240v060ArquivoHeader.NUM_SEQUENCIAL_ARQUIVO).intValue();
        Date geracao = model.getFieldValueDate(LineCnab240v060ArquivoHeader.DATA_GERACAO_ARQUIVO);
        Date horaGeracao = model.getFieldValueDate(LineCnab240v060ArquivoHeader.HORA_GERACAO_ARQUIVO);
        String banco = model.getFieldValueString(LineCnab240v060ArquivoHeader.NOME_BANCO);
        String emprea = model.getFieldValueString(LineCnab240v060ArquivoHeader.NOME_EMPRESA);
        System.out.println("******************************************************************************************************");
        System.out.println("CNPJ    : " + cnpj + "\tEmpresa : " + emprea + "\tBanco : " + banco + "\tArquivo Seq.: " + sequencial);
        System.out.println("Convênio: " + convenio);
        System.out.println("Agência : " + agenciaNumero + "-" + agenciaDig + "\tC/C : " + contaNumero + "-" + contaDig + "\tDig. Ag/CC  : " + agContaDig);
        System.out.println("Ret/Rem : " + (remRet == 1 ? "Remessa" : "Retorno") + "\tLayut : " + verLayout + "\tGerado em " + dateTimeForUi(geracao));
        System.out.println("******************************************************************************************************");
        System.out.flush();
    }

    private void trataHeaderLote(LineModel headerLote) {
//        if ("R".equals(creditoDebito)) {
//                        System.out.println("Versão do layout : " + headerLote.getFieldValue(LineCnab240v060HeaderLote.VERSAO_LAYOUT_LOTE));
//                        System.out.println("Mensagem 1       : " + headerLote.getFieldValue(LineCnab240v060HeaderLote.INFORMACAO_1));
//                        System.out.println("Mensagem 2       : " + headerLote.getFieldValue(LineCnab240v060HeaderLote.INFORMACAO_2));
//                        System.out.println("Data de crédito  : " + TimeUtil.getShortDateForUi(headerLote.getFieldValueDate(LineCnab240v060HeaderLote.DATA_CREDITO)));
//                        System.out.println("Data de gravação : " + TimeUtil.getShortDateForUi(headerLote.getFieldValueDate(LineCnab240v060HeaderLote.DATA_GRAVACAO_REMESSA_RETORNO)));
//        }
        
        String banco     = headerLote.getFieldValueString(LineCnab240v060HeaderLote.CODIGO_BANCO);
        Integer lote     = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.LOTE_SERVICO).intValue();
        String  tipoReg  = headerLote.getFieldValueString(LineCnab240v060HeaderLote.TIPO_REGISTRO);
        String tipoOper = headerLote.getFieldValueString(LineCnab240v060HeaderLote.TIPO_OPERACAO);
        Integer tipoServ = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.TIPO_SERVICO).intValue();
        Integer formaLanc = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.FORMA_LANCAMENTO).intValue();
        String versaoLay = headerLote.getFieldValueString(LineCnab240v060HeaderLote.VERSAO_LAYOUT_LOTE);
        Integer tipoInscricao = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.TIPO_INSCRICAO_EMPRESA).intValue();
        Long cnpj           = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.NUM_INSCRICAO_EMPRESA).longValue();
        String convenio     = headerLote.getFieldValueString(LineCnab240v060HeaderLote.CODIGO_CONVENIO);
        Integer agenciaNum  = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.AGENCIA_MANTENEDORA).intValue();
        String agenciaDig   = headerLote.getFieldValueString(LineCnab240v060HeaderLote.DIGITO_VER_AGENCIA);
        Integer contaNum    = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.NUMERO_CONTA_COR).intValue();
        String contaDig     = headerLote.getFieldValueString(LineCnab240v060HeaderLote.DIGITO_VER_CONTA);
        String agContaDig   = headerLote.getFieldValueString(LineCnab240v060HeaderLote.DIGITO_VER_AG_CONTA);
        String empresa      = headerLote.getFieldValueString(LineCnab240v060HeaderLote.NOME_EMPRESA);
        String informacao   = headerLote.getFieldValueString(LineCnab240v060HeaderLote.INFORMACAO_1);
        String logradouro   = headerLote.getFieldValueString(LineCnab240v060HeaderLote.LOGRADOURO);
        Integer numeroEndereco = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.NUMERO).intValue();
        String complemento = headerLote.getFieldValueString(LineCnab240v060HeaderLote.COMPLEMENTO);
        String cidade = headerLote.getFieldValueString(LineCnab240v060HeaderLote.CIDADE);
        Integer cepPrefixo    = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.CEP).intValue();
        Integer cepSufixo     = headerLote.getFieldValueNumber(LineCnab240v060HeaderLote.SUFIXO_CEP).intValue();
        String estado = headerLote.getFieldValueString(LineCnab240v060HeaderLote.ESTADO);
        String ocorrencias    = headerLote.getFieldValueString(LineCnab240v060HeaderLote.OCORRENCIAS);
        
        System.out.println("******************************************************************************************************");
        System.out.println("CNPJ          : " + cnpj + "\tEmpresa : " + empresa + "\tBanco : " + banco + "\tArquivo Seq.: " + ocorrencias);
        System.out.println("Convênio      : " + convenio + "\tLote : " + lote);
        System.out.println("Tipo de regist:" + tipoReg + "\tTipo de operação : " + tipoOper + "\tTipo de Serviço : " + tipoServ);
        System.out.println("Forma de lanç :  " + formaLanc);
        System.out.println("Agência       : " + agenciaNum + "-" + agenciaDig + "\tC/C : " + contaNum + "-" + contaDig + "\tDig. Ag/CC  : " + agContaDig);
        System.out.println("Endereço      : " + logradouro + " Nº " + numeroEndereco + " Complemento : " + complemento + " Cidade : " + cidade + "/" + estado + " CEP : " + cepPrefixo + "-" + cepSufixo);
        System.out.println("Informações   : " + informacao + "\t\tLayout : " + versaoLay);
        System.out.println("******************************************************************************************************");
        System.out.flush();
//        trataContaCorrenteLote();
    }

    private void trataSegmentoJ(LineModel model) {
        int sequencial = model.getFieldValueNumber(LineCnab240v060SegmentoJ.SEQUENCIAL_REGISTRO).intValue();
        int tipoMovimento = model.getFieldValueNumber(LineCnab240v060SegmentoJ.TIPO_MOVIMENTO).intValue();
        int codigoMovimento = model.getFieldValueNumber(LineCnab240v060SegmentoJ.CODIGO_MOVIMENTO).intValue();
        String codigoBarras = model.getFieldValueString(LineCnab240v060SegmentoJ.CODIGO_BARRAS);
        String nomeCedente = model.getFieldValueString(LineCnab240v060SegmentoJ.NOME_CEDENTE);
        Date dataVencimento = model.getFieldValueDate(LineCnab240v060SegmentoJ.DATA_VENCIMENTO);
        double valorTitulo = model.getFieldValueNumber(LineCnab240v060SegmentoJ.VALOR_TITULO).doubleValue();
        double desconto = model.getFieldValueNumber(LineCnab240v060SegmentoJ.DESCONTO).doubleValue();
        double acrescimos = model.getFieldValueNumber(LineCnab240v060SegmentoJ.ACRESCIMOS).doubleValue();
        Date dataPgto = model.getFieldValueDate(LineCnab240v060SegmentoJ.DATA_PAGAMENTO);
        double valorPgto = model.getFieldValueNumber(LineCnab240v060SegmentoJ.VALOR_PAGAMENTO).doubleValue();
        double quantidadeMoeda = model.getFieldValueNumber(LineCnab240v060SegmentoJ.QUANTIDADE_MOEDA).doubleValue();
        String refernciaSacado = model.getFieldValueString(LineCnab240v060SegmentoJ.REFERENCIA_SACADO);
        String nossoNumero = model.getFieldValueString(LineCnab240v060SegmentoJ.NOSSO_NUMERO);
        System.out.println("Segemnto J : "+sequencial+
                " Valor : " + valorTitulo + " Valor Pago : " + valorPgto + " Desconto : " + desconto + " Acrescimos : " + acrescimos +
                " Data Pgto : " + dateTimeForUi(dataPgto) + " Data Vcto : " + dateTimeForUi(dataVencimento) +
                " Nosso numero : "+nossoNumero + " Tipo movimento : "+tipoMovimento+" Codigo Movimento "+codigoMovimento +
                " Codigo barras : "+codigoBarras+ " qtdMoeda : "+quantidadeMoeda+" refSacado : "+refernciaSacado +
                " Nome do cedente : "+nomeCedente);
    }

    private String dateTimeForUi(Date geracao) {
        Locale l = Locale.getDefault();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, l);
        return df.format(geracao);
    }
}
