package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int num = sc.nextInt();

            System.out.println(simple(num));
            System.out.println(recursive(num));
        }
    }

    private static int recursive(int num) {
        if (num <= 1)
            return 1;

        return num * recursive(num - 1);
    }

    private static int simple(int num) {
        for (int i = num - 1; i > 1; i--) {
            num *= i;
        }
        return num;
    }
}
