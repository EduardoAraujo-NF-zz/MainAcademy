package Controller;

import static Controller.DBMaterias.dbSelectAllMat;
import static Controller.DBMaterias.setConfigMat;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author eduardo
 */
public class componentsManipulations {

    public void insertValuetoList(JList<String> jList, DefaultListModel model) {
        jList.setModel(model);
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                if (dbSelectAllMat.getString("concluido").equals("0")) {
                    model.addElement(dbSelectAllMat.getString("siglaMateria") + " - " + dbSelectAllMat.getString("nCreditosMateria"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertValuesConcluidos(JList<String> jList, DefaultListModel model) {
        jList.setModel(model);
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                if (dbSelectAllMat.getString("concluido").equals("1")) {
                    model.addElement(dbSelectAllMat.getString("siglaMateria") + " - " + dbSelectAllMat.getString("nCreditosMateria"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertValuetoJCombo(JComboBox<String> jc_Materias) {
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                String item = dbSelectAllMat.getString("siglaMateria");
                jc_Materias.addItem(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeValuetoList(JList<String> jList_disponiveis, DefaultListModel model, String siglaCred) {
        jList_disponiveis.setModel(model);
        String sigla;
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                sigla = dbSelectAllMat.getString("siglaMateria") + " - " + dbSelectAllMat.getString("nCreditosMateria");
                if (sigla.equals(siglaCred)) {
                    model.removeElement(sigla);
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String insertValuetoListSelected(JList<String> jList_select, DefaultListModel model, String materia) {
        jList_select.setModel(model);
        String nameMateria = null;
        String sigla;
        try {
            setConfigMat();
            while (dbSelectAllMat.next()) {
                sigla = dbSelectAllMat.getString("siglaMateria") + " - " + dbSelectAllMat.getString("nCreditosMateria");
                if (sigla.equals(materia)) {
                    model.addElement(materia);
                    nameMateria = dbSelectAllMat.getString("siglaMateria");
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMaterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nameMateria;
    }
}
