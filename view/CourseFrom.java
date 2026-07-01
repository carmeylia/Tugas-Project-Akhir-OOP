/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static com.mysql.cj.conf.PropertyKey.logger;
import controller.Coursecontroller;
import model.Course;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

    private void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class CourseForm {

        public CourseForm() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

 
/**
 *
 * @author carmeylia
 */
public class CourseFrom extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CourseFrom.class.getName());
    private final Coursecontroller courseController = new Coursecontroller();
    private DefaultTableModel tableModel;
    /**
     * Creates new form CourseFrom
     */
  public CourseFrom() {
        initComponents();
        initTableManual();
        loadDataKeTabel();
        jButtonSave.addActionListener(evt -> jButtonSaveActionPerformed(evt));
        jButtonReset.addActionListener(evt -> jButtonResetActionPerformed(evt));
        jButtonDelete.addActionListener(evt -> jButtonDeleteActionPerformed(evt));
    }
  private void initTableManual() {
        String[] columns = {"Kode MK", "Mata Kuliah", "SKS", "Semester"};
        tableModel = new DefaultTableModel(columns, 0);
        jTable1Tabel.setModel(tableModel);
    }
    
    private void loadDataKeTabel() {
        if (tableModel != null) {
            tableModel.setRowCount(0); 
            List<Course> listMK = courseController.getAll();
            for (Course c : listMK) {
                tableModel.addRow(new Object[]{
                    c.getCode(), 
                    c.getCourseName(), 
                    c.getSKS(), 
                    "3" 
                });
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldKodeMK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSKS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxMataKuliah = new javax.swing.JComboBox<>();
        jComboBoxSemester = new javax.swing.JComboBox<>();
        jButtonReset = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setText("Kode MK");

        jLabel3.setText("Mata Kuliah");

        jTextFieldKodeMK.addActionListener(this::jTextFieldKodeMKActionPerformed);

        jLabel4.setText("SKS");

        jTextFieldSKS.addActionListener(this::jTextFieldSKSActionPerformed);

        jLabel5.setText("Semester");

        jComboBoxMataKuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonReset.setText("Reset");

        jButtonDelete.setText("Delete");

        jButtonSave.setText("Save");

        jTable1Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1Tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldSKS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldKodeMK)
                            .addComponent(jComboBoxMataKuliah, 0, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonSave))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
public void initComponents() {
   jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldKodeMK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSKS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxMataKuliah = new javax.swing.JComboBox<>();
        jComboBoxSemester = new javax.swing.JComboBox<>();
        jButtonReset = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DATA MATA KULIAH");

        jLabel2.setText("Kode MK");

        jLabel3.setText("Mata Kuliah");
        
        jTextFieldKodeMK.addActionListener(this::jTextFieldKodeMKActionPerformed);

        jLabel4.setText("SKS");
   jTextFieldSKS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSKSActionPerformed(evt);
            }
        });
        jLabel5.setText("Semester");

        jComboBoxMataKuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PBO", "Struktur Data", "Basis Data", "Jaringan Komputer" }));

        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        jButtonReset.setText("Reset");

        jButtonDelete.setText("Delete");

        jButtonSave.setText("Save");

        jTable1Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1Tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldSKS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldKodeMK)
                            .addComponent(jComboBoxMataKuliah, 0, 120, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMataKuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonSave))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldKodeMKActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        jTextFieldSKS.requestFocus();
    }                                                

    private void jTextFieldSKSActionPerformed(java.awt.event.ActionEvent evt) {                                              
        jButtonSave.requestFocus();
    }                                             

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String kode = jTextFieldKodeMK.getText().trim();
            String namaMatkul = jComboBoxMataKuliah.getSelectedItem().toString();
            
            if (kode.isEmpty() || jTextFieldSKS.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Peringatan: Field Kode MK dan SKS tidak boleh kosong!");
                return;
            }
            
            int sks = Integer.parseInt(jTextFieldSKS.getText().trim());
            int semester = Integer.parseInt(jComboBoxSemester.getSelectedItem().toString());

            courseController.simpanMataKuliah(kode, namaMatkul, sks, semester);
            loadDataKeTabel();
            
            jButtonResetActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Sukses! Data Mata Kuliah Berhasil Disimpan.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error! Input SKS harus berupa angka murni.");
        }
    }                                           

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextFieldKodeMK.setText("");
        jTextFieldSKS.setText("");
        if (jComboBoxMataKuliah.getItemCount() > 0) jComboBoxMataKuliah.setSelectedIndex(0);
        if (jComboBoxSemester.getItemCount() > 0) jComboBoxSemester.setSelectedIndex(0);
    }                                            

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int selectedRow = jTable1Tabel.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris data pada tabel terlebih dahulu!");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String kodeMK = jTable1Tabel.getValueAt(selectedRow, 0).toString();
            List<Course> listMK = courseController.getAll();
            listMK.removeIf(c -> c.getCode().equals(kodeMK));
            loadDataKeTabel();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
        }
    }
}

    private void jTextFieldKodeMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodeMKActionPerformed
jTextFieldSKS.requestFocus();
    }//GEN-LAST:event_jTextFieldKodeMKActionPerformed

    private void jTextFieldSKSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSKSActionPerformed
jButtonSave.requestFocus();
    }//GEN-LAST:event_jTextFieldSKSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CourseFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            view.CourseFrom frame = new view.CourseFrom();
            frame.setLocationRelativeTo(null); 
            frame.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxMataKuliah;
    private javax.swing.JComboBox<String> jComboBoxSemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Tabel;
    private javax.swing.JTextField jTextFieldKodeMK;
    private javax.swing.JTextField jTextFieldSKS;
    // End of variables declaration//GEN-END:variables
