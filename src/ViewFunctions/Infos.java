package ViewFunctions;

import Controller.DBMaterias;
import Controller.DBRequisitos;
import Model.materiaRequisito;
import javax.swing.JLabel;

/**
 *
 * @author eduardo
 */
public class Infos {
    private DBMaterias dbMat = new DBMaterias();
    private DBRequisitos dbReq = new DBRequisitos();
    
    public void changeLabel(String sigla, JLabel PreReqDisciplina, JLabel CoReqDisciplina, materiaRequisito requisito[]) {
        int i;
        for (i = 0; i < 99; i++) {
            if (sigla.equals(dbMat.SelectBoolean(sigla))) {
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
        if (requisito[i].getCoReq_1() != null) {
            CoReqDisciplina.setText("<html> <div>CoRequisitos: " + requisito[i].getCoReq_1());
            if (requisito[i].getCoReq_2() != null) {
                String vCo = CoReqDisciplina.getText();
                CoReqDisciplina.setText(vCo + ", " + requisito[i].getCoReq_2());
                if (requisito[i].getCoReq_3() != null) {
                    String vCo2 = CoReqDisciplina.getText();
                    CoReqDisciplina.setText(vCo2 + ", " + requisito[i].getCoReq_3());
                }
            }
            String vCo3 = CoReqDisciplina.getText();
            CoReqDisciplina.setText(vCo3 + "</div></html>");
        } else {
            CoReqDisciplina.setText("CoRequisitos: Nenhum");
        }
        
        String frase = "<html> <div>PréRequisitos: ";
        if (!(requisito[i].getPreReq1_1() == null) || !(requisito[i].getPreReq2_1() == null)) {
            PreReqDisciplina.setText(frase);
            if (!(requisito[i].getPreReq1_1() == null)) {
                String vPre1 = PreReqDisciplina.getText();
                PreReqDisciplina.setText(vPre1 + requisito[i].getPreReq1_1());
                if (!(requisito[i].getPreReq1_2() == null)) {
                    String vPre2 = PreReqDisciplina.getText();
                    PreReqDisciplina.setText(vPre2 + ", " + requisito[i].getPreReq1_2());
                    if (!(requisito[i].getPreReq1_3() == null)) {
                        String vPre3 = PreReqDisciplina.getText();
                        PreReqDisciplina.setText(vPre3 + ", " + requisito[i].getPreReq1_3());
                    }
                }
            }
            frase = PreReqDisciplina.getText();
            if (!(requisito[i].getPreReq1_1() == null) && !(requisito[i].getPreReq2_1() == null)) {
                frase = frase + ", ";
                PreReqDisciplina.setText(frase);
            }
            if (!(requisito[i].getPreReq2_1() == null)) {
                PreReqDisciplina.setText(frase + requisito[i].getPreReq2_1());
                if (!(requisito[i].getPreReq2_2() == null)) {
                    String vPre2 = PreReqDisciplina.getText();
                    PreReqDisciplina.setText(vPre2 + ", " + requisito[i].getPreReq2_2());
                    if (!(requisito[i].getPreReq2_3() == null)) {
                        String vPre3 = PreReqDisciplina.getText();
                        PreReqDisciplina.setText(vPre3 + ", " + requisito[i].getPreReq2_3());
                    }
                }
            }
            String vPre4 = PreReqDisciplina.getText();
            PreReqDisciplina.setText(vPre4 + "</div></html>");
        } else {
            PreReqDisciplina.setText("PréRequisitos: Nenhum");
        }

    }
}
