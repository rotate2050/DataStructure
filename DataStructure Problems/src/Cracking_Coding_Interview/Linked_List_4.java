package Cracking_Coding_Interview;

import Other.LinkedListTest;
import Other.Node;

public class Linked_List_4 {

	Node head;
	
	Node returnCircularNode(Node head) {
		Node pntr2 = head;
		Node pntr1 = head;
		
		do{
			pntr1 = pntr1.next;
			pntr2 = pntr2.next.next;
		} while (pntr1!=pntr2);
		
		pntr1 = head;
		while(pntr1!=pntr2){
			pntr1 = pntr1.next;
			pntr2 = pntr2.next;
		}
		return pntr1;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_4 lnklst = new Linked_List_4();
		lnklst.insertNode(3);
		Node node = lnklst.head;
		Node temp = new Node(5);
		node.next = temp;
		node = node.next;
		
		temp = new Node(7);
		node.next = temp;
		node = node.next;
		
		temp = new Node(9);
		Node circular = temp;
		node.next = temp;
		node = node.next;
		
		temp = new Node(11);
		node.next = temp;
		node = node.next;
		
		temp = new Node(13);
		node.next = temp;
		node = node.next;
		
		temp = new Node(15);
		node.next = temp;
		node = node.next;
		
		temp = new Node(17);
		node.next = temp;
		node = node.next;
		
		temp = new Node(19);
		node.next = temp;
		node = node.next;
		
		temp = new Node(21);
		node.next = temp;
		node = node.next;
		
		temp = new Node(23);
		node.next = temp;
		node = node.next;
		
		temp = new Node(25);
		node.next = temp;
		node = node.next;
		
		node.next = circular;

		//lnklst.printLinkedList();
		Node answer = lnklst.returnCircularNode(lnklst.head);
		System.out.println(answer.data);
		
	}

}
