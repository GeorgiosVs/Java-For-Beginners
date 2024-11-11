import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner greatEye = new Scanner(System.in);

    System.out.print("Please choose an operator (+, -, *, /):");
    String operator = greatEye.nextLine();

    System.out.print("\nEnter your first number: ");
    double num1 = greatEye.nextDouble();

    System.out.print("\nEnter your second number: ");
    double num2 = greatEye.nextDouble();

    NewCalculator calc = new NewCalculator(num1, operator, num2);
    System.out.println("The result is: " + calc.calculate());
    }
}