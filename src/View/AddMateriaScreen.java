package View;

import Model.Erros;
import Controller.DBConteudos;
import Controller.DBReset;
import ViewFunctions.AddMateria;
import Model.materiaRequisito;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class AddMateriaScreen extends javax.swing.JInternalFrame {

    private DefaultListModel listPre = new DefaultListModel();
    private DefaultListModel listCo = new DefaultListModel();
    private materiaRequisito req = new materiaRequisito();
    private AddMateria addMat = new AddMateria(listPre, listCo, req);
    private dialogReq newReq = new dialogReq(this, listPre, listCo);

    private JComboBox<String> jc_Materias = newReq.getJc_Materias();
    private Erros error = new Erros();

    private DBReset reset = new DBReset();
    private DBConteudos dbConteudos = new DBConteudos();

    public AddMateriaScreen() {
        initComponents();
        ls_AddMatPreReq.setModel(listPre);
        ls_AddMatCoReq.setModel(listCo);
        newReq.startJC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_addMateria = new javax.swing.JPanel();
        tl_addMatPreReq = new javax.swing.JLabel();
        tl_addMatNomeMat = new javax.swing.JLabel();
        tx_nomeMat = new javax.swing.JTextField();
        tl_addMatSigla = new javax.swing.JLabel();
        tx_addSigla = new javax.swing.JTextField();
        tx_nCred = new javax.swing.JTextField();
        tl_addMatCred = new javax.swing.JLabel();
        tl_addMatPeriodo = new javax.swing.JLabel();
        sd_addPeriodo = new javax.swing.JSpinner();
        bt_addRequisito = new javax.swing.JButton();
        bt_removeCor = new javax.swing.JButton();
        bt_addMateria = new javax.swing.JButton();
        bt_cancelarMateria = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        ls_AddMatCoReq = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        ls_AddMatPreReq = new javax.swing.JList<>();
        tl_addMatPreReq1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuItemConcluido = new javax.swing.JMenuItem();
        menuItemRemoveAll = new javax.swing.JMenuItem();
        menuItemResetSoftware = new javax.swing.JMenuItem();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jp_addMateria.setMaximumSize(new java.awt.Dimension(600, 600));
        jp_addMateria.setMinimumSize(new java.awt.Dimension(600, 600));
        jp_addMateria.setPreferredSize(new java.awt.Dimension(600, 600));

        tl_addMatPreReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tl_addMatPreReq.setText("Pré-requisito");

        tl_addMatNomeMat.setText("Nome da Matéria");

        tl_addMatSigla.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        tl_addMatSigla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tl_addMatSigla.setText("Sigla");

        tl_addMatCred.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        tl_addMatCred.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tl_addMatCred.setText("Créditos");

        tl_addMatPeriodo.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        tl_addMatPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tl_addMatPeriodo.setText("Período");

        sd_addPeriodo.setValue(1);

        bt_addRequisito.setText("<html> <div style='text-align: center;'>Adicionar Requisitos</div></html>");
        bt_addRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addRequisitoActionPerformed(evt);
            }
        });

        bt_removeCor.setText("Remover Req");
        bt_removeCor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_removeCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removeCorActionPerformed(evt);
            }
        });

        bt_addMateria.setText("Concluir");
        bt_addMateria.setMaximumSize(new java.awt.Dimension(75, 22));
        bt_addMateria.setMinimumSize(new java.awt.Dimension(75, 22));
        bt_addMateria.setPreferredSize(new java.awt.Dimension(145, 22));
        bt_addMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addMateriaActionPerformed(evt);
            }
        });

        bt_cancelarMateria.setText("Cancelar");
        bt_cancelarMateria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_cancelarMateria.setPreferredSize(new java.awt.Dimension(145, 22));
        bt_cancelarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarMateriaActionPerformed(evt);
            }
        });

        ls_AddMatCoReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ls_AddMatCoReqMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ls_AddMatCoReq);

        ls_AddMatPreReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ls_AddMatPreReqMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(ls_AddMatPreReq);

        tl_addMatPreReq1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tl_addMatPreReq1.setText("Co-requisito");

        javax.swing.GroupLayout jp_addMateriaLayout = new javax.swing.GroupLayout(jp_addMateria);
        jp_addMateria.setLayout(jp_addMateriaLayout);
        jp_addMateriaLayout.setHorizontalGroup(
            jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_addMateriaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_addMateriaLayout.createSequentialGroup()
                        .addComponent(tl_addMatNomeMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_nomeMat))
                    .addGroup(jp_addMateriaLayout.createSequentialGroup()
                        .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_addMateriaLayout.createSequentialGroup()
                                    .addComponent(tl_addMatSigla)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tx_addSigla))
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tl_addMatPreReq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_cancelarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jp_addMateriaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tl_addMatPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sd_addPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_removeCor, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(bt_addRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jp_addMateriaLayout.createSequentialGroup()
                                .addComponent(tl_addMatCred, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx_nCred, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tl_addMatPreReq1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_addMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jp_addMateriaLayout.setVerticalGroup(
            jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_addMateriaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_nomeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tl_addMatNomeMat))
                .addGap(13, 13, 13)
                .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_addMateriaLayout.createSequentialGroup()
                        .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_nCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tl_addMatCred, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tl_addMatPreReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_addMateriaLayout.createSequentialGroup()
                        .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_addSigla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tl_addMatSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tl_addMatPreReq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_addMateriaLayout.createSequentialGroup()
                                .addComponent(bt_addRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_removeCor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210)))))
                .addGap(29, 29, 29)
                .addGroup(jp_addMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sd_addPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tl_addMatPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_addMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jMenu5.setText("Editar");

        jMenuItem1.setText("Alterar Matéria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Sets");

        menuItemConcluido.setText("Set Concluido=0");
        menuItemConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConcluidoActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemConcluido);

        menuItemRemoveAll.setText("Remover tudo");
        menuItemRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemoveAllActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemRemoveAll);

        menuItemResetSoftware.setText("Reset para Software");
        menuItemResetSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemResetSoftwareActionPerformed(evt);
            }
        });
        jMenu6.add(menuItemResetSoftware);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_addMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_addMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getParent().add(addMat.ScreenEditMateria);
        addMat.editMateria();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemResetSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemResetSoftwareActionPerformed
        try {
            reset.resetSoftware();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        backHome();
    }//GEN-LAST:event_menuItemResetSoftwareActionPerformed

    private void menuItemConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConcluidoActionPerformed
        try {
            reset.resetConcluido();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        backHome();
    }//GEN-LAST:event_menuItemConcluidoActionPerformed

    private void menuItemRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemoveAllActionPerformed
        try {
            reset.resetAll();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        backHome();
    }//GEN-LAST:event_menuItemRemoveAllActionPerformed

    private void ls_AddMatPreReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ls_AddMatPreReqMouseClicked
        ls_AddMatCoReq.clearSelection();
    }//GEN-LAST:event_ls_AddMatPreReqMouseClicked

    private void ls_AddMatCoReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ls_AddMatCoReqMouseClicked
        ls_AddMatPreReq.clearSelection();
    }//GEN-LAST:event_ls_AddMatCoReqMouseClicked

    private void bt_cancelarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarMateriaActionPerformed
        backHome();
        this.dispose();
    }//GEN-LAST:event_bt_cancelarMateriaActionPerformed

    private void bt_addMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addMateriaActionPerformed
        if (tx_addSigla.getText().isEmpty()) {
            error.errorSiglaisEmpty();
        } else if (tx_addSigla.getText().contains(" ")) {
            error.errorSiglahaveSpace();
        } else if (tx_nomeMat.getText().isEmpty()) {
            error.errorNomeisEmpty();
        } else if (tx_addSigla.getText().length() > 5) {
            error.errorSiglaisMaior();
        } else if (tx_nCred.getText().isEmpty()) {
            error.errorCredisEmpty();
        } else if (Integer.parseInt(tx_nCred.getText()) < 0) {
            error.errorCredNegativo();
        } else if (Integer.parseInt(tx_nCred.getText()) < 0) {
            error.errorCredNegativo();
        } else if (Integer.parseInt(sd_addPeriodo.getValue().toString()) < 1) {
            error.errorPeriodoNegativo();
        } else {
            addMat.addMateria(tx_addSigla, tx_nomeMat, sd_addPeriodo, tx_nCred, ls_AddMatPreReq, ls_AddMatCoReq);
            ConteudosAddMatScreen newAbout = new ConteudosAddMatScreen(tx_nomeMat.getText(), tx_addSigla.getText(), tx_nCred.getText());
            getParent().add(newAbout);
            ((BasicInternalFrameUI) newAbout.getUI()).setNorthPane(null);
            newAbout.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            newAbout.setVisible(true);
        }
    }//GEN-LAST:event_bt_addMateriaActionPerformed

    private void bt_removeCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeCorActionPerformed
         if (!ls_AddMatPreReq.isSelectionEmpty()) {
            addMat.removeReq(ls_AddMatPreReq, jc_Materias,"Pre");
        } else if (!ls_AddMatCoReq.isSelectionEmpty()) {
            addMat.removeReq(ls_AddMatCoReq, jc_Materias,"Co");
        }
    }//GEN-LAST:event_bt_removeCorActionPerformed

    private void bt_addRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addRequisitoActionPerformed
        newReq.setVisible(true);
        if (jc_Materias.getItemCount() == 0) {
            jc_Materias.setSelectedIndex(-1);
        } else {
            jc_Materias.setSelectedIndex(0);
        }
    }//GEN-LAST:event_bt_addRequisitoActionPerformed

    private void backHome() {
        HomeScreen screenHome = new HomeScreen();
        getParent().add(screenHome);
        ((BasicInternalFrameUI) screenHome.getUI()).setNorthPane(null);
        screenHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        screenHome.setVisible(true);
    }

    public DefaultListModel getListPre() {
        return listPre;
    }

    public DefaultListModel getListCo() {
        return listCo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addMateria;
    private javax.swing.JButton bt_addRequisito;
    private javax.swing.JButton bt_cancelarMateria;
    private javax.swing.JButton bt_removeCor;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jp_addMateria;
    private javax.swing.JList<String> ls_AddMatCoReq;
    private javax.swing.JList<String> ls_AddMatPreReq;
    private javax.swing.JMenuItem menuItemConcluido;
    private javax.swing.JMenuItem menuItemRemoveAll;
    private javax.swing.JMenuItem menuItemResetSoftware;
    private javax.swing.JSpinner sd_addPeriodo;
    private javax.swing.JLabel tl_addMatCred;
    private javax.swing.JLabel tl_addMatNomeMat;
    private javax.swing.JLabel tl_addMatPeriodo;
    private javax.swing.JLabel tl_addMatPreReq;
    private javax.swing.JLabel tl_addMatPreReq1;
    private javax.swing.JLabel tl_addMatSigla;
    private javax.swing.JTextField tx_addSigla;
    private javax.swing.JTextField tx_nCred;
    public javax.swing.JTextField tx_nomeMat;
    // End of variables declaration//GEN-END:variables
}
