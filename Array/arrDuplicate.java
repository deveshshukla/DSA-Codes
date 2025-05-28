public class arrDuplicate {
    public static void main(String[] args) {
        int arr[] = {7, 2, 3, 4, 2, 7, 8, 8, 3, 5};

        System.out.println("Count of duplicates - "+duplicateArr(arr));
    }

    public static int duplicateArr(int arr[]) {
        //Brute force approach: O(n^2)

        int reCount = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println(arr[i]);
                    reCount++;
                }
            }
        }

        return reCount;
    }

    // Imp: Yes, O(n) time complexity solution is possible using Hashing (specifically a HashMap or HashSet).

    // Use a HashMap or HashSet to keep track of elements you have already seen as you iterate through the array.

    // Note: Implement this again after learning HashMap & HashSet.
}
