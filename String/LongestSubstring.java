package String;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            // Test class obj
            LongestSubstring obj = new LongestSubstring();

            System.out.print("Enter a string: ");
            String s = sc.nextLine();

            System.out.println(obj.lengthOfLongestSubstring(s));
        }
    }
    
    // Quetion no: 3 Leetcode

    // Note: Brute-Force Approach O(n^2)
    // public int lengthOfLongestSubstring(String s) {
    //     int count = 0, prvCount= 0;

    //     HashSet<Character> set = new HashSet<>();
        
    //     for(int i=0; i<s.length(); i++) {
    //         for(int j=i; j<s.length(); j++) {
    //             if (!set.contains(s.charAt(j))) {
    //                 count++;
    //                 set.add(s.charAt(j));
    //             }else break;
    //         }

    //         if(count > prvCount) prvCount = count;
    //         count = 0;
    //         set.clear();
    //     }
        
    //     return prvCount;
    // }

    // Note: Sliding-Window Approach O(n)
    public int lengthOfLongestSubstring(String s) { //dvdf, abcabcbb, bbbbb
        HashSet<Character> set = new HashSet<>();
        
        int left=0, right=0, maxLen=0;

        while (right < s.length()) {
            
        }
        
        
        return maxLen;
    }
}

/*
 * Company tags: Amazon, Microsoft, Facebook, Bloomberg, Apple, Google, Spotify, Adobe, Uber, VMware, Yahoo, Goldman Sachs, Oracle, Walmart Global Tech, Salesforce, Paypal, Samsung, Intuit, Yandex, Zoho, JPMorgan.
 */
