/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ServiceStorageConferences;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;
import models.Conference;
import utilities.Utilities;

/**
 *
 * @author Isabela Sánchez Saavedra <isanchez@unicauca.edu.co>
 */
public class VProfileOrganizer extends javax.swing.JFrame {
    private List<Conference> conferenceList;
    private int idOrganizer;
    private ServiceStorageConferences serviceConferences;
    private VCreateConference createConferenceWindow;
    /**
     * Creates new form JProfileOrganizer
     */
    public VProfileOrganizer(ServiceStorageConferences service, int idOrganizer) {
        initComponents();
        this.serviceConferences = service;
        this.idOrganizer = idOrganizer; 
        List<Conference> conferences = service.listConferencesByOrganizer(this.idOrganizer);
        loadConferences(conferences);
    }
    
    public void loadConferences(List<Conference> conferences) {
        if (conferences.isEmpty()) {
            jPanelNoConferences.setVisible(true);
            jPanelConferences.setVisible(false);
        } else {
            jPanelNoConferences.setVisible(false);
            jPanelConferences.setVisible(true);

            DefaultListModel<String> model = new DefaultListModel<>();
            for (Conference conf : conferences) {
                model.addElement(conf.getName() + " - " + conf.getStartDate());
            }
            jListConferences.setModel(model);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelConferences = new javax.swing.JPanel();
        jLabelLupa1 = new javax.swing.JLabel();
        jTextFieldSearch1 = new javax.swing.JTextField();
        jScrollPaneConferences = new javax.swing.JScrollPane();
        jListConferences = new javax.swing.JList<>();
        jPanelNoConferences = new javax.swing.JPanel();
        jLabelNoC1 = new javax.swing.JLabel();
        jLabelNoC2 = new javax.swing.JLabel();
        jLabelNoC3 = new javax.swing.JLabel();
        jLabelNoC4 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabelLupa = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jPanelMinimize = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelProfile = new javax.swing.JLabel();
        jLabelConferences = new javax.swing.JLabel();
        jLabelMessages = new javax.swing.JLabel();
        jLabelConf1 = new javax.swing.JLabel();
        jLabelConf2 = new javax.swing.JLabel();
        jLabelConf3 = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(1, 143, 166));
        jPanelBackground.setForeground(new java.awt.Color(204, 204, 204));
        jPanelBackground.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanelBackground.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelConferences.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConferences.setMaximumSize(new java.awt.Dimension(330, 320));
        jPanelConferences.setMinimumSize(new java.awt.Dimension(330, 320));
        jPanelConferences.setPreferredSize(new java.awt.Dimension(330, 320));
        jPanelConferences.setRequestFocusEnabled(false);
        jPanelConferences.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa36.png"))); // NOI18N
        jPanelConferences.add(jLabelLupa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jTextFieldSearch1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSearch1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldSearch1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSearch1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelConferences.add(jTextFieldSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 260, 26));

        jScrollPaneConferences.setBackground(new java.awt.Color(255, 255, 255));

        jListConferences.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneConferences.setViewportView(jListConferences);

        jPanelConferences.add(jScrollPaneConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 210));

        jPanelBackground.add(jPanelConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 105, -1, -1));

        jPanelNoConferences.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNoConferences.setMaximumSize(new java.awt.Dimension(310, 320));
        jPanelNoConferences.setMinimumSize(new java.awt.Dimension(310, 320));
        jPanelNoConferences.setPreferredSize(new java.awt.Dimension(330, 320));
        jPanelNoConferences.setRequestFocusEnabled(false);
        jPanelNoConferences.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNoC1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabelNoC1.setForeground(new java.awt.Color(233, 233, 233));
        jLabelNoC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoC1.setText("Usted no ha");
        jPanelNoConferences.add(jLabelNoC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 330, -1));

        jLabelNoC2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabelNoC2.setForeground(new java.awt.Color(233, 233, 233));
        jLabelNoC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoC2.setText("registrado");
        jLabelNoC2.setMaximumSize(new java.awt.Dimension(227, 44));
        jLabelNoC2.setMinimumSize(new java.awt.Dimension(227, 44));
        jLabelNoC2.setPreferredSize(new java.awt.Dimension(227, 44));
        jPanelNoConferences.add(jLabelNoC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 330, -1));

        jLabelNoC3.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabelNoC3.setForeground(new java.awt.Color(233, 233, 233));
        jLabelNoC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoC3.setText("ninguna");
        jLabelNoC3.setMaximumSize(new java.awt.Dimension(227, 44));
        jLabelNoC3.setMinimumSize(new java.awt.Dimension(227, 44));
        jLabelNoC3.setPreferredSize(new java.awt.Dimension(227, 44));
        jPanelNoConferences.add(jLabelNoC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, 330, -1));

        jLabelNoC4.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabelNoC4.setForeground(new java.awt.Color(233, 233, 233));
        jLabelNoC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoC4.setText("conferencia");
        jLabelNoC4.setMaximumSize(new java.awt.Dimension(227, 44));
        jLabelNoC4.setMinimumSize(new java.awt.Dimension(227, 44));
        jLabelNoC4.setPreferredSize(new java.awt.Dimension(227, 44));
        jPanelNoConferences.add(jLabelNoC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, 330, -1));

        jTextFieldSearch.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSearch.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelNoConferences.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 260, 26));

        jLabelLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa36.png"))); // NOI18N
        jPanelNoConferences.add(jLabelLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jPanelBackground.add(jPanelNoConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 105, 330, -1));

        jPanelHeader.setBackground(new java.awt.Color(24, 17, 67));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelHeaderMouseDragged(evt);
            }
        });
        jPanelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHeaderMousePressed(evt);
            }
        });
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelExit.setBackground(new java.awt.Color(24, 17, 67));

        jLabelExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitLayout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelHeader.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 0, -1, -1));

        jPanelMinimize.setBackground(new java.awt.Color(24, 17, 67));

        jLabelMinimize.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinimizeLayout = new javax.swing.GroupLayout(jPanelMinimize);
        jPanelMinimize.setLayout(jPanelMinimizeLayout);
        jPanelMinimizeLayout.setHorizontalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMinimizeLayout.setVerticalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinimizeLayout.createSequentialGroup()
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelHeader.add(jPanelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelLogo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(193, 255, 114));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/triangle32.png"))); // NOI18N
        jLabelLogo.setText("meeting");
        jPanelHeader.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 60));

        jLabelProfile.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelProfile.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProfile.setText("Mi perfil");
        jLabelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelProfile.setMaximumSize(new java.awt.Dimension(60, 18));
        jLabelProfile.setMinimumSize(new java.awt.Dimension(60, 18));
        jLabelProfile.setName(""); // NOI18N
        jLabelProfile.setPreferredSize(new java.awt.Dimension(60, 18));
        jPanelHeader.add(jLabelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 60));

        jLabelConferences.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelConferences.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConferences.setText("Conferencias");
        jLabelConferences.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHeader.add(jLabelConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 60));

        jLabelMessages.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelMessages.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMessages.setText("Mensajes");
        jPanelHeader.add(jLabelMessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jPanelBackground.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabelConf1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabelConf1.setForeground(new java.awt.Color(193, 255, 114));
        jLabelConf1.setText("Conferencias ");
        jLabelConf1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanelBackground.add(jLabelConf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, 373, 53));

        jLabelConf2.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabelConf2.setForeground(new java.awt.Color(193, 255, 114));
        jLabelConf2.setText("en las que eres ");
        jPanelBackground.add(jLabelConf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 164, 405, -1));

        jLabelConf3.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabelConf3.setForeground(new java.awt.Color(193, 255, 114));
        jLabelConf3.setText("organizador");
        jPanelBackground.add(jLabelConf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 229, 390, -1));

        jButtonRegister.setBackground(new java.awt.Color(34, 53, 162));
        jButtonRegister.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jButtonRegister.setText("Registra una conferencia");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanelBackground.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        Utilities.exitApp();
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        Utilities.changeColorOnMouseEnter(jPanelExit, jLabelExit, Color.red, Color.white);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        Utilities.changeColorOnMouseExit(jPanelExit, jLabelExit, Utilities.AZUL_OSCURO, Color.black);
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        Utilities.minimizeWindow(this);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        Utilities.changeColorOnMouseEnter(jPanelMinimize, jLabelMinimize, Color.red, Color.white);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        Utilities.changeColorOnMouseExit(jPanelMinimize, jLabelMinimize, Utilities.AZUL_OSCURO, Color.black);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        Utilities.headerMouseDragged(evt, this);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        Utilities.headerMousePressed(evt);
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        VCreateConference createConferenceWindow = new VCreateConference(serviceConferences, idOrganizer);
        createConferenceWindow.setVisible(true);
        
        System.out.println(serviceConferences); // Esto debe mostrar la instancia de service, no debe ser nulo

    }//GEN-LAST:event_jButtonRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(VProfileOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProfileOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProfileOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProfileOrganizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServiceStorageConferences service = new ServiceStorageConferences(new RepositoryConferenceArrayList());
                int idOrganizer = 1;
                new VProfileOrganizer(service, 1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelConf1;
    private javax.swing.JLabel jLabelConf2;
    private javax.swing.JLabel jLabelConf3;
    private javax.swing.JLabel jLabelConferences;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLupa;
    private javax.swing.JLabel jLabelLupa1;
    private javax.swing.JLabel jLabelMessages;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelNoC1;
    private javax.swing.JLabel jLabelNoC2;
    private javax.swing.JLabel jLabelNoC3;
    private javax.swing.JLabel jLabelNoC4;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JList<String> jListConferences;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelConferences;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JPanel jPanelNoConferences;
    private javax.swing.JScrollPane jScrollPaneConferences;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldSearch1;
    // End of variables declaration//GEN-END:variables
}
