package stack;

public class StackTest {
	public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedListStack Peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack Pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack isEmpty: " + linkedListStack.isEmpty());
        
        // Test ArrayStack with String
        Stack<String> arrayStack = new ArrayStack<>();
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");
        System.out.println("ArrayStack Peek: " + arrayStack.peek());
        System.out.println("ArrayStack Pop: " + arrayStack.pop());
        System.out.println("ArrayStack isEmpty: " + arrayStack.isEmpty());
    }
}
