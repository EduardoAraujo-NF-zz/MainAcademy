package ViewFunctions;

import Controller.DBMaterias;
import Controller.DBRequisitos;
import Controller.DBMateriaPeriodo;
import Model.materia;
import Model.materiaRequisito;
import View.EditMateriaScreen;
import java.awt.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class AddMateria {

    private DBMaterias dbMat = new DBMaterias();
    private DBRequisitos dbReq = new DBRequisitos();
    private DBMateriaPeriodo dbMatPer = new DBMateriaPeriodo();

    public DefaultListModel listPre;
    public DefaultListModel listCo;
    public DefaultListModel listModel = new DefaultListModel();
    public DefaultListModel listModelSelect = new DefaultListModel();

    public EditMateriaScreen ScreenEditMateria = new EditMateriaScreen();

    public JComboBox<String> jc_Materias;
    public List preReq;
    public List coReq;
    private materiaRequisito requisitos;
    private static int nPre;
    private static int nCo;

    public AddMateria(DefaultListModel listPre, DefaultListModel listCo, materiaRequisito req) {
        this.listPre = listPre;
        this.listCo = listCo;
        this.requisitos = req;
    }

    public void removeReq(JList<String> ls_req, JComboBox<String> jc_Materias, String req) {
        int cod = ls_req.getSelectedIndex();
        String selected = ls_req.getSelectedValue();
        if (req.equals("Pre")) {
            listPre.remove(cod);
        } else if (req.equals("Co")) {
            listCo.remove(cod);
        }
        try {
            for (int i = 0; i <= jc_Materias.getItemCount(); i++) {
                if (jc_Materias.getItemCount() > 0 && selected.compareTo((String) jc_Materias.getItemAt(i)) < 0) {
                    jc_Materias.insertItemAt(selected.split(" ")[0], i);
                    break;
                } else if (jc_Materias.getItemCount() == 0) {
                    jc_Materias.addItem(selected.split(" ")[0]);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Entrou exception");
            jc_Materias.addItem(selected.split(" ")[0]);
        }
    }

    public void addMateria(JTextField tx_addSigla, JTextField tx_nomeMat, JSpinner sd_addPeriodo, JTextField tx_nCred, JList<String> ls_AddMatPreReq, JList<String> ls_AddMatCoReq) {
        int credMat;
        int periodo;
        materia Materia = new materia();
        Materia.setSigla(tx_addSigla.getText());
        Materia.setNomeMateria(tx_nomeMat.getText());
        Materia.setPeriodo((int) sd_addPeriodo.getModel().getValue());
        Materia.setnCreditosMateria(Integer.valueOf(tx_nCred.getText()));
        requisitos.setMateria(tx_addSigla.getText());
        addRequisitos(ls_AddMatPreReq, ls_AddMatCoReq);
        if (!(nPre == 0 && nCo == 0)) {
            Materia.setBloqueado(1);
        } else {
            Materia.setBloqueado(0);
        }
        credMat = Integer.valueOf(tx_nCred.getText());
        periodo = (int) sd_addPeriodo.getModel().getValue();

        try {
            dbMat.insertMateria(Materia);
            dbMatPer.insertMatPeriodo(Materia);
            dbReq.insertValuesRequisitos(requisitos);
        } catch (SQLException ex) {
            Logger.getLogger(AddMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addRequisitos(JList<String> ls_AddMatPreReq, JList<String> ls_AddMatCoReq) {
        String[] pre = new String[10];
        String[] pre1 = new String[10];
        String[] pre2 = new String[10];
        int nPre1 = 0;
        int nPre2 = 0;

        //-----PRÉ-REQUISITOS
        nPre = ls_AddMatPreReq.getModel().getSize();
        for (int i = 0; i < nPre; i++) {
            pre1[i] = null;
            pre2[i] = null;
            pre = ls_AddMatPreReq.getModel().getElementAt(i).split(" ");
            if (pre[2].equals("1")) {
                pre1[nPre1] = pre[0];
                nPre1++;
            } else {
                pre2[nPre2] = pre[0];
                nPre2++;
            }
        }

        requisitos.setPreReq1_1(pre1[0]);
        requisitos.setPreReq1_2(pre1[1]);
        requisitos.setPreReq1_3(pre1[2]);
        requisitos.setPreReq2_1(pre2[0]);
        requisitos.setPreReq2_2(pre2[1]);
        requisitos.setPreReq2_3(pre2[2]);

        //-----CO-REQUISITOS
        nCo = ls_AddMatCoReq.getModel().getSize();
        if (nCo == 1) {
            requisitos.setCoReq_1(ls_AddMatCoReq.getModel().getElementAt(0));
        }
        if (nCo == 2) {
            requisitos.setCoReq_1(ls_AddMatCoReq.getModel().getElementAt(0));
            requisitos.setCoReq_2(ls_AddMatCoReq.getModel().getElementAt(1));
        }
        if (nCo == 3) {
            requisitos.setCoReq_1(ls_AddMatCoReq.getModel().getElementAt(0));
            requisitos.setCoReq_2(ls_AddMatCoReq.getModel().getElementAt(1));
            requisitos.setCoReq_3(ls_AddMatCoReq.getModel().getElementAt(2));
        }
    }

    public void editMateria() {
        listModel.removeAllElements();
        listModelSelect.removeAllElements();
        ((BasicInternalFrameUI) ScreenEditMateria.getUI()).setNorthPane(null);
        ScreenEditMateria.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ScreenEditMateria.setVisible(true);
    }

}
