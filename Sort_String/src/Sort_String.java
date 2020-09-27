// Andrew Bruckbauer
// 3.11.2020
// Java


// This code is meant to take a raw string input and convert it into an array and sort the array.

import java.util.*;

public class Sort_String {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); //create a scanner to ask user for input

        System.out.println("Input a string."); //prompt user for input

        String data = input.next(); //assign string to a variable

        char[] stringToCharArray = data.toCharArray(); //create a variable to hold the converted data

        Arrays.sort(stringToCharArray); //sort the array

        for (char output : stringToCharArray){ //output the data in single chars
            System.out.print(output); //print output
        }
    }
}
