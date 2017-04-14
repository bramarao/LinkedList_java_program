import java.util.LinkedList;


public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList ll=new LinkedList();
     ll.add("a");
     ll.add("b");
     ll.add("c");
     ll.add("d");
     System.out.println("Original content of ll:"+ll);
     ll.remove("a");
     System.out.println("Content of ll after deletion:"+ll);
     ll.removeFirst();
     ll.removeLast();
     System.out.println("After deleting fist and last content of ll"+ll);
	}

}
