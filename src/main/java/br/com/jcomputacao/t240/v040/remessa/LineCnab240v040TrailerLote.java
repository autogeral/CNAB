package br.com.jcomputacao.t240.v040.remessa;

import br.com.jcomputacao.aristoteles.field.FieldFillerArchetype;
import br.com.jcomputacao.cnab.t240.LineCnab240TrailerLoteCobranca;

/**
 *
 * @author Jennifer
 */
public class LineCnab240v040TrailerLote extends LineCnab240TrailerLoteCobranca {

    public static final String RESERVADO_USO_BANCO = "RESERVADO_USO_BANCO";

    public LineCnab240v040TrailerLote() {
        setName("CNAB - Lote Trailer - v040 - Remessa");
        removeFieldArchetype(QTDE_TITULOS_COBRANCA_SIMPLES);
        removeFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_SIMPLES);
        removeFieldArchetype(QTDE_TITULOS_COBRANCA_VINCULADA);
        removeFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_VINCULADA);
        removeFieldArchetype(QTDE_TITULOS_COBRANCA_CAUCIONADA);
        removeFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_CAUCIONADA);
        removeFieldArchetype(QTDE_TITULOS_COBRANCA_DESCONTADA);
        removeFieldArchetype(VALOR_TOTAL_TITULOS_COBRANCA_DESCONTADA);
        removeFieldArchetype(NUMERO_AVISO);
        removeFieldArchetype(EXCLUSIVO_FEBRABAN_2);
        addFieldArchetype(RESERVADO_USO_BANCO, new FieldFillerArchetype(217, ' '));
    }
}
