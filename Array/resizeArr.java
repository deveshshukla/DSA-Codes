public class resizeArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        resArr(arr);

        //Task: Resize the original array.
    }

    public static void resArr(int[] arr) {
        System.out.println("Current Arr length: " + arr.length);

        int temp[] = new int[10];

        for(int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;

        System.out.println("Modified Arr length: " + arr.length);

        //print arr
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
