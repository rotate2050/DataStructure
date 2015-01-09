package Careercup;

public class Array_1 {

	
	public static int find_Zero_count(int[] A,int i,int j)
	{
		if(i==j)
		{
			if(A[i] == 0)
			return 1;
			else
			return 0;
		}

		int mid = i+(j-i)/2;
		System.out.println("Values \ni: "+i + "\nj: " + j + "\nmid: " + mid);
		if(A[mid]==0)
		{
			return (((j-i)/2)+ 1 + find_Zero_count(A, mid+1, j));
		}
		else
		{
			return find_Zero_count(A,i, mid-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,0,0,0,0,0,1,1,1,1};
		int total_count = find_Zero_count(A, 0, 9);
		System.out.println("Total Count :" + total_count);
	}

}
