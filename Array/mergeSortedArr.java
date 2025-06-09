public class mergeSortedArr {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 6, 9, 15};
        int arr2[] = {2, 5, 8, 10};

        for (int i : mergeArr(arr1, arr2)) {
            System.out.print(i+" ");
        }
    }

    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;

        int arr3[] = new int[arr1.length+arr2.length];

        int idx=0;

        if (arr1.length < arr2.length) {
            while (p1 < arr1.length) {
                if (arr1[p1] < arr2[p2]) {
                    arr3[idx] = arr1[p1];
                    p1++;
                }else {
                    arr3[idx] = arr2[p2];
                    p2++;
                }

                idx++;
            }
        } else {
            while (p2 < arr2.length) {
                if (arr1[p1] < arr2[p2]) {
                    arr3[idx] = arr1[p1];
                    p1++;
                }else {
                    arr3[idx] = arr2[p2];
                    p2++;
                }

                idx++;
            }
        }
        

        //Copy remaining elements into arr3
        if (arr1.length > arr2.length) {
            while (p1 < arr1.length) {
                arr3[idx] = arr1[p1];
                p1++;
                idx++;
            }
        }else {
           while (p2 < arr2.length) {
                arr3[idx] = arr2[p2];
                p2++;
                idx++;
            } 
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
