package Cracking_Coding_Interview;

public class Bit_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 43;
		int intermed = (i & 0xaaaaaaaa);
		int updated = ( ((i & 0xaaaaaaaa) >> 1) | ((i & 0x55555555) << 1) );
		System.out.println("Intermediate Number:" + intermed);
		System.out.println("Flipped Number: " + updated);
	}

}
