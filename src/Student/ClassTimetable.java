
package Student;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import javaproject.JavaProject;
import javaproject.LoginPage;


public class ClassTimetable extends javax.swing.JFrame {
    
    String username;

    public ClassTimetable(String user) {
        username = user;
        initComponents();
        this.setLocationRelativeTo(null);
        
        // page heading
        jLabelUsername.setText(username);
        this.DisplayImage();
    }
    
    private void DisplayImage(){
        jScrollPaneSubTeachers.setVisible(false);
        jScrollPaneTTincharge.setVisible(false);
        jScrollPaneTT.setVisible(true);
        
        String timetablePath = "";
        String subTeachersPath = "";
        String TTinchargePath = "";
        String division;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","pi22/7");


            Statement statement = con.createStatement();
            String sql1 = "SELECT division FROM cs_student WHERE name LIKE '" + username + "%'";


            ResultSet rs = statement.executeQuery(sql1);

            if(rs.next()){
                division = rs.getString("division");
                
                String sql2= "select timetable, subteachers, timetableincharge from CS where division= '" + division + "'";
                ResultSet rs2 = statement.executeQuery(sql2);

                if(rs2.next()){
                    timetablePath = rs2.getString("timetable");
                    subTeachersPath = rs2.getString("subteachers");
                    TTinchargePath = rs2.getString("timetableincharge");
                    
                    // get background bolor
                    Color panelBgColor = jPanel3.getBackground();
                    
                    ImageIcon icon1 = new ImageIcon(timetablePath);
                    jLabelTimeTable.setIcon(icon1);
                    jScrollPaneTT.getViewport().setBackground(panelBgColor);
                    
                    ImageIcon icon2 = new ImageIcon(subTeachersPath);
                    jLabelSubjectTeachersImg.setIcon(icon2);
                    jScrollPaneSubTeachers.getViewport().setBackground(panelBgColor);
                    
                    ImageIcon icon3 = new ImageIcon(TTinchargePath);
                    jLabelTTinchargeImg.setIcon(icon3);
                    jScrollPaneTTincharge.getViewport().setBackground(panelBgColor);
                }

            }
        }
        catch (Exception e){
                System.out.println(e.getMessage());
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelSubjectTeachers = new javax.swing.JLabel();
        jLabelTTincharge = new javax.swing.JLabel();
        jLabelSubjectTeachers1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPaneTT = new javax.swing.JScrollPane();
        jLabelTimeTable = new javax.swing.JLabel();
        jScrollPaneSubTeachers = new javax.swing.JScrollPane();
        jLabelSubjectTeachersImg = new javax.swing.JLabel();
        jScrollPaneTTincharge = new javax.swing.JScrollPane();
        jLabelTTinchargeImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(148, 188, 199));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 600));

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ishar\\OneDrive\\Documents\\NetBeansProjects\\JavaProject\\src\\icons\\student.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
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
        jLabelUsername.setText("*username*");

        javax.swing.GroupLayout jPanelTopBarLayout = new javax.swing.GroupLayout(jPanelTopBar);
        jPanelTopBar.setLayout(jPanelTopBarLayout);
        jPanelTopBarLayout.setHorizontalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
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

        jLabel6.setBackground(new java.awt.Color(104, 21, 9));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(104, 21, 9));
        jLabel6.setText("Log out");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(148, 188, 199));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 21, 9));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style='text-align:center'>Transportation<br>Details</div></html>");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(148, 188, 199));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(104, 21, 9));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><div style='text-align:center'>Class<br>Timetable</div></html>");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 21, 9));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><div style='text-align:center'>Academic<br>Timetable</div></html>");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(104, 21, 9));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><div style='text-align:center'>Announcements</div></html>");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );

        jLabelSubjectTeachers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSubjectTeachers.setForeground(new java.awt.Color(104, 21, 9));
        jLabelSubjectTeachers.setText("Subject Teachers");
        jLabelSubjectTeachers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSubjectTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSubjectTeachersMouseClicked(evt);
            }
        });

        jLabelTTincharge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTTincharge.setForeground(new java.awt.Color(104, 21, 9));
        jLabelTTincharge.setText("Timetable Incharge");
        jLabelTTincharge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTTincharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTTinchargeMouseClicked(evt);
            }
        });

        jLabelSubjectTeachers1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSubjectTeachers1.setForeground(new java.awt.Color(104, 21, 9));
        jLabelSubjectTeachers1.setText("Timetable");
        jLabelSubjectTeachers1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSubjectTeachers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSubjectTeachers1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(148, 188, 199));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        jScrollPaneTT.setBackground(new java.awt.Color(148, 188, 199));
        jScrollPaneTT.setOpaque(false);

        jLabelTimeTable.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTimeTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPaneTT.setViewportView(jLabelTimeTable);

        jPanel3.add(jScrollPaneTT);

        jScrollPaneSubTeachers.setBackground(new java.awt.Color(148, 188, 199));
        jScrollPaneSubTeachers.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPaneSubTeachers.setOpaque(false);

        jLabelSubjectTeachersImg.setBackground(new java.awt.Color(148, 188, 199));
        jLabelSubjectTeachersImg.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSubjectTeachersImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPaneSubTeachers.setViewportView(jLabelSubjectTeachersImg);

        jPanel3.add(jScrollPaneSubTeachers);

        jScrollPaneTTincharge.setBackground(new java.awt.Color(148, 188, 199));
        jScrollPaneTTincharge.setOpaque(false);

        jLabelTTinchargeImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPaneTTincharge.setViewportView(jLabelTTinchargeImg);

        jPanel3.add(jScrollPaneTTincharge);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelSubjectTeachers1)
                        .addGap(198, 198, 198)
                        .addComponent(jLabelSubjectTeachers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTTincharge)
                        .addGap(85, 85, 85))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanelTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSubjectTeachers1)
                            .addComponent(jLabelSubjectTeachers)
                            .addComponent(jLabelTTincharge))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openLoginPage();
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openStudentTransport(username);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelSubjectTeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubjectTeachersMouseClicked
        // TODO add your handling code here:
        jScrollPaneSubTeachers.setVisible(true);
        jScrollPaneTTincharge.setVisible(false);
        jScrollPaneTT.setVisible(false);
    }//GEN-LAST:event_jLabelSubjectTeachersMouseClicked

    private void jLabelTTinchargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTTinchargeMouseClicked
        // TODO add your handling code here:
        jScrollPaneSubTeachers.setVisible(false);
        jScrollPaneTTincharge.setVisible(true);
        jScrollPaneTT.setVisible(false);
    }//GEN-LAST:event_jLabelTTinchargeMouseClicked

    private void jLabelSubjectTeachers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubjectTeachers1MouseClicked
        // TODO add your handling code here:
        jScrollPaneSubTeachers.setVisible(false);
        jScrollPaneTTincharge.setVisible(false);
        jScrollPaneTT.setVisible(true);
    }//GEN-LAST:event_jLabelSubjectTeachers1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openStudentAcdemicTT(username);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openStudentAnnouncements(username);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelSubjectTeachers;
    private javax.swing.JLabel jLabelSubjectTeachers1;
    private javax.swing.JLabel jLabelSubjectTeachersImg;
    private javax.swing.JLabel jLabelTTincharge;
    private javax.swing.JLabel jLabelTTinchargeImg;
    private javax.swing.JLabel jLabelTimeTable;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JScrollPane jScrollPaneSubTeachers;
    private javax.swing.JScrollPane jScrollPaneTT;
    private javax.swing.JScrollPane jScrollPaneTTincharge;
    // End of variables declaration//GEN-END:variables
}
