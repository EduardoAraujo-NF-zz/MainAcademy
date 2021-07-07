package Controller;

import Model.materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class DBMateriaPeriodo {

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

    // INSERT MATERIA_PERIODO
    public void insertMatPeriodo(materia newMateria) throws SQLException {
        String query = "insert into Periodo_has_Materias(Periodo_idPeriodo,Materias_siglaMateria,periodo) values (?,?,0)";
        try {
            setConfigMatPer();
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, String.valueOf(newMateria.getPeriodo()));
            stmt.setString(2, newMateria.getSigla());

            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    // UPDATE Per
    public void updatePer(String sigla, int per) {
        String query = "update Periodo_has_Materias set periodo=" + per + " where Materias_siglaMateria='" + sigla + "'";
        try {
            setConfigMatPer();
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String selectValuesWhere(String sigla, String where) {
        String whaat = null;
        try {
            setConfigMatPer();
            while (dbSelectAllPer.next()) {
                if (sigla.equals(dbSelectAllPer.getString("Materias_siglaMateria"))) {
                    whaat = dbSelectAllPer.getString(where);
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return whaat;
    }

    // SELECT Maximum
    public int selectMaximum() {
        int periodo = 0;
        try {
            setConfigMatPer();
            dbSelectAllPer = stmt.executeQuery("SELECT MAX(periodo) AS Maximo FROM Periodo_has_Materias;");
            while (dbSelectAllPer.next()) {
                periodo = dbSelectAllPer.getInt("Maximo");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMateriaPeriodo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return periodo;
    }

    // SELECT 
    public void selectValuesSigla(DefaultTableModel model) {
        model.setColumnCount(0);

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();
        ArrayList list5 = new ArrayList();
        ArrayList list6 = new ArrayList();
        ArrayList list7 = new ArrayList();
        ArrayList list8 = new ArrayList();
        ArrayList list9 = new ArrayList();
        ArrayList list10 = new ArrayList();
        try {
            setConfigMatPer();
            while (dbSelectAllPer.next()) {
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(1))) {
                    list1.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(2))) {
                    list2.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(3))) {
                    list3.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(4))) {
                    list4.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(5))) {
                    list5.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(6))) {
                    list6.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(7))) {
                    list7.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(8))) {
                    list8.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(9))) {
                    list9.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
                if (dbSelectAllPer.getString("periodo").equals(String.valueOf(10))) {
                    list10.add(dbSelectAllPer.getString("Materias_siglaMateria"));
                }
            }
            if (!list1.isEmpty()) {
                Collections.sort(list1);
                model.addColumn("P1", list1.toArray());
            }
            if (!list2.isEmpty()) {
                Collections.sort(list2);
                model.addColumn("P2", list2.toArray());
            }
            if (!list3.isEmpty()) {
                Collections.sort(list3);
                model.addColumn("P3", list3.toArray());
            }
            if (!list4.isEmpty()) {
                Collections.sort(list4);
                model.addColumn("P4", list4.toArray());
            }
            if (!list5.isEmpty()) {
                Collections.sort(list5);
                model.addColumn("P5", list5.toArray());
            }
            if (!list6.isEmpty()) {
                Collections.sort(list6);
                model.addColumn("P6", list6.toArray());
            }
            if (!list7.isEmpty()) {
                Collections.sort(list7);
                model.addColumn("P7", list7.toArray());
            }
            if (!list8.isEmpty()) {
                Collections.sort(list8);
                model.addColumn("P8", list8.toArray());
            }
            if (!list9.isEmpty()) {
                Collections.sort(list9);
                model.addColumn("P9", list9.toArray());
            }
            if (!list10.isEmpty()) {
                Collections.sort(list10);
                model.addColumn("P10", list10.toArray());
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // DELETE MATERIA
    public void deleteMateria(String materia) {
        try {
            setConfigMatPer();
            PreparedStatement stmt = con.prepareStatement("delete from Periodo_has_Materias where Materias_siglaMateria='" + materia + "'");
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // ========================================================================
    public static void setConfigMatPer() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        stmt = con.createStatement();
        dbSelectAllPer = stmt.executeQuery("select * from Periodo_has_Materias");
    }
}
