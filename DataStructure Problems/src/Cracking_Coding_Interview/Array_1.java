package Cracking_Coding_Interview;
/**
 * 
 */

/**
 * @author rushi_000
 *
 */
public class Array_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] alphabet = new int[256];
		char[] main_string = args[0].toCharArray();
		boolean unique = true;
		for (char c : main_string) {
			int aski = c;
			if (alphabet[aski]==0) {
				alphabet[aski] = 1;
			}
			else {
				//System.out.println("Duplicate Character");
				if (alphabet[32]==1) {
					
				}
				else {
					unique = false;
					break;
				}
			}
		}
		if(unique)
			System.out.println("String with Unique Character");
		else 
			System.out.println("String with duplicate Character");
	}

}
