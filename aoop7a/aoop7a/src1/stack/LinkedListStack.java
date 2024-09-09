package stack;
import java.util.LinkedList;
public class LinkedListStack<T> implements Stack<T>{
private LinkedList<T> list = new LinkedList<>();
    
    @Override
    public void push(T element) {
        list.addFirst(element);
    }
    
    @Override
    public T pop() {
        return list.removeFirst();
    }
    
    @Override
    public T peek() {
        return list.getFirst();
    }
    
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
