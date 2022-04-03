
public class FindKthLargest {
	
	private static int partision(int[] arr,int start,int pivot) {
		int j=start-1;
		int i=start;
		for(;i<arr.length;i++) {
			if(arr[start]<=pivot) {
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return i;
	}
	
	
	
	public static int getKthMaxElement(int arr[], int start, int end, int k) {

		if (start < end) {
			int par = partision(arr, start, arr[end]);
			if (par == k) {
				return arr[k];
			}
			return getKthMaxElement(arr, par + 1, end, k);
		}
		return -1;
	}

}
