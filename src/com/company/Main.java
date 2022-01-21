package com.company;
import javax.swing.*;


/*
    TODO:
    -Add a amateur option -> set initial player score to 501
    -Currently player 1 always starts, make an option so the user can input who shot closest to the bull, thus deciding who throws first
 */


public class Main {

    public static void main(String[] args) {
	    //Initialise the score for both players
        int player1_score = 501;
        int player2_score = 502;

        JTextField score_player1 = new JTextField();
        JTextField score_player2 = new JTextField();
        score_player1.setBounds(50, 25, 100, 30);
        score_player2.setBounds(160,25, 100, 30);
        score_player1.setEditable(false);
        score_player2.setEditable(false);


        //put this in a game loop somewhere?
        score_player1.setText(String.valueOf(player1_score));
        score_player2.setText(String.valueOf(player2_score));



        JFrame mainWindow = new JFrame();
        mainWindow.setSize(900, 750);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
        mainWindow.add(score_player1);
        mainWindow.add(score_player2);

    }
}
