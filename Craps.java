public class Craps {
  public static void main(String[] args) {
    //Welcome Message
    System.out.println("Lets play Craps!\n");

    //First Roll
    int die1 = (int)(Math.random()*6) + 1;
    int die2 = (int)(Math.random()*6) + 1;
    int roll = die1 + die2;
    System.out.println("First Roll: " + roll + "\n");

    //Check for initial win
    if (roll == 7 || roll == 11) {
      //Win on first roll
      System.out.println("You win!");
    } else if (roll == 2 || roll == 3 || roll == 12) {
      //Lose on first roll
      System.out.println("You lose!");
    } else {
      //Subsequent rolls
      //Roll again and declare point value
      int point = roll;
      die1 = (int)(Math.random()*6) + 1;
      die2 = (int)(Math.random()*6) + 1;
      roll = die1 + die2;
      System.out.println("Next roll: " + roll);

      //While loop to roll until game ends
      while (roll != point && roll != 7) {
        //Reroll
        System.out.println("Roll Again\n");
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
        System.out.println("Next roll: " + roll);
      }
      //Exit loop if roll is point or 7
      if (roll == point) {
        //Win condition
        System.out.println("You win!");
      } else if (roll == 7) {
        //Lose condition
        System.out.println("You lose!");
      }
    }
  }
}
