package Model;

import View.AddMateriaScreen;
import Controller.DBMateriaPeriodo;
import Controller.DBMaterias;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class RefreshTable {

    private DBMaterias db = new DBMaterias();
    private DBMateriaPeriodo dbMatPer = new DBMateriaPeriodo();

    private DefaultTableModel dtmMaterias;
    private DefaultTableModel dtmPeriodos;
    private JTable listMaterias;
    private JTable listPeriodos;
    private AddMateriaScreen addMat;

    public RefreshTable(DefaultTableModel dtmMaterias, JTable listMaterias, JTable listPeriodos) {
        this.dtmMaterias = dtmMaterias;
        this.listMaterias = listMaterias;
        this.listPeriodos = listPeriodos;
    }

    public RefreshTable(AddMateriaScreen addMat) {
        this.addMat = addMat;
    }

    public void preReq(String materia) {
        addMat.getListPre().addElement(materia);
    }

    public void coReq(String materia) {
        addMat.getListCo().addElement(materia);
    }

    public void UpdateTableMateria() {
        dtmMaterias = (DefaultTableModel) listMaterias.getModel();
        db.selectValuesSigla(dtmMaterias);
    }

    public void UpdateTablePeriodos() {
        dtmPeriodos = (DefaultTableModel) listPeriodos.getModel();
        dbMatPer.selectValuesSigla(dtmPeriodos);
    }
}
