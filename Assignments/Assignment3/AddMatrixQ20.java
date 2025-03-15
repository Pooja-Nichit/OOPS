class AddMatrixQ20{
	
    public static void main(String[] args){
	//int []arr = new int[5];  //allocate dyanamic memory
	int a[][] = {{1,2}, {3,4}};           //
	int b[][] = {{1,2}, {1,3}};
	int rows = a.length;
	int cols = a[0].length;
	int sum[][] = new int[rows][cols];
	for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
			sum[i][j] = a[i][j] + b[i][j];
			}
             }	
              System.out.println("resultant Matrix:");
			  for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
			  System.out.println(sum[i][j] + " ");
			  }
			  System.out.println();
             }

				 
   }
 }