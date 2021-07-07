package View;

import Model.Erros;
import ViewFunctions.AddPeriodo;
import Model.materiaRequisito;
import Model.materia;
import Model.periodo;
import Controller.DBMateriaPeriodo;
import Controller.DBMaterias;
import Controller.DBPeriodos;
import Controller.DBReset;
import Controller.componentsManipulations;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author eduardo
 */
public class AddPeriodoScreen extends javax.swing.JInternalFrame {

    private DBMaterias dbMat;
    private DBPeriodos dbPer;
    private DBMateriaPeriodo dbMatPer;
    private componentsManipulations mnComp;
    private DefaultListModel listModel;
    private DefaultListModel listModelSelect;
    private periodo per = new periodo();
    private AddPeriodo addPer = new AddPeriodo();
    private materia Materia[] = new materia[100];
    private materiaRequisito Requisito[] = new materiaRequisito[100];
    private DBReset reset = new DBReset();
    private Erros error = new Erros();

    public AddPeriodoScreen() {
        this.listModelSelect = new DefaultListModel();
        this.listModel = new DefaultListModel();
        this.mnComp = new componentsManipulations();
        this.dbMat = new DBMaterias();
        this.dbPer = new DBPeriodos();
        this.dbMatPer = new DBMateriaPeriodo();
        initComponents();

        for (int i = 0; i < 100; i++) {
            Materia[i] = new materia();
            Requisito[i] = new materiaRequisito();
        }
        dbMat.selectToClass(Materia);
        per.setPeriodo(10);
        periodo.setValue(dbMatPer.selectMaximum() + 1);
        mnComp.insertValuetoList(JList_disponiveis, listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jp_addPer = new javax.swing.JPanel();
        bt_perCancelar = new javax.swing.JButton();
        bt_perConcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jl_SiglaNome = new javax.swing.JLabel();
        jl_Creditos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_pre = new javax.swing.JLabel();
        jLabel_co = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JList_Selecionados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        JList_disponiveis = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel_nSelecionadas = new javax.swing.JLabel();
        jLabel_nDisponiveis = new javax.swing.JLabel();
        nCredSelecionados = new javax.swing.JLabel();
        nCredDisponiveis = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        periodo = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuItemConcluido = new javax.swing.JMenuItem();
        menuItemRemoveAll = new javax.swing.JMenuItem();
        menuItemResetSoftware = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jp_addPer.setMaximumSize(new java.awt.Dimension(600, 600));
        jp_addPer.setMinimumSize(new java.awt.Dimension(600, 600));

        bt_perCancelar.setText("Cancelar");
        bt_perCancelar.setPreferredSize(new java.awt.Dimension(145, 22));
        bt_perCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_perCancelarActionPerformed(evt);
            }
        });

        bt_perConcluir.setText("Concluir");
        bt_perConcluir.setPreferredSize(new java.awt.Dimension(145, 22));
        bt_perConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_perConcluirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_SiglaNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jl_Creditos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel4.setText("Sigla:");

        jLabel5.setText("Créditos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_co, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_SiglaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jl_SiglaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Creditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel_pre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_co, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        JList_Selecionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList_SelecionadosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(JList_Selecionados);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <div style='text-align: center;'>Matérias Selecionadas</div></html>");
        jLabel1.setToolTipText("");

        JList_disponiveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList_disponiveisMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(JList_disponiveis);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html> <div style='text-align: center;'>Matérias Disponíveis</div></html>");

        jLabel_nSelecionadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nSelecionadas.setText("<html> <div style='text-align: center;'>Nº Créditos Selecionados</div></html>");
        jLabel_nSelecionadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel_nDisponiveis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nDisponiveis.setText("<html> <div style='text-align: center;'>Nº de créditos disponiveis</div></html>");
        jLabel_nDisponiveis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nCredSelecionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nCredSelecionados.setText("0");

        nCredDisponiveis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nCredDisponiveis.setText("27");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nSelecionadas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nCredSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nCredDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane6)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel_nSelecionadas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nCredSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel_nDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nCredDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))))
        );

        jLabel6.setText("Período");

        javax.swing.GroupLayout jp_addPerLayout = new javax.swing.GroupLayout(jp_addPer);
        jp_addPer.setLayout(jp_addPerLayout);
        jp_addPerLayout.setHorizontalGroup(
            jp_addPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_addPerLayout.createSequentialGroup()
                .addGroup(jp_addPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_addPerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bt_perCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_perConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_addPerLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jp_addPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jp_addPerLayout.setVerticalGroup(
            jp_addPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_addPerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jp_addPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_addPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_perConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_perCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jMenu5.setText("File");

        jMenuItem1.setText("Alterar Matéria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

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

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_addPer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_addPer, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void JList_SelecionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JList_SelecionadosMouseClicked
        addPer.clickSelect(evt, JList_disponiveis, JList_Selecionados, listModel, listModelSelect, nCredSelecionados, nCredDisponiveis, jl_SiglaNome, jl_Creditos, jLabel_co, jLabel_pre, Materia, Requisito);
    }//GEN-LAST:event_JList_SelecionadosMouseClicked

    private void JList_disponiveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JList_disponiveisMouseClicked
        addPer.clickDisp(evt, JList_disponiveis, JList_Selecionados, listModel, listModelSelect, nCredSelecionados, nCredDisponiveis, jl_SiglaNome, jl_Creditos, jLabel_co, jLabel_pre, Materia, Requisito);
    }//GEN-LAST:event_JList_disponiveisMouseClicked

    private void bt_perCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_perCancelarActionPerformed
        backHome();
        this.dispose();
    }//GEN-LAST:event_bt_perCancelarActionPerformed

    private void bt_perConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_perConcluirActionPerformed
        if (Integer.parseInt(periodo.getValue().toString()) < 1) {
            error.errorPeriodoNegativo();
        } else {
            addPer.bt_concluir(nCredSelecionados, periodo, JList_Selecionados, Materia);
            backHome();
            this.dispose();
        }
    }//GEN-LAST:event_bt_perConcluirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getParent().add(addPer.ScreenEditMateria);
        addPer.editMateria();
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

    private void backHome() {
        HomeScreen screenHome = new HomeScreen();
        getParent().add(screenHome);
        ((BasicInternalFrameUI) screenHome.getUI()).setNorthPane(null);
        screenHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        screenHome.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JList_Selecionados;
    private javax.swing.JList<String> JList_disponiveis;
    private javax.swing.JButton bt_perCancelar;
    private javax.swing.JButton bt_perConcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_co;
    private javax.swing.JLabel jLabel_nDisponiveis;
    private javax.swing.JLabel jLabel_nSelecionadas;
    private javax.swing.JLabel jLabel_pre;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel jl_Creditos;
    private javax.swing.JLabel jl_SiglaNome;
    private javax.swing.JPanel jp_addPer;
    private javax.swing.JMenuItem menuItemConcluido;
    private javax.swing.JMenuItem menuItemRemoveAll;
    private javax.swing.JMenuItem menuItemResetSoftware;
    private javax.swing.JLabel nCredDisponiveis;
    private javax.swing.JLabel nCredSelecionados;
    private javax.swing.JSpinner periodo;
    // End of variables declaration//GEN-END:variables
}
