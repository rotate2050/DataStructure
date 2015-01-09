package Cracking_Coding_Interview;

public class Array_4 {
	
	public static Boolean anagram(String s1, String s2) {
		if (s1==null || s2==null) {
			return false;
		}
		if (s1.length()!=s2.length()) {
			return false;
		}
		char[] s1_array = s1.toCharArray();
		char[] s2_array = s2.toCharArray();
		int[] counter1_array = new int[256];
		int[] counter2_array = new int[256];
		boolean counter_equal = true;
		for (int i = 0; i<s1.length();i++) {
			counter1_array[s1_array[i] - 97]++;
		}
		/*for (int i = 0; i<26;i++) {
			System.out.println(counter1_array[i]);
		}*/
		for (int i =0; i<s2.length(); i++) {
			counter2_array[s2_array[i] - 97]++;
		}
		//System.out.println("Hello");
		/*for (int i = 0; i<26;i++) {
			System.out.println(counter2_array[i]);
		}*/
		for (int i = 0; i <26; i++) {
			if (counter1_array[i]!=counter2_array[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "abcded";
		String string2 = "aedbcd";
		/*int length1 = string1.length();
		int length2 = string2.length();*/
		boolean anagram = false;
		/*if (length1!=length2) {
			System.out.println("Strings are not anagram");
			return;
		}
		else {
			char[] char_string1 = string1.toCharArray();
			char[] char_string2 = string2.toCharArray();
			int hash1 =0, hash2=0;
			int i,j;
			for(i=0;i<length1;i++){
				hash1 += char_string1[i];
				hash2 += char_string2[i];
			}
			if (hash1==hash2) {
				anagram = true;
			}
		}*/
		anagram = anagram(string1,string2);
		if (anagram) {
			System.out.println("Strings are anagram");
		}
		else
			System.out.println("Strings are not aganrams");
	}
}
