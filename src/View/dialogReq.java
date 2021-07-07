package View;

import ViewFunctions.Req;
import Model.RefreshTable;
import Controller.componentsManipulations;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

/**
 *
 * @author eduardo
 */
public class dialogReq extends javax.swing.JFrame {

    public DefaultListModel listPre;
    public DefaultListModel listCo;
    private componentsManipulations mnComp = new componentsManipulations();
    private AddMateriaScreen addMat;
    private RefreshTable refresh;

    public dialogReq(AddMateriaScreen addMat, DefaultListModel listPre, DefaultListModel listCo) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.addMat = addMat;
        this.listPre = listPre;
        this.listCo = listCo;
        refresh = new RefreshTable(addMat);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup_req = new javax.swing.ButtonGroup();
        jp_dialog = new javax.swing.JPanel();
        notifySelect = new javax.swing.JLabel();
        bt_cancelar = new javax.swing.JButton();
        bt_concluir = new javax.swing.JButton();
        jr_Coreq = new javax.swing.JRadioButton();
        jr_Prereq1 = new javax.swing.JRadioButton();
        jc_Materias = new javax.swing.JComboBox<>();
        jr_Prereq2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        notifySelect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        bt_concluir.setText("Concluir");
        bt_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_concluirActionPerformed(evt);
            }
        });

        btGroup_req.add(jr_Coreq);
        jr_Coreq.setText("Corequisito");

        btGroup_req.add(jr_Prereq1);
        jr_Prereq1.setText("Prerequisito 1");

        btGroup_req.add(jr_Prereq2);
        jr_Prereq2.setText("Prerequisito 2");

        javax.swing.GroupLayout jp_dialogLayout = new javax.swing.GroupLayout(jp_dialog);
        jp_dialog.setLayout(jp_dialogLayout);
        jp_dialogLayout.setHorizontalGroup(
            jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dialogLayout.createSequentialGroup()
                .addGroup(jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_dialogLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_Materias, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notifySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_dialogLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jr_Coreq, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jr_Prereq1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jr_Prereq2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jp_dialogLayout.setVerticalGroup(
            jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jc_Materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jr_Prereq1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jr_Prereq2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jr_Coreq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notifySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jp_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jp_dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_concluirActionPerformed
        Req dialog = new Req(listPre, listCo);
        if (dialog.concluir(jc_Materias, btGroup_req, notifySelect, jr_Prereq1, jr_Prereq2, jp_dialog) == 1) {
            notifySelect.setText("");
            this.dispose();
        }
    }//GEN-LAST:event_bt_concluirActionPerformed

    public void startJC() {
        mnComp.insertValuetoJCombo(jc_Materias);
    }

    public JComboBox<String> getJc_Materias() {
        return jc_Materias;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroup_req;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_concluir;
    private javax.swing.JComboBox<String> jc_Materias;
    private javax.swing.JPanel jp_dialog;
    private javax.swing.JRadioButton jr_Coreq;
    private javax.swing.JRadioButton jr_Prereq1;
    private javax.swing.JRadioButton jr_Prereq2;
    private javax.swing.JLabel notifySelect;
    // End of variables declaration//GEN-END:variables

}
