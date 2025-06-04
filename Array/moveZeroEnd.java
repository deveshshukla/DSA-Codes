public class moveZeroEnd {
    public static void main(String[] args) {
        int arr[] = {4, 0, 2, 0, 7, 1, 0};

        //Task: Move zeros at the end of the arr, maintening arr structure.

        for (int i : movZero(arr)) {
            System.out.print(i+" ");
        }
    }

    public static int[] movZero(int[] arr) {
        int j=0;
        for(int i=0; i<arr.length; i++) {
            //Swaping
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) j++;
        }

        return arr;
    }
}
