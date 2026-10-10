package firstAssignment;

import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();

        int firstPart = first / second;
        int secondPart = second / first;

        int result = (first * firstPart + second * secondPart) / (firstPart + secondPart);

        System.out.println(result);
    }
}