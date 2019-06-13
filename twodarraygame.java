/*
Start of the Board:
X000
0000
0000
0000

X is in the array at arr[0][0]

When moving

Down 	arr[1][0]
Up 	arr[-1][0]
Left 	arr[0][-1]
Right 	arr[0][1]
*/
import java.util.Scanner;

public class twodarraygame{
  public static void main(String[] args){
    String[][] board = {{"0","0","0","0"}, {"0","0","0","0"}, {"0","0","0","0"}, {"0","0","0","0"}}; //made the board

    Scanner scan = new Scanner(System.in); // made a scanner called scan

    int x1 = 0; // Made this to we can compare where x and the goal is to see if player won
    int x2 = 0;
    board[x1][x2] = "X"; //Sets up players spawn point

    int r1 = (int)(Math.random() * 3) + 1; // Made this to randomize where the * spawns in
    int r2 = (int)(Math.random() * 3) + 1;
    board[r1][r2] = "*";//Set up the random goal

    System.out.println("Initial Board"); //This is the start of the game
    printboard(board);
    ask(board, x1, x2, r1, r2); // Ask for player to choose what they want to do
  }

  public static void ask(String[][] arr, int x1, int x2, int r1, int r2){
    Scanner scan = new Scanner(System.in); // make a scanner
    System.out.println("Which direction would you like to move?");
    String answer = scan.nextLine();
    if(answer.equals("up")){
      up(arr, x1, x2, r1, r2); // method that runs if you move up
    }
    if(answer.equals("down")){
      down(arr, x1, x2, r1, r2); // method that runs if you move down
    }
    if(answer.equals("left")){
      left(arr, x1, x2, r1, r2); // methord that runs if you go left
    }
    if(answer.equals("right")){
      right(arr, x1, x2, r1, r2); // method that runs if you go right
    }
  }

  public static void printboard(String[][] arr){  // This method is to print out the whole board
    for(int x = 0; x < arr.length; x++){ // loops through the array to print the board
      for(int y = 0; y < arr[0].length; y++){
        System.out.print(arr[x][y]);
      }
      System.out.println();
    }
  }

  public static void up(String[][] arr, int x1,int x2, int r1, int r2){  //Up 	arr[-1][0]
    arr[x1][x2] = "0"; //showing how x moved
    x1 = x1 - 1;
    fail(arr, x1, x2, r1, r2); //check if you went out of bounds or won
  }

  public static void down(String[][] arr, int x1,int x2, int r1, int r2){ //Down 	arr[1][0]
    arr[x1][x2] = "0"; //showing how x moved
    x1 = x1 + 1;
    fail(arr, x1, x2, r1, r2); //check if you went out of bounds or won
  }

  public static void left(String[][] arr, int x1,int x2, int r1, int r2){ //Left 	arr[0][-1]
    arr[x1][x2] = "0"; //showing how x moved
    x2 = x2 - 1;
    fail(arr, x1, x2, r1, r2); //check if you went out of bounds or won
  }

  public static void right(String[][] arr, int x1,int x2, int r1, int r2){ //Right 	arr[0][1]
    arr[x1][x2] = "0"; //showing how x moved
    x2 = x2 + 1;
    fail(arr, x1, x2, r1, r2); //check if you went out of bounds or won
  }

  public static void fail(String[][] arr, int x1,int x2, int r1, int r2){
    if (x1 == r1 && x2 == r2){ // checks if you win
      System.out.println("You win!");
    }
    else if(x1 < 0){ // checks if you went out of bounds
      System.out.println("You lose");
    }
    else if(x2 < 0){ // checks if you went out of bounds
      System.out.println("You lose");
    }
    else if(x1 > 3){ // checks if you went out of bounds
      System.out.println("You lose");
    }
    else if(x2 > 3){ // checks if you went out of bounds
      System.out.println("You lose");
    }
    else{ // if you didn't win or lose, it just asks you to make your next move
      arr[x1][x2] = "X";
      printboard(arr);
      ask(arr, x1, x2, r1, r2);
    }
  }
}
