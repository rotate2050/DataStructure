package Cracking_Coding_Interview;

public class Node {
	public Node next;
	public int data;
	public Node prev;
	public Node(int d) {
		this.data = d;
		this.next = null;
		this.prev = null;
	}
}
