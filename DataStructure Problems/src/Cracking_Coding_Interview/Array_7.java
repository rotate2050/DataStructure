package Cracking_Coding_Interview;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,0,3},{0,5,6},{7,8,9}};
		int i,j;
		int[] row = new int[3];
		int[] column = new int[3];
		System.out.println("Befor 90 degree rotation.");
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println("");
		}
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				//System.out.print(matrix[i][j]+ "  ");
				if (matrix[i][j]==0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
			//System.out.println("");
		}
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				if ((row[i]==1)||(column[j]==1)) {
					matrix[i][j] = 0;
				}
				//System.out.print(matrix[i][j]+ "  ");
			}
			//System.out.println("");
		}
		System.out.println("After Setting 0s in matrix.");
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println("");
		}
	}

}
