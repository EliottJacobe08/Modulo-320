public class Factorial {
  public static void main(String[] args) {
	  int factorialNumber = Integer.parseInt(args[0]);
	  int fact = 1;
	  for(int i=1;i<=factorialNumber;i++){
      fact=fact*i;
      }
	  System.out.println("Factorial of "+factorialNumber+" is: "+fact);
  }
}