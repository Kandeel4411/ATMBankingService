
package atmbankingservice.gui.actions;

import atmbankingservice.backend.Client;
import atmbankingservice.backend.Person;
import atmbankingservice.gui.login.LoginClient;
import atmbankingservice.gui.ATMFrame;

import java.awt.Insets;

public class Owners extends ATMFrame {

    public Client client;

    public Owners(Client _client) {
        initComponents();
        client = _client;
        initComponents();
        StringBuilder table = new StringBuilder();
        table.append("<tr><td>Name</td><td>Age</td><td>Gender</td><tr>");
        for (Person p : client.getOwners()) {
            table.append("<tr style=\"border: solid 1px black\">");
            table.append(p);
            table.append("</tr>");
        }
        String CSS = "<style> td { text-align: center;} </style>";
        OwnersTable.setText("<html>" + CSS + "<table>" + table.toString() + "</table></html>");
    }

    private void initComponents() {

        OwnersTable = new javax.swing.JButton();
        BackButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OwnersTable.setFocusPainted(false);
        OwnersTable.setMargin(new Insets(0, 0, 0, 0));
        OwnersTable.setContentAreaFilled(false);
        OwnersTable.setBorderPainted(false);
        OwnersTable.setOpaque(false);

        BackButton2.setFocusPainted(false);
        BackButton2.setMargin(new Insets(0, 0, 0, 0));
        BackButton2.setContentAreaFilled(false);
        BackButton2.setBorderPainted(false);
        BackButton2.setOpaque(false);
        BackButton2.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/atmbankingservice/gui/Icons/icons8-password-reset-50.png"))); // NOI18N
        BackButton2.setText("Go Back");
        BackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(OwnersTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup().addGap(132, 132, 132).addComponent(BackButton2)
                        .addContainerGap(143, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(OwnersTable, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton2).addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackButton2ActionPerformed
        new LoginClient(client).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_BackButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton2;
    private javax.swing.JButton OwnersTable;
    // End of variables declaration//GEN-END:variables
}
