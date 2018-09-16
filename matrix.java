import java.util.Scanner;
public class matrix{
	static Scanner keybd = new Scanner(System.in);
	static Integer x = 0, y = 0;

	public static void inputMatrix(String type) {
		System.out.print("Enter the dimensions of the " + type + " matrix\nRow: ");
		x = keybd.nextInt();
		System.out.print("Column: ");
		y = keybd.nextInt();
		System.out.println("Matrix " + type + " is " + x + "," + y);
	}

	public static void main(String[]args){
		int f_x = 0, f_y = 0;
		int s_x = 0, s_y = 0;

		System.out.println("This program multiplies two matrices");
		inputMatrix("first");
		f_x = x;
		f_y = y;
		inputMatrix("second");
		s_x = x;
		s_y = y;
	
		// Checking of row and column match
		if (f_y != s_x) {
				System.out.println("Error: multiplication is not possible as column of the first matrix(" + f_y + ") must be equal to the row of the second matrix(" + s_x + ")");
				System.exit(0);			
		}
		// checking if dimensions are positive integers
		if (f_x<=0 || f_y<=0 || s_x<=0 || s_y<=0){
			System.out.println("Error: all dimensions of a matrix must be positive: (" + f_x + "," + f_y + "),(" + s_x + "," + s_y + ")");
			System.exit(0);
		}

		// Dimensions are correct

		System.out.println("Multiplying matrix of dimension (" +  f_x + "," + f_y + ") with (" + s_x + "," + s_y + ")");
		

		int[][] fm = new int[f_x][f_y];
		int[][] sm = new int[s_x][s_y];
		int[][] rm = new int[f_x][s_y];

		// reading first matrix
		System.out.println("\nNow enter values for the first matrix");
		for (int i = 1; i<=f_x; i++){
			for (int j = 1; j<=f_y; j++ ) {
				System.out.print("(" + i + "," + j + "): ");
				fm[i-1][j-1] = keybd.nextInt();
			}
		}

		// reading second matrix
		System.out.println("\nNow enter values for the second matrix");
		for (int i = 1; i<=s_x; i++){
			for (int j = 1; j<=s_y; j++ ) {
				System.out.print("(" + i + "," + j + "): ");
				sm[i-1][j-1] = keybd.nextInt();
			}
		}

		// Computing the result
		System.out.print("\nResulting matrix product is ...\n");
		for (int i = 1; i<=f_x; i++){
			for (int j =1; j<=s_y; j++){
				//System.out.print("Computing(" + i + "," + j + ")\n");
				rm[i-1][j-1] = 0;
				for (int k = 0; k<f_y; k++){
					rm[i-1][j-1] += fm[i-1][k] * sm[k][j-1];
				}
			}
		}

		// Printing the result
		for (int i=0; i < f_x; i++){
			for (int j=0; j<s_y; j++){
				System.out.print("" + rm[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}