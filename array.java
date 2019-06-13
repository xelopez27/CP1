public class array{
  public static void main(String[] args){
    int[] array = new int[20];
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      int x = (int)((Math.random()* 100) + 1);
      array[i] = x;
      sum = (sum + x);
      System.out.println(array[i]);
    }
    System.out.println("The sum of all the numbers in the array is: " + sum);
    System.out.println("The average of all the numbers in the array is: " + ((sum)/(array.length)));
  }
}
