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
            System.out.print(current.value + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void insertNodeLast(int v) {
        Node newNode = new Node(v);
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

    void removeFirstNode() {
        if (isEmpty()) {
            System.out.println("LL is already Empty !!!");
            return;
        }
        head = head.next;
    }

    void removeLast() {
        // case1 List Empty
        if (isEmpty()) {
            System.out.println("the list is empty");
            return;
        }
        // case2 if there is only one node in the list
        if (head.next == null) {
            head = null;
        } else {
            // case3 the list has multi nodes
            Node ptr = head;

            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
        }
    }

    void addAtPos(int pos, int v) {
        // Add at first
        if (pos == 0) {
            insertNodeFirst(v);
        } else {
            Node newVal = new Node(v);
            Node ptr = head;

            for (int i = 0; i < pos - 1; i++) {
                if (ptr != null) {
                    ptr = ptr.next;
                }
            }
            // The postion invalid
            if (ptr == null) {
                System.out.println("invalid pos");
                return;
            }
            newVal.next = ptr.next;
            ptr.next = newVal;
        }
    }

    void removeAtPos(int pos) {
        // the list is empty
        if (isEmpty()) {
            System.out.println("The list ie empty");
            return;
        }
        // remove first node
        if (pos == 0) {
            removeFirstNode();
            return;
        }

        Node ptr = head;
        for (int i = 0; i < pos - 1; i++) {
            if (ptr.next != null) {
                ptr = ptr.next;
            }
        }
        // the postion invalid
        if (ptr.next == null) {
            System.out.println("Invalid postion");
            return;
        }
        ptr.next = ptr.next.next;
    }
}