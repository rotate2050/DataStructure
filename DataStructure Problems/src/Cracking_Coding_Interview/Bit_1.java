package Cracking_Coding_Interview;

public class Bit_1 {

	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; /* All 1’s */
		
		int test = ~(1 << j);
		System.out.println("Test: " + test);
		System.out.println("Max: " + max);
		// 1’s through position j, then 0’s
		int left = max - ((1 << j) - 1);
		System.out.println("Left: "+ left);
		// 1’s after position i
		int right = ((1 << i) - 1);
		
		System.out.println("Right: " + right);
		
		// 1’s, with 0s between i and j
		int mask = left | right;
		int test2 = (n & mask);
		System.out.println("Mask: " + mask);
		System.out.println("Test2:" + test2);
		// Clear i through j, then put m in there
		return (n & mask) | (m << i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 109;
		int m = 12;
		int i = 2;
		int j = 5;
		int changed = updateBits(n, m, i, j);
		System.out.println("Changed Integer: "+ changed);
	}

}
