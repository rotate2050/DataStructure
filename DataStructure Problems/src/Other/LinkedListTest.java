package Other;

import java.util.Hashtable;

public class LinkedListTest {

	Node head;

	public LinkedListTest() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}

	void insertNode(int value) {
		Node new_node = new Node(value);
		
		if (head==null) {
			this.head = new_node;
		}
		
		else {
			Node node = this.head;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = new_node;
		}
	}

	void printLinkedList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("null");
	}

	/*LinkedListTest removeDuplicates() {
		Hashtable<Integer, Boolean> unique = new Hashtable<Integer,Boolean>();
		Node node = this.head;
		LinkedListTest updated = new LinkedListTest();
		while(node!=null) {
			if (unique.containsKey(node.data)) {
				
			}
			else {
				updated.insertNode(node.data);
				unique.put(node.data, true);
			}
			node = node.next;
		}
		return updated;
	}*/
	
	void removeDuplicates() {
		Hashtable<Integer, Boolean> unique = new Hashtable<Integer,Boolean>();
		Node node = this.head;
		Node prev_unique_node = null;
		while(node!=null) {
			if (unique.containsKey(node.data)) {
				prev_unique_node.next = node.next; 
			}
			else {
				//updated.insertNode(node.data);
				unique.put(node.data, true);
				prev_unique_node = node;
			}
			
			node = node.next;
		}
		//return updated;
	}
	
	void 	removeDuplicates2() {
		Hashtable<Integer, Boolean> unique = new Hashtable<Integer,Boolean>();
		if (this.head==null) {
			return;
		}
		else {
			Node previous = this.head;
			Node current = this.head.next;
			while(current!=null) {
				Node inner = head;
				while(inner!=current) {
					if (inner.data==current.data) {
						Node tmp = current.next;
						previous.next = tmp;
						current = tmp;
						break;
					}
				}
				
				/*if (unique.containsKey(node.data)) {
					//prev_unique_node.next = node.next; 
				}
				else {
					//updated.insertNode(node.data);
					unique.put(node.data, true);
					//prev_unique_node = node;
				}
				
				node = node.next;*/
			}
		}
		
		//return updated;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTest lnklst = new LinkedListTest();
		//lnklst.insertNode(55);
		/*lnklst.insertNode(45);
		lnklst.insertNode(1);
		lnklst.insertNode(400);
		lnklst.insertNode(55);
		lnklst.insertNode(1000);
		lnklst.insertNode(1);
		lnklst.insertNode(1);
		lnklst.insertNode(45);
		lnklst.insertNode(3);*/
		lnklst.printLinkedList();
		//lnklst = lnklst.removeDuplicates();
		lnklst.removeDuplicates();
		System.out.println("After removing Duplicates");
		lnklst.printLinkedList();
	}

}
