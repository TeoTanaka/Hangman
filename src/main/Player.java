package main;

import java.util.Scanner;
public class Player {
    private int score = 0;
    private boolean playing = true;
    private Scanner scanner = new Scanner(System.in);
    private Phrase phrase;

    public Player(Phrase phrase){
        this.phrase = phrase;
    }
    public String getInput(){
        System.out.println("Enter your input");
        return scanner.nextLine();
    }
    public boolean isPlaying(){
        return playing;
    }
    public void changeScore(int value){
        score = score+value;
    }
    public int getScore(){
        return score;
    }
    public void doTurn(){
        String input = getInput();
        if (phrase.checkGuess(input)){
            score++;
        }
        if (phrase.isGameOver()){
            playing = false;
        }
    }


}
