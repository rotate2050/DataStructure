package Careercup;

public class rotated_strings {
	static String x1 = "trial";
	static String x2 = null;

	public static Boolean string_compare(String x1, String x2) {
		if (x1 == null || x2 == null) {
			return false;
		}
		String x3 = x1 + x1;

		if (x1.length() == x2.length()) {
			if (x3.contains(x2))
				return true;

		}
		return false;
	}

	public static String extract_vowels(String x1) {
		if (x1 == null) {
			return null;
		}
		// x1 = x1.toLowerCase();
		char[] x2 = x1.toCharArray();
		// char [] x3 = new char[x1.length()];
		StringBuilder sb = new StringBuilder();
		//int j = 0;

		String vowels = "";

		for (int i = 0; i < x2.length; i++) {
			if (x2[i] == 'a' || x2[i] == 'e' || x2[i] == 'i' || x2[i] == 'o'
					|| x2[i] == 'u' || x2[i] == 'A' || x2[i] == 'E'
					|| x2[i] == 'I' || x2[i] == 'O' || x2[i] == 'U') {
				vowels = vowels + x2[i];
			} else {
				// x3[j++] = x2[i];
				sb.append(x2[i]);
			}

		}
		return (sb.toString());
		//return vowels;
	}

	public static void main(String[] args) {
		Boolean temp = string_compare(x1, x2);
		// System.out.println(temp);

		String temp2 = extract_vowels("HelloUser");
		System.out.println(temp2);

	}

}
