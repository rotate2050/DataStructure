package Cracking_Coding_Interview;
import java.util.Hashtable;


public class Linked_List_1 {
	Linked_List_1 next;
	int value;
	public Linked_List_1(int val) {
		this.value = val;
		this.next = null;
	}
	
	public void AddtoTail(int val) {
		Linked_List_1 end = new Linked_List_1(val);
		Linked_List_1 temp = this;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = end;
	}
	
	public Linked_List_1 DeleteNode(int data, Linked_List_1 node) {
		Linked_List_1 head = node;
		if (head.value==data) {
			head = head.next;
			return head;
		}
		while (head.next!=null) {
			if (head.next.value==data) {
				head.next = head.next.next;
				return node;
			}
			head = head.next;
		}
		return head;
	}
	
	public Linked_List_1 RemoveDuplicates(Linked_List_1 head) {
		Linked_List_1 n = head;
		if (head.next==null){
			return head;
		}
		Hashtable hashtb = new Hashtable();
		//Linked_List_1 previous = null;
		hashtb.put(head.value,true);
		while (n.next != null) {
			System.out.println("Current Value:: " + n.next.value);
			if (hashtb.containsKey(n.next.value)){
				if (n.next.next!=null) {
					n.next = n.next.next;
					System.out.println("Deleted References");
				}
				
			} //previous.next = n.next;
			else {
				hashtb.put(n.next.value, true);
				n = n.next;
				//previous = n;
				//previous = previous.next;
			}
			//n = n.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_1 test = new Linked_List_1(1);
		test.AddtoTail(2);
		test.AddtoTail(2);
		test.AddtoTail(3);
		test.AddtoTail(4);
		test.AddtoTail(1);
		test.AddtoTail(5);
		test.AddtoTail(4);
		test.AddtoTail(6);
		
		test = test.RemoveDuplicates(test);
		
		System.out.println("Element:: " + test.value);
		while(test.next!=null) {
			System.out.println("Element:: " + test.next.value);
			test = test.next;
		}
	}

}
