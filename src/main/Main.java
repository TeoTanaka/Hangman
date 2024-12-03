package main;


public class Main{


    public static void main(String[] passedArgs) {
        Game game = new Game();
        while (game.playing){
            game.turn();
        }
    }


}