package priorityqueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class PriorityQueue<T> {
	private ArrayList<T> queue;
    private Comparator<? super T> comparator;

    public PriorityQueue(Comparator<? super T> comparator) {
        this.queue = new ArrayList<>();
        this.comparator = comparator;
    }

    public void enqueue(T element) {
        queue.add(element);
        Collections.sort(queue, comparator);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return queue.remove(0);  // Remove the element with the highest priority
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return queue.get(0);  // Peek at the element with the highest priority
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
