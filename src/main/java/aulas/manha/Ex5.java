package aulas.manha;

public class Ex5 {

    public static void main(String[] args) {

        /**
         * 1. Criar uma função que mostre no console todas as combinacoes de
         * letras de uma palavra (Não pode mostrar combinações repetidas).
         *
         * Exemplo: Entrada - 'GOD' Saida - 'GOD','GDO','DGO','OGD','DOG','ODG'
         *
         */
        /**
         * 2. Utilizando o string de getLeituraNota(), efetuar a leitura de
         * alguns campos do bloco correspondente a nota fiscal de número 1997.
         *
         * Observações:
         *
         * • Considerar '\r\n' como separador de linha;
         *
         * • A busca pelo nome do campo deve ser case insensitive;
         *
         * • O conteúdo do campo é tudo desde o '=' até o fim da linha ( Ex:
         * '\r\n' ou fim do String);
         *
         * • As chaves devem ser buscadas somente dentro do bloco correspondente
         * ao número de nota informado (Ex: 1997);
         *
         * • O número da nota, o texto de 'leitura da nota' e a chave a ser
         * buscada devem ser parametros, ou seja, não devem ser referenciados
         * diretamente nas buscas e comparações;
         *
         * Exemplo:
         *
         * String motivo = getCampoRetorno('xMotivo', 1997 ,getLeituraNota());
         * motivo -> 'Autorizado o uso da NF-e'
         *
         *
         */
    }

    public static String getLeituraNota() {
        return "OK: C:\\ACBrMonitorPLUS\\Logs\\35191106793446000105558000000019971023130340-nfe.xml\r\n"
                + "Lote recebido com sucesso\r\n"
                + "[Envio]\r\n"
                + "CStat=103\r\n"
                + "CUF=35\r\n"
                + "DhRecbto=13/11/2019 15:52:31\r\n"
                + "Msg=Lote recebido com sucesso\r\n"
                + "NRec=351000135746159\r\n"
                + "TMed=1\r\n"
                + "VerAplic=SP_NFE_PL009_V4\r\n"
                + "Versao=4.00\r\n"
                + "XMotivo=Lote recebido com sucesso\r\n"
                + "tpAmb=2\r\n"
                + "\r\n"
                + "Autorizado o uso da NF-e\r\n"
                + "[Retorno]\r\n"
                + "CStat=104\r\n"
                + "CUF=35\r\n"
                + "ChaveDFe=35191106793446000105558000000019971023130340\r\n"
                + "Msg=Autorizado o uso da NF-e\r\n"
                + "Protocolo=135190008177625\r\n"
                + "VerAplic=SP_NFE_PL009_V4\r\n"
                + "Versao=4.00\r\n"
                + "XMotivo=Lote processado\r\n"
                + "cMsg=0\r\n"
                + "nRec=351000135746159\r\n"
                + "tpAmb=2\r\n"
                + "xMsg=\r\n"
                + "\r\n"
                + "[NFe1997]\r\n"
                + "Id=\r\n"
                + "XML=<protNFe versao=\"4.00\"><infProt><tpAmb>2</tpAmb><verAplic>SP_NFE_PL009_V4</verAplic><chNFe>35191106793446000105558000000019971023130340</chNFe><dhRecbto>2019-11-13T15:52:31-03:00</dhRecbto><nProt>135190008177625</nProt><digVal>AST0WLyBGc0H1tw+DX0RLyCp7A0=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe>\r\n"
                + "cStat=100\r\n"
                + "chNFe=35191106793446000105558000000019971023130340\r\n"
                + "dhRecbto=13/11/2019 15:52:31\r\n"
                + "digVal=AST0WLyBGc0H1tw+DX0RLyCp7A0=\r\n"
                + "nProt=135190008177625\r\n"
                + "tpAmb=2\r\n"
                + "verAplic=SP_NFE_PL009_V4\r\n"
                + "xMotivo=Autorizado o uso da NF-e\r\n"
                + "\r\n"
                + "[NFe_Arq1997]\r\n"
                + "Arquivo=C:\\ACBrMonitorPLUS\\Arqs\\06793446000105\\NFe\\201911\\NFe\\35191106793446000105558000000019971023130340-nfe.xml";
    }
}
