package com.decodelabs.numbergame;



public enum DifficultyLevel {

    EASY(50),

    MEDIUM(100),

    HARD(500);

    private final int maxNumber;

    DifficultyLevel(int maxNumber) {

        this.maxNumber = maxNumber;

    }

    public int getMaxNumber() {

        return maxNumber;

    }

}
