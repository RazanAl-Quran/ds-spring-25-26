public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LL l1 = new LL();

        l1.insertNodeLast(5);
        l1.insertNodeLast(9);
        l1.insertNodeLast(2);
        l1.insertNodeLast(27);

        l1.printLL();

        // l1.removeLast();
        // l1.printLL();

        // l1.removeAtPos(2);
        // l1.printLL();

        l1.addAtPos(3, 60);
        l1.printLL();

    }
}