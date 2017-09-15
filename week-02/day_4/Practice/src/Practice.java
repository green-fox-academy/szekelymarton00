public class Practice {

  public static void main(String[] args) {

    int[][] myArray = new int[4][4];

    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++) {
        if (i == j) {
          myArray[i][j] = 1;
        } else {
          myArray[i][j] = 0;
        }
      }

    }
    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++) {
        System.out.print(myArray[i][j] + " ");
      }
      System.out.println();
    }

  }
}