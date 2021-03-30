package HANGMANGAME;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HngManFrame {
    // to play the game go to HngManGame.java

    HANGMANGAME.HngManPannel panel;

    public HngManFrame(){
        panel = new HANGMANGAME.HngManPannel();
        JFrame frame = new JFrame();
        frame.setTitle("HANGMAN GAME");
        frame.setSize(725,530);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int promt = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit Hangman?","Exit Hangman?",JOptionPane.YES_NO_OPTION);
                if(promt == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        frame.setResizable(false);
        frame.setVisible(true);


    }
}
