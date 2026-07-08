package com.decodelabs.numbergame;

public class Score {
    public int calculateScore(int attempts) {

        int score = 110 - (attempts * 10);

        return Math.max(score, 10);

    }
}
