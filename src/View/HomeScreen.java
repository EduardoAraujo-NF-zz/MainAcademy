package View;

import ViewFunctions.Home;
import Model.RefreshTable;
import Controller.DBMaterias;
import Controller.DBPeriodos;
import Controller.DBReset;
import Model.materia;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class HomeScreen extends javax.swing.JInternalFrame {

    private DBMaterias db = new DBMaterias();
    private DBPeriodos dbPer = new DBPeriodos();
    private DBReset reset = new DBReset();
    private DefaultTableModel dtmMaterias;
    private Home home = new Home();
    private RefreshTable refresh;
    private materia materia;

    public HomeScreen() {
        initComponents();
        refresh = new RefreshTable(dtmMaterias, jTable_listMaterias, jTable_listPeriodos);
        refresh.UpdateTableMateria();
        refresh.UpdateTablePeriodos();
        jTable_listPeriodos.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jp_home = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listPeriodos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_listMaterias = new javax.swing.JTable();
        bt_addMateria = new javax.swing.JButton();
        bt_addPeriodo = new javax.swing.JButton();
        infoMateria = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemConcluido = new javax.swing.JMenuItem();
        menuItemRemoveAll = new javax.swing.JMenuItem();
        menuItemResetSoftware = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jp_home.setMaximumSize(new java.awt.Dimension(600, 600));
        jp_home.setMinimumSize(new java.awt.Dimension(600, 600));
        jp_home.setPreferredSize(new java.awt.Dimension(600, 600));

        jTable_listPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_listPeriodos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable_listPeriodos.setCellSelectionEnabled(true);
        jTable_listPeriodos.setRowHeight(40);
        jTable_listPeriodos.setShowGrid(true);
        jTable_listPeriodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_listPeriodosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_listPeriodos);

        jTable_listMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matérias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_listMaterias.setRowHeight(25);
        jTable_listMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_listMateriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_listMaterias);

        bt_addMateria.setText("Adicionar Matéria");
        bt_addMateria.setPreferredSize(new java.awt.Dimension(145, 22));
        bt_addMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addMateriaActionPerformed(evt);
            }
        });

        bt_addPeriodo.setText("Adicionar Período");
        bt_addPeriodo.setPreferredSize(new java.awt.Dimension(145, 22));
        bt_addPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addPeriodoActionPerformed(evt);
            }
        });

        infoMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jp_homeLayout = new javax.swing.GroupLayout(jp_home);
        jp_home.setLayout(jp_homeLayout);
        jp_homeLayout.setHorizontalGroup(
            jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_homeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_homeLayout.createSequentialGroup()
                        .addComponent(bt_addPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_addMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jp_homeLayout.setVerticalGroup(
            jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_homeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_homeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_addPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_addMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_homeLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(infoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Alterar Matéria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sets");

        menuItemConcluido.setText("Set Concluido=0");
        menuItemConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConcluidoActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemConcluido);

        menuItemRemoveAll.setText("Remover tudo");
        menuItemRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemoveAllActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRemoveAll);

        menuItemResetSoftware.setText("Reset para Software");
        menuItemResetSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemResetSoftwareActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemResetSoftware);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_home, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addMateriaActionPerformed
        getParent().add(home.ScreenAddMateria);
        home.addMateria();
        this.dispose();
    }//GEN-LAST:event_bt_addMateriaActionPerformed

    private void bt_addPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addPeriodoActionPerformed
        getParent().add(home.ScreenAddPeriodo);
        home.addPeriodo();
        this.dispose();
    }//GEN-LAST:event_bt_addPeriodoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getParent().add(home.ScreenEditMateria);
        home.editMateria();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemResetSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemResetSoftwareActionPerformed
        try {
            reset.resetSoftware();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        refresh.UpdateTableMateria();
        refresh.UpdateTablePeriodos();
        backHome();
        this.dispose();
    }//GEN-LAST:event_menuItemResetSoftwareActionPerformed

    private void menuItemConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConcluidoActionPerformed
        try {
            reset.resetConcluido();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        refresh.UpdateTableMateria();
        refresh.UpdateTablePeriodos();
        backHome();
        this.dispose();
    }//GEN-LAST:event_menuItemConcluidoActionPerformed

    private void menuItemRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemoveAllActionPerformed
        try {
            reset.resetAll();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        refresh.UpdateTableMateria();
        refresh.UpdateTablePeriodos();
        backHome();
        this.dispose();
    }//GEN-LAST:event_menuItemRemoveAllActionPerformed

    private void jTable_listMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_listMateriasMouseClicked
        jTable_listPeriodos.clearSelection();
        int row = this.jTable_listMaterias.getSelectedRow();
        String materia = (String) jTable_listMaterias.getValueAt(row, 0);
        changeLabel(materia);

        if (evt.getClickCount() == 2) {
            dialogInfos dialogInfo = new dialogInfos(materia);
            dialogInfo.setVisible(true);
        }
    }//GEN-LAST:event_jTable_listMateriasMouseClicked

    private void jTable_listPeriodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_listPeriodosMouseClicked
        jTable_listMaterias.clearSelection();
        int row = this.jTable_listPeriodos.getSelectedRow();
        int colum = this.jTable_listPeriodos.getSelectedColumn();
        String materia = (String) jTable_listPeriodos.getValueAt(row, colum);
        changeLabel(materia);

        if (evt.getClickCount() == 2) {
            dialogInfos dialogInfo = new dialogInfos(materia);
            dialogInfo.setVisible(true);
        }
    }//GEN-LAST:event_jTable_listPeriodosMouseClicked

    private void backHome() {
        HomeScreen screenHome = new HomeScreen();
        getParent().add(screenHome);
        ((BasicInternalFrameUI) screenHome.getUI()).setNorthPane(null);
        screenHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        screenHome.setVisible(true);
    }

    private void changeLabel(String sigla) {
        this.materia = db.SelectInfos(sigla);
        infoMateria.setText("<html> <div style='text-align: center;'>" + materia.getNomeMateria() + "</div></html>");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addMateria;
    private javax.swing.JButton bt_addPeriodo;
    private javax.swing.JLabel infoMateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_listMaterias;
    private javax.swing.JTable jTable_listPeriodos;
    private javax.swing.JPanel jp_home;
    private javax.swing.JMenuItem menuItemConcluido;
    private javax.swing.JMenuItem menuItemRemoveAll;
    private javax.swing.JMenuItem menuItemResetSoftware;
    // End of variables declaration//GEN-END:variables
}
