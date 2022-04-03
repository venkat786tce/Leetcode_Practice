

public class Search2DMatrix {

	  public boolean searchMatrix(int[][] matrix, int target) {
		  int n=matrix.length;
	      
	        int row=0;
	        int col=matrix[0].length-1;
	        while(row<=n-1&&col>=0){
	            if(matrix[row][col]<target){
	                row++;
	            }
	            else if(matrix[row][col]>target){
	                col--;
	            }
	            else{
	                return true;
	            }
	        }
	        return false;
	    }
	  
	public static void main(String[] args) {
		
		int[][] arr= {{1,3}};
		Search2DMatrix obj=new Search2DMatrix();
		System.out.println(obj.searchMatrix(arr, 3));
		
	}

}
