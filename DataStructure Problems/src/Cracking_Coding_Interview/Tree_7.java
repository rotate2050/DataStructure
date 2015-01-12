package Cracking_Coding_Interview;

public class Tree_7 {

	boolean containsTree(SubTree t1, SubTree t2) {
		if (t2 == null) return true; // The empty tree is always a subtree
		else return subTree(t1, t2);
	}
	boolean subTree(SubTree r1, SubTree r2) {
		if (r1 == null)
			return false; // big tree empty & subtree still not found.
		if (r1.value == r2.value) {
			if (matchTree(r1,r2)) return true;
		}
		return (subTree(r1.left_child, r2) || subTree(r1.right_child, r2));
	}
	boolean matchTree(SubTree r1, SubTree r2) {
		if (r2 == null && r1 == null)
			return true; // nothing left in the subtree
		if (r1 == null || r2 == null)
			return false; // big tree empty & subtree still not found
		if (r1.value != r2.value)
			return false; // data doesn’t match
		return (matchTree(r1.left_child, r2.left_child) &&
				matchTree(r1.right_child, r2.right_child));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_7 t7 = new Tree_7();
		BinarySearchTree bst1 = new BinarySearchTree();
		BinarySearchTree bst2 = new BinarySearchTree();
		bst1.insert(56);
		bst1.insert(36);
		bst1.insert(20);
		bst1.insert(40);
		bst1.insert(39);
		bst1.insert(50);
		bst1.insert(70);
		bst1.insert(75);
		bst1.insert(73);
		
		
		bst2.insert(70);
		bst2.insert(75);
		bst2.insert(73);
		
		System.out.println("Is bst2 is subtree of bst1? ::" + t7.containsTree(bst1.root, bst2.root));
	}

}
