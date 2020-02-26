package com.exemplos.exemplosjava.retornonota;

import java.util.Date;

public class RetornoNota {

    private final Funcoes funcoes = new Funcoes();
    private final String separadorLinha = "\r\n";

    private final int notaFiscal;
    private final EnumTipoDocumentoFiscal tipoNota;

    private int codigoStatusRetorno;
    private String uf = "";
    private String protocolo = "";

    private String chaveNFE;
    private String chaveNFECorreta;
    private int codigoStatus;
    private String digVal = "";
    private String recibo = "";
    private String motivo = "";
    private String ambiente = "";
    private Date dataHoraRecebimento;
    private String arquivoRetorno = "";
    private String versaoAplicacao = "";

    public RetornoNota(String original, int notaFiscal, EnumTipoDocumentoFiscal tipoNota) {
        this.notaFiscal = notaFiscal;
        this.tipoNota = tipoNota;

        if (!estruturaRetorno(original)) {
            estruturaConsulta(original);
        }
    }

    private boolean estruturaConsulta(String original) {
        motivo = "";
        if (original == null || original.trim().equalsIgnoreCase("")) {
            motivo = "1. Consulta não encontrada.";
            return false;
        }

        original = original.trim();
        String originalU = original.toUpperCase();

        int index = originalU.indexOf("[CONSULTA]");

        if (index < 0) {
            motivo = "2. Consulta não encontrado.";
            return false;
        }

        int indexFim = originalU.indexOf(getSeparadorLinha() + getSeparadorLinha(), index + 1);
        String subRetorno = original.substring(index, indexFim >= originalU.length() || indexFim == -1 ? originalU.length() : indexFim);

        this.recibo = getLinha(subRetorno, "NRec");
        this.uf = getLinha(subRetorno, "CUF");
        this.codigoStatusRetorno = funcoes.strToInt(getLinha(subRetorno, "CStat"));
        this.motivo = getLinha(subRetorno, "xMotivo");
        this.chaveNFE = getLinha(subRetorno, "chNFe");
        this.protocolo = getLinha(subRetorno, "nProt");
        this.ambiente = getLinha(subRetorno, "tpAmb");
        this.dataHoraRecebimento = funcoes.stringToDateTime(getLinha(subRetorno, "dhRecbto"), "dd/MM/yyyy HH:mm:ss");
        this.versaoAplicacao = getLinha(subRetorno, "verAplic");
        this.codigoStatus = funcoes.strToInt(getLinha(subRetorno, "CStat"));
        this.protocolo = getLinha(subRetorno, "nProt");
        this.digVal = getLinha(subRetorno, "digVal");

        if (this.getAmbiente().equals("1")) {
            this.ambiente = "Produção";
        } else if (this.getAmbiente().equals("2")) {
            this.ambiente = "Homologação";
        }

        if (motivo.toLowerCase().contains("duplicidade")) {
            index = motivo.toLowerCase().indexOf("[");
            indexFim = motivo.toLowerCase().indexOf("]", index + 1);

            this.chaveNFECorreta = motivo.substring(index + 1, indexFim >= motivo.length() || indexFim == -1 ? motivo.length() : indexFim);
        }

        return true;
    }

    private boolean estruturaRetorno(String original) {
        if (original == null || original.trim().equalsIgnoreCase("")) {
            motivo = "1. Nota não encontrada.";
            return false;
        }

        original = original.trim();
        String originalU = original.toUpperCase();

        if (!originalU.contains("[" + tipoNota.name() + notaFiscal + "]")) {
            motivo = "2. Nota não encontrada.";
            return false;
        }

        int index = originalU.indexOf("[RETORNO]");

        if (index < 0) {
            motivo = "3. Retorno não encontrado.";
            return false;
        }

        int indexFim = originalU.indexOf(getSeparadorLinha() + getSeparadorLinha(), index + 1);
        String subRetorno = original.substring(index, indexFim >= originalU.length() || indexFim == -1 ? originalU.length() : indexFim);

        this.recibo = getLinha(subRetorno, "NRec");
        this.uf = getLinha(subRetorno, "CUF");
        this.codigoStatusRetorno = funcoes.strToInt(getLinha(subRetorno, "CStat"));

        index = originalU.indexOf("[" + getTipoNota().name() + getNotaFiscal() + "]");

        if (index < 0) {
            motivo = "4. Nota não encontrada.";
            return false;
        }

        indexFim = originalU.indexOf(getSeparadorLinha() + getSeparadorLinha(), index + 1);
        subRetorno = original.substring(index, indexFim >= originalU.length() || indexFim == -1 ? originalU.length() : indexFim);

        this.motivo = getLinha(subRetorno, "xMotivo");
        this.chaveNFE = getLinha(subRetorno, "chNFe");
        this.protocolo = getLinha(subRetorno, "nProt");
        this.ambiente = getLinha(subRetorno, "tpAmb");
        this.dataHoraRecebimento = funcoes.stringToDateTime(getLinha(subRetorno, "dhRecbto"), "dd/MM/yyyy HH:mm:ss");
        this.versaoAplicacao = getLinha(subRetorno, "verAplic");
        this.codigoStatus = funcoes.strToInt(getLinha(subRetorno, "CStat"));
        this.protocolo = getLinha(subRetorno, "nProt");
        this.digVal = getLinha(subRetorno, "digVal");

        if (this.getAmbiente().equals("1")) {
            this.ambiente = "Produção";
        } else if (this.getAmbiente().equals("2")) {
            this.ambiente = "Homologação";
        }

        if (motivo.toLowerCase().contains("duplicidade")) {
            index = motivo.toLowerCase().indexOf("[");
            indexFim = motivo.toLowerCase().indexOf("]", index + 1);

            this.chaveNFECorreta = motivo.substring(index + 1, indexFim >= motivo.length() || indexFim == -1 ? motivo.length() : indexFim);
        }

        index = originalU.indexOf("[" + getTipoNota().name() + "_ARQ" + getNotaFiscal() + "]");

        if (index < 0) {
            if (motivo.isEmpty()) {
                motivo = "4. Arquivo não encontrado.";
            }
            return false;
        }
        indexFim = originalU.indexOf(getSeparadorLinha() + getSeparadorLinha(), index + 1);
        subRetorno = original.substring(index, indexFim >= originalU.length() || indexFim == -1 ? originalU.length() : indexFim);

        this.arquivoRetorno = getLinha(subRetorno, "Arquivo");

        return true;
    }

    private String getLinha(String bloco, String chave) {
        bloco = bloco.trim();
        if (!chave.contains("=")) {
            chave += "=";
        }

        int index = bloco.toUpperCase().indexOf(chave.trim().toUpperCase());

        if (index == -1) {
            return "";
        }
        int indexFim = bloco.toUpperCase().indexOf(getSeparadorLinha(), index);
        return bloco.substring(index + chave.length(), indexFim >= bloco.length() || indexFim == -1 ? bloco.length() : indexFim);
    }

    @Override
    public boolean equals(Object obj) {
        return ((obj instanceof RetornoNota) && ((RetornoNota) obj).getNotaFiscal() == getNotaFiscal());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.getNotaFiscal();
        return hash;
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public EnumTipoDocumentoFiscal getTipoNota() {
        return tipoNota;
    }

    public String getArquivoRetorno() {
        return arquivoRetorno;
    }

    public String getMotivo() {
        return motivo;
    }

    public boolean isAutorizado() {
        return this.getMotivo().toLowerCase().contains("autorizado o uso da");
    }

    public String getChaveNFE() {
        return chaveNFE;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public Date getDataHoraRecebimento() {
        return dataHoraRecebimento;
    }

    public String getSeparadorLinha() {
        return separadorLinha;
    }

    public String getVersaoAplicacao() {
        return versaoAplicacao;
    }

    public int getCodigoStatus() {
        return codigoStatus;
    }

    public String getDigVal() {
        return digVal;
    }

    public String getRecibo() {
        return recibo;
    }

    public String getUf() {
        return uf;
    }

    public int getCodigoStatusRetorno() {
        return codigoStatusRetorno;
    }

    public String getChaveNFECorreta() {
        return chaveNFECorreta;
    }
}
