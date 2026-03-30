public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 

        LL l1 = new LL();

        l1.insertNodeFirst(5);
        l1.insertNodeFirst(9);
        l1.insertNodeFirst(2);

        l1.printLL();

    }
}
