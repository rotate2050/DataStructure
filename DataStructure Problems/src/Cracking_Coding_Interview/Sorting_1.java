package Cracking_Coding_Interview;

public class Sorting_1 {

	int[] mergeSortedArray(int[] a, int[] b) {
		int[] sorted_array = new int[a.length+b.length];
		int aindex = 0;
		int bindex = 0;
		for (int i=0;i<(a.length+b.length);i++) {
			if (a[aindex] <= b[bindex]) {
				sorted_array[i] = a[aindex];
				aindex++;
			}
			else {
				sorted_array[i] = b[bindex];
				bindex++;
			}
		}
		return sorted_array;
	}
	
	int[] mergeSortedArraywithotbuffer(int[] a, int[] b,int i, int j) {
		int sorted_index = i + j - 1;
		int aindex = i - 1;
		int bindex = j - 1;
		while ((aindex >= 0) && (bindex >= 0)) {
			if (a[aindex] >= b[bindex]) {
				a[sorted_index] = a[aindex];
				sorted_index--;
				aindex--;
			}
			else {
				a[sorted_index] = b[bindex];
				sorted_index--;
				bindex--;
			}
		}
		if (aindex<0) {
			while(bindex >= 0) {
				a[sorted_index] = b[bindex];
				sorted_index--;
				bindex--;
			}
		}
		/*if (bindex<0) {
			while(aindex>=0) {
				a[sorted_index] = a[bindex];
				sorted_index--;
				aindex--;
			}
		}*/
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,102,125,0,0,0,0,0,0,0,0,0};
		int[] b = {25,85,101,76,98,103,201,450,852};
		
		Sorting_1 test = new Sorting_1();
		int[] hey = test.mergeSortedArraywithotbuffer(a, b, 5, 9);
		for (int i=0;i<hey.length;i++) {
			System.out.println(hey[i]);
		}
	}

}
