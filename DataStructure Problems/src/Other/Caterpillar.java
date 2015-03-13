package Other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Caterpillar {

	static int countUneatenLeaves(int N, int[] A) {

		int no_leaves = N;
		int no_caterpillars = A.length;

		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < no_caterpillars; i++) {
			int temp = A[i];
			int multiple = 2;
			if (map.get(temp) == null) {
				while (temp <= N) {
					map.put(temp, 1);
					temp = A[i] * multiple;

					multiple++;
				}
			}
		}

		int count = N - map.size();
		return count;*/
		int total_leaves_visited = 0;
		
		HashMap <Integer,Boolean> update_array =new HashMap<Integer,Boolean>();
		
		for (int i=0;i<A.length;i++) {
			update_array.put(A[i], true);
		}
		for (int i=0;i<A.length;i++) {
			for (int j=i+1;j<A.length;j++) {
				
					
					int min_number = Math.min(A[i], A[j]);
					int max_number = Math.max(A[i], A[j]);
					if ((max_number % min_number)==0) {
						if (update_array.keySet().contains(max_number)) {
							update_array.put(max_number,false );
						}
						
					}
			}
		}
		ArrayList<Integer> new_array= new ArrayList<Integer>(); 
		
		for (Integer key : update_array.keySet()) {
			if (update_array.get(key)) {
				new_array.add(key);
			}
		}
		for(int i=0;i<new_array.size();i++) {
			int leaves_visited = N / new_array.get(i) ;
			total_leaves_visited = total_leaves_visited + leaves_visited;
		}
		
		for (int i=0;i<new_array.size();i++) {
			for (int j=i+1;j<new_array.size();j++) {
				int common_leaves = 0;
				int min_number = Math.min(new_array.get(i), new_array.get(j));
				int max_number = Math.max(new_array.get(i), new_array.get(j));
									int lcm = (max_number * min_number);
					common_leaves = N / lcm;
					total_leaves_visited -= common_leaves;
				
				
			}
		}
		
		return (N - total_leaves_visited);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_leaves = 50;
		int[] A = {3,6,7,10};
		System.out.println(countUneatenLeaves(total_leaves, A));
	}

}
