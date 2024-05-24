package Sort;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSortDescending(int[] data) {
        for (int i = 0, n = data.length; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of integers to sort: ");
        int[] data = new int[scanner.nextInt()];

        System.out.println("Enter " + data.length + " integers:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        bubbleSortDescending(data);

        System.out.println("Sorted list of numbers:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data " + (i + 1) + ": " + data[i]);
        }
    }
}
