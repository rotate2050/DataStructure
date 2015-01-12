package Cracking_Coding_Interview;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tree_4 {

	ArrayList<LinkedList<SubTree>> findLevelLinkList(SubTree root) {
		 int level = 0;
		 ArrayList<LinkedList<SubTree>> result = new ArrayList<LinkedList<SubTree>>();
		 LinkedList<SubTree> list = new LinkedList<SubTree>();
		 list.add(root);
		 result.add(level, list);
		 while (true) {
			 list = new LinkedList<SubTree>();
			 for (int i = 0; i < result.get(level).size(); i++) {
				 SubTree n = (SubTree) result.get(level).get(i);
				 if (n != null) {
					 if(n.left_child != null) list.add(n.left_child);
					 if(n.right_child!= null) list.add(n.right_child);
				 }
			 }
			 if (list.size() > 0) {
				 result.add(list);
			 } 
			 else {
				 break;
			 }
			 level++;
		 }
	 return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LinkedList<SubTree>> result = new ArrayList<LinkedList<SubTree>>();
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
		Tree_4 t4 = new Tree_4();
		result = t4.findLevelLinkList(bst.root);
		for(int i =0;i<result.size();i++) {
			LinkedList<SubTree> l = result.get(i);
			System.out.println("Nodes of Depth " + i);
			for(int j = 0; j < l.size();j++) {
				SubTree n = l.get(j);
				System.out.print(n.value + "->");
			}
			System.out.println();
		}
	}

}
