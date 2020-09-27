//Andrew Bruckbauer
//2.26.20
//Java

import java.util.*;

public class CountVowelConsonants {
    public static void main (String[] args){

        System.out.println("Enter a string"); //Prompt a user for input
        Scanner main = new Scanner(System.in); //Create a scanner called main

        String Input = main.nextLine(); //Scanner is named main - pull input from Scanner
        String Sentence = Input.toUpperCase(); //Change String to upper case
        char[] Letters = Sentence.toCharArray(); //Convert String to Array of Char

        int Vowels = 0;
        int Total = Letters.length;

        for (char c : Letters){
            if(c == 'A'){
                Vowels = Vowels + 1;
            }
            else if (c == 'E'){
                Vowels = Vowels + 1;
            }
            else if (c == 'I'){
                Vowels = Vowels + 1;
            }
            else if (c == 'O'){
                Vowels = Vowels + 1;
            }
            else if (c == 'U'){
                Vowels = Vowels + 1;
            }
        }
        int Cons = Total - Vowels; //Get the total Cons by subtracting total.

        System.out.println("There are "+Vowels+" vowels in the sentence.");
        System.out.println("There are "+Cons+ " consonants in the sentence.");
    }

}
