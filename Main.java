import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int g = sc.nextInt();
        int c = sc.nextInt();
        int l = sc.nextInt();

        // Logic
        int arr[] = {g,c,l};
        Arrays.sort(arr);

        if (arr[2] - arr[0] >= 10) {
            System.out.println("check again");
        }else
            System.out.println("final "+arr[1]);
    }
}
