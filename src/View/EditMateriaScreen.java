package View;

import Controller.DBMateriaPeriodo;
import Controller.DBMaterias;
import Controller.DBPeriodos;
import Controller.DBRequisitos;
import Controller.componentsManipulations;
import ViewFunctions.EditMateria;
import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class EditMateriaScreen extends javax.swing.JInternalFrame {

    private componentsManipulations mnComp;
    private DefaultListModel lsModelMaterias;
    private DefaultListModel lsModelConcluido;
    private DBMaterias dbMat = new DBMaterias();
    private DBPeriodos dbPer = new DBPeriodos();
    private DBMateriaPeriodo dbMatPer = new DBMateriaPeriodo();
    private DBRequisitos dbReq = new DBRequisitos();

    private EditMateria editMaterias = new EditMateria();

    public EditMateriaScreen() {
        this.mnComp = new componentsManipulations();
        this.lsModelMaterias = new DefaultListModel();
        this.lsModelConcluido = new DefaultListModel();
        this.mnComp = new componentsManipulations();
        initComponents();
        mnComp.insertValuesConcluidos(JList_concluidos, lsModelConcluido);
        mnComp.insertValuetoList(JList_materias, lsModelMaterias);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList_concluidos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JList_materias = new javax.swing.JList<>();
        bt_setConcluido = new javax.swing.JButton();
        bt_removerMateria = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        nome_Materia = new javax.swing.JLabel();

        setBorder(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matérias");

        JList_concluidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList_concluidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JList_concluidos);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Concluidas");

        JList_materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList_materiasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JList_materias);

        bt_setConcluido.setText("Mudar Concluido");
        bt_setConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_setConcluidoActionPerformed(evt);
            }
        });

        bt_removerMateria.setText("Remover Matéria");
        bt_removerMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removerMateriaActionPerformed(evt);
            }
        });

        bt_cancelar.setText("Concluir");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nome_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addComponent(bt_removerMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_setConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_setConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bt_removerMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(nome_Materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JList_materiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JList_materiasMouseClicked
        editMaterias.JListClick(JList_concluidos, JList_materias, nome_Materia);
    }//GEN-LAST:event_JList_materiasMouseClicked

    private void JList_concluidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JList_concluidosMouseClicked
        editMaterias.JListClick(JList_materias, JList_concluidos, nome_Materia);
    }//GEN-LAST:event_JList_concluidosMouseClicked

    private void bt_setConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_setConcluidoActionPerformed
        editMaterias.bt_setConcluido(JList_materias, JList_concluidos, lsModelMaterias, lsModelConcluido, mnComp);
    }//GEN-LAST:event_bt_setConcluidoActionPerformed

    private void bt_removerMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removerMateriaActionPerformed
        editMaterias.bt_remove(JList_materias, JList_concluidos, mnComp, lsModelMaterias, lsModelConcluido);
    }//GEN-LAST:event_bt_removerMateriaActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        backHome();
        this.dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void backHome() {
        HomeScreen screenHome = new HomeScreen();
        getParent().add(screenHome);
        ((BasicInternalFrameUI) screenHome.getUI()).setNorthPane(null);
        screenHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        screenHome.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JList_concluidos;
    private javax.swing.JList<String> JList_materias;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_removerMateria;
    private javax.swing.JButton bt_setConcluido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nome_Materia;
    // End of variables declaration//GEN-END:variables
}
