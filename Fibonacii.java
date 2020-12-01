package com.sparta.ismail;

public class Fibonacii {
    public static void fibonacii() {

        int firstNumber = 0;
        int secondNumber = 1;
        while (firstNumber < 10) {
            System.out.print(firstNumber+ " ");
            int newNumber = firstNumber;
            firstNumber += secondNumber;
            secondNumber = newNumber;
        }
    }
}
