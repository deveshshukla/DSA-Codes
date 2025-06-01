import java.util.Scanner;

public class delElement {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int arr[] = {10, 20, 30, 40, 50, 60};

            try {
                System.out.print("Position to delete: ");
                int delPos = sc.nextInt();

                for (int i : delNum(arr, delPos)) {
                System.out.print(i+" ");
            }
            } catch (Exception e) {
                System.out.print("Entered wrong number (1 to 6) only");
            }
        }
    }

    public static int[] delNum(int arr[], int delPos) {
        int newArr[] = new int[arr.length-1];

        int i=0, j=0;

        while (j<arr.length) {
            if (j == delPos-1) {
                //skip user given position

                j++; //Increment only j-index
            } else {
                //just copy rest elements
                newArr[i] = arr[j];

                //Increment both
                i++; 
                j++;
            }
        }

        return newArr;
    }
}
