package br.com.jcomputacao.cnab.inter400;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

/**
 *
 * @author larissa.camargo
 *   04.08.21 
 */

public class Cnab400InterArquivoRetorno {
        
    public void tratarLinha(Cnab400InterLoteRetorno loteRetorno, String linha) {
        if (linha == null) {
            return;
        }
        if (linha.startsWith("0")) {
            trataHeaderRetorno(linha, loteRetorno);
        }
//      else if (linha.startsWith("1")) {
//            if (getIntegercodigoBanco() == 077) {
//                trataRegistroTipo1Retorno(linha, record);
//            }
//        }  else if(linha.startsWith("9")){
//            if(getIntegercodigoBanco() == 077){
//                trataRegistroTrailer(linha, record);
//            }
//        }
          
    }
    
    private void trataHeaderRetorno(String linha, Cnab400InterLoteRetorno loteRetorno) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroHeaderRetorno lr = new LineCnabRegistroHeaderRetorno();
       // lr = manager.load(LineCnabRegistroHeaderRetorno.class, linha);
 
//        System.out.println("\nCódigo de Registro: " + lr.getCodigoRegistro());
        lr.setCodigoRegistro("0");
//        System.out.println("Código de Retorno: " + lr.getIntegercodigoRetorno());
        lr.setStringcodigoRetorno("2");
//        System.out.println("Literal Retorno: " + lr.getStringliteralRetorno());
        lr.setStringliteralRetorno("RETORNO");
//        System.out.println("Código Serviço: " + lr.getStringCodigoServico());
        lr.setStringCodigoServico("01");
//        System.out.println("Literal Serviço: " + lr.getStringLiteralServico());
        lr.setStringLiteralServico("COBRANCA");
//        System.out.println("Campo em branco: " + lr.getBranco1());
        lr.setBranco1("");
//        System.out.println("Nome da Empresa: " + lr.getNomeEmpresa());
        lr.setNomeEmpresa("AUTO GERAL AUTOPECAS LTDA.");
//        System.out.println("Código do Banco: " + lr.getCodigoBanco());
        lr.setCodigoBanco("077");
//        System.out.println("Nome do Banco: " + lr.getNomeBanco());
        lr.setNomeBanco("INTER");
//        System.out.println("Data da Gravação: " + lr.getDataGravacao());
        lr.setDataGravacao(300721);
//        System.out.println("Campo em branco: " + lr.getBranco2());   
        lr.setBranco2("");
//        System.out.println("Sequencial Registro: " + lr.getSequencialRegistro());
        lr.setSequencialRegistro("000001");

        System.out.println("\n\nResultado: " + manager.export(lr)); 
    }

    
    private void trataRegistroTipo1Retorno(String linha, Cnab400InterLoteRetorno record) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroHeaderRetorno lr = new LineCnabRegistroHeaderRetorno();
        
//        System.out.println("\nCódigo de Registro: " + record.getStringcodigoRegistro());
//        field.setCodigoRegistro("1");
//        System.out.println("Tipo de inscrição da empresa: " + record.getStringtipoInscricao());
//        field.setTiipoInscricao("02");
//        System.out.println("Nº Inscrição da empresa: " + record.getStringnumeroInscricao());
//        field.setNumeroInscricao("");
//        System.out.println("Zeros: " + record.getStringzeros1());
//        field.setZeros1("000");
//        System.out.println("Identificação da empresa: " + record.getStringidentificacaoEmpresa());
//        field.setIdentificacaoEmpresa("1120001126152233");
//        System.out.println("NºControle participante: " + record.getStringcontroleParticipante());
//        field.setControleParticipante("");
//        System.out.println("Zeros: " + record.getStringzeros2());
//        field.setZeros2("0000000");
//        System.out.println("Identificação do título no banco: " + record.getStringnossoNumero1());
//        field.setNossoNumero1("");
//        System.out.println("Campo em branco: " + record.getStringbranco1());
//        field.setBranco1("");
//        System.out.println("Carteira: " + record.getStringcarteira());
//        field.setCarteira("112");
//        System.out.println("Identificação de ocorrência: " + record.getStringidentificacaoOcorrencia());
//        field.setIdentificacaoOcorrencia("");
//        System.out.println("Data de ocorrência: " + record.getStringdataOcorrencia());
//        field.setDataOcorrencia("020821");
//        System.out.println("Nº documento: " + record.getStringseuNumero());
//        field.setSeuNumero(""); 
//        System.out.println("Identificação do título no inter: " + record.getStringnossoNumero2());
//        field.setNossoNumero2("");
//        System.out.println("Data vencimento do título: " + record.getStringdataVencimentoTitulo());
//        field.setDataVencimentoTitulo("150821");
//        System.out.println("Valor do título: " + record.getStringvalorTitulo());
//        field.setValorTitulo(" 150,00");
//        System.out.println("Banco cobrador: " + record.getStringbancoCobrador());
//        field.setBancoCobrador("077");
//        System.out.println("Agência cobradora Registro: " + record.getStringagenciaCobradora());
//        field.setAgenciaCobradora("0001");
//        System.out.println("Espécie do título: " + record.getStringespecieTitulo());
//        field.setEspecieTitulo("99");
//        System.out.println("Campo em branco: " + record.getStringbranco2());
//        field.setBranco2("");
//        System.out.println("Valor pago: " + record.getStringvalorPago());
//        field.setValorPago("");
//        System.out.println("Data do crédito: " + record.getStringdataCredito());
//        field.setDataCredito("");
//        System.out.println("Campo em branco: " + record.getStringbranco3());
//        field.setBranco3("");
//        System.out.println("Nome do pagador: " + record.getStringnomePagador());
//        field.setNomePagador("Auto Geral AutoPecas LTDA.");
//        System.out.println("Campo em branco: " + record.getStringbranco4());
//        field.setBranco4("");
//        System.out.println("Nº inscrição´pagador: " + record.getStringinscricaoPagador());
//        field.setInscricaoPagador("");
//        System.out.println("Motivos de rejeições: " + record.getStringmotivoOcorrencia());
//        field.setMotivoOcorrencia("");
//        System.out.println("Campo em branco: " + record.getStringbranco5());
//        field.setBranco5("");
//        System.out.println("Sequencial Registro: " + record.getStringsequencialRegistro());
//        field.setSequencialRegistro("000006");
        System.out.println("Resultado: " + manager.export(lr));

    }

    private void trataRegistroTrailer(String linha, Cnab400InterLoteRetorno record) {
       FixedFormatManager manager = new FixedFormatManagerImpl();
        LineCnabRegistroHeaderRetorno lr = new LineCnabRegistroHeaderRetorno();
        
        System.out.println("\nIdentificação d Registro: " + record.getStringcodigoRegistro());
//       // field.setStringCodigoRegistro("9");
//        System.out.println("Identificação do retorno: " + record.getIntegercodigoRetorno());
//        System.out.println("Identificação tipo registro: " + record.getStringtipoRegisro());
//        System.out.println("Código do banco: " + record.getStringcodigoBanco());
//        System.out.println("Campo em branco: " + record.getStringbranco1());
//        System.out.println("Quantidade de registros no arquivo: " + record.getStringqtdRegistros1());
//        System.out.println("Campo em branco: " + record.getStringbranco2());
//        System.out.println("Quantidade de registros: " + record.getStringqtdRegistros2());
//        System.out.println("Valor dos registros: " + record.getStringvalorRegistros1());
//        System.out.println("Campo em branco: " + record.getStringbranco3());
//        System.out.println("Quantidade dos registros: " + record.getStringqtdRegistros3());   
//        System.out.println("Campo em branco: " + record.getStringbranco4());
//        System.out.println("Quantidade dos registros: " + record.getStringqtdRegistros4());
//        System.out.println("Valor dos registros: " + record.getStringvalorRegistros2());
//        System.out.println("Campo em branco: " + record.getStringbranco5());
//        System.out.println("Nºsequencial do registro: " + record.getStringsequencialRegistro());
//
       System.out.println("Resultado: " + manager.export(lr)); 

    }
}
