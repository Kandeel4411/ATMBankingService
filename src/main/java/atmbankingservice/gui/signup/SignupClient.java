
package atmbankingservice.gui.signup;

import atmbankingservice.backend.Client;
import atmbankingservice.backend.Person;
import atmbankingservice.gui.ATMFrame;
import atmbankingservice.gui.Home;

public class SignupClient extends ATMFrame {
        public Person user;

        public SignupClient(Person _user) {
                initComponents();
                user = _user;
        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                UsernameField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                FinishButton = new javax.swing.JButton();
                BackButton = new javax.swing.JButton();
                ConfirmPasswordField = new javax.swing.JPasswordField();
                PasswordField = new javax.swing.JPasswordField();
                ErrorPassword = new javax.swing.JLabel();
                ErrorUsername = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/atmbankingservice/gui/Icons/icons8-name-tag-50.png"))); // NOI18N
                jLabel1.setText("Register User Account");

                jLabel2.setText("Username");

                jLabel3.setText("Password");

                jLabel4.setText("Confirm Password");

                FinishButton.setText("Finish");
                FinishButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                FinishButtonActionPerformed(evt);
                        }
                });

                BackButton.setText("Back");
                BackButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BackButtonActionPerformed(evt);
                        }
                });

                ErrorPassword.setVisible(false);
                ErrorPassword.setForeground(new java.awt.Color(255, 0, 0));
                ErrorPassword.setText("jLabel5");

                ErrorUsername.setVisible(false);
                ErrorUsername.setForeground(new java.awt.Color(255, 0, 0));
                ErrorUsername.setText("jLabel5");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(183, 183, 183).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(ErrorUsername)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addComponent(ErrorPassword)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                100, Short.MAX_VALUE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(BackButton)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(PasswordField,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGap(0, 101, Short.MAX_VALUE)
                                                                                                                .addComponent(FinishButton))
                                                                                                .addComponent(UsernameField,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(ConfirmPasswordField))))
                                                                .addGap(166, 166, 166)))));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(UsernameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ErrorUsername)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel3).addComponent(PasswordField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel4)
                                                                .addComponent(ConfirmPasswordField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ErrorPassword).addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(FinishButton).addComponent(BackButton))
                                                .addGap(45, 45, 45)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackButtonActionPerformed
                new SignupUser().setVisible(true);
                this.dispose();
        }// GEN-LAST:event_BackButtonActionPerformed

        private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FinishButtonActionPerformed
                String username = UsernameField.getText();
                String password = String.valueOf(PasswordField.getPassword());

                ErrorPassword.setVisible(false);
                ErrorUsername.setVisible(false);

                if (username.equals("")) {
                        ErrorUsername.setText("Error: Username can't be empty.");
                        ErrorUsername.setVisible(true);
                        return;
                }
                if (password.equals("")) {
                        ErrorPassword.setText("Error: Password can't be empty");
                        ErrorPassword.setVisible(true);
                        return;
                }

                if (!password.equals(String.valueOf(ConfirmPasswordField.getPassword()))) {
                        ErrorPassword.setText("Error: passwords don't match.");
                        ErrorPassword.setVisible(true);
                        return;
                }

                Client client = new Client(username, password, this.user);
                if (!ATMService.addClient(client)) {
                        ErrorUsername.setText("Error: Username already taken.");
                        ErrorUsername.setVisible(true);
                        return;
                } else {
                        new Home().setVisible(true);
                        this.dispose();
                }

        }// GEN-LAST:event_FinishButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BackButton;
        private javax.swing.JPasswordField ConfirmPasswordField;
        private javax.swing.JLabel ErrorPassword;
        private javax.swing.JLabel ErrorUsername;
        private javax.swing.JButton FinishButton;
        private javax.swing.JPasswordField PasswordField;
        private javax.swing.JTextField UsernameField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        // End of variables declaration//GEN-END:variables
}
