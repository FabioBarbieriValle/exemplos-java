package aulas.manha.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A7 {

    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        conexao.setBancoDados("Valle_Arossat_Teste");

        try (Connection con = conexao.getConexao(); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM CFO";
            ResultSet rs = stmt.executeQuery(SQL);

            int contador = 0;
            while (rs.next()) {
                System.out.println((++contador) + " - '" + rs.getString("codigo_fiscal_operacao").trim()
                        + "' - '" + rs.getString("Descricao").trim() + "'");

                System.out.println("Linha: " + rs.getRow());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
