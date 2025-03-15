import java.util.Arrays;
public class MergeArrayQ16{
	public static void main(String[] args){
		int[] A = {1, 5, 6, 7, 8, 10}; 
		int[] B = { 2, 4, 9 };
		int[] res = new int[A.length];
		int i = 0, j = 0, count = 0; 
		while(count<res.length){
			if(A[i]<B[j]){
				res[count++] = A[i++];
			} else {
				res[count++] = B[j++];
			}
		}
		count = 0;
		while(j<B.length){
			B[count++] = B[j++];
		}
		while(i<A.length){
			B[count++] = A[i++];
		}
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(B));	
	}
}