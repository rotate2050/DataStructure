package GeeksforGeeks;

public class Node {
	Node next;
	int data;
	//Node prev;
	Node(int d) {
		this.data = d;
		this.next = null;
	}
}

class LinkedList{
	Node head=null;
	
	void addtoTail(int d) {
	
		Node temp = new Node(d);
		//if head is null
		if (head==null) {
			this.head=temp;
			return;
		}
		
		//else
		Node n = this.head;
		while(n.next!=null) {
			n = n.next;
		}
		n.next = temp;
	}
	
	void printNode() {
		Node node = this.head;
		while(node!=null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println("null");
	}
	
	void addtoHead(int d) {
		Node node = this.head;
		Node temp = new Node(d);
		temp.next = this.head;
		this.head = temp;
	}
	
	Node deletebyKey(int i) {
		Node node = this.head;
		Node prev=null;
		while(node!=null && node.data!=i) {
			prev = node;
			node = node.next;
		}
		if (prev!=null) {
			prev.next = node;
		}
		node = node.next;
		return node;
	}
	
	Node deletebyNode(Node n) {
		Node node = this.head;
		Node prev = null;
		while(node!=null && node!=n) {
			prev = node;
			node = node.next;
		}
		if (prev!=null) {
			prev.next = node;
		}
		node = node.next;
		return node;
	}
}
	
