import java.util.Scanner;

public class rotateArr {
    public static void main(String[] args) {
        // left rotate an array by k position

        try (Scanner sc = new Scanner(System.in)) {

            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int k = sc.nextInt();

            rotateArrByK(arr, k);
        }
    }

    public static void rotateArrByK(int arr[], int k) {
        
    }
}
