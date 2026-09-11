package linkedList;

public class DLL {
	private Node head;

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.previous = null;
		if (head != null)
			head.previous = node;
		head = node;
	}

	public void insertLast(int value) {
		Node node = new Node(value);
		Node last = head;

		node.next = null;

		if (head == null) {
			node.previous = null;
			head = node;
			return;
		}

		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
		node.previous = last;
	}

	public Node findNodeAtValue(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	public void insertAfterAValue(int after, int val) {
		Node p = findNodeAtValue(after);

		if (p == null) {
			System.out.println("node doesn't exist");
			return;
		}

		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.previous = p;
		if (node.next != null)
			node.next.previous = node;

	}

	public void display() {
		Node node = head;
		Node last = null;
		while (node != null) {
			System.out.print(node.value + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println("END");
		System.out.println("Print in reverse");

		while (last != null) {
			System.out.print(last.value + " -> ");
			last = last.previous;
		}

		System.out.println("Start");
	}

	private class Node {
		int value;
		Node next;
		Node previous;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next, Node previous) {
			super();
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

	}
}
