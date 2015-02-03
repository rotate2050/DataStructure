package Other;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*Scanner scan_int = new Scanner(System.in);
        int total_no = scan_int.nextInt();*/
        
        //for (int k = 0;k<total_no;k++) {
            //String s1 = scan_int.nextLine();
            String s1 = "AAAA";
			char[] char_array = s1.toCharArray();
            int min_changes = s1.length();
            char prev;
            
            for(int i = 0; i<s1.length();i++) {
                prev = char_array[i];
                ArrayList<Character> update_str = new ArrayList<Character>();
                //updated_str[0] = prev;
                update_str.add(prev);
                for(int j =i+1; j<s1.length();j++) {
                    if (prev!=char_array[j]) {
                        prev = char_array[j];
                        update_str.add(char_array[j]);
                    }
                }
                
                if (min_changes > (s1.length() - update_str.size())) {
                    min_changes = s1.length() - update_str.size();
                }
                 
            }
            System.out.println(min_changes);  
            
        //}
	}

}
