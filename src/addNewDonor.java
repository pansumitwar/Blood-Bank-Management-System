/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import Project.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Sumitbhaiji
 */
public class addNewDonor extends javax.swing.JFrame {

    /**
     * Creates new form addNewDonor
     */
    public addNewDonor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        fnameField = new javax.swing.JTextField();
        mnameField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        dobField = new com.toedter.calendar.JDateChooser();
        genderBox = new javax.swing.JComboBox();
        bloodBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        savebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        did = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel14.setText("Add New Donor");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 680, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("New Donor ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Full Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mother Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Date of Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 271, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mobile No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 309, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 151, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Blood Group");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 192, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("City");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 233, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Complete Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 271, -1, -1));

        nameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 148, 165, -1));

        fnameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(fnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 189, 165, -1));

        mnameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 230, 165, -1));

        mobileField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 306, 165, -1));

        emailField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 148, 165, -1));

        cityField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 230, 165, -1));
        getContentPane().add(dobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 271, 165, -1));

        genderBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(genderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 347, 165, -1));

        bloodBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloodBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 189, 165, -1));

        addressField.setColumns(20);
        addressField.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addressField.setLineWrap(true);
        addressField.setRows(5);
        addressField.setWrapStyleWord(true);
        jScrollPane1.setViewportView(addressField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 271, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 393, 680, 10));

        savebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 421, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update details.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 421, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit application.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 421, -1, -1));

        did.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        did.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 20, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Full Name");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Full Name");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(donorId) from donor");
            
            if(rs.first())
            {
                int id = rs.getInt(1);
                id=id+1;
                String str = String.valueOf(id);
                did.setText(str);
            }
            else
                did.setText("1");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new addNewDonor().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String donorId = did.getText();
        String name = nameField.getText();
        String fatherName = fnameField.getText();
        String motherName = mnameField.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dob = dFormat.format(dobField.getDate());
        String MobileNo = mobileField.getText();
        String gender = (String)genderBox.getSelectedItem();
        String email = emailField.getText();
        String bloodGroup = (String)bloodBox.getSelectedItem();
        String city = cityField.getText();
        String address = addressField.getText();
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            st.executeUpdate("insert into donor values('"+donorId+"','"+name+"','"+fatherName+"','"+motherName+"','"+dob+"','"+MobileNo+"','"+gender+"','"+email+"','"+bloodGroup+"','"+city+"','"+address+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new addNewDonor().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_savebtnActionPerformed

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
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JComboBox bloodBox;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel did;
    private com.toedter.calendar.JDateChooser dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fnameField;
    private javax.swing.JComboBox genderBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mnameField;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
