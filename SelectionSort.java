package Sort;

public class SelectionSort {
    public static void selectionSortDescending(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {120, 60, 20, 80, 79, 30, 45};
        System.out.println("Unsorted Array: " + java.util.Arrays.toString(data));
        selectionSortDescending(data);
        System.out.println("Sorted Array in Descending Order: " + java.util.Arrays.toString(data));
    }
}
