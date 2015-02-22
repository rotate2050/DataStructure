package Cracking_Coding_Interview;

import java.util.Stack;

import javax.swing.tree.TreeNode;



public class SubTree {
	public SubTree left_child;
	public SubTree right_child;
	public SubTree parent;
	public int value;
	public SubTree(int d) {
		this.left_child = null;
		this.right_child = null;
		this.parent = null;
		this.value = d;
	}
}

class BinarySearchTree {
	SubTree root = null;
	//int depth = 0;
	
	public BinarySearchTree(SubTree node) {
		// TODO Auto-generated constructor stub
		//SubTree node = new SubTree(root.);
		this.root = node;
	}
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		//SubTree node = new SubTree(root.);
		this.root = null;
	}
	
	/**
	 * This method insert the given element integer.
	 * @param integer which you want to insert into Tree
	 */
	
	void insert(int d) {
		SubTree node = root;
		SubTree temp = new SubTree(d);
		SubTree prev=null;
		// if Tree is empty
		if (node==null) {
			root = temp;
		}
		// otherwise find proper node where new node can be added
		else {
			while(node!=null) {
				if (node.value > d) {
					prev = node;
					node = node.left_child;
				}
				else {
					prev = node;
					node = node.right_child;
				}
			}
			if (prev.value > d) {
				temp.parent = prev;
				prev.left_child = temp;
			}
			else {
				temp.parent = prev;
				prev.right_child = temp;
			}
			//node = temp;
		}
	}
	
	void inorderTraversal(SubTree root) {
		if (root==null) {
			return;
		}
		inorderTraversal(root.left_child);	
		System.out.print(root.value + ",");
		inorderTraversal(root.right_child);
	}
	
	void postorderTraversal(SubTree root) {
		if (root==null) {
			return;
		}
		postorderTraversal(root.left_child);
		postorderTraversal(root.right_child);
		System.out.print(root.value + ",");
	}
	
	void preorderTraversal(SubTree root) {
		if (root==null) {
			return;
		}
		System.out.print(root.value + ",");
		preorderTraversal(root.left_child);
		preorderTraversal(root.right_child);
		
	}
	
	int findDepth(SubTree root) {
		int depth;
		// if root of the tree is null then return 0
		if (root==null) {
			return 0;
		}
		// if not then calculate the height of the tree
		depth = 1 + Math.max(findDepth(root.left_child), findDepth(root.right_child)); 
		return depth;   //1 + Math.max(finddepth(root.left_child), finddepth(root.right_child));
	}
	
	int findDepthbyKey(SubTree root,int key) {
		int depth = 0;
		// if root is null then return 0
		if (root==null) {
			return 0;
		}
		
		while (root!=null) {
			if (root.value > key) {
				depth += 1;
				root = root.left_child;
			}
			else if (root.value < key) {
				depth += 1;
				root = root.right_child ;
			}
			else {
				return depth;
			}
		}
		
		return 0;
	}
	
	SubTree SearchByKey(int key) {
		if (this.root==null) {
			return null;
		}
		SubTree node = this.root;
		while(node!=null) {
			if (node.value > key) {
				node = node.left_child;
			}
			else if (node.value < key){
				node = node.right_child;
			}
			else {
				break; 
			}
		}
		return node;
		
	}
	
	void inorderIterator(SubTree root) {
		Stack<SubTree> st = new Stack<SubTree>();
		SubTree cur_node = root;
		
		while(cur_node!=null && (!st.isEmpty())) {
			
			while(cur_node!=null) {
				st.push(cur_node);
				cur_node = cur_node.left_child;
			}
			if (cur_node==null && (!st.isEmpty())) {
				SubTree temp = st.pop();
				System.out.print(temp.value + " ");
				cur_node = temp.right_child;
			}
		}
		//System.out.print("Rushikesh");
	}
	
	void preorderIterator(SubTree root) {
		Stack<SubTree> st = new Stack<SubTree>();
		SubTree cur_node = root;
		
		while(cur_node!=null || (!st.isEmpty())) {
			
			System.out.print(cur_node.value + ",");
			
			while(cur_node!=null) {
				if(cur_node.right_child!=null) {
					st.push(cur_node.right_child);
				}
				cur_node = cur_node.left_child;
				if (cur_node!=null) {
					System.out.print(cur_node.value + ",");
				}
			}
			if (cur_node==null && (!st.isEmpty())) {
				SubTree temp = st.pop();
				cur_node = temp;
			}
		}
		//System.out.print("Rushikesh");
	}
	
	
	/*void treebfs(SubTree root) {
		
	}*/
	
	public boolean isBinaryTree(SubTree root) {
		if ((root.left_child==null) && (root.right_child==null)) {
			return true;
		}
		else if ((root.left_child==null) || (root.right_child==null)) {
			
			if (root.left_child==null) {
				if (root.right_child.value > root.value) {
					return isBinaryTree(root.right_child);
				}
				else {
					return false;
				}
			}
			else {
				if (root.left_child.value < root.value) {
					return isBinaryTree(root.left_child);
				}
				else {
					return false;
				}
				
			}
		}
		
		else if ((root.left_child.value <= root.value) && (root.right_child.value >= root.value)) {
			if((isBinaryTree(root.left_child))&&(isBinaryTree(root.right_child))) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
	/*void add(int i) {
		SubTree node = root;
		SubTree temp = new SubTree(i);
		SubTree prev=null;
		// if Tree is empty
		if (node==null) {
			root = temp;
		}
		while () {
			
		}
	}*/
}