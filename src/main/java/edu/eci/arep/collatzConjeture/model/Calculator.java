package edu.eci.arep.collatzConjeture.model;

public class Calculator {

    public static String calculateCollatzConjecture(int number) {
        StringBuilder initialString = new StringBuilder();
        initialString.append(number);
        while (number != 1) {
            number = (number % 2 == 0) ? number / 2 : (number * 3) + 1 ;
            initialString.append(" -> ").append(number);
        }
        return initialString.toString();
    }
}
