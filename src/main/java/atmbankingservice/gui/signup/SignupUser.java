
package atmbankingservice.gui.signup;

import atmbankingservice.backend.Person;
import atmbankingservice.gui.ATMFrame;
import atmbankingservice.gui.Home;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class SignupUser extends ATMFrame {
        public Character gender;

        public SignupUser() {
                initComponents();
                gender = '-';
        }

        private void initComponents() {

                GenderValue = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                BirthDateField = new javax.swing.JTextField();
                Male = new javax.swing.JRadioButton();
                Female = new javax.swing.JRadioButton();
                NameField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                NextButton = new javax.swing.JButton();
                BackButton = new javax.swing.JButton();
                BirthError = new javax.swing.JLabel();
                NameError = new javax.swing.JLabel();
                GenderError = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/atmbankingservice/gui/Icons/icons8-payroll-50.png"))); // NOI18N
                jLabel1.setText("Register User");

                BirthDateField.setText("YYYY-MM-DD");

                GenderValue.add(Male);
                Male.setText("Male");
                Male.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                MaleActionPerformed(evt);
                        }
                });

                GenderValue.add(Female);
                Female.setText("Female");
                Female.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                FemaleActionPerformed(evt);
                        }
                });

                jLabel2.setText("Name");

                jLabel3.setText("Birthday");

                jLabel4.setText("Gender");

                NextButton.setText("Next");
                NextButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                NextButtonActionPerformed(evt);
                        }
                });

                BackButton.setText("Back");
                BackButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BackButtonActionPerformed(evt);
                        }
                });

                BirthError.setVisible(false);
                BirthError.setForeground(new java.awt.Color(255, 0, 0));
                BirthError.setText("Error");

                NameError.setVisible(false);
                NameError.setForeground(new java.awt.Color(255, 0, 0));
                NameError.setText("Error");

                GenderError.setVisible(false);
                GenderError.setForeground(new java.awt.Color(255, 0, 0));
                GenderError.setText("Error");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(BackButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(NextButton).addGap(109, 109, 109))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(220, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                276,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                67,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                83,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(NameField,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                223,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(BirthDateField,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                223,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(Male,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                140,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(Female,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                151,
                                                                                                                                                Short.MAX_VALUE)))))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(NameError,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                113, Short.MAX_VALUE)
                                                                .addComponent(BirthError,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(GenderError,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGap(27, 27, 27)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jLabel1)
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(NameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2).addComponent(NameError))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(BirthDateField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3).addComponent(BirthError))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(Male).addComponent(Female)
                                                                .addComponent(GenderError).addComponent(jLabel4))
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(BackButton).addComponent(NextButton))
                                                .addGap(53, 53, 53)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackButtonActionPerformed
                new Home().setVisible(true);
                this.dispose();
        }

        private void MaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MaleActionPerformed
                this.gender = 'M';
        }

        private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FemaleActionPerformed
                this.gender = 'F';
        }

        private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NextButtonActionPerformed
                NameError.setVisible(false);
                BirthError.setVisible(false);
                GenderError.setVisible(false);

                String name = NameField.getText();
                CharSequence birthday = BirthDateField.getText();
                boolean flag = false;
                if (this.gender == '-') {
                        GenderError.setText("Error: Must choose an option");
                        GenderError.setVisible(true);
                        flag = true;
                }
                if (name.equals("")) {
                        NameError.setText("Error: Empty name entered.");
                        NameError.setVisible(true);
                        flag = true;
                }
                try {
                        LocalDate birthDate = LocalDate.parse(birthday);

                        Person user = new Person(name, this.gender, birthDate);

                        new SignupClient(user).setVisible(true);
                        this.dispose();

                } catch (DateTimeParseException ex) {
                        BirthError.setText("Error: Invalid date format entered.");
                        BirthError.setVisible(true);
                        flag = true;
                }

                if (flag) {
                        return;
                }
        }// GEN-LAST:event_NextButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BackButton;
        private javax.swing.JTextField BirthDateField;
        private javax.swing.JLabel BirthError;
        private javax.swing.JRadioButton Female;
        private javax.swing.JLabel GenderError;
        private javax.swing.ButtonGroup GenderValue;
        private javax.swing.JRadioButton Male;
        private javax.swing.JLabel NameError;
        private javax.swing.JTextField NameField;
        private javax.swing.JButton NextButton;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        // End of variables declaration//GEN-END:variables
}
