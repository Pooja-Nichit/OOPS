import java.util.Scanner;
class Q6{
public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
             System.out.println("Enter all three numbers:");
               int a,b,c,d;
                a = sc.nextInt();
                 b = sc.nextInt();
                c = sc.nextInt(); 
                  d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
                 System.out.println("Largest Number: " +d);
}
}
