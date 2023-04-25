/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import javax.swing.*;
import java.awt.*; 
import java.io.File;
import java.sql.*;
import javaproject.LoginPage;
import javax.swing.filechooser.FileNameExtensionFilter;
import javaproject.JavaProject;



public class AdminTransport extends javax.swing.JFrame {

    
    public AdminTransport() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.DisplayImage();
    }
    
    private void DisplayImage(){
        String imagePath = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","pi22/7");

            Statement statement = con.createStatement();
            String sql= "select transport from CS where division='A'";

            ResultSet rs = statement.executeQuery(sql);

            if(rs.next()){
                
                imagePath = rs.getString("transport");
                Color panelBgColor = jPanel6.getBackground();
                ImageIcon icon1 = new ImageIcon(imagePath);
                jLabelTransportImg.setIcon(icon1);
                jScrollPane1.getViewport().setBackground(panelBgColor);
            }
        }
        catch (Exception e){
                JOptionPane.showMessageDialog(this, "Could not upload announcement: "+e);
        }
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelTransport = new javax.swing.JLabel();
        jLabelClassTT = new javax.swing.JLabel();
        jLabelAcademicTT = new javax.swing.JLabel();
        jLabelNewStudentAcc = new javax.swing.JLabel();
        jLabelAnnounce = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelTransportImg = new javax.swing.JLabel();
        jLabelEditImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(148, 188, 199));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanelTopBar.setBackground(new java.awt.Color(104, 21, 9));

        jLabelExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(243, 238, 217));
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(243, 238, 217));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(104, 21, 9));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ishar\\OneDrive\\Documents\\NetBeansProjects\\JavaProject\\src\\icons\\student.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(243, 238, 217));
        jLabelUsername.setText("Update Transportation Details");

        javax.swing.GroupLayout jPanelTopBarLayout = new javax.swing.GroupLayout(jPanelTopBar);
        jPanelTopBar.setLayout(jPanelTopBarLayout);
        jPanelTopBarLayout.setHorizontalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUsername)
                .addGap(212, 212, 212)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTopBarLayout.setVerticalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsername))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(132, 148, 168));

        jLabelLogOut.setBackground(new java.awt.Color(104, 21, 9));
        jLabelLogOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLogOut.setForeground(new java.awt.Color(104, 21, 9));
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setText("Log out");
        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });

        jLabelTransport.setBackground(new java.awt.Color(148, 188, 199));
        jLabelTransport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTransport.setForeground(new java.awt.Color(104, 21, 9));
        jLabelTransport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTransport.setText("<html><div style='text-align:center'>Transportation<br>Details</div></html>");
        jLabelTransport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTransport.setMinimumSize(new java.awt.Dimension(103, 44));
        jLabelTransport.setOpaque(true);
        jLabelTransport.setPreferredSize(new java.awt.Dimension(103, 44));
        jLabelTransport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTransportMouseClicked(evt);
            }
        });

        jLabelClassTT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelClassTT.setForeground(new java.awt.Color(104, 21, 9));
        jLabelClassTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClassTT.setText("<html><div style='text-align:center'>Class<br>Timetable</div></html>");
        jLabelClassTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClassTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClassTTMouseClicked(evt);
            }
        });

        jLabelAcademicTT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelAcademicTT.setForeground(new java.awt.Color(104, 21, 9));
        jLabelAcademicTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAcademicTT.setText("<html><div style='text-align:center'>Academic<br>Timetable</div></html>");
        jLabelAcademicTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAcademicTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAcademicTTMouseClicked(evt);
            }
        });

        jLabelNewStudentAcc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelNewStudentAcc.setForeground(new java.awt.Color(104, 21, 9));
        jLabelNewStudentAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewStudentAcc.setText("<html><div style='text-align:center'>Student<br>Account</div></html>");
        jLabelNewStudentAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelNewStudentAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNewStudentAccMouseClicked(evt);
            }
        });

        jLabelAnnounce.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelAnnounce.setForeground(new java.awt.Color(104, 21, 9));
        jLabelAnnounce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnnounce.setText("<html><div style='text-align:center'>Make<br>Announcements</div></html>");
        jLabelAnnounce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAnnounce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAnnounceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTransport, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addComponent(jLabelClassTT, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelAcademicTT, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelNewStudentAcc, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelAnnounce, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabelTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClassTT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAcademicTT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabelNewStudentAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabelLogOut)
                .addGap(32, 32, 32))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(247, Short.MAX_VALUE)
                    .addComponent(jLabelAnnounce, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(244, 244, 244)))
        );

        jLabelTransportImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(jLabelTransportImg);

        jLabelEditImg.setBackground(new java.awt.Color(104, 21, 9));
        jLabelEditImg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelEditImg.setForeground(new java.awt.Color(243, 238, 217));
        jLabelEditImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditImg.setText("Edit Image");
        jLabelEditImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelEditImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEditImg.setOpaque(true);
        jLabelEditImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                        .addComponent(jLabelEditImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(353, 353, 353))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanelTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabelEditImg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);     //  exit
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);    // minimize
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openLoginPage();
        this.dispose();
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jLabelTransportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTransportMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminTransport();
        this.dispose();
    }//GEN-LAST:event_jLabelTransportMouseClicked

    private void jLabelClassTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClassTTMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminClassTT();
        this.dispose();
    }//GEN-LAST:event_jLabelClassTTMouseClicked

    
    private void jLabelEditImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditImgMouseClicked
        // TODO add your handling code here:
        
        String imagePath =  "";
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //For inserting image 
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int output = file.showSaveDialog(file);
        
        //if the choosen file is of the correct extension
        if (output == JFileChooser.APPROVE_OPTION) {
            File selectFile = file.getSelectedFile();
            String path = selectFile.getAbsolutePath();
            
            imagePath = path;
            
            // saving 
            if(!imagePath.trim().isEmpty()){
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","pi22/7");

                    String sql= "update CS set transport=?;";
                    PreparedStatement ps=con.prepareStatement(sql);

                    ps.setString(1,imagePath);

                    if (ps.executeUpdate()>0){
                        JOptionPane.showMessageDialog(this, "Upload Successful");
                        this.DisplayImage();
                    }
                    else{
                        System.out.println("Error in uploading");
                    }
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "No image selected");
        }
        
        
    }//GEN-LAST:event_jLabelEditImgMouseClicked

    private void jLabelNewStudentAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNewStudentAccMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminStudentAcc();
        this.dispose();
    }//GEN-LAST:event_jLabelNewStudentAccMouseClicked

    private void jLabelAcademicTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAcademicTTMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminAcademicTT();
        this.dispose();
    }//GEN-LAST:event_jLabelAcademicTTMouseClicked

    private void jLabelAnnounceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAnnounceMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminAnnouncements();
        this.dispose();
    }//GEN-LAST:event_jLabelAnnounceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAcademicTT;
    private javax.swing.JLabel jLabelAnnounce;
    private javax.swing.JLabel jLabelClassTT;
    private javax.swing.JLabel jLabelEditImg;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelNewStudentAcc;
    private javax.swing.JLabel jLabelTransport;
    private javax.swing.JLabel jLabelTransportImg;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
