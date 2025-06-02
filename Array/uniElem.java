import java.util.HashSet;

public class uniElem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};

        uniqueElem(arr);
    }

    public static void uniqueElem(int arr[]) {
        HashSet<Integer> uniEle = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            if (!uniEle.contains(arr[i])) {
                uniEle.add(arr[i]);
            }else{
                uniEle.remove(arr[i]);
            }
        }

        System.out.print("Unique Elements: ");
        for (int i : uniEle) {
            System.out.print(i+" ");
        }
    }

    //Note: Time Complexity = O(n)
    // Space Complexity = O(n) (for the HashSet)
}
