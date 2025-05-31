import java.util.HashSet;

public class arrDuplicate {
    public static void main(String[] args) {
        int arr[] = {7, 2, 3, 4, 2, 7, 8, 8, 3, 5};

        System.out.println("Count of duplicates - "+duplicateArr(arr));

        System.out.println("Count of duplicates = "+duplicateArrHashSet(arr));
    }

    //Brute force approach using Nested-Loop (TC): O(n^2)
    public static int duplicateArr(int arr[]) {

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

    //Optimal approach using HashSet --> (TC): O(n)
    public static int duplicateArrHashSet(int arr[]) {

        HashSet<Integer> duplicateElement = new HashSet<>();

        int duplicateCount = 0;

        for(int i=0; i<arr.length; i++) {
            if (!duplicateElement.contains(arr[i])) {
                duplicateElement.add(arr[i]);
            }else if (duplicateElement.contains(arr[i])) {
                System.out.println(arr[i]);
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
