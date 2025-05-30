public class secMaxValue {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 2, 3, 10, 1, 18};
        System.out.println(secMax(arr));
    }

    public static int secMax(int[] arr) {
        int sMax = Integer.MIN_VALUE;
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }else if (arr[i] < max && arr[i] > sMax) {
                sMax = arr[i];
            }
        }

        //If sec-max value is not changed
        if (sMax == Integer.MIN_VALUE) return -1;

        return sMax;
    }
}
