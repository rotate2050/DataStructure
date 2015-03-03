package Other;

public class Sort {

	int heapsize;
	
	public int[] bubbleSort(int array[]) {
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<(array.length-1);j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}
	
	public int[] insertionSort(int array[]) {
		for (int i=0;i<array.length;i++){
			//int index = i;
			int element = array[i];
			int j = 0,swap = -1;
			for (j=i-1;j>=0;j--) {
				if (array[j] > element) {
					array[j+1] = array[j];
					swap = j;
				}
			}
			if (swap!=-1) {
				array[swap] = element;
			}
		}
		
		return array;
	}
	
	public int[] selectionSort(int array[]) {
		for(int i=0;i<array.length;i++) {
			int min_index = i;
			for (int j=i+1;j<array.length;j++) {
				if (array[min_index] > array[j]) {
					min_index = j;
				}
			}
			int temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
		}
		return array;
	}
	
	public int[] mergeSort(int array[]) {
		//int sorted = 
		return mergesorting(array, 0, array.length-1);
	}
	
	public int[] mergesorting(int a[],int start, int end) {
		if (start == end) {
			int element[] = {a[start]};
			return element;
		}
		else{
			if (start < end) {
				int mid_index = (start + end)/2;
				int[] part1 = mergesorting(a, start, mid_index);
				int[] part2 = mergesorting(a, mid_index+1, end);
				int[] mergearray = merge(part1,part2);
				return mergearray;
			}
			return null;
		}
	}
	
	public int[] merge(int[] p1, int[] p2) {
		int[] mergeoutput = new int[p1.length + p2.length];
		int i =0,j=0,merge_index = 0;
		while(!(i >= p1.length)&& !(j >= p2.length)) {
			if (p1[i] > p2[j]) {
				mergeoutput[merge_index] = p2[j];
				j++;
			}
			else {
				mergeoutput[merge_index] = p1[i];
				i++;
			}
			merge_index++;
		}
		if (i==p1.length) {
			for(int k=j;k<p2.length;k++) {
				mergeoutput[merge_index] = p2[k];
				merge_index++;
			}
		}
		if (j==p2.length) {
			for(int k=i;k<p1.length;k++) {
				mergeoutput[merge_index] = p1[k];
				merge_index++;
			}
		}
		return mergeoutput;
	}
	
	public int[] quickSort(int array[]) {
		array = quick(array,0,(array.length - 1));
		return array;
	}
	
	public int[] quick(int[] array, int low, int high) {
		int mid = array[(low + (high - low) / 2)];
		int i = low;
		int j = high;

		while (i <= j) {

			while (mid > array[i])
				i++;

			while (mid < array[j])
				j--;

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}

		}
		
		if(low < j) {
			array = quick(array,low,j);
		}
		if(i<high) {
			array = quick(array,i,high);
		}
		return array;
	}
	
	
	
	public int[] heapSort(int array[]) {
		array = buildMaxHeap(array);
		for(int i=array.length-1;i>0;i--) {
			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;
			this.heapsize = this.heapsize - 1;
			array = maxHeapify(array, 0);
		}
		return array;
	}
	
	public int[] maxHeapify(int unsorted_array[], int index) {
		int left = ((index+1)*2 )-1;
		int right = ((index+1)*2 );
		int largest = index;
		if (left<=(this.heapsize - 1)) {
			if (unsorted_array[left]>unsorted_array[index]) {
				largest = left;
			}
		}
		if (right<=(this.heapsize - 1)) {
			if (unsorted_array[right]>unsorted_array[largest]) {
				largest = right;
			}
		}
		if (largest!=index) {
			int temp = unsorted_array[index];
			unsorted_array[index] = unsorted_array[largest];
			unsorted_array[largest] = temp;
			int[] un_array = maxHeapify(unsorted_array, largest);
			return un_array;
		}
		else {
			return unsorted_array;
		}
	}
	
	public int[] buildMaxHeap(int[] unsorted_array) {
		this.heapsize = unsorted_array.length;
		int half_length = (unsorted_array.length / 2) - 1;
		for (int i=half_length;i>-1;i--) {
			unsorted_array = maxHeapify(unsorted_array, i);
		}
		return unsorted_array;
	}
	
	public void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sorting = new Sort();
		int sorted[] = new int[8]; 
		/*sorted = sorting.bubbleSort(new int[]{6,5,3,1,8,7,2,4});
		System.out.println("Bubble Sort ::");
		sorting.printArray(sorted);
		
		sorted = new int[8];
		System.out.println("Insertion Sort ::");
		sorted = sorting.insertionSort(new int[]{6,5,3,1,8,7,2,4});
		sorting.printArray(sorted);
		
		sorted = new int[8];
		System.out.println("Selection Sort ::");
		sorted = sorting.selectionSort(new int[]{6,5,3,1,8,7,2,4});
		sorting.printArray(sorted);
		
		sorted = new int[8];
		System.out.println("Merge Sort ::");
		sorted = sorting.mergeSort(new int[]{6,5,3,1,8,7,2,4});
		sorting.printArray(sorted);*/
		
		/*System.out.println("");
		int[] heap = sorting.buildMaxHeap(new int[]{16,4,10,8,7,9,3,2,14,1});
		sorting.printArray(heap);*/
		
		sorted = new int[8];
		System.out.println("Quick Sort ::");
		sorted = sorting.quickSort(new int[]{6,5,3,1,8,7,2,4});
		sorting.printArray(sorted);
		
		/*sorted = new int[8];
		System.out.println("Heap Sort ::");
		sorted = sorting.heapSort(new int[]{6,5,3,1,8,7,2,4});
		sorting.printArray(sorted);*/
	}

}
