package Cracking_Coding_Interview;
/**
 * 
 */

/**
 * @author rushi_000
 *
 */
public class Array_1 {

	static boolean checkUniqueString(String s){
		int bit_check = 0;
		char[] char_string = s.toCharArray();
		for (int i=0;i<s.length();i++) {
			int aski = char_string[i] - 'A'; 
			//int temp = 1 << aski;
			if ((bit_check & (1 << aski)) > 0) 
				return false;
			else 
				bit_check |= (1 << aski);
		}
		return true;
	}
	
	static boolean isUniqueString(String s) {
		int[] alphabet = new int[256];
		char[] main_string = s.toCharArray();
		
		
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
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aBcDeFg";
		/*
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
			System.out.println("String with duplicate Character");*/
		if (checkUniqueString(s)) {
			System.out.println("Unique String");
		}
		else {
			System.out.println("Not Unique");
		}
	}

}
