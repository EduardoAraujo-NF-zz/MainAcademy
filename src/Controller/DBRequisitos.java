package Controller;

import Model.materiaRequisito;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author eduardo
 */
public class DBRequisitos {

    static Statement stmt;
    static Connection con;
    static ResultSet dbSelectAllReq;

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // INSERT REQUISITOS
    public void insertValuesRequisitos(materiaRequisito matReq) throws SQLException {
        try {
            setConfigReq();
            PreparedStatement stmt = con.prepareStatement("insert into Requisito(Materias_siglaMateria,pre1_1,pre1_2,pre1_3,pre2_1,pre2_2,pre2_3,coReq_1,coReq_2,coReq_3) values (?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, matReq.getMateria());
            stmt.setString(2, matReq.getPreReq1_1());
            stmt.setString(3, matReq.getPreReq1_2());
            stmt.setString(4, matReq.getPreReq1_3());
            stmt.setString(5, matReq.getPreReq2_1());
            stmt.setString(6, matReq.getPreReq2_2());
            stmt.setString(7, matReq.getPreReq2_3());
            stmt.setString(8, matReq.getCoReq_1());
            stmt.setString(9, matReq.getCoReq_2());
            stmt.setString(10, matReq.getCoReq_3());

            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    // SELECT
    public String selectValuesWhere(String sigla, String where) {
        String whaat = null;
        try {
            setConfigReq();
            while (dbSelectAllReq.next()) {
                if (sigla.equals(dbSelectAllReq.getString("Materias_siglaMateria"))) {
                    whaat = dbSelectAllReq.getString(where);
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return whaat;
    }
    
    // DELETE MATERIA
    public void deleteMateria(String materia){
        try {
            setConfigReq();
            PreparedStatement stmt = con.prepareStatement("delete from Requisito where Materias_siglaMateria='" + materia + "'");
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setConfigReq() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        stmt = con.createStatement();
        dbSelectAllReq = stmt.executeQuery("select * from Requisito");
    }
}
