public class CorrectedMatrix {

  public static void main(String[] args) {

    int[][] myMatrix = new int[4][4];

    for (int i = 0; i < myMatrix.length; i++) {
      for (int j = 0; j < myMatrix[i].length; j++) {
        if (i == j) {
          myMatrix[i][j] = 1;
        } else {
          myMatrix[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < myMatrix.length; i++) {
      for (int j = 0; j < myMatrix[i].length; j++) {
        System.out.print(myMatrix[i][j] + " ");
      }
      System.out.println();
    }

  }
}