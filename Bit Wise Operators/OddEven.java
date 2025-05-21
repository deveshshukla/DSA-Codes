import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a num: ");
            long num = sc.nextLong();

            oddEven(num);
        }
    }

    private static void oddEven(long num) {
        // num & 1: always give 1 for odd & 0 for even
        if ((num & 1) == 0) {
            System.out.println(num + " is Even Number");
        } else
            System.out.println(num + " is Odd Number");
    }
}
