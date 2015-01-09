package Cracking_Coding_Interview;

public class Array_8 {
	public static void main(String argv[]){
		boolean mirror_image= false;
		String s1 = "pleap";
		String s2 = "apple";
		int len = s1.length();
		 /* check that s1 and s2 are equal length and not empty */
		 if (len == s2.length() && len > 0) {
		 /* concatenate s1 and s1 within new buffer */
		 String s1s1 = s1 + s1;
		 //mirror_image = isSubstring(s1s1, s2);
		 }
	}
}
