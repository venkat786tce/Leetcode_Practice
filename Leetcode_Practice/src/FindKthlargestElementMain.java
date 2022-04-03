
public class FindKthlargestElementMain {

	public static void main(String[] args) {
		int[] arr= {1,2,3,34,56,23,17,20};
		
		//1,2,3,17,20,
		
	 System.out.println(FindKthLargest.getKthMaxElement(arr, 0, arr.length-1, arr.length-3));

	}

}
