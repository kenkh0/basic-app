package com.p113.d8_innerClass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test3 {
    public static void main(String[] args) {

        JFrame win =new JFrame("loging interface");
        JPanel panel =new JPanel();
        win.add(panel);

        JButton btn =new JButton("login");

        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"click me");

            }
        });

        panel.add(btn);

        //distplay
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
