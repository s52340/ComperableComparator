package org.campus02.ue;

import java.util.Objects;

public class Highscore implements Comparable<Highscore> {   //interface (comparable) ist schon im java package enthalten
    private String name;
    private int score;

    public Highscore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Highscore highscore = (Highscore) o;
        return score == highscore.score && Objects.equals(name, highscore.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Highscore{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Highscore other) {
        //natürliche Reihenfolge definiert
        //nach score aufsteigend (asc)
        if (this.score < other.score){
            return -1;
        }
        if (this.score > other.score){
            return 1;
        }
        return 0;

        //wenn nach name aufsteigend sortiert werden sollte:
        //return this.name.compareTo(other.name);
    }
}
