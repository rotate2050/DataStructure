package Cracking_Coding_Interview;
import javax.print.DocFlavor.CHAR_ARRAY;


public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_string = args[0];
		char[] char_string = args[0].toCharArray();
		int unique_pointer = 1;
		int i,j;
		for (i=1;i<main_string.length();i++) {
			for (j=0;j<unique_pointer;j++) {
				if (char_string[i]==char_string[j]) {
					break;
				}
				//System.out.println();
			}
			if (j==unique_pointer) {
				char_string[unique_pointer] = char_string[i];
				unique_pointer++;
			}
		}
		char[] unique_char = new char[unique_pointer];
		for (i=0;i<unique_pointer;i++) {
			unique_char[i] = char_string[i];
		}
		main_string = new String(unique_char);
		System.out.println("Unique Character:" + main_string);
		
	}

}
