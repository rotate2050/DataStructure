package Other;

public class Matrix_1 {

	static int calculatematrix(int a[][],int n) {
		for(int i=1;i<n-1;i++) {
			for(int j=1;j<n-1;j++) {
				int main = a[i][j];
				int comp1 = a[i+1][j];
				int comp2 = a[i-1][j];
				int comp3 = a[i][j+1];
				int comp4 = a[i][j-1];
				if ((main<comp1)&&(main<comp2)&&(main<comp3)&&(main<comp4)) {
					a[i][j] = a[i][j] + 1;
				}
			}
		}
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println("");
		}
		
		int max = 0;
		
		for (int i=1;i<n-1;i++) {
			for (int j=1;j<n-1;j++) {
				int temp = a[i][j];
				if (temp > max) {
					max = temp;
				}
				//System.out.print(a[i][j]+ "  ");
			}
		}
		int occurunce = 0;
		for (int i=1;i<n-1;i++) {
			for (int j=1;j<n-1;j++) {
				if (a[i][j]==max) {
					occurunce++;
				}
			}
		}
		System.out.println("Max number is ::" + max);
		System.out.println("Occurunce of the max number is ::" + occurunce);
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{7,7,8,3},{7,6,7,8},{6,7,4,6},{7,8,9,9}};
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println("");
		}
		System.out.println("Matrix After Caculation");
		int max_number = calculatematrix(a,4);
		
		//System.out.println("Max number:: " + max_number);
	}

}
