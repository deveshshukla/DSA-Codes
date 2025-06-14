import java.util.Scanner;

public class rotateArr {
    public static void main(String[] args) {
        // left rotate an array by k position

        try (Scanner sc = new Scanner(System.in)) {

            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int k = sc.nextInt();

            //Print new k rotated array
            for (int i : rotateArrByK(arr, k)) {
                System.out.print(i+" ");
            }
        }
    }

    public static int[] rotateArrByK(int arr[], int k) {
        //New arr
        int newArr[] = new int[arr.length];

        try {
            for(int i=k, j=0; i<arr.length; i++,j++) {
                // Copy k-index array element to new arr
                newArr[j] = arr[i];
            }

            for(int j=arr.length-k, i=0; j<arr.length; j++, i++) {
                // Copy remaining elements
                newArr[j] = arr[i];
            }
        } catch (Exception e) {
            System.err.println("handle exception: out of bound exception");
        }

        return newArr;
    }
}
