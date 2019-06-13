public class doublearray{
  public static void main(String[] args){
    int[][] scores = { {75, 88, 78, 86}, {95, 92, 89, 97}, {73, 89, 92, 91}, {83, 83, 83, 84}, {86, 65, 83, 91} };
    for(int x = 0; x < scores.length; x++){
      for(int y = 0; y < scores[0].length; y++){
        System.out.print(scores[x][y] + ", ");
      }
      System.out.println();
    }
  }
}
