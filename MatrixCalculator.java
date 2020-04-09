import java.util.Scanner;

public class MatrixCalculator {

	int[][] matA, matB, lösung;
	int sum, dif;

	public MatrixCalculator() {

		matA = new int [2][2];
		matB = new int [2][2];
		lösung = new int [2][2];
		sum = 0;
		dif = 0;
	}
	public void addMatrix() {
		Scanner scan = new Scanner(System.in);

		//Section 1: Enter Matrix Values
		System.out.print("Enter values for Matrix A (dig1 dig2 ...): ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				matA[i][j] = scan.nextInt();

		System.out.print("Enter values for Matrix B (dig1 dig2 ...): ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				matB[i][j] = scan.nextInt();

		//Section 2: Operation Code
		for(int i=0; i<2; i++) {
			//i is the #ofRows in *mLös*.

				for(int j=0; j<2; j++) {
				//j is the #ofColumns in *mLös*
				
					sum = matA[i][j] + matB[i][j];

					lösung[i][j] = sum;
					sum = 0;
				}

		//Section 3: Output Code
		System.out.println("Matrix A + Matrix B is...");
		for(int i=0; i<2; i++) {

			for(int j=0; j<2; j++) {

				System.out.print(lösung[i][j] + " ");

			}
				System.out.println();
		scan.close();
		}

	}
	public void subtMatrix() {
		Scanner scan = new Scanner(System.in);

		//Section 1: Enter Matrix Values
		System.out.print("Enter values for Matrix A (dig1 dig2 ...): ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				matA[i][j] = scan.nextInt();

		System.out.print("Enter values for Matrix B (dig1 dig2 ...): ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				matB[i][j] = scan.nextInt();

		//Section 2: Operation Code
		for(int i=0; i<2; i++) {
			//i is the #ofRows in *mLös*.

				for(int j=0; j<2; j++) {
				//j is the #ofColumns in *mLös*
					dif = matA[i][j] - matB[i][j];

					lösung[i][j] = dif;
					dif = 0;
				}
		}

		//Section 3: Output Code
		System.out.println("Matrix A - Matrix B is...");
		for(int i=0; i<2; i++) {

			for(int j=0; j<2; j++) {

				System.out.print(lösung[i][j] + " ");

			}

				System.out.println();

		scan.close();
		}

	}


	public void multiMatrix() {
		Scanner scan = new Scanner(System.in);

		//Section 1: Enter Matrix Values
		System.out.print("Enter values for Matrix A (dig1 dig2 ...): ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				matA[i][j] = scan.nextInt();

		System.out.print("Enter values for Matrix B (dig1 dig2 ...): ");
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				matB[i][j] = scan.nextInt();

		//Section 2: Operation Code
		for(int i=0; i<2; i++) {
			//i is the #ofRows in *mLös*.

				for(int j=0; j<2; j++) {
				//j is the #ofColumns in *mLös*

					for(int k=0; k<2; k++) {
					//k is #ofColumns of *matA* and #ofRows of *matB*.
						sum = sum + matA[i][k]*matB[k][j];
					}

					lösung[i][j] = sum;
					sum = 0;
				}
		}

		//Section 3: Output Code
		System.out.println("Matrix A * Matrix B is...");
		for(int i=0; i<2; i++) {

			for(int j=0; j<2; j++) {

				System.out.print(lösung[i][j] + " ");

			}

				System.out.println();

		scan.close();
		}

	}
	/*
	public void divMatrix() {

	}

	public void traspMatrix(){

	}
	*/
	public static void main(String[] args) {

		MatrixCalculator matrix = new MatrixCalculator();

		matrix.subtMatrix();
	}
}
