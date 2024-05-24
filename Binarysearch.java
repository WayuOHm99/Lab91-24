package Search;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] Number = {0, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search ID: ");
        int targetID = scanner.nextInt();
        int index = binarySearch(Number, targetID);
        System.out.println(index != -1 ? "Found at Number[" + index + "]: " + targetID : "Not Found!");
    }

    public static int binarySearch(int[] array, int target) {
        int first = 0, last = array.length - 1;
        while (first <= last) {
            System.out.println("first: " + first + " last: " + last);
            int mid = (first + last) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] < target) first = mid + 1;
            else last = mid - 1;
        }
        return -1;
    }
}
