//gotta import that scanner class to scan stuff like our input
import java.util.Scanner;

class CashRegister {
  public static void main(String[] args) {
    //making a scanner
    Scanner scan = new Scanner(System.in);

    //askin how much de bill costs
    System.out.println("Welcome to the Change Generator\n");
    System.out.println("Please Enter the amount of a Bill");
    System.out.println("Bill: ");
    Double billamount = scan.nextDouble();//scannin and storin the bill amount

    //askin how much de person paid
    System.out.println("\nPlease Enter the amount Paid");
    System.out.println("Paid: ");
    Double amountpaid = scan.nextDouble();//scannin and storin the amount paid

    //calculating and outputtin the change to give
    double change = amountpaid - billamount;
    System.out.println("\nChange: $" + change);

    //calculating how many twenties to give in change
    double amttwenties = change/20;
    int twenty = (int)amttwenties;

    //calculating the amount of change left to give
    change = change%20;

    //calculating how many tens to give in change
    double amttens = change/10;
    int ten = (int)amttens;

    //calculating the amount of change left to give
    change = change%10;

    //calculating how many fives to give in change
    double amtfives = change/5;
    int five = (int)amtfives;

    //calculating the amount of change left to give
    change = change%5;

    //calculating how many singles to give in change
    double amtones = change/1;
    int single = (int)amtones;

    //calculating the amount of change left to give
    change = change%1;

    //calculating how many quarters to give in change
    double amtquarter = change/0.25;
    int quarter = (int)amtquarter;

    //calculating the amount of change left to give
    change = change%0.25;

    //calculating how many dimes to give in change
    double amtdime = change/0.10;
    int dime = (int)amtdime;

    //calculating the amount of change left to give
    change = change%0.10;

    //calculating how many nickels to give in change
    double amtnickel = change/0.05;
    int nickel = (int)amtnickel;

    //calculating the amount of change left to give
    change = change%0.05;

    //calculating how many pennies to give in change
    double amtpenny = change/0.01;
    int penny = (int)amtpenny;

    //outputtin how many of each dollar bill and coin to give to the guy who couldn't pay the exact amount or use a credit card
    System.out.println("$20: " + twenty);
    System.out.println("$10: " + ten);
    System.out.println("$5: " + five);
    System.out.println("$1: " + single);
    System.out.println("$.25: " + quarter);
    System.out.println("$.10: " + dime);
    System.out.println("$.05: " + nickel);
    System.out.println("$.01: " + penny);
  }
}
