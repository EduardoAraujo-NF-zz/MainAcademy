package ViewFunctions;

import Controller.DBMateriaPeriodo;
import Controller.DBMaterias;
import Controller.DBPeriodos;
import Controller.DBRequisitos;
import Controller.componentsManipulations;
import Model.materia;
import Model.materiaRequisito;
import Model.periodo;
import View.EditMateriaScreen;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class AddPeriodo {

    private DBMaterias db = new DBMaterias();
    private DBRequisitos dbReq = new DBRequisitos();
    private DBPeriodos dbPer = new DBPeriodos();
    private DBMateriaPeriodo dbMatPer = new DBMateriaPeriodo();
    private periodo per = new periodo();
    public DefaultListModel listModel = new DefaultListModel();
    public DefaultListModel listModelSelect = new DefaultListModel();
    public EditMateriaScreen ScreenEditMateria = new EditMateriaScreen();

    private componentsManipulations mnComp = new componentsManipulations();
    private int nCredSelecionados = 0;
    private ArrayList listMat = new ArrayList();

    public void bt_concluir(JLabel nCredSelecionados,JSpinner periodo,JList<String> JList_Selecionados,materia Materia[]) {
        per.setCreditosEmUso(Integer.parseInt(nCredSelecionados.getText()));
        per.setPeriodo((int) periodo.getValue());
        dbPer.updateCreditosemUso(Integer.parseInt(nCredSelecionados.getText()), Integer.parseInt(periodo.getModel().getValue().toString()));
        updateAllPeriodos(JList_Selecionados, per.getPeriodo());
        extractJList(Materia);
    }

    private void sortJList(ArrayList<String> array, JList<String> JList) {
        for (int i = 0; i < JList.getModel().getSize(); i++) {
            array.add(JList.getModel().getElementAt(i));
        }
        Collections.sort(array);
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < array.size(); i++) {
            listModel.addElement(array.get(i));
        }
        JList.setModel(listModel);
        array.clear();
    }

    public void clickDisp(MouseEvent evt, JList<String> JList_disponiveis, JList<String> JList_selecionados, DefaultListModel listModel, DefaultListModel listModelSelect, JLabel lb_creditosSelecionados, JLabel lb_creditosDisponiveis, JLabel lb_sigla, JLabel lb_creditos, JLabel lb_materiasCoreq, JLabel lb_materiasPrereq, materia Materia[], materiaRequisito requisito[]) {
        ArrayList<String> array = new ArrayList();
        String selected = JList_disponiveis.getSelectedValue();
        String sigla = db.SelectValueSelected(selected);

        try {
            int i = setPreUnbloq(Materia, requisito, sigla);
            int nCrePrevisto = Integer.parseInt(db.selectValuesWhere(sigla, "nCreditosMateria"));
            int ncredSelecionados = nCredSelecionados + nCrePrevisto;
            String Coreq1 = requisito[i].getCoReq_1();
            String Coreq2 = requisito[i].getCoReq_2();
            String Coreq3 = requisito[i].getCoReq_3();
            if (Materia[i].getBloqueado() == 1 || Materia[i].getBloqueado() == -1) {
                if ((requisito[i].getCoReq_1() != null) && db.selectValuesWhere(Coreq1, "concluido").equals("1") && (Coreq2 == null || db.selectValuesWhere(Coreq2, "concluido").equals("1")) && (Coreq3 == null || db.selectValuesWhere(Coreq3, "concluido").equals("1"))) {
                    Materia[i].setBloqueado(0);
                    if (!listMat.contains(requisito[i].getCoReq_1())) {
                        listMat.add(requisito[i].getCoReq_1());
                    }
                } else {
                    if (Coreq1 != null) {
                        if ((listMat.contains(Coreq1) || (db.selectValuesWhere(Coreq1, "concluido").equals("1"))) && (listMat.contains(Coreq2) || (Coreq2 == null || db.selectValuesWhere(Coreq2, "concluido").equals("1"))) && (listMat.contains(Coreq3) || (Coreq3 == null || db.selectValuesWhere(Coreq3, "concluido").equals("1")))) {
                            Materia[i].setBloqueado(0);
                        }
                    }
                }
            }
            if (evt.getClickCount() == 2 && ncredSelecionados <= 27) {
                if (Materia[i].getBloqueado() == 0) {
                    mnComp.insertValuetoListSelected(JList_selecionados, listModelSelect, selected);
                    mnComp.removeValuetoList(JList_disponiveis, listModel, selected);
                    nCredSelecionados = nCredSelecionados + nCrePrevisto;
                    lb_creditosSelecionados.setText(String.valueOf(nCredSelecionados));
                    lb_creditosDisponiveis.setText(String.valueOf(27 - nCredSelecionados));
                    listMat.add(sigla);
                }
                sortJList(array, JList_disponiveis);
            }
            changeLabels(JList_disponiveis, lb_creditosSelecionados, lb_creditosDisponiveis, lb_sigla, lb_creditos, lb_materiasCoreq, lb_materiasPrereq, Materia, requisito, sigla);

        } catch (Exception e) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Esta matéria foi prejudicada por conta\n"
                    + "de uma remoção de outra matéria.\n\n"
                    + "Ela sera deletada!", "Erro de Requisito", 0);
            listModel.removeElement(selected);

            db.deleteMateria(sigla);
            mnComp.insertValuetoListSelected(JList_disponiveis, listModelSelect, selected);
            mnComp.removeValuetoList(JList_disponiveis, listModel, selected);

        }
    }

    public void clickSelect(MouseEvent evt, JList<String> JList_disponiveis, JList<String> JList_selecionados,
            DefaultListModel listModel, DefaultListModel listModelSelect, JLabel lb_creditosSelecionados,
            JLabel lb_creditosDisponiveis, JLabel lb_sigla, JLabel lb_creditos, JLabel lb_materiasCoreq,
            JLabel lb_materiasPrereq, materia Materia[], materiaRequisito requisito[]) {
        ArrayList<String> array = new ArrayList();
        listMat.add(null);
        String selected = JList_selecionados.getSelectedValue();
        String sigla = db.SelectValueSelected(selected);
        int i = 0;
        int size = JList_selecionados.getModel().getSize();
        if (!(JList_selecionados.getModel().getSize() == 0)) {
            String nome = db.selectValuesWhere(sigla, "nomeMateria");
            int nCrePrevisto = Integer.parseInt(db.selectValuesWhere(sigla, "nCreditosMateria"));
            if (evt.getClickCount() == 2) {
                nCredSelecionados = nCredSelecionados - nCrePrevisto;
                lb_creditosSelecionados.setText(String.valueOf(nCredSelecionados));
                lb_creditosDisponiveis.setText(String.valueOf(27 - nCredSelecionados));
                for (i = 0; i < 100; i++) {
                    if (sigla.equals(Materia[i].getSigla())) {
                        Materia[i].setBloqueado(Integer.parseInt(db.selectValuesWhere(sigla, "bloqueado")));
                        break;
                    }
                }
                mnComp.insertValuetoListSelected(JList_disponiveis, listModel, selected);
                mnComp.removeValuetoList(JList_selecionados, listModelSelect, selected);
                size--;
                JList_selecionados.clearSelection();
                lb_sigla.setText(sigla + " - " + nome);
                lb_creditos.setText(String.valueOf(nCrePrevisto));
                listMat.remove(sigla);
                for (int j = 0; j < size; j++) {
                    if (!listMat.contains(dbReq.selectValuesWhere(JList_selecionados.getModel().getElementAt(j).split(" ")[0], "coReq_1"))) {
                        selected = JList_selecionados.getModel().getElementAt(j);
                        sigla = db.SelectValueSelected(selected);
                        for (i = 0; i < 100; i++) {
                            if (sigla.equals(Materia[i].getSigla())) {
                                Materia[i].setBloqueado(Integer.parseInt(db.selectValuesWhere(sigla, "bloqueado")));
                                break;
                            }
                        }
                        mnComp.insertValuetoListSelected(JList_disponiveis, listModel, selected);
                        listMat.remove(JList_selecionados.getModel().getElementAt(j).split(" ")[0]);
                        mnComp.removeValuetoList(JList_selecionados, listModelSelect, selected);
                        nCrePrevisto = Integer.parseInt(db.selectValuesWhere(sigla, "nCreditosMateria"));
                        nCredSelecionados = nCredSelecionados - nCrePrevisto;
                        lb_creditosSelecionados.setText(String.valueOf(nCredSelecionados));
                        lb_creditosDisponiveis.setText(String.valueOf(27 - nCredSelecionados));
                        size--;
                        j--;
                    }
                }
                sortJList(array, JList_disponiveis);
            }
            changeLabels(JList_selecionados, lb_creditosSelecionados, lb_creditosDisponiveis, lb_sigla, lb_creditos, lb_materiasCoreq, lb_materiasPrereq, Materia, requisito, sigla);
        }
        listMat.remove(null);
    }

    private int setPreUnbloq(materia Materia[], materiaRequisito requisito[], String sigla) {
        int i;
        for (i = 0; i < 100; i++) {
            if (sigla.equals(Materia[i].getSigla())) {
                Materia[i].setNomeMateria(db.selectValuesWhere(sigla, "nomeMateria"));
                Materia[i].setnCreditosMateria(Integer.parseInt(db.selectValuesWhere(sigla, "nCreditosMateria")));
                Materia[i].setConcluido(Boolean.parseBoolean(db.selectValuesWhere(sigla, "concluido")));
                requisito[i].setCoReq_1(dbReq.selectValuesWhere(sigla, "coReq_1"));
                requisito[i].setCoReq_2(dbReq.selectValuesWhere(sigla, "coReq_2"));
                requisito[i].setCoReq_3(dbReq.selectValuesWhere(sigla, "coReq_3"));
                requisito[i].setPreReq1_1(dbReq.selectValuesWhere(sigla, "pre1_1"));
                requisito[i].setPreReq1_2(dbReq.selectValuesWhere(sigla, "pre1_2"));
                requisito[i].setPreReq1_3(dbReq.selectValuesWhere(sigla, "pre1_3"));
                requisito[i].setPreReq2_1(dbReq.selectValuesWhere(sigla, "pre2_1"));
                requisito[i].setPreReq2_2(dbReq.selectValuesWhere(sigla, "pre2_2"));
                requisito[i].setPreReq2_3(dbReq.selectValuesWhere(sigla, "pre2_3"));
                break;
            }
        }

        try {
            if (!(requisito[i].getPreReq1_1() == null && requisito[i].getPreReq2_1() == null)
                    && (requisito[i].getPreReq1_1() == null || db.selectValuesWhere(requisito[i].getPreReq1_1(), "concluido").equals("1"))
                    && (requisito[i].getPreReq1_2() == null || db.selectValuesWhere(requisito[i].getPreReq1_2(), "concluido").equals("1"))
                    && (requisito[i].getPreReq1_3() == null || db.selectValuesWhere(requisito[i].getPreReq1_3(), "concluido").equals("1"))
                    && (requisito[i].getPreReq2_1() == null || db.selectValuesWhere(requisito[i].getPreReq2_1(), "concluido").equals("1"))
                    && (requisito[i].getPreReq2_2() == null || db.selectValuesWhere(requisito[i].getPreReq2_2(), "concluido").equals("1"))
                    && (requisito[i].getPreReq2_3() == null || db.selectValuesWhere(requisito[i].getPreReq2_3(), "concluido").equals("1"))) {
                String Coreq1 = requisito[i].getCoReq_1();
                String Coreq2 = requisito[i].getCoReq_2();
                String Coreq3 = requisito[i].getCoReq_3();

                int nCoreq = 0;
                if (Coreq1 != null) {
                    nCoreq++;
                    if (Coreq2 != null) {
                        nCoreq++;
                        if (Coreq3 != null) {
                            nCoreq++;
                        }
                    }
                }
                if (nCoreq == 0) {
                    Materia[i].setBloqueado(0);
                } else {
                    Materia[i].setBloqueado(-1);
                }
            }
        } catch (Exception e) {
        }

        return i;
    }

    public void updateAllPeriodos(JList<String> JList_selecionados, int per) {
        for (int i = 0; i < JList_selecionados.getModel().getSize(); i++) {
            dbMatPer.updatePer(JList_selecionados.getModel().getElementAt(i).split(" ")[0], per);
        }
    }

    public void changeLabels(JList<String> JList, JLabel lb_creditosSelecionados, JLabel lb_creditosDisponiveis, JLabel lb_sigla,
            JLabel lb_creditos, JLabel lb_materiasCoreq, JLabel lb_materiasPrereq, materia Materia[],
            materiaRequisito requisito[], String sigla) {
        int i;
        for (i = 0; i < 100; i++) {
            if (sigla.equals(Materia[i].getSigla())) {
                Materia[i].setNomeMateria(db.selectValuesWhere(sigla, "nomeMateria"));
                Materia[i].setnCreditosMateria(Integer.parseInt(db.selectValuesWhere(sigla, "nCreditosMateria")));
                Materia[i].setConcluido(Boolean.parseBoolean(db.selectValuesWhere(sigla, "concluido")));
                requisito[i].setCoReq_1(dbReq.selectValuesWhere(sigla, "coReq_1"));
                requisito[i].setCoReq_2(dbReq.selectValuesWhere(sigla, "coReq_2"));
                requisito[i].setCoReq_3(dbReq.selectValuesWhere(sigla, "coReq_3"));
                requisito[i].setPreReq1_1(dbReq.selectValuesWhere(sigla, "pre1_1"));
                requisito[i].setPreReq1_2(dbReq.selectValuesWhere(sigla, "pre1_2"));
                requisito[i].setPreReq1_3(dbReq.selectValuesWhere(sigla, "pre1_3"));
                requisito[i].setPreReq2_1(dbReq.selectValuesWhere(sigla, "pre2_1"));
                requisito[i].setPreReq2_2(dbReq.selectValuesWhere(sigla, "pre2_2"));
                requisito[i].setPreReq2_3(dbReq.selectValuesWhere(sigla, "pre2_3"));
                break;
            }
        }
        int nCrePrevisto = Integer.parseInt(db.selectValuesWhere(sigla, "nCreditosMateria"));
        String nomePrevisto = Materia[i].getNomeMateria();
        lb_sigla.setText(sigla + " - " + nomePrevisto);
        lb_creditos.setText(String.valueOf(nCrePrevisto));
        if (!(requisito[i].getCoReq_1() == null)) {
            lb_materiasCoreq.setText("Co: " + requisito[i].getCoReq_1());
            if (!(requisito[i].getCoReq_2() == null)) {
                String vCo = lb_materiasCoreq.getText();
                lb_materiasCoreq.setText(vCo + ", " + requisito[i].getCoReq_2());
                if (!(requisito[i].getCoReq_3() == null)) {
                    String vCo2 = lb_materiasCoreq.getText();
                    lb_materiasCoreq.setText(vCo2 + ", " + requisito[i].getCoReq_3());
                }
            }
        } else {
            lb_materiasCoreq.setText("");
        }
        String frase = "Pré: ";
        if (!(requisito[i].getPreReq1_1() == null) || !(requisito[i].getPreReq2_1() == null)) {
            lb_materiasPrereq.setText(frase);
            if (!(requisito[i].getPreReq1_1() == null)) {
                String vPre1 = lb_materiasPrereq.getText();
                lb_materiasPrereq.setText(vPre1 + requisito[i].getPreReq1_1());
                if (!(requisito[i].getPreReq1_2() == null)) {
                    String vPre2 = lb_materiasPrereq.getText();
                    lb_materiasPrereq.setText(vPre2 + ", " + requisito[i].getPreReq1_2());
                    if (!(requisito[i].getPreReq1_3() == null)) {
                        String vPre3 = lb_materiasPrereq.getText();
                        lb_materiasPrereq.setText(vPre3 + ", " + requisito[i].getPreReq1_3());
                    }
                }
            }
            frase = lb_materiasPrereq.getText();
            if (!(requisito[i].getPreReq1_1() == null) && !(requisito[i].getPreReq2_1() == null)) {
                frase = frase + ", ";
                lb_materiasPrereq.setText(frase);
            }
            if (!(requisito[i].getPreReq2_1() == null)) {
                lb_materiasPrereq.setText(frase + requisito[i].getPreReq2_1());
                if (!(requisito[i].getPreReq2_2() == null)) {
                    String vPre2 = lb_materiasPrereq.getText();
                    lb_materiasPrereq.setText(vPre2 + ", " + requisito[i].getPreReq2_2());
                    if (!(requisito[i].getPreReq2_3() == null)) {
                        String vPre3 = lb_materiasPrereq.getText();
                        lb_materiasPrereq.setText(vPre3 + ", " + requisito[i].getPreReq2_3());
                    }
                }
            }
        } else {
            lb_materiasPrereq.setText("");
        }
    }

    public void extractJList(materia Materia[]) {
        listMat.remove(null);
        int size = listMat.size();
        for (int i = 0; i < size; i++) {
            db.updateConcluidoTrue(listMat.get(i).toString());
            System.out.println(listMat.get(i) + " CHANGED");
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
