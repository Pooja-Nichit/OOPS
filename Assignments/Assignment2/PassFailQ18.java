public class PassFailQ18{
	public static void main(String args[]){
		check(50);
		check(40);
		check(35);
	}
	
	public static void check(int a){
		String result = (a>=40)? "Pass" : "Fail";
		System.out.println(result);
	}
}