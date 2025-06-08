import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

            int target = sc.nextInt();

            for (int i : twoSumIdx(nums, target)) {
                System.out.print(i+" ");
            }
        }
    }

    public static int[] twoSumIdx(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
                int subtract = target - nums[i];

                if (map.containsKey(subtract)) {

                    //Note: map.get(subtract) gives -> subtract element index
                    return new int[] { map.get(subtract), i };
                }
            map.put(nums[i], i);
        }

        System.out.println("No pair exist for given number");

        //Return empty array, if no pair exist
        return new int[0];
    }
}
