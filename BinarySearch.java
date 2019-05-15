public class BinarySearch{

	// iterative binary search implementation
	// if key in a, return index of key
	// otherwise, return -1 
	public static int binarySearch(int[] a, int key){

		int l = 0;
		int h = a.length - 1;

		while (l <= h){

			int m = l + (h - l) / 2;

			if (key == a[m]){
				return m;
			} else if (key < a[m]){
				h = m - 1;
			} else {
				l = m + 1;
			}
		}

		return -1;

	}

	// test code
	public static void main(String[] args){

		int[] arr = {1,3,7,10,15,19,20,22,24,25};

		int result = binarySearch(arr,10);
		if (result >= 0){
			System.out.println("Index of key = " + result);
		} else {
			System.out.println("Key not found");
		}
		// output: Index of key = 3

		result = binarySearch(arr,23);
		if (result >= 0){
			System.out.println("Index of key = " + result);
		} else {
			System.out.println("Key not found");
		}
		// output: Key not found

		result = binarySearch(arr,25);
		if (result >= 0){
			System.out.println("Index of key = " + result);
		} else {
			System.out.println("Key not found");
		}
		// output: Index = 9

	}

}