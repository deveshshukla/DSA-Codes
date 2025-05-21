package Recursion;

import java.util.Scanner;

public class powerOfN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter X: ");
            int base = sc.nextInt();
            System.out.print("Enter n: ");
            int pow = sc.nextInt();

            System.out.println("Iterative: " + iterative(base, pow));
            System.out.println("Rescursive: " + recur(base, pow));
        }
    }

    private static int recur(int base, int pow) {
        if (pow == 0)
            return 1;
        if (pow == 1)
            return base;

        return base * recur(base, pow - 1);
    }

    private static int iterative(int base, int pow) {
        int result = base;

        for (int i = 1; i < pow; i++) {
            result *= base;
        }
        return result;
    }
}
