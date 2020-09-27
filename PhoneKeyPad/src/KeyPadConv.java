//Andrew Bruckbauer
//2.12.2020

import java.util.Scanner;
public class KeyPadConv {
    public static void main (String[] args){
        Scanner keypad = new Scanner(System.in); //create a scanner
        System.out.println("Input a letter from A to Z");

        char holder = keypad.next(".").charAt(0); //take one input from scanner
        boolean check = Character.isLetter(holder); //checks if input is valid

        if (check == false){ //returns values for evaluation
            System.out.println(holder+ " is not a letter.");
        }
        else if (check){
            char letter = Character.toUpperCase(holder); //Convert char to uppercase

            if (letter == 'A' || letter == 'B' || letter == 'C'){
                System.out.println("The corresponding number is 2");
            }
            else if (letter == 'D' || letter == 'E' || letter == 'F'){
                System.out.println("The corresponding number is 3");
            }
            else if (letter == 'G' || letter == 'H' || letter == 'I'){
                System.out.println("The corresponding number is 4");
            }
            else if (letter == 'J' || letter == 'K' || letter == 'L'){
                System.out.println("The corresponding number is 5");
            }
            else if (letter == 'M' || letter == 'N' || letter == 'O'|| letter =='P'){
                System.out.println("The corresponding number is 6");
            }
            else if (letter == 'Q' || letter == 'R' || letter == 'S'){
                System.out.println("The corresponding number is 7");
            }
            else if (letter == 'T' || letter == 'U' || letter == 'V'){
                System.out.println("The corresponding number is 8");
            }
            else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z'){
                System.out.println("The corresponding number is 9");
            }
        }
    }
}
