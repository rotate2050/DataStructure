package Cracking_Coding_Interview;

public class Sorting_3 {

	int modifiedBinarySearch(int[] a, int l, int u,
			int x) {
		while (l <= u) {
			int m = (l + u) / 2;
			if (x == a[m]) {
				return m;
			} else if (a[l] <= a[m]) {
				if (x > a[m]) {
					l = m + 1;
				} else if (x >= a[l]) {
					u = m - 1;
				} else {
					l = m + 1;
				}
			} else if (x < a[m])
				u = m - 1;
			else if (x <= a[u])
				l = m + 1;
			else
				u = m - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };
		Sorting_3 temp = new Sorting_3();
		System.out.println(temp.modifiedBinarySearch(a, 0, 11, 25));
	}

}
