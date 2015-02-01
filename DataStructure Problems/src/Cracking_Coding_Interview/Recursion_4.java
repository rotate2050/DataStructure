package Cracking_Coding_Interview;

import java.util.ArrayList;

public class Recursion_4 {
	
	static ArrayList<String> combinationOfString(String s){
		ArrayList<String> combOfString;
		if (s.length()==1) {
			combOfString = new ArrayList<String>();
			combOfString.add(s);
			return combOfString;
		}
		else {
			char cur_char = s.charAt(0);
			String s1 = s.substring(1, s.length());
			combOfString = combinationOfString(s1);
			ArrayList<String> temp = new ArrayList<String>();
			for (String prevcombi : combOfString) {
				for (int i=0; i< prevcombi.length()+1;i++){
					String newcombi;
					if ((i-1) < 0) {
						 newcombi = cur_char + prevcombi;
					}
					
					else if (i==prevcombi.length()) {
						newcombi = prevcombi + cur_char;
					}
					
					else {
						String prior,append;
						if ((i-1)==0) {
							prior = "" + prevcombi.charAt(0);
						}
						else {
							prior = prevcombi.substring(0,i);
						}
						if ((i+1)==prevcombi.length()) {
							append = ""+ prevcombi.charAt(prevcombi.length()-1);
						}
						else {
							append = prevcombi.substring(i,prevcombi.length());
						}
						newcombi = prior + cur_char + append;
					}
					
					temp.add(newcombi);
				}
			}
			
			return temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "ABCD";
		ArrayList<String> result = combinationOfString(test);
		for (String each : result) {
			System.out.println(each);
		}
		System.out.println("Lenght of Combination :: " + result.size());
	}

}
