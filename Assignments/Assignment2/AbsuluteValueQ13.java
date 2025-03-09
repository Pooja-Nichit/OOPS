public class AbsuluteValueQ13{
	public static void main(String[] args){
		abs(5);
		abs(-10);
	}
	
	public static void abs(int num){ 
		int mask = num >> 31; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	} 
}	