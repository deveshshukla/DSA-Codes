import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int t = sc.nextInt(); // number of test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // number of toys
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            problem(arr, n);
        }
        sc.close();
        
    }

    public static void problem(int[] arr, int n) {
        // Logic
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i]%2 == 0 && arr[j]%2 != 0 && arr[i]>arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (arr[i]%2 != 0 && arr[j]%2 == 0 && arr[i]>arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print output cleanly
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < n; k++) {
            sb.append(arr[k]);
            if (k < n - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
