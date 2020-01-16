
package atmbankingservice.gui.actions;

import atmbankingservice.backend.Client;
import atmbankingservice.gui.login.LoginClient;
import atmbankingservice.gui.ATMFrame;

import java.awt.Insets;

public class BalanceAction extends ATMFrame {

    public String type;
    public Client client;

    public BalanceAction(Client _client, String _type) {
        initComponents();
        client = _client;
        type = _type;
        LabelType.setText(type);
    }

    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        FinishButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        ErrorAmount = new javax.swing.JLabel();
        LabelType = new javax.swing.JLabel();
        AmountField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Amount");

        FinishButton.setFocusPainted(false);
        FinishButton.setMargin(new Insets(0, 0, 0, 0));
        FinishButton.setContentAreaFilled(false);
        FinishButton.setBorderPainted(false);
        FinishButton.setOpaque(false);
        FinishButton.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-atm-approve-50.png"))); // NOI18N
        FinishButton.setText("Finish");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });

        CancelButton.setFocusPainted(false);
        CancelButton.setMargin(new Insets(0, 0, 0, 0));
        CancelButton.setContentAreaFilled(false);
        CancelButton.setBorderPainted(false);
        CancelButton.setOpaque(false);
        CancelButton.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-atm-cancel-50-2.png"))); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ErrorAmount.setVisible(false);
        ErrorAmount.setForeground(new java.awt.Color(255, 0, 0));
        ErrorAmount.setText("jLabel5");

        LabelType.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LabelType.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-pincode-keyboard-50.png"))); // NOI18N
        LabelType.setText(type);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap(189, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(288, 288, 288))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup().addComponent(CancelButton)
                                                        .addGap(30, 30, 30).addComponent(FinishButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(LabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 271,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(194, 194, 194))))
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(234, 234, 234).addComponent(AmountField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup().addGap(258, 258, 258).addComponent(ErrorAmount)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(74, 74, 74).addComponent(LabelType).addGap(18, 18, 18)
                        .addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ErrorAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FinishButton).addComponent(CancelButton))
                        .addGap(41, 41, 41)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FinishButtonActionPerformed
        ErrorAmount.setVisible(false);

        try {
            Double amount = Double.valueOf(AmountField.getText());
            if (amount <= 0) {
                ErrorAmount.setText("Error: amount can't be below or equal zero.");
                ErrorAmount.setVisible(true);
                return;
            }
            try {
                if (!ATMService.action(client, amount, type)) {
                    ErrorAmount.setText("Error: Transaction can't be processed (Balance can't go negative)");
                    ErrorAmount.setVisible(true);
                    return;
                }
                new LoginClient(client).setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                ErrorAmount.setText("Error: Something unexpected happened, please cancel and try again.");
                ErrorAmount.setVisible(true);
            }
        } catch (NumberFormatException ex) {
            ErrorAmount.setText("Error: Invalid amount entered.");
            ErrorAmount.setVisible(true);
            return;
        }

    }// GEN-LAST:event_FinishButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CancelButtonActionPerformed
        new LoginClient(client).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ErrorAmount;
    private javax.swing.JButton FinishButton;
    private javax.swing.JLabel LabelType;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
