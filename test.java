public class test {
    public static void main(String[] args) {
		// write your code here
		int arr[] = {7, 2, 3, 8, 6, 6, 75, 38, 3, 2};

		System.out.print(secLargest(arr));
	}

	public static int secLargest(int[] arr) {
		int secLar = 0;
		int lar = arr[0];

		for(int i=1; i<arr.length; i++) {
			if(arr[i] > lar) {
				secLar = lar;
                lar = arr[i];
			}else if(arr[i] < lar && arr[i] > secLar) {
				secLar = arr[i];
			}
		}
		
		if(secLar == 0) return -1;

		return secLar;
	}
}