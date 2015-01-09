package Cracking_Coding_Interview;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_string = args[0];
		char[] char_array = main_string.toCharArray();
		int len = main_string.length();
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
		
		System.out.println("Before Reversing:" + main_string);
		main_string = new String(char_array);
		System.out.println("Reverse String:" + main_string);
	}

}
