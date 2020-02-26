package aulas.manha;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {

    public boolean enviaEmail(List<String> para, List<String> copia, List<String> copiaOculta, String assunto, String mensagem, List<String> caminhoArquivo, List<String> nomeArquivo, String usuarioEmailAlternativo) throws Exception {

        String listaEmailsInvalidos = "";

        for (int i = 0; i < para.size(); i++) {
            String testeEmail = para.get(i);
            if (!validaEmail(testeEmail)) {
                if (listaEmailsInvalidos.length() == 0) {
                    listaEmailsInvalidos = testeEmail;
                } else {
                    listaEmailsInvalidos = ", " + testeEmail;
                }
                para.remove(i);
            }
        }

        if (copia != null) {
            for (int i = 0; i < copia.size(); i++) {
                String testeEmail = copia.get(i);
                if (!validaEmail(testeEmail)) {
                    if (listaEmailsInvalidos.length() == 0) {
                        listaEmailsInvalidos = testeEmail;
                    } else {
                        listaEmailsInvalidos = ", " + testeEmail;
                    }
                    copia.remove(i);
                }
            }
        }

        if (copiaOculta != null) {
            for (int i = 0; i < copiaOculta.size(); i++) {
                String testeEmail = copiaOculta.get(i);
                if (!validaEmail(testeEmail)) {
                    if (listaEmailsInvalidos.length() == 0) {
                        listaEmailsInvalidos = testeEmail;
                    } else {
                        listaEmailsInvalidos = ", " + testeEmail;
                    }
                    copiaOculta.remove(i);
                }
            }
        }

        return true;
    }

    public boolean validaEmail(String email) {
        boolean retornoFuncao = true;
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (!m.find()) {
            retornoFuncao = false;
        }
        return retornoFuncao;
    }

}
