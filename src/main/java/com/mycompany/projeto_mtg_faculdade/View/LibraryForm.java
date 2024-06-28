/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_mtg_faculdade.View;


import com.mycompany.projeto_mtg_faculdade.Controller.DatabaseConnectionController;
import com.mycompany.projeto_mtg_faculdade.Controller.LibraryActionsController;
import com.mycompany.projeto_mtg_faculdade.Controller.TableActions;
import com.mycompany.projeto_mtg_faculdade.Controller.UserLibraryController;
import com.mycompany.projeto_mtg_faculdade.Model.LibraryCard;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Jomes
 */
public class LibraryForm extends javax.swing.JFrame {

    /**
     * Creates new form LibraryForm
     */
    public String userId;
    
    public List<LibraryCard> library = new ArrayList<>();
    public LibraryForm() {
        initComponents();
    }
    
    public void setUserId(String userId){
        this.userId = userId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Pesquisar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "image", "name", "set", "oracle text", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Add 4 to library");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Remove from library");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Image", "Name", "set", "oracle text", "quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jButton4.setText("Remove 1 from library");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Add 1 to library");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Delete library");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("refresh");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(jButton1)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addContainerGap(588, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
            TableActions tableActions = new TableActions();
            tableActions.SearchAddToTable(jTable1, jTextField1);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "This will delete the Library permanently from the database", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            DatabaseConnectionController dbController = new DatabaseConnectionController();
            UserLibraryController userLibraryController = new UserLibraryController(dbController);
            userLibraryController.deleteLibrary(userId);
            this.dispose();

        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        System.out.println(userId);
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int lastColumn = jTable1.getColumnCount() - 1;
            String cardId = (String) jTable1.getValueAt(selectedRow, lastColumn);
            DatabaseConnectionController dbController = new DatabaseConnectionController();
            UserLibraryController userLibraryController = new UserLibraryController(dbController);
            boolean success = userLibraryController.addCardToLibrary(userId, cardId, 1);
            // Check if the operation was successful
            if (success) {
                JOptionPane.showMessageDialog(null,"Card added successfully.");
                DatabaseConnectionController dbController2 = new DatabaseConnectionController();
                LibraryActionsController libraryActionsController = new LibraryActionsController(new UserLibraryController(dbController2));
                libraryActionsController.loadData(userId, jTable2);
            } else {
                JOptionPane.showMessageDialog(null,"Failed to add card.");
            }

        } else {
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        DatabaseConnectionController dbController = new DatabaseConnectionController();
        LibraryActionsController libraryActionsController = new LibraryActionsController(new UserLibraryController(dbController));
        library = libraryActionsController.loadData(userId, jTable2);


    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int lastColumn = jTable1.getColumnCount() - 1;
            String cardId = (String) jTable1.getValueAt(selectedRow, lastColumn);
            DatabaseConnectionController dbController = new DatabaseConnectionController();
            UserLibraryController userLibraryController = new UserLibraryController(dbController);
            boolean success = userLibraryController.addCardToLibrary(userId, cardId, 4);
            // Check if the operation was successful
            if (success) {
                JOptionPane.showMessageDialog(null,"Card added successfully.");
                DatabaseConnectionController dbController2 = new DatabaseConnectionController();
                LibraryActionsController libraryActionsController = new LibraryActionsController(new UserLibraryController(dbController2));
                library = libraryActionsController.loadData(userId, jTable2);

            } else {
                JOptionPane.showMessageDialog(null,"Failed to add card.");
            }

        } else {
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
            int lastColumn = jTable2.getColumnCount() - 1;
            if (lastColumn > 1) {
                LibraryCard selectedCard = library.get(selectedRow);
                String id = selectedCard.getId();
                DatabaseConnectionController dbController = new DatabaseConnectionController();
                UserLibraryController userLibraryController = new UserLibraryController(dbController);
                boolean success = userLibraryController.removeCardFromLibrary(userId, id, 1);

                if (success) {
                    JOptionPane.showMessageDialog(null,"Card added successfully.");
                    DatabaseConnectionController dbController2 = new DatabaseConnectionController();
                    LibraryActionsController libraryActionsController = new LibraryActionsController(new UserLibraryController(dbController2));
                    library = libraryActionsController.loadData(userId, jTable2);

                } else {
                    JOptionPane.showMessageDialog(null,"Failed to add card.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "there is only one card left");
            }

        } else {
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
                int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
                LibraryCard selectedCard = library.get(selectedRow);
                String id = selectedCard.getId();
                DatabaseConnectionController dbController = new DatabaseConnectionController();
                UserLibraryController userLibraryController = new UserLibraryController(dbController);
                boolean success = userLibraryController.deleteRow(userId, id);

                if (success) {
                    JOptionPane.showMessageDialog(null,"Card deleted successfully. wait for the reload");
                    DatabaseConnectionController dbController2 = new DatabaseConnectionController();
                    LibraryActionsController libraryActionsController = new LibraryActionsController(new UserLibraryController(dbController2));
                    library = libraryActionsController.loadData(userId, jTable2);

                } else {
                    JOptionPane.showMessageDialog(null,"Failed to delete card.");
                }
            

        } else {
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(LibraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
