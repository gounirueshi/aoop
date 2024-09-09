package priorityqueue;
import java.util.Comparator;
public class PriorityQueueTest {
	public static void main(String[] args) {
        // Test with Integers (min-priority queue)
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
        intQueue.enqueue(5);
        intQueue.enqueue(1);
        intQueue.enqueue(3);
        System.out.println("Integer Priority Queue Peek: " + intQueue.peek());
        System.out.println("Integer Priority Queue Dequeue: " + intQueue.dequeue());
        
        // Test with Doubles (max-priority queue)
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.reverseOrder());
        doubleQueue.enqueue(2.5);
        doubleQueue.enqueue(3.7);
        doubleQueue.enqueue(1.4);
        System.out.println("Double Priority Queue Peek: " + doubleQueue.peek());
        System.out.println("Double Priority Queue Dequeue: " + doubleQueue.dequeue());
        
        // Test with Strings (lexicographical order)
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        System.out.println("String Priority Queue Peek: " + stringQueue.peek());
        System.out.println("String Priority Queue Dequeue: " + stringQueue.dequeue());
    }
}
