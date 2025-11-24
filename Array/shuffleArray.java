public class shuffleArray {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,4,3,2,1}; //[1,4,2,3,3,2,4,1]
        int n = 4;

        for(int i=0; i<nums.length; i++) {
            System.out.print(shuffle(nums, n)[i]+" ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];

        int arrowOne = 0;
        int arrowTwo = n;

        for(int i=0; i<nums.length; i+=2) {
            arr[i] = nums[arrowOne];
            arrowOne++;

            for(int j=i+1; j<i+2; j++) {
                arr[j] = nums[arrowTwo];
            }
            arrowTwo++;
        }

        return arr;
    }
}