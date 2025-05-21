import java.util.*;

/**
 * SieveOfEratosthenes
 */
public class PrimeNumRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            System.out.print(num + " have " + Eratosthenes(num) + " Prime nums.");
        }
    }

    public static int Eratosthenes(int range) {
        boolean primeArr[] = new boolean[range];
        Arrays.fill(primeArr, true);
        primeArr[0] = false;
        primeArr[1] = false;

        int primeNum = 0;

        for (int i = 2; i < primeArr.length; i++) {
            if (primeArr[i]) { // True
                primeNum++;
                int mul = 2;
                while ((i * mul) < primeArr.length) {
                    primeArr[i * mul] = false;
                    mul++;
                }
            }
        }

        return primeNum;
    }
}