/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import Admin.Admin_AcademicTimetable;
import Admin.AdminTransport;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.*;
import javaproject.JavaProject;
import javaproject.LoginPage;

public class Admin_Announcements extends javax.swing.JFrame {

    
    public Admin_Announcements() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabelNewStudentTT = new javax.swing.JLabel();
        jLabelAnnounce = new javax.swing.JLabel();
        jLabelSaveAnnouncement = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAnnouncement = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabelDateEmpty = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxBatch = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxBranch = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDivision = new javax.swing.JTextField();
        jLabelReset = new javax.swing.JLabel();

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
        jLabelUsername.setText("Make Announcements");

        javax.swing.GroupLayout jPanelTopBarLayout = new javax.swing.GroupLayout(jPanelTopBar);
        jPanelTopBar.setLayout(jPanelTopBarLayout);
        jPanelTopBarLayout.setHorizontalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(jLabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabelTransport.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelTransport.setForeground(new java.awt.Color(104, 21, 9));
        jLabelTransport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTransport.setText("<html><div style='text-align:center'>Transportation<br>Details</div></html>");
        jLabelTransport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTransport.setMinimumSize(new java.awt.Dimension(103, 44));
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

        jLabelAcademicTT.setBackground(new java.awt.Color(148, 188, 199));
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

        jLabelNewStudentTT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelNewStudentTT.setForeground(new java.awt.Color(104, 21, 9));
        jLabelNewStudentTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewStudentTT.setText("<html><div style='text-align:center'>Student<br>Account</div></html>");
        jLabelNewStudentTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelNewStudentTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNewStudentTTMouseClicked(evt);
            }
        });

        jLabelAnnounce.setBackground(new java.awt.Color(148, 188, 199));
        jLabelAnnounce.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelAnnounce.setForeground(new java.awt.Color(104, 21, 9));
        jLabelAnnounce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnnounce.setText("<html><div style='text-align:center'>Make<br>Announcements</div></html>");
        jLabelAnnounce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAnnounce.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTransport, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addComponent(jLabelClassTT, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelAcademicTT, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelNewStudentTT, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelAnnounce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabelTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClassTT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAcademicTT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabelNewStudentTT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabelLogOut)
                .addGap(32, 32, 32))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(jLabelAnnounce, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(227, 227, 227)))
        );

        jLabelSaveAnnouncement.setBackground(new java.awt.Color(104, 21, 9));
        jLabelSaveAnnouncement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSaveAnnouncement.setForeground(new java.awt.Color(243, 238, 217));
        jLabelSaveAnnouncement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaveAnnouncement.setText("Save");
        jLabelSaveAnnouncement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelSaveAnnouncement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSaveAnnouncement.setOpaque(true);
        jLabelSaveAnnouncement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveAnnouncementMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(132, 148, 168));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextAreaAnnouncement.setBackground(new java.awt.Color(243, 238, 217));
        jTextAreaAnnouncement.setColumns(20);
        jTextAreaAnnouncement.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextAreaAnnouncement.setForeground(new java.awt.Color(104, 21, 9));
        jTextAreaAnnouncement.setRows(5);
        jTextAreaAnnouncement.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaAnnouncement);

        jLabel8.setForeground(new java.awt.Color(104, 21, 9));
        jLabel8.setText("Character limit: 250");

        jLabel9.setForeground(new java.awt.Color(104, 21, 9));
        jLabel9.setText("Date of announcement");

        jLabelDateEmpty.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDateEmpty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDateEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(132, 148, 168));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(104, 21, 9));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Batch");

        jComboBoxBatch.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxBatch.setForeground(new java.awt.Color(104, 21, 9));
        jComboBoxBatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19-23", "20-24", "21-25", "22-26" }));
        jComboBoxBatch.setSelectedIndex(2);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(104, 21, 9));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Branch");

        jComboBoxBranch.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxBranch.setForeground(new java.awt.Color(104, 21, 9));
        jComboBoxBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "AIML", "RA", "MECH", "CIVIL", "ENTC", "CIVIL" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(104, 21, 9));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Division");

        jTextFieldDivision.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDivision.setForeground(new java.awt.Color(104, 21, 9));
        jTextFieldDivision.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelReset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelReset.setForeground(new java.awt.Color(104, 21, 9));
        jLabelReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReset.setText("Reset");
        jLabelReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabelReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabelSaveAnnouncement, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSaveAnnouncement, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
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

    private void jLabelNewStudentTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNewStudentTTMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminStudentAcc();
        this.dispose();
    }//GEN-LAST:event_jLabelNewStudentTTMouseClicked

    private void jLabelSaveAnnouncementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveAnnouncementMouseClicked
         jLabelDateEmpty.setText("");

        // updating announcements
        try{
            String announcement = jTextAreaAnnouncement.getText();
            int count = announcement.length();
            if(count>300){
                throw new Exception("Character Limit Exceeded");
            }
            
            Date d = jDateChooser1.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String date = dateFormat.format(d);

            String batch = jComboBoxBatch.getSelectedItem().toString();
            String branch = jComboBoxBranch.getSelectedItem().toString();
            String division = jTextFieldDivision.getText().trim();
            
            if(!announcement.trim().isEmpty()){
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","pi22/7");

                // if branch, batch, division is mentioned
                String sql= "";
                int loop=1;     // for different branches, we need to loop

                // if division is mentioned
                if(!branch.isEmpty() && !division.isEmpty()){
                    sql= "update "+branch+" set announcements=? where division='"+division+"'";
                }

                // if division not mentioned: announcement for all branch 
                else if(!branch.isEmpty() && division.isEmpty()){
                    sql= "update "+branch+" set announcements=?";
                }
                
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,announcement+"[Date: "+date+"]");

                if (ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(this, "Uploaded Successfully to "+branch);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Could not upload to database");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Announcement Field is empty");
            }
        }
        catch(NullPointerException e){
            jLabelDateEmpty.setText("*required");
            JOptionPane.showMessageDialog(this, "Incomplete dteails");
        }
        catch(SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Announcement tab has not yet been created for your branch. Coming Soon");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Could not upload announcement: "+e);
        }
        
        
    }//GEN-LAST:event_jLabelSaveAnnouncementMouseClicked

    private void jLabelAcademicTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAcademicTTMouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminAcademicTT();
        this.dispose();
    }//GEN-LAST:event_jLabelAcademicTTMouseClicked

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        jComboBoxBranch.setSelectedIndex(0);
        jComboBoxBatch.setSelectedIndex(2);
        jTextFieldDivision.setText("");
    }//GEN-LAST:event_jLabelResetMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxBatch;
    private javax.swing.JComboBox<String> jComboBoxBranch;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAcademicTT;
    private javax.swing.JLabel jLabelAnnounce;
    private javax.swing.JLabel jLabelClassTT;
    private javax.swing.JLabel jLabelDateEmpty;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelNewStudentTT;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSaveAnnouncement;
    private javax.swing.JLabel jLabelTransport;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAnnouncement;
    private javax.swing.JTextField jTextFieldDivision;
    // End of variables declaration//GEN-END:variables
}
