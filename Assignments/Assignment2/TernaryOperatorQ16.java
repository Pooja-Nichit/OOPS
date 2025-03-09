class TernaryOperatorQ16{
         
	public static void main(String[] args){
		xyz(15);
		xyz(-9);
		xyz(0);
	}
	public static void xyz(int x){
		String res = (x==0)? "zero" : (x>0)? "positive" : "negative";
		System.out.println(res);
	}
}	