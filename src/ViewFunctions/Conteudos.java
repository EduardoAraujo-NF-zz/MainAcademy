package ViewFunctions;

import Controller.DBConteudos;
import java.sql.SQLException;
import javax.swing.JTextArea;

/**
 *
 * @author eduardo
 */
public class Conteudos {

    private DBConteudos dbConteudos = new DBConteudos();

    public void bt_concluir(String sigla, JTextArea txtConteudos1) {
        String conteudos = txtConteudos1.getText();
        for (int i = 0; i < conteudos.split("\\. ").length; i++) {
            try {
                dbConteudos.insertConteudo(sigla, conteudos.split("\\. ")[i]);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
