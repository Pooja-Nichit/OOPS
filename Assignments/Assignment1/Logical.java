class Logical{
public static void main(String[] args){
int a=10, b=5; 
boolean andResult = (a > 5) && (b < 10);
System.out.println("(10 > 5) && (5 < 10): " + andResult);
boolean orResult = (a > 5) || (b < 10);
System.out.println("(10 > 5) || (5 < 10): " + orResult);
boolean notResult = !(a > 5);
System.out.println("!(10 > 5): " + notResult);
}
}

