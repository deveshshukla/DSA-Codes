import java.util.*;

public class basicMath {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            // current class obj
            basicMath obj = new basicMath();

            System.out.print("Enter number: ");
            // String strNum = sc.nextLine();
            int n = sc.nextInt();
            // int n1 = sc.nextInt();
            // int n2 = sc.nextInt(); 

            // System.out.println("Total digits in given num: "+obj.numDigits(strNum));

            // System.out.println("Reverse num: "+obj.revNum(strNum));

            // System.out.println("isPalindrome: "+obj.isPalindrome(n));

            // System.out.println("GCD: "+obj.GCD(n1, n2));

            // System.out.println("isArmstrong: "+obj.isArmstrong(n));

            // System.out.print("Divisors of "+n+" :");
            // for (int i : obj.divisors(n)) {
            //     System.out.print(i +" ");
            // }

            System.out.println("isPrime: "+obj.isPrime(n));
        }
    }

    // Return number of digits in a number
    int numDigits(String strNum) {
        return strNum.length();
    }

    // Reverse the given number
    int revNum(String strNum) {
        String revStr = "";

        for(int i=strNum.length()-1; i>=0; i--) {
            revStr += strNum.charAt(i);
        }

        int revNumber = Integer.parseInt(revStr);

        return revNumber;
    }

    // Palindrome Number
    boolean isPalindrome(int n) {
        String strNum = Integer.toString(n);

        //2-pointers
        int a = 0, b = strNum.length()-1;

        while (a<b) {
            if (strNum.charAt(a) != strNum.charAt(b)) {
                return false;
            } else {
                a++;
                b--;
            }
        }

        return true;
    }

    // GCD of Two Numbers
    int GCD(int n1, int n2) {
        //Note: (GCD) - largest positive integer that divides both of the integer.
        /*
         * let's -> a=4 & b=6
         * while(b != 0)
         *    1: b = a%b = 4%6 => 4; a=6, b=4
         *    2: b = a%b = 6%4 => 2; a=4, b=2
         *    3: b = a%b = 4%2 => 0; a=2, b=0
         * return a=2
         */

        while (n2 != 0) {
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }

        return n1;
    }

    // Armstrong Number
    boolean isArmstrong(int n) {
        /*
         * Note: An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
         * 
         * n = 153 --> digits : 3
         * (1 ^ 3) + (5 ^ 3) + (3 ^ 3) = 1 + 125 + 27 = 153.
         */

        int og = n;
        int digits = (int) Math.log10(n) + 1;  // faster than converting to string
        int sum = 0;

        while (n > 0) {
            sum += Math.pow((n%10), digits);
            n /= 10;
        }

        return sum == og;
    }

    // Return all the divisors of n as an array in a sorted order
    int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for(int i=2; i<=n/2; i++) {
            if (n%i == 0) list.add(i);
        }

        list.add(n);

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // Check number is prime or not
    boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        /*
         * Reduces loop iterations by ~66%.
         * Only checks numbers of the form 6𝑘−1 and 6k+1, which are possible primes.
         * Much faster for large values of 𝑛
         */
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
}
