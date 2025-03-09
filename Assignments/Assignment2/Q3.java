import java.util.Scanner;
class Q3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.println("Input an integer");
			int n = input.nextInt();
                int sum=0;
	while (n != 0) {
         int rem = n % 10;  //65%10 = 5
         sum = sum + rem;   //6+5=11
            n =n / 10;   //  6
        }
       // return sum;

System.out.println("sum of the digits is: " +sum);

	}
}