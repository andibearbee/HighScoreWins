package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scorereader = new Scanner(System.in);
        //Prompt for game score
        System.out.println("Please enter a game score in this format Home:Visitor|21:9");
        String gameScoreInput = scorereader.nextLine();
        String [] score = gameScoreInput.split("\\|");
        String [] userTeam = score[0].split("\\:");
        String [] userScore = score [1].split("\\:");
        if (Integer.parseInt(userScore[0]) > Integer.parseInt(userScore[1])) {
            System.out.println("Winner is " + userTeam [0]);
        }
        else {
            System.out.println("Winner is " + userTeam[1]);
        }


    }
}
