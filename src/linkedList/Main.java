package linkedList;

public class Main {
	public static void main(String[] args) {
		/*
		 * LL list = new LL(); list.insertFirst(3); list.insertFirst(2);
		 * list.insertFirst(8); list.insertFirst(17); list.insertLast(99);
		 * list.insertAtIndex(100, 3); list.display();
		 * System.out.println(list.deleteFirst()); list.display();
		 * System.out.println(list.deleteLast()); list.display();
		 * System.out.println(list.deleteAtIndex(2)); list.display();
		 */

		/*
		 * DLL list = new DLL();
		 * list.insertFirst(3);
		 * list.insertFirst(2);
		 * list.insertFirst(8);
		 * list.insertFirst(17);
		 * list.insertLast(99);
		 * list.insertAfterAValue(8, 65);
		 * list.display();
		 */

		CLL list = new CLL();
		list.insert(8);
		list.insert(9);
		list.insert(2);
		list.insert(7);
		// list.insert(10);
		// list.insertAfterAValue(8, 65);
		list.display();
	}
}
