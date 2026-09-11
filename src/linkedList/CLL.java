package linkedList;

public class CLL {
    private Node head, tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null)
            return;

        // if value to be deleted is head
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        // if value to be delete is any other
        do {
            Node n = node.next;
            if(n.val == val)
        } while (condition);
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;

            } while (temp != head);
        }
        System.out.println("END");
        System.out.println("Head: " + head.val);
        System.out.println("Tail: " + tail.val);
    }

    private class Node {
        int val;
        Node next;

        Node(int val) {
            super();
            this.val = val;
        }
    }
}
