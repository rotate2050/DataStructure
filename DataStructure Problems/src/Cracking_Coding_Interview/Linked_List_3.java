package Cracking_Coding_Interview;

import Other.LinkedListTest;

public class Linked_List_3 {

	Node head;
	
	public Linked_List_3() {
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
	
	Node addLinkedList(Node head1, Node head2) {
		Linked_List_3 result = new Linked_List_3();
		if (head1==null || head2==null) {
			if (head1==null) {
				return head1;
			}
			else {
				return head2;
			}
		}
		
		Node node1 = head1;
		Node node2 = head2;
		int carry = 0;
		while(node1!=null && node2!=null) {
			int sum = (node1.data + node2.data + carry) % 10;
			carry = (node1.data + node2.data + carry) > 9 ? 1 : 0;
			result.insertNode(sum);
			node1 = node1.next;
			node2 = node2.next;
		}
		
		if (node1==null&&node2==null) {
			if(carry!=0) {
				result.insertNode(1);
			}
		}
		
		if (node1!=null) {
			
			while(node1!=null) {
				if (carry!=0) {
					result.insertNode(node1.data + 1);
					carry = 0;
				}
				else {
					result.insertNode(node1.data);
				}
				node1 = node1.next;
			}
		}
		else {
			while(node2!=null) {
				if (carry!=0) {
					result.insertNode(node2.data + 1);
				}
				else {
					result.insertNode(node2.data);
				}
				
				node2 = node2.next;
			}
		}
		
		return result.head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_3 lnklst1 = new Linked_List_3();
		lnklst1.insertNode(4);
		lnklst1.insertNode(9);
		lnklst1.insertNode(3);
		lnklst1.printLinkedList();
		
		Linked_List_3 lnklst2 = new Linked_List_3();
		lnklst2.insertNode(1);
		lnklst2.insertNode(5);
		lnklst2.insertNode(7);
		lnklst2.printLinkedList();
		Node head = lnklst1.addLinkedList(lnklst1.head, lnklst2.head);
		while (head!=null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
	}

}
