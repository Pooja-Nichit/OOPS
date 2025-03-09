public class ReverseNumberQ25{
	static public void main(String me[]){
		int x = 1534, rev = 0;
		int temp = x;
		while(x!=0){
			rev = rev * 10 + x % 10;  //        4 3 5 1
			x = x/10;         //153     
		}
		System.out.println("Reverse of " + temp + " is " + rev);
	}
}