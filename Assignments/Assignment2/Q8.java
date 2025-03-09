public class Q8{
	public static void main(String[] args){
		boolean a = true, b = false, c = true;
		check(a,b,c);
		a = true; b = false; c= true;
		check(a,b,c);
	}
	
	public static void check(boolean x, boolean y, boolean z){
		if((x && (y||z)) || (z && (x||y)) || (y && (x||z))){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	} 
}	