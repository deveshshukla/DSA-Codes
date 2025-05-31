public class arrMaxMin {
    public static void main(String[] args) {
        int arr[] = {10, 50, 1, 16, 2};

        maxMinValue(arr);
    }

    public static void maxMinValue(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: "+max);
        System.out.print("Minimum value: "+min);
    }
}
