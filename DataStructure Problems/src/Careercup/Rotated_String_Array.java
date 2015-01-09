package Careercup;

public class Rotated_String_Array {
	
	public static Boolean rotated_string(String s1, String s2){
		if (s1==null || s2==null) {
			return false;
		}
		if (s2.length()==s1.length()) {
			String s3 = s1 + s1;
			if (s3.contains(s2)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "ppale";
		if (rotated_string(s1, s2)) {
			System.out.println("Strings are rotated");
		}
		else {
			System.out.println("Strins are not rotated");
		}
	}

}
