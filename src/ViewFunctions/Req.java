package ViewFunctions;

import Controller.DBMaterias;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author eduardo
 */
public class Req {

    private DBMaterias db = new DBMaterias();

    public DefaultListModel listPre;
    public DefaultListModel listCo;
    public String materia;
    public Req(DefaultListModel listPre, DefaultListModel listCo) {
        this.listPre = listPre;
        this.listCo = listCo;
    }

    public int concluir(JComboBox<String> jc_Materias, ButtonGroup groupButtonReq, JLabel notifySelect, JRadioButton jr_Prereq1, JRadioButton jr_Prereq2, JPanel jp_dialog) {
        int cod = jc_Materias.getSelectedIndex();
        if (groupButtonReq.getSelection() == null) {
            notifySelect.setText("<html> <div style='text-align: center;'>Selecione uma das opções</div></html>");
        } else {
            materia = jc_Materias.getSelectedItem().toString();
            if (jr_Prereq1.isSelected()) {
                listPre.addElement(materia + " - 1");
            } else if(jr_Prereq2.isSelected()){
                listPre.addElement(materia + " - 2");
            }
            else {
                listCo.addElement(materia);
            }
            jc_Materias.removeItemAt(cod);
            return 1;
        }
        return 0;
    }
}
