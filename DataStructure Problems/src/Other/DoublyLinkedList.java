package Other;

public class DoublyLinkedList {
	Node head, tail;
	
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = null;
	}
	
	public DoublyLinkedList(int n) {
		Node temp = new Node(n);
		this.head = temp;
		this.tail = temp;
	}
	
	public void addToTail(int data) {
		Node temp = new Node(data);
		if (head==null || tail==null) {
			this.head = temp;
			this.tail = temp;
		}
		else {
			Node node = this.head;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = temp;
			temp.prev = node;
		}
	}
	
	public void traversal(Node head) {
		Node node = head;
		while(node!=null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("Null");
	}
	
	public static void main(String[] a) {
		DoublyLinkedList dl = new DoublyLinkedList(5);
		dl.addToTail(45);
		dl.addToTail(60);
		dl.addToTail(1);
		dl.addToTail(598);
		dl.addToTail(-67);
		dl.traversal(dl.head);
	}
}
