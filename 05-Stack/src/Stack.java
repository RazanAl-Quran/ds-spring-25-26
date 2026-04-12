public class Stack {
    private LL x1;
    Node top;

    Stack(){
        x1 = new LL();
        top = null;
    }

    boolean isEmptyStack() {
        return x1.isEmpty();
    }

    void printStack(){
        x1.printLL();
    }

    void push(int num) {
        x1.insertFirst(num);
        top = x1.getHead();
        // top = x1.head;
    }

    void pop() {
        x1.removeFirst();
        top = x1.getHead();
    }

    // get the value of the top
    int getTop() {
        if(isEmptyStack()){
            return -1;
        }
        return top.value;
    }

    
}
