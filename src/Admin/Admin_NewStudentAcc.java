
package Admin;

import javaproject.JavaProject;
import javax.swing.*;
import java.sql.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Random;
import java.awt.*;


public class Admin_NewStudentAcc extends javax.swing.JFrame {

    
    public Admin_NewStudentAcc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    // returns the capitalised full name
    public String getName(String name){
        String newName[] = name.split(" ");
        for(int i=0; i<newName.length; i++){
            String first = newName[i].substring(0,1).toUpperCase();    // first letter to upper
            String rem = newName[i].substring(1,newName[i].length()).toLowerCase();       // other letters to lower
            newName[i]= first+rem;
        }
        name = String.join(" ", newName);
        return name;
    }
    
    // generates username, password and email for new student
    public String[] generateID(String name){
        String username = "";
        String email = "";
        String password = "";
        
        // generating random nos:
        Random random = new Random();
        int randomnumber = random.nextInt(9000)+1000;
        
        String uname[] = Arrays.copyOfRange(name.split(" "),0,2);
        if(uname[1]!=null){
            username = String.join(".", uname)+".btech2021";
            password = String.join("@", uname)+ String.valueOf(randomnumber);
        }
        else{
            username = uname[0]+".btech2021";
            password = uname[0] +"@"+ String.valueOf(randomnumber);
        }
        email = username + "@sitpune.edu.in";
        
        String ret[] = {username,password,email};
        return ret;
    }
    
    // for checking all the details
    public boolean checkDetails() throws Exception{
        boolean flag = true;
        String setIdText = jTextFieldSETID.getText().trim();
        String PRNText = jTextFieldPRN.getText().trim();
        String name = jTextFieldName.getText().trim();
        String division = jTextFieldDivision.getText().trim();
        String pass = jTextFieldphone.getText().trim();
        
        if(setIdText.isEmpty()){
            jTextFieldSETID.setText(" *required");
            flag=false;
        }
        if(PRNText.isEmpty()){
            jTextFieldPRN.setText(" *required");
            flag=false;
        }
        if(name.isEmpty()){
            jTextFieldName.setText(" *required");
            flag=false;
        }
        if(division.isEmpty()){
            jTextFieldDivision.setText(" *required");
            flag=false;
        }
        if(division.matches("[0-9]+")){
            throw new NumberFormatException("Incorrect details (check division) ");
        }
        if(!setIdText.matches("[0-9]+")){
            throw new NumberFormatException("Incorrect details (check SET ID) ");
        }
        if(!PRNText.matches("[0-9]+")){
            throw new NumberFormatException("Incorrect details (check PRN) ");
        }
        if(!pass.matches("[0-9]+")){
            throw new NumberFormatException("Incorrect details (check PRN) ");
        }
        return flag;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSETID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextFieldphone = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextFieldPRN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldDivision = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxBranch = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxBatch = new javax.swing.JComboBox<>();
        jLabelReset = new javax.swing.JLabel();
        jLabelSaveDetails = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelMessage = new javax.swing.JLabel();
        jLabelUN = new javax.swing.JLabel();
        jLabelP = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(148, 188, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanelTopBar.setBackground(new java.awt.Color(104, 21, 9));
        jPanelTopBar.setMaximumSize(new java.awt.Dimension(1000, 82));
        jPanelTopBar.setMinimumSize(new java.awt.Dimension(1000, 82));
        jPanelTopBar.setPreferredSize(new java.awt.Dimension(1000, 82));

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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
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
        jLabelUsername.setText("Create new student account");

        javax.swing.GroupLayout jPanelTopBarLayout = new javax.swing.GroupLayout(jPanelTopBar);
        jPanelTopBar.setLayout(jPanelTopBarLayout);
        jPanelTopBarLayout.setHorizontalGroup(
            jPanelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopBarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jLabelUsername)
                .addGap(241, 241, 241)
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

        jPanel3.setBackground(new java.awt.Color(132, 148, 168));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 21, 9));
        jLabel1.setText("SET ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(104, 21, 9));
        jLabel3.setText("Student full name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 21, 9));
        jLabel4.setText("Date of Birth");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(104, 21, 9));
        jLabel5.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(104, 21, 9));
        jLabel7.setText("Phone number");

        jTextFieldSETID.setBackground(new java.awt.Color(243, 238, 217));
        jTextFieldSETID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldSETID.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldSETID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldName.setBackground(new java.awt.Color(243, 238, 217));
        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jDateChooser1.setBackground(new java.awt.Color(243, 238, 217));
        jDateChooser1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setMaxSelectableDate(new java.util.Date(1262287893000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(631135893000L));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(96, 28));

        jTextFieldphone.setBackground(new java.awt.Color(243, 238, 217));
        jTextFieldphone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldphone.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton1.setBackground(new java.awt.Color(132, 148, 168));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(243, 238, 217));
        jRadioButton1.setText("Male");

        jRadioButton2.setBackground(new java.awt.Color(132, 148, 168));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(243, 238, 217));
        jRadioButton2.setText("Female");

        jTextFieldPRN.setBackground(new java.awt.Color(243, 238, 217));
        jTextFieldPRN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldPRN.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPRN.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(104, 21, 9));
        jLabel14.setText("PRN");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(104, 21, 9));
        jLabel15.setText("Branch");

        jTextFieldDivision.setBackground(new java.awt.Color(243, 238, 217));
        jTextFieldDivision.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldDivision.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDivision.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(104, 21, 9));
        jLabel16.setText("Division");

        jComboBoxBranch.setBackground(new java.awt.Color(243, 238, 217));
        jComboBoxBranch.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jComboBoxBranch.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "AIML", "RA", "MECH", "CIVIL", "ENTC", "CIVIL" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(104, 21, 9));
        jLabel8.setText("Batch");

        jComboBoxBatch.setBackground(new java.awt.Color(243, 238, 217));
        jComboBoxBatch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxBatch.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxBatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19-23", "20-24", "21-25", "22-26" }));
        jComboBoxBatch.setSelectedIndex(2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPRN, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSETID, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSETID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelReset.setBackground(new java.awt.Color(104, 21, 9));
        jLabelReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelReset.setForeground(new java.awt.Color(243, 238, 217));
        jLabelReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReset.setText("Reset");
        jLabelReset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReset.setOpaque(true);
        jLabelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelResetMouseClicked(evt);
            }
        });

        jLabelSaveDetails.setBackground(new java.awt.Color(104, 21, 9));
        jLabelSaveDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSaveDetails.setForeground(new java.awt.Color(243, 238, 217));
        jLabelSaveDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaveDetails.setText("Save");
        jLabelSaveDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelSaveDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSaveDetails.setOpaque(true);
        jLabelSaveDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveDetailsMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(132, 148, 168));

        jLabel9.setBackground(new java.awt.Color(104, 21, 9));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(104, 21, 9));
        jLabel9.setText("Log out");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(148, 188, 199));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(104, 21, 9));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><div style='text-align:center'>Transportation<br>Details</div></html>");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(104, 21, 9));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html><div style='text-align:center'>Class<br>Timetable</div></html>");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(104, 21, 9));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html><div style='text-align:center'>Make<br>Announcements</div></html>");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(104, 21, 9));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("<html><div style='text-align:center'>Academic<br>Timetable</div></html>");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(148, 188, 199));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(104, 21, 9));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html><div style='text-align:center'>Student<br>Account</div></html>");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel17)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jLabel13)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(132, 148, 168));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMessage.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(132, 148, 168));
        jLabelMessage.setText("message");
        jPanel4.add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 761, -1));

        jLabelUN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelUN.setForeground(new java.awt.Color(132, 148, 168));
        jLabelUN.setText("username");
        jPanel4.add(jLabelUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 761, -1));

        jLabelP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelP.setForeground(new java.awt.Color(132, 148, 168));
        jLabelP.setText("password");
        jPanel4.add(jLabelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 761, -1));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(132, 148, 168));
        jLabelEmail.setText("emiail");
        jPanel4.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 761, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabelReset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSaveDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelReset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSaveDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);     //  exit
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);    // minimize
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        jTextFieldSETID.setText("");
        jTextFieldName.setText("");
        jTextFieldphone.setText("");
        jTextFieldPRN.setText("");
        jTextFieldDivision.setText("");
        jDateChooser1.setDate(null);
        buttonGroup1.clearSelection();
        jComboBoxBranch.setSelectedIndex(0);
        jComboBoxBatch.setSelectedIndex(2);
        jLabelMessage.setForeground(new Color(132,148,168));
        jLabelUN.setForeground(new Color(132,148,168));
        jLabelP.setForeground(new Color(132,148,168));
        jLabelEmail.setForeground(new Color(132,148,168));
        
    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelSaveDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveDetailsMouseClicked
        // TODO add your handling code here:
        // saving
        try{
            if(checkDetails()){
                
                String setIdText = jTextFieldSETID.getText().trim();
                long set_id = Long.parseLong(setIdText);

                String PRNText = jTextFieldPRN.getText().trim();
                long prn = Long.parseLong(PRNText);

                String name = this.getName(jTextFieldName.getText().trim());
                String batch = jComboBoxBatch.getSelectedItem().toString();
                String branch = jComboBoxBranch.getSelectedItem().toString();
                String division = jTextFieldDivision.getText().trim();

                String generated[] = generateID(name);
                String username = generated[0];
                String password = generated[1];
                String email = generated[2];
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","pi22/7");

                // inserting records
                String columns = "(set_id, prn, name, username, password, batch, branch, division, email)";
                
                String sql = "INSERT INTO cs_student "+columns+" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                
                // check the manual that corresponds to your MySQL server version 
                // for the right syntax to use near 'division, email) VALUES (123456789, 
                // 22070122520, 'Sanjana', 'Sanjana.btech2021',' at line 1
                                

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setLong(1, set_id);
                ps.setLong(2, prn);
                ps.setString(3, name);
                ps.setString(4, username);
                ps.setString(5, password);
                ps.setString(6, batch);
                ps.setString(7, branch);
                ps.setString(8, division);
                ps.setString(9, email);
                
                if (ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(this, "Student record added successfully");
                    jLabelMessage.setText("Username, Password, and Email Generated for: "+name);
                    jLabelMessage.setForeground(new Color(104,21,9));
                    jLabelUN.setText("Username: "+username);
                    jLabelUN.setForeground(new Color(104,21,9));
                    jLabelP.setText("Password: "+password);
                    jLabelP.setForeground(new Color(104,21,9));
                    jLabelEmail.setText("Email: "+email);
                    jLabelEmail.setForeground(new Color(104,21,9));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Could not upload to database");
                }
                con.close();
            }
            else {
                JOptionPane.showMessageDialog(this, "Fill all the retails");
            }
        }
        catch(SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(this, "This PRN already exists");
        }
        catch(SQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(this, "Could not upload to database");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, e);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        
    }//GEN-LAST:event_jLabelSaveDetailsMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openLoginPage();
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminTransport();
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminClassTT();
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminStudentAcc();
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminAcademicTT();
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        JavaProject page = new JavaProject();
        page.openAdminAnnouncements();
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxBatch;
    private javax.swing.JComboBox<String> jComboBoxBranch;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelP;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSaveDetails;
    private javax.swing.JLabel jLabelUN;
    public javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextFieldDivision;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPRN;
    private javax.swing.JTextField jTextFieldSETID;
    private javax.swing.JTextField jTextFieldphone;
    // End of variables declaration//GEN-END:variables
}
