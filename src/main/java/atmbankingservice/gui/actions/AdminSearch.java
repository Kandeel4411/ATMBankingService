
package atmbankingservice.gui.actions;

import atmbankingservice.backend.Client;
import atmbankingservice.gui.login.LoginClient;
import atmbankingservice.gui.ATMFrame;

import java.awt.Insets;

public class AdminSearch extends ATMFrame {

        public Client admin;

        public AdminSearch(Client _admin) {
                admin = _admin;
                initComponents();
        }

        private void initComponents() {

                ClientsList = new javax.swing.JButton();
                BackButton = new javax.swing.JButton();
                SearchField = new javax.swing.JTextField();
                ConfirmSearch = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                ClientsList.setFocusPainted(false);
                ClientsList.setMargin(new Insets(0, 0, 0, 0));
                ClientsList.setContentAreaFilled(false);
                ClientsList.setBorderPainted(false);
                ClientsList.setOpaque(false);

                BackButton.setFocusPainted(false);
                BackButton.setMargin(new Insets(0, 0, 0, 0));
                BackButton.setContentAreaFilled(false);
                BackButton.setBorderPainted(false);
                BackButton.setOpaque(false);
                BackButton.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/atmbankingservice/gui/Icons/icons8-password-reset-50.png"))); // NOI18N
                BackButton.setText("Go Back");
                BackButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BackButtonActionPerformed(evt);
                        }
                });

                SearchField.setText("Enter client username...");

                ConfirmSearch.setFocusPainted(false);
                ConfirmSearch.setMargin(new Insets(0, 0, 0, 0));
                ConfirmSearch.setContentAreaFilled(false);
                ConfirmSearch.setBorderPainted(false);
                ConfirmSearch.setOpaque(false);
                ConfirmSearch.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/atmbankingservice/gui/Icons/icons8-atm-pin-code-50.png"))); // NOI18N
                ConfirmSearch.setText("Search");
                ConfirmSearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ConfirmSearchActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(79, 79, 79).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(BackButton)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(ConfirmSearch))
                                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 248,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(67, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ClientsList, javax.swing.GroupLayout.PREFERRED_SIZE, 343,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap(13, Short.MAX_VALUE)
                                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ClientsList, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(ConfirmSearch).addComponent(BackButton))
                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackButtonActionPerformed
                new LoginClient(admin).setVisible(true);
                this.dispose();
        }// GEN-LAST:event_BackButtonActionPerformed

        private void ConfirmSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ConfirmSearchActionPerformed
                StringBuilder table = new StringBuilder();
                table.append("<tr><td>Username</td><td>ID</td><td>Balance</td><tr>");

                String username = SearchField.getText();
                for (Client c : ATMService.clients) {
                        if (c.getUsername().equalsIgnoreCase(username)) {
                                table.append("<tr style=\"border: solid 1px black\">");
                                table.append(c);
                                table.append("</tr>");
                                String CSS = "<style> td { text-align: center;} </style>";
                                ClientsList.setText("<html>" + CSS + "<table>" + table.toString() + "</table></html>");
                                return;
                        }
                }
                ClientsList.setText("No clients were found with that username.");
        }// GEN-LAST:event_ConfirmSearchActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BackButton;
        private javax.swing.JButton ClientsList;
        private javax.swing.JButton ConfirmSearch;
        private javax.swing.JTextField SearchField;
        // End of variables declaration//GEN-END:variables
}
