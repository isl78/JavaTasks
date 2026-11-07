package assignment_05;

import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int destroyed = 0;
        int size = n;

        while (true) {
            boolean found = false;

            for (int i = 0; i < size; i++) {
                int count = 1;

                while (i + count < size && arr[i] == arr[i + count]) {
                    count++;
                }

                if (count >= 3) {
                    destroyed += count;

                    for (int j = i; j + count < size; j++) {
                        arr[j] = arr[j + count];
                    }

                    size -= count;
                    found = true;
                    break;
                }

                i += count - 1;
            }

            if (!found) {
                break;
            }
        }

        System.out.println(destroyed);
    }
}
