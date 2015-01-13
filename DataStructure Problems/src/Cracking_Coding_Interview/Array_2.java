package Cracking_Coding_Interview;

public class Array_2 {

	static String reverse(String s) {
		char[] char_array = s.toCharArray();
		int len = s.length();
		int loop;
		if (len%2==0) {
			loop = len / 2;
		}
		else {
			loop = len / 2;
		}
		for (int i = 0; i<loop;i++) {
			//System.out.println(char_array[len-1-i]);
			char temp = char_array[len-1-i];
			char_array[len-1-i] = char_array[i];
			char_array[i] = temp;
		}
		return (new String(char_array));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_string = "Rushikesh";
		System.out.println("Before Reversing:" + main_string);
		main_string = reverse(main_string);
		System.out.println("Reverse String:" + main_string);
	}

}
