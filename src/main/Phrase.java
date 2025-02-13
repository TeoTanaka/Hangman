package main;

public class Phrase {
    private final String[] words = {"the", "happy", "sad", "that"};
    private String word;
    private String progress;

    public Phrase() {
        setWord();
    }

    private void setWord() {
        int randIndex = (int) (Math.random() * words.length);
        word = words[randIndex];
    }

    private void setProgress() {
        for (int i = 0; i < word.length(); i++) {
            progress += "*";
        }
    }

    public String getWord() {
        return word;
    }

    public String getProgress() {
        return progress;
    }

    public boolean checkGuess(String input) {
        if (input.length() == 1) {
            for (int i = 0; i < word.length(); i++) {
                String letter = word.substring(i, i + 1);
                if (input.equals(letter)) {
                    progress = progress.substring(0, i) + letter + progress.substring(i + 1);
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            if (input.equals(word)) {
                return true;
            }
        }
        return false;
    }
    public boolean isGameOver(){
        return progress.equals(word);
    }




}
