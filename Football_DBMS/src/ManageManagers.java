
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kailassaurabh2003
 */
public class ManageManagers extends javax.swing.JFrame {

    /**
     * Creates new form ManageManagers
     */
    public ManageManagers() {
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Telugu MN", 0, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id-card.png"))); // NOI18N
        jButton2.setText("Sort by Name");
        jButton2.setIconTextGap(40);
        jButton2.setMaximumSize(new java.awt.Dimension(137, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(137, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(137, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 240, 60));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Telugu MN", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strategy.png"))); // NOI18N
        jButton3.setText("Sort by Formation");
        jButton3.setIconTextGap(25);
        jButton3.setMaximumSize(new java.awt.Dimension(137, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(137, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(137, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 60));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Telugu MN", 0, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rating.png"))); // NOI18N
        jButton4.setText("Sort by Experience");
        jButton4.setIconTextGap(11);
        jButton4.setMaximumSize(new java.awt.Dimension(137, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(137, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(137, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 60));

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Telugu MN", 0, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/terms-and-conditions.png"))); // NOI18N
        jButton5.setText("Sort by Condition");
        jButton5.setIconTextGap(40);
        jButton5.setMaximumSize(new java.awt.Dimension(137, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(137, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(137, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 240, 60));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Telugu MN", 0, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-button.png"))); // NOI18N
        jButton1.setText("Go Back");
        jButton1.setIconTextGap(40);
        jButton1.setMaximumSize(new java.awt.Dimension(137, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(137, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(137, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 240, 60));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Formation", "Designation", "Age", "Experience", "Condition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 670, 600));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Telugu MN", 0, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager2.png"))); // NOI18N
        jButton6.setText("List All Managers");
        jButton6.setIconTextGap(25);
        jButton6.setMaximumSize(new java.awt.Dimension(137, 23));
        jButton6.setMinimumSize(new java.awt.Dimension(137, 23));
        jButton6.setPreferredSize(new java.awt.Dimension(137, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, 60));

        jLabel1.setFont(new java.awt.Font("Telugu MN", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Managers Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pref.jpeg"))); // NOI18N
        jLabel3.setIconTextGap(10);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pref.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con2;
        PreparedStatement insert;        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Football", "root", "saurabh2003");

            insert=con2.prepareStatement("select * from Managers order by Name asc;");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            int c=rss.getColumnCount();

            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);

            while(rs.next())
            {
                Vector v2=new Vector();

                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Formation"));
                    v2.add(rs.getString("Designation"));
                    v2.add(Integer.valueOf(rs.getString("Age")));
                    v2.add(Integer.valueOf(rs.getString("YearsExperience")));
                    v2.add(rs.getString("CoachCondition"));
                }

                Df.addRow(v2);
            }

        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "ID already used!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Connection con2;
        PreparedStatement insert;        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Football", "root", "saurabh2003");

            insert=con2.prepareStatement("select * from Managers order by Formation;");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            int c=rss.getColumnCount();

            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);

            while(rs.next())
            {
                Vector v2=new Vector();

                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Formation"));
                    v2.add(rs.getString("Designation"));
                    v2.add(Integer.valueOf(rs.getString("Age")));
                    v2.add(Integer.valueOf(rs.getString("YearsExperience")));
                    v2.add(rs.getString("CoachCondition"));
                }

                Df.addRow(v2);
            }

        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "ID already used!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        Connection con2;
        PreparedStatement insert;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Football", "root", "saurabh2003");
            
            insert=con2.prepareStatement("select * from Managers order by YearsExperience desc;");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            int c=rss.getColumnCount();
            
            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2=new Vector();
                
                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Formation"));
                    v2.add(rs.getString("Designation"));
                    v2.add(Integer.valueOf(rs.getString("Age")));
                    v2.add(Integer.valueOf(rs.getString("YearsExperience")));
                    v2.add(rs.getString("CoachCondition"));
                }
                
                Df.addRow(v2);
            }
            
            
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "ID already used!");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        Connection con2;
        PreparedStatement insert;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Football", "root", "saurabh2003");
            
            insert=con2.prepareStatement("select * from Managers order by CoachCondition;");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            int c=rss.getColumnCount();
            
            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2=new Vector();
                
                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Formation"));
                    v2.add(rs.getString("Designation"));
                    v2.add(Integer.valueOf(rs.getString("Age")));
                    v2.add(Integer.valueOf(rs.getString("YearsExperience")));
                    v2.add(rs.getString("CoachCondition"));
                }
                
                Df.addRow(v2);
            }
            
            
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "ID already used!");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Connection con2;
        PreparedStatement insert;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con2=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Football", "root", "saurabh2003");
            
            insert=con2.prepareStatement("select * from Managers;");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            int c=rss.getColumnCount();
            
            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2=new Vector();
                
                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Formation"));
                    v2.add(rs.getString("Designation"));
                    v2.add(Integer.valueOf(rs.getString("Age")));
                    v2.add(Integer.valueOf(rs.getString("YearsExperience")));
                    v2.add(rs.getString("CoachCondition"));
                }
                
                Df.addRow(v2);
            }
            
            
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e) {
            Logger.getLogger(ManagePlayers.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "ID already used!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageManagers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageManagers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageManagers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageManagers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageManagers().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
