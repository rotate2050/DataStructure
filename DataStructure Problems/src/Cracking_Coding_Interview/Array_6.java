package Cracking_Coding_Interview;

public class Array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		System.out.println("Befor 90 degree rotation");
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println("");
		}
		System.out.println("After 90 degree rotation");
		int [][] matrix_after_90 = new int[3][3];
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				matrix_after_90[i][j] = matrix[2-i][j];
				//System.out.println();
			}
		}
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(matrix_after_90[i][j]+ "  ");
			}
			System.out.println("");
		}
	}

}
