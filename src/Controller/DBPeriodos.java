package Controller;

import Model.periodo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class DBPeriodos {

    static Statement stmt;
    static Connection con;
    static ResultSet dbSelectAllPer;

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // INSERT PERIODO
    public void insertPeriodo(periodo per) throws SQLException {
        String query = "insert into Periodo(idPeriodo,creditosemUso,creditoPeriodo) values (?,?)";
        try {
            setConfigPer();
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, String.valueOf(per.getPeriodo()));
            stmt.setString(2, String.valueOf(per.getCreditosEmUso()));

            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    // SELECT's
    public void selectValues() {
        try {
            setConfigPer();
            while (dbSelectAllPer.next()) {
                System.out.println(dbSelectAllPer.getString(1) + "  " + dbSelectAllPer.getString(2) + "  " + dbSelectAllPer.getString(3));
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int selectCreUso(int periodo) {
        int nCred = 0;
        try {
            setConfigPer();
            dbSelectAllPer = stmt.executeQuery("select * from Periodo where idPeriodo=" + periodo);
            while (dbSelectAllPer.next()) {
                nCred = Integer.parseInt(dbSelectAllPer.getString(2));
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nCred;
    }

    // UPDATE creditosemUso
    public void updateCreditosemUso(int nCred, int periodo) {
        try {
            setConfigPer();
            PreparedStatement stmt = con.prepareStatement("update Periodo set creditosemUso=" + nCred + " where idPeriodo=" + periodo);
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // =========================================================================
    public static void setConfigPer() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        stmt = con.createStatement();
        dbSelectAllPer = stmt.executeQuery("select * from Periodo");
    }
}
