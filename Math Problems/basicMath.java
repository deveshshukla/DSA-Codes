import java.util.*;

public class basicMath {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            // Test class obj
            basicMath obj = new basicMath();

            System.out.print("Enter number: ");
            String strNum = sc.nextLine();

            System.out.println("Total digits in given num: "+obj.numDigits(strNum));
            System.out.println("Reverse num: "+obj.revNum(strNum));
        }
    }

    //Return number of digits in a given number
    int numDigits(String strNum) {
        return strNum.length();
    }

    //Reverse the given number
    int revNum(String strNum) {
        String revStr = "";

        for(int i=strNum.length()-1; i>=0; i--) {
            revStr += strNum.charAt(i);
        }

        int revNumber = Integer.parseInt(revStr);

        return revNumber;
    }
}
