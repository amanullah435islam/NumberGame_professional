package com.decodelabs.numbergame;

public class Score {


        public int calculateScore(int attempts) {

            if (attempts == 1) {

                return 100;

            } else if (attempts == 2) {

                return 90;

            } else if (attempts == 3) {

                return 80;

            } else if (attempts == 4) {

                return 70;

            } else if (attempts == 5) {

                return 60;

            } else if (attempts == 6) {

                return 50;

            } else if (attempts == 7) {

                return 40;

            } else if (attempts == 8) {

                return 30;

            } else if (attempts == 9) {

                return 20;

            }

            return 10;

        }

    }
