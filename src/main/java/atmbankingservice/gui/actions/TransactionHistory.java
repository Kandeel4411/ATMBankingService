
package atmbankingservice.gui.actions;

import atmbankingservice.backend.Client;
import atmbankingservice.backend.Transaction;

import atmbankingservice.gui.login.LoginClient;
import atmbankingservice.gui.ATMFrame;

import java.awt.Insets;

public class TransactionHistory extends ATMFrame {

    public Client client;

    public TransactionHistory(Client _client) {
        client = _client;
        initComponents();
        StringBuilder table = new StringBuilder();
        table.append("<tr><td>Type</td><td>Date</td><td>Amount</td><tr>");
        try {
            for (Transaction t : client.getTransactions()) {
                table.append("<tr style=\"border: solid 1px black\">");
                table.append(t);
                table.append("</tr>");
            }
            if (!client.getTransactions().isEmpty()) {
                String CSS = "<style> td { text-align: center;} </style>";
                TransactionTable.setText("<html>" + CSS + "<table>" + table.toString() + "</table></html>");
            } else {
                TransactionTable.setText("No Transactions yet.");
            }
        } catch (Exception ex) {
            TransactionTable.setText("Error: Not logged in. Please logout and log back in.");
        }
    }

    private void initComponents() {

        TransactionTable = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TransactionTable.setFocusPainted(false);
        TransactionTable.setMargin(new Insets(0, 0, 0, 0));
        TransactionTable.setContentAreaFilled(false);
        TransactionTable.setBorderPainted(false);
        TransactionTable.setOpaque(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TransactionTable, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup().addGap(132, 132, 132).addComponent(BackButton)
                        .addContainerGap(143, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(TransactionTable, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton).addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackButtonActionPerformed
        new LoginClient(client).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_BackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton TransactionTable;
    // End of variables declaration//GEN-END:variables
}
