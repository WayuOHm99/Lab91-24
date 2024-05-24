package Search;

import java.util.Scanner;

public class Sequentialsearch {
    public static void main(String[] args) {
        int[] A = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012, 66006};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input ID: ");
        int index = sequentialSearch(A, scanner.nextInt());
        System.out.println(index != -1 ? "Found at A[" + index + "]" : "Not Found!");
    }

    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }
}
