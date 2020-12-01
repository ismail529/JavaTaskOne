package com.sparta.ismail;

public class Swap {
    public static void swappingTwoNumbers (int numOne, int numTwo)
    {
        System.out.println("Pre swap number one is "+ numOne + " number two is " + numTwo);
        int temp;
        temp=numOne;
        numOne=numTwo;
        numTwo=temp;
        System.out.println("Post swap number one is "+ numOne + " number two is " + numTwo);
    }
}

