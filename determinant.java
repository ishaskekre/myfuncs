public class determinant{

  public static void main(String[] args){
      double matrix[][] = new double[6][6];
            matrix[0][0] = 1;
            matrix[0][1] = Math.pow(0.5,1.0);
            matrix[0][2] = Math.pow(0.5,2.0);
            matrix[0][3] = Math.pow(0.5,3.0);
            matrix[0][4] = Math.pow(0.5,4);
            matrix[0][5] = Math.pow(0.5,5);
            matrix[1][0] = 1;
            matrix[1][0] = Math.pow(1,1);
            matrix[1][0] = Math.pow(1,2);
            matrix[1][0] = Math.pow(1,3);
            matrix[1][0] = Math.pow(1,4);
            matrix[1][0] = Math.pow(1,5);
            matrix[2][0] = 1;
            matrix[2][0] = Math.pow(1.5,1);
            matrix[2][0] = Math.pow(1.5,2);
            matrix[2][0] = Math.pow(1.5,3);
            matrix[2][0] = Math.pow(1.5,4);
            matrix[2][0] = Math.pow(1.5,5);
            matrix[3][0] = 1;
            matrix[3][0] = Math.pow(2,1);
            matrix[3][0] = Math.pow(2,2);
            matrix[3][0] = Math.pow(2,3);
            matrix[3][0] = Math.pow(2,4);
            matrix[3][0] = Math.pow(2,5);
            matrix[4][0] = 1;
            matrix[4][0] = Math.pow(2.5,1);
            matrix[4][0] = Math.pow(2.5,2);
            matrix[4][0] = Math.pow(2.5,3);
            matrix[4][0] = Math.pow(2.5,4);
            matrix[4][0] = Math.pow(2.5,5);
            matrix[5][0] = 1;
            matrix[5][0] = Math.pow(3,1);
            matrix[5][0] = Math.pow(3,2);
            matrix[5][0] = Math.pow(3,3);
            matrix[5][0] = Math.pow(3,4);
            matrix[5][0] = Math.pow(3,5);

      System.out.println(findDeterminant(matrix));

  }

  public static double findDeterminant(double[][] arr){

    if(arr.length != arr[0].length){
      System.out.println("error");
      return Integer.MIN_VALUE;
    }

    if(arr.length == 2){
      return (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
    }

    double det = 0;
    double[][] newArr = new double[arr.length-1][arr.length-1];
    int newLength = arr.length-1;
    int row = 0, col = 0;

    for (int i=0; i < arr[0].length; i++) {

      row = 0;
      col = 0;

    	for (int j=1; j < arr.length; j++) {

    		for (int k=0; k < arr[0].length; k++) {

  				if (i != k) {

  					newArr[row][col] = arr[j][k];
  					col++;

  					if (col == newLength){

  						col = 0;
  						row++;

  					}

  				}

  			}

  		}

      det += Math.pow((-1),i) * arr[0][i] * findDeterminant(newArr);

    }

    return det;

  }

}
