//Andrew Bruckbauer
//3.4.2020
//Java

public class Craps {

    public static void main(String[] args) {
        int dice1 = (int)(Math.random()* 6) + 1; //create 2 dice
        int dice2 = (int)(Math.random()* 6) + 1;
        int roll = dice1 + dice2;

        System.out.println(); //create space between runs

        System.out.print("You rolled "+dice1+ " + " +dice2+ " = " +roll+". "); //show roll
        if(roll == 2 || roll == 3 || roll == 12){ //compare first roll
            System.out.println("You Lose !");
        }else if(roll == 7 || roll == 11){
            System.out.println("You Win !");
        }
        else{//if first conditions are not met evaluate the 2nd roll
            System.out.println("Point is "+roll+"\n");
            dice1 = (int)(Math.random()* 6) + 1;
            dice2 = (int)(Math.random()* 6) + 1;
            int roll2 = dice1 + dice2;
            System.out.print("You rolled "+roll2+". ");
            while(roll2 != 7){
                if(roll == roll2){
                    System.out.println("You Win !");
                    break;
                }else{
                    System.out.println("Point is "+roll+"\n");
                }
                dice1 = (int)(Math.random()* 6) + 1;
                dice2 = (int)(Math.random()* 6) + 1;
                roll2 = dice1 + dice2;
                System.out.print("You rolled "+roll2+". ");
            }
            if(roll2 == 7){
                System.out.println("You Lose!");
            }
        }
    }
}