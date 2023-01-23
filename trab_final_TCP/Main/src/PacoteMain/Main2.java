package PacoteMain;

import java.awt.EventQueue;

import org.jfugue.player.Player;

import GUI.Gui;

public class Main2 {

    public static void main(String[] args) {

        Player player = new Player();
        player.play("C D E F G A B");

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gui frame = new Gui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
