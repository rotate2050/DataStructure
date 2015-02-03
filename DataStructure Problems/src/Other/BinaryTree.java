package Other;

import Cracking_Coding_Interview.Binary_Search_Tree;
import Cracking_Coding_Interview.SubTree;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BinarySearchTree test = new BinarySearchTree();
		SubTree node1 = new SubTree(5);
		SubTree root = new SubTree(50);
		SubTree node2 = new SubTree(3);
		SubTree node3 = new SubTree(20);
		SubTree node4 = new SubTree(52);
		SubTree node5 = new SubTree(1);
		SubTree node6 = new SubTree(8);
		SubTree node7 = new SubTree(102);
		root.left_child = node3;
		root.right_child = node4;
		node4.right_child = node7;
		node3.left_child = node2;
		node2.left_child = node5;
		node2.right_child = node1;
		node1.left_child = node6;
		//test.
	}

}
