import java.util.Scanner;
//this program checks for divisibility of a number between 2 and 3
public class NumDivCheck {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number");

    double number = input.nextDouble();

    if (number % 2 == 0 && number % 3 == 0)
        System.out.println("The number " + number+ " is divisible by 2 and 3");
    else System.out.println("The number " + number+ " is NOT divisible by 2 and 3");

    if (number % 2 == 0 || number % 3 == 0)
        System.out.println("The number " + number+ " is divisible by 2 or 3");
    else System.out.println("The number " + number+ " is NOT divisible by 2 or 3");

    if (number % 2 == 0 ^ number % 3 == 0)
        System.out.println("The number " + number+ " is divisible by either 2 or 3");
    else System.out.println("The number " + number+ " is NOT divisible by either 2 or 3");
    }
}
