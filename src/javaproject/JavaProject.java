
package javaproject;

import Student.*;
import Admin.*;
import javax.swing.JFrame;


public class JavaProject {
    
    // opens login page
    public void openLoginPage(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    
    public void openStudentHomePage(String name){
        StudentHomePage shPage = new StudentHomePage(name);
        shPage.setVisible(true);
        shPage.pack();
        shPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openStudentAcdemicTT(String name){
        Student_AcademicTimetable Page = new Student_AcademicTimetable(name);
        Page.setVisible(true);
        Page.pack();
        Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public void openStudentAnnouncements(String name){
        Student_Announcements Page = new Student_Announcements(name);
        Page.setVisible(true);
        Page.pack();
        Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openStudentClassTT(String name){
        ClassTimetable acPage = new ClassTimetable(name);
        acPage.setVisible(true);
        acPage.pack();
        acPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openStudentTransport(String name){
        TransportationDetails tdPage = new TransportationDetails(name);
        tdPage.setVisible(true);
        tdPage.pack();
        tdPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openAdminHomePage(String name){
        AdminPage adPage = new AdminPage(name);
        adPage.setVisible(true);
        adPage.pack();
        adPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openAdminTransport(){
        AdminTransport Page = new AdminTransport();
        Page.setVisible(true);
        Page.pack();
        Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void openAdminStudentAcc(){
        Admin_NewStudentAcc nsPage = new Admin_NewStudentAcc();
        nsPage.setVisible(true);
        nsPage.pack();
        nsPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openAdminClassTT(){
        Admin_ClassTimetable Page = new Admin_ClassTimetable();
        Page.setVisible(true);
        Page.pack();
        Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openAdminAcademicTT(){
        Admin_AcademicTimetable Page = new Admin_AcademicTimetable();
        Page.setVisible(true);
        Page.pack();
        Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void openAdminAnnouncements(){
        Admin_Announcements Page = new Admin_Announcements();
        Page.setVisible(true);
        Page.pack();
        Page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        JavaProject studentPortal = new JavaProject();
        studentPortal.openLoginPage();
    }
    
}
