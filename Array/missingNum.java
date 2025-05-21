public class missingNum {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 1, 7, 3};
        System.out.println(findNum(arr));

        //Task: Find missing number from a given continues arr (non-sorted).
    }

    public static int findNum(int[] arr) {
        //Note: Formula --> n(n+1)/2, find n natural num.

        int n = (arr.length+1); // <--Imp: remember this.
        int sum = n*(n+1)/2;

        for(int i=0; i<arr.length; i++) {
            sum -= arr[i];
        }

        return sum;
    }
}
