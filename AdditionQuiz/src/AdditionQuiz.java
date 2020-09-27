import java.util.Scanner;

public class AdditionQuiz
{
    public static void main(String[] args) {
        //Generate to random ints <= 100
        int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*100);

        // If Num1 < num2, swap num1 w/ num 2
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " +number1+ " + " +number2+ "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //Grade the Answer and display the result
        if (number1 + number2 == answer)
            System.out.println("You are correct");

        else
            System.out.println("You are incorrect");
    }
}
