package com.exemplos.exemplosjava.retornonota;

/**
 *
 * @author Fabio
 */
public enum EnumTipoDocumentoFiscal {

    NFE,
    NFCE,
    CFE;

    private EnumTipoDocumentoFiscal() {
    }

    public static EnumTipoDocumentoFiscal fromString(String nota) {
        if (nota == null) {
            return NFE;
        }
        for (EnumTipoDocumentoFiscal enumNota : values()) {
            if (enumNota.name().equalsIgnoreCase(nota.trim())) {
                return enumNota;
            }
        }
        return NFE;
    }

}
