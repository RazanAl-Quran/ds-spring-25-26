public class LL {
    Node head;

    LL() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clearLL() {
        head = null;
    }

    public void insertNodeFirst(int v) {
        Node newNode = new Node(v);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void printLL() {
        if (isEmpty()) {
            System.out.println("LL is EMPTY!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    void insertNodeLast(int v) {
        Node newNode = new Node(v);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next !=null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void removeFirstNode() {
        if (isEmpty()) {
            System.out.println("LL is already Empty !!!");
            return;
        }
        head = head.next;
    }

}
