package linkedList;

public class LL {
	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null)
			tail = head;

		size += 1;
	}

	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insertAtIndex(int value, int index) {
		if (index == 0) {
			insertFirst(value);
			return;
		}
		if (index == size) {
			insertLast(value);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(value, temp.next);
		temp.next = node;

		size++;
	}

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (head == null)
			tail = null;
		size--;

		return val;
	}

	public Node findNodeAtValue(int value) {
		Node node = head;
		while(node != null) {
			if(node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public Node getIndex(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public int deleteLast() {
		if (size <= 1)
			return deleteFirst();

		Node secondLast = getIndex(size - 2); // secondLast = penultimo
		tail = secondLast;
		int val = tail.next.value;
		tail.next = null;
		size--;
		return val;
	}

	public int deleteAtIndex(int index) {
		if (index == 0)
			return deleteFirst();
		if (index == size - 1)
			return deleteLast();

		Node prev = getIndex(index - 1);
		int val = prev.next.value;

		prev.next = prev.next.next;

		return val;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
	}
}
