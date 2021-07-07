package ViewFunctions;

import View.AddMateriaScreen;
import View.AddPeriodoScreen;
import View.EditMateriaScreen;
import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class Home {

    public AddPeriodoScreen ScreenAddPeriodo = new AddPeriodoScreen();
    public AddMateriaScreen ScreenAddMateria = new AddMateriaScreen();
    public EditMateriaScreen ScreenEditMateria = new EditMateriaScreen();
    public DefaultListModel listModel = new DefaultListModel();
    public DefaultListModel listModelSelect = new DefaultListModel();

    public void addMateria() {
        ((BasicInternalFrameUI) ScreenAddMateria.getUI()).setNorthPane(null);
        ScreenAddMateria.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ScreenAddMateria.setVisible(true);
    }

    public void addPeriodo() {
        ((BasicInternalFrameUI) ScreenAddPeriodo.getUI()).setNorthPane(null);
        ScreenAddPeriodo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ScreenAddPeriodo.setVisible(true);
    }

    public void editMateria() {
        ((BasicInternalFrameUI) ScreenEditMateria.getUI()).setNorthPane(null);
        ScreenEditMateria.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ScreenEditMateria.setVisible(true);
    }
}
