package com.paul.diaz;

public class DiagonalDIfference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = 0;
				
				System.out.println(matrix[i][j]);
			}
		}
		int sum=0;
		//StdArrayIO.print(matrix);
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 3; j++) {
				sum = matrix[i][j];
			}
			}
		
		System.out.println(sum);
	}

}
