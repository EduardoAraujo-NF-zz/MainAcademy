package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class Erros {
    public void errorNomeisEmpty(){
        JOptionPane.showMessageDialog(null, "Preencha o campo Nome da Matéria");
    }
    public void errorSiglaisEmpty(){
        JOptionPane.showMessageDialog(null, "Preencha o campo Sigla");
    }
    public void errorSiglahaveSpace(){
        JOptionPane.showMessageDialog(null, "Sigla não pode conter espaço");
    }
    public void errorSiglaisMaior(){
        JOptionPane.showMessageDialog(null, "A sigla deve ter no máximo 5 digitos");
    }
    public void errorCredisEmpty(){
        JOptionPane.showMessageDialog(null, "Preencha o campo Crédito");
    }
    public void errorCredNegativo(){
        JOptionPane.showMessageDialog(null, "O crédito não pode ser negativo :P");
    }
    public void errorPeriodoNegativo(){
        JOptionPane.showMessageDialog(null, "Creio que esse período não exista ;-;");
    }
}
