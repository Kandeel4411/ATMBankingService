package atmbankingservice.gui;

import atmbankingservice.backend.ATM;

// Common properties through out the gui
public class ATMFrame extends javax.swing.JFrame {
    public static ATM ATMService = new ATM();

    public ATMFrame() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setResizable(false);
    }
}