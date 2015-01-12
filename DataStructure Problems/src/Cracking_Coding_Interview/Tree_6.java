package Cracking_Coding_Interview;

public class Tree_6 {
	/**
	 * If parent of each node is not available then 
	 * We can check for each node whether two given 
	 * nodes are on the same side or not. If both 
	 * nodes are on the different side then we can 
	 * return that node as a common ancestor.
	 * @param root Root Node of the Given tree
	 * @param p first node
	 * @param q second node
	 * @return common ancesetor 
	 */
	public SubTree commonAncestor(SubTree root, SubTree p, SubTree q) {
		if (covers(root.left_child, p) && covers(root.left_child, q))
			return commonAncestor(root.left_child, p, q);
		if (covers(root.right_child, p) && covers(root.right_child, q))
			return commonAncestor(root.right_child, p, q);
		return root;
	}
	/**
	 * This method checks whether given node p is the child of root node
	 * @param root	Root node for small tree
	 * @param p child node
	 * @return true if p is child of root otherwise false
	 */
	private boolean covers(SubTree root, SubTree p) { /* is p a child of root? */
		if (root == null) return false;
		if (root == p) return true;
		return covers(root.left_child, p) || covers(root.right_child, p);
	}

	/*public SubTree findcomnAncestor(SubTree root, SubTree p, SubTree q) {
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(56);
		bst.insert(36);
		bst.insert(20);
		bst.insert(40);
		bst.insert(39);
		bst.insert(50);
		bst.insert(70);
		bst.insert(75);
		bst.insert(73);
		Tree_6 t = new Tree_6();
		SubTree common_ancesctor = t.commonAncestor(bst.root, bst.SearchByKey(20), bst.SearchByKey(73));
		System.out.println("Common Ancesctor :" + common_ancesctor.value);
	}

}
