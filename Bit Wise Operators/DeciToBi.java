import java.util.*;

public class DeciToBi {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter num: ");
            int deciNum = sc.nextInt();

            // 1-Way Inefficient method
            NaiveApproach(deciNum);

            // 2-Way Efficient method
            BitWiseApproach(deciNum);
        }
    }

    private static void BitWiseApproach(int n) {
        String strBinary1 = "";

        while (n != 0) {
            int lastBit = n & 1;
            strBinary1 = lastBit + strBinary1;
            n >>= 1; // Right shift to get next bit
        }

        System.out.print("BitWiseApproach: " + strBinary1);
    }

    private static void NaiveApproach(int n) {
        String strBinary2 = "";

        while (n > 0) {
            int rem = n % 2;
            strBinary2 = rem + strBinary2; // Preppend
            n /= 2;
        }

        System.out.println("NaiveApproach: " + strBinary2);
    }
}
