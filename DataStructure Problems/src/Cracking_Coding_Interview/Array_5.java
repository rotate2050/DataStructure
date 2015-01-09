package Cracking_Coding_Interview;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_string = args[0];
		char[] char_array = main_string.toCharArray();
		int space_count = 0;
		int i,j=0;
		for(i=0;i<main_string.length();i++) {
			if (char_array[i]==32) {
				space_count++;
			}
		}
		char[] without_space = new char[main_string.length()+ (space_count*2)];
		int temp = 0;
		for (i=0;i<main_string.length();i++) {
			if (char_array[i]!=32) {
				without_space[i+(temp*2)] = char_array[i];
			}
			else {
				without_space[i+(temp*2)] = '%';
				without_space[i+(temp*2) + 1] = '2';
				without_space[i+(temp*2) + 2] = '0';
				temp++;
			}
		}
		String update = new String(without_space);
		System.out.println(update);
	}

}
