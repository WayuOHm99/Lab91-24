import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] Number = {00000, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};
        Scanner scanner = new Scanner(System.in);

        // เรียงลำดับข้อมูลด้วย Bubble Sort ก่อนทำ Binary Search
        bubbleSort(Number);

        System.out.print("Search ID: ");
        int targetID = scanner.nextInt();

        int index = binarySearch(Number, targetID);

        if (index != -1) {
            System.out.println("Found at Number[" + index + "]: " + targetID);
        } else {
            System.out.println("Not Found!");
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Binary Search
    public static int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            System.out.println("first: " + first + " last: " + last);

            int mid = first + (last - first) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}
