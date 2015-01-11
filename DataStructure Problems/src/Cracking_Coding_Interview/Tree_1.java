package Cracking_Coding_Interview;

public class Tree_1 extends BinarySearchTree{
	
	Tree_1() {
		super();
	}
	
	Tree_1(SubTree b) {
		super(b);
	}
	
	/**
	 * This method checks whether the given tree is balanced or not
	 * @param pass the root of the given Tree for which you want to check whether
	 * 		  its balanced or not
	 * @return true if its balanced otherwise false
	 */
	boolean isTreeBalanced(SubTree root) {
		// if tree is empty return false
		if (root==null) {
			return false;
		}
		// otherwise checks the difference of the min height and max height should not be greater than 1
		if ((maxheightofTree(root) - minheightofTree(root))<1) {
			return true;
		}
		
		return false;
	}
	/**
	 * This method finds the height of the Tree
	 * @param root Tree
	 * @return integer with 
	 */
	int maxheightofTree(SubTree root) {
		int height;
		// if node has no children then return 0 as a height
		if (root==null) {
			return 0;
		}
		// otherwise calculate the max height of the subtree
		else {
			height = 1 + Math.max(maxheightofTree(root.left_child),maxheightofTree(root.right_child));
			return height;
		}
		 
	}
	/**
	 * This method finds the minimum height of the Tree
	 * @param root Object of SubTree class
	 * @return minimum height of any leaf node in the Tree
	 */
	int minheightofTree(SubTree root) {
		int height;
		// if node has no children then return 0 as a height
		if (root==null) {
			return 0;
		}
		// otherwise calculate the man height of the subtree
		else {
			height = 1 + Math.min(minheightofTree(root.left_child), minheightofTree(root.right_child)); // if tree has children then calls method recursively for its children to find the height
			return height;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_1 bst = new Tree_1();
		bst.insert(56);
		bst.insert(36);
		bst.insert(20);
		bst.insert(40);
		bst.insert(39);
		bst.insert(50);
		bst.insert(70);
		bst.insert(75);
		bst.insert(73);
		int minheight = bst.minheightofTree(bst.root);
		int maxheight = bst.maxheightofTree(bst.root);
		System.out.println("MIN Height: " + minheight);
		System.out.println("MAX Height: " + maxheight);
	}

}
