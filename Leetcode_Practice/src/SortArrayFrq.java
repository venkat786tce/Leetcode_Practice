
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortArrayFrq {

	public static void sort(Integer[] arr){
		
		HashMap<Integer,Integer> frq=new HashMap<>();
		HashMap<Integer,Integer> index=new HashMap<>();
		
		ArrayList<Integer> result=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			frq.put(arr[i], frq.getOrDefault(arr[i], 0)+1);
			index.put(arr[i], i);
			result.add(arr[i]);
		}
		
		Collections.sort(result,new Comparator<Integer>() {
			public int compare(Integer a,Integer b) {
				int frq1=frq.get(a);
				int frq2=frq.get(b);
				if(frq1!=frq2) {
					return frq2-frq1;
				}
				else {
					return index.get(a)-index.get(b);
				}
			}
		});
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Integer[] arr = { 2, 5, 2, 8, 5, 6, 8, 8 };
	 SortArrayFrq.sort(arr);
	}

}
