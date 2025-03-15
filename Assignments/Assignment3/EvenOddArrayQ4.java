class EvenOddArrayQ4{
public static void main(String[] args){
     int arr[] = {1,30,45,60,67,21,20, 40};
	 int n = arr.length;
	 int countEven = 0, countOdd = 0;
	 
	 for(int i = 0; i<n; i++){
		 if((arr[i] % 2 )== 0)
			 countEven +=  1;
		 else
		 countOdd +=  1;
	   
	    }
		System.out.println("Even Number count :"+countEven);
		System.out.println("Odd Number count :"+countOdd);
     }
} 
		