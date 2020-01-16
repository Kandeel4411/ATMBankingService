
package atmbankingservice.gui.login;

import atmbankingservice.backend.Client;
import atmbankingservice.gui.ATMFrame;
import atmbankingservice.gui.Home;
import atmbankingservice.gui.actions.*;

import java.awt.Insets;

public class LoginClient extends ATMFrame {
    public Client client;

    public LoginClient(Client _client) {
        client = _client;
        initComponents();
        if (client.getUsername().equals("admin")) {
            AdminSearch.setVisible(true);
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        WithdrawButton = new javax.swing.JButton();
        DepositButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        OwnersButton = new javax.swing.JButton();
        BalanceButton = new javax.swing.JButton();
        AdminSearch = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Welcome " + client.getUsername() + "!");

        WithdrawButton.setFocusPainted(false);
        WithdrawButton.setMargin(new Insets(0, 0, 0, 0));
        WithdrawButton.setContentAreaFilled(false);
        WithdrawButton.setBorderPainted(false);
        WithdrawButton.setOpaque(false);
        WithdrawButton.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-withdrawal-50.png"))); // NOI18N
        WithdrawButton.setText("<html> <b> <u> Make a withdrawal. </u> </b> </html>");
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });

        DepositButton.setFocusPainted(false);
        DepositButton.setMargin(new Insets(0, 0, 0, 0));
        DepositButton.setContentAreaFilled(false);
        DepositButton.setBorderPainted(false);
        DepositButton.setOpaque(false);
        DepositButton.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-deposit-50.png"))); // NOI18N
        DepositButton.setText("<html> <b> <u> Make a deposit. </u> </b> </html>");
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        HistoryButton.setFocusPainted(false);
        HistoryButton.setMargin(new Insets(0, 0, 0, 0));
        HistoryButton.setContentAreaFilled(false);
        HistoryButton.setBorderPainted(false);
        HistoryButton.setOpaque(false);
        HistoryButton.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-pos-terminal-50.png"))); // NOI18N
        HistoryButton.setText("<html> <b> <u>Transaction History. </u> </b> </html>");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        OwnersButton.setFocusPainted(false);
        OwnersButton.setMargin(new Insets(0, 0, 0, 0));
        OwnersButton.setContentAreaFilled(false);
        OwnersButton.setBorderPainted(false);
        OwnersButton.setOpaque(false);
        OwnersButton.setText("<html> <b> <u> Owners </u> </b> </html>");
        OwnersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnersButtonActionPerformed(evt);
            }
        });

        BalanceButton.setFocusPainted(false);
        BalanceButton.setMargin(new Insets(0, 0, 0, 0));
        BalanceButton.setContentAreaFilled(false);
        BalanceButton.setBorderPainted(false);
        BalanceButton.setOpaque(false);
        BalanceButton.setText("Balance");
        BalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceButtonActionPerformed(evt);
            }
        });

        AdminSearch.setVisible(false);
        AdminSearch.setFocusPainted(false);
        AdminSearch.setMargin(new Insets(0, 0, 0, 0));
        AdminSearch.setContentAreaFilled(false);
        AdminSearch.setBorderPainted(false);
        AdminSearch.setOpaque(false);
        AdminSearch.setText("<html> <b style=\"color:red\"> <u> Search </u> </b> </html>");
        AdminSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminSearchActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                        .createSequentialGroup().addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(WithdrawButton).addComponent(HistoryButton,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout
                                .createSequentialGroup()
                                .addGroup(layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(139, 139, 139)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
                                                .addComponent(LogoutButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BalanceButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OwnersButton)
                                        .addComponent(AdminSearch, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OwnersButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WithdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(BalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdminSearch, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DepositButtonActionPerformed
        String type = "Deposit";
        new BalanceAction(client, type).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_DepositButtonActionPerformed

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_WithdrawButtonActionPerformed
        String type = "Withdraw";
        new BalanceAction(client, type).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_WithdrawButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_HistoryButtonActionPerformed
        new TransactionHistory(client).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_HistoryButtonActionPerformed

    private void OwnersButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OwnersButtonActionPerformed
        new Owners(client).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_OwnersButtonActionPerformed

    private void BalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BalanceButtonActionPerformed
        try {
            if (BalanceButton.getText() == "Balance") {
                BalanceButton.setText(
                        "<html><b style=\"color:green\">" + String.valueOf(client.getBalance() + "</b></html>"));
            } else {
                BalanceButton.setText("Balance");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }// GEN-LAST:event_BalanceButtonActionPerformed

    private void AdminSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AdminSearchActionPerformed
        new AdminSearch(client).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_AdminSearchActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LogoutButtonActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_LogoutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminSearch;
    private javax.swing.JButton BalanceButton;
    private javax.swing.JButton DepositButton;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OwnersButton;
    private javax.swing.JButton WithdrawButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
