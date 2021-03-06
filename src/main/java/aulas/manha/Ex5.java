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
         * String motivo = getCampoRetorno("xMotivo", 1997 ,getLeituraNota());
         * motivo -> 'Autorizado o uso da NF-e'
         *
         *
         */
    }

    public static String getLeituraNota() {
        return "OK: C:\\ACBrMonitorPLUS\\Logs\\41191167037325000110550010000376931592080424-nfe.xml\r\n"
                + "Lote recebido com sucesso\r\n"
                + "[Envio]\r\n"
                + "CStat=103\r\n"
                + "CUF=41\r\n"
                + "DhRecbto=21/11/2019 09:43:50\r\n"
                + "Msg=Lote recebido com sucesso\r\n"
                + "NRec=411001330251896\r\n"
                + "TMed=1\r\n"
                + "VerAplic=PR-v4_5_3\r\n"
                + "Versao=4.00\r\n"
                + "XMotivo=Lote recebido com sucesso\r\n"
                + "tpAmb=1\r\n"
                + "\r\n"
                + "Autorizado o uso da NF-e\r\n"
                + "[Retorno]\r\n"
                + "CStat=104\r\n"
                + "CUF=41\r\n"
                + "ChaveDFe=41191167037325000110550010000376931592080424\r\n"
                + "Msg=Autorizado o uso da NF-e\r\n"
                + "Protocolo=141190211722366\r\n"
                + "VerAplic=PR-v4_5_3\r\n"
                + "Versao=4.00\r\n"
                + "XMotivo=Lote processado\r\n"
                + "cMsg=0\r\n"
                + "nRec=411001330251896\r\n"
                + "tpAmb=1\r\n"
                + "xMsg=\r\n"
                + "\r\n"
                + "[NFe37693]\r\n"
                + "Id=\r\n"
                + "XML=<protNFe versao='4.00'><infProt><tpAmb>1</tpAmb><verAplic>PR-v4_5_3</verAplic><chNFe>41191167037325000110550010000376931592080424</chNFe><dhRecbto>2019-11-21T09:43:50-03:00</dhRecbto><nProt>141190211722366</nProt><digVal>+hNSpv3fuKluF/QvI4kd5TwIZ5U=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe>\r\n"
                + "cStat=100\r\n"
                + "chNFe=41191167037325000110550010000376931592080424\r\n"
                + "dhRecbto=21/11/2019 09:43:50\r\n"
                + "digVal=+hNSpv3fuKluF/QvI4kd5TwIZ5U=\r\n"
                + "nProt=141190211722366\r\n"
                + "tpAmb=1\r\n"
                + "verAplic=PR-v4_5_3\r\n"
                + "xMotivo=Autorizado o uso da NF-e\r\n"
                + "\r\n"
                + "[NFe_Arq37693]\r\n"
                + "Arquivo=C:\\ACBrMonitorPLUS\\Arqs\\67037325000110\\NFe\\201911\\NFe\\41191167037325000110550010000376931592080424-nfe.xml\r\n";
    }
}
