public class AbsuluteValueQ20{
	public static void main(String args[]){
		check(30);
		check(-140);
	}
	
	public static void check(int A){
		int result = (A>0)? A : -A;
		System.out.println("absolute value: " + result);
	}
}