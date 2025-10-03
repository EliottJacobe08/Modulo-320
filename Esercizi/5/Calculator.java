public class Calculator {
  public static void main(String[] args) {
	  float number1 = Float.parseFloat(args[0]);
	  float number2 = Float.parseFloat(args[1]);
	  String operator = args[2];
	  float result = 0;
	  switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Errore: divisione per zero non permessa");
                    return;
                }
                result = number1 / number2;
                break;
		    default:
				return "operator non preso in conto"
	  } 
	 System.out.printf("%.2f %s %.2f = %.2f%n", number1, operator, number2, result);
  }
}