/** To find the pairs for given sum in the given 
 *  Array. Pairs should not get printed twice.
 */

package Other;

import java.util.HashMap;

public class Find_Pairs_For_Sum {
	
	public static void sumTo(int[] arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : arr) {
			int numToFind = sum - a;
			if (map.get(a) == null) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);

			}
			Object value;
			if ((value = map.get(numToFind)) != null) {
				if (a == numToFind) {
					if ((Integer) value > 1)
						System.out.println(a + " " + numToFind);
				} else {
					if (map.get(numToFind) > 0) {
					map.put(numToFind, map.get(numToFind) - 1);
					System.out.println(a + " " + numToFind);
					}
				}
			}

		}

	}

	public static void main(String args[]) {
		System.out.println("NUPur");
		int arr[] = { 1, 2, 3,3,3 };
		int sum = 2;
		sumTo(arr, sum);
	}

}