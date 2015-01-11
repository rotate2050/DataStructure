package Cracking_Coding_Interview;


public class Tree_3 {

	/**
	 * This method Returns the root node of Binary Tree which minimal height 
	 * from the given integer sorted array
	 * @param sorted_array Integer
	 * @return SubTree with root node of binary Tree
	 */
	SubTree createBinaryfromArray(int[] sorted_array, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) /2 ;
		SubTree n = new SubTree(sorted_array[mid]);
		n.left_child = createBinaryfromArray(sorted_array, start, mid - 1);
		n.right_child = createBinaryfromArray(sorted_array, mid+1, end);
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] treearray = {20,36,39,40,50,56,70,73,75};
		Tree_3 t3 = new Tree_3();
		SubTree sb = t3.createBinaryfromArray(treearray, 0, treearray.length - 1);
		BinarySearchTree bst = new BinarySearchTree(sb);
		bst.inorderTraversal(bst.root);
		//System.out.println("hello");
	}

}
