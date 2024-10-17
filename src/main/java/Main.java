import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calc=new Calculator();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a command: ");
    while (true) {
      String input=scanner.nextLine().toLowerCase().trim(); // Get input, convert to lowercase, and trim spaces

      // Split input into command and arguments
      String[] parts=input.split(" ");
      String command=parts[0];
      int a=Integer.parseInt(parts[1]);
      int b=0;
      if (parts.length > 2) {
        b=Integer.parseInt(parts[2]);
      }

      switch (command) {
        case "add":
          System.out.println(calc.add(a, b));
          break;

        case "subtract":
          System.out.println(calc.subtract(a, b));
          break;

        case "multiply":
          System.out.println(calc.multiply(a, b));
          break;

        case "divide":
          System.out.println(calc.divide(a, b));
          break;

        case "fibonacci":
          System.out.println(calc.fibonacciNumberFinder(a));
          break;

        case "binary":
          System.out.println(calc.intToBinaryNumber(a));
          break;

        default:
          System.out.println("Unknown command. Try add, subtract, multiply, divide, fibonacci, or binary.");
          break;
      }
    }
  }
}
