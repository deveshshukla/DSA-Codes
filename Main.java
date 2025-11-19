import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int arr[] = {2,3,1,4};

        // logic
        boolean needLoop = true;

        while (needLoop) {
            for(int i=0; i<arr.length; i++) {
                if (arr[i]%2 == 0) {
                    if (arr[i+1]%2 != 0) {
                        if (arr[i]>arr[i+1]) {
                            //perform swap
                            
                        }
                    }
                }
            }
        }
    }
}
