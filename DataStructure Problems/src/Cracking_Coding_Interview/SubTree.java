package Cracking_Coding_Interview;



public class SubTree {
	SubTree left_child;
	SubTree right_child;
	int value;
	SubTree(int d) {
		this.left_child = null;
		this.right_child = null;
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
				prev.left_child = temp;
			}
			else {
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
		System.out.println(root.value);
		inorderTraversal(root.right_child);
	}
	
	void postorderTraversal(SubTree root) {
		if (root==null) {
			return;
		}
		postorderTraversal(root.left_child);
		postorderTraversal(root.right_child);
		System.out.println(root.value);
	}
	
	void preorderTraversal(SubTree root) {
		if (root==null) {
			return;
		}
		System.out.println(root.value);
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
	
	/*void treebfs(SubTree root) {
		
	}*/
}