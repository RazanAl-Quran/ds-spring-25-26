public class LL {
    private Node head;

    LL() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = null;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printLL() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("*****************");
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }



    public Node getHead() {
        if (isEmpty()) {
            return null;
        }
        return head;

    }
}
