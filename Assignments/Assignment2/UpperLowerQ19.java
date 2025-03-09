public class UpperLowerQ19{
	public static void main(String args[]){
		check('b');
		check('C');
		check('5');
	}
	
	public static void check(char A){
		int a = (int) A;         //typecasting 
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}