package View;

import Controller.DBConteudos;
import Controller.DBMateriaPeriodo;
import Controller.DBMaterias;
import Controller.DBRequisitos;
import Model.materiaRequisito;
import ViewFunctions.Infos;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author eduardo
 */
public class dialogInfos extends javax.swing.JFrame {

    private DBMaterias dbMat = new DBMaterias();
    private DBMateriaPeriodo dbMatPer = new DBMateriaPeriodo();
    private DBRequisitos dbReq = new DBRequisitos();
    private DBConteudos dbCont = new DBConteudos();
    private materiaRequisito Requisito[] = new materiaRequisito[100];

    private Infos dialog = new Infos();
    public dialogInfos(String sigla) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        SiglaDisciplina.setText("Sigla: " + sigla);
        NomeDisciplina.setText("Disciplina: " + dbMat.selectValuesWhere(sigla, "nomeMateria"));
        CreditosDisciplina.setText("Créditos: " + dbMat.selectValuesWhere(sigla, "nCreditosMateria"));
        PeriodoDisciplina.setText("Periodo: " + dbMatPer.selectValuesWhere(sigla, "Periodo_idPeriodo"));
        for (int i = 0; i < 100; i++) {
            Requisito[i] = new materiaRequisito();
        }
        dialog.changeLabel(sigla, PreReqDisciplina, CoReqDisciplina, Requisito);
        dbCont.selectConteudo(sigla, tx_Conteúdos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_dialog = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CreditosDisciplina = new javax.swing.JLabel();
        NomeDisciplina = new javax.swing.JLabel();
        SiglaDisciplina = new javax.swing.JLabel();
        PeriodoDisciplina = new javax.swing.JLabel();
        PreReqDisciplina = new javax.swing.JLabel();
        CoReqDisciplina = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tx_Conteúdos = new javax.swing.JTextArea();
        bt_concluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CreditosDisciplina.setText("Créditos:");

        NomeDisciplina.setText("Disciplina:");

        SiglaDisciplina.setText("Sigla:");

        PeriodoDisciplina.setText("Periodo:");

        PreReqDisciplina.setText("PréRequisitos:");
        PreReqDisciplina.setToolTipText("");
        PreReqDisciplina.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CoReqDisciplina.setText("CoRequisitos:");
        CoReqDisciplina.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreReqDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SiglaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(CreditosDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(PeriodoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CoReqDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreditosDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SiglaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeriodoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PreReqDisciplina)
                .addGap(26, 26, 26)
                .addComponent(CoReqDisciplina)
                .addGap(20, 20, 20))
        );

        tx_Conteúdos.setEditable(false);
        tx_Conteúdos.setColumns(20);
        tx_Conteúdos.setLineWrap(true);
        tx_Conteúdos.setRows(5);
        jScrollPane1.setViewportView(tx_Conteúdos);

        bt_concluir.setText("Concluir");
        bt_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_concluirActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conteúdos");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Matéria");

        javax.swing.GroupLayout jp_dialogLayout = new javax.swing.GroupLayout(jp_dialog);
        jp_dialog.setLayout(jp_dialogLayout);
        jp_dialogLayout.setHorizontalGroup(
            jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_dialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_dialogLayout.setVerticalGroup(
            jp_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_dialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_dialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_concluirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_concluirActionPerformed

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
            System.out.println(ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(dialogInfos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(dialogInfos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(dialogInfos.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel CoReqDisciplina;
    private javax.swing.JLabel CreditosDisciplina;
    private javax.swing.JLabel NomeDisciplina;
    private javax.swing.JLabel PeriodoDisciplina;
    private javax.swing.JLabel PreReqDisciplina;
    private javax.swing.JLabel SiglaDisciplina;
    private javax.swing.JButton bt_concluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_dialog;
    private javax.swing.JTextArea tx_Conteúdos;
    // End of variables declaration//GEN-END:variables

}
