import java.util.Scanner;
public class bmiCalc {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); //create the scanner

        System.out.print("Input a weight in pounds");
        double pounds = input.nextDouble(); //the pounds variable is created
        double kg = pounds * 0.45359237; //convert pounds to kilos

        System.out.print("Input your height in feet");
        double feet = input.nextDouble(); //feet variable is created

        System.out.print("Input your height in inches");
        double inches = input.nextDouble(); //inch variable is created
        double feetInches = inches * 0.08333333; //convert inches to feet
        double temp = feetInches+feet; //add feet to inches and store the variable
        double Meters = temp / 3.2808399; //convert the feet and inches to Meters

        double bmi = (kg / (Meters * Meters)); //calculate BMI with the converted variables

        if (bmi <= 18.5) //if logic loop
            System.out.println("You are UnderWeight");
        else if (bmi <= 24.5)
            System.out.println("You are a Normal Weight");
        else if (bmi <= 29.9)
            System.out.println("You are OverWeight");
        else if (bmi >= 30)
            System.out.println("You are Obese");

        System.out.print("Your BMI is " +bmi);
    }
}
