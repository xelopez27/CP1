import java.util.Scanner;

public class RollDice{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

   	char choice;

		System.out.println("Rolling Two Dice");

    do{

    	int dice1=(int)(Math.random()*6+1);
      int dice2=(int)(Math.random()*6+1);

    	System.out.print("Die 1: " + dice1 + ", ");
    	System.out.print("Die 2: " + dice2 + ", ");
    	System.out.println("Sum of two dice: " + (dice1 + dice2));

    		System.out.print("Would You like to roll again? (y/n) ");
    		choice = scan.next().charAt(0);

     }

       while ((choice == 'y') || (choice == 'Y'));


    	System.out.println("Goodbye");
}
}
