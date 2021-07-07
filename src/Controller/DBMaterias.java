package Controller;

import Model.materia;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class DBMaterias {

    static Statement stmt;
    static Connection con;
    static ResultSet dbSelectAllMat;

    private DBRequisitos dbReq = new DBRequisitos();
    private DBMateriaPeriodo dbMatPer = new DBMateriaPeriodo();
    private DBConteudos dbConteudos = new DBConteudos();

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // INSERT MATERIA
    public void insertMateria(materia newMateria) throws SQLException {
        String query = "insert into Materias(siglaMateria,nomeMateria,nCreditosMateria,concluido,bloqueado) values (?,?,?,0,?)";
        try {
            setConfigMat();
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, newMateria.getSigla());
            stmt.setString(2, newMateria.getNomeMateria());
            stmt.setString(3, String.valueOf(newMateria.getnCreditosMateria()));
            stmt.setString(4, String.valueOf(newMateria.getBloqueado()));

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
            setConfigMat();
            while (dbSelectAllMat.next()) {
                System.out.println(dbSelectAllMat.getString(1) + "  " + dbSelectAllMat.getString(2) + "  " + dbSelectAllMat.getString(3) + "  " + dbSelectAllMat.getString(4) + "  " + dbSelectAllMat.getString(5));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectToClass(materia[] Materia) {
        try {
            setConfigMat();
            int i = 0;
            while (dbSelectAllMat.next()) {
                Materia[i].setSigla(dbSelectAllMat.getString(1));
                Materia[i].setNomeMateria(dbSelectAllMat.getString(2));
                Materia[i].setnCreditosMateria(Integer.parseInt(dbSelectAllMat.getString(3)));
                Materia[i].setConcluido(Boolean.parseBoolean(dbSelectAllMat.getString(4)));
                Materia[i].setBloqueado(Integer.parseInt(dbSelectAllMat.getString(5)));
                i++;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectValuesSigla(DefaultTableModel model) {
        model.setRowCount(0);
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                model.addRow(new Object[]{
                    dbSelectAllMat.getString("siglaMateria")
                });
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String SelectValueSelected(String materia) {
        String nameMateria = null;
        String sigla;
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                sigla = dbSelectAllMat.getString("siglaMateria") + " - " + dbSelectAllMat.getString("nCreditosMateria");
                if (sigla.equals(materia)) {
                    nameMateria = dbSelectAllMat.getString("siglaMateria");
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nameMateria;
    }
    
    public String SelectBoolean(String materia) {
        String nameMateria = null;
        String sigla;
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                sigla = dbSelectAllMat.getString("siglaMateria");
                if (sigla.equals(materia)) {
                    nameMateria = dbSelectAllMat.getString("siglaMateria");
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nameMateria;
    }

    public materia SelectInfos(String sigla) {
        materia materia = new materia();
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                if (sigla.equals(dbSelectAllMat.getString("siglaMateria"))) {
                    materia.setNomeMateria(dbSelectAllMat.getString("nomeMateria"));
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materia;
    }

    public String selectValuesWhere(String sigla, String where) {
        String whaat = null;
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                if (sigla.equals(dbSelectAllMat.getString("siglaMateria"))) {
                    whaat = dbSelectAllMat.getString(where);
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return whaat;
    }
    
    // UPDATE BLOQUEADO
    public void updateBloqueado(String sigla) {
        try {
            setConfigMat();
            PreparedStatement stmt = con.prepareStatement("update Materias set bloqueado=0 where siglaMateria=" + sigla);
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // UPDATE CONCLUIDO
    public void updateConcluidoTrue(String sigla) {
        try {
            setConfigMat();
            PreparedStatement stmt = con.prepareStatement("update Materias set concluido=1 where siglaMateria='" + sigla + "'");
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateConcluidoFalse(String sigla) {
        try {
            setConfigMat();
            PreparedStatement stmt = con.prepareStatement("update Materias set concluido=0 where siglaMateria='" + sigla + "'");
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // DELETE MATERIA
    public void deleteMateria(String materia) {
        dbReq.deleteMateria(materia);
        dbMatPer.deleteMateria(materia);
        dbConteudos.deleteConteudos(materia);
        try {
            setConfigMat();
            PreparedStatement stmt = con.prepareStatement("delete from Materias where siglaMateria='" + materia + "'");
            stmt.execute();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBPeriodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setConfigMat() throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            stmt = con.createStatement();
            dbSelectAllMat = stmt.executeQuery("select * from Materias");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Driver Mysql não encontrado");
        }
    }
}
