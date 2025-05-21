import java.util.*;

public class BiToDeci {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            String binNum = sc.nextLine();

            // 1-Way Inefficient method
            NaiveApproach(binNum);

            // 2-Way Efficient method
            BitWiseApproach(binNum);
        }
    }

    private static void BitWiseApproach(String binNum) {
        
    }

    private static void NaiveApproach(String binNum) {
        int n = 0;

        for (int i=binNum.length()-1, j=0; i>=0; i--, j++) {
            if (binNum.charAt(i) == '1') {
                n += Math.pow(2, j);
            }
        }
        System.out.print(n);
    }
}
