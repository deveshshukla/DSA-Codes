import java.util.Scanner;

public class insertElement {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int arr[] = {10, 30, 40, 50, 60};

            System.out.print("Number: ");
            int num = sc.nextInt();

            System.out.print("Position: ");
            int pos = sc.nextInt();

            for (int i : enterNum(arr, num, pos)) {
                System.out.print(i+" ");
            }
        }
    }

    public static int[] enterNum(int arr[], int num, int pos) {
        int newArr[] = new int[arr.length+1];

        int i=0, j=0;

        while (i<newArr.length) {
            if (i == pos-1) {
                //insert user given element
                newArr[i] = num;
                i++; //Increment only i-index
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
