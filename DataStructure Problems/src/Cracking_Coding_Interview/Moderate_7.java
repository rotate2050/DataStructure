package Cracking_Coding_Interview;

public class Moderate_7 {

	int maxSubArraySum(int[] a) {
		int max_so_far = 0;
		int max_upto_index = 0;
		for (int i =0;i<a.length;i++) {
			max_upto_index = max_upto_index + a[i];
			if (max_upto_index < 0) {
				max_upto_index = 0;
			}
			if (max_upto_index > max_so_far) {
				max_so_far = max_upto_index;
			}
		}
		return max_so_far;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
