import java.util.Scanner;

public class DiagonalMatrixSum {

    public static int calculateDiagonalSum(int[][] square_matrix,int n) {
	int sum = 0;
	for(int i=0;i<n;i++) {
	    for(int j=0;j<n;j++) {
		sum += square_matrix[i][j] * ((i==j || j==n-i-1) ? 1 : 0);
	    }
	}
	return sum;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] square_matrix = new int[n][n];
	for(int i=0;i<n;i++) {
	    for(int j=0;j<n;j++) square_matrix[i][j] = sc.nextInt();
	}
	int diagonalSum = calculateDiagonalSum(square_matrix,n);
	System.out.print(diagonalSum);
    }
}