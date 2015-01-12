package Cracking_Coding_Interview;

public class Tree_5 {

	public SubTree inorderSucc(SubTree e) {
		if (e != null) {
			SubTree p;
			// Found right children -> return 1st inorder node on right
			if (e.parent == null || e.right_child != null) {
				p = leftMostChild(e.right_child);
			} 
			else {
				// Go up until we’re on left instead of right (case 2b)
				while ((p = e.parent) != null) {
					if (p.left_child == e) {
						break;
					}
					e = p;
				}
			}
			return p;
		}
		return null;
	}
		
	public static SubTree leftMostChild(SubTree e) {
		if (e == null) return null;
		while (e.left_child != null) e = e.left_child;
			return e;
	}
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
		Tree_5 t = new Tree_5();
		SubTree find = t.inorderSucc(bst.SearchByKey(75));
		System.out.println("Next Successor: " + find.value);
	}
	
}
