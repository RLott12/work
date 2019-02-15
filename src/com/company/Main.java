package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        IntInput();
        int i = GenerateNumber();
        int e = GetGuess();
        CheckGuess(i,e);


        /*System.out.println("What is your name?");//Allow the user to enter their name.
        String userName = reader.nextLine();
        boolean play = true;
        while(play){
            int numGuesses = 0;
            int guess= 0;
            int answer = GenerateNumber();
            boolean correct = false;
            while(correct==false){
                guess= GetGuess();
                correct = CheckGuess(answer, guess);
                numGuesses++;//Keep track of number of guesses
            }

            System.out.println("Correct, "+userName+ "! The secret number was " + answer +"!"+ " You got the number in "+numGuesses+" guesses.");
            System.out.println("Would you like to play again?");//once the user guesses the correct number ask if they would like to play again, exiting if they type "no" restarting if they type"yes"
            String response = reader.nextLine();
            boolean loop = true;
            while(loop){
                if (response.equals("yes") || response.equals("Yes")) {
                    play = true;
                    loop = false;
                }
                else if (response.equals("no") || response.equals("No")) {
                    play = false;
                    loop = false;
                }
                else{
                    System.out.println("Would you like to play again?");
                    response = reader.nextLine();
                }
            }
        }*/
    }


    static String Input() {
        Scanner reader = new Scanner(System.in);
        //Print the prompt to the screen
        System.out.println("Please enter a number");
        String userInput = reader.nextLine();
        return userInput;
    }

    //once the user guesses the correct number ask if they would like to play again, exiting if they type "no" restarting if they type"yes"
    static int IntInput() {
        //Inputs: string to be used as a prompt
        String userInput = Input();
        //get input from the user
        int guess = 0;
        boolean again = true;
        while(again){//this should continue to reprompt the user and get new input until an integer is entered by the user
            try {
                guess = Integer.parseInt(userInput);
                again = false;
            }
            catch (NumberFormatException wow){
                userInput = Input();
            }
        }
        //Returns: the integer that the user entered
        return guess;
    }

    static int GenerateNumber() {
        Random rand = new Random();
        int theSecretNumber = rand.nextInt(100) + 1;//generate random number between 1 and 100  - see bottom of page for how to do this
        return theSecretNumber;
    }

    static int GetGuess() {
        int guess;

        while(true) {
            guess = IntInput();//prompt the user to guess a number between 1 and 100 (use IntInput you created to do this)
            if(guess<=100&& guess >=1){
                break;
            }
            System.out.println("Please enter a number between 1 and 100");
        }
        return guess;//Returns: the number the user entered (should be valid integer between 1-100 at this point)
    }

    static void printHint(int secret, int guessed){
        if(guessed< secret) {
            System.out.println("Your number was too small");
        }
        else if(guessed>secret){
            System.out.println("Your number was too large");
        }
    }

    static boolean CheckGuess(int secret, int guessed) {
        boolean match = false;
        if(secret!=guessed){//check to see if the number the userGuessedNumber was != or == to theSecretNumber
            printHint(secret, guessed);//if theSecretNumber was != userGuessedNumber then call PrintHint
        }
        else{
            match = true;
        }
        return match;//Returns: boolean indicating if it was a match or not
    }

}
