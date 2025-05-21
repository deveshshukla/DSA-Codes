public class moveZeroEnd {
    public static void main(String[] args) {
        int arr[] = {4, 0, 2, 0, 7, 1, 0};
        movZero(arr);

        //Task: Move zeros at the end of the arr, maintening arr structure.
    }

    public static void movZero(int[] arr) {
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

        //print arr
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
