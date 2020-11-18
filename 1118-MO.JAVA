package MOAPP;

import javax.swing.*;

public class MOAPP {
    private JPanel MOAPP;
    void mo(){
        JFrame frame = new JFrame("MOAPP");
        frame.setContentPane(MOAPP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
     new MOAPP().mo();
    }
}
