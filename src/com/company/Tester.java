package com.company;

public class Tester {
    public static void main(String[] args){

        String equationOne = ("79 + 3 * (4 + 82 - 68) - 7 +19");
        int answerOne = 79 + 3 * (4 + 82 - 68) - 7 +19;
        String equationTwo = ("(179 +21 +10)/ 7 + 181");
        int answerTwo = (179 +21 +10)/ 7 + 181;
        String equationThree = ("10389 * 56 * 11 + 2246");
        int answerThree = 10389 * 56 * 11 + 2246;

        System.out.println(equationOne + " = " + answerOne);
        System.out.println(equationTwo + " = " + answerTwo);
        System.out.println(equationThree + " = " + answerThree);
    }
}
