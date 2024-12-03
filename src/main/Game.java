package main;
import java.util.Scanner;


public class Game {
    Scanner scanner = new Scanner(System.in);

    String word = "";
    public boolean playing = true;
    private int points1 = 0, points2 = 0;
    private String progress = "";
    private final String[] words = {"the"};
    private int choice = (int) (Math.random()*words.length);
    public Game(){
        word = words[choice];
        for (int i =0; i < word.length();i++){
            progress = progress+"*";
        }
    }

    public void turn(){
        endGame();
        System.out.println(progress);
        String guess = getGuess(1);
        if (guess.length() ==1){
            if (word.indexOf(guess) == -1){
                System.out.println("that letter is not in the word");
            }
            for (int i = 0; i < word.length(); i++){
                String letter = word.substring(i,i+1);
                if (guess.equals(letter)){
                    progress = progress.substring(0,i)+letter+progress.substring(i+1,word.length());
                    System.out.println(guess+" is in the word");
                    points1++;
                }
            }

        }else{
            if (word.equals(guess)) {
                System.out.println("You got the whole word!");
                playing =false;
                points1++;
            }
        }
        endGame();
        System.out.println(progress);
        guess = getGuess(2);
        if (guess.length() ==1){
            if (word.indexOf(guess) == -1){
                System.out.println("that letter is not in the word");
            }
            for (int i = 0; i < word.length(); i++){
                String letter = word.substring(i,i+1);
                if (guess.equals(letter)){
                    progress = progress.substring(0,i)+letter+progress.substring(i+1,word.length());
                    System.out.println(guess+" is in the word");
                    points1++;
                }
            }

        }else{
            if (word.equals(guess)) {
                System.out.println("You got the whole word!");
                playing =false;
                points2++;
            }
        }
        endGame();

    }
    private String getGuess(int player){
        System.out.println("Player "+player+" enter your letter or word");
        return scanner.nextLine();
    }
    private void endGame(){
        if (progress.equals(word) || !playing){
            System.out.println("the word was: "+word);
            if (points1 > points2) {

                System.out.println("Congratulations player 1, you won!");
            }else if (points2 > points1) {

                System.out.println("Congratulations player 2, you won!");
            }else {
                System.out.println("Congratulations, you tied!");
            }
            playing = false;

        }
    }



}
