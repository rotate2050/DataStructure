package Cracking_Coding_Interview;

public class Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst1 = new BinarySearchTree();
		bst1.insert(56);
		bst1.insert(36);
		bst1.insert(20);
		bst1.insert(40);
		bst1.insert(39);
		bst1.insert(50);
		bst1.insert(70);
		bst1.insert(75);
		bst1.insert(73);
		System.out.println("In Order Traversal");
		bst1.inorderTraversal(bst1.root);
		/*System.out.println("Post Order Traversal");
		bst1.postorderTraversal(bst1.root);
		System.out.println("Pre Order Traversal");
		bst1.preorderTraversal(bst1.root);*/
		/*int height = bst1.findDepth(bst1.root);
		System.out.println("Height of the tree = "+height);
		int deoth = bst1.findDepthbyKey(bst1.root, 45);
		System.out.println("Height of the node is = " + deoth);*/
		System.out.println("Inorder without Recursion ::");
		bst1.inorderIterator(bst1.root);
	}

}
