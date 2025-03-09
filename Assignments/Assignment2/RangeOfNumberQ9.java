public class RangeOfNumberQ9{
	public static void main(String[] args){
		int a = 30, b = 65;
		check(a);
		check(b);
	}
	
	public static void check(int p){
		System.out.println((p>=20 && p<=50)? p + " lies in the range." : p + " doesn't lie within the range");
	} 
}	