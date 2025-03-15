class SecondLargestNumberQ3{
public static void main(String[] args){
      int temp, size;
      int arr[] = {10, 20, 30, 63,95, 57};
	   size = arr.length;
	   
	   for(int i = 0; i<size; i++){
		  for(int j = i+1; j<size; j++){
			   
			 if(arr[i]>arr[j])
			 {
				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			 }
		  }
	   }  
	     System.out.println("Second Largest element is "+arr[size-2]);
    }
}
				 

