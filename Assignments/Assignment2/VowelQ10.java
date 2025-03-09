public class VowelQ10{
	public static void main(String[] args){
		char x = 'a';
		check(x);
		x = 'e';
		check(x);
		x = 'B';
		check(x);
		x = 'Q';
		check(x);
	}
	
	public static void check(char a){
		char ch = Character.toLowerCase(a);
		String str = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')? a + " is a vowel." : a + " is a consonant";  
		System.out.println(str);
	} 
}	