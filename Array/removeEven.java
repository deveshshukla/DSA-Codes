public class removeEven {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 4, 10, 13, 18};
        rmvEvenNum(arr);
        rmvOddNum(arr);
    }

    public static void rmvEvenNum(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i]%2 != 0) System.out.print(arr[i]+" ");
        }

        System.out.println("");
    }

    public static void rmvOddNum(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i]%2 == 0) System.out.print(arr[i]+" ");
        }
    }
}