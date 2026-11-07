package assignment_05;
import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        int cc = input.nextInt();
        cc = cc % num;
        if (cc < 0) {
            cc += num;
        }


        for (int i = 0; i < num / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[num - 1 - i];
            arr[num - 1 - i] = tmp;
        }


        for (int i = 0; i < cc / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[cc - 1 - i];
            arr[cc - 1 - i] = tmp;
        }


        for (int i = 0; i < (num - cc) / 2; i++) {
            int tmp = arr[cc + i];
            arr[cc + i] = arr[num - 1 - i];
            arr[num - 1 - i] = tmp;
        }

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}