package Careercup;

public class bit_difference {

	static byte b1 = 12;
	static byte b2 = -9;

	public static boolean bit_difference1() {
		int b3 = b1 ^ b2;
		int counter = 0;

		while (b3 != 0) {
			int temp = b3 & 1;
			if (temp == 1) {
				counter++;

			}
			b3 = b3 >> 1;

		}
		if (counter == 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean b = bit_difference1();
		System.out.print(b);
	}

}
