import java.util.Scanner;

public class rightRotateArr {
    public static void main(String[] args) {
        // right rotate array by n position

        try (Scanner sc = new Scanner(System.in)) {

            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.print("Number of times to rotate: ");
            int n = sc.nextInt();

            //Print new n rotated array
            for (int i : rotateArrByn(arr, n)) {
                System.out.print(i+" ");
            }
        }
    }

    public static int[] rotateArrByn(int arr[], int n) {
        //New arr
        int newArr[] = new int[arr.length];

        try {
            //First copy arr element from n right position
            for(int i=0, j=arr.length-n; i<n; i++, j++) {
                newArr[i] = arr[j];
            }

            //Then copy rest of the arr
            for(int i=n, j=0; i<arr.length; i++, j++) {
                newArr[i] = arr[j];
            }
        } catch (Exception e) {
            System.err.println("handle exception: out of bound exception");
        }

        return newArr;
    }
}
