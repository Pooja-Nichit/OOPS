public class MultiplyNumberQ12{
	public static void main(String[] args){
		check(7);
		check(20);
		check(-9);
	}
	
	public static void check(int a){
		//Use bitwise left shift (  <<  ) 
		int result = a << 3;           // 7<<3 =56 
		System.out.println(result);
	} 
}	