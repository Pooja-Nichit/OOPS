import java.util.Scanner;
public class Q4{

    public static boolean isDivisibleByThree(int num) {
       
        
      
          while (num >= 3) {   //27 >3
            num = num - 3;     //27-3=24 24-3=21 21-3=18 15,12,9,6,3 
        }

        
        return num ==0;
    }

    public static void main(String[] args) {
        //int number = 27; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		 int n = sc.nextInt();

        if (isDivisibleByThree(n)) {
            System.out.println(n + " is divisible by 3.");
        } else {
            System.out.println(n + " is not divisible by 3.");
        }
    }
}