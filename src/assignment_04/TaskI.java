package assignment_04;

public class TaskI {

    public static boolean isArmstrong(int n) {
        int n1 = n / 100;
        int n2 = n / 10 % 10;
        int n3 = n % 10;

        return n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
