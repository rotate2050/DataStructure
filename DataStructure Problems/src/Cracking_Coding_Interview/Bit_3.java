package Cracking_Coding_Interview;

public class Bit_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12;
		int j = 108;
		int mask = ~(1 << 3);
		System.out.println("Mask: "+ mask);
		if ((j & ( 1 << 3)) > 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		int update = j & mask;
		System.out.println("Updated: " + update);
	}

}
