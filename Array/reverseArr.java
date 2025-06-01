public class reverseArr {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 4, 10, 1, 18};
        
        for (int i : revArr(arr)) {
            System.out.print(i+" ");
        }
    }

    public static int[] revArr(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
