package atmbankingservice.gui;

import java.awt.Insets;

import atmbankingservice.backend.Client;
import atmbankingservice.gui.login.LoginClient;
import atmbankingservice.gui.signup.SignupUser;

public class Home extends ATMFrame {
        public Integer loginTries;

        private javax.swing.JButton loginButton;
        private javax.swing.JButton signupButton;

        private javax.swing.JLabel passwordLabel;
        private javax.swing.JPasswordField passwordField;

        private javax.swing.JLabel usernameLabel;
        private javax.swing.JTextField usernameField;

        private javax.swing.JLabel triesLabel;
        private javax.swing.JLabel headerLabel;

        public Home() {

                initComponents();
                loginTries = 4;
        }

        private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                for (Client c : ATMService.clients) {
                        if (c.logIn(username, password)) {
                                new LoginClient(c).setVisible(true);
                                this.dispose();
                        } else if (--loginTries == 0) {
                                System.exit(1);
                        } else {
                                triesLabel.setText("Warning! Tries left: " + loginTries);
                                triesLabel.setVisible(true);
                        }
                }
        }

        private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {
                new SignupUser().setVisible(true);
                this.dispose();
        }

        private void initComponents() {

                headerLabel = new javax.swing.JLabel();
                headerLabel.setFont(new java.awt.Font("Impact", 0, 18));
                headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                headerLabel.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/atmbankingservice/gui/Icons/icons8-atm-50.png")));
                headerLabel.setText("ATM BANKING SERVICE");
                headerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                headerLabel.setFocusable(false);

                usernameField = new javax.swing.JTextField();
                usernameLabel = new javax.swing.JLabel();
                usernameLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
                usernameLabel.setLabelFor(usernameField);
                usernameLabel.setText("Username:");

                passwordField = new javax.swing.JPasswordField();
                passwordLabel = new javax.swing.JLabel();
                passwordLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 12));
                passwordLabel.setLabelFor(passwordField);
                passwordLabel.setText("Password:");

                loginButton = new javax.swing.JButton();
                loginButton.setText("Login");
                loginButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                loginButtonActionPerformed(evt);
                        }
                });

                signupButton = new javax.swing.JButton();
                signupButton.setText("<html> <b> <u>Don't have an account? Sign up. </u> </b> </html>");
                signupButton.setFocusPainted(false);
                signupButton.setMargin(new Insets(0, 0, 0, 0));
                signupButton.setContentAreaFilled(false);
                signupButton.setBorderPainted(false);
                signupButton.setOpaque(false);
                signupButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                signupButtonActionPerformed(evt);
                        }
                });

                triesLabel = new javax.swing.JLabel();
                triesLabel.setVisible(false);
                triesLabel.setForeground(new java.awt.Color(255, 0, 0));
                triesLabel.setText("Warning!  Tries left: ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup().addGap(176, 176, 176).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86,
                                                                Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(passwordField,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                124, Short.MAX_VALUE)
                                                                .addComponent(usernameField))
                                                .addGap(174, 174, 174))
                                .addGroup(layout.createSequentialGroup().addGap(228, 228, 228)
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(triesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(151, 151, 151)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup().addGap(104, 104, 104).addComponent(headerLabel,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(usernameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(usernameLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(passwordLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                17,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(passwordField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(loginButton).addComponent(signupButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(triesLabel).addGap(97, 97, 97)));

                pack();
        }

}
