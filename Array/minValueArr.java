public class minValueArr {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 4, 10, 1, 18};
        minValue(arr);
    }

    public static void minValue(int arr[]) {
        int minVal = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (arr[i] < minVal) minVal = arr[i];
        }

        System.out.println(minVal);
    }
}
