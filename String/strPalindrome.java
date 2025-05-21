package String;
import java.util.Scanner;

public class strPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your String: ");
            String str = sc.nextLine();

            System.out.println(checkPalindrome(str));

            //Task: Check given string is palindrome or not. eg: madam <-> madam
        }
    }

    public static boolean checkPalindrome(String str) {
        // Note: We can use 2-pointer approach here, -> O(n).
        
        int i=0;
        int j=str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
