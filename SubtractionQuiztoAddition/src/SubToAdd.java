import java.util.Scanner;
public class SubToAdd {
    public static void main (String[] args){
        //Generate two random ints
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("What is "+num1+ " + " +num2);
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //Grade the answer
        if (num1 + num2 == answer) {
            System.out.print("Correct");
        }
        else if (num1 + num2 != answer)
            System.out.print("Incorrect");
            System.out.print("The Answer should be " + (num1 + num2) + ".");

    }
}
