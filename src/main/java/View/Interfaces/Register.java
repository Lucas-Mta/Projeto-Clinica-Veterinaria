/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Interfaces;

import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        cpfLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        adressLabel = new javax.swing.JLabel();
        adressTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        mailLabel = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        secretaryRadioButton = new javax.swing.JRadioButton();
        vetRadioButton = new javax.swing.JRadioButton();
        registerButton = new javax.swing.JButton();
        haveAnAccountLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER");
        setMinimumSize(new java.awt.Dimension(550, 670));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(243, 243, 243));
        mainPanel.setMaximumSize(new java.awt.Dimension(550, 670));
        mainPanel.setMinimumSize(new java.awt.Dimension(550, 670));
        mainPanel.setPreferredSize(new java.awt.Dimension(550, 670));

        registerLabel.setBackground(java.awt.SystemColor.textText);
        registerLabel.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(9, 163, 88));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("CADASTRO");

        infoPanel.setBackground(new java.awt.Color(243, 243, 243));

        cpfLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfLabel.setText("CPF:");

        cpfTextField.setBackground(new java.awt.Color(255, 255, 255));
        cpfTextField.setForeground(new java.awt.Color(102, 102, 102));
        cpfTextField.setText("000.000.000-00");
        cpfTextField.setPreferredSize(new java.awt.Dimension(370, 25));
        cpfTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfTextFieldFocusLost(evt);
            }
        });
        cpfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTextFieldActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Nome:");

        nameTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameTextField.setForeground(new java.awt.Color(102, 102, 102));
        nameTextField.setText("Digite o nome completo...");
        nameTextField.setPreferredSize(new java.awt.Dimension(370, 25));
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        adressLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adressLabel.setForeground(new java.awt.Color(0, 0, 0));
        adressLabel.setText("Endereço:");

        adressTextField.setBackground(new java.awt.Color(255, 255, 255));
        adressTextField.setForeground(new java.awt.Color(102, 102, 102));
        adressTextField.setText("Digite o endereço completo...");
        adressTextField.setPreferredSize(new java.awt.Dimension(370, 25));
        adressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adressTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adressTextFieldFocusLost(evt);
            }
        });
        adressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressTextFieldActionPerformed(evt);
            }
        });

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneLabel.setText("Telefone:");

        phoneTextField.setBackground(new java.awt.Color(255, 255, 255));
        phoneTextField.setForeground(new java.awt.Color(102, 102, 102));
        phoneTextField.setText("(xx) xxxxx-xxxx");
        phoneTextField.setPreferredSize(new java.awt.Dimension(370, 25));
        phoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusLost(evt);
            }
        });

        mailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(0, 0, 0));
        mailLabel.setText("Email:");

        mailTextField.setBackground(new java.awt.Color(255, 255, 255));
        mailTextField.setForeground(new java.awt.Color(102, 102, 102));
        mailTextField.setText("exemplo@email.com");
        mailTextField.setPreferredSize(new java.awt.Dimension(370, 25));
        mailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTextFieldFocusLost(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Senha:");

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setForeground(new java.awt.Color(102, 102, 102));
        passwordTextField.setText("Digite sua senha...");
        passwordTextField.setPreferredSize(new java.awt.Dimension(370, 25));
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusLost(evt);
            }
        });

        buttonGroup1.add(secretaryRadioButton);
        secretaryRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secretaryRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        secretaryRadioButton.setText("Secretário(a)");

        buttonGroup1.add(vetRadioButton);
        vetRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vetRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        vetRadioButton.setText("Veterinário(a)");
        vetRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetRadioButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(9, 163, 88));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Cadastrar");
        registerButton.setBorderPainted(false);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setPreferredSize(new java.awt.Dimension(200, 40));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        haveAnAccountLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        haveAnAccountLabel.setForeground(new java.awt.Color(153, 153, 153));
        haveAnAccountLabel.setText("Já possuo uma conta:");

        loginButton.setBackground(new java.awt.Color(9, 163, 88));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(secretaryRadioButton)
                .addGap(71, 71, 71)
                .addComponent(vetRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(mailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(adressLabel)
                            .addComponent(cpfLabel))
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cpfTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addComponent(haveAnAccountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLabel)
                    .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vetRadioButton)
                    .addComponent(secretaryRadioButton))
                .addGap(52, 52, 52)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(haveAnAccountLabel)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(registerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(173, 173, 173))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(registerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vetRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vetRadioButtonActionPerformed

    private void cpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Ir para a área de Login
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void cpfTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfTextFieldFocusGained
        cpfTextField.setText("");
    }//GEN-LAST:event_cpfTextFieldFocusGained

    private void cpfTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfTextFieldFocusLost
        cpfTextField.setText("000.000.000-00");        
    }//GEN-LAST:event_cpfTextFieldFocusLost

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained
        nameTextField.setText("");        
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        nameTextField.setText("Digite o nome completo...");  
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void adressTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adressTextFieldFocusGained
        adressTextField.setText("");        
    }//GEN-LAST:event_adressTextFieldFocusGained

    private void adressTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adressTextFieldFocusLost
        adressTextField.setText("Digite o endereço completo..."); 
    }//GEN-LAST:event_adressTextFieldFocusLost

    private void adressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressTextFieldActionPerformed
    }//GEN-LAST:event_adressTextFieldActionPerformed

    private void phoneTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusGained
        phoneTextField.setText("");  
    }//GEN-LAST:event_phoneTextFieldFocusGained

    private void phoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusLost
        phoneTextField.setText("(xx) xxxxx-xxxx");  
    }//GEN-LAST:event_phoneTextFieldFocusLost

    private void mailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextFieldFocusGained
        mailTextField.setText("");  
    }//GEN-LAST:event_mailTextFieldFocusGained

    private void mailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTextFieldFocusLost
        mailTextField.setText("exemplo@email.com");  
    }//GEN-LAST:event_mailTextFieldFocusLost

    private void passwordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusGained
        passwordTextField.setText("");  
    }//GEN-LAST:event_passwordTextFieldFocusGained

    private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost
        passwordTextField.setText("Digite sua senha...");  
    }//GEN-LAST:event_passwordTextFieldFocusLost

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // Fazer a lógica do Cadastro
        
        // Concluir o cadastro e ir para a área de login
        JOptionPane.showMessageDialog(null, "Cadastro concluído");
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerButtonActionPerformed
   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JLabel haveAnAccountLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JRadioButton secretaryRadioButton;
    private javax.swing.JRadioButton vetRadioButton;
    // End of variables declaration//GEN-END:variables
}
