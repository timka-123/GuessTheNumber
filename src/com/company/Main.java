package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int counter, guess, number;
        do {
            counter = 0;
            guess = -1;
            number = random.nextInt(10);
            while (counter < 3 && guess != number) {
                System.out.println("Guess the number 0....9: ");
                guess = scanner.nextInt();
                if (guess != number) {
                    System.out.println("You number is " + (guess > number? "less" : "quarter"));
                    counter++;
                }
            }
            System.out.println("You are " +(guess == number? "WIN" : "lose. Number is " + number));
            System.out.println("Do you want to coutune? Yes - 1, no - 0");
        } while (scanner.nextInt() == 1);
    }
}