package Careercup;

public class Extract_Vowel_Array {

	public static String extract_vowels(String x1) {
		String s1=null;
		s1 = x1;
		char[] char_array = s1.toCharArray();
		String new_string = "";
		int j = 0;
		String vowels = "";
		for (int i =0; i < s1.length();i++) {
			if (char_array[i]=='a' || char_array[i]=='e' || char_array[i]=='i' || char_array[i]=='o' || char_array[i]=='u' 
					|| char_array[i]=='A' || char_array[i]=='E' || char_array[i]=='I' || char_array[i]=='O' || char_array[i]=='U') {
				vowels = vowels + char_array[i];			}
			else {
				//new_string.append(char_array[i]);
				//j++;
				new_string = new_string + char_array[i];
			}
		}
		return new_string.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Rushikesh Hello";
		test = extract_vowels(test);
		System.out.println(test);
	}

}
