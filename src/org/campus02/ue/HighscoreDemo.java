package org.campus02.ue;

import java.util.Arrays;

public class HighscoreDemo {
    public static void main(String[] args) {
        Highscore[] highscores = { new Highscore("max", 230),
                new Highscore("susi", 188),
                new Highscore("john", 190)};

        System.out.println("vor der Sortierung: " + Arrays.toString(highscores));

        Arrays.sort(highscores);
        System.out.println("nach der Sortierung: " + Arrays.toString(highscores));
    }
}
