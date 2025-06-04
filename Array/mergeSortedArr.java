public class mergeSortedArr {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 6, 9, 15};
        int arr2[] = {2, 5, 8, 10};

        for (int i : mergeArr(arr1, arr2)) {
            System.out.print(i+" ");
        }
    }

    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int pointer1 = 0;
        int pointer2 = 0;

        int arr3[] = new int[arr1.length+arr2.length];

        try {
            for(int i=0; i<arr3.length; i++) {
                if (arr1[pointer1] < arr2[pointer2]) {
                    arr3[i] = arr1[pointer1];
                    pointer1++;
                }else {
                    arr3[i] = arr2[pointer2];
                    pointer2++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception: "+e);
        }

        return arr3;
    }
}

/*
    * Note: Merge two sorted array to third array in a sequence.
    * 
    *  Initialize two pointers. One points to the beginning of array 1, while the other points to the beginning of array 2.
    * 
    * Now we'll compare the values of the elements to which the pointers point.
    * 
    * If the element of array1 is smaller than the element of array2, we will add it to the final merged array and move pointer1 up one position.
    * 
    * Otherwise, we will add the element from array2 to the final merged array and increment the position of pointer2 by one.
    * 
    * And so on, we will compare value of pointer1 and pointer2 until we reach the end of atleast one array.
*/
