package SortStrategy;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        SortingContext context = new SortingContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array (comma-separated):");
        String input = scanner.nextLine();
        int[] array = Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        System.out.println("Choose sorting strategy: 1. QuickSort 2. MergeSort 3. BubbleSort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setSortStrategy(new QuickSort());
                break;
            case 2:
                context.setSortStrategy(new MergeSort());
                break;
            case 3:
                context.setSortStrategy(new BubbleSort());
                break;
            default:
                System.out.println("Invalid choice. Using default QuickSort.");
                context.setSortStrategy(new QuickSort());
        }

        System.out.println("Array before sorting: " + Arrays.toString(array));
        context.sortArray(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
