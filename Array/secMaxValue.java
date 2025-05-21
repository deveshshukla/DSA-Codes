public class secMaxValue {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 2, 3, 10, 1, 18};
        secMax(arr);
    }

    public static void secMax(int[] arr) {
        int sMax = 0;
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }else if (arr[i] < max && arr[i] > sMax) {
                sMax = arr[i];
            }
        }

        System.err.print("Max: "+max+" | "+"Sec-Max: "+sMax);
    }
}
