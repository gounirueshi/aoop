package SortStrategy;

public class SortingContext {
	 private SortStrategy strategy;

	    public void setSortStrategy(SortStrategy strategy) {
	        this.strategy = strategy;
	    }

	    public void sortArray(int[] array) {
	        if (strategy != null) {
	            strategy.sort(array);
	        } else {
	            System.out.println("No sorting strategy set.");
	        }
	    }
}
