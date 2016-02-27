
public class CTCI1_6 {
public void rotate(int a[][]){
	int row_length = a.length;
	int column_length =a[0].length;
	boolean[] row = new boolean[row_length];
	boolean[] column = new boolean[column_length];
	for (int i = 0; i < row_length; i++) {
		 for (int j = 0; j < column_length; j++) {
			 System.out.println(a[i][j]);
		 }
		 System.out.println("");
	
		 }
	
	 // Store the row and column index with value 0
	 for (int i = 0; i < row_length; i++) {
	 for (int j = 0; j < column_length;j++) {
	 if (a[i][j] == 0) {
	 row[i] = true;
	 column[j] = true;
	 }
	 }
	 }
	
	 // Set arr[i][j] to 0 if either row i or column j has a 0
	 for (int i = 0; i < row_length; i++) {
	 for (int j = 0; j < column_length; j++) {
	 if (row[i] || column[j]) {
	 a[i][j] = 0;
	 }
	 }
	 }
	 
			
}
public static void main(String args[])
{
	
	int[][] b = {{1,0,4},{5,8,9},{0,0,4}};
	CTCI1_6 c = new CTCI1_6();
	c.rotate(b);
}
}

