package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int theSecretNumber = rand.nextInt(100) + 1;
    }

    static void printHint(int secret, int guessed){
        if(guessed< secret) {
            System.out.print("Your number was too small");
        }
        else if(guessed>secret){
            System.out.print("Your number was too large");
        }
    }

    static boolean CheckGuess(int secret, int guessed) {
        //What it should do:
        //check to see if the number the userGuessedNumber was != or == to theSecretNumber
        //if theSecretNumber was != userGuessedNumber then call PrintHint
        //Returns: boolean indicating if it was a match or not
        boolean match = false;
        if(secret!=guessed){
            printHint(secret, guessed);
        }
        else{

        }
        return match;
        }
}
