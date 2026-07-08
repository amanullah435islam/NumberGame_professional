package org.testProjectImranSir;

import com.decodelabs.numbergame.Difficulty;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Difficulty difficulty = new Difficulty();
        int maxNumber = difficulty.selectDifficulty();
        System.out.println();
        System.out.println("Maximum Number : " + maxNumber);

    }
}