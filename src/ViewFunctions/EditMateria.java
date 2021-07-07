package ViewFunctions;

import Controller.DBMaterias;
import Controller.DBRequisitos;
import Controller.componentsManipulations;
import Model.materia;
import Model.materiaRequisito;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class EditMateria {
    private DBMaterias dbMat = new DBMaterias();
    private DBRequisitos dbReq = new DBRequisitos();


    public void JListClick(JList<String> JListClear, JList<String> JListSelecionado, JLabel nome_Materia) {
        JListClear.clearSelection();
        nome_Materia.setText(dbMat.selectValuesWhere(JListSelecionado.getSelectedValue().split(" ")[0], "nomeMateria"));
    }
    
    public void bt_remove(JList<String> JList_materias, JList<String> JList_concluidos, componentsManipulations mnComp,
            DefaultListModel lsModelMaterias, DefaultListModel lsModelConcluido){
        materia Materia = new materia();
        materiaRequisito requisito = new materiaRequisito();
        String sigla = JList_materias.getSelectedValue().split(" ")[0];
        int i;
        for (i = 0; i < 100; i++) {
            if (sigla.equals(dbMat.selectValuesWhere(sigla, "siglaMateria"))) {
                Materia.setNomeMateria(dbMat.selectValuesWhere(sigla, "nomeMateria"));
                Materia.setnCreditosMateria(Integer.parseInt(dbMat.selectValuesWhere(sigla, "nCreditosMateria")));
                Materia.setConcluido(Boolean.parseBoolean(dbMat.selectValuesWhere(sigla, "concluido")));
                requisito.setCoReq_1(dbReq.selectValuesWhere(sigla, "coReq_1"));
                requisito.setCoReq_2(dbReq.selectValuesWhere(sigla, "coReq_2"));
                requisito.setCoReq_3(dbReq.selectValuesWhere(sigla, "coReq_3"));
                requisito.setPreReq1_1(dbReq.selectValuesWhere(sigla, "pre1_1"));
                requisito.setPreReq1_2(dbReq.selectValuesWhere(sigla, "pre1_2"));
                requisito.setPreReq1_3(dbReq.selectValuesWhere(sigla, "pre1_3"));
                requisito.setPreReq2_1(dbReq.selectValuesWhere(sigla, "pre2_1"));
                requisito.setPreReq2_2(dbReq.selectValuesWhere(sigla, "pre2_2"));
                requisito.setPreReq2_3(dbReq.selectValuesWhere(sigla, "pre2_3"));
                break;
            }
        }

        Object[] options = {"Confirmar", "Cancelar"};
        String text = "Deseja remover esta matéria?"
                + "\nIsto prejudicara algumas matérias que tenham ela como Requisito";

        if (!JList_materias.isSelectionEmpty() || !JList_concluidos.isSelectionEmpty()) {
            if (JOptionPane.showOptionDialog(null, text, "Remover Matéria", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) {
                if (JList_materias.isSelectionEmpty()) {
                    dbMat.deleteMateria(JList_concluidos.getSelectedValue().split(" ")[0]);
                }
                if (JList_concluidos.isSelectionEmpty()) {
                    dbMat.deleteMateria(JList_materias.getSelectedValue().split(" ")[0]);
                }
                lsModelMaterias.removeAllElements();
                mnComp.insertValuetoList(JList_materias, lsModelMaterias);
                lsModelConcluido.removeAllElements();
                mnComp.insertValuesConcluidos(JList_concluidos, lsModelConcluido);
            }
        }
    }
    
    public void bt_setConcluido(JList<String> JList_materias, JList<String> JList_concluidos,
            DefaultListModel lsModelMaterias, DefaultListModel lsModelConcluido, componentsManipulations mnComp){
        if (JList_materias.isSelectionEmpty()) {
            dbMat.updateConcluidoFalse(JList_concluidos.getSelectedValue().split(" ")[0]);
        }

        if (JList_concluidos.isSelectionEmpty()) {
            dbMat.updateConcluidoTrue(JList_materias.getSelectedValue().split(" ")[0]);
        }

        lsModelMaterias.removeAllElements();
        mnComp.insertValuetoList(JList_materias, lsModelMaterias);
        lsModelConcluido.removeAllElements();
        mnComp.insertValuesConcluidos(JList_concluidos, lsModelConcluido);
    }
}
