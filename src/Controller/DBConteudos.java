package Controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author eduardo
 */
public class DBConteudos {

    static Statement stmt;
    static Connection con;
    static ResultSet dbSelectAllCont;

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    // INSERT CONTEUDO
    public void insertConteudo(String sigla, String message) throws SQLException {
        String query = "insert into Conteudos(Materias_siglaMateria,conteudo) values (?,?)";
        try {
            setConfigCont();
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, sigla);
            stmt.setString(2, message);

            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    // SELECT's
    public void selectValues(String sigla) {
        String query = "select conteudo from Conteudos where Materias_siglaMateria='" + sigla + "'";
        try {
            setConfigCont();
            stmt = con.createStatement();
            dbSelectAllCont = stmt.executeQuery(query);
            while (dbSelectAllCont.next()) {
                System.out.println(dbSelectAllCont.getString("conteudo"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void selectConteudo(String sigla, JTextArea tx_Conteúdos) {
        String query = "select conteudo from Conteudos where Materias_siglaMateria='" + sigla + "'";
        try {
            setConfigCont();
            stmt = con.createStatement();
            dbSelectAllCont = stmt.executeQuery(query);
            while (dbSelectAllCont.next()) {
                tx_Conteúdos.setText(tx_Conteúdos.getText() + dbSelectAllCont.getString("conteudo") + '\n');
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // DELETE Conteudos
    public void deleteConteudos(String materia) {
        try {
            setConfigCont();
            PreparedStatement stmt = con.prepareStatement("delete from Conteudos where Materias_siglaMateria='" + materia + "'");
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setConfigCont() throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            stmt = con.createStatement();
            dbSelectAllCont = stmt.executeQuery("select * from Conteudos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Driver Mysql não encontrado");
        }
    }
}
