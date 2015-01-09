package GeeksforGeeks;

public class Insertion_Deletion extends LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_Deletion node = new Insertion_Deletion();
		node.addtoTail(5);
		node.addtoTail(2);
		node.addtoTail(13);
		node.addtoTail(19);
		node.addtoTail(45);
		node.printNode();
		Insertion_Deletion nodehead = new Insertion_Deletion();
		nodehead.addtoHead(5);
		nodehead.addtoHead(4);
		nodehead.addtoHead(22);
		nodehead.addtoHead(7);
		nodehead.addtoHead(90);
		nodehead.printNode();
	}

}
