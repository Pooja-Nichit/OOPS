import java.util.Scanner;
class Q2{
public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
           int n = scanner.nextInt();
         if((n & 1) !=0){
           System.out.println("number is odd");
            }
  else{
     System.out.println("number is even");
    }
  }
}